
package codificacion.de.clase;

import java.util.Scanner;


public class persona {
  
    imprimir impri =new imprimir();
   
    
    
    Scanner entrada =new Scanner (System.in);
    public String nombre;
     public String direccion;
     public String INE;

    

    public String getNombre() {
        return nombre=nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getINE() {
        return INE;
    }

    public void setINE(String INE) {
        this.INE = INE;
    }

    private static class imprimir {

       
    }
     
 
    public void mostrar1 (){
      
        System.out.println("Ingrese su nombre");  
      nombre=entrada.nextLine();
      
            System.out.println("Ingrese su direccion"); 
       direccion=entrada.nextLine();
       
                  System.out.println("Ingrese su INE");  
                  INE=entrada.nextLine();
                  
            System.out.println("Sus datos son  Nombre: "+nombre+"\n"+"Direccion: "+direccion+"\n"+"INE: "+INE+"\n");       
                  
    }
}
