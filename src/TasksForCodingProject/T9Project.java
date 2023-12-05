package TasksForCodingProject;

public class T9Project {
    public static void main(String[] args) {

        int[] numbers = {754, 125, 789, 1254, 254, 45, 4};

        if (numbers.length < 2) {
            System.out.println("Array must contain 2 elements minimum");
        } else {
            int largestNum = numbers[0];
            int secondLargestNum = numbers[1];

            for (int i = 2; i < numbers.length; i++) {
                if (numbers[i] > largestNum) {
                    secondLargestNum = largestNum;
                    largestNum = numbers[i];
                } else if (numbers[i] > secondLargestNum && numbers[i] != largestNum) {
                    secondLargestNum = numbers[i];
                }
            }

            System.out.println("Second Largest number: " + secondLargestNum);
        }
    }
}
