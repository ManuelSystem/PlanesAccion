/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.CondicionCalidadDTO;
import Util.Database;
import java.util.ArrayList;

/**
 *
 * @author ESTUDIANTE
 */
public class CondicioncalidadDAO {

    public static ArrayList<CondicionCalidadDTO> cargarCondicion(CondicionCalidadDTO carcondi) {
        ArrayList<String> dato = new ArrayList<>();
        ArrayList<CondicionCalidadDTO> condi = new ArrayList<CondicionCalidadDTO>();
        
        try {
            String sql = "SELECT idCondicionCalidad, nombreCondicion, Descripcion FROM condicioncalidad";
            dato=Database.getSQL(sql);
            
            if(dato!= null){
                for(String campos : dato){
                    
                    String[] row = campos.split("/");
                    CondicionCalidadDTO acc = new CondicionCalidadDTO(row[0],row[1],row[2]);
                    condi.add(acc);
                }
            }
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return condi;
    }
    
}
