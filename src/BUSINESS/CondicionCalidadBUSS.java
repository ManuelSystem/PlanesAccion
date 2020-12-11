/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUSINESS;

import DAO.CondicioncalidadDAO;
import DTO.CondicionCalidadDTO;
import java.util.ArrayList;

/**
 *
 * @author ESTUDIANTE
 */
public class CondicionCalidadBUSS {

    public CondicionCalidadBUSS() {
    }
    
    static ArrayList<String> cargarCondicion() {
        ArrayList<String> condi = new ArrayList<>();
        ArrayList<CondicionCalidadDTO> cargar= new ArrayList<CondicionCalidadDTO>();
        
        CondicionCalidadDTO carcondi = new CondicionCalidadDTO();
        cargar = CondicioncalidadDAO.cargarCondicion(carcondi);
        
        for (CondicionCalidadDTO cn : cargar){
            String datos = cn.getIdCondicionCalidad()+"/ "+cn.getNombre()+"/ "+ cn.getDescripcion();
            condi.add(datos);
        }
        return condi;
       
    }
    
}
