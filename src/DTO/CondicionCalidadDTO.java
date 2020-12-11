package DTO;

import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.38003D7F-0E42-6737-A135-0CD4B600DE7B]
// </editor-fold> 
public class CondicionCalidadDTO {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.44240478-563C-837D-7663-2340E0E29A37]
    // </editor-fold> 
    private String idCondicionCalidad;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6CC8BD60-DDA6-028F-C4C0-7FC1A6B887F2]
    // </editor-fold> 
    private String nombre;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.ADC1B531-FE98-3482-39F7-6F57072B82D4]
    // </editor-fold> 
    private String codCalidad;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.42C5EF64-13C3-8ED2-1E57-DEA3ACF99695]
    // </editor-fold> 
    private String descripcion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CA345CD6-72A2-F380-27B0-4772A5D2257E]
    // </editor-fold> 
    private ArrayList<AnalisisInternoDTO> mAnalisisInternoDTO;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.451D6211-4A79-4A74-6BCD-C190AD03B10B]
    // </editor-fold> 
    //
    private ArrayList<AccionDTO> mAccionDTO;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.77F279C8-8012-F59A-C264-AAAADE96E88C]
    // </editor-fold> 
    public CondicionCalidadDTO () {
    }

    public CondicionCalidadDTO(String idCondicionCalidad, String nombre, String descripcion) {
        this.idCondicionCalidad = idCondicionCalidad;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.33E45A9A-295B-407C-B71E-16C20F02B7BE]
    // </editor-fold> 

    public String getIdCondicionCalidad() {
        return idCondicionCalidad;
    }

    public void setIdCondicionCalidad(String idCondicionCalidad) {
        this.idCondicionCalidad = idCondicionCalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodCalidad() {
        return codCalidad;
    }

    public void setCodCalidad(String codCalidad) {
        this.codCalidad = codCalidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<AnalisisInternoDTO> getmAnalisisInternoDTO() {
        return mAnalisisInternoDTO;
    }

    public void setmAnalisisInternoDTO(ArrayList<AnalisisInternoDTO> mAnalisisInternoDTO) {
        this.mAnalisisInternoDTO = mAnalisisInternoDTO;
    }

    public ArrayList<AccionDTO> getmAccionDTO() {
        return mAccionDTO;
    }

    public void setmAccionDTO(ArrayList<AccionDTO> mAccionDTO) {
        this.mAccionDTO = mAccionDTO;
    }
   

    

}

