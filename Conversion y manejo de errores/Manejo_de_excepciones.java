public class Manejo_de_excepciones {
    public static void main(String[] args) {
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
}
