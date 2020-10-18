
package u2ejercicio1;
public class procesos {
 

  //FACTORIAL
   
    public int factorial(int n){
        if (n>0){
        int res = n*factorial(n-1); 
        return res;
        }        
     return 1;
   }
   
   //DEL 1-10
    public  int numeros(int n){
       if (n==11){
            return 10;
        }
        else{
         System.out.print(n);System.out.print(" ");
         }
         return  numeros(n+1);   

   }
   
    //SERIE FIBONACCI
    public int Fibonacci(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
           return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
    
    
    // TRIANGULO DE NUMEROS
         public void numeros2(int n){
      if (n > -1) {
          for (int i = 0; i <= n; i++) {
                System.out.print(" "+i);
          }
                 System.out.println(" ");
            numeros2(n - 1);
   }
  }
        
//PALINDROMO         
 public boolean palidromos(String palabra, int inicio, int fin) {
     if(inicio<palabra.length()){
        if (palabra.charAt(inicio) == palabra.charAt(fin)){ 
      return palidromos(palabra, inicio +1, fin-1);}
      else {
       System.out.println("no es palidromo");      
      return false;
        }    
       } 
 System.out.println("Es palidromo");          
return true; 
 }
}
