import java.util.Scanner;

public class NotOrtalamasiHesaplayici {

        public static void main(String[] args){
            Scanner scanner= new Scanner(System.in);
            int vize1;
            int vize2;
            int finalnotu;
            double ortalama;

            System.out.println("Vize 1 notunuzu giriniz.");
            vize1= scanner.nextInt();
            System.out.println("Vize 2 notunuzu giriniz.");
            vize2= scanner.nextInt();
            System.out.println("Final notunuzu giriniz.");
            finalnotu= scanner.nextInt();

            ortalama=((vize1*0.3)+(vize2*0.3)+(finalnotu*0.4));
            System.out.println("Ortalamanız:"+ortalama);

            if(ortalama<=100&&ortalama>=90){
                System.out.println("AA ile geçtiniz");
            }
            else if(ortalama<90&&ortalama>=85) {
                System.out.println("BA ile geçtiniz");
            }
            else if(ortalama<85&&ortalama>=80) {
                System.out.println("BB ile geçtiniz");
            }
            else if(ortalama<80&&ortalama>=75) {
                System.out.println("CB ile geçtiniz");
            }
            else if(ortalama<75&&ortalama>=70) {
                System.out.println("CC ile geçtiniz");
            }
            else if(ortalama<70&&ortalama>=65) {
                System.out.println("DC ile geçtiniz");
            }
            else if(ortalama<65&&ortalama>=60) {
                System.out.println("DD ile geçtiniz");
            }
            else if(ortalama<60&&ortalama>=55) {
                System.out.println("FD ile geçemediniz...");
            }
            else if(ortalama<55&&ortalama>=50) {
                System.out.println("FF ile geçemediniz...");
            }
        }
    }
