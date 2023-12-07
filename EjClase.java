public class EjClase {
    public static void main(String[] args) {
        Escuchar_musica P1= new Escuchar_musica("Reproducir musica", 0.9, 18);
        Jugar P2=new Jugar("Jugar Juegos", 0.88, 3);
        P1.setTipo_musica("Variada");
        P2.setTipojuego("Videojuegos");
        P1.getInfo();
        P2.getInfo();
        P1.mostrarInformacion();
        P2.mostrarInformacion();
    }
}
