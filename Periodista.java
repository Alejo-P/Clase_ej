public class Periodista extends Persona {
    public Periodista()
    {}
    public Periodista(String nombre, String cedula)
    {
        super(nombre,cedula);
    }
    public Periodista(String nombre, String cedula, int edad, String fechaNacimiento, String tipoSangre)
    {
        super(nombre,cedula,edad,fechaNacimiento,tipoSangre);
    }
    //Sobreescribir un metodo de la clase padre
    @Override
    public void Saludar()
    {
        System.out.println("Hola a todos, desde periodista!");
    }
}
