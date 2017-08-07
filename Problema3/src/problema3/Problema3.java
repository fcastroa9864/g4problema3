/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author FREDY CASTRO
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws IOException {
        // TODO code application logic here
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese Numeros: ");
        String s = br.readLine();
        
        String[] splitStr = s.split("\\s+");
        
        if(Integer.parseInt(splitStr[0])>=1&&Integer.parseInt(splitStr[0])<=100) {
        	if(Integer.parseInt(splitStr[1])>=1&&Integer.parseInt(splitStr[1])<=100) {
	        	int suma = Integer.parseInt(splitStr[0])+ Integer.parseInt(splitStr[1]);
	            System.out.println("Resultado: "+suma);
        	}else {
            	System.out.println("Valores Incorrectos: "+Integer.parseInt(splitStr[1]));
            }
        }
        else {
        	System.out.println("Valores Incorrectos: "+Integer.parseInt(splitStr[0]));
        }
    
    }
    
}
