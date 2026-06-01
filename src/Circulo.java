import models.Forma;

public class Circulo implements Forma{
    private double area;

    public String toString(){
        return String.valueOf(area);
    }
    
    @Override
    public double calcularArea(double raio){
        this.area = Math.PI * Math.pow(raio, 2);
        return area;
    }
}