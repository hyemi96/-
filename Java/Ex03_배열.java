import java.util.Scanner;

public class Ex03_배열 {
	public static void main(String[] args) {

		int a=1,b=2,c=3,d=4,e=5;
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = new int[] {1,2,3,4,5};
		int[] arr3 = new int[5];
		arr3[0]=10;
		arr3[3]=40;
		
		System.out.println(arr1);
		System.out.println(arr1[0]);
//		System.out.println(arr1[5]);
		
		System.out.println(arr1.length);
		int i;
		for(i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		for(i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		
		//확장for문
		for( int temp : arr1) {
			System.out.println(temp);
		}
		System.out.println();
		
		int[][] arr4 = {
							{1,2,3}, // 00 01 02
							{4,5}, // 10 11
							{6,7,8,9}, //20 21 22 23
							{10,11,12,13,14} // 30 31 32 33 34
						};
		System.out.println(arr4[0][0]);
		System.out.println(arr4[1][1]);
		System.out.println(arr4);
		System.out.println(arr4.length);
		System.out.println(arr4[0].length);
		System.out.println(arr4[1].length);
		
		int j;
		for(i=0;i<arr4.length;i++) {
			for(j=0;j<arr4[i].length;j++) {
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println();
		}
		
//		확장for문
		for( int[] temp: arr4) {
			for( int x : temp) {
				System.out.print(x +" ");
			}
			System.out.println();
		}
		
		
		int[][] arr = new int[2][3];
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				System.out.print("수 입력:");
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
}








