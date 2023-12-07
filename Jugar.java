public class Jugar extends Pasatiempos{
    String Tipojuego;
    public Jugar (String nombre,double frecuencia,double tiempo)
    {
        super(nombre, frecuencia, tiempo);
    }

    public void setTipojuego(String tipojuego) {
        Tipojuego = tipojuego;
    }
    public void mostrarInformacion()
    {
        System.out.printf("El tipo de juego escogido es: %s\n", this.Tipojuego);
    }
}
