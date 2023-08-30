package hardSkills_2023_02_28;

import java.util.Scanner;

class App {
    public static void main(String[] args) {

        //System.out.println(findFactorial(findMaxNumber()));
        Scanner kb = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int number = kb.nextInt();
        System.out.println(findFactorialRecursive(number));

    }

    public static double findFactorial(int a) {
        if (a == 0)
            return 1;
        double factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial = i;
        }
        return factorial;
    }

    public static double findFactorialRecursive(double a){
        if (a == 0)
            return 1;
        else
            return a*findFactorialRecursive(a -1);

    }

    public static int findMaxNumber() {
        Scanner kb = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        for (int i = 1; i < 6; i++) {
            System.out.printf("%d. sayiyi giriniz: ", i);
            int number = kb.nextInt();
            if (max < number)
                max = number;
        }

        return max;
    }

    public static double findSumFactorial() {
        Scanner kb = new Scanner(System.in);

        double sum = 0;
        for (int i = 1; i < 6; i++) {
            System.out.printf("%d. sayiyi giriniz: ", i);
            int number = kb.nextInt();
            sum += findFactorial(number);
        }

        return sum;
    }

    public static double findAverage() {
        Scanner kb = new Scanner(System.in);
        double sum = 0;
        for (int i = 1; i < 6; i++) {
            System.out.printf("%d. sayiyi giriniz: ", i);
            int number = kb.nextInt();
            sum += number;
        }
        double average = sum / 5;

        return average;
    }

}