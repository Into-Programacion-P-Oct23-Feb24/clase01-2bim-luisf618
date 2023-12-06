/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author reroes
 */
public class Ejemplo03 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite;
        String cadenaReporte = "";
        String nombre;
        String posicion;
        int edad;
        double estatura;
        System.out.println("Cuantos jugadores desea ingresar");
        limite = entrada.nextInt();
        for (int i = 1; i <= limite; i++) {
            System.out.printf("Ingrese el nombre del jugador %s:\n",
                    i);
            entrada.nextLine();
            nombre = entrada.nextLine();
            System.out.printf("Ingrese la posición del jugador %s:\n",
                    i);
            posicion = entrada.nextLine();
            System.out.printf("Ingrese la edad del jugador %s:\n",
                    i);
            edad = entrada.nextInt();
            System.out.printf("Ingrese la estatura del jugador %s:\n",
                    i);
            estatura = entrada.nextDouble();
            cadenaReporte = String.format("%s%d. %s -%s-, edad %d,"
                    + " estatura %.2f\n",
                    cadenaReporte,
                    i,
                    nombre,
                    posicion,
                    edad,
                    estatura);
        }
        System.out.printf("%s", cadenaReporte);
    }
}
