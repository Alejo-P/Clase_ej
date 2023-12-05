public class Empleados {
    //Atributos
    public String Nombre, Codigo;

    //Constructor
    public Empleados(String nombre, String codigo){
        this.Nombre=nombre;
        this.Codigo=codigo;
    }

    //Metodos (setters y getters)
    public String getNombre() {
        return Nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }
    
}
