import java.util.*;
public class swastic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++,System.out.println())
        {
            for(int j=0;j<n;j++)
            {
                if(i==n/2||j==n/2||j==0&&i<n/2||i==0&&j>n/2||i==n-1&&j<n/2||j==n-1&&i>n/2)
                System.out.print("*");
                 else{

                System.out.print(" ");
            }
            }
           
        }

    }
    
}
