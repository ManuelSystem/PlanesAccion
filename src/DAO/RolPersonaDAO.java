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
public class RolPersonaDAO {

    

    public RolPersonaDAO(){  
    }
    
    public static ArrayList<String> obtenerRolPersona(String rol, String per) {
        ArrayList<String> consulta = new ArrayList<>();
        try {
            String sql="SELECT idRolPersona FROM rolpersona WHERE idRol="+rol+" AND idPersona="+per+"";
            consulta = Database.getSQL(sql);
            System.out.println(sql);
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return consulta;
    }
    
    
    
}
