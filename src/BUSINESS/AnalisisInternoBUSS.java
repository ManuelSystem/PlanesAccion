/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUSINESS;

import DAO.AnalisisInternoDAO;
import DTO.AnalisisInternoDTO;
import java.util.ArrayList;

/**
 *
 * @author Braro
 */
public class AnalisisInternoBUSS {

    

    public AnalisisInternoBUSS() {
    }
    
    static boolean llenarTablaAnalisisInterno(String tipoAnalisis, String descripcionAnalisis, String soluci, String idEjeEstrategico, String idCondicion) {
        AnalisisInternoDTO anaInter = new AnalisisInternoDTO(tipoAnalisis, descripcionAnalisis, soluci, idEjeEstrategico, idCondicion);
        return AnalisisInternoDAO.llenarTablaAnalisisInterno(anaInter);
    }
    
    static ArrayList<String> obtenerAnalisisInterno(String idCondi) {
        ArrayList<AnalisisInternoDTO> consulta = new ArrayList<>();
        ArrayList<String> analis = new ArrayList<>();
        
        AnalisisInternoDTO obtAna = new AnalisisInternoDTO(idCondi);
        consulta = AnalisisInternoDAO.obtenerAnalisisInterno(obtAna);
        
        for (AnalisisInternoDTO per : consulta){
            String datos = per.getIdAnalisisInterno()+"/"+per.getEstadoAnalisis()+"/"+per.getDescripcionAnalisis();
            analis.add(datos);
        }
        return analis;
    }
    
    static ArrayList<String> obtenerAnalisisXmatriz(String condicion) {
        ArrayList<AnalisisInternoDTO> consulta = new ArrayList<>();
        ArrayList<String> analis = new ArrayList<>();
        
        AnalisisInternoDTO obtAna = new AnalisisInternoDTO(condicion);
        consulta = AnalisisInternoDAO.obtenerAnalisisXmatriz(obtAna);
        
        for (AnalisisInternoDTO per : consulta){
            String datos = per.getEstadoAnalisis()+"/"+per.getDescripcionAnalisis()+"/"+per.getSolucion()+"/"+
                    per.getEjeEstrategico()+"/"+per.getCondicion();
            analis.add(datos);
        }
        return analis;
    }
    
}
