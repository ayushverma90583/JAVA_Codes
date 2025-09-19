class Arrays
{
    public static void main(String[] args)
    {
        float[] marks = {74.5f,67.5f,82f,49f,67.5f};
        float sum=0;
        int a;

        //Print the length of the ARRAY
        
        System.out.println("Length of ARRAY :- "+marks.length);
        
        //Print the Sum of the ARRAY
        
        System.out.println("Printing the Array :- ");
        for(a=0; a<marks.length; a++)
        {
            System.out.println(marks[a]);
            sum = sum+marks[a];
        }
        System.out.println("SUM :- "+sum);

        //Find the element present in ARRAY or not

        float num =74.4f;
        boolean m = false;
        for(a=0; a<marks.length; a++)
        {
            System.out.println(marks[a]);
            if(marks[a]==num)
            {
                m=true;
                break;
            }
        }
        if(m==true)
        {
            System.out.println("This element is present in the array");
        }
        else
        {
            System.out.println("This element is not present in the array");
        }
        
        //Average Marks of the Students in Array

        for(a=0; a<marks.length; a++)
        {
            sum=sum+marks[a];
        }
        System.out.println("Average marks of the Students in the Array :- "+sum/marks.length);

        //Sum of 2 Matrix

        int [][] mat1= {{1,4,8},
                        {3,7,5}};
        int [][] mat2= {{3,4,9},
                        {3,2,1}};
        int [][] result= {{0,0,0},
                          {0,0,0}};
        for(a=0; a<mat1.length; a++)
        {
            for(int b=0; b<mat1[a].length; b++)
            {
                result[a][b]=mat1[a][b]+mat2[a][b];
            }
        }
        System.out.println("Result :- ");
        for(a=0; a<mat1.length;a++)
        {
            for(int b=0; b<mat1[a].length; b++)
            {
                System.out.print(result[a][b]+" ");
            }
            System.out.println("");
        }

        //Programme to Reverse an Array

        System.out.println("Reverse :- ");
        for(a=marks.length-1; a>=0; a--)
        {
            System.out.println(marks[a]);
        }
    }
}