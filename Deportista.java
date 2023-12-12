public class Deportista extends Persona {
    //Usar todos los constructores de la clase persona
    public Deportista (String nombre, String cedula)
    {
        /*Usar super para omitir
        this.nombre = nombre;
        this.cedula = cedula;*/
        super(nombre, cedula);
    }
    public Deportista(){}
    public Deportista (String nombre, String cedula, int edad, String fechaNacimiento, String tipoSangre)
    {
        super(nombre,cedula,edad,fechaNacimiento,tipoSangre);
    }
}
