/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package financiero;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Cuenta {
    //Declaramos los atributos  
    private int numero;
    private char tipo;
    private double saldo;
    
    
    //COnstructor
    public Cuenta(){
        this.numero = 1000;
        this.tipo = 'a';
        this.saldo = 50;
        
    }

    //Constructor
    public Cuenta(int numero, char tipo, double saldo) {
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
    }
    
   //Metodos Getter and setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    
    
    
    //metodo crear Cliente donde ingresamos los clientes
    public void crearCuenta(){
        //
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de cuenta del cliente:");
        this.numero = scanner.nextInt();

        System.out.println("Ingrese tipo del cliente en categoria a:");
        String input = scanner.next();

        System.out.println("Ingrese el saldo del cliente:");
        this.saldo = scanner.nextDouble();

        System.out.println("¡Transaccion exitosa");
    }
    
   
    //Metodo para mostrar el cliente
    public void mostrarCuenta(){
        System.out.println("Cuenta No. : " + this.numero +
                "Tipo: "+this.tipo +
                "Saldo: "+this.saldo);
    }
}
