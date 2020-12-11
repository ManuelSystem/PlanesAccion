/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUSINESS;

import DAO.EjeEstrategicoDAO;
import DTO.EjeEstrategicoDTO;
import java.util.ArrayList;

/**
 *
 * @author ESTUDIANTE
 */
public class EjeEstrategicosBUSS {

    public EjeEstrategicosBUSS() {
    }
    
    static ArrayList<String> obtenerEjeEstrategico() {
        ArrayList<String> ejess= new ArrayList<>();
        ArrayList<EjeEstrategicoDTO>obtEje = new ArrayList<EjeEstrategicoDTO>();
        
        obtEje=EjeEstrategicoDAO.obtenerEjeEstrategico();
        for (EjeEstrategicoDTO ej : obtEje){
            String datos = ej.getIdEjeEstrategico()+"/"+ej.getNombre();
            ejess.add(datos);
        }
        return ejess; 
    }
    
}
