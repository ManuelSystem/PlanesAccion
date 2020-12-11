/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUSINESS;

import DAO.RequerimientoDAO;
import DAO.RolDAO;
import DAO.PersonaDAO;
import DAO.PrivilegioDAO;
import DAO.RolPersonaDAO;
import java.util.ArrayList;

/**
 *
 * @author Braro
 */
public class BussSistema {
    
    public BussSistema(){ 
    }

    //Todo arreglado
    
    static ArrayList<String> cargarRolesBuss() {
        ArrayList<String> rolesBuss;
        rolesBuss=RolDAO.obtencionRoles();
        return rolesBuss;
    }

    static boolean aggNuevoRol(String rol) {
        return RolDAO.aggNuevoRol(rol);
    }
    
    static ArrayList<String> validarRol(String rol) {
        ArrayList<String> validar;
        validar = RolDAO.validarRol(rol); 
        return validar;
    }
    
    static ArrayList<String> cargarRequimientos() {
        ArrayList<String>obteneRequerimiento;
        obteneRequerimiento = RequerimientoDAO.cargarRequimientos();
        return obteneRequerimiento;
    }

    static boolean insertarRolPersona(String idPersona, String idRol) {
        return PersonaDAO.insertarRolPersona(idPersona, idRol);
    }
    
    static ArrayList<String> obtenerRolPersona(String rol, String per) {
        ArrayList<String> obt;
        obt = RolPersonaDAO.obtenerRolPersona(rol, per);
        return obt;
    }
    
    static boolean insertarPrivilegios(String idRoPer, String idReq) {
        return PrivilegioDAO.insertarPrivilegios(idRoPer, idReq);
    }
    
    static ArrayList<String> obtenerIdRequerimiento(String nom) {
        ArrayList<String> obtReq;
        obtReq = RequerimientoDAO.obtenerIdRequerimiento(nom);
        return obtReq;
    }
    
}
