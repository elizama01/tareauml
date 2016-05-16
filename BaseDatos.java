/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacUfro;

import java.util.Scanner;

/**
 *
 * @author pcccasd
 */
public class BaseDatos {
    public void Ingresoficha() {
        Scanner entrada=new Scanner(System.in);
        Estudiante  e1=new Estudiante ();
        System.out.println(" Ingrese Año de ingreso ");
        int agnoIngreso=entrada.nextInt();
   e1.AgnoIngreso=agnoIngreso;
        System.out.println("Ingrese Nombre de estudiante ");
        String  Nombre=entrada.nextLine();
   e1.Nombre=""+Nombre;
        System.out.println("Ingrese apellido de estudiante ");
        String Apellido=entrada.nextLine();
        
   e1.Apellido=Apellido;
        System.out.println("Ingrese año de nacimiento");
        int Nacimiento=entrada.nextInt();
   e1.Nacimiento=Nacimiento;
        System.out.println("Ingrese rut de Estudiante ");
       String Rut = entrada.nextLine();
                       
   e1.Rut=Rut;
        System.out.println("Ingrese Codigo de Carrera");
       String codCarrera=entrada.nextLine();
   e1.carre.setCodigo(codCarrera);
        System.out.println("Ingrese Nombre de carrera");
        String NomCarrera=entrada.nextLine();
   e1.carre.setNomCarrera(NomCarrera);
        System.out.println("Ingrese Direccion");
        System.out.println("Ingrese Nombre de la Calle");
        String NomCalle=entrada.nextLine();
   e1.direc.setCalle(NomCalle);
        System.out.println("Ingrese Nombre de la Ciudad");
        String NomCiudad=entrada.nextLine();
   
   e1.direc.setComuna(NomCiudad);
   e1.direc.setNumDepartamento("N/A");
   e1.direc.setNumEdificio("N/A");
   e1.direc.setNumero("425");
   e1.direc.setVillaPoblacion("N/A");  
   

    }
 }
