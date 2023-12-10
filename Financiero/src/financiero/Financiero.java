/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package financiero;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Financiero {

     public static void main(String[] args) {
        
        
        Cuenta cuenta=new Cuenta();
        
        //Nos permite leer datos desde una clase
        Scanner scanner = new Scanner(System.in);
        
        //inicializamos la variable  para las opciones
        int op;

        //Utilizamos la sentencia do while para que sea repetitivo
        do {
            //Imprimimos las opciones 
            System.out.println("Nombres del Estudiante");
            System.out.println("Pedro Valverde");
            System.out.println("\n--- Menú ---");
            System.out.println("1. Crear Cuenta");
            System.out.println("2. Mostrar Cuenta");
            System.out.println("0. Salir");
            System.out.println("Ingrese la opción deseada:");

            //ingresamos el valor de tipo entero 
            op = scanner.nextInt();

            //sentencia switch para hacer multiples comparaciones
            switch (op) {
                case 1:
                    //Usamos el metodo Crear Cuenta
                    cuenta.crearCuenta();
                    break;
                case 2:
                    //Usamos el metodo Mostara Cuenta
                    cuenta.mostrarCuenta();
                    break;
                
                case 0:
                    System.out.println("¡Muchas gracias!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (op != 0);
    }
        //Instancia un objeto C y llama al constructor
       /*Cuenta c1=new Cuenta();
        
    **Instancia un objeto C2 y lla a al constructor (int, char, double)
        Cuenta c2 = new Cuenta(101,"a",100);
        c1.mostrarCuenta();
        c2.mostrarCuenta();*/
    
}
