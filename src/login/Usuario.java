/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

public class Usuario {
    private String usuario;
    private String contrasenia;
    
    private final int MAX=8;
    private final int MIN_Uppercase=1;
    private final int MIN_Lowercase=1;
    private final int NUM_Digits=2;   
    private final int Special=1;
    private int uppercaseCounter=0;
    private int lowercaseCounter=0;
    private int digitCounter=0;
    private int specialCounter=0;
    
    public Usuario(String usuario, String contrasenia) throws Exception{
        if(!verificarcontrasenia(contrasenia)){
            throw new ContraseniaException("La contrasenia no es valida");
        }
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }
    
    public boolean verificarcontrasenia(String contrasenia){
        
        String password = contrasenia;
        for (int i=0; i < password.length(); i++ ) {
            char c = password.charAt(i);
            if(Character.isUpperCase(c)) 
                uppercaseCounter++;
            else if(Character.isLowerCase(c)) 
                lowercaseCounter++;
            else if(Character.isDigit(c)) 
                digitCounter++;     
            if(c>=33&&c<=46||c==64){
                specialCounter++;
            }
                    
        }
             
        return password.length() >= MAX && uppercaseCounter >= MIN_Uppercase && lowercaseCounter >= MIN_Lowercase && digitCounter >= NUM_Digits && specialCounter >= Special;
        
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }
    
    
}

