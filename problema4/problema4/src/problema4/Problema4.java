package problema4;
class Sistema{
    private String sistemaOp;
    private double tamanioPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double costoIva;
    private String direccionMac;
    private int imc;
    public Sistema(){}
    public Sistema(String sistemaOp, double tamanioPantalla, double costoInicial, String direccionMac, int imc) {
        this.sistemaOp = sistemaOp;
        this.tamanioPantalla = tamanioPantalla;
        this.costoInicial = costoInicial;
        this.direccionMac = direccionMac;
        this.imc = imc;
    }
    //set
    public void setSistemaOp(String sistemaOp) {
        this.sistemaOp = sistemaOp;
    }
    public void setTamanioPantalla(double tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }
    public void setCostoInicial(double costoInicial) {
        this.costoInicial = costoInicial;
    }
    public void setIvaPorcentaje(double ivaPorcentaje) {
        this.ivaPorcentaje = ivaPorcentaje;
    }
    public void setDireccionMac(String direccionMac) {
        this.direccionMac = direccionMac;
    }
    public void setImc(int imc) {
        this.imc = imc;
    }
    //calcular IVA
    public void calcularIVA(){
        this.ivaPorcentaje = this.costoInicial * 12/100;
    }
    //calcular costo final
    public void calcularCostoFinal(){
        this.costoIva=this.ivaPorcentaje+this.costoInicial;
    }
    //get
    public String getSistemaOp() {
        return this.sistemaOp;
    }
    public double getTamanioPantalla() {
        return this.tamanioPantalla;
    }
    public double getCostoInicial() {
        return this.costoInicial;
    }
    public double getIvaPorcentaje() {
        return this.ivaPorcentaje;
    }
    public double getCostoIva() {
        return this.costoIva;
    }
    public String getDireccionMac() {
        return this.direccionMac;
    }
    public int getImc() {
        return this.imc;
    }
    public String toString(){
        String mjs=String.format("DATOS DEL DISPOSITIVO"
            +"%nSistema operativo: %s"
                + "%nTamanio de pantalla: %.2f"
                + "%nCosto inicial: %.2f"
                + "%nDireccion Mac: %s"
                + "%nIMC: %d"
                + "%nIVA: %.2f"
                + "%nCOSTO FINAL: %.2f",
                this.getSistemaOp(),this.getTamanioPantalla(),this.getCostoInicial(),this.getDireccionMac(),this.getImc(),this.getIvaPorcentaje(),this.getCostoIva());
        return mjs;
    }
}
public class Problema4 {
    public static void main(String[] args) {
        Sistema dispositivo1=new Sistema("Android", 8,150,"9A-8B-CF-69-6F-A5", 12321412);
        dispositivo1.calcularIVA();
        dispositivo1.calcularCostoFinal();
        System.out.println(dispositivo1);
    }
}
