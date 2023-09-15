/*
 Author Anderson Garces Garcia - CC 1000889141 
*/

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        //Declaración de variables i
        int simulations = 1000; //Número de simulaciones
        int variance = 0; //Varianza
        List<Integer> results = new ArrayList<>(); //Lista de resultados
        DecimalFormat df = new DecimalFormat("#.000"); //Formato para numeros decimales
        

        //Simular 1000 caminatas aleatorias
        for (int i = 0; i < simulations; i++) {
            results.add(randomWalk());
        }

        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|                      RESULTADOS                             |");
        System.out.println("+-------------------------------------------------------------+");
        
        //Calculo de los resultados estadiscos
        double mean = (results.stream().mapToDouble(Integer::intValue).sum()) / simulations;
        System.out.println("| La media es: " + df.format(mean) + "                                          |");
        System.out.println("+-------------------------------------------------------------+");

        int minValue = Collections.min(results);
        System.out.println("| El valor mínimo es: " + minValue + "                                       |");
        System.out.println("+-------------------------------------------------------------+");
        
        int maxValue = Collections.max(results);
        System.out.println("| El valor máximo es: " + maxValue + "                                      |");
        System.out.println("+-------------------------------------------------------------+");


        for (Integer value : results) {
            variance += Math.pow((value - mean), 2);
        }

        variance /= results.size();
        double standarDeviation = Math.sqrt(variance); //Desviación estandar
        System.out.println("| La desviación estandar es: " + df.format(standarDeviation) + "                           |");
        System.out.println("+-------------------------------------------------------------+");
    }

    public static int randomWalk(){
        Random random = new Random(); //Objeto para generar valores aleatorios
        int currentePosition = 0; //Posicion actual
        int steps = 0; //Número de pasos

        //Simular una caminata aleatoria hasta que alcanze la posición inicial, en este caso (0)
        while(true){

            // Generar un número aleatorio (0 o 1), en este caso se tiene la misma probabilidad
            int coinFlip = random.nextInt(2); //0 = izquierda, 1 = derecha

            //Mover la posición actual según el resultado del numero generado anteriormente
            if (coinFlip == 0) {
                currentePosition = (currentePosition + 7) % 8; //Moverse a la izquierda
            }else{
                currentePosition = (currentePosition + 1) % 8; //Moverse a la derecha
            }

            //Incrementar el número de pasos
            steps++;

            // Si se alcanza la posición inicial, finalizar la caminata aleatoria
            if (currentePosition == 0) 
                break;
            
        }

        // Devolver el número de pasos de la caminata aleatoria
        return steps;
    }
}
