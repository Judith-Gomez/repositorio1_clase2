package programas;

import java.util.Scanner;

public class Sueldo {
    public static void main(String[] args) {
        // 1. Variables para el empleado y los cálculos
        String nombre;
        double horastrabajadas, tarifaporhora, sueldobruto, descuento, sueldoneto;
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("--- Proyecto Parcial: Cálculo de Sueldo ---");
        
        // 2. Entrada de Datos de Prueba
        System.out.print("Nombre de empleado: ");
        nombre = lectura.nextLine();
        
        System.out.print("Horas trabajadas: ");
        horastrabajadas = lectura.nextDouble();
        
        System.out.print("Tarifa por hora: ");
        tarifaporhora = lectura.nextDouble();
        
        // 3. Fórmulas del Examen
        sueldobruto = horastrabajadas * tarifaporhora;
        descuento = sueldobruto * 0.13; // 13% de descuento (ONP)
        sueldoneto = sueldobruto - descuento;
        
        // 4. Resultados esperados
        System.out.println("---------------------------------------");
        System.out.println("Sueldo bruto: " + sueldobruto);
        System.out.println("Descuento (13%): " + descuento);
        System.out.println("Sueldo Neto a pagar: " + sueldoneto);
    }
}