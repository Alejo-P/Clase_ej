public class Pasatiempos {
    String Nombre;
    double Frecuencia;
    double tiempo;
    //Constructor de la clase pasatiempos
    public Pasatiempos(String nombre,double frecuencia,double tiempo){
        this.Nombre=nombre;
        this.Frecuencia=frecuencia;
        this.tiempo=tiempo;
    }
    //Metodos (Setters y Getters)
    public void getInfo()
    {
        System.out.printf("Nombre del pasatiempo: %s\nFrecuencia con la que se realiza: %.2f\nCantidad de tiempo que se le dedica: %.2f\n", this.Nombre, this.Frecuencia, this.tiempo);
    }
}
