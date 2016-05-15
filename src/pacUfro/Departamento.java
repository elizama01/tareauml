package pacUfro;

import java.util.*;

public class Departamento {

	Collection<Docente> Trabajan;
	Docente Dirigen;
	protected String NombreDepartamento;
	protected String Especialidad;
	protected String Acronimo;

	public Departamento() {
		
	}

    public Collection<Docente> getTrabajan() {
        return Trabajan;
    }

    public void setTrabajan(Collection<Docente> Trabajan) {
        this.Trabajan = Trabajan;
    }

    public Docente getDirigen() {
        return Dirigen;
    }

    public void setDirigen(Docente Dirigen) {
        this.Dirigen = Dirigen;
    }

    public String getNombreDepartamento() {
        return NombreDepartamento;
    }

    public void setNombreDepartamento(String NombreDepartamento) {
        this.NombreDepartamento = NombreDepartamento;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getAcronimo() {
        return Acronimo;
    }

    public void setAcronimo(String Acronimo) {
        this.Acronimo = Acronimo;
    }

}