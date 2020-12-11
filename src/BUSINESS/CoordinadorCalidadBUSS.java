/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUSINESS;

import DAO.CoordinadorcalidadDAO;
import DTO.CoordinadorCalidadDTO;
import java.util.ArrayList;

/**
 *
 * @author ESTUDIANTE
 */
public class CoordinadorCalidadBUSS {

    public CoordinadorCalidadBUSS() {
    }
    
    static ArrayList<String> llamarCoordinadorCalidad() {
        ArrayList<String> datos = new ArrayList<>();
       CoordinadorCalidadDTO coor= new CoordinadorCalidadDTO();
        
        coor=CoordinadorcalidadDAO.llamarCoordinadorCalidad(coor);
        
        datos.add(coor.getPeriodoCargo());
  
        return datos; 
    }
    
    
    
   
        
        
}
