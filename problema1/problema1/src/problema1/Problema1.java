package problema1;
class Terreno{
    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorterreno;
    public Terreno(){}
    public Terreno(double ancho, double largo, double valorterreno) {
        this.ancho = ancho;
        this.largo = largo;
        this.valorterreno = valorterreno;
    }
    //SET
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public void setLargo(double largo) {
        this.largo = largo;
    }
    public void setValorterreno(double valorterreno) {
        this.valorterreno = valorterreno;
    }
    //calcular area del terreno
    public void calcularAra(){
        this.area=this.ancho*this.largo;
    }
    //calcular costo
    public void calcularCosto(){
        this.costo_terreno=this.area*this.valorterreno;
    }
    //GET
    public double getCosto_terreno() {
        return this.costo_terreno;
    }
    public double getAncho() {
        return this.ancho;
    }
    public double getLargo() {
        return this.largo;
    }
    public double getArea() {
        return this.area;
    }
    public double getValorterreno() {
        return this.valorterreno;
    }
    public String toString(){
        String msj=String.format("DATOS DEL TERRENO:"
                + "\nAncho del terreno: %.2f " 
                + "\nLargo del terreno: %.2f"
                + "\nValor del terreno: %.2f"
                +"\nArea del terreno: %.2f"
                +"\nCosto del terreno: %.2f",
                this.getAncho(),this.getLargo(),this.getValorterreno(),this.getArea(),this.getCosto_terreno());
        return msj;
    }
}
public class Problema1 {
    public static void main(String[] args) {
        Terreno terreno1=new Terreno(10,2,2);
        terreno1.calcularAra();
        terreno1.calcularCosto();
        System.out.println(terreno1); 
    }
}
