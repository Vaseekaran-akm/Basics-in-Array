package Demo;
import java.util.*;
public class Demo {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int [] a=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Your array is" + Arrays.toString(a));
		int ind=1;
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				if(a[i]!=ind) {
					System.out.println("Missing smallest positive integer is "+ ind);
					break;
				}
				else {
					ind++;
					
				}
				
			}
		}
		
	}

}
