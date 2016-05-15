package pacUfro;

public class Trabajador extends Persona {

	protected String Isapre;
	protected String Afp;
protected Contrato Contr1=new  Contrato();

    public Contrato getContr1() {
        return Contr1;
    }

    public void setContr1(Contrato Contr1) {
        this.Contr1 = Contr1;
    }
   
public String getIsapre() {
        return Isapre;
    }

    public void setIsapre(String Isapre) {
        this.Isapre = Isapre;
    }

    public String getAfp() {
        return Afp;
    }

    public void setAfp(String Afp) {
        this.Afp = Afp;
    }
public Trabajador() {
		
		
	
        }

}