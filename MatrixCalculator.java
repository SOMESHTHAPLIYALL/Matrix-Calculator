import java.util.Scanner;
class MatrixCalculator 
{
    public static void main(String args[])
    {
        int ch = -1;                                    //Variable for the choice of the user.
        int row1 , col1 , row2 , col2;                  //Variables to store the number of rows and columns of the matrix.
        Scanner s = new Scanner (System.in);

        do 
        {
        System.out.println("----------------------");
        System.out.println("1. Matrix Addition");
        System.out.println("2. Matrix Subtraction");
        System.out.println("3. Matrix Multiplictaion");
        System.out.println("0. Exit");
        System.out.println("-------------------------");
        System.out.println("Enter your choice:");

        ch = s.nextInt();          //Entering the choice entered by the user.
        switch(ch)
        {
            case 1:                //This is case 1 for addition of the two matrices.
            System.out.println ("Enter how many rows you want in matrix 1:");
            row1 = s.nextInt();    //Inputting the row of the matrix 1.

            System.out.println ("Enter how many columns you want in matrix 1:");
            col1 = s.nextInt();    //Inputting the column of the matrix 1.

            System.out.println ("Enter how many rows you want in matrix 2:");
            row2 = s.nextInt();    //Inputting the row of the matrix 2.

            System.out.println ("Enter how many columns you want in matrix 2:");
            col2 = s.nextInt();    //Inputting the column of the matrix 2.

            if (row1!=row2 || col1!=col2)   //This is the condition which will check whether the addition of the two matrix is possible or not.
            {
            System.out.println ("Matrix addition is not possible!");   //If the condition is true then this message will be displayed.
            }
            else
            {
            int matrix1[][] = new int[row1][col1];    
            int matrix2[][] = new int[row2][col2];    
            int add[][] = new int[row1][col1];       


            for (int i=0; i<row1; i++)
            {
                for(int j=0; j<col1; j++)
                {
                    System.out.print("Enter Matrix-1["+i+" , "+j+"] : ");
                    matrix1[i][j] = s.nextInt();           //Inputting Matrix 1 from the user.
                }
            }

            System.out.println();

            for (int i=0; i<row2; i++)
            {
                for(int j=0; j<col2; j++)
                {
                    System.out.print("Enter Matrix-2["+i+" , "+j+"] : ");
                    matrix2[i][j] = s.nextInt();             //Inputting Matrix 2 from the user.
                }
            }

            for (int i=0; i<row2; i++)
            {
                for(int j=0; j<col2; j++)
                {
                    add[i][j] = matrix1[i][j] + matrix2[i][j];     //Computing the addition of the two matrix.
                }
            }
            
            System.out.println();

            System.out.println("Matrix 1:");
            for (int i=0; i<row1; i++)
            {
                for(int j=0; j<col1; j++)
                {
                    System.out.print(matrix1[i][j]+" ");          //Displaying Matrix 1 on the screen.
                }
                 System.out.println();
            }

            System.out.println();

            System.out.println("Matrix 2:");
            for (int i=0; i<row1; i++)
            {
                for(int j=0; j<col1; j++)
                {
                    System.out.print(matrix2[i][j]+" ");           //Displaying Matrix 2 on the screen.
                }
                 System.out.println();
            }

            System.out.println();

            System.out.println("Addition of Matrix 1 and Matrix 2:");
            for (int i=0; i<row1; i++)
            {
                for(int j=0; j<col1; j++)
                {
                    System.out.print(add[i][j]+" ");       //Displaying the addition of Matrix 1 and Matrix 2 on the screen.
                }
                System.out.println();
            }
        }
            
            break;

            case 2:                //This is Case 2 which will perform subtraction of two matrices.

            System.out.println ("Enter how many rows you want in matrix 1:");
            row1 = s.nextInt();   //Inputting the row of the matrix 1.

            System.out.println ("Enter how many columns you want in matrix 1:");
            col1 = s.nextInt();   //Inputting the column of the matrix 1.

            System.out.println ("Enter how many rows you want in matrix 2:");
            row2 = s.nextInt();   //Inputting the row of the matrix 2.

            System.out.println ("Enter how many columns you want in matrix 2:");
            col2 = s.nextInt();   //Inputting the column of the matrix 2.

            if (row1!=row2 || col1!=col2)    //This is the condition which will check whether the subtraction of the two matrix is possible or not.
            {
            System.out.println ("Matrix subtraction is not possible!");   //If the condition is true then this message will be displayed.
            }
            else
            {
            int matrix1[][] = new int[row1][col1];
            int matrix2[][] = new int[row2][col2];
            int subtract[][] = new int[row1][col1]; 


            for (int i=0; i<row1; i++)
            {
                for(int j=0; j<col1; j++)
                {
                    System.out.print("Enter Matrix-1["+i+" , "+j+"] : ");
                    matrix1[i][j] = s.nextInt();            //Inputting Matrix 1 from the user.
                }
            }

            System.out.println();

            for (int i=0; i<row2; i++)
            {
                for(int j=0; j<col2; j++)
                {
                    System.out.print("Enter Matrix-2["+i+" , "+j+"] : ");
                    matrix2[i][j] = s.nextInt();               //Inputting Matrix 2 from the user.
                }
            }

            for (int i=0; i<row2; i++)
            {
                for(int j=0; j<col2; j++)
                {
                    subtract[i][j] = matrix1[i][j] - matrix2[i][j];      //Computing the subtraction of the two matrix.
                }
            }
            
            System.out.println();

            System.out.println("Matrix 1:");                   //Displaying Matrix 1 on the screen.
            for (int i=0; i<row1; i++)
            {
                for(int j=0; j<col1; j++)
                {
                    System.out.print(matrix1[i][j]+" ");
                }
                 System.out.println();
            }

            System.out.println();

            System.out.println("Matrix 2:");                    //Displaying Matrix 2 on the screen.
            for (int i=0; i<row1; i++)
            {
                for(int j=0; j<col1; j++)
                {
                    System.out.print(matrix2[i][j]+" ");
                }
                 System.out.println();
            }

            System.out.println();

            System.out.println("Subtraction of Matrix 1 and Matrix 2:");
            for (int i=0; i<row1; i++)
            {
                for(int j=0; j<col1; j++)
                {
                    System.out.print(subtract[i][j]+" ");               //Displaying the subtraction of Matrix 1 and Matrix 2 on the screen.
                }
                System.out.println();
            }
        }

            break;

            case 3:                    //This is Case 3 which will perform multiplications of two matrices. 

            System.out.println ("Enter how many rows you want in matrix 1:");
            row1 = s.nextInt();  //Inputting the row of the matrix 1.

            System.out.println ("Enter how many columns you want in matrix 1:");
            col1 = s.nextInt();   //Inputting the column of the matrix 1.

            System.out.println ("Enter how many rows you want in matrix 2:");
            row2 = s.nextInt();   //Inputting the column of the matrix 2.

            System.out.println ("Enter how many columns you want in matrix 2:");
            col2 = s.nextInt();   //Inputting the column of the matrix 2.

            if (col1!=row2)          //This is the condition which will check whether the multiplication of the two matrix is possible or not.
            {
            System.out.println ("Matrix multiplication is not possible!");     //If the condition is true then this message will be displayed.
            }
            else
            {
            int matrix1[][] = new int[row1][col1];
            int matrix2[][] = new int[row2][col2];
            int multiply[][] = new int[row1][col1]; 



            for (int i=0; i<row1; i++)
            {
                for(int j=0; j<col1; j++)
                {
                    System.out.print("Enter Matrix-1["+i+" , "+j+"] : ");
                    matrix1[i][j] = s.nextInt();          //Inputting Matrix 1 from the user.
                }
            }

            System.out.println();

            for (int i=0; i<row2; i++)
            {
                for(int j=0; j<col2; j++)
                {
                    System.out.print("Enter Matrix-2["+i+" , "+j+"] : ");
                    matrix2[i][j] = s.nextInt();          //Inputting Matrix 2 from the user.
                }
            }

            for (int i=0; i<row1; i++)
            {
                for (int j=0; j<col2; j++)
                {
                    for(int k=0; k<col1; k++)
                    {
                    multiply[i][j] += matrix1[i][k] * matrix2[k][j];     //Computing the multiplication of the two matrix.  
                    }
                }
            }
            
            System.out.println();

            System.out.println("Matrix 1:");
            for (int i=0; i<row1; i++)
            {
                for(int j=0; j<col1; j++)
                {
                    System.out.print(matrix1[i][j]+" ");          //Displaying Matrix 1 on the screen.
                }
                 System.out.println();
            }

            System.out.println();

            System.out.println("Matrix 2:");
            for (int i=0; i<row2; i++)
            {
                for(int j=0; j<col2; j++)
                {
                    System.out.print(matrix2[i][j]+" ");            //Displaying Matrix 2 on the screen.
                }
                 System.out.println();
            }

            System.out.println();

            System.out.println ("Multiplication of Matrix-1 and Matrix-2");

            for(int i=0; i<row1; i++)
            {
                for(int j=0; j<col2; j++)
                {
                    System.out.print(multiply[i][j]+" ");             //Displaying the subtraction of Matrix 1 and Matrix 2 on the screen.
                }
                 System.out.println();
            }
            }

            break;

            case 0:             //This is the exit case as soon as user press 0 the program will terminate.
            System.out.println ("Thanks.....Bye...");
            break;
        }

        }

        while(ch!=0);
    }
}