import java.util.Scanner;
public class Clase_19 {
    public static void main(String[] args)
    {
        Cast();   
    }
    static public void tema()
    {
        int [] pares={2, 4, 6, 8, 12, 14, 16, 18};
        String [] marcas={"Mercedes", "Nissan", "Kia", "Chevrolet", "Toyota", "Chery", "Hyundai", "Renault", "Shineray"};
        marcas[7]="Buses";
        System.out.println("La longitud de la arreglo es: "+marcas.length);
        for (int i=0; i<marcas.length; i++)
        {
            System.out.printf("Marca: %s\n",marcas[i]);
        }
        //Arreglos de enteros de 2 dimensiones
        int [][] matriz = {{3,5,7, 4, 3, 7, 3}, {1,2,4, 7, 8, 6, 0}};
        System.out.println("longitud de una fila: "+matriz[0].length); //Longitud de una fila
        System.out.println("longitud: "+matriz.length);
        System.out.println("Accediendo a la direccion de memoria elemento 0 de la matriz: "+ matriz[0]); //Direccion de memoria
        System.out.println("Accediendo al elemento 0 de la matriz: "+ matriz[0][0]); // Acceder a un elemento
        for (int j=0;j<matriz.length;j++) //Iterar entre cada elemento de la matriz (cada fila de la matriz)
        {
            for (int k=0;k<matriz[j].length;k++) //iterar entre cada elemento de una fila de la matriz
            {
                System.out.print(matriz [j] [k]+ " "); //Imprimir los elementos de la fila de la matriz
            }
            System.out.println(); //imprimir un salto de linea
        }
    }
    static public void Ejercicio1()
    {
        Scanner sc=new Scanner(System.in);
        //Arreglos
        String [] materias=new String[3];
        for (int i=0; i<materias.length; i++)
        {
            System.out.printf("Ingrese el nombre de la materia %d:", i);
            materias[i]=sc.nextLine();
        }
        sc.nextLine();
        for (int i=0; i<materias.length; i++)
        {
            System.out.printf("Ingrese el numero de calificaciones para la materia %s >", materias[i]);
            int cantidad=sc.nextInt();
            Double [] Calificaciones=new Double[cantidad];
            for (int j=0; j<cantidad; j++)
            {
                System.out.printf("Ingrese la calificacion %d para la materia %s >", j, materias[i]);
                Calificaciones[j]=sc.nextDouble();
            }
        } 
    }
    static public void Cast()
    {
        int numero=2;
        // De entero a flotante
        double decimal=numero, otronumero=3.0;
        // De int a long
        long otrodecimal=(long)decimal;
        // De byte a short
        byte binario=110;
        short otrobinario=binario;
        System.out.printf("Mi entero es %d y el numero flotante es %.2f\n", numero, decimal);
        System.out.printf("Y mi otro numero flotante era %.2f\n", otronumero);
        System.out.printf("Pero si lo convierto a long me queda %d\n", otrodecimal);
        System.out.printf("Ahora si que se ve que puedo pasar un byte a un short, este tiene valor de %d\n", otrobinario);
    }
}
