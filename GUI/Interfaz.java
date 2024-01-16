import javax.swing.*;
import java.awt.*;
public class Interfaz
{
    public static void main(String[] args)
    {
        JFrame root = new JFrame("Formulario 1");
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel ventana = new JPanel(new GridBagLayout());
        GridBagConstraints pisicion = new GridBagConstraints();
        //Crear los componentes de la interfaz
        JLabel Numero1 = new JLabel("Ingrese numero 1: ");
        Numero1.setSize(40, 26);
        JTextField Entrada_numero = new JTextField(4);
        JLabel Numero2= new JLabel("Ingrese numero 2:");
        JTextField Entrada_numero2 = new JTextField(4);
        JLabel resultado = new JLabel("Resultado");
        JTextArea Area_resul = new JTextArea(5,20);
        JButton Boton_suma = new JButton("Sumar");
        JButton Boton_resta = new JButton("Restar");
        JButton Boton_multiplicacion = new JButton("Multiplicar");
        JButton Boton_division = new JButton("Dividir");
        //Boton_suma.setPreferredSize(new Dimension(30, 26));
        //Agregar a la ventana (organizar por filas y columnas)
        pisicion.fill = GridBagConstraints.HORIZONTAL;
        pisicion.gridx = 0;
        pisicion.gridy = 0;
        ventana.add(Numero1,pisicion);
        pisicion.gridx = 1;
        pisicion.gridy = 0;
        ventana.add(Entrada_numero,pisicion);
        pisicion.fill = GridBagConstraints.HORIZONTAL;
        pisicion.gridx = 0;
        pisicion.gridy = 1;
        ventana.add(Numero2,pisicion);
        pisicion.gridx = 1;
        pisicion.gridy = 1;
        ventana.add(Entrada_numero2,pisicion);
        pisicion.gridx = 0;
        pisicion.gridy = 2;
        ventana.add(Boton_suma,pisicion);
        pisicion.gridx = 1;
        pisicion.gridy = 2;
        ventana.add(Boton_resta, pisicion);
        pisicion.gridx = 0;
        pisicion.gridy = 3;
        ventana.add(Boton_multiplicacion, pisicion);
        pisicion.gridx = 1;
        pisicion.gridy = 3;
        ventana.add(Boton_division, pisicion);
        pisicion.anchor = GridBagConstraints.CENTER;
        pisicion.gridx = 0;
        pisicion.gridy = 4;
        ventana.add(resultado,pisicion);
        pisicion.gridx = 0;
        pisicion.gridy = 4;
        pisicion.gridwidth = 2;
        ventana.add(Area_resul,pisicion);
        //Asignar el ActionListener para el botón sumar
        Boton_suma.addActionListener((e) -> {
            try
            {
                Double num1=Double.parseDouble(Entrada_numero.getText());
                Double num2=Double.parseDouble(Entrada_numero2.getText());
                String Resultado="La suma es "+ (num1+num2);
                System.out.printf("El resultado de la sunma es: %.2f", (num1 + num2));
                Area_resul.setForeground(Color.BLACK);
                Area_resul.setText(Resultado);
            }
            catch (NumberFormatException nfe)
            {
                Area_resul.setForeground(Color.RED);
                Area_resul.setText("Ingrese valores numericos");
            }
        });
        //Boton resta
        Boton_resta.addActionListener((e) -> {
            try
            {
                Double num1=Double.parseDouble(Entrada_numero.getText());
                Double num2=Double.parseDouble(Entrada_numero2.getText());
                String Resultado="La resta es "+ (num1-num2);
                System.out.printf("El resultado de la sunma es: %.2f", (num1 - num2));
                Area_resul.setForeground(Color.BLACK);
                Area_resul.setText(Resultado);
            }
            catch (NumberFormatException nfe)
            {
                Area_resul.setForeground(Color.RED);
                Area_resul.setText("Ingrese valores numericos");
            }
        });
        //Boton multiplicacion
        Boton_multiplicacion.addActionListener((e) -> {
            try
            {
                Double num1=Double.parseDouble(Entrada_numero.getText());
                Double num2=Double.parseDouble(Entrada_numero2.getText());
                String Resultado="La multiplicacion es "+ (num1*num2);
                System.out.printf("El resultado de la sunma es: %.2f", (num1 * num2));
                Area_resul.setForeground(Color.BLACK);
                Area_resul.setText(Resultado);
            }
            catch (NumberFormatException nfe)
            {
                Area_resul.setForeground(Color.RED);
                Area_resul.setText("Ingrese valores numericos");
            }
        });
        //Boton division
        Boton_division.addActionListener((e) -> {
            try
            {
                Double num1=Double.parseDouble(Entrada_numero.getText());
                Double num2=Double.parseDouble(Entrada_numero2.getText());
                if (num2==0)
                {
                    throw new ArithmeticException("No puedes dividir para cero!");
                }
                String Resultado="La division es "+ (num1/num2);
                System.out.printf("El resultado de la sunma es: %.2f", (num1 / num2));
                Area_resul.setForeground(Color.BLACK);
                Area_resul.setText(Resultado);
            }
            catch (NumberFormatException nfe)
            {
                Area_resul.setForeground(Color.RED);
                Area_resul.setText("Ingrese valores numericos");
            }
            catch (ArithmeticException ae)
            {
                Area_resul.setForeground(Color.RED);
                Area_resul.setText(ae.getMessage());
            }
        });
        root.getContentPane().add(ventana);
        root.pack();
        root.setVisible(true);
    }
}