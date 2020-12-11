/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.AdministradorDTO;
import DTO.PersonaDTO;
import Util.Database;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ESTUDIANTE
 */
public class PersonaDAO {

    public static PersonaDTO validarPersona(PersonaDTO persona) {
        
        String dato, prueba;
        ArrayList<String> datoPer, nuevo;
        
        try {
       
            String sql="SELECT idRolPersona FROM rolpersona as rp, persona WHERE rp.idPersona=persona.idPersona AND"
                    + " persona.usuario='"+persona.getUsuario()+"' AND persona.password='"+persona.getPassword()+"' AND"
                    + " rp.idRol=(SELECT idRol FROM rol WHERE nombre='"+persona.getRol()+"')";  
            datoPer=Database.getSQL(sql);
            
            dato=datoPer.toString();
            dato=dato.replace("[", "");
            dato=dato.replace("]", "");
            dato=dato.replace("/", "");
            
            persona.setRol(dato); 
            
            
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }

        return persona;
    }

    public static boolean actualizarPassword(PersonaDTO actuPerson) {
        
        String sql = "";
        
        try {
            sql = "UPDATE persona SET password='"+actuPerson.getEmail()+"' WHERE idPersona="+actuPerson.getCodigoSeguridad()+"";
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return Database.ejecutarActualizacionSQL(sql);
        
    }

    public static boolean insertarRolPersona(String idPersona, String idRol) {
        String sql = "";
        
        try {
            sql = "INSERT INTO rolpersona (idRol, idPersona) VALUES("+idRol+", "+idPersona+")";
            System.out.println(sql);
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return Database.ejecutarActualizacionSQL(sql);
    }

    //<----------------------------------------------------------aqui----------------------------------------------->
    //arreglados con dto
    
    public static PersonaDTO obtenerDatosPersona(PersonaDTO person) {
        ArrayList<String> dato;
        try {
       
            String sql = "SELECT * FROM persona WHERE usuario='"+person.getIdPersona()+"'";
            dato=Database.getSQL(sql);
            
            String separado = dato.toString();
        
            String[] pars = separado.split("/");
            
            person.setIdPersona(pars[0].replace("[", ""));
            person.setNombre(pars[1]);
            person.setApellido(pars[2]);
            person.setCedula(pars[3]);
            person.setTelefono(pars[4]);
            person.setEmail(pars[5]);
            person.setUsuario(pars[6]);
            person.setPassword(pars[7]);
            person.setCodigoSeguridad(pars[8]);
            
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }

        return person;
    }

    public static PersonaDTO validarUsuario(PersonaDTO valiPerson) {
        
        ArrayList<String> dato = new ArrayList<>();
        
        try {
            String sql = "SELECT idPersona FROM persona WHERE codigoSeguridad='"+valiPerson.getCodigoSeguridad()+"' "
                    + "AND Email='"+valiPerson.getEmail()+"'";
            dato=Database.getSQL(sql);
            
            String separado = dato.toString();
            String[] pars = separado.split("/");
            
            valiPerson.setIdPersona(pars[0].replace("[", "").replace("]", ""));
            
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return valiPerson;
 
    }

    public static ArrayList<PersonaDTO> obtenerTodos() {
        
        ArrayList<PersonaDTO> p = new ArrayList<PersonaDTO>();
        ArrayList<String> dato = new ArrayList<String>();
        
        try {
            String sql = "SELECT * FROM persona";
            dato = Database.getSQL(sql);
            
            if(dato!= null){
                for(String campos : dato){
                    
                    String[] row = campos.split("/");
                    PersonaDTO person = new PersonaDTO(row[0], row[1], row[2], row[3], row[4], 
                            row[5], row[6], row[7], row[8]);
                    p.add(person);
                }
            }
            
        } catch (Exception e) {
            System.err.println("SQL Error dao: " + e.getMessage());
        }
        
        return p;
        
    }

    public static PersonaDTO consultaIDPersonaRol(PersonaDTO perConsulta) {
         
        
        ArrayList<String> consulta = new ArrayList<>();
        try {
            String sql="SELECT idPersona, idRol FROM persona as person, rol as rl WHERE "
                    + "person.Nombre='"+perConsulta.getIdPersona()+"' AND rl.nombre='"+perConsulta.getRol()+"'";
            consulta = Database.getSQL(sql);
            
            String separado = consulta.toString();
            String[] pars = separado.split("/");
            perConsulta.setIdPersona(pars[0]);
            perConsulta.setRol(pars[1]);
            
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return perConsulta;
    }

    public static boolean añadirUsuarioPersona(PersonaDTO AñadirPerso) {
         
        String sql = "";
        
        try {
            sql = "INSERT INTO persona (Nombre,Apellido,Cedula,Telefono,Email,usuario,password,codigoSeguridad)"
                    + " VALUES ('"+AñadirPerso.getNombre()+"','"+AñadirPerso.getApellido()+"','"
                    +AñadirPerso.getCedula()+"','"+AñadirPerso.getTelefono()+"','"+AñadirPerso.getEmail()+"','"
                    +AñadirPerso.getUsuario()+"','"+AñadirPerso.getPassword()+"','"+AñadirPerso.getCodigoSeguridad()+"')";
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return Database.ejecutarActualizacionSQL(sql);
    }
    
    public static boolean actualizarUsuarioPersona(PersonaDTO actuaPersona) {
        String sql = "";
        
        try {
            sql = "UPDATE persona SET Nombre='"+actuaPersona.getNombre()+"', Apellido='"+actuaPersona.getApellido()+"', "
                    + "Cedula='"+actuaPersona.getCedula()+"', "
                    +"Telefono='"+actuaPersona.getTelefono()+"', Email='"+actuaPersona.getEmail()+"', "
                    + "usuario='"+actuaPersona.getUsuario()+"', password='"+actuaPersona.getPassword()+"' "
                    + "WHERE idPersona="+actuaPersona.getCodigoSeguridad()+"";
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return Database.ejecutarActualizacionSQL(sql);
    }

    public static boolean eliminarUsuario(PersonaDTO elimiPer) {
        String sql = "";
        
        try {
            sql = "DELETE FROM persona WHERE idPersona="+elimiPer.getIdPersona()+"";
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return Database.ejecutarActualizacionSQL(sql);
    }

    public static ArrayList<PersonaDTO> consultaPersonaCargo() {
        ArrayList<PersonaDTO> p = new ArrayList<PersonaDTO>();
        ArrayList<String> dato = new ArrayList<String>();
        
        try {
            String sql = "SELECT p.idPersona, p.Nombre, r.nombre FROM persona as p, rol as r, rolpersona rolp WHERE "
                    + "rolp.idRol=r.idRol AND rolp.idPersona=p.idPersona AND R.nombre='Docente'";
            dato=Database.getSQL(sql);
            
            if(dato!= null){
                for(String campos : dato){
                    String[] row = campos.split("/");
                    PersonaDTO person = new PersonaDTO(row[0], row[1], row[2]);
                    p.add(person);
                }
            }
        } catch (Exception e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        
        return p;
    }

    

   

    }
