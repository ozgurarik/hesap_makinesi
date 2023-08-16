import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //hesap makinesi programı
        //n1 birinci sayı , n2 ikinci sayı.
        double n1, n2;
        int select;
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        n1 = input.nextDouble();
        System.out.print("2. sayıyı giriniz: ");
        n2 = input.nextDouble();
        System.out.print("1- toplama\n2- çıkarma\n3- çarpma\n4- bölme\nseçiminizi yapınız:");
        select = input.nextInt();

        /*if (select == 1) {
            System.out.print("Sonuç : " + (n1 + n2));
        } else if (select == 2) {
            System.out.print("sonuç : " + (n1 - n2));
        } else if (select == 3) {
            System.out.print("sonuç : " + (n1 * n2));
        } else if (select == 4) {
            if (n2 != 0) {
                System.out.print("sonuç : " + (n1 / n2));
            } else {
                System.out.print("bölme işleminde sıfıra bölüm tanımsızdır. işleminizi tekrar yapınız.");
            }
        } else {
            System.out.print("yanlış işlem yaptınız tekrar deneyin. ");
        }*/

        switch (select) {
            case 1:
                System.out.print("Sonuç : " + (n1 + n2));
                break;
            case 2:
                System.out.print("Sonuç : " + (n1 - n2));
                break;
            case 3:
                System.out.print("Sonuç : " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.print("Sonuç : " + (n1 / n2));
                } else {
                    System.out.print("bölme işleminde sıfıra bölüm tanımsızdır.tekrar deneyiniz.");
                }
                break;
            default:
                System.out.print("hatalı giriş yaptınız. ");
        }
    }
}

