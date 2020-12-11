/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.TareaDTO;
import Util.Database;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author ESTUDIANTE
 */
public class TareaDAO {

    public static boolean llenarTablaTarea(TareaDTO tar) {
        String sql = "";
        String hola = "";
        try {
            sql = "INSERT INTO tarea (descripcion,observacion,fechaInicioEjecucion,fechaFinalizacionEjecucion,DescripcionRecursos,Costos,idDocente,idAccion)"
                    + " VALUES ('"+tar.getDescripcion()+"','"+hola+"','"+tar.getFechaInicioEjecucion()+"',"
                    + "'"+tar.getFechaFinaliacionEjecucion()+"','"+tar.getDescripcionRecursos()+"','"+tar.getCostos()+"',"+tar.getDocente()+","+tar.getAccion()+")";
            
            
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return Database.ejecutarActualizacionSQL(sql);
    }

    public static ArrayList<TareaDTO> obtenerTareasDocente(TareaDTO tarea) {
        ArrayList<TareaDTO> tarDoc = new ArrayList<TareaDTO>();
        ArrayList<String> dato = new ArrayList<String>();
        SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
        try {
            String sql = "SELECT idTarea, descripcion, fechaInicioEjecucion, fechaFinalizacionEjecucion FROM tarea "
                    + "WHERE idDocente=(SELECT idDocente FROM docente WHERE idPersona="+tarea.getDocente()+")";
            dato = Database.getSQL(sql);
            
            
            
            if(dato!= null){
                for(String campos : dato){
                    
                    String[] row = campos.split("/");
                    TareaDTO tar;
                    tar = new TareaDTO(row[0],row[1],f.parse(row[2]),f.parse(row[3]));
                    tarDoc.add(tar);
                }
            }
             
        } catch (Exception e) {
            System.err.println("SQL Error dao: " + e.getMessage());
        }
        
        return tarDoc;
    }

    public static ArrayList<TareaDTO> obtenerTareasXaccion(TareaDTO obtTarea) {
        ArrayList<String> dato = new ArrayList<>();
        ArrayList<TareaDTO> p = new ArrayList<TareaDTO>();
        SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
        try {
            String sql = "SELECT ac.descripcionAccion, ta.descripcion, ta.fechaInicioEjecucion, "
                    + "ta.fechaFinalizacionEjecucion, ta.DescripcionRecursos, ta.Costos FROM tarea AS ta JOIN "
                    + "accion AS ac WHERE ta.idAccion=ac.idAccion "
                    + "AND ac.idCondicionCalidad="+obtTarea.getDocente()+"";
           
            dato=Database.getSQL(sql);
            
            
            if(dato!= null){
                for(String campos : dato){
                    String[] row = campos.split("/");
                    TareaDTO acc = new TareaDTO(row[0],row[1],f.parse(row[2]),f.parse(row[3]),row[4],row[5]);
                    p.add(acc);
                }
            }
            
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return p;
    }
    
}
