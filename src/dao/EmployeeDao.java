/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import model.Employee;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author durge
 */
public class EmployeeDao {
    
    public static void save(Employee employee){
        String query = "insert into employee (id, name, category) values('"+employee.getId()+"','"+employee.getName()+"','"+employee.getCategory()+"')";
        DbOperations.setDataOrDelete(query, "Employee Added Successfully");
    }
    
    public static ArrayList<Employee> getAllRecords(){                           //creating a method which would return a arraylist
        ArrayList<Employee> arrayList = new ArrayList<> ();                      //creating an ArrayList of Product Type in that we are setting the values by extracting it from the database
        try{
            ResultSet rs = DbOperations.getData("select * from employee");   //calling the resultset and calling DbOperation method in that getData and in this we are passing the queries  
            while(rs.next()){
                Employee employee = new Employee();                         //creating object(product) of Product table
                employee.setId(rs.getInt("id"));                     //{setting the product detailes
                employee.setName(rs.getString("name"));
                employee.setCategory(rs.getString("category"));
                employee.setSalary(rs.getString("salary"));             //}
                arrayList.add(employee);              //in the arraylist we are adding object of Product
                
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    
    public static void update(Employee employee){               //creating update method of Product type
        String query = "update employee set name = '"+employee.getName()+"',category = '"+employee.getCategory()+"',price = '"+employee.getSalary()+"' where id = '"+employee.getId()+"'";       //query for update method
        DbOperations.setDataOrDelete(query, "Employee Updated Successfully");            //passing the above query in DbOpreation method and passing the message
    }
    
    public static void delete(String id){                        //creating delete method  //taking id to delete
        String query = "delete from employee where id = '"+id+"'"; //query to delete
        DbOperations.setDataOrDelete(query, "Employee Deleted Successfully");
    }
}
