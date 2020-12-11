/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUSINESS;

import DAO.DocenteDAO;
import DTO.DocenteDTO;
import java.util.ArrayList;

/**
 *
 * @author Braro
 */
public class DocenteBUSS {
    
    public DocenteBUSS(){}
    
    static ArrayList<String> obtenerIdDocenteAccion(String nomb) {
        ArrayList<String> docen = new ArrayList<>();
        
        DocenteDTO obtDoc = new DocenteDTO(nomb);
        obtDoc = DocenteDAO.obtenerIdDocenteAccion(obtDoc);
        
        docen.add(obtDoc.getIdDocente());
        return docen;
    }
    
    static ArrayList<String> obtenerNombreDocenteAccion(String cod) {
        ArrayList<String> docenttt = new ArrayList<>();
        
        DocenteDTO obtDocen = new DocenteDTO(cod);
        obtDocen = DocenteDAO.obtenerNombreDocenteAccion(obtDocen);
        
        docenttt.add(obtDocen.getIdDocente());
        return docenttt;
    }
    
}
