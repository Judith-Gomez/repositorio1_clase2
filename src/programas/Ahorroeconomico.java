package programas;

import java.util.Scanner;

public class Ahorroeconomico {
    public static void main(String[] args) {
        // 1. Variables para texto y números
        String nombre, cargo;
        double ingreso, gasto, ahorroMensual, ahorroAnual;
        
        Scanner lectura = new Scanner(System.in);
        
        // 2. Entrada de datos
        System.out.println("Registro de Ahorro del Empleado");
        
        System.out.print("Nombre del empleado: ");
        nombre = lectura.nextLine(); // Usamos nextLine para texto
        
        System.out.print("Cargo del empleado: ");
        cargo = lectura.nextLine();
        
        System.out.print("Ingresos del empleado: ");
        ingreso = lectura.nextDouble();
        
        System.out.print("Gastos del empleado: ");
        gasto = lectura.nextDouble();
        
        // 3. Fórmulas (Cálculos)
        ahorroMensual = ingreso - gasto;
        ahorroAnual = ahorroMensual * 12;
        
        // 4. Resultados
        System.out.println("-------------------------------");
        System.out.println("RESULTADOS PARA: " + nombre);
        System.out.println("Ahorro mensual: " + ahorroMensual);
        System.out.println("Ahorro anual proyectado: " + ahorroAnual);
    }
}
