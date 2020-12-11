/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.PersonaDTO;
import Util.Database;
import java.util.ArrayList;

/**
 *
 * @author Braro
 */
public class PrivilegioDAO {

    public static ArrayList<String> cargarPrivilegios(PersonaDTO persona) {
        ArrayList<String> privi = new ArrayList<>();

        try {
            
            String sql="SELECT nomModulo, nomRequerimiento, usuario FROM privilegios as priv, modulo as md, requerimiento as req, "
                    + "rolpersona as rolp, persona as per"
                    + " WHERE rolp.idRolPersona="+persona.getRol()+" AND rolp.idRolPersona=priv.idRolPersona AND "
                    + "req.idReq=priv.idReq AND req.idModulo=md.idModulo AND rolp.idPersona=per.idPersona";
        
            privi=Database.getSQL(sql);
            
            
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }

        return privi;
    }

    public static boolean insertarPrivilegios(String idRoPer, String idReq) {
        String sql = "";
        
        try {
            sql = "INSERT INTO privilegios (idRolPersona, idReq) VALUES("+idRoPer+", "+idReq+")";
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return Database.ejecutarActualizacionSQL(sql);
    }
    
}
