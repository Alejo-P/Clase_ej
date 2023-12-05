public class Principal
{
    public static void main(String[] args) {
        Empleados E1=new Empleados("Pedro","0001");
        Operario O1=new Operario("Juan","0002");
        Directivo D1=new Directivo("Andrea","0003");
        Subdirectivo S1=new Subdirectivo("Angel", "0004");
        Suboficial So1=new Suboficial("Jose", "0005");
        Subsuboficial Sso1=new Subsuboficial("Francisco", "0006");
    
            O1.saludoOperario();
            O1.saludo();
    
            D1.saludoDirectivo();
            D1.saludo();

            S1.saludoSubdirectivo();
            S1.saludo();

            So1.saludoSuboficial();
            So1.saludo();

            Sso1.saludoSussuboficial();
            Sso1.saludo();
        }
}
