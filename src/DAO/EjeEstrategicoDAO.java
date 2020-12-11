/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.EjeEstrategicoDTO;
import Util.Database;
import java.util.ArrayList;

/**
 *
 * @author ESTUDIANTE
 */
public class EjeEstrategicoDAO {

    public static ArrayList<EjeEstrategicoDTO> obtenerEjeEstrategico() {
        ArrayList<String> dato = new ArrayList<>();
        ArrayList<EjeEstrategicoDTO> ejes = new ArrayList<>();
        try {
            String sql = "SELECT * FROM ejeestrategico";
            dato=Database.getSQL(sql);
            
            if(dato!= null){
                for(String campos : dato){
                    
                    String[] row = campos.split("/");
                    EjeEstrategicoDTO obeje = new EjeEstrategicoDTO(row[0], row[1]);
                    ejes.add(obeje);
                }
            }
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return ejes;
    }
    
}
