/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.ejimenezr.a04;
import java.util.Scanner; 
/**
 *
 * @author elver
 */
public class SPPEJimenezRA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //desplegamos variables
        int opEntrada;
        double angulo, resultado;
        Scanner kb= new Scanner (System.in);
        
        //Desplegamos menu
        //Solicitamos operacion a realizar
        System.out.println("1. Calcular tangente del ángulo");
        System.out.println("2. Calcular seno del ángulo");
        System.out.println("3. Calcular coseno del ángulo");
        System.out.println("4. Salir");
        opEntrada=kb.nextInt();

        switch (opEntrada){
            case 1:
                System.out.println("Bienvenido al cálculo de la tangente");
                angulo= mensajePedirDatos();
                System.out.println("La tangente del ángulo es "+Math.tan(angulo));
                break;
            case 2:
                System.out.println("Bienvenido al cálculo del seno");
                angulo=mensajePedirDatos();
                System.out.println("El seno del ángulo deseado es "+ Math.sin(angulo));
                break;
            case 3:
                System.out.println("Bienvenido al cálculo del coseno");
                angulo=mensajePedirDatos();
                System.out.println("El coseno del ángulo deseado es "+ Math.cos(angulo));
                break;
            default:
                System.out.println("Adios guapa, o feo si eres hombre");
        }
    }
    static double mensajePedirDatos() {
        double angulo;
        Scanner kb= new Scanner (System.in);
        System.out.println("Introduce el ángulo deseado");
        angulo=kb.nextDouble();
        angulo=Math.toRadians(angulo);
        return angulo;
    }
    
}
