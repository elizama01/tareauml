/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacUfro;

/**
 *
 * @author Esteban
 */
public class ProyectoFinal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  curso, alumno y profesor TODO code application logic here
  
 /** Estudiante e1=new Estudiante();
  FichaEstudiante fch1=new FichaEstudiante(e1);

   e1.AgnoIngreso=15;
   e1.Nombre="Esteban";
   e1.Apellido="Lizama";
   e1.Nacimiento=1996;
   e1.Rut="194777280";
   e1.carre.setCodigo("1237812l");
   e1.carre.setNomCarrera("Ingenieria Informatica");
   e1.carre.setDescripcion("LA MEJOR CARRERA ");
   e1.direc.setCalle("A.prat");
   e1.direc.setComuna("Nueva Imperial");
   e1.direc.setNumDepartamento("N/A");
   e1.direc.setNumEdificio("N/A");
   e1.direc.setNumero("425");
   e1.direc.setVillaPoblacion("N/A");  
   fch1.GenerarFicha();**/
        
  Contrato c1 =new Contrato();
  Trabajador t= new Trabajador();

   t.Nombre="Esteban";
   t.Apellido="Lizama";
   t.Nacimiento=1996;
   t.Rut="194777280";
   t.direc.setCalle("A.prat");
   t.direc.setComuna("Nueva Imperial");
   t.direc.setNumDepartamento("N/A");
   t.direc.setNumEdificio("N/A");
   t.direc.setNumero("425");
   t.direc.setVillaPoblacion("N/A");  
   t.setAfp("Afp");
   t.setIsapre("Isapre");
   t.Contr1.InicioContrato(12, 2, 2016);
   t.Contr1.terminoContrato(4, 2, 2017);
   t.Contr1.GenerarContrato();
    
    }
    
}
