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
public class RequerimientoDAO {
 
    public RequerimientoDAO(){}
    
    public static ArrayList<String> cargarRequimientos() {
        ArrayList<String> requerimiento = new ArrayList<>();
        try {
            String sql = "SELECT nomRequerimiento FROM requerimiento";
            requerimiento=Database.getSQL(sql);
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return requerimiento;
    }
    
    public static ArrayList<String> obtenerIdRequerimiento(String nom) {
        ArrayList<String> req = new ArrayList<>();
        try {
            String sql = "SELECT idReq FROM requerimiento WHERE nomRequerimiento='"+nom+"'";
            req=Database.getSQL(sql);
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return req;
    }
    
}
