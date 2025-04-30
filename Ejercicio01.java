// 2J Daniel Ruiz Juez y Marta Jumilla Antón



import java.util.Scanner;

public class Ejercicio01 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int numEntrada = 0;

        do {
            System.out.println("Introduce el código de la entrada: ");
            numEntrada = sc.nextInt();
            if(!comprobarEntrada(numEntrada)){
                System.out.println("Código de la entrada incorrecto.");
            }
        } while (!comprobarEntrada(numEntrada));

        calcularCodigoVerificacion(numEntrada);
        System.out.println("El código de verificacion es: " + calcularCodigoVerificacion(numEntrada));
    }


    public static boolean comprobarEntrada(int numEntrada){
        int contCifras=0;
        int aux=numEntrada;

        //comprobar rango de numero
        if(numEntrada < 1 || numEntrada > Math.pow(10, 18)){
            return false;
        }

        //comprobar que tiene nº de cifras par
        while(aux!=0){
            aux/=10;
            contCifras++;
        }

        if(contCifras % 2 !=0){
            return false;
        }

        return true;
    }

    //comprobar nº verificacion
    public static int calcularCodigoVerificacion(int numeroEntrada) {
        int contCifras = 0;
        int aux = numeroEntrada;

        while (aux != 0) {
            aux /= 10;
            contCifras++;
        }

        int[] arrayCifras = new int[contCifras];


        aux = numeroEntrada;
        int cifra = 0;

        for (int i = contCifras - 1; i >= 0; i--) {
            cifra = aux % 10;
            arrayCifras[i] = cifra;
            aux /= 10;

        }

        int sumatorio=0;
        int mayor=0;
        int menor=0;
        for(int i=0; i< arrayCifras.length; i++){
            
            boolean esPar;
            if(arrayCifras[i] %2 == 0 ){
                esPar = true;
            } else {
                esPar =false;
            }

            if(esPar){
                for(int j = 0; j < i; j++){
                    if(mayor <= arrayCifras[i]){
                        mayor=arrayCifras[i];
                    }
                }

                sumatorio += (arrayCifras[i] *2) + mayor;
            }
            else {

                for(int j = i+1; j < arrayCifras.length; j++){
                    if(menor >= arrayCifras[i]){
                        menor= arrayCifras[i];
                    }
                }
                sumatorio += (arrayCifras[i] *3) +menor;
            }


        }

        return sumatorio;
    }
}
