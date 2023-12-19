import java.util.ArrayList;
import java.util.Scanner;
public class Manejo_de_excepciones {
    public static void main(String[] args)
    {
        lista();
    }
    static public void manejo()
    {
        /*try
        {
            Este bloque se ejecutara (y generara una excepcion si fuera el caso)
        }
        catch
        {
            Aqui se manejara la excepciongenerada en el bloque try
        }
        finally
        {
            Se ejecutara independientemente de si se genero o no una excepcion
        }*/

        try
        {
            String cadena="cuarenta";
            int numeros=Integer.parseInt(cadena);
            System.out.println("Numero: "+numeros);
        }
        catch (Exception e)
        {
            System.out.println("No se pudo convertir la cadena");
        }
        finally
        {
            System.out.println("Finalizacion del bloque");
        }
        System.out.println("Finalizacion exitosa");
    }
    static public void IMC()
    {
        Scanner sc = new Scanner(System.in);
        float peso, altura, imc;
        try
        {
            System.out.print("Ingresa tu masa en KG >");
            peso = sc.nextFloat();
            while (peso<=0)
            {
                System.out.print("Ingresa un valor positivo >");
                peso = sc.nextFloat();
            }
            System.out.print("Ingrese su estatura en metros >");
            altura = sc.nextFloat();
            while (altura <= 1.5)
            {
                System.out.print("Ingrese una estatura valida > ");
                altura = sc.nextFloat();
            }
            imc = (float) (peso / (Math.pow(altura,2)));
            System.out.printf("Tu IMC es %.3f\n",imc);
        }
        catch (Exception e)
        {
            System.out.println("Ingreso erroneo de valores!");
        }
        finally
        {
            System.out.println("Fin del programa!");
        }
        sc.close();
    }
    static public void lista()
    {
        ArrayList<String> lista1=new ArrayList<>();
        lista1.add("Hola");
        lista1.add(" a tooos");
        lista1.add("Adios");
        for (int i=0;i<lista1.size(); i++)
        {
            System.out.println(lista1.get(i));
        }
    }
}
