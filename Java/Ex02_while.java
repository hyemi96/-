import java.util.Scanner; // ctrl+shift+O(���ĺ� ��)

public class Ex02_while {
	public static void main(String[] args) {

		int i=1;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println();
		
		i=1;
		while(true) {
			System.out.println(i);
			i++;
			if(i==10)
				break;
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		int sum=0;
		while(true) {
			System.out.print("�� �Է�:");
			int num = sc.nextInt();
			if(num < 0)
				break;
			    
			sum = sum + num; // sum += num;
		}
		System.out.println("sum=" + sum);
		
	}

}
