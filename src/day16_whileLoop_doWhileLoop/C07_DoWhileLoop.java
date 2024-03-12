package day16_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C07_DoWhileLoop {
    public static void main(String[] args) {

        // soru3- kullanicidan bir pozitif sayi isteyin
        //sayinin tam kare olup olmadigini bulunuz
        //tam kare ise true degilse false yazdiriniz
        // ornek : input :16 output : 4

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen pozitif bir sayi giriniz");
        int sayi = scanner.nextInt();

        int karekok = 1;
        boolean tamKaremi = false ;

        while (karekok * karekok <= sayi) {
            if (karekok * karekok == sayi){
                tamKaremi = true;
            }
            karekok++;
        }
        System.out.println(tamKaremi);


    }
}
