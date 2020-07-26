package Epam_task;
import java.util.*;
import java.util.stream.IntStream;
public class AvgInt {
public static double Average(int[] a) {
	IntStream st=IntStream.of(a);
	
	OptionalDouble obj=st.average();
	if(obj.isPresent()) {
		return obj.getAsDouble();
	}
	return 0;
	
}
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter number of integers:");
	int n=in.nextInt();
	int a[]=new int[n];
	System.out.println("Enter "+n+" integers one by one : ");
	for(int i=0;i<n;i++) {
		a[i]=in.nextInt();
	}
	System.out.println("Average of list of numbers is : "+Average(a));
}
}
