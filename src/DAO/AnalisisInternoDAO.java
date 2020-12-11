/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.AnalisisInternoDTO;
import Util.Database;
import java.util.ArrayList;

/**
 *
 * @author Braro
 */
public class AnalisisInternoDAO {

    public static boolean llenarTablaAnalisisInterno(AnalisisInternoDTO anaInter) {
        String sql = "";
        
        try {
            sql = "INSERT INTO analisisinterno (tipoAnalisis,descripcionAnalisis,solucion,idEjeEstrategico,idCondicionCalidad)"
                    + " VALUES ('"+anaInter.getEstadoAnalisis()+"','"+anaInter.getDescripcionAnalisis()+"',"
                    + "'"+anaInter.getSolucion()+"','"+anaInter.getEjeEstrategico()+"','"+anaInter.getCondicion()+"')";
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return Database.ejecutarActualizacionSQL(sql);
    }

    public static ArrayList<AnalisisInternoDTO> obtenerAnalisisInterno(AnalisisInternoDTO obtAna) {
        ArrayList<String> dato = new ArrayList<>();
        ArrayList<AnalisisInternoDTO> p = new ArrayList<AnalisisInternoDTO>();
        try {
            String sql = "SELECT idAnalisisInterno, tipoAnalisis, descripcionAnalisis FROM analisisinterno WHERE idCondicionCalidad="+obtAna.getCondicion()+"";
            dato=Database.getSQL(sql);
            
            if(dato!= null){
                for(String campos : dato){
                    String[] row = campos.split("/");
                    AnalisisInternoDTO ana = new AnalisisInternoDTO(row[0],row[1],row[2]);
                    p.add(ana);
                }
            }
            
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return p;
    }

    public static ArrayList<AnalisisInternoDTO> obtenerAnalisisXmatriz(AnalisisInternoDTO obtAna) {
        ArrayList<String> dato = new ArrayList<>();
        ArrayList<AnalisisInternoDTO> p = new ArrayList<AnalisisInternoDTO>();
        try {
            String sql = "SELECT DISTINCT a.idAnalisisInterno, a.tipoAnalisis, a.descripcionAnalisis, b.nombreEje, a.solucion"
                    + " FROM analisisinterno as a JOIN ejeestrategico as b WHERE "
                    + "a.idEjeEstrategico=b.idEjeEstrategico && idCondicionCalidad="+obtAna.getCondicion()+"";
            dato=Database.getSQL(sql);
            
            
            if(dato!= null){
                for(String campos : dato){
                    String[] row = campos.split("/");
                    AnalisisInternoDTO ana = new AnalisisInternoDTO(row[0],row[1],row[2],row[3],row[4]);
                    p.add(ana);
                }
            }
            
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return p;
    }
    
}
