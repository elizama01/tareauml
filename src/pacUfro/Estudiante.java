package pacUfro;

public class Estudiante extends Persona {

 protected Carrera carre=new Carrera();
    protected int AgnoIngreso;
    public Estudiante() {
  
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