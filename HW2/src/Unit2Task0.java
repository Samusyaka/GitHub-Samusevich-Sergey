public class Unit2Task0 {
    public static void main (String[] args) {
        int a=0;
        System.out.println("Вывод через while");
        while (a<=10){
            System.out.print(a+" ");
            a++;
        }
        {   System.out.println();
            System.out.println("---------------------->");
        a=0;}
        {
            System.out.println("Вывод через do while");
        }
        do {
            System.out.print(a+" ");
            a++;
        }
        while (a<=10);
        {System.out.println();
         System.out.println("---------------------->");
        }
        {
            System.out.println("Вывод через for");
        }
        for (a=0; a<=10; a++){
            System.out.print(a+" ");
        }

    }
}
