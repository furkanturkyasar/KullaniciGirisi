import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password, reset, create;

        System.out.print("Kullanici adini giriniz: ");
        userName = input.nextLine();


        if (userName.equals("patika")){
            System.out.print("Sifrenizi giriniz: ");
            password = input.nextLine();
            if (password.equals("java123")){
                System.out.println("Giris Yaptiniz! ");
            }else{
                System.out.println("Sifreniz hatali yeni sifre olustumak ister misiniz:  (evet/hayir)");
                reset = input.nextLine();
                if (reset.equals("evet")){
                    System.out.println("Yeni sifrenizi yaziniz: ");
                    create = input.nextLine();
                    if (create.equals("java123")){
                        System.out.println("Eski sifre ile ayni sifreyi girdiniz! ");

                    }else {
                        System.out.println("Yeni sifreniz olusturuldu! ");
                    }
                }else {
                    System.out.println("Yeni sifre olusturmak istemediniz! ");
                }

            }
        }else {
            System.out.println("Yanlis giris yaptiniz! ");
        }




    }
}
