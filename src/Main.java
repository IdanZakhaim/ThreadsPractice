import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        //printNumber(number);//סעיף 1
        for (int i = 0; i < number ; i++) {
            printNumber(i);
        }

    }



    public static void printNumber (int i){
        Thread thread = new Thread(() -> {
            while (true) {
                System.out.println(i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
            }
        });
        thread.start();
    }
}