import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        empleado empleado1 = new empleado("Cristian", 8745, 1200, "Ventas");
        empleado empleado2 = new empleado("Jesus", 3921, 1500, "Tecnología (TI)");
        empleado empleado3 = new empleado();
        empleado3.setNombre("Jorge");
        empleado3.setId_empleado(6578);
        empleado3.setSalario(1800);
        empleado3.setDepartamento("Finanzas");

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("""
                    Menú
                    1. Mostrar detalles del empleado 1
                    2. Mostrar detalles del empleado 2
                    3. Mostrar detalles del empleado 3
                    4. Aumentar 10% salario del empleado 1
                    5. Aumentar 10% salario del empleado 2
                    6. Aumentar 10% salario del empleado 3
                    7. Cambiar departamento del empleado 1
                    8. Cambiar departamento del empleado 2
                    9. Cambiar departamento del empleado 3
                    10. Salir
                    Ingresa una opción:                
                    """
            );
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> empleado1.mostrarinfo();
                case 2 -> empleado2.mostrarinfo();
                case 3 -> empleado3.mostrarinfo();
                case 4 -> empleado1.aumentarSalario(10);
                case 5 -> empleado2.aumentarSalario(10);
                case 6 -> empleado3.aumentarSalario(10);
                case 7 -> empleado1.cambiarDepartamento("Tecnología (TI)");
                case 8 -> empleado2.cambiarDepartamento("Finanzas");
                case 9 -> empleado3.cambiarDepartamento("Ventas");
                case 10 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 10);

        scanner.close();
    }

}




