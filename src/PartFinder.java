import java.util.Scanner;
import java.util.Arrays;

public class PartFinder {
	
	public static int binarySearch(int partNumbers[], int first, int last, int key) {
		if(last >= first) {
			int middle = first + (last - first)/2;
			
			if(partNumbers[middle] == key) {
				return middle;
			}
			if(partNumbers[middle] > key) {
				return binarySearch(partNumbers, first, middle-1, key);
			}else {
				return binarySearch(partNumbers, middle+1, last, key);
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] partNumbers = {1065, 1095, 1075, 1055, 1056, 1090, 1098, 1088, 1097, 1078};
		
		Arrays.sort(partNumbers);
		
		System.out.println(Arrays.toString(partNumbers));
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first part number: ");
		
		int key = scan.nextInt();
		
		int last = partNumbers.length-1;
		
		int result = binarySearch(partNumbers, 0, last, key);{
		if(result == 1)
			System.out.println("Element is not in stock");
		else
			System.out.println("Element is found at index: " + result);
			System.out.println("Element is in stock");
		}
		
		System.out.println("Enter the second part number: ");
			
		int key2 = scan.nextInt();
		
		int result2 = binarySearch(partNumbers, 0, last, key2);{
		if(result == 1)
			System.out.println("Element is not in stock");
		else
			System.out.println("Element is found at index: " + result2);
			System.out.println("Element is in stock");
		}
	}
}
