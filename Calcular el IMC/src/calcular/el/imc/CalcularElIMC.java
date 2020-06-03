
package calcular.el.imc;

   import java.util.Scanner;
public class CalcularElIMC {

   //Creado por Baruch Reyes con aclaraciones de Raul 
    public static void main(String[] args) {
 Scanner entrada=new Scanner (System.in);  
    PERSONA e=new OPERACIONES();
    
     String nombre;
    int edad;
     String sexo;
     float peso;
     float  altura;
        
        System.out.println ("Hola ingresa tu nombre");
         
        nombre= entrada.nextLine();
        System.out.println ("Ingresa tu edad");
                edad= entrada.nextInt();
                 System.out.println (" Ingresa tu sexo  (FEMENINO,MASCULINO)");
              sexo=entrada.nextLine();
              sexo=entrada.nextLine();
              
        System.out.println (" Ingresa tu peso(en KG)");
        peso= entrada.nextFloat();
        
        System.out.println (" Ingresa tu altura(en MT)");
        altura =entrada.nextFloat();
        
    
      e.setNombre(nombre);
      e.setEdad(edad);
      e.setSexo(sexo);
      e.setPeso(peso);
      e.setAltura(altura);
      
      e.operaciones();
           
        
    }
    
}
