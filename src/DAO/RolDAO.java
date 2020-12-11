/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Util.Database;
import java.util.ArrayList;

/**
 *
 * @author Braro
 */
public class RolDAO {

   

    public RolDAO(){
        
    }

    public static ArrayList<String> obtencionRoles() {
        
        ArrayList<String> roles = new ArrayList<>();
        try {
            String sql = "SELECT nombre FROM rol";
            roles=Database.getSQL(sql);
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return roles;
        
    }
    
    public static boolean aggNuevoRol(String rol) {
        
        String sql="";
        try {
            sql="INSERT INTO rol (nombre) VALUES ('"+rol+"')";
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        return Database.ejecutarActualizacionSQL(sql);
    }
    
    public static ArrayList<String> validarRol(String rol) {
    
        ArrayList<String> vali = new ArrayList<>();
        try {
            String sql="SELECT nombre FROM rol WHERE nombre='"+rol+"'";
            vali = Database.getSQL(sql);
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return vali;
    }
    
     
    
}
