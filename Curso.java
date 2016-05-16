package pacUfro;

import java.util.ArrayList;

public class Curso {

	protected String NumCurso;
	protected String CodigoCurso;
        private Docente docente1=new Docente();
        private ArrayList<Estudiante>alum;
	public Curso() {
	alum=new ArrayList<>();
	}

       
    public String getNumCurso() {
        return NumCurso;
    }

    public void setNumCurso(String NumCurso) {
        this.NumCurso = NumCurso;
    }

    public String getCodigoCurso() {
        return CodigoCurso;
    }

    public void setCodigoCurso(String CodigoCurso) {
        this.CodigoCurso = CodigoCurso;
    }

    public Docente getDocente1() {
        return docente1;
    }

    public void setDocente1(Docente docente1) {
        this.docente1 = docente1;
    }

    public ArrayList<Estudiante> getAlum() {
        return alum;
    }

    public void setAlum(ArrayList<Estudiante> alum) {
        this.alum = alum;
    }


}