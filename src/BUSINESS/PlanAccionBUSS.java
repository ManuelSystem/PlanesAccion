/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUSINESS;

import DAO.PlanAccionDAO;
import DTO.PlanAccionDTO;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ESTUDIANTE
 */
public class PlanAccionBUSS {

    

    public PlanAccionBUSS() {
    }
    
    static boolean llenarTablaPlanAccion(String nomMatriz, Date fechaIni, Date fechaFinal, String condCalidad, String responsable) {
        PlanAccionDTO plan= new PlanAccionDTO(nomMatriz,fechaIni,fechaFinal,condCalidad,responsable);
        return PlanAccionDAO.llenarTablaPlanAccion(plan);
    }
    
    //obtener los datos
    static ArrayList<String> obtenerPlanAccion() {
        ArrayList<PlanAccionDTO> todo = new ArrayList<>();
        
        ArrayList<String> integrado = new ArrayList<>();
        
        DateFormat f=new SimpleDateFormat("yyyy-MM-dd");
        Date uno, dos = null;
        
        todo = PlanAccionDAO.obtenerPlanAccion();
        
        for (PlanAccionDTO per : todo){
            uno=per.getFechaInicio();
            dos=per.getFechaFinalizacion();
            String datos = per.getIdPlan()+"/"+per.getNombre()+"/"+f.format(uno)+"/"+f.format(dos)+
                    "/"+per.getNombreCondicion()+"/"+per.getResponsable();
            integrado.add(datos);
        }
        
        return integrado;
    }
    
    static boolean llenarTablaValoracionPlan(String tipoValoracion, String observacion, String idPlanAccion) {
        PlanAccionDTO plan= new PlanAccionDTO(tipoValoracion,observacion,idPlanAccion);
        return PlanAccionDAO.llenarTablaValoracionPlan(plan);
    }
    
}
