/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;
import java.util.Scanner;
/**
 *
 * @author stagiaire acs
 */
public class MyApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //  int x=13;
        //int y=2*x;
       // System.out.println("la valeur de x est " + x );
        //  System.out.println(x);
      //  System.out.println("Le double de x est :");
       // System.out.println(y);
       
       //String maVoiture="Renault";
       //String couleur="rouge";
        //System.out.println("la marque de ma voiture est " + maVoiture);
        //System.out.println("la couleur de ma voiture est " + couleur);
          //  System.out.println("ma voiture est donc une" +maVoiture +  couleur);
              
    System.out.println("tapez un nombre:");
    Scanner nombre=new Scanner(System.in);
    
    int n=nombre.nextInt();
    int m=2*n;
    System.out.print("Le double du nomre" + n + " est :" +m);
    }
    
}
