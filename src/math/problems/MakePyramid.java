package math.problems;

import java.util.Scanner;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number=");
        int k=sc.nextInt();
        System.out.println("enter the star:");
        char c=sc.next().charAt(0);
        for(int i=1;i<=k;i++){

            for(int j=0;j<k-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(i*2)-1;j++){
                System.out.print(c);

            }
            System.out.println();

        }


        }
  }
