package getset2;
import java.util.Scanner;

public class GetSet2 {

   
    public static void main(String[] args) {
     int j=1;
     int supri;
    String nombre;
String apellido;
int edad;
String nombre2;
String apellido2;
int edad2;
String nombre3;
String apellido3;
int edad3;
String nombre4;
String apellido4;
int edad4;
String nombre5;
String apellido5;
int edad5;
     Scanner entrada=new Scanner(System.in);
     Empleado e1=new Empleado();
     Empleado e2=new Empleado();
     Empleado e3=new Empleado();
     Empleado e4=new Empleado();
     Empleado e5=new Empleado();
     
     int opcion=0,opt;
     do{
     System.out.println("Bienvenido Seleccione lo que solicita hacer");
     System.out.println("1.-Ingresar Datos\t\t"+"2.-Modificar Datos\t\t"+"3.-Ver Datos");
     opt=entrada.nextInt();
     switch(opt){ 
         
         case 1:   
     System.out.println("Ingrese los Datos del Empleado "+j);
     System.out.println("Ingrese El nombre");
     nombre=entrada.nextLine();
     nombre=entrada.nextLine();
     System.out.println("Ingrese el Apellido");
     apellido=entrada.nextLine();
     System.out.println("Ingrese La Edad");
     edad=entrada.nextInt();
     e1.setNombre(nombre);
     e1.setApellido(apellido);
     e1.setEdad(edad);
     
     j++;
     System.out.println("Ingrese los Datos del Empleado "+j);
     System.out.println("Ingrese El nombre");
     nombre2=entrada.nextLine();
      nombre2=entrada.nextLine();
     System.out.println("Ingrese el Apellido");
     apellido2=entrada.nextLine();
     System.out.println("Ingrese La Edad");
     edad2=entrada.nextInt();
     e2.setNombre2(nombre2);
     e2.setApellido2(apellido2);
     e2.setEdad2(edad2);
     j++;
     
     
     System.out.println("Ingrese los Datos del Empleado "+j);
     System.out.println("Ingrese El nombre");
     nombre3=entrada.nextLine();
     nombre3=entrada.nextLine();
     System.out.println("Ingrese el Apellido");
     apellido3=entrada.nextLine();
     System.out.println("Ingrese La Edad");
     edad3=entrada.nextInt();
     e3.setNombre3(nombre3);
     e3.setApellido3(apellido3);
     e3.setEdad3(edad3);
     j++;
     
     
     System.out.println("Ingrese los Datos del Empleado "+j);
     System.out.println("Ingrese El nombre");
     nombre4=entrada.nextLine();
     nombre4=entrada.nextLine();
     System.out.println("Ingrese el Apellido");
     apellido4=entrada.nextLine();
     System.out.println("Ingrese La Edad");
     edad4=entrada.nextInt();
     e4.setNombre4(nombre4);
     e4.setApellido4(apellido4);
     e4.setEdad4(edad4);
     j++;
     
     
     System.out.println("Ingrese los Datos del Empleado "+j);
     System.out.println("Ingrese El nombre");
     nombre5=entrada.nextLine();
     nombre5=entrada.nextLine();
     System.out.println("Ingrese el Apellido");
     apellido5=entrada.nextLine();
     System.out.println("Ingrese La Edad");
     edad5=entrada.nextInt();
     e5.setNombre5(nombre5);
     e5.setApellido5(apellido5);
     e5.setEdad5(edad5);
     j++;
     
     System.out.println("Desea hacer otra accion\n");
     System.out.println("1.-Si\t\t"+"2.-No");
     opcion=entrada.nextInt();
     break;
     
         case 2:
     System.out.println("¿Que empleado desea modificar?");
     System.out.println("1:");
      System.out.println("2:");
       System.out.println("3:");
        System.out.println("4:");
         System.out.println("5:");
        int sele = entrada.nextInt();
     
         switch (sele){
             
             case 1:
               System.out.println("Ingrese los Datos del Empleado ");
     System.out.println("Ingrese El nombre");
     nombre=entrada.nextLine();
     nombre=entrada.nextLine();
     System.out.println("Ingrese el Apellido");
     apellido=entrada.nextLine();
     System.out.println("Ingrese La Edad");
     edad=entrada.nextInt();
     e1.setNombre(nombre);
     e1.setApellido(apellido);
     e1.setEdad(edad);
            break;     
     case 2:
         System.out.println("Ingrese los Datos del Empleado ");
     System.out.println("Ingrese El nombre");
     nombre2=entrada.nextLine();
      nombre2=entrada.nextLine();
     System.out.println("Ingrese el Apellido");
     apellido2=entrada.nextLine();
     System.out.println("Ingrese La Edad");
     edad2=entrada.nextInt();
     e2.setNombre2(nombre2);
     e2.setApellido2(apellido2);
     e2.setEdad2(edad2);
         break;
     case 3: 
          System.out.println("Ingrese los Datos del Empleado ");
     System.out.println("Ingrese El nombre");
     nombre3=entrada.nextLine();
     nombre3=entrada.nextLine();
     System.out.println("Ingrese el Apellido");
     apellido3=entrada.nextLine();
     System.out.println("Ingrese La Edad");
     edad3=entrada.nextInt();
     e3.setNombre3(nombre3);
     e3.setApellido3(apellido3);
     e3.setEdad3(edad3);
     break;
     case 4:
         System.out.println("Ingrese los Datos del Empleado ");
     System.out.println("Ingrese El nombre");
     nombre4=entrada.nextLine();
     nombre4=entrada.nextLine();
     System.out.println("Ingrese el Apellido");
     apellido4=entrada.nextLine();
     System.out.println("Ingrese La Edad");
     edad4=entrada.nextInt();
     e4.setNombre4(nombre4);
     e4.setApellido4(apellido4);
     e4.setEdad4(edad4);
          break;

     case 5:
                
     System.out.println("Ingrese los Datos del Empleado ");
     System.out.println("Ingrese El nombre");
     nombre5=entrada.nextLine();
     nombre5=entrada.nextLine();
     System.out.println("Ingrese el Apellido");
     apellido5=entrada.nextLine();
     System.out.println("Ingrese La Edad");
     edad5=entrada.nextInt();
     e5.setNombre5(nombre5);
     e5.setApellido5(apellido5);
     e5.setEdad5(edad5);
                 break;
     
      }
     
     
         break;                                                                                                                                
     
         case 3:
        e1.mensaje();
        e2.mensaje2();
        e3.mensaje3();
        e4.mensaje4();
        e5.mensaje5();
    
     System.out.println("Desea hacer otra accion\n");
     System.out.println("1.-Si\t\t"+"2.-No");
     opcion=entrada.nextInt();
         break;
     }
     }while(opcion==1); 
        
    }
    
}
