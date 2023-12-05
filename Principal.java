public class Principal
{
    public static void main(String[] args)
    {
        Empleados E101=new Empleados("Juan", "162534");
        Operario E102=new Operario("Jose", "87346583");

        System.out.println(E101.getNombre());
        E102.setOperario();
    }
}
