import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km ;
        System.out.println("Lütfen Kaç Km Gideceğinizi Yazınız :");
        km = input.nextInt();

       double tutar = 10+(km*2.20);

        if (km<=4){
            System.out.println("Ödeceğiniz Tutar 20tl");
        }
        else {
            System.out.println("Ödeceğiniz Tutar :"+tutar);
        }
    }
}
