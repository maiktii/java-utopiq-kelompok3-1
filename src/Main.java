import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Masukkan hari keterlambatan ('done' to finish): ");
        while (input.hasNextInt()){
            list.add(input.nextInt());
        }

        input.close();

        String status;
        int totalDenda = 0;

        for (int i=0; i<=list.size()-1; i++){
            totalDenda +=  (list.get(i) * 1000);
        }

        if (totalDenda > 50000){
            status = "Blokir Akun";
        } else{
            status = "Aktif";
        }

        System.out.println("Status : "+status);
        System.out.println("Total Denda "+totalDenda);

    }
}