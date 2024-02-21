
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu (kg) giriniz: ");
        double kilo = input.nextDouble();
        System.out.print("Lütfen boyunuzu (m) giriniz: ");
        double boy = input.nextDouble();

        // Vücut kitle endeksi (BMI) hesaplama formülü.
        double vucutKitleEndeksi = kilo / (boy * boy) ;
        System.out.print("Vücut Kitle Endeksiniz (BMI) :  "+ vucutKitleEndeksi);

    // Vücut Kitle Endeksi durumunu belirtme.

         String durum =
                vucutKitleEndeksi <  18.5 ? "Zayıf" :
                vucutKitleEndeksi < 24.9 ? "Normal":
                vucutKitleEndeksi < 30 ? "Fazla Kilolu":
                 "Obez";


                System.out.println("Durum : " + durum ) ;


    }
}