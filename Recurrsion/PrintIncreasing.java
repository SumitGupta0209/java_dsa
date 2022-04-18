import java.util.Scanner;

 class printIncreasing
{
    public static void main(String[] args) {
        

        try (Scanner5 sc = new Scanner(System.in)) {
            int n=sc.nextInt();

            printinc(n);
        }
    }


    private static void printinc(int n) 
    {
        if(n==0)
        {
            return;
        }
       printinc(n-1);
       System.out.println(n); 
    }
}