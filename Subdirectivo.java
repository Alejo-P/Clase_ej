public class Subdirectivo extends Directivo {
    public Subdirectivo (String Nombre, String Codigo)
    {
        super(Nombre, Codigo);
    }
    
    public void saludoSubdirectivo()
    {
        System.out.println("Saludo desde Subdirectivo");
        System.out.print("Mi nombre es: ");
        System.out.println(this.getNombre());
    }
} 
