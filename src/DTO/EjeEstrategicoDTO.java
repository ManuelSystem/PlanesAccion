package DTO;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.21C74314-7C51-B859-6A75-28E47245B6AF]
// </editor-fold> 
public class EjeEstrategicoDTO {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F51A485B-C9A7-F864-EAEA-9914BFADD96C]
    // </editor-fold> 
    private String idEjeEstrategico;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C7E44A67-7D46-D45C-52E2-652010726A2A]
    // </editor-fold> 
    private String nombre;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E800C83C-4E56-F0D0-0445-6C916D7418A5]
    // </editor-fold> 
    public EjeEstrategicoDTO () {
    }

    public EjeEstrategicoDTO(String idEjeEstrategico, String nombre) {
        this.idEjeEstrategico = idEjeEstrategico;
        this.nombre = nombre;
    }

    public String getIdEjeEstrategico() {
        return idEjeEstrategico;
    }

    public void setIdEjeEstrategico(String idEjeEstrategico) {
        this.idEjeEstrategico = idEjeEstrategico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

}

