import java.util.Scanner;

public class praktek {
    public static void main(String[] args) {
        String nama;
        int umur;
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan nama: ");
        nama = sc.nextLine();
        System.out.println("masukkan umur");
        umur = sc.nextInt();

        System.out.println("nama: " +nama);
        System.out.println("umur: " +umur);
    }
}
