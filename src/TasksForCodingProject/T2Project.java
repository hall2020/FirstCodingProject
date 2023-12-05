package TasksForCodingProject;

public class T2Project {
    public static void main(String[] args) {
        int [] numbers = {12,56,84,75,65,23,47};
        int sum=0;

        for (int i = 0; i <numbers.length; i++) {
            sum = sum+numbers[i];
        }
        System.out.println(sum);
    }
}
