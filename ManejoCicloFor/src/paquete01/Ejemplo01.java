/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadenaFinal = "";
        for (int i = 1; i <= 10; i++) {
            cadenaFinal = String.format("%s%d",
                    cadenaFinal,i);
        }
        // Usamos el String.format para acumular cadenas y presentar varias
        // cadenas al final de cualquier proceso
        for (int i = 1; i < 11; i++) {
            cadenaFinal = String.format("%s%d",
                    cadenaFinal,i);
        }
        System.out.printf("%s",cadenaFinal);
    }

}
