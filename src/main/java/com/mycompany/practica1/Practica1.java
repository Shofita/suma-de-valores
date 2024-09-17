/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica1;

import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class Practica1 {

    public static void main(String[] args) {
        // Creamos una instancia de Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que ingrese el primer número
        System.out.print("Ingrese el primer número: ");
        // Leemos el primer número y lo guardamos en una variable
        int numero1 = sc.nextInt();

        // Pedimos al usuario que ingrese el segundo número
        System.out.print("Ingrese el segundo número: ");
        // Leemos el segundo número y lo guardamos en una variable
        int numero2 = sc.nextInt();

        // Calculamos la suma de los dos números
        int suma = numero1 + numero2;

        // Mostramos el resultado de la suma
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + suma);

        // Cerramos el Scanner para liberar los recursos
        sc.close();
    }
}