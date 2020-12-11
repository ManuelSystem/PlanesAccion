package DTO;

import java.util.Date; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.17D63897-1425-2432-D4B0-BA9104C30FA2]
// </editor-fold> 
public class TareaDTO {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C0E12994-230B-C934-8022-2DFEB43154AB]
    // </editor-fold> 
    private String idTarea;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.ED51C9FB-542E-92C2-1A75-DA053ADEE663]
    // </editor-fold> 
    private String descripcion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.93077508-DC44-ECA0-5A85-D676A874F4C1]
    // </editor-fold> 
    private String observacion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8C1BC1D3-B7C3-12AC-9B50-AEE749A08C08]
    // </editor-fold> 
    private Date fechaInicioEjecucion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.88DCF511-518C-6F3B-9CC8-52A46B21DF3F]
    // </editor-fold> 
    private Date fechaFinaliacionEjecucion;
    
    private String descripcionRecursos;
    
    private String costos;
    
    private String docente;
    
    private String accion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.68C87001-FA89-CF88-A150-1AE4CA50C39E]
    // </editor-fold> 
    private DocenteDTO mDocenteDTO;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.389BF778-2531-67B9-2FFA-70F9309C1C52]
    // </editor-fold> 
    public TareaDTO () {
    }

    public TareaDTO(String descripcion, String observacion, Date fechaInicioEjecucion, Date fechaFinaliacionEjecucion, String descripcionRecursos, String costos, String docente, String accion) {
        this.descripcion = descripcion;
        this.observacion = observacion;
        this.fechaInicioEjecucion = fechaInicioEjecucion;
        this.fechaFinaliacionEjecucion = fechaFinaliacionEjecucion;
        this.descripcionRecursos = descripcionRecursos;
        this.costos = costos;
        this.docente = docente;
        this.accion = accion;
    }

    public TareaDTO(String descripcion, Date fechaInicioEjecucion, Date fechaFinaliacionEjecucion, String descripcionRecursos, String costos, String docente, String accion) {
        this.descripcion = descripcion;
        this.fechaInicioEjecucion = fechaInicioEjecucion;
        this.fechaFinaliacionEjecucion = fechaFinaliacionEjecucion;
        this.descripcionRecursos = descripcionRecursos;
        this.costos = costos;
        this.docente = docente;
        this.accion = accion;
    }

    public TareaDTO(String docente) {
        this.docente = docente;
    }

    public TareaDTO(String idTarea, String descripcion, Date fechaInicioEjecucion, Date fechaFinaliacionEjecucion) {
        this.idTarea = idTarea;
        this.descripcion = descripcion;
        this.fechaInicioEjecucion = fechaInicioEjecucion;
        this.fechaFinaliacionEjecucion = fechaFinaliacionEjecucion;
    }

    public TareaDTO(String accion, String descripcion, Date fechaInicioEjecucion, Date fechaFinaliacionEjecucion, String descripcionRecursos, String costos) {
        this.accion = accion;
        this.descripcion = descripcion;
        this.fechaInicioEjecucion = fechaInicioEjecucion;
        this.fechaFinaliacionEjecucion = fechaFinaliacionEjecucion;
        this.descripcionRecursos = descripcionRecursos;
        this.costos = costos;
    }
    
    
    
    public String getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(String idTarea) {
        this.idTarea = idTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFechaInicioEjecucion() {
        return fechaInicioEjecucion;
    }

    public void setFechaInicioEjecucion(Date fechaInicioEjecucion) {
        this.fechaInicioEjecucion = fechaInicioEjecucion;
    }

    public Date getFechaFinaliacionEjecucion() {
        return fechaFinaliacionEjecucion;
    }

    public void setFechaFinaliacionEjecucion(Date fechaFinaliacionEjecucion) {
        this.fechaFinaliacionEjecucion = fechaFinaliacionEjecucion;
    }

    public String getDescripcionRecursos() {
        return descripcionRecursos;
    }

    public void setDescripcionRecursos(String descripcionRecursos) {
        this.descripcionRecursos = descripcionRecursos;
    }

    public String getCostos() {
        return costos;
    }

    public void setCostos(String costos) {
        this.costos = costos;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public DocenteDTO getmDocenteDTO() {
        return mDocenteDTO;
    }

    public void setmDocenteDTO(DocenteDTO mDocenteDTO) {
        this.mDocenteDTO = mDocenteDTO;
    }

    
    

}

