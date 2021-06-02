public class Unit2Task7 {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        {
            System.out.println("Вывод нечетных чисел от 1 до 99 включительно");
        }
        while (a <= 99) {
            sum += a;
            System.out.print(a + " ");
            a = a + 2;
        }
        {
            System.out.println();
            System.out.println("Сумма последовательности чисел равна "+sum);
        }

    }
}