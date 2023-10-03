import java.util.Scanner;
public class Pemilihan2Percobaan112_1 {
   public static void main(String[] args) {
    Scanner input12 = new Scanner(System.in);
    System.out.println("Masukkan Tahun : ");
    int tahun = input12.nextInt();
    if ((tahun % 4) == 0) {
        if ((tahun % 100) != 0){
        System.out.println("Tahun Kabisat");
        } else if ((tahun % 100) == 0) {
        System.out.println("Bukan Tahun Kabisat");
        }
    } else 
    System.out.println("Bukan Tahun Kabisat");
}
} 

