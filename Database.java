package com.database.sportsutilityshop;

import com.model.sportsutilityshop.*;
import java.io.*;
import java.sql.*;
import java.util.*;


public class Database {
    
        Customer customer;
        ShopKeeper shopkeeper;
        Rent rent;
        Purchase purchase;
        SportsShop sportsshop;
        Item item;
	Statement myStmt = null;
        ArrayList<Item> itemList = new ArrayList<Item>();
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        
    public void skAddItem(String itemName, String itemDescription, String itemBrand, String itemColour, int itemStock, int sportsShopId, int purchasePrice, int rentPrice) throws SQLException
    {
        myStmt = null;
        String sql = null;
        
        try 
        {   
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
            
            sql ="insert into Item (itemName, itemDescription, itemBrand, itemColour, itemStock, sportsShopId, itemPurchasePrice, itemRentalPrice) values(\""+itemName+"\",\""+itemDescription+"\",\""+itemBrand+"\",\""+itemColour+"\", \""+itemStock+"\",\""+sportsShopId+"\",\""+purchasePrice+"\",\""+rentPrice+"\")";
                
            myStmt.executeUpdate(sql);
            
        } 
        catch (SQLException ex) 
        {
             System.out.println(ex);
        }  
            
    } 
    
    public void skUpdateItem(int itemId, String itemName, String itemDescription, String itemBrand, String itemColour, int itemStock, int sportsShopId, int purchasePrice, int rentPrice) throws SQLException
    {
        myStmt = null;
        String sql = null;
        
        try 
        {   
            
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
            
            sql ="update Item set itemName = \""+itemName+"\", itemDescription = \""+itemDescription+"\", itemBrand = \""+itemBrand+"\", itemColour = \""+itemColour+"\", itemStock = \""+itemStock+"\", sportsShopId = \""+sportsShopId+"\", itemPurchasePrice = \""+purchasePrice+"\", itemRentalPrice = \""+rentPrice+"\" where itemId = \""+itemId+"\"";
                
            myStmt.executeUpdate(sql);
           
        } 
        catch (SQLException ex) 
        {
            System.out.println(ex);
        }  
            
    } 
    
    public void skDeleteItem(int itemId) throws SQLException
    {
        myStmt = null;
        String sql = null;
        
        try 
        {   
            
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
            
            sql ="delete from Item where itemId = \""+itemId+"\"";
                
            myStmt.executeUpdate(sql);
           
        } 
        catch (SQLException ex) 
        {
        
        }  
            
    } 
    
    public void skAddCustomer(String customerName, String customerContact, String customerAddress, String customerUsername, String customerPassword) throws SQLException
    {
        myStmt = null;
        String sql = null;
        
        try 
        {   
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
            
            sql ="insert into Customer (customerName, customerContact, customerAddress, customerUsername, customerPassword) values(\""+customerName+"\",\""+customerContact+"\",\""+customerAddress+"\",\""+customerUsername+"\", \""+customerPassword+"\")";
                
            myStmt.executeUpdate(sql);
            
        } 
        catch (SQLException ex) 
        {
             System.out.println(ex);
        }  
            
    } 
    
    public void skUpdateCustomer(int customerId, String customerName, String customerContact, String customerAddress, String customerUsername) throws SQLException
    {
        myStmt = null;
        String sql = null;
        
        try 
        {   
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
            
            sql ="update Customer set customerName = \""+customerName+"\", customerContact = \""+customerContact+"\", customerAddress = \""+customerAddress+"\", customerUsername = \""+customerUsername+"\" where customerId = \""+customerId+"\"";
                
            myStmt.executeUpdate(sql);
            
        } 
        catch (SQLException ex) 
        {
             System.out.println(ex);
        }  
            
    } 

    public void skDeleteCustomer(int customerId) throws SQLException
    {
        myStmt = null;
        String sql = null;
        
        try 
        {   
            
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
            
            sql ="delete from Customer where customerId = \""+customerId+"\"";
                
            myStmt.executeUpdate(sql);
           
        } 
        catch (SQLException ex) 
        {
        
        }  
            
    } 
    
