/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;
import java.util.*;

/**
 *
 * @author Piter
 */
public class Ejercicio13 {
    
    private int n1=0, n2=1, n3, cant;
    
    public void cargarDatos(){
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("De cuantos numeros desea la serie?: ");
        cant=entrada.nextInt();
    }
    
    public void fibonacci(){
        System.out.print(n1+", "+n2+", ");
        
        for(int i=1; i<=cant; i++){
            
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+", ");            
        }
        
        //System.out.println();
    }


    
}
