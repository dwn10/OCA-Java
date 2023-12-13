package projekte.autoErstellung;

import java.util.Scanner;

public class CarFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the list of manufacturers
        System.out.println("\n************************************");
        System.out.println("Bitte wählen Sie einen Hersteller aus:");
        System.out.println("1. Audi");
        System.out.println("2. Ford");
        System.out.println("3. BMW");

        // Read the user's choice of manufacturer
        int manufacturer = scanner.nextInt();

        // Display the list of available models
        System.out.println("********************************");
        System.out.println("Bitte wählen Sie ein Modell aus:");
        if (manufacturer == 1) {
            System.out.println("1. A1");
            System.out.println("2. A3");
            System.out.println("3. A5");
        } else if (manufacturer == 2) {
            System.out.println("1. Fiesta");
            System.out.println("2. Focus");
            System.out.println("3. Mustang");
        } else if (manufacturer == 3) {
            System.out.println("1. 1 Series");
            System.out.println("2. 2 Series");
            System.out.println("3. 3 Series");
        }

        // Read the user's choice of model1
        int model = scanner.nextInt();

        // Display the list of available options
        System.out.println("********************************");
        System.out.println("Bitte wählen Sie Optionen aus:");
        System.out.println("1. Color");
        System.out.println("2. Transmission");
        System.out.println("3. Kupplung");
        System.out.println("4. Beheizte Sitze");
        System.out.println("5. Winterreifen");
        System.out.println("6. Erste Wartung");
        System.out.println("7. Treibstoffart");
        System.out.println("8. Navigation");

        // Read the user's choice of options
        int[] options = new int[8];
        for (int i = 0; i < options.length; i++) {
            System.out.print("Option " + (i + 1) + ": ");
            options[i] = scanner.nextInt();
        }

        // Calculate the engine displacement based on the horsepower
        int horsepower = 0;
        if (model == 3) {
            System.out.print("Bitte geben Sie die PS-Zahl ein (mindestens 175 PS für Coupés).: ");
            horsepower = scanner.nextInt();
            while (horsepower < 175) {
                System.out.print("Die Leistung muss mindestens 175 PS betragen: ");
                horsepower = scanner.nextInt();
            }
        } else {
            System.out.print("Bitte geben Sie die PS-Zahl ein: ");
            horsepower = scanner.nextInt();
        }
        double displacement = horsepower * 1.75;

        // Display the selected options
        System.out.println("********************************");
        System.out.println("Sie haben die folgenden Optionen ausgewählt:");
        if (options[0] == 1) {
            if (manufacturer == 1) {
                System.out.println("Color: Red, Blue, Green");
            } else if (manufacturer == 2) {
                System.out.println("Color: Black, White");
            } else if (manufacturer == 3) {
                System.out.println("Color: Blue, White");
            }
        }
        if (options[1] == 2) {
            if (manufacturer == 1) {
                System.out.println("Transmission: Automatic, Manual");
            } else if (manufacturer == 2) {
                System.out.println("Transmission: Automatic, Manual");
            } else if (manufacturer == 3) {
                System.out.println("Transmission: Automatic, Manual");
            }
        }
        if (options[2] == 3) {
            if (manufacturer == 1) {
                System.out.println("Kupplung: Yes, No");
            } else if (manufacturer == 2) {
                System.out.println("Kupplung: Yes, No");
            } else if (manufacturer == 3) {
                System.out.println("Kupplung: No");
            }
        }
        if (options[3] == 4) {
            if (manufacturer == 1) {
                System.out.println("Beheizte Sitze: Yes, No");
            } else if (manufacturer == 2) {
                System.out.println("Beheizte Sitze: Yes");
            } else if (manufacturer == 3) {
                System.out.println("Beheizte Sitze: Yes");
            }
        }
        if (options[4] == 5) {
            System.out.println("Winterreifen: Yes");
        }
        if (options[5] == 6) {
            System.out.println("Erste Wartung: Free");
        }
        if (options[6] == 7) {
        }
    }
}