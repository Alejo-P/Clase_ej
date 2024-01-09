import java.sql.*;

public class Conexion
{
    //Conexion a MySQL en JAVA
    public static void main(String[] args) {    
        String db_url="jdbc:mysql://localhost:3306/estudiantes";
        String db_nombre="root";
        String db_password="";
        java.sql.Connection connexion=null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connexion = DriverManager.getConnection(db_url, db_nombre, db_password);
            Statement statement;
            statement=connexion.createStatement();
            ResultSet resultado;
            resultado=statement.executeQuery("SELECT * FROM calificaciones");
            //Mostrar los resultados
            int id;
            String Nombre, Cedula;
            float nota1, nota2, nota3, nota4;
            while (resultado.next())
            {
                id=resultado.getInt("id");
                Nombre=resultado.getString("Nombre");
                Cedula=resultado.getString("Cedula");
                nota1=resultado.getFloat("Calificacion1");
                nota2=resultado.getFloat("Calificacion2");
                nota3=resultado.getFloat("Calificacion3");
                nota4=resultado.getFloat("Calificacion4");
                System.out.printf("Id:%d Nombre:%s Cedula:%s\nCalif1:%.2f Calif2:%.2f Calif3:%.2f Calif4:%.2f\n",id, Nombre, Cedula, nota1, nota2, nota3, nota4);
            }
        }
        catch(Exception e)
        {
            System.out.println("Excepcion "+e);
        }
    }
}