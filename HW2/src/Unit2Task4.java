import java.util.Scanner;

public class Unit2Task4 {
    public static void main(String[] args) {
        int a, b;
        int p = 0;

        Scanner digit = new Scanner(System.in);
        System.out.println("Введите производную A");
        a = digit.nextInt();
        System.out.println("Введите производную В");
        b = digit.nextInt();
        int n;
                if (a == 0 || b == 0) {
            System.out.println(a +"*"+ b +"="+p);
        } else {
            for (n = 1; n <= Math.abs(b); n++) {
                p = p + a;
            }
            if (b < 0) {
                p = -p;
            }
            System.out.println(a + "*" + b + "=" + p);
        }
        }
    }
