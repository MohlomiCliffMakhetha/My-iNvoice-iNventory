/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InvoiceInventorySystem;

/**
 *
 * @author CPUT
 */
public class SQLLoginInformation {
            final String address = "jdbc:mysql://localhost:3306/";
            static String user;
            static String password;
            
            static void infor(String username,String passWord){
            user = username;
             password = passWord;}
}
