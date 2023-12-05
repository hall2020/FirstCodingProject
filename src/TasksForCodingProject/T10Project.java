package TasksForCodingProject;

public class T10Project {
    public static void main(String[] args) {

        int[] numbers = {21, 114, 20, 15, 46, 12, 77, 13, 78};

        boolean dupNum = false;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i+1; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {
                    dupNum = true;
                    System.out.print(numbers[i] + " ");
                }
            }
        }
        if(!dupNum) {
            System.out.println("No duplicate numbers");
        }
    }
}
