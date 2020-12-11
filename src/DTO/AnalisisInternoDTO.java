package DTO;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.CB0A6EB3-761D-805F-6C4E-B148CBE14B15]
// </editor-fold> 
public class AnalisisInternoDTO {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3912C4D8-804E-706B-7AF4-45DB39C33EBE]
    // </editor-fold> 
    private String idAnalisisInterno;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9A54E80B-FA9D-63F6-EF23-9E11E9F6FAAF]
    // </editor-fold> 
    private String estadoAnalisis;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.98362C44-29BE-B477-A92B-B71D56700FAA]
    // </editor-fold> 
    private String descripcionAnalisis;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1925EB96-C3DB-095C-AA6B-0377AC648365]
    // </editor-fold> 
    private String solucion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A926F859-5729-FB61-D94C-AF66E17865B7]
    // </editor-fold> 
    private EjeEstrategicoDTO mEjeEstrategicoDTO;
    
    private String ejeEstrategico;
    
    private String condicion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D4A8AD1F-4E79-9352-3ADD-FC76ED5E08BF]
    // </editor-fold> 
    public AnalisisInternoDTO () {
    }

    public AnalisisInternoDTO(String estadoAnalisis, String descripcionAnalisis, String solucion, String ejeEstrategico, String condicion) {
        this.estadoAnalisis = estadoAnalisis;
        this.descripcionAnalisis = descripcionAnalisis;
        this.solucion = solucion;
        this.ejeEstrategico = ejeEstrategico;
        this.condicion = condicion;
    }
    
    

    public AnalisisInternoDTO(String condicion) {
        this.condicion = condicion;
    }

    public AnalisisInternoDTO(String idAnalisisInterno, String estadoAnalisis, String descripcionAnalisis) {
        this.idAnalisisInterno = idAnalisisInterno;
        this.estadoAnalisis = estadoAnalisis;
        this.descripcionAnalisis = descripcionAnalisis;
    }
    
    public String getIdAnalisisInterno() {
        return idAnalisisInterno;
    }

    public void setIdAnalisisInterno(String idAnalisisInterno) {
        this.idAnalisisInterno = idAnalisisInterno;
    }

    public String getEstadoAnalisis() {
        return estadoAnalisis;
    }

    public void setEstadoAnalisis(String estadoAnalisis) {
        this.estadoAnalisis = estadoAnalisis;
    }

    public String getDescripcionAnalisis() {
        return descripcionAnalisis;
    }

    public void setDescripcionAnalisis(String descripcionAnalisis) {
        this.descripcionAnalisis = descripcionAnalisis;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    public EjeEstrategicoDTO getmEjeEstrategicoDTO() {
        return mEjeEstrategicoDTO;
    }

    public void setmEjeEstrategicoDTO(EjeEstrategicoDTO mEjeEstrategicoDTO) {
        this.mEjeEstrategicoDTO = mEjeEstrategicoDTO;
    }

    public String getEjeEstrategico() {
        return ejeEstrategico;
    }

    public void setEjeEstrategico(String ejeEstrategico) {
        this.ejeEstrategico = ejeEstrategico;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    
    
    


}

