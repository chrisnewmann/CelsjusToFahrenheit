import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj w przeliczniku stopni Celsjusza na Fahrenheity i na odwrót :)");
        System.out.println("Podaj co chcesz przeliczać: \"C\" czy \"F\" ?");
        Scanner scanner = new Scanner(System.in);
        String cF = scanner.nextLine();
        if (cF.equalsIgnoreCase("C")) {
            System.out.println("Wybrałeś przeliczenie stopni Celsjusza na Fahrenheity");
            System.out.println("Podaj ile stopni Celsjusza chcesz przeliczyć na Fahrenheity?");
            Scanner scannerC = new Scanner(System.in);
            double degressC = scannerC.nextInt();
            double convertedCtoF = degressC * 1.8 + 32;
            System.out.println(degressC + " stopni Celsjusza to " + convertedCtoF + " stopni Fahrenheita");
        } else if (cF.equalsIgnoreCase("F")) {
            System.out.println("Wybrałeś przeliczenie stopni Fahrenheita na Celsjusa");
            System.out.println("Podaj ile stopni Fahrenheita chcesz przeliczyć na Fahrenheita?");
            Scanner scannerF = new Scanner(System.in);
            double degreesF = scanner.nextInt();
            double convertedFtoC = (degreesF - 32) / 1.8;
            System.out.println(degreesF + " stopni Fahrenheita to " + convertedFtoC + " stopni Celsjusza");
        } else {
            System.out.println("Nie znam takiej skali. Podaj C lub F");
        }
    }
}
