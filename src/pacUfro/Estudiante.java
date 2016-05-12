package pacUfro;

public class Estudiante extends Persona {

 protected Carrera carre;
    protected int AgnoIngreso;

   
    
    public Estudiante() {
  
   AgnoIngreso=15;
   Nombre="Esteban";
   Apellido="Lizama";
   Nacimiento="14/nomviembre/96";
   Rut="194777280";
   getDirec().setCalle("A.prat");
   getDirec().setComuna("Nueva Imperial");
   getDirec().setNumDepartamento("N/A");
   getDirec().setNumEdificio("N/A");
   getDirec().setNumero("425");
   getDirec().setVillaPoblacion("N/A");
  
   
    }

   

   

  
    public Carrera getCarre() {
        return carre;
    }

    public void setCarre(Carrera carre) {
        this.carre = carre;
    }
	

    public int getAgnoIngreso() {
        return AgnoIngreso;
    }

    public void setAgnoIngreso(int AgnoIngreso) {
        this.AgnoIngreso = AgnoIngreso;
    }


    
    



	

}