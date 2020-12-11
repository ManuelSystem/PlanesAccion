package DTO;

import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.2B50180D-5FC7-46B7-0B4F-69523A296409]
// </editor-fold> 
public class AccionDTO {

    private String idAccion;
    
    private String descripcionAccion;
    
    private String meta;
    
    private String responsableSeguimiento;
    
    private String condicionCalidad;
    
    private String analisis;
    
    public AccionDTO(){}

    public AccionDTO(String descripcionAccion, String meta, String responsableSeguimiento, String condicionCalidad, String analisis) {
        this.descripcionAccion = descripcionAccion;
        this.meta = meta;
        this.responsableSeguimiento = responsableSeguimiento;
        this.condicionCalidad = condicionCalidad;
        this.analisis = analisis;
    }

    public AccionDTO(String condicionCalidad) {
        this.condicionCalidad = condicionCalidad;
    }

    public AccionDTO(String idAccion, String descripcionAccion) {
        this.idAccion = idAccion;
        this.descripcionAccion = descripcionAccion;
    }

    public AccionDTO(String idAccion, String analisis, String descripcionAccion, String meta) {
        this.idAccion = idAccion;
        this.analisis = analisis;
        this.descripcionAccion = descripcionAccion;
        this.meta = meta; 
    }
    
    
    
    public String getIdAccion() {
        return idAccion;
    }

    public void setIdAccion(String idAccion) {
        this.idAccion = idAccion;
    }

    public String getDescripcionAccion() {
        return descripcionAccion;
    }

    public void setDescripcionAccion(String descripcionAccion) {
        this.descripcionAccion = descripcionAccion;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public String getResponsableSeguimiento() {
        return responsableSeguimiento;
    }

    public void setResponsableSeguimiento(String responsableSeguimiento) {
        this.responsableSeguimiento = responsableSeguimiento;
    }

    public String getCondicionCalidad() {
        return condicionCalidad;
    }

    public void setCondicionCalidad(String condicionCalidad) {
        this.condicionCalidad = condicionCalidad;
    }

    public String getAnalisis() {
        return analisis;
    }

    public void setAnalisis(String analisis) {
        this.analisis = analisis;
    }
    
    
}

