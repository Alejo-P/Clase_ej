public class Circulo {
    public double Radio;
    public Circulo(double radio) {this.Radio=radio;}
    public void areacirculo()
    {
        System.out.printf("El area del circulo es: %.2f m2", Math.PI*Math.pow(this.Radio, 2));
    }
}
