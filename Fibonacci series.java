import java.util.Scanner;
public class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0,j=1,nextTerm;
        System.out.println("Fibonacci series is:");
        for(int c=0;c<n;c++)
        {
            if(c<=1)
            nextTerm=c;
            else
        {
                 nextTerm=i+j;
                 i=j;
                 j=nextTerm;
        }
        System.out.println(nextTerm);
           
        }
    }

}
