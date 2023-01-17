
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    char[] arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T', 'U','V','W','X','Y','Z'};
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		a = Character.toUpperCase(a);
		int in = 0;
		for( int i = 0; i< 26; i++){
		    if(arr[i] == a){
		        in = i;
		    }
		}
		for( int j = 0; j<=in; j++){
		    
		    for(int k = j; k<=in; k++){
		        System.out.print(arr[k] + " ");
		    }
		    System.out.println("");
		}
		for(int l = in-1; l >=0; l--){
		    for(int m = l; m <= in; m++){
		        System.out.print(arr[m] + " ");
		    }
		    System.out.println("");
		}
// 		System.out.println(in);
	}
}
