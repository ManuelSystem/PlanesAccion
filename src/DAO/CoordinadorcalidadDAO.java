/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.CoordinadorCalidadDTO;
import Util.Database;
import java.util.ArrayList;

/**
 *
 * @author ESTUDIANTE
 */
public class CoordinadorcalidadDAO {

    public static CoordinadorCalidadDTO llamarCoordinadorCalidad(CoordinadorCalidadDTO coor) {
        String dato;
        ArrayList<String> datoPer;
        
        try {
            String sql = "SELECT cargo FROM coordinadorcalidad";
            datoPer=Database.getSQL(sql);
            
            dato=datoPer.toString();
            dato=dato.replace("[", "");
            dato=dato.replace("]", "");
            dato=dato.replace("/", "");
            
            coor.setPeriodoCargo(dato);
            
           
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return coor;
    }

    

    
    
}
