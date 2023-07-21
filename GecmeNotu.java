import java.util.Scanner;

public class GecmeNotu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mat, fiz, turk, kim, muz;
        int toplam = 0;

        System.out.print("Lütfen Matematik Notunu Giriniz: ");
        mat = input.nextInt();

        if ( mat < 0 || mat > 100 )
        {
            toplam = toplam;
        } else {
            toplam += mat;
        }

        System.out.print("Lütfen Fizik Notunu Giriniz: ");
        fiz = input.nextInt();

        if ( fiz < 0 || fiz > 100 )
        {
            toplam = toplam;
        } else {
            toplam += fiz;
        }

        System.out.print("Lütfen Türkçe Notunu Giriniz: ");
        turk = input.nextInt();

        if ( turk < 0 || turk > 100 )
        {
            toplam = toplam;
        } else {
            toplam += turk;
        }

        System.out.print("Lütfen Kimya Notunu Giriniz: ");
        kim = input.nextInt();

        if ( kim < 0 || kim > 100 )
        {
            toplam = toplam;
        } else {
            toplam += kim;
        }

        System.out.print("Lütfen Müzik Notunu Giriniz: ");
        muz = input.nextInt();

        if ( muz < 0 || muz > 100 )
        {
            toplam = toplam;
        } else {
            toplam += muz;
        }

        double ort = toplam / 5;

        if (ort < 55) {
            System.out.print("Sınıfta Kaldınız! Ortalamanız: " + ort);
        } else {
            System.out.print("Sınıfı Geçtiniz! Ortalamanız: " + ort);
        }
    }
}
