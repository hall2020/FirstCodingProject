package TasksForCodingProject;

import java.util.Scanner;

public class T1Project {
    public static void main(String[] args) {

        double [] temp = new double[7];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <7; i++) {
            System.out.println("Enter temperature of the day : " + (i+1) + " ");
            temp[i]= sc.nextDouble();
        }

        double highestTemp = temp[0];
        double lowestTemp=temp[0];

         for(double t : temp) {
             if(t>highestTemp) {
                 highestTemp = t;
             }
             else if(t<lowestTemp) {
                 lowestTemp=t;
             }
         }
        System.out.println("Highest temperature for the week: " + highestTemp + " degrees");
        System.out.println("Lowest temperature for the week: " + lowestTemp + " degrees");
    }
}
