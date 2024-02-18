import java.util.Scanner;
public class SimpleCalculator {
    private static void CalculatorOptions(){
        Scanner P = new Scanner(System.in);
        System.out.println("Bienvenido a mi calculadora en java"); 
        System.out.println("Quieres 1.Sumar, 2.Restar, 3.Dividir, 4Multiplicar?");
        int metodo= P.nextInt();
        System.out.println("Introduzca su primer numero: ");
        double x = P.nextDouble();
        System.out.println("Introduce el segundo numero que quieras sumar: ");
        double v = P.nextDouble();
        switch (metodo){
            case 1:
                System.out.println("Tu suma da: "+(x+v));
                break;
            case 2:
                System.out.println("Tu resta da: "+(x-v));
                break;
            case 3:
                System.out.println("Tu división da: "+(x/v));
                break;
            case 4:
                System.out.println("Tu multiplicación da: "+(x*v));
                break;
            default:
                System.out.println("Ha introducido un carácter <No Admitido>, por favor intentelo de nuevo");
                break;
        }
        P.close();
    }
    public static void main(String[] args){
        CalculatorOptions();
    }
} 