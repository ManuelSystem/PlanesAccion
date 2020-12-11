package DTO;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.16369EBA-C487-53F5-AD97-6570F49E2593]
// </editor-fold> 
public class DocenteDTO extends PersonaDTO {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3D33163D-D5D4-D20B-8E1D-729FFB5FD8B5]
    // </editor-fold> 
    private String idDocente;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.47F9E66F-9F6C-9B8E-3019-2B4EE5EB11BE]
    // </editor-fold> 
    private String titulo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1C502D99-EC90-9E31-3282-AB4D0A282887]
    // </editor-fold> 
    private String facultad;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A2543D26-07CC-CA40-29D7-48FDD222D0D5]
    // </editor-fold> 
    public DocenteDTO () {
    }

    public DocenteDTO(String idDocente) {
        this.idDocente = idDocente;
    }

    public String getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(String idDocente) {
        this.idDocente = idDocente;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    

}

