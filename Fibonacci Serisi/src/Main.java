import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int bas = input.nextInt();
        int toplam, a = 0, b=1;
        for (int i = 1; i <= bas; i++) {
            System.out.print(a + " ");
            toplam = a + b;
            a=b;
            b=toplam;
        }
    }
}