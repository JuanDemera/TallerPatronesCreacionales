/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda;
import java.sql.*;


public class DataBase_Connect {
    
    private static Connection connected;
    private static DataBase_Connect instance;

    private DataBase_Connect() {
        //constructor vacio y privado
    }
  
    private static final String URL= "jdbc:mysql:localhost/Tienda";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    public Connection connect(){
        //se omite
        return connected;
    }
    
    public Connection  disconnect(){
        //se omite
        return connected;
    }
    
    public static DataBase_Connect getInstance(){
        if(instance==null)
            instance = new DataBase_Connect();
        return instance;
   }
}
