package pacUfro;

public class Direccion {


    public String getNumero() {
        return NumeroCasa;
    }

    public void setNumero(String Numero) {
        this.NumeroCasa = Numero;
    }

    public String getVillaPoblacion() {
        return VillaPoblacion;
    }

    public void setVillaPoblacion(String VillaPoblacion) {
        this.VillaPoblacion = VillaPoblacion;
    }

    public String getComuna() {
        return Comuna;
    }

    public void setComuna(String Comuna) {
        this.Comuna = Comuna;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public String getNumEdificio() {
        return NumEdificio;
    }

    public void setNumEdificio(String NumEdificio) {
        this.NumEdificio = NumEdificio;
    }

    public String getNumDepartamento() {
        return NumDepartamento;
    }

    public void setNumDepartamento(String NumDepartamento) {
        this.NumDepartamento = NumDepartamento;
    }
	protected String NumEdificio;
	protected String NumDepartamento;
	protected String NumeroCasa;
	protected String VillaPoblacion;
	protected String Comuna;
	protected String Calle;
   
        public Direccion(String Calle,String Comuna,
                String NumEdificio,String NumDepartamento,String NumeroCasa,String VillaPoblacion) {
   
    this.Calle=Calle;
    this.Comuna=Comuna;
    this.NumDepartamento=NumDepartamento;
    this.NumEdificio=NumEdificio;
    this.NumeroCasa=NumeroCasa;
    this.VillaPoblacion=VillaPoblacion;
        }

}