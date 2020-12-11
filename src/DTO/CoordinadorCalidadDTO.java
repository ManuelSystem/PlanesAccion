package DTO;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.B29A9519-FD59-BA0C-0F0D-D2699889E974]
// </editor-fold> 
public class CoordinadorCalidadDTO extends PersonaDTO {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1CD65D06-F28B-B5EA-53D8-A7528B40DF6D]
    // </editor-fold> 
    private String idCoordinadorCalidad;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3781C2F1-7382-74C3-EED9-4B11A5DDDFFD]
    // </editor-fold> 
    private String programaAcademico;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DE5437C4-2895-D9BF-EFEC-13D962140286]
    // </editor-fold> 
    private String periodoCargo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.21D4A856-58FA-9150-2F18-639BF563F1EB]
    // </editor-fold> 
    public CoordinadorCalidadDTO () {
    }

    public CoordinadorCalidadDTO(String idCoordinadorCalidad, String programaAcademico, String periodoCargo) {
        this.idCoordinadorCalidad = idCoordinadorCalidad;
        this.programaAcademico = programaAcademico;
        this.periodoCargo = periodoCargo;
    }
    

    public CoordinadorCalidadDTO(String cargo) {
    this.periodoCargo = cargo;   
    }

    public String getIdCoordinadorCalidad() {
        return idCoordinadorCalidad;
    }

    public void setIdCoordinadorCalidad(String idCoordinadorCalidad) {
        this.idCoordinadorCalidad = idCoordinadorCalidad;
    }

    public String getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(String programaAcademico) {
        this.programaAcademico = programaAcademico;
    }

    public String getPeriodoCargo() {
        return periodoCargo;
    }

    public void setPeriodoCargo(String periodoCargo) {
        this.periodoCargo = periodoCargo;
    }


}

