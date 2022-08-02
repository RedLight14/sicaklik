import java.util.Scanner;

public class sıcaklık {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int derece;

        System.out.print("Sicaklik giriniz : ");
        derece=inp.nextInt();

        if(derece<5)
        {
            System.out.print("Kayak yapmaya gidebilirsiniz.");
        }
        if(derece>=5&&derece<15)
        {
            System.out.print("Sinemaya gidebilirsiniz.");
        }
        if(derece>=15&&derece<25)
        {
            System.out.print("Piknik yapmaya gidebilirsiniz.");
        }
        if(derece>=25)
        {
            System.out.print("Yüzmeye gidebilirsiniz.");
        }
    }
}
