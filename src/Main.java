import java.util.Scanner;

public class VisitorInfoApp {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables para la información del visitante

        // Datos generales del visitante
        String fullName;
        byte age;
        char gender;

        // Datos de las visitas
        int totalVisits = 0;
        float totalVisitTime = 0;
        boolean isAdult;

        System.out.println("Ingrese la información general del visitante:");

        System.out.print("Nombre completo: ");
        fullName = scanner.nextLine();

        System.out.print("Edad: ");
        age = scanner.nextByte();

        System.out.print("Inicial del género (M/F/O): ");
        gender = scanner.next().charAt(0);

        // Determinar si el visitante es mayor de edad
        isAdult = age >= 18;

        System.out.println("\nIngrese la información de las visitas realizadas durante la semana:");

        for (int i = 1; i <= 7; i++) {
            System.out.println("\nDía " + i + ":");
            System.out.print("Número de visitas realizadas: ");
            int dailyVisits = scanner.nextInt();

            for (int j = 1; j <= dailyVisits; j++) {
                System.out.println("\tVisita " + j + ":");
                System.out.print("\tTiempo estimado de visita (en horas): ");
                float visitTime = scanner.nextFloat();

                // Acumular datos de las visitas
                totalVisits++;
                totalVisitTime += visitTime;
            }
        }

        // Calcular tiempo promedio de visita
        float averageVisitTime = totalVisits > 0 ? totalVisitTime / totalVisits : 0;

        // Mostrar el resumen de la información
        System.out.println("\nResumen de la información del visitante:");
        System.out.println("Nombre completo: " + fullName);
        System.out.println("Edad: " + age + " (" + (isAdult ? "Mayor" : "Menor") + " de edad)");
        System.out.println("Género: " + gender);
        System.out.println("Total de visitas realizadas: " + totalVisits);
        System.out.println("Tiempo promedio de estadía: " + averageVisitTime + " horas");

        // Cerrar el Scanner
        scanner.close();
    }
}
