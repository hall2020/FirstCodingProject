package TasksForCodingProject;

public class T8Project {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 306, 102, 14, 1, 17};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if(numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
    }
}
