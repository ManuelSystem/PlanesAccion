/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUSINESS;

import DAO.AccionDAO;
import DTO.AccionDTO;
import java.util.ArrayList;

/**
 *
 * @author ESTUDIANTE
 */
public class AccionBUSS {

    

    public AccionBUSS() {
    }
    
    static boolean llenarTablaAccion(String accion, String meta, String responsable, String idCondicion, String idAnalsisInterno) {
        AccionDTO tablaAcc = new AccionDTO(accion, meta, responsable, idCondicion, idAnalsisInterno);
        return AccionDAO.llenarTablaAccion(tablaAcc);
    }
    
    static ArrayList<String> obtenerAccion(String idCondicion) {
        
        ArrayList<AccionDTO> accio = new ArrayList<AccionDTO>();
        ArrayList<String> integrado = new ArrayList<>();

        AccionDTO obtAcc = new AccionDTO(idCondicion);
        accio = AccionDAO.obtenerAccion(obtAcc);
        
        for (AccionDTO acc : accio){
            String datos = acc.getIdAccion()+"/"+acc.getAnalisis()+"/"+acc.getDescripcionAccion()
                    +"/"+acc.getMeta();
            integrado.add(datos);
        }
        
        return integrado;
    }
    
    
    
}
