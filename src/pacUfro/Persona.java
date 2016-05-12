package pacUfro;

public class Persona {
       
	protected String Nombre;
	protected String Apellido;
	protected String Rut;
        protected String Nacimiento;
	protected String Numerotelefonico;
        protected Direccion direc;

    public Direccion getDirec() {
        return direc;
    }

    public void setDirec(Direccion direc) {
        this.direc = direc;
    }
       
        public Persona() {
	
	}
        public void AgregarDireccion(Direccion direc){
       this.direc=direc;
            
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

    public String getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(String Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    public String getNumerotelefonico() {
        return Numerotelefonico;
    }

    public void setNumerotelefonico(String Numerotelefonico) {
        this.Numerotelefonico = Numerotelefonico;
    }
 
	
 
	

	public void CalcularEdad() {
		// TODO - implement Persona.CalcularEdad
		
	}

	
}