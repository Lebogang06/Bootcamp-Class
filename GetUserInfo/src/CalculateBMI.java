import java.util.Scanner;

public class CalculateBMI {

    public static void main(String[] args) {

        double weight;
        double height;
        int age;
        Scanner inputDevice = new Scanner(System.in);

        System.out.println("Please enter your height >> ");
        height = inputDevice.nextFloat();
        System.out.println("Please enter your weight >> ");
        weight = inputDevice.nextDouble();
        System.out.println("Please enter your age");
        age = inputDevice.nextInt();
        double BMI = weight / (height*height);
        System.out.println("You are " + age + "years old and your BMI is " + BMI + "kg/m2"  );
    }
}
