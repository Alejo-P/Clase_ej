// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado=new Cuadrado(4);
        cuadrado.Perimetro(4);
        cuadrado.Info();
        cuadrado.area();
        cuadrado.diag();
        System.out.println(" ");
        Rectangulo mirec=new Rectangulo(3, 2.4);
        mirec.getArea();
        mirec.getDiagonal();
        mirec.getPerimetro();
        Circulo circ=new Circulo(3.4);
        circ.areacirculo();
    }
}