import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class pendeteksikecepatan {
    public static void main(String[] args)throws IOException {
        ArrayList<Integer>kecepatan1=new ArrayList<>();

        System.out.print("masukan angka =");
        Scanner inputuser = new Scanner(System.in);
        int number = inputuser.nextInt();
        int batas_atas = 200;

        for (int i=0;i<200;i++){
            int kecepatan =kecepatan1.get(0);
            kecepatan1.add(kecepatan);
        }

        System.out.println("kecepatan antara 80 km/jam dan 100 km/jam");
        for (int kecepatan:kecepatan1){
            if(kecepatan>=80 && kecepatan <= 100){
                System.out.println(kecepatan+ "km/jam");
            }
        }
        System.out.println("kecepatan dibawah 80 km/jm");
        for (int kecepatan: kecepatan1 ){
            if(kecepatan <80){
                System.out.println(kecepatan + "km/jm");
            }
        }

    }
}
