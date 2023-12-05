package TasksForCodingProject;

public class T4Project {
    public static void main(String[] args) {

        int[][] numbers = {
                {10,25,30,65,40,85,70,90},
                {12,21,87,84,62,63,65,98}
        };
        int sum1=0;
        int sum2=0;
        for (int i = 0; i <numbers.length; i++) {
            for (int j = 0; j <numbers[i].length; j++) {
                if(numbers[i][j]%2==0) {
                    sum1=sum1+numbers[i][j];
                }
                if(numbers[i][j]%2 !=0) {
                    sum2=sum2+numbers[i][j];
                }
            }

        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
