/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int select = -1;

        while (select != 0) {
            try {
                System.out.println("\nLOG IN");
                System.out.println("Elige una opción:\n1.- Ingresar Usuario"
                        + "\n2.- Iniciar Sesión\n"
                        + "0.- Salir");
                System.out.print("Opción:");
                select = teclado.nextInt();

                switch (select) {
                    case 1:
                        Scanner n_usuario = new Scanner(System.in);
                        System.out.println("\nREGISTRO");
                        System.out.print("Ingrese el nombre del nuevo ususario: ");
                        String n_nombre = n_usuario.nextLine();

                        System.out.print("Ingrese la contrasenia del nuevo usuario: ");
                        String n_contrasenia = n_usuario.nextLine();

                        ListaUsuarios.agregarUsuario(new Usuario(n_nombre, n_contrasenia));
                        break;
                    case 2:
                        Scanner usuario = new Scanner(System.in);
                        System.out.println("\nINICIO DE SESIÓN");
                        System.out.print("Ingrese el nombre del ususario: ");
                        String nombre = usuario.nextLine();

                        System.out.print("Ingrese la contrasenia del usuario: ");
                        String contrasenia = usuario.nextLine();

                        new InicioSesion(nombre, contrasenia);
                        break;
                    case 0:
                        System.out.println("Ha salido del sistema");
                        break;
                    default:
                        System.out.println("Opción Incorrecta");
                        break;
                }

                System.out.println("\n");

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

}
