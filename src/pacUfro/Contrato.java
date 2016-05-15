package pacUfro;



public class Contrato {

protected Trabajador trab1=new Trabajador();
int Agno,Mes,Dia,DiaTermino,MesTermino,AgnoTermino,SalarioMensual;

    

    public Trabajador getTrab1() {
        return trab1;
    }

    public void setTrab1(Trabajador trab1) {
        this.trab1 = trab1;
    }

    public int getAgno() {
        return Agno;
    }

    public void setAgno(int Agno) {
        this.Agno = Agno;
    }

    public int getMes() {
        return Mes;
    }

    public void setMes(int Mes) {
        this.Mes = Mes;
    }

    public int getDia() {
        return Dia;
    }

    public void setDia(int Dia) {
        this.Dia = Dia;
    }

    public int getDiaTermino() {
        return DiaTermino;
    }

    public void setDiaTermino(int DiaTermino) {
        this.DiaTermino = DiaTermino;
    }

    public int getMesTermino() {
        return MesTermino;
    }

    public void setMesTermino(int MesTermino) {
        this.MesTermino = MesTermino;
    }

    public int getAgnoTermino() {
        return AgnoTermino;
    }

    public void setAgnoTermino(int AgnoTermino) {
        this.AgnoTermino = AgnoTermino;
    }

    public int getSalarioMensual() {
        return SalarioMensual;
    }

    public void setSalarioMensual(int SalarioMensual) {
        this.SalarioMensual = SalarioMensual;
    }
    public void  InicioContrato(int dia,int mes,int agno){
    this.Dia=dia ;
    this.Mes=mes;
    this.Agno=agno;
    } 
    public void  terminoContrato(int diaTermino,int mesTermino,int agnoTermino){
    this.DiaTermino=diaTermino ;
    this.MesTermino=mesTermino;
    this.AgnoTermino=agnoTermino;
    } 
    
public Contrato( ) {
 
          
    }
    
	
	

	public  void GenerarContrato() {
		// TODO - implement Contrato.GenerarContrato
	     
            System.out.println("Nombre "+ trab1.Nombre);
            System.out.println("Apellido "+ trab1.Apellido);
            System.out.println("Rut "+ trab1.Rut);
            trab1.CalcularEdad();
            System.out.println("Direccion ");
            System.out.println("Nombre "+trab1.direc.getCalle());
            System.out.println("Comuna "+trab1.direc.getComuna());
            System.out.println("Numero De Departamento "+trab1.direc.getNumDepartamento());
            System.out.println("Numero de edificio "+trab1.direc.getNumEdificio());
            System.out.println("Numero de casa "+trab1.direc.getNumero());
            System.out.println("Villa/poblacion "+trab1.direc.getVillaPoblacion());
            System.out.println("Usted ganara "+ SalarioMensual+" Al mes" );
            System.out.println("Usted ganara "+ (SalarioMensual*12)+" Por año" );
            System.out.println("Inicio de contrato "+ "Dia " + Dia+"mes "+Mes+"Año"+Agno);
            System.out.println("Termino  de contrato "+ "Dia " + DiaTermino+"mes "+MesTermino+"Año"+AgnoTermino);
            System.out.println("La afp es "+trab1.getAfp());
            System.out.println("La isapre es "+ trab1.getIsapre());
            
             
             
           
          
        
        }

}