import java.util.Scanner;
public class DaireninAlanı {
    public static void main(String[] args) {

        int r , a ;
        Scanner inp = new Scanner(System.in);

        System.out.print("Yarıçap Değeri : ");
        r = inp.nextInt();

        System.out.print("Merkez Açı Ölçüsü : ");
        a = inp.nextInt();

        double alan , pi = 3.14;
        alan = ((pi * (r*r) * a) / 360);

        System.out.println("Daire Diliminin ALanı : " + alan);




    }
}
