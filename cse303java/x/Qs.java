import java.util.*;


public class Qs{
		
	public int pivot(int [] arr,int low,int high){
		int start=low;
		int end=high;
		int pivot=arr[low];
		while(start<end){
			while(arr[start]<=pivot){
				start++;
			}
			while(arr[end]>pivot){
				end--;
			}
			if(start<end){
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=arr[start];
			}
		}
		int temp=arr[low];
		arr[low]=arr[end];
		arr[end]=temp;
		return start;
		
	}
	public void quickSort(int [] arr,int low,int high){
		if(low<high){
			int piv=pivot(arr,low,high);
			quickSort(arr,low,piv-1);
			quickSort(arr,piv,high);
		}
	}
	public static void main(String [] cherry){
		Qs s=new Qs();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		s.quickSort(arr,0,size-1);
		for(int i=0;i<size;i++){
			System.out.printf("%d\t",arr[i]);
		}
	}
}
