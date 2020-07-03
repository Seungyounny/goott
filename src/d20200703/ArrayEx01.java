package d20200703;

public class ArrayEx01 {
	
	public static void main(String[] args) {
		//int 크기 변수 5개 생성하고 각 변수에 임의의 값을 대입한 후 출력
	
		int arr[]=new int[5];
		
		for(int i=0;i<5;i++) {
			arr[i]= (int) (Math.random()*10);
			
			System.out.println(arr[i]);
		}
		
		
		//배열선언 : 자료형 [] 변수명; new : 메모리 할당
		
	
		int[] num;
		
		num =new int[5];
		
		num[0]=0;
		num[1]=10;
		num[2]=20;
		num[3]=30;
		num[4]=40;
		
		System.out.println(num[0]+" "+ num[1]+" "+num[2]+" "+num[3]+" "+num[4]);
		
	}

}
