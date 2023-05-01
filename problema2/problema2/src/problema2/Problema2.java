package problema2;
class EquivalenteHora{
    private double horas;
    private double minutos;
    private double segundos;
    private double dias;
    public EquivalenteHora(){}
    public EquivalenteHora(double horas) {
        this.horas = horas;
    }
    //set
    public void setHoras(double horas) {
        this.horas = horas;
    }
    //calcular horas en dias
    public void calcularHorasAdias(){
        this.dias=this.horas/24;
    }
    //calcular horas a min
    public void calcularHorasAmin(){
        this.minutos=this.horas*60;
    }
    //calcular horas a seg
    public void calcularHorasAseg(){
        this.segundos=this.horas*3600;
    }
    //get
    public double getHoras() {
        return this.horas;
    }
    public double getMinutos() {
        return this.minutos;
    }
    public double getSegundos() {   
        return this.segundos;
    }
    public double getDias() {
        return this.dias;
    }
    public String toString(){
        String mjs=String.format("%.2f HORAS EN DIAS,MIN Y SEG SON:"
            +"%n %.2f dias"
            +"%n %.2f min"
            +"%n %.2f seg",
            this.getHoras(),this.getDias(),this.getMinutos(),this.getSegundos());
        return mjs;
    }
}
public class Problema2 {
    public static void main(String[] args) {
        EquivalenteHora hora1=new EquivalenteHora(50);
        hora1.calcularHorasAdias();
        hora1.calcularHorasAmin();
        hora1.calcularHorasAseg();
        System.out.println(hora1);   
    }
}
