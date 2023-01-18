import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int arrsize = sc.nextInt();
		long[] arr = new long[arrsize];
		
		for(int i = 0; i< arrsize; i++){
		    arr[i] = sc1.nextInt();
		}
	    
	    long[] prev = new long[arrsize];
	    long[] next = new long[arrsize];
	    
	    
	    prev[0] = 1;
	    next[arrsize - 1] = 1;
	    for(int i = 1; i<arrsize; i++){
	        prev[i] = prev[i-1]*arr[i-1];
	    }
	    
	   // for (int j = 0; j < arrsize; j++) {
    //         System.out.println(prev[j] + " ");
    //     }
        
        
        for(int j = arrsize-2; j >=0; j--){
            next[j] = next[j+1]*arr[j+1];
        }
        
        for(int j = 0; j< arrsize; j++){
            arr[j] = prev[j]*next[j];
        }
		for (int j = 0; j < arrsize; j++) {
            System.out.print(arr[j] + " ");
        }
		
	}
}
