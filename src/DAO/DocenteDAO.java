/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.DocenteDTO;
import DTO.PersonaDTO;
import Util.Database;
import java.util.ArrayList;

/**
 *
 * @author Braro
 */
public class DocenteDAO {

    public static DocenteDTO obtenerIdDocenteAccion(DocenteDTO obtDoc) {
        ArrayList<String> dato = new ArrayList<>();
        
        try {
            String sql = "SELECT idDocente FROM docente WHERE idPersona="
                    + "(SELECT idPersona FROM persona WHERE Nombre='"+obtDoc.getIdDocente()+"')";
            dato=Database.getSQL(sql);
            
            String separado = dato.toString();
            
            obtDoc.setIdDocente(separado);
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return obtDoc;
    }

    public static DocenteDTO obtenerNombreDocenteAccion(DocenteDTO obtDocen) {
        ArrayList<String> dato = new ArrayList<>();
        
        try {
            String sql = "SELECT responsableSeguimiento FROM accion WHERE idAccion="+obtDocen.getIdDocente()+"";
            dato=Database.getSQL(sql);
            
            String separado = dato.toString();
            
            obtDocen.setIdDocente(separado);
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return obtDocen;
    }
    
}
