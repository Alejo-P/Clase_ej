public class Subsuboficial extends Suboficial {
   public Subsuboficial (String Nombre, String Codigo)
   {
        super(Nombre, Codigo);
   } 
   public void saludoSussuboficial()
    {
        System.out.println("Saludo desde Sussuboficial");
        System.out.print("Mi nombre es: ");
        System.out.println(this.getNombre());
    }
}
