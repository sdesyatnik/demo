import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("введите математический пример:");
        int a = in.nextInt();
        String znak = in.next();
        int b = in.nextInt();
        if (a > 10 || b > 10) {
            throw new Exception("не верный ввод");
        }
            if (znak.equals("+")) {
                int otvet = a + b;
                System.out.println(otvet);
            } else if (znak.equals("-")) {
                int otvet = a - b;
                System.out.println(otvet);
            } else if (znak.equals("*")) {
                int otvet = a * b;
                System.out.println(otvet);
            } else if (znak.equals("/")) {
                int otvet = a / b;
                System.out.println(otvet);
            } else {
                throw new Exception("не верный ввод");
            }

        }
    }