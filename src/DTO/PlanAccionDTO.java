package DTO;

import java.util.ArrayList; 
import java.util.Date; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.4EA90A12-4F6C-AB04-F131-6D361FB7ECA9]
// </editor-fold> 
public class PlanAccionDTO {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.563E6443-E85C-F810-F237-022B458542EA]
    // </editor-fold> 
    private String idPlan;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A0B8B7A7-F3AA-DF1F-56F1-4A2AC1A24B97]
    // </editor-fold> 
    private String nombre;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6684C0E3-8FFD-BDAC-05DB-F6C9A39BA718]
    // </editor-fold> 
    private Date fechaInicio;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BADB79D5-B05E-1E75-E0B0-A1BDF63C79D2]
    // </editor-fold> 
    private Date fechaFinalizacion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B5D0CA84-20A4-2B7A-4556-560D5C2DB164]
    // </editor-fold> 
    private ArrayList<CondicionCalidadDTO> mCondicionCalidadDTO;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DF80B403-B4F0-8C1E-C6A0-F278765DD372]
    // </editor-fold> 
    private CoordinadorCalidadDTO mCoordinadorCalidadDTO;
    
    private String responsable;
    
    private String nombreCondicion;

    private String tipoValoracion;
    
    private String observacion;
    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F67AF4B1-D266-92E6-FE22-E3CDDE027BAC]
    // </editor-fold> 
    public PlanAccionDTO () {
    }

    public PlanAccionDTO(String nombre, Date fechaInicio, Date fechaFinalizacion, String nombreCondicion,  String responsable) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.nombreCondicion = nombreCondicion;
        this.responsable = responsable;
        
    }

    public PlanAccionDTO(String idPlan, String nombre, Date fechaInicio, Date fechaFinalizacion, String nombreCondicion, String responsable) {
        this.idPlan = idPlan;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.nombreCondicion = nombreCondicion;
        this.responsable = responsable;
    }

    public PlanAccionDTO(String tipoValoracion, String observacion, String idPlan) {
        this.tipoValoracion = tipoValoracion;
        this.observacion = observacion;
        this.idPlan = idPlan;
    }

    
    
    public String getTipoValoracion() {
        return tipoValoracion;
    }

    public void setTipoValoracion(String tipoValoracion) {
        this.tipoValoracion = tipoValoracion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }


    
    
    public String getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(String idPlan) {
        this.idPlan = idPlan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public ArrayList<CondicionCalidadDTO> getmCondicionCalidadDTO() {
        return mCondicionCalidadDTO;
    }

    public void setmCondicionCalidadDTO(ArrayList<CondicionCalidadDTO> mCondicionCalidadDTO) {
        this.mCondicionCalidadDTO = mCondicionCalidadDTO;
    }

    public CoordinadorCalidadDTO getmCoordinadorCalidadDTO() {
        return mCoordinadorCalidadDTO;
    }

    public void setmCoordinadorCalidadDTO(CoordinadorCalidadDTO mCoordinadorCalidadDTO) {
        this.mCoordinadorCalidadDTO = mCoordinadorCalidadDTO;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getNombreCondicion() {
        return nombreCondicion;
    }

    public void setNombreCondicion(String nombreCondicion) {
        this.nombreCondicion = nombreCondicion;
    }

   
   

}

