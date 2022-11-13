package Tarea1IWC70842;
import java.util.*;
import java.time.LocalDateTime;
/**
 * Primera tarea del modulo de Entornos de desarrollo
 *
 * @author JoseAntonioPozoGonzalez
 *
 */
public class Tarea1IWC70842
{
    public static void menu()    {
       
        Scanner input = new Scanner(System.in);
        String Texto;//Creo una cadena de texto con todo el enunciado de las opciones de menu.
        Texto = "Elija una opcion de las siguientes pulsando el numero deseado y enter:\n\nPulse 0 para salir y finalizar el programa.\n\nPulse 1 para introducir 2 números enteros y que se muestre por pantalla un mensaje indicando si un valor es mayor que el otro o si son iguales.\n\nPulse 2 para introducir una cadena de caracteres de longitud mayor de 1 carácter, junto a otro carácter,\ny el programa determina si el carácter está incluido en la cadena o no,mostrando un mensaje al usuario.\n\nPulse 3 para generar aleatoriamente el valor de una de las 5 vocales y que se muestre por pantalla dicho valor.\n\nPulse 4 para mostrar la fecha y hora actual, a través de un objeto java.time.LocalDatetim";
     
         System.out.println(Texto);
        String cadena = input.nextLine();
        //Para evitar problemas con lo introducido por teclado genero un try/catch para recoger la poible excepcion.
         
        
        try  {Integer.parseInt(cadena);}
        catch(Exception e){System.out.println("\nIntroduce un numero!!\n");
            menu();  }
       
        int eleccion=Integer.parseInt(cadena); 
        
       
       // A traves de un switch recojo las distintas opciones que llaman a su metodo.
        switch(eleccion){    
           
            case 0: System.out.println("\n fin del programa");
            break;
           
            case 1: mayoromenor();
            break;
           
            case 2: estamicaracter();
            break;
           
            case 3: vocalrandom();
            break;                
           
            case 4:{System.out.println ("\nLa fecha y hora actual son: \n");
                    LocalDateTime now = LocalDateTime.now();      
                    System.out.println(now);
                    System.out.println("\n");
                   
                    menu();}
                   
            break;
            default: System.out.println ("\nEleccion incorrecta, prueba de nuevo\n");
            menu();}
   
       
       
        }
   
    public static void mayoromenor(){//Metodo para calcular dados dos numeros si uno es mayor que el otro o son iguales
    Scanner input = new Scanner(System.in);    
    System.out.println("\n");
    System.out.println("Introduce dos numeros y te digo cual es el mayor o si son iguales");
    System.out.println("\nIntroduce el primer valor");
    int a = input.nextInt();
    System.out.println("\nIntroduce el segundo valor");
    int b = input.nextInt();
   
    if(a>b){
    System.out.println("\n"+a + " Es mayor que " + b);}else if(b>a){System.out.println("\n"+b + " Es mayor que " + a);}else{System.out.println("\n"+a + " " + b + " Son iguales");}
    System.out.println("\n");
    menu();    
    }  
   
    public static void estamicaracter(){//Metodo para buscar un caracter en una cadena
    Scanner input = new Scanner(System.in);    
    System.out.println("\n");
    System.out.println("Introduce una cadena de caracteres y te digo si el siguiente caracter que introduzcas estaba o no");
    System.out.println("\nIntroduce la cadena de caracteres:");
    String cadena = input.nextLine();
    System.out.println("\nIntroduce el caracter a buscar:");
    char c = input.next().charAt(0);
    boolean vampiroesiten= false;
   
    for (int i=0; i<cadena.length(); i++){
       
        if(cadena.charAt(i)==c){vampiroesiten=true;
         System.out.println("\n"+c + " estaba en la cadena de caracteres en la posicion" + (i+1));}}
         
 
   
        if(vampiroesiten==false){
        System.out.println("\n"+c + " no estaba en la cadena de caracteres");}
   
    System.out.println("\n");
    menu();
   
    }
   
    public static void vocalrandom(){// metodo para elegir una vocal al azar
    System.out.println("\n");
    String Vocales = (" aeiou");//Ojo al detalle del espacio en blanco antes de las vocales
    int numero = (int)(Math.random()*5+1);
    System.out.println("Una vocal al azar como por ejemplo la '" +Vocales.charAt(numero)+"'");    
    System.out.println("\n");
    menu();
    }
   
    public static void main (String []Args){
   
       
        menu();
       
   
    }
}