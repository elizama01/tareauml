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

    public ArrayList<Estudiante> getAlum() {
        return alum;
    }

    public void setAlum(ArrayList<Estudiante> alum) {
        this.alum = alum;
    }
        protected String Codigo;
	protected String Descripcion;
	protected String NomCarrera;
    ArrayList<Estudiante>alum;
	public Carrera() {
		// TODO - implement Carrera.Carrera
		
	
        }

}