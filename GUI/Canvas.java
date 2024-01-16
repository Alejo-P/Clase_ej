import javax.swing.*;
public class Canvas {
    public static void main(String[] args) {
        
        JFrame ventana = new JFrame();
        ventana.setSize(400, 400);
        PanelDibujo panel1= new PanelDibujo();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(panel1);
        
        ventana.setVisible(true);
    }
}
