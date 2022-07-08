import java.util.Scanner;
public class hesap {
    public static void main(String[] args) {
        int n1, n2, hesap;

        Scanner sonuc = new Scanner(System.in);

        System.out.print("Ilk sayiyi giriniz: ");
        n1 = sonuc.nextInt();

        System.out.print("Ikinci sayiyi giriniz: ");
        n2 = sonuc.nextInt();

        System.out.println("Toplama=1\nCikarma=2\nCarpma=3\nBolme=4");

        System.out.print("Seciminiz: ");
        hesap = sonuc.nextInt();

        switch (hesap){
            case 1:
                System.out.println("Sonuc: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Sonuc: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Sonuc: " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Sifira bolunemez.");
                } else if (n1 == 0) {
                    System.out.println("Sonuc: 0");
                } else {
                    System.out.println("Sonuc: " + (n1 / n2));
                }
                break;

            default:
                System.out.println("Hatali Secim Yaptiniz,Lutfen Tekrar Deneyiniz");
        }

    }
}
