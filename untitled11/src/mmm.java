import java.util.Scanner;
public class mmm {
    public static void main(String[] args) {
        int a, b,c, select,sec;

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        a = input.nextInt();
        System.out.println(a);
        System.out.println("Bir sayi giriniz: ");
        b = input.nextInt();
        System.out.println(b);
        System.out.println("1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme ");
        System.out.println("Seçiminiz: ");
        select = input.nextInt();
        switch (select) {
            case 1:
                System.out.println("Toplama: " + (a + b));
                break;
            case 2:

                System.out.println("Çıkarma: " + (a - b));
                break;
            case
                    3:

                System.out.println("Çarpma: " + (a * b));
break;
            case 4:
               System.out.println("Bölme: " +(a/b));

                break;


            default:
                System.out.println("Geçersiz sayi girdiniz!");

        }
    } }
