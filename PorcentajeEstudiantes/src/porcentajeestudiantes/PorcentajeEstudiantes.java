/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porcentajeestudiantes;

/**
 *
 * @author JuanJ
 */
public class PorcentajeEstudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float porcentaje = 0;
        int estudiantes = 240;
        int menores = 35;
        
        porcentaje = (menores*100)/estudiantes;
        
        System.out.println("El numero total es de " + estudiantes + " estudiantes.");
        System.out.println("El numero total de menores de edad es: " + menores + " estudiantes.");
        System.out.println("El Porcentaje de estudiantes en el curso Programacion II es: " + porcentaje + "%");
    }
    
}
