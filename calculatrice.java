import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.nio.charset.Charset;

/**
 * Décrivez votre classe calculatrice ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class calculatrice
{
    private double x;
    private String choix;
    private String choix2;
    
    public static void calcul(){
        String choix2 ="1";
        String choix="";
        System.out.println("veuillez entrer un nombre");
            Scanner scan1 = new Scanner(System.in);
            String strx = scan1.nextLine();
            int x = Integer.parseInt(strx);
            
        while(choix2.equals("1")){  
            Scanner scan = new Scanner(System.in);
            System.out.println("quel type de opérateur voulez vous utiliser ? x + - /");
            choix = scan.nextLine();
                      
                if(choix.equals("x")){
                    System.out.println("veuillez entrer un nombre");
                    Scanner scan2 = new Scanner(System.in);
                    String strnombre = scan2.nextLine();
                    int nombre = Integer.parseInt(strnombre);
                    x = x*nombre;
                    System.out.println("le nombre est de : " + x);
                    Scanner scan4 = new Scanner(System.in);
                    System.out.println("voulez vous terminer ? 0: oui / 1: non");
                    choix2 = scan4.nextLine();
                }
                if(choix.equals("+")){
                    System.out.println("veuillez entrer un nombre");;
                    Scanner scan2 = new Scanner(System.in);
                    String strnombre = scan2.nextLine();
                    int nombre = Integer.parseInt(strnombre);
                    x = x + nombre;
                    System.out.println("le nombre est de : " + x);
                    Scanner scan4 = new Scanner(System.in);
                    System.out.println("voulez vous terminer ? 0: oui / 1: non");
                    choix2 = scan4.nextLine();
                }
                if(choix.equals("-")){
                    System.out.println("veuillez entrer un nombre");
                    Scanner scan2 = new Scanner(System.in);
                    String strnombre = scan2.nextLine();
                    int nombre = Integer.parseInt(strnombre);
                    x = x - nombre;
                    System.out.println("le nombre est de : " + x);
                    Scanner scan4 = new Scanner(System.in);
                    System.out.println("voulez vous terminer ? 0: oui / 1: non");
                    choix2 = scan4.nextLine();
                }
                if(choix.equals("/")){
                    try{
                    System.out.println("veuillez entrer un nombre");
                    Scanner scan2 = new Scanner(System.in);
                    String strnombre = scan2.nextLine();
                    int nombre = Integer.parseInt(strnombre);
                    x = x / nombre;
                    System.out.println("le nombre est de : " + x);
                    Scanner scan4 = new Scanner(System.in);
                    System.out.println("voulez vous terminer ? 0: oui / 1: non");
                    choix2 = scan4.nextLine();
                }catch(ArithmeticException e){System.out.println(e.toString());}
            }
            }
        
        }
        

    
}
