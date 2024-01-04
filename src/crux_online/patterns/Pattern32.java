package crux_online.patterns;

import java.util.Scanner;

public class Pattern32 {
//1
//2	*	2
//3	*	3	*	3
//4	*	4	*	4	*	4
//5	*	5	*	5	*	5	*	5
//6	*	6	*	6	*	6
//7	*	7	*	7
//8	*	8
//9

//n=5

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int rows = 2 * n - 1;
        int row = 1;
        int nst = 1;


        while (row <= rows) {

            int cst = 1;
            int val = 1;
            while (cst <= nst) {
                if (cst % 2 == 0) {
                    System.out.print("*" + "\t");
                } else {
                    System.out.print(row + "\t");
                }
                cst++;
            }
            // prep work
            if (row <= rows / 2) {
                nst += 2;
            } else {
                nst -= 2;
            }
            row++;
            System.out.println();
        }

    }

}
