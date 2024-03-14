package ejercicio02_calculos_aritmeticos;

import java.util.Scanner;

public class CalculosAritmeticos {

    public static void main (String[] args){

        //----------------------------------------------
        //          Declaración de variables
        //----------------------------------------------

        // Variables de entrada por teclado

        double numero1, numero2;

        // Variables de salida por consola

        double tripleNum1, decimaNum2, cuadradoDoble, tresCuartos, semiSuma, cuadradoSemisuma,cuadrupleDiferencia, mitadCuadrado;


        // Variables auxiliares

        double suma, multiplicacion, division;


        // Clase Scanner para la petición de datos de entrada por teclado
        Scanner teclado = new Scanner (System.in);

        //----------------------------------------------
        //                Entrada de datos
        //----------------------------------------------

        System.out.println("CÁLCULOS ARITMÉTICOS");
        System.out.println("--------------------");
        System.out.println("Introduzca dos números reales:");
        System.out.println("Primer número:");
        numero1 = teclado.nextDouble();
        System.out.println("Segundo número");
        numero2 = teclado.nextDouble();
        //-------------------------------------------------

        // 1. El triple del primer número.

        tripleNum1 = numero1 * 3;

        //-------------------------------------------------

        // 2. La décima parte del segundo número.

        decimaNum2 = numero2 / 10;


        //-------------------------------------------------
        // 3. El cuadrado del doble del producto de ambos números.

        // Primero multiplicamos y obtenemos el producto de ambos números
        multiplicacion = numero1*numero2;

        // Obtenemos el cuadrado del doble del producto
        cuadradoDoble = (multiplicacion*2)*(multiplicacion*2);

        // También se puede utilizar el método pow de la clase Math
        // cuadradoDoble = Math.pow(2 * (numero1 * numero2), 2);



        //-------------------------------------------------
        // 4. La mitad del cuadrado de la suma de ambos números.

        




        //-------------------------------------------------
        // 5. Tres cuartas partes del primer numero.


        //-------------------------------------------------
        // 6. Cuadrado de la semisuma de los dos números.


        //-------------------------------------------------
        // 7. Cuádruple de la diferencia entre ambos números.



        //-------------------------------------------------
        // 8. Mitad del cuadrado de la suma por la diferencia de ambos números.







        // CALCULO: TRES CUARTAS PARTES DEL PRIMER NUMERO

        division = numero1 / 4;
        tresCuartos = division * 3;

        // CUADRADO DE LA SEMISUMA DE LOS DOS NUMEROS

        //En primer lugar, realizamos la suma de los numeros

        suma = numero1 + numero2;

        // Después realizamos la división de la suma

        semiSuma = (suma/2)*(suma/2);

        // Otra manera de hacerlo:

        // semiSuma = suma/2;
        // cuadradoSemisuma = semiSuma*semiSuma;






        System.out.println("RESULTADO");
        System.out.println("----------");

        System.out.println("1. Triple del primer número: " + tripleNum1);

        System.out.println("2. La décima parte del segundo número: " + decimaNum2);

        System.out.println("3. El cuadrado del doble del producto de ambos números: " + cuadradoDoble);

        System.out.println("Tres cuartos del primer numero: " + tresCuartos);

        System.out.println("Cuadrado de la semisuma de los dos numeros: " + semiSuma);

    }
}
