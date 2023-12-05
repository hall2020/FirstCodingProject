package TasksForCodingProject;

public class T7Project {
    public static void main(String[] args) {

        int number1=0, number2=1, sumFib=0;

        System.out.println(number1+ " " +number2);
        for (int i = 0; i <30; i++) {
            sumFib = number1+number2;
            System.out.print(" "+ sumFib);
            number1=number2;
            number2=sumFib;
        }

    }
}
