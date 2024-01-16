import javax.swing.*;
import java.awt.*;
public class PanelDibujo extends JPanel {
    public void PaintComponent(Graphics g)
    {
        super.paintComponent(g); //llamada a la clase padre para que se muestren los colores de fondo y borde
        int ancho = getWidth(); //obtener el ancho del panel
        int alto = getHeight(); //obtener el alto del panel

        g.drawLine(0, 0, ancho, alto);
        g.drawLine(0, alto, 0, alto);
        g.drawString("Mi nombre", ancho, alto);
        g.fillOval(15, 15, 100, 250);
    }
}
