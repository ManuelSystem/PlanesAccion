/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.AccionDTO;
import Util.Database;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ESTUDIANTE
 */
public class AccionDAO {

    public static boolean llenarTablaAccion(AccionDTO tablaAcc) {
        String sql = "";
        
        try {
            sql = "INSERT INTO accion (descripcionAccion,meta,responsableSeguimiento,idCondicionCalidad,idAnalisisInterno)"
                    + " VALUES ('"+tablaAcc.getDescripcionAccion()+"','"+tablaAcc.getMeta()+"',"
                    + "'"+tablaAcc.getResponsableSeguimiento()+"',"
                    + "'"+tablaAcc.getCondicionCalidad()+"','"+tablaAcc.getAnalisis()+"')";
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return Database.ejecutarActualizacionSQL(sql);
    }

    public static ArrayList<AccionDTO> obtenerAccion(AccionDTO obtAcc) {
        ArrayList<String> dato = new ArrayList<>();
        ArrayList<AccionDTO> p = new ArrayList<AccionDTO>();
        
        try {
            String sql = "SELECT ac.idAccion, b.tipoAnalisis, ac.descripcionAccion, ac.meta FROM accion AS ac JOIN "
                    + "analisisinterno AS b WHERE ac.idAnalisisInterno=b.idAnalisisInterno AND "
                    + "ac.idCondicionCalidad="+obtAcc.getCondicionCalidad()+"";
           
            dato=Database.getSQL(sql);
            
            
            if(dato!= null){
                for(String campos : dato){
                    String[] row = campos.split("/");
                    AccionDTO acc = new AccionDTO(row[0],row[1],row[2],row[3]);
                    p.add(acc);
                }
            }
            
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return p;
    }

   
    
}
