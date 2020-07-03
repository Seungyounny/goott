package d20200703;

public class ArrayEx03 {
	//int 배열 3칸짜리 a
	//int 배열 3칸짜리 b
	//int 배열 3칸짜리 c
	
	//a, b 에 임이의 값 대입
	
	public static void main(String[] args) {
		
		int a[]= {10,20,30};
		int b[]= {40,50,60};
		
		//c배열에 a+b 해서 대입
		
		int c[]=new int[3];
		
//		c[0]=a[0]+b[0];
//		c[1]=a[1]+b[1];
//		c[2]=a[2]+b[2];
		
		for(int i=0;i<c.length;i++) {
			c[i]=a[i]+b[i];
			
			System.out.println(c[i]);
		}
		
				
	}
	

}
