package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car auto = new Car("Suzuki", "Swift", 2012, 50);

        while (true) {
            System.out.println("\n--- SmartCar Management System ---");
            System.out.println("1. Motor starten");
            System.out.println("2. Motor stoppen");
            System.out.println("3. Beschleunigen");
            System.out.println("4. Verlangsamen");
            System.out.println("5. Auto stoppen");
            System.out.println("6. Tanken");
            System.out.println("7. Wartung überprüfen");
            System.out.println("8. Auto-Info anzeigen");
            System.out.println("9. Beenden");
            System.out.print("Wählen Sie eine Option: ");

            int auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1:
                    auto.motorStarten();
                    break;
                case 2:
                    auto.motorStoppen();
                    break;
                case 3:
                    System.out.print("Geschwindigkeitserhöhung eingeben: ");
                    int erhöhung = scanner.nextInt();
                    auto.beschleunigen(erhöhung);
                    break;
                case 4:
                    System.out.print("Geschwindigkeitsverringerung eingeben: ");
                    int verringerung = scanner.nextInt();
                    auto.verlangsamen(verringerung);
                    break;
                case 5:
                    auto.stoppen();
                    break;
                case 6:
                    System.out.print("Menge des zu tankenden Kraftstoffs eingeben: ");
                    int menge = scanner.nextInt();
                    auto.tanken(menge);
                    break;
                case 7:
                    auto.wartungÜberprüfen();
                    break;
                case 8:
                    System.out.println(auto);
                    break;
                case 9:
                    System.out.println("Beenden...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ungültige Option. Bitte versuchen Sie es erneut.");
            }
        }
    }
}
