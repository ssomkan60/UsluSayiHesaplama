import java.util.Scanner;
public class DongulerUsluSayilarOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,k;
        int i=1;
        int toplam=1;

        System.out.print("Üssü Alınacak Sayı:");
        n = input.nextInt();
        System.out.print("Üs Değeri:");
        k = input.nextInt();

        for (i=1; i<=k;i++){
            toplam*=n;
        }
        System.out.println("Toplam:"+toplam);
    }
}
