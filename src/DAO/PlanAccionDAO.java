/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.PlanAccionDTO;
import Util.Database;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ESTUDIANTE
 */
public class PlanAccionDAO {

    
    
    public PlanAccionDAO(){}

    public static boolean llenarTablaPlanAccion(PlanAccionDTO plan) {
        String sql = "";
        
        try {
            sql = "INSERT INTO planaccion (NombrePlan,fechaInicio,fechaFinalizacion,idCondicion,ResponsableEjecucion)"
                    + " VALUES ('"+plan.getNombre()+"','"+plan.getFechaInicio()+"','"+plan.getFechaFinalizacion()+
                    "','"+plan.getNombreCondicion()+"','"+plan.getResponsable()+"')";
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return Database.ejecutarActualizacionSQL(sql);
    }

    public static ArrayList<PlanAccionDTO> obtenerPlanAccion() {
        ArrayList<PlanAccionDTO> plan = new ArrayList<PlanAccionDTO>();
        ArrayList<String> dato = new ArrayList<String>();
        SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
        try {
            String sql = "SELECT * FROM planaccion";
            dato = Database.getSQL(sql);
            
            if(dato!= null){
                for(String campos : dato){
                    
                    String[] row = campos.split("/");
                    PlanAccionDTO plAcc;
                    plAcc = new PlanAccionDTO(row[0],row[1],f.parse(row[2]),f.parse(row[3]),row[4],row[5]);
                    plan.add(plAcc);
                }
            }
             
        } catch (Exception e) {
            System.err.println("SQL Error dao: " + e.getMessage());
        }
        
        return plan;
    }
    
    public static boolean llenarTablaValoracionPlan(PlanAccionDTO plan) {
        String sql = "";
        
        try {
            sql = "INSERT INTO valoracionplan (idValoracionPlan,tipoValoracion,Observacion,idPlanAccion)"
                    + " VALUES (null,'"+plan.getTipoValoracion()+"','"+plan.getObservacion()+
                    "',"+plan.getIdPlan()+")";
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return Database.ejecutarActualizacionSQL(sql);
    }
    
}
