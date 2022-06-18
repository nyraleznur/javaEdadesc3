package edades;

import java.util.Scanner;

 public class Edades {
    public static void main(String[] args) {
     /* 0 a 5 Niños pequeños
        6 a 12 Niños grandes
        13 a 17 Adolescente
        18 a 65 Adulto
        66 a 100 Adulto mayor*/
        Scanner opc=new Scanner(System.in);
        int edad;
        String genero;
        System.out.print("Digite la edad ");
        edad=opc.nextInt();
        System.out.print("Digite M si es mujer o H si es hombre");
        genero=opc.next();
        if(edad>=0){
            if( edad <=5){
                if(genero.equalsIgnoreCase("M")){
                  System.out.println("Es una niña pequeño");  
                }
                else if(genero.equalsIgnoreCase("H")){
                    System.out.println("Es un niño pequeño");
                }
                else{
                    System.out.print("Digitó un género incorrecto");
                }
                
                
            }
            else if(edad<=12 ){
                System.out.println("Es un niño grande");

            }
            else if( edad<=17){
                System.out.println("Es un adolescente ");
            }
            else if(edad<=65){
                System.out.print("Es un adulto");
            }

            else if(  edad<=100){
                System.out.print("Es un adulto mayor ");
            }
            else{
                System.out.print("Usted digito una edad fuera de el rango ");
            }
        
         }
         else{
             System.out.print("Digitó una edad negativa ");
         }
        
    }   
}
