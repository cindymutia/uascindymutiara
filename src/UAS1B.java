import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void Main(String[] args) throws IOException {
        ArrayList<String> g = new ArrayList<>();
        char[] karakter_pertama;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("imput jumlah data yang akan di proses : ");
        int u = Integer.parseInt(reader.readLine());
        karakter_pertama = new char[u];
        int counter = 0;
        for (int index = 0; index < u; index++) {
            counter++;
            System.out.print("masukan nama"+counter + " : ");
            String nama = reader.readLine();
             g.add (nama);
            karakter_pertama[index]= g.get(index).charAt(index);
        }
        for(String d : g){
            System.out.print(g + " ");
        }
        for(char karakter : karakter_pertama){
            System.out.println(karakter);
        }
        }

    }

