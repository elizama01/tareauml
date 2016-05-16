package pacUfro;

public class Docente extends Trabajador {

	private Departamento Director;
	private String TituloProfesional;
	private String Especializacion;
        private Curso cursodocente;
    public Departamento getDirector() {
        return Director;
    }

    public void setDirector(Departamento Director) {
        this.Director = Director;
    }

    public String getTituloProfesional() {
        return TituloProfesional;
    }

    public void setTituloProfesional(String TituloProfesional) {
        this.TituloProfesional = TituloProfesional;
    }

    public String getEspecializacion() {
        return Especializacion;
    }

    public void setEspecializacion(String Especializacion) {
        this.Especializacion = Especializacion;
    }

	public Docente() {
        this.cursodocente = new Curso();
		
	}

    public Curso getCursodocente() {
        return cursodocente;
    }

    public void setCursodocente(Curso cursodocente) {
        this.cursodocente = cursodocente;
    }

	

}