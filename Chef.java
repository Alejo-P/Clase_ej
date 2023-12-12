public class Chef extends Persona{
    public Chef()
    {}
    public Chef(String Nombre, String Cedula)
    {
        super(Nombre, Cedula);
    }
    public Chef(String nombre, String cedula, int edad, String fechaNacimiento, String tipoSangre)
    {
        super(nombre,cedula,edad,fechaNacimiento,tipoSangre);
    }
    //Sobreescribir un metodo de la clase padre
    @Override
    public void Saludar()
    {
        System.out.println("Hola a todos, desde chef!");
    }
}
