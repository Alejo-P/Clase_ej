public class Persona {
    //Atributos de la clase persona
    String nombre;
    String cedula;
    int edad;
    String fechaNacimiento;
    String TipoSangre;
    // 3 Constructores de la clase persona
    public Persona() {}
    public Persona(String nombre, String cedula, int edad, String fechaNacimiento, String tipoSangre)
    {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.fechaNacimiento= fechaNacimiento;
        this.TipoSangre = tipoSangre;
    }
    public Persona(String n, String c) {
        this.nombre = n;
        this.cedula = c;
    }
    // Metodos get y set para los atributos de la clase persona
    //Getters
    //Obtener la informacion de la persona
    public void Informacion()
    {
        System.out.printf("Nombre: %s Edad: %d Cedula: %s Nacimiento: %s ", this.nombre, this.edad, this.cedula, this.fechaNacimiento);
    }
    public String getNombre(){return nombre;}
    public int getEdad() {
        return edad;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public String getTipoSangre() {
        return TipoSangre;
    }
    //Setters
    
    public void setEdad(int e) throws Exception{
        if (e < 0){
            throw new Exception("La edad no puede ser negativa");
        } else {
            this.edad = e;
        }
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public void setFechaNacimiento(String fn) {
        this.fechaNacimiento = fn;
    }
    public void setTipoSangre(String ts) {
        this.TipoSangre = ts;
    }

}
