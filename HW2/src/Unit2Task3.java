public class Unit2Task3 {
    public static void main(String[] args) {
        int a=1;
        int sum=a; //иначе в текущем решении в сумме не хватает 1
        int shift=2;
          do {
            a = a * shift;
            sum += a;
              }
          while (a<256);
        {
            System.out.println("Сумма последовательности чисел 1, 2, 4, 8...256 равна "+sum);
        }
    }
}
