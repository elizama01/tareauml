package pacUfro;
public class FichaEstudiante {

	private String NumeroMatricula;
        private  Estudiante Alumn;
	
        public FichaEstudiante() {
        this.Alumn = new Estudiante();
      
	
            
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
            System.out.println("Año de ingreso "+Alumn.getAgnoIngreso());
            System.out.println("Nombre de Carrera "+Alumn.getCarre().getNomCarrera() );
            System.out.println("Codigo de Carrera "+Alumn.getCarre().getCodigo());
            NumeroMatricula();
            System.out.println("Direccion ");
            System.out.println("Nombre "+Alumn.direc.getCalle());
             System.out.println("Comuna "+Alumn.direc.getComuna());
            System.out.println("Numero De Departamento "+Alumn.direc.getNumDepartamento());
            System.out.println("Numero de edificio "+Alumn.direc.getNumEdificio());
            System.out.println("Numero de casa "+Alumn.direc.getNumero());
            System.out.println("Villa/poblacion "+Alumn.direc.getVillaPoblacion());
       
             }

	private void NumeroMatricula() {
		// TODO - implement FichaEstudiante.NumeroMatricula
NumeroMatricula="El Numero De Matricula es:"+Alumn.Rut+""+Alumn.AgnoIngreso;
	
        }

	

}