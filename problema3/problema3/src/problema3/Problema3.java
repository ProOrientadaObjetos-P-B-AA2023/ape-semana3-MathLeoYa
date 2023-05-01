package problema3;
class InstitucionesEducativas{
    private String nombre;
    private String tipo;
    private int numAlum;
    private int numDocentes;
    private int numSedes;
    private double gastosEstud;
    private double presupuesto;
    public InstitucionesEducativas() {}   
    public InstitucionesEducativas(String nombre, String tipo, int numAlum, int numDocentes, int numSedes, double gastosEstud) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.numAlum = numAlum;
        this.numDocentes = numDocentes;
        this.numSedes = numSedes;
        this.gastosEstud = gastosEstud;
    }
    //set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setNumAlum(int numAlum) {
        this.numAlum = numAlum;
    }
    public void setNumDocentes(int numDocentes) {
        this.numDocentes = numDocentes;
    }
    public void setNumSedes(int numSedes) {
        this.numSedes = numSedes;
    }
    public void setGastosEstud(double gastosEstud) {
        this.gastosEstud = gastosEstud;
    }
    //calcular presupuesto
    public void calcularPresupuesto(){
        this.presupuesto=this.numAlum*this.gastosEstud;
    }
    //get
    public String getNombre() {
        return this.nombre;
    }
    public String getTipo() {
        return this.tipo;
    }
    public int getNumAlum() {
        return this.numAlum;
    }
    public int getNumDocentes() {
        return this.numDocentes;
    }
    public int getNumSedes() {
        return this.numSedes;
    }
    public double getGastosEstud() {
        return this.gastosEstud;
    }
    public double getPresupuesto() {
        return this.presupuesto;
    }
    public String toString(){
        String msj=String.format("INSTITUCION EDUCATIVA"
                +"%nNombre de la institucion: %s"
                + "%nT  ipo de institucion: %s"
                + "%nNumero de alumnos: %d"
                + "%nNumero de docentes: %d"
                + "%nNumero de sedes: %d"
                + "%nGastos por estudiante: %.2f"
                + "%nPRESUPUESTO: %.2f",
                this.getNombre(),this.getTipo(),this.getNumAlum(),this.getNumDocentes(),this.getNumSedes(),this.getGastosEstud(),this.getPresupuesto());
        return msj;
    }
}
public class Problema3 {
    public static void main(String[] args) {
        InstitucionesEducativas institucion1=new InstitucionesEducativas("Bernardo", "publica", 850, 400, 5, 66);
        institucion1.calcularPresupuesto();
        System.out.println(institucion1);
    }
}
