
public class Ex01_for {
	public static void main(String[] args) {

		//1~10��� �հ豸�ϱ�
		int i,j,sum=0;
		for(i=1;i<11;i++) {
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println("sum:" + sum);

		//1~100������ �� �߿��� 5�� ����̸鼭 7�ǹ���� �� ���
		for(i=1;i<=100;i++) {
			if(i%5==0 && i%7==0) {
				System.out.println(i);
			}
		}

//		1 1
//		1 2
//		1 3
//		2 1
//		2 2
//		2 3
		for(i=1;i<=2;i++) {
			for(j=1;j<=3;j++) {
				System.out.println(i+","+j);
			}
		}
		
		//1~10���� ���
		
		for(i=1;i<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(i=1;i<=10;i++) {
			if(i==5) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		System.out.println();
//		***2��***
//		2*1=2
//		2*2=4
//		2*9=18
//		---------------
//		***3��***
//		3*1=3
//		3*2=6
//		3*9=27
//		---------------
//		***9��***
//		9*1=9
//		9*9=81
//		---------------
		
		for(i=2;i<=9;i++) {
			System.out.println("***"+i+"��***");
			for(j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println("---------------");
		}
		
//		***2��***
//		2*1=2
//		2*2=4
//		---------------
//		***4��***
//		4*1=4
//		4*2=8
//		4*3=12
//		4*4=16
//		---------------
//		***6��***
//		6*1=6
//		6*2=12
//		6*3=18
//		6*4=24
//		6*5=30
//		6*6=36
//		---------------
//		***8��***
//		8*1=8
//		8*2=16
//		8*3=24
//		8*4=32
//		8*5=40
//		8*6=48
//		8*7=56
//		8*8=64
//		---------------
//		
		
		for(i=2;i<=9;i++) {
			if(i%2==1) {
				continue;
			}
			System.out.println("***"+i+"��***");
			for(j=1;j<=9;j++) {
				if(i<j) {
					break;
				}
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println("---------------");
		}
	}

}



