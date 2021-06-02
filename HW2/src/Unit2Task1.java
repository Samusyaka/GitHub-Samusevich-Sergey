public class Unit2Task1 {
    public static void main(String[] args) {
        int d;
        float s = 10;
        float total = 10; //1 день
        for (d = 2; d <= 7; d++) { //начиная со 2-го дня
            s = (float) (s * 1.1);
            total = s + total;
        }
            System.out.println("За 7 дней пробег спортсмена составит " + total + " км");

        }

    }
