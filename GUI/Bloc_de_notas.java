import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Bloc_de_notas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bloc de Notas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Crea el panel del editor y lo agrega a la ventana
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints align = new GridBagConstraints();
        JTextField editor = new JTextField(10);
        align.gridx=0;align.gridy=0;align.weightx=4;
        panel.add(editor,align);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
