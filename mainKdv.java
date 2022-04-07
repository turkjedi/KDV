package mainKdv;

import java.util.Scanner;

public class mainKdv {
    public static void main(String[] args) {
        double kdvliTutar , kdvTutar , kdvOran = 0.18, tutar ;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz  : ");
        tutar = input.nextDouble();

        kdvTutar = tutar*kdvOran ;
        kdvliTutar = tutar+kdvTutar;
        kdvOran = (tutar >1000 ) ? 0.8 : 0.18 ;

        System.out.println("Kdv'siz Tutar :"+tutar);
        System.out.println("Kdvli Tutar   :" +kdvliTutar);
        System.out.println("Kdv Tutarı    :"+kdvTutar);
        System.out.println("Kdv Oranı     :"+kdvOran);
        System.out.println("Kdv Oranınız 1000tl nin altında 0.18 üstünde ise 0.8 olarak hesaplanır");
    }
}
