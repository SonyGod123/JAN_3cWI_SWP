package at.tsj.projects.If_Bedingungen;

import java.util.Random;

public class IfBefehle {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;
        for(int i=1;i<=100;i++) {
            int randomNumber = random.nextInt(100) + 1;
            sum = sum + randomNumber;
            System.out.println(randomNumber);
            if (randomNumber < 50) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        int mid = sum /100;
        System.out.println("sum :" + mid);
    }
}
