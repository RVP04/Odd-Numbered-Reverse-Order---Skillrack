import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] numbers = new int[n];
	    
	    //getting elements
        for(int i=0;i<n;i++)
            numbers[i]=sc.nextInt();
            
        for(int i = n-1;i>=0;i--)
        {
            if(numbers[i]%2!=0)
                System.out.print(numbers[i]+" ");
        }
	}
}
