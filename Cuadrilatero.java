public class Cuadrilatero {
    public double lado1, lado2;

    public Cuadrilatero(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2=lado2;
    }
    //Setters y getters

    private double getLado() {
        return lado1+lado2;
    }
    public double Perimetro(double lado)
    {
        //Obtener el lado del cuadrado
        this.getLado();
        double perimetro=lado*4;
        return perimetro;
    }
    public void Info()
    {
        System.out.println("Lado del cuadrado "+this.lado+"\nPerimetro del cuadrado "+ this.Perimetro(4));
    }
    public void area()
    {
        System.out.println("El area del cuadrado es:" +Math.pow(this.lado, 2));
    }
    public void diag()
    {
        System.out.printf("laq diagonal del cuadrado es: %.2f m2", Math.sqrt(Math.pow(this.lado,2)+ (Math.pow(this.lado, 2))));
    }
}
