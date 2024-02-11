import java.util.Scanner;

class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        if(marks > 100)
            System.out.println("Enter proper Marks!");
        char grade;
        if (marks > 80)
            grade = 'A';
        else if (marks > 70) {
            grade = 'B';
        } else if (marks > 60) {
            grade = 'C';
        } else if (marks >= 50) {
            grade = 'D';
        } else
            grade = 'F';

        switch (grade){
            case 'A':
                System.out.println(grade+ " Excellent");
                break;
            case 'B':
                System.out.println(grade+ " Great");
                break;
            case 'C':
                System.out.println(grade+ " Good");
                break;
            case 'D':
                System.out.println(grade+ " Can do better");
                break;
            case 'F':
                System.out.println(grade+ " Fail");
                break;
            default:
                System.out.println("Naacho");
        }
    }
}