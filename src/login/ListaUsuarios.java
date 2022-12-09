/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author LabP31018
 */
public class ListaUsuarios {
    
    private static HashMap<String, String> usuarios = new HashMap<String, String>();

    public static void agregarUsuario(Usuario usuario){
        usuarios.put(usuario.getUsuario(), usuario.getContrasenia());
        System.out.print("Usuario Ingresado con exito!");
    }

    public static HashMap<String, String> getUsuarios() {
        return usuarios;
    }
    
    
    
    
}
