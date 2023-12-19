public class Clase_19 {
    public static void main(String[] args) {
        int [] pares={2, 4, 6, 8, 12, 14, 16, 18};
        String [] marcas={"Mercedes", "Nissan", "Kia", "Chevrolet", "Toyota", "Chery", "Hyundai", "Renault", "Shineray"};
        marcas[7]="Buses";
        System.out.println("La longitud de la arreglo es: "+marcas.length);
        for (int i=0; i<marcas.length; i++)
        {
            System.out.printf("Marca: %s\n",marcas[i]);
        }
        //Arreglos de enteros de 2 dimensiones
        int [][] matriz = {{3,5,7}, {1,2,4}};
        System.out.println("longitud de una fila: "+matriz[0].length); //Longitud de una fila
        System.out.println("longitud: "+matriz.length);
        System.out.println("Accediendo a la direccion de memoria elemento 0 de la matriz: "+ matriz[0]); //Direccion de memoria
        System.out.println("Accediendo al elemento 0 de la matriz: "+ matriz[0][0]); // Acceder a un elemento
        for (int j=0;j<matriz.length;j++) //Iterar entre cada elemento de la matriz (filas)
        {
            for (int k=0;k<matriz[j].length;k++) //iterar entre cada elemento de una fila de la matriz
            {
                System.out.print(matriz [j] [k]+ " "); //Imprimir los elementos de la fila de la matriz
            }
            System.out.println(); //imprimir un salto de linea
        }
    }
}
