package pacUfro;

import java.util.ArrayList;

public class Carrera {

	

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getNomCarrera() {
        return NomCarrera;
    }

    public void setNomCarrera(String NomCarrera) {
        this.NomCarrera = NomCarrera;
    }

    public ArrayList<Estudiante> getAlumosCArrera() {
        return alumosCArrera;
    }

    public void setAlumosCArrera(ArrayList<Estudiante> alumosCArrera) {
        this.alumosCArrera = alumosCArrera;
    }
	protected String NomCarrera="";
        private ArrayList<Estudiante>alumosCArrera;
        protected String Codigo="";
	protected String Descripcion="";

	public Carrera() {
		// TODO - implement Carrera.Carrera
		
	
        }

}