package pacUfro;

import java.util.Calendar;

public class Persona {
       protected int Edad;
	protected String Nombre;
	protected String Apellido;
	protected String Rut;
        protected int Nacimiento;
	protected String Numerotelefonico;
        Direccion direc=new Direccion("","","","","","");

    public Direccion getDirec() {
        return direc;
    }

    public void setDirec(Direccion direc) {
        this.direc = direc;
    }

 
       
        public Persona() {
	
	}
       
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public int getNacimiento() {
        return Nacimiento;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setNacimiento(int Nacimiento) {
        this.Nacimiento = Nacimiento;
    }


    public String getNumerotelefonico() {
        return Numerotelefonico;
    }

    public void setNumerotelefonico(String Numerotelefonico) {
        this.Numerotelefonico = Numerotelefonico;
    }
 
	public  void MostrarDatosPersona(){
         	
	    System.out.println("Nombre "+ Nombre);
            System.out.println("Apellido "+ Apellido);
            System.out.println("Rut "+ Rut);
           CalcularEdad();
            System.out.println("Direccion ");
            System.out.println("Nombre "+direc.getCalle());
            System.out.println("Comuna "+direc.getComuna());
            System.out.println("Numero De Departamento "+direc.getNumDepartamento());
            System.out.println("Numero de edificio "+direc.getNumEdificio());
            System.out.println("Numero de casa "+direc.getNumero());
            System.out.println("Villa/poblacion "+direc.getVillaPoblacion());
           
        
        
        }
 
	

	public void CalcularEdad() {
	  Calendar ca1=Calendar.getInstance();
          int Agno=ca1.get(Calendar.YEAR);
	  Edad=Agno-Nacimiento;
          System.out.println("La edad es "+Edad+" Años");
        }

	
}