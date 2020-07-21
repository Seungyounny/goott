package d20200721;

/*
 * Multi Thread
 * 1. Thread class 상속
 *  1) Thread class 상속
 *  2) rum() override ==> 동시에 처리하고 싶은 logic을 넣어두기 
 *  3) 구현클래스에서 start() 호출
 *  
 *  
 */
public class ThreadEx01 extends Thread {
	String name;

	public ThreadEx01(String name) {
		//this.name = name;
		super(name);

	}
//	void sprint() {
//		for(int i=0;i<101;i++) {
//			System.out.println(name + " : " + i );
//		}
//	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();

		for (int i = 0; i < 101; i++) {
			//System.out.println(name + " : " + i);
			System.out.println(Thread.currentThread().getName()+ " : "+ i); //현재 어떤 로직이 돌아가고 있는지 확인! 
		}

	}

	public static void main(String[] args) {
		// new ThreadEx01("1번마 천둥이").sprint();
		// new ThreadEx01("2번마 번개").sprint();
		
		ThreadEx01 te1 =new ThreadEx01("1번마 천둥이");
		ThreadEx01 te2 =new ThreadEx01("2번마 번개");
	
		//각각의 스레드실행
		te1.start();
		te2.start();
		
		//스레드가 순서대로 하나씩 실행되지 않는 이유는지연시간이 있기 때문이당
	}

}
