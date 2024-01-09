import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

// Press Shift twice to open the Search Everywhere dialog and type show whitespaces,
// then press Enter. You can now see whitespace characters in your code.
public class conmein {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        String dbURL="jdbc:msql://localhost:3306/estudiantes";
        String dbUserName="root";
        String dbpassword="";
        try{
            Connection conn= DriverManager.getConnection(dbURL,dbUserName,dbpassword);
        }catch (SQLException exception){}

    }
}
