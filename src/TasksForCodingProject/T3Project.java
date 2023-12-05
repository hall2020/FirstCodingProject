package TasksForCodingProject;

public class T3Project {
    public static void main(String[] args) {
        int [] [] numbers = {{12,56,84,75,65,23,47},
                             {21,25,26,24,28,12,11}};
        int count=0;

        for (int i = 0; i <numbers.length; i++) {
            for (int j = 0; j <numbers[i].length; j++) {
                if(numbers[i][j]%2==0) {
                    System.out.print(numbers[i][j] + " ");
                }
            }
        }
    }
}