    public ArrayList<Item> skGetItems(int sportsShopId)
    {    
        try 
        {   
            itemList.removeAll(itemList);
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
	    String sql="select * from Item where (sportsShopId = \'"+sportsShopId+"\' and itemStock > 0)";
	    ResultSet result = myStmt.executeQuery(sql);
            
            while(result.next())
            {
                item = new Item();
                item.setItemId(result.getInt("itemId"));
                item.setItemName(result.getString("itemName"));
                item.setItemDescription(result.getString("itemDescription"));
                item.setItemBrand(result.getString("itemBrand"));
                item.setItemColour(result.getString("itemColour"));
                item.setItemStock(result.getInt("itemStock"));
                item.setSportsShopId(result.getInt("sportsShopId"));
                item.setItemPurchasePrice(result.getInt("itemPurchasePrice"));
                item.setItemRentalPrice(result.getInt("itemRentalPrice"));
                itemList.add(item);
            }               
            
        } 
        catch (SQLException ex) 
        {
            System.out.println(ex);
        }

            return itemList;  
    }
    
    public ArrayList<Customer> skGetCustomers()
    {
        try{
            customerList.removeAll(customerList);
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
	    String sql="select * from Customer";
	    ResultSet result = myStmt.executeQuery(sql);
            
            while(result.next())
            {
                customer = new Customer();
                customer.setCustomerId(result.getInt("customerId"));
                customer.setCustomerName(result.getString("customerName"));
                customer.setCustomerContact(result.getString("customerContact"));
                customer.setCustomerAddress(result.getString("customerAddress"));
                customer.setCustomerUsername(result.getString("customerUsername"));
                customer.setCustomerPassword(result.getString("customerPassword"));
                customerList.add(customer);
            }               
            
        } 
        catch (SQLException ex) 
        {
            System.out.println(ex);
        }
        
        return customerList;
    }
    
    public ShopKeeper skLogin(String shopKeeperUsername) throws SQLException
    {
        
        try 
        {   
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
	    String sql="select * from ShopKeeper where shopKeeperUsername = \'"+shopKeeperUsername+"\'";
	    ResultSet result = myStmt.executeQuery(sql);
            
            while(result.next())
            {
                shopkeeper = new ShopKeeper();
                shopkeeper.setShopKeeperId(result.getInt("shopKeeperId"));
                shopkeeper.setShopKeeperName(result.getString("shopKeeperName"));
                shopkeeper.setShopKeeperContact(result.getString("shopKeeperContact"));
                shopkeeper.setShopKeeperAddress(result.getString("shopKeeperAddress"));
                shopkeeper.setShopKeeperUsername(result.getString("shopKeeperUsername"));
                shopkeeper.setShopKeeperPassword(result.getString("shopKeeperPassword"));
            }          
            
        } 
        catch (SQLException ex) 
        {
            
        }

            return shopkeeper;
    }     

    public SportsShop skSportsShop(int shopKeeperId) throws SQLException
    {

        try 
        {   
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
	    String sql="select * from SportsShop where shopKeeperId = \'"+shopKeeperId+"\'";
	    ResultSet result = myStmt.executeQuery(sql);
            
            while(result.next())
            {
                sportsshop = new SportsShop();
                sportsshop.setSportsShopId(result.getInt("sportsShopId"));
                sportsshop.setSportsShopName(result.getString("sportsShopName"));
                sportsshop.setSportsShopContact(result.getString("sportsShopContact"));
                sportsshop.setSportsShopAddress(result.getString("sportsShopAddress"));
                sportsshop.setShopKeeperId(result.getString("shopKeeperId"));
            }          
            
        } 
        catch (SQLException ex) 
        {
            
        }

            return sportsshop;
    }  
    
    public Customer csLogin(String customerUsername) throws SQLException
    {
        try 
        {   
            myStmt = SingletonConnection.getInstance().getConnection().createStatement();
	    String sql="select * from Customer where customerUsername = \'"+customerUsername+"\'";
	    ResultSet result = myStmt.executeQuery(sql);
            
            while(result.next())
            {
                customer = new Customer();
                customer.setCustomerId(result.getInt("customerId"));
                customer.setCustomerName(result.getString("customerName"));
                customer.setCustomerContact(result.getString("customerContact"));
                customer.setCustomerAddress(result.getString("customerAddress"));
                customer.setCustomerUsername(result.getString("customerUsername"));
                customer.setCustomerPassword(result.getString("customerPassword"));
            }          
            
        } 
        catch (SQLException ex) 
        {
            
        }

            return customer;
    }    
    
}
