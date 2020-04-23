import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) throws Exception {
        int decimal = 2371;
        System.out.println("Hệ thập phân: " + decimal);
        ArrayList<Integer> result = new ArrayList<>();

        while (decimal >= 1) {
            result.add(decimal % 2);
            decimal = decimal / 2;
        }

        MyStack stack = new MyStack(result.size());
        for (int value : result){
            stack.push(value);
        }

        System.out.print("Kết quả: ");
        int[] binary = new int[result.size()];
        for (int i = 0; i<result.size();i++) {
            binary[i] = stack.pop();
            System.out.print(binary[i]);
        }

    }
}
