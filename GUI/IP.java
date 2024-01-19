import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;
public class IP {
    static String ruta = "C:\\Users\\POO\\Documents\\GitHub\\Clase_ej\\GUI\\InformacionIP.txt";
    public static void main(String [] args) {
        JFrame frame = new JFrame("Direccion Ip");
        JButton ObtenerIp = new JButton("Obtener la direccion IP");
        JButton Cargar_info = new JButton("Cargar informacion");
        JLabel labelIP;
        //Crear el Label de la Dirección IP
        labelIP = new JLabel("Nostrar tu IP");
        JPanel Panel1=new JPanel();
        //Añadir un JTextArea
        JTextArea texto= new JTextArea(5, 20);

        //Asignamos las propiedades al TextField
        texto.setEditable(false);
        texto.setBackground(Color.WHITE);
        //Poner borde al TextField
        texto.setBorder(BorderFactory.createLineBorder(Color.black));



        //Agregamos un Action Listener a nuestro Boton
        ObtenerIp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String ip = InetAddress.getLocalHost().getHostAddress();
                    String nombre = InetAddress.getLocalHost().getHostName();
                    String formato=String.format("Tu maquina es %s\nTu IP es: %s", nombre, ip);
                    texto.setText(formato);
                    Archivotxt(formato, ruta);
                }
                catch (UnknownHostException ex){
                    System.out.println("No se puede obtener la dirección IP.");
                }
            }
        });

        Cargar_info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String contenido=CargarInfo(ruta);
                texto.setText(contenido);
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Agregamos los componentes a la ventana
        Panel1.add(labelIP);
        Panel1.add(ObtenerIp);
        Panel1.add(Cargar_info);
        Panel1.add(texto);
        frame.add(Panel1, BorderLayout.CENTER);
        //Posicionando los elementos en la pantalla
        frame.pack();
        frame.setVisible(true);
    }

    public static void Archivotxt(String contenido, String ruta) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            bw.write(contenido);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String CargarInfo(String ruta)
    {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            List <String> lineas = new ArrayList<>();
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
            String textoString=String.join("\n", lineas);
            return textoString;
        } catch (IOException e) {
            return "Error al leer el archivo: " +e.getMessage();
        }
    }
}
