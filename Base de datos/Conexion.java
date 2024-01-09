import java.sql.*;

public class Conexion
{
    //Conexion a MySQL en JAVA
    public static void main(String[] args) 
    {    
        Insertar();
        Consultar();
    }
    static public void Consultar()
    {
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
            resultado.close();
            statement.close();
            connexion.close();
        }
        catch(Exception e)
        {
            System.out.println("Excepcion "+e);
        }
    }

    static public void Insertar()
    {
        String db_url="jdbc:mysql://localhost:3306/estudiantes";
        String db_nombre="root";
        String db_password="";
        java.sql.Connection connexion=null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connexion = DriverManager.getConnection(db_url, db_nombre, db_password);
            String consulta="INSERT IGNORE INTO calificaciones (`Id`,`Nombre`,`Cedula`,`Calificacion1`,`Calificacion2`,`Calificacion3`,`Calificacion4`) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement statement2=connexion.prepareStatement(consulta);
            statement2.setInt(1, 112);
            statement2.setString(2, "Jose");
            statement2.setString(3, "672354");
            statement2.setFloat(4, 9.8f);
            statement2.setFloat(5, 9.5f);
            statement2.setFloat(6, 4.5f);
            statement2.setFloat(7, 9.40f);

            int filasInsertadas=statement2.executeUpdate();
            if (filasInsertadas>0)
            {
                System.out.println("\nRegistro insertado correctamente\n");
            }
            else
            {
                System.out.println("\nError al insertar el registro\n");
            }
            statement2.close();
            connexion.close();
        }
        catch(Exception e)
        {
            System.out.println("Excepcion "+e);
        }
    }
}