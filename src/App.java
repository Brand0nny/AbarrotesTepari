import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-------------- Bienvenidos a Abarrotes Tepari --------------\n");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione que quiere hacer");
            System.out.println("1. Ver Productos");
            System.out.println("2. Salir\n");
            System.out.println("Ingrese la opcion: ");

            String opcion = sc.next();

            if (opcion.equals("1")) {
                System.out.println("Has seleccionado ver productos.");
            }

            else if (opcion.equals("2")) {
                System.out.println("Has seleccionado ver salir.");
                break;
            }

            else {
                System.out.println("No existe esa opcion.");
            }
        }

        sc.close();
        System.out.println("Adios.");
    }
}
