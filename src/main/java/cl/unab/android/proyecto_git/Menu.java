package cl.unab.android.proyecto_git;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        int opcion = 0;
        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Crear Usuario");
            System.out.println("2. Eliminar Usuario");
            System.out.println("3. Salir");
            System.out.print("\nSeleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("\nOpción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 3);
    }
}

