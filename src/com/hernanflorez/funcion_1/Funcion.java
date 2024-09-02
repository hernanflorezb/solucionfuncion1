package com.hernanflorez.funcion_1;
import java.util.Scanner;
public class Funcion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido al Programa de operaciones y Funciones");
        int play;
        do {
            System.out.println("Por favor selecciones una opcion");
            System.out.println("1. Sumar");
            System.out.println("2. Multiplicacion");
            System.out.println("3. Potencia");
            System.out.println("4. Factorial");
            System.out.println("5. Calcular area Cuadrado");
            System.out.println("6. Calcular area Circulo");
            System.out.println("7. Calcular el Volumen de un Cono");
            System.out.println("8. Mostrar los n numeros  de la serie  de Fibonacci");
            System.out.println("9. Salir");
            int list = leer.nextInt();
            switch (list) {
                case 1:
                    suma();
                    break;
                case 2:
                    multip();
                    break;
                case 3:
                    potencias();
                    break;
                case 4:
                    factori();
                    break;
                case 5:
                    area();
                    break;
                case 6:
                    circul();
                    break;
                case 7:
                    cono();
                    break;
                case 8:
                    fibonacci();
                    break;
                case 9:
                    System.out.println("Gracias por usar este programa");
                    break;
                default:
                    System.out.println("Opcion no Valida");
            }
            System.out.println("Quiere seguir operando, 1.SI 2.NO");
            play = leer.nextInt();
        } while (play == 1);
    }
    public static void suma() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese primer numero a sumar");
        int numerone = leer.nextInt();
        System.out.println("Por favor ingrese segundo numero a sumar");
        int numerotwo = leer.nextInt();
        int resuma = numerone + numerotwo;
        System.out.println("La suma es:" + resuma);
    }
    public static void multip() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese primer numero a multiplicar");
        int multione = leer.nextInt();
        System.out.println("Ingrese segundo numero a multiplicar");
        int multitwo = leer.nextInt();
        int resulmulti = 0;
        for (int i = 1; i <= multitwo; i++) {
            resulmulti = resulmulti + multione;
        }
        System.out.println("el numero multiplicado es:" + resulmulti);
    }
    public static void potencias() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de base");
        int base = leer.nextInt();
        System.out.println("Ingrese el numero de exponente");
        int exponente = leer.nextInt();
        int resulpotencia;
        int contador;
        contador = base;
        if (exponente==0) {
                System.out.println("el resultado es: 1");
        }else {
            for (int i = 2; i <= exponente; i++) {
                resulpotencia = 0;
                for (int j = 1; j <= contador; j++) {
                    resulpotencia = resulpotencia + base;
                }
                base = resulpotencia;
            }
            System.out.println("el resultado es:" + base);
        }
    }
    public static void factori() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Seccion para calculo de Numero Factorial");
        System.out.println("Ingrese el numero a operar");
        int numfact = leer.nextInt();
        int fact = 1;
        for (int i = 1; i <= numfact; i++) {
            fact = fact * i;
        }
        System.out.println("El Factorial de:" + numfact + "es:"+fact);
    }
    public static void area() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor Ingrese el radio");
        int lado = leer.nextInt();
        int area = areaCuadrado(lado);
        System.out.println("El area del cuadrado es:"+area);
    }
    public static int areaCuadrado(int lado) {
        return lado * lado;
    }

    public static void circul() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo: ");
        double radio = scanner.nextDouble();
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + areaCirculo);
    }
    public static void cono() {
        Scanner scanner = new Scanner(System.in);
        double volumenCono;
        System.out.println("Ingresa el radio del circulo: ");
        double radio = scanner.nextDouble();
        System.out.println("Ingresa la altura del cono: ");
        double alturaCono = scanner.nextDouble();
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        volumenCono=(alturaCono*areaCirculo)/3;
        System.out.println("El volumen del cono es: " + volumenCono);
    }
    public static void fibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el valor de la serie: ");
        int serie = scanner.nextInt();
        int numb1=0;
        int numb2=1;
        int suma=1;
        for (int i=1; i<=serie; i++){
            suma=numb1+numb2;
            numb1=numb2;
            numb2=suma;
            System.out.println("El valor de la serie es:"+suma);
        }
        System.out.println("El valor de la serie "+serie+" es:"+suma);
    }
}