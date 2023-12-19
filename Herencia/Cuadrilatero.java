public class Cuadrilatero {
    public double lado1, lado2;

    public Cuadrilatero(double l1, double l2) {
        this.lado1=l1;
        this.lado2=l2;
    }
    //Setters y getters

    public double Perimetro()
    {
        //Obtener el lado del cuadrado;
        double perimetro=2*lado1+2*lado2;
        return perimetro;
    }
    public void area()
    {
        double area=lado1*lado2;
        System.out.println("El area del cuadrado es: "+area);
    }
    public void diag()
    {
        double diagonal=(Math.sqrt(Math.pow(lado1,2)+Math.pow(lado2,2)));
        System.out.printf("laq diagonal del cuadrado es: %.2f m2", diagonal);
    }
}
