package programas;

import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {
        // Declaramos el nombre del vendedor
        String vendedor;
        // Declaramos las variables para las 3 ventas, el promedio (pv) y el total (tv)
        double venta1, venta2, venta3, pv, tv;
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Creación de mi primer programa");
        
        // Pedimos los datos
        System.out.print("Ingresar venta1: ");
        venta1 = lectura.nextDouble();
        
        System.out.print("Ingresar venta2: ");
        venta2 = lectura.nextDouble();
        
        System.out.print("Ingresar venta3: ");
        venta3 = lectura.nextDouble();
        
        // Fórmulas matemáticas
        tv = venta1 + venta2 + venta3; // Sumamos las tres
        pv = tv / 3;                   // Dividimos el total entre 3
        
        // Mostramos los resultados finales
        System.out.println("El total de ventas es: " + tv);
        System.out.println("El promedio de venta es: " + pv);
    }
}