/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author Neha Sonar
 */
public class tables {
    public static void main(String[] args){                           //creating main class( so we can execute directly)
       try{
//           String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE (email))";             //Columns in User Table
//           DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");                                          //Creating User table
//
//           String adminDetails = "insert into user(name,email,mobileNumber,password,securityQuestion,answer,status) values('Admin','admin@gmail.com','1234567890','admin','What is your 10th grade?','B','true')";                    //colums and values of admin 
//           DbOperations.setDataOrDelete(adminDetails, "Admin Details Added Successfully");                                      //Creating Admin                                
//
//           
//           String categoryTable = "create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
//           DbOperations.setDataOrDelete(categoryTable, "Category Table Added Successfully");                                      //Creating Category Table                                         
//       
//           String productTable = "create table product(id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200), price varchar(200))";
//           DbOperations.setDataOrDelete(productTable, "Product Table Added Successfully"); 
//           
//            //Creating Bill Table
//           String billTable = "create table bill(id int primary key,name varchar(200), mobileNumber varchar(200), email varchar(200), date varchar(50), total varchar(200), createdBy varchar(200))";
//           DbOperations.setDataOrDelete(billTable, "Bill Table Created Successfully");  
//           
            //Creating Employee Table
//           String employeeTable = "create table employee(eid int AUTO_INCREMENT primary key, name varchar(200), category varchar(200), salary varchar(100), timeslot varchar(200), gender varchar(200), mobile varchar(200), email varchar(200), address varchar(200))";
//           DbOperations.setDataOrDelete(employeeTable, "Employee Table Added Successfully");
//           
//           String inventoryTable = "create table inventory(id int AUTO_INCREMENT primary key, pname varchar(200), pqty int(11), pprice varchar(200), pdate varchar(50), sname varchar(200), snumber varchar(10), address varchar(200), sgst varchar(50), sellingprice varchar(100))";
//           DbOperations.setDataOrDelete(inventoryTable, "Inventory Table Added Successfully");
       }
       catch(Exception e){                                            //to suppress the exception 
           JOptionPane.showMessageDialog(null,e);
       }
    }
}
