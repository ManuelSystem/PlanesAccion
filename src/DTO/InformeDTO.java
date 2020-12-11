package DTO;

import java.util.Date; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.A5AADFB8-CB0E-6864-4999-135771D30A6F]
// </editor-fold> 
public class InformeDTO {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.658B80A0-CA45-5B4B-F3B5-D46ED1FED57F]
    // </editor-fold> 
    private int codigoInforme;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0F34C7A0-92FB-2083-50F1-D7E918F2287B]
    // </editor-fold> 
    private Date fechaGeneralizacion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9F1E6053-9227-9B2F-CFBF-7FDF5861EEA4]
    // </editor-fold> 
    private String descripcion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8DDFC630-79B0-8551-193A-C2643E6B0770]
    // </editor-fold> 
    private PlanAccionDTO mPlanAccion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.37F0F1B0-6CC4-5562-C423-752F7172AABC]
    // </editor-fold> 
    private CoordinadorProgramaDTO mCoordinadorProgramaDTO;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.07F63EFD-7C14-23ED-D7F4-70B43A09556E]
    // </editor-fold> 
    public InformeDTO () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3CECB724-7B09-D317-832A-B22E25AD9B4A]
    // </editor-fold> 
    public int getCodigoInforme () {
        return 0;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6932C865-8892-974E-28C8-11680084CCCE]
    // </editor-fold> 
    public void setCodigoInforme (int val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.11E71143-C9E8-7D43-BD3F-53DBC786121F]
    // </editor-fold> 
    public Date getFechaGeneralizacion () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A44AC7FE-6F42-7CC4-470F-58DDDFE4549A]
    // </editor-fold> 
    public void setFechaGeneralizacion (Date val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C2869306-3C66-5D68-5C57-2CE2A08936F0]
    // </editor-fold> 
    public PlanAccionDTO getPlanAccion () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2EE0BA09-E86D-55D6-3CA6-959B770CB058]
    // </editor-fold> 
    public void setPlanAccion (PlanAccionDTO val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EDCCD433-B4A9-6420-83A7-F4F3E4473F9F]
    // </editor-fold> 
    public String getDescripcion () {
        return descripcion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B4CEC7D3-27F6-73CB-A53C-715D0BFF5A13]
    // </editor-fold> 
    public void setDescripcion (String val) {
        this.descripcion = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BD019622-4282-719E-8239-0CB490AC828D]
    // </editor-fold> 
    public CoordinadorProgramaDTO getCoordinadorProgramaDTO () {
        return mCoordinadorProgramaDTO;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.371645EA-4225-BF1B-AB02-C92ADABF37D8]
    // </editor-fold> 
    public void setCoordinadorProgramaDTO (CoordinadorProgramaDTO val) {
        this.mCoordinadorProgramaDTO = val;
    }

}

