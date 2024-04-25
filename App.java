import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    
public static int cociente (int a, int b ) {
    return a/b ;
}
public static void main(String[] args) throws Exception {

    Scanner leer= new Scanner (System.in);
    
    boolean continuar= true ; 

    int cont=0 ;

    do {
        try {
        System.out.println("Ingrese numerador");
        int a= leer.nextInt(); 

        System.out.println("Ingrese denominador ");
        int b= leer.nextInt(); 

        System.out.println("Su resultado es "+ cociente(a, b)); 

        continuar= false; 
        
        } catch (InputMismatchException inputMismatchException) {

            System.out.println(inputMismatchException);
            leer.nextLine(); 
            System.out.println("Ingrese numeros enteros, vuelvalo a hacer ");
           
        } catch (ArithmeticException arithmeticException) {

            System.out.println(arithmeticException);
            System.out.println("No se puede dividir por cero");
        } finally {

            System.out.println("Fallaste pa");
            cont++;
            if (cont==3) {
                continuar=false;
                
            }
        }
    } while (continuar);  

    leer.close();
    }
}


//Tarea:Permitir tres errores.