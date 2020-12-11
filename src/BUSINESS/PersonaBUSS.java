 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUSINESS;

import DAO.DocenteDAO;
import DAO.PersonaDAO;
import DAO.PrivilegioDAO;
import DTO.AdministradorDTO;
import DTO.DocenteDTO;
import DTO.PersonaDTO;
import java.util.ArrayList;

/**
 *
 * @author ESTUDIANTE
 */
public class PersonaBUSS {

    public PersonaBUSS(){
    }
    
    //arreglado
    static ArrayList<String> buscarPrivilegiosBuss(String usu, String pass, String rol) {
        PersonaDTO persona = new PersonaDTO(usu,pass,rol);
        persona=PersonaDAO.validarPersona(persona);
        return PrivilegioDAO.cargarPrivilegios(persona);
    }
    
    //arreglado
    static ArrayList<String> validarUsuario(String codigo, String email) {
        ArrayList<String> validado = new ArrayList<>();
        
        PersonaDTO valiPerson = new PersonaDTO(codigo, email);
        valiPerson= PersonaDAO.validarUsuario(valiPerson);
        
        validado.add(valiPerson.getIdPersona());
        return validado;
    }
    
    //arreglado
    static boolean actualizarPassword(String id,String pass) {
        PersonaDTO actuPerson = new PersonaDTO(id, pass);
        return PersonaDAO.actualizarPassword(actuPerson);
    }
    
    //arreglado
    static ArrayList<String> obtenerDatosPersona(String id) {
        ArrayList<String> respuesta = new ArrayList<>();
        
        PersonaDTO person = new PersonaDTO(id);
        person= PersonaDAO.obtenerDatosPersona(person);
        
        respuesta.add(person.getIdPersona()+"/"+person.getNombre()+"/"+person.getApellido()+"/"+
                person.getCedula()+"/"+person.getTelefono()+"/"+person.getEmail()+"/"+person.getUsuario()+"/"+
                person.getPassword()+"/"+person.getCodigoSeguridad());
        
        return respuesta;
    }
    
    //Arreglado
    static ArrayList<String> obtenerTodos() {
        ArrayList<PersonaDTO> todo = new ArrayList<>();
        
        ArrayList<String> integrado = new ArrayList<>();
        
        todo = PersonaDAO.obtenerTodos();
        
        for (PersonaDTO per : todo){
            String datos = per.getIdPersona()+"/ "+per.getNombre()+"/ "+per.getApellido()+"/ "+per.getCedula()
                    +"/ "+per.getTelefono()+"/ "+per.getEmail()+"/ "+per.getUsuario()+"/ "+per.getPassword()
                    +"/ "+per.getCodigoSeguridad();
            integrado.add(datos);
        }
        
        return integrado;
      
    }
    
    //arreglado
    static ArrayList<String> consultaIDPersonaRol(String persona, String rol) {
        ArrayList<String> consul = new ArrayList<>();
        
        PersonaDTO perConsulta = new PersonaDTO(persona,rol);
        perConsulta= PersonaDAO.consultaIDPersonaRol(perConsulta);
        
        consul.add(perConsulta.getIdPersona()+"/" + perConsulta.getRol());
        return consul;
    }

    //arreglado
    static boolean añadirUsuarioPersona(String nombre, String apellido, String cedula, String telefono, String correo, String usuario, String password, String codigoSeguridad) {
        PersonaDTO AñadirPerso = new PersonaDTO(nombre,apellido,cedula,telefono,correo,usuario,password,codigoSeguridad);
        return PersonaDAO.añadirUsuarioPersona(AñadirPerso);
    }
    
    //Arreglado
    static boolean actualizarUsuarioPersona(String nombre, String apellido, String cedula, String telefono, String correo, String usuario, String password, String id) {
        PersonaDTO actuaPersona = new PersonaDTO(nombre, apellido, cedula, telefono, correo, usuario, password, id);
        return PersonaDAO.actualizarUsuarioPersona(actuaPersona);
    }
    
    //Arreglado
    static boolean eliminarUsuario(String valor) {
        PersonaDTO elimiPer = new PersonaDTO(valor);
        return PersonaDAO.eliminarUsuario(elimiPer);
    }
    
    //Arreglado
    static ArrayList<String> consultaPersonaCargo() {
        ArrayList<PersonaDTO> consulta = new ArrayList<>();
        ArrayList<String> integrado = new ArrayList<>();
        
        consulta = PersonaDAO.consultaPersonaCargo();
        
        for (PersonaDTO per : consulta){
            String datos = per.getUsuario()+"/"+per.getPassword()+"/"+per.getRol();
            integrado.add(datos);
        }
        
        return integrado;
      
    }
    
}
