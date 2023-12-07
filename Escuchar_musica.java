public class Escuchar_musica extends Pasatiempos{
    //Atributos
    private String tipo_musica;
    public Escuchar_musica (String nombre,double frecuencia,double tiempo)
    {
        super(nombre,frecuencia,tiempo);
    }
    public void setTipo_musica(String tipo_musica) {
        this.tipo_musica = tipo_musica;
    }
    public  void mostrarInformacion()
    {
        System.out.printf("El tipo de musica escogida es: %s\n", this.tipo_musica);
    }

}
