import models.Forma;

public class Quadrado implements Forma{
    private double area;

    public String toString(){
        return String.valueOf(area);
    }
    @Override
    public double calcularArea(double lado){
        area = lado*lado;
        return area;
    }
}
