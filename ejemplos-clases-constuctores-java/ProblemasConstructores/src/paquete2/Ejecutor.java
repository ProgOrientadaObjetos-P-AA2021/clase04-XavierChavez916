/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
        */
        
        
        System.out.println("Ingresar el nombre del hospital");
        String nom = entrada.nextLine();
        System.out.println("Ingrese la ciudad en donde esta el hospital");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese el numero de Doctores del hospital");
        int numDoc = entrada.nextInt();
        System.out.println("Ingrese el numero de Enfermeros del hospital");
        int numEnfe = entrada.nextInt();
        
        Hospital hosp = new Hospital(nom, ciudad, numDoc, numEnfe);
        System.out.printf("%s\n", hosp);
        
        
        
        
        
    }
}
