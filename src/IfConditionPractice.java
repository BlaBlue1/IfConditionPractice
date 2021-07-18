import java.util.Scanner;

public class IfConditionPractice {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int grade;
        System.out.println("Enter student's Mark");
        grade = input.nextInt();
        if(grade>=80) {
            System.out.println("He/She deserves Grade A");
        }



    }

}
