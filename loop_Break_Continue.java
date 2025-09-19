class loop_Break_Continue
{
    public static void main(String[] args)
    {
        //For Loop with Continue Function...
     
        int a;
        for(a=1; a<=10; a++)
        {
            if(a==5)
            {
                System.out.println(a+":- bus");
                continue;
            }
            System.out.println(a+":- car");
        }

        //Do-While Loop with Continue Function...
        
        int i;
        i=0;
        do
        {
            i++;
            if(i==3)
            {
                System.out.println(i+":- truck");
                continue;
            }
            System.out.println(i+":- van");
        }
        while(i<5);

        //While Loop with Continue Function...

        int b1;
        b1=0; 
        while(b1<5)
        {
            b1++;
            System.out.println(b1+":- A");
            if(b1==3)
            {
                System.out.println(b1+":- ABCDEFGH");
                continue;
            }
        }
        
        //For Loop with Break Function...
        
        int a1;
        for(a1=1; a1<=10; a1++)
        {
            System.out.println(a1+":- car");
            if(a1==5)
            {
                System.out.println(a1+":- bus");
                break;
            }
        }
        
        //Do-While Loop with Break Function...
        
        int i1;
        i1=0;
        do
        {
            System.out.println(i1+":- truck");
            i1++;
            if(i1==3)
            {
                System.out.println(i1+":- van");
                break;
            }
        }
        while(i1<5);

        //While Loop with Break Function...
       
        int b;
        b=0; 
        while(b<5)
        {
            b++;
            if(b==3)
            {
                break;
            }
            System.out.println(b+":- ABCD");
        }
    }
}