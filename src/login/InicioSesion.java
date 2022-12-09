/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;


public class InicioSesion {
    
    
    
    public InicioSesion(String usuario, String contrasenia) throws InicioSesionException{
        
        
        if(!ListaUsuarios.getUsuarios().containsKey(usuario)){
            throw new InicioSesionException("El usuario no existe");
        }
        

         /*Sentencia correcta
        if(!ListaUsuarios.getUsuarios().get(usuario).equals(contrasenia)){
            throw new InicioSesionException("La contrasenia es incorrecta");
        }*/
        
        if(ListaUsuarios.getUsuarios().get(usuario).equals(contrasenia)){
            throw new InicioSesionException("La contrasenia es incorrecta");
        }
                      
        /*
        El error es el no validar correctamente la contraseña del usuario,
        por tanto, al intentar iniciar sesión, después de crear al usuario,
        validará el inicio de sesión con cualquier otra contraseña, excepto la correcta
        */
        
        System.out.println("Inicio de Sesion Correcta");
    }
    
    
    
    
}
