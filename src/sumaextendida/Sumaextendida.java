/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaextendida;

/**
 *
 * @author Emmanuel
 */
public class Sumaextendida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sumaextendida d= new Sumaextendida();
        d.repetitivo(39995);
    }
     public void repetitivo(int n){
    
        int a=n;
        int c=0;
       
        
        a=(int)a/10; //cociente 3467
        int b=n%10;  //residuo 8
        c=c+b;
        
        n=a;
        a=(int)a/10;  //cociente 346
        b=n%10;  // residuo 7
        c=c+b;
        
        n=a; 
        a=(int)a/10;   //cociente 34
        b=n%10;   // residuo 6
         c=c+b;
        
        n=a;
        a=(int)a/10;    //cociente 3
        b=n%10;      //residuo 4
         c=c+b;
        
        n=a;
        a=(int)a/10;    //cociente 0
        b=n%10;      // residuo 3
         c=c+b;
        
        
        
 
        
        
         
         System.out.println("la suma de los digitos es: " +c);
        
        
    }
}
