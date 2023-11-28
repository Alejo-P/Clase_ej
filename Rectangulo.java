public class Rectangulo {
    public double altura, base;
    public Rectangulo(double alturan, double basen)
    {
        this.altura=alturan;
        this.base=basen;
    }

    public void getArea() {
        System.out.printf("El area del rectangulo es: %.2f\n",this.base*this.altura);
    }
    public void getPerimetro()
    {
        System.out.println("El perimetro del rectangulo es: "+Math.pow(this.base, 2)+Math.pow(this.altura, 2)+" m2");
    }
    public void getDiagonal()
    {
        System.out.printf("la diagonal del rectangulo es: %.2f m2\n", Math.sqrt(Math.pow(this.base,2)+ (Math.pow(this.altura, 2))));
    }
}