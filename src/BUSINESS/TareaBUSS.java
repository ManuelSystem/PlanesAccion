/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUSINESS;

import DAO.TareaDAO;
import DTO.TareaDTO;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ESTUDIANTE
 */
public class TareaBUSS {

    

    
    public TareaBUSS() {
    }
    
    static boolean llenarTablaTarea(String descripcionTarea, Date fechaIni, Date fechaFinal, String recursos, String costos, String idDocen, String idAccion) {
        TareaDTO tar = new TareaDTO(descripcionTarea, fechaIni, fechaFinal, recursos, costos, idDocen, idAccion);
        return TareaDAO.llenarTablaTarea(tar);
    }
    
    static ArrayList<String> obtenerTareasDocente(String idDocente) {
        
        ArrayList<TareaDTO> todo = new ArrayList<>();
        ArrayList<String> integrado = new ArrayList<>();
        
        TareaDTO tarea = new TareaDTO(idDocente);
        
        DateFormat f=new SimpleDateFormat("yyyy-MM-dd");
        Date uno, dos = null;
        
        todo = TareaDAO.obtenerTareasDocente(tarea);
        
        for (TareaDTO tr : todo){
            uno=tr.getFechaInicioEjecucion();
            dos=tr.getFechaFinaliacionEjecucion();
            String datos = tr.getIdTarea()+"/"+tr.getDescripcion()+"/"+f.format(uno)+"/"+f.format(dos);
            integrado.add(datos);
        }
        
        return integrado;
        
    }
    
    static ArrayList<String> obtenerTareasXaccion(String condicion) {
        ArrayList<TareaDTO> accio = new ArrayList<TareaDTO>();
        ArrayList<String> integrado = new ArrayList<>();

        TareaDTO obtTarea = new TareaDTO(condicion);
        accio = TareaDAO.obtenerTareasXaccion(obtTarea);
        
        DateFormat f=new SimpleDateFormat("yyyy-MM-dd");
        Date uno, dos = null;
        
        for (TareaDTO tar : accio){
            uno=tar.getFechaInicioEjecucion();
            dos=tar.getFechaFinaliacionEjecucion();
            String datos = tar.getAccion()+"/"+tar.getDescripcion()+"/"+f.format(uno)+"/"+f.format(dos)+"/"
                    +tar.getDescripcionRecursos()+"/"+tar.getCostos();
            integrado.add(datos);
        }
        
        return integrado;
    }

    
}
