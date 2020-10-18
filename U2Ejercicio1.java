package u2ejercicio1;

import java.util.Scanner;


public class U2Ejercicio1 {

    
    public static void main(String[] args) {
      procesos obj =new procesos();
      int aux = 0;
     int opc2=0;
     int opc;
     Scanner LECTOR = new Scanner(System.in);
       do{ 
        System.out.println("\n-------Menu------");
        System.out.println("1. Serie Fibonacci(21)");
        System.out.println("2. Mostrar del 1 al 10");
        System.out.println("3. Factorial");
        System.out.println("4. desaparecer numeros");
        System.out.println("5. Palindromos"); 
        System.out.println("4. Salir");
        opc=LECTOR.nextInt();
        switch(opc){    
            
        case 1:
        System.out.println("la serie fibonacci en la posicion (7): "+obj.Fibonacci(7));   
        break;
        
        case 2:
        obj.numeros(1);
        break;  
        
        case 3:
        int factorial=obj.factorial(5);
        System.out.println("total del factorial: "+factorial);
        break;
        
        case 4: 
         obj.numeros2(10);
        break; 
        
        case 5:
        Scanner lec = new Scanner(System.in);
        System.out.println("Introduce la palabra");
        String  palabra= lec.nextLine();
        System.out.println("¿Cuantas letras tienes tu palabra?");
        int  fin= lec.nextInt();
        fin=fin-1;
        int inicio=0;
        System.out.println(obj.palidromos(palabra,inicio,fin));

         break; 
         
        default:System.out.println("No existe esa opcion, por favor intente de nuevo");
        }
        
         System.out.println("\n¿Desea realizar otro proceso? presione 1=SI    2=NO");
       opc2=LECTOR.nextInt();
       }while(opc2!=2); 
    }
}
