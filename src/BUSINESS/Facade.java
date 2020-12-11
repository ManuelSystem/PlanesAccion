/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUSINESS;

import Util.Database;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ESTUDIANTE
 */
public class Facade {
    
    public Facade(){
       Database.connect();
    }

    public ArrayList<String> cargarRoles() {
        ArrayList<String> rolFacade;
        rolFacade = BussSistema.cargarRolesBuss();
        return rolFacade;
    }
    
    public ArrayList<String> iniciarSesion(String usu, String pass, String rol) {
        ArrayList<String> privilegiosFacade;
        privilegiosFacade = PersonaBUSS.buscarPrivilegiosBuss(usu, pass, rol);
        return privilegiosFacade;
    }

    public ArrayList<String> validarUsuario(String codigo, String email) {
        ArrayList<String> validar;
        validar = PersonaBUSS.validarUsuario(codigo,email);
        return validar;
    }

    public boolean actualizarPassword(String id, String pass) {
        return PersonaBUSS.actualizarPassword(id, pass);
    }

    public ArrayList<String> obtenerDatosPersona(String id) {
        ArrayList<String> dato;
        dato = PersonaBUSS.obtenerDatosPersona(id);
        return dato;
    }
    
    public ArrayList<String> obtenerTodos() {
        ArrayList<String> todo;
        todo = PersonaBUSS.obtenerTodos();
        return todo;
    }

    public boolean añadirUsuarioPersona(String nombre, String apellido, String cedula, String telefono, String correo, String usuario, String password, String codigoSeguridad) {
        return PersonaBUSS.añadirUsuarioPersona(nombre, apellido,cedula,telefono,correo,usuario,password,codigoSeguridad);
    }

    public boolean aggNuevoRol(String rol) {
        return BussSistema.aggNuevoRol(rol);
    }

    public ArrayList<String> validarRol(String rol) {
        ArrayList<String> valida;
        valida = BussSistema.validarRol(rol);
        return valida;
    }

    public ArrayList<String> cargarRequimientos() {
        ArrayList<String>cargarRequerimiento;
        cargarRequerimiento=BussSistema.cargarRequimientos();
        return cargarRequerimiento;
    }

    public ArrayList<String> consultaIDPersonaRol(String persona, String rol) {
        ArrayList<String> consulta; 
        consulta = PersonaBUSS.consultaIDPersonaRol(persona, rol);
        return consulta;
    }

    public boolean insertarRolPersona(String idPersona, String idRol) {
        return BussSistema.insertarRolPersona(idPersona, idRol);
    }

    public boolean actualizarUsuarioPersona(String nombre, String apellido, String cedula, String telefono, String correo, String usuario, String password, String id) {
        return PersonaBUSS.actualizarUsuarioPersona(nombre, apellido,cedula,telefono,correo,usuario,password,id);
    }

    public boolean eliminarUsuario(String valor) {
        return PersonaBUSS.eliminarUsuario(valor);
    }

    public ArrayList<String> obtenerRolPersona(String rol, String per) {
        ArrayList<String> obtn;
        obtn = BussSistema.obtenerRolPersona(rol, per);
        return obtn;
    }

    public boolean insertarPrivilegios(String idRoPer, String idReq) {
        return BussSistema.insertarPrivilegios(idRoPer,idReq);
    }

    public ArrayList<String> obtenerIdRequerimiento(String nom) {
        ArrayList<String> obtReq;
        obtReq = BussSistema.obtenerIdRequerimiento(nom);
        return obtReq;
    }

    public ArrayList<String> cargarCondicion() {
        ArrayList<String> condi;
        condi=CondicionCalidadBUSS.cargarCondicion();
        return condi;
    }

    public ArrayList<String> llamarCoordinadorCalidad() {
        ArrayList<String> cor;
        cor=CoordinadorCalidadBUSS.llamarCoordinadorCalidad();
        return cor; 
    }

    public boolean llenarTablaPlanAccion(String nomMatriz, Date fechaIni, Date fechaFinal, String condCalidad, String responsable) {
        return PlanAccionBUSS.llenarTablaPlanAccion(nomMatriz,fechaIni,fechaFinal,condCalidad,responsable);
    }

    public ArrayList<String> obtenerEjeEstrategico() {
        ArrayList<String> ejes;
        ejes=EjeEstrategicosBUSS.obtenerEjeEstrategico();
        return ejes; 
    }

    public boolean llenarTablaAnalisisInterno(String tipoAnalisis, String descripcionAnalisis, String soluci, String idEjeEstrategico, String idCondicion) {
        return AnalisisInternoBUSS.llenarTablaAnalisisInterno(tipoAnalisis,descripcionAnalisis,soluci,idEjeEstrategico,idCondicion);
    }

    public ArrayList<String> obtenerAnalisisInterno(String idCondi) {
        ArrayList<String> anali;
        anali = AnalisisInternoBUSS.obtenerAnalisisInterno(idCondi);
        return anali;
    }

    public ArrayList<String> consultaPersonaCargo() {
        ArrayList<String> consult;
        consult=PersonaBUSS.consultaPersonaCargo();
        return consult;
    }

    public boolean llenarTablaAccion(String accion, String meta, String responsable, String idCondicion, String idAnalsisInterno) {
        return AccionBUSS.llenarTablaAccion(accion, meta, responsable, idCondicion, idAnalsisInterno);
    }

    public ArrayList<String> obtenerAccion(String idCondicion) {
        ArrayList<String> acci;
        acci = AccionBUSS.obtenerAccion(idCondicion);
        return acci;
    }

    public ArrayList<String> obtenerIdDocenteAccion(String nomb) {
        ArrayList<String> docent;
        docent = DocenteBUSS.obtenerIdDocenteAccion(nomb);
        return docent;
    }

    public ArrayList<String> obtenerNombreDocenteAccion(String cod) {
        ArrayList<String> docent;
        docent = DocenteBUSS.obtenerNombreDocenteAccion(cod);
        return docent;
    }

    public boolean llenarTablaTarea(String descripcionTarea, Date fechaIni, Date fechaFinal, String recursos, String costos, String idDocen, String idAccion) {
        return TareaBUSS.llenarTablaTarea(descripcionTarea, fechaIni, fechaFinal, recursos, costos, idDocen, idAccion);
    }

    public ArrayList<String> obtenerPlanAccion() {
        ArrayList<String> obPlan;
        obPlan=PlanAccionBUSS.obtenerPlanAccion();
        return obPlan;
    }

    public ArrayList<String> obtenerTareasDocente(String idDocente) {
        ArrayList<String> obTarea;
        obTarea=TareaBUSS.obtenerTareasDocente(idDocente);
        return obTarea;
    }

    public ArrayList<String> obtenerAnalisisXmatriz(String condicion) {
        ArrayList<String> obAnalisis;
        obAnalisis=AnalisisInternoBUSS.obtenerAnalisisXmatriz(condicion);
        return obAnalisis;
    }

    public ArrayList<String> obtenerTareasXaccion(String condicion) {
        ArrayList<String> dato;
        dato=TareaBUSS.obtenerTareasXaccion(condicion);
        return dato;
    }

    public boolean llenarTablaValoracionPlan(String tipoValoracion, String observacion, String idPlanAccion) {
        return PlanAccionBUSS.llenarTablaValoracionPlan(tipoValoracion,observacion,idPlanAccion);
    }

    

    
    
    
}
