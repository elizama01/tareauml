package pacUfro;



public class FichaEstudiante {

	private String NumeroMatricula;
        private  Estudiante Alumn;
    
        public FichaEstudiante( Estudiante Alumn) {
      
      this.Alumn=Alumn;
	
            
        }

    public String getNumeroMatricula() {
        return NumeroMatricula;
    }

    public void setNumeroMatricula(String NumeroMatricula) {
        this.NumeroMatricula = NumeroMatricula;
    }

    public Estudiante getAlumn() {
        return Alumn;
    }

    public void setAlumn(Estudiante Alumn) {
        this.Alumn = Alumn;
    }

	public void GenerarFicha() {
		
	    System.out.println("Nombre "+ Alumn.getNombre());
            System.out.println("Apellido "+Alumn.getApellido());
            System.out.println("Rut "+ Alumn.getRut());
            System.out.println("Año de ingreso 20"+Alumn.getAgnoIngreso());
            System.out.println("Nombre de Carrera "+Alumn.carre.getNomCarrera() );
            System.out.println("Codigo de Carrera "+Alumn.carre.getCodigo());
            NumeroMatricula();
            System.out.println("Direccion ");
            System.out.println("Nombre "+Alumn.direc.getCalle());
             System.out.println("Comuna "+Alumn.direc.getComuna());
            System.out.println("Numero De Departamento "+Alumn.direc.getNumDepartamento());
            System.out.println("Numero de edificio "+Alumn.direc.getNumEdificio());
            System.out.println("Numero de casa "+Alumn.direc.getNumero());
            System.out.println("Villa/poblacion "+Alumn.direc.getVillaPoblacion());
            Alumn.CalcularEdad();
             }

	public void NumeroMatricula() {
		// TODO - implement FichaEstudiante.NumeroMatricula
NumeroMatricula="El Numero De Matricula es:"+Alumn.Rut+""+Alumn.AgnoIngreso;
	           System.out.println(""+NumeroMatricula );
        }

	

}