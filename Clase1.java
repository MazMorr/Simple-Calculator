import java.util.Scanner;

public class Clase1 {
    public static void main(String[] args){
        Scanner P = new Scanner(System.in);
        System.out.println("Bienvenido a mi calculadora en java"); 
        System.out.println("Quieres 1.Sumar, 2.Restar, 3.Dividir, 4. Multiplicar?");
        int metodo= P.nextInt();
        System.out.println("Introduzca su primer numero: ");
        int x = P.nextInt();
        System.out.println("Introduce el segundo numero que quieras sumar: ");
        int v = P.nextInt();
        if (metodo==1) {
            System.out.println("Tu suma da: " + (x+v));
        }
        if (metodo==2){
            System.out.println("Tu resta da: " + (x/v));
        }
        if (metodo==3){
            System.out.println("Tu división da: " +(x/v));
        }
        if (metodo==4){
            System.out.println("Tu multiplicación da: "+(x*v));
        }
    }
} 