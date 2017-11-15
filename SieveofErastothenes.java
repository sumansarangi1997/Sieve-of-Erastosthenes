
package pkg1641017164;
import java.util.*;

public class SieveofErastothenes {

    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    
    // get the ceiling on the prime numbers
    int n;
    System.out.println("Enter the prime no. ceiling :");
    n=sc.nextInt();
    boolean isPrime[] = new boolean[n];
    isPrime[0]=false;
    for(int c=1;c<n;c++) {
        isPrime[c]=true;
       }    
    // check every number >= 2 for primality
        for(int i=2;i<=n;i++) {     
    // i is prime if hasn't been "crossed off" yet
            if(isPrime[i-1]) {  
            // print the prime number
                System.out.println(i);            
            // "cross off" all the subsequent multiples of i       
                    for(int j=i*i;j<=n;j=j+i) {
                        isPrime[j-1]= false;
            }
        }
     } 
  }    
}