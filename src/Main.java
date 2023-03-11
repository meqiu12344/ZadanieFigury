import figury.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<interfaceFigury> figury = new ArrayList<>();

        System.out.print("Podaj długość promienia koła: ");
        double r = scanner.nextDouble();

        System.out.println("Podaj 2 długości boków trójkąta prostokątnego (boki przy kącie prostym)");
        System.out.print("a: ");
        double trojkatA = scanner.nextDouble();
        System.out.print("b: ");
        double trojkatB = scanner.nextDouble();

        System.out.println("Podaj długości boków prostokąta");
        System.out.print("a: ");
        double prostokatA = scanner.nextDouble();
        System.out.print("b: ");
        double prostokatB = scanner.nextDouble();


        figury.add(new Kolo(r));
        figury.add(new Trojkat(trojkatA, trojkatB));
        figury.add(new Prostokat(prostokatA, prostokatB));

        for (interfaceFigury f : figury){
            System.out.println("------------------");
            System.out.println(f.getClass().getSimpleName());
            System.out.println(" - Obwód: "+f.getPerimeter());
            System.out.println(" - Powierzchnia: "+f.getArea());
        }

    }
}