package d20200721;

import java.util.Random;

/*
 * Multi Thread 처리 -2 
 *
 * 2. Runnable Interface를 구현
 *   1) Runnable Interface (간접) 상속
 *   2) run() override <- 동시에 수행할 로직 넣어두기
 *   3) 
 * 
 * 
 */
public class ThreadEx02 implements Runnable {
	String name;
	
	public ThreadEx02(String name) {
		this.name=name;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Random rnd = new Random();
		
		for(int i=0;i<101;i++) {
			try {
				Thread.sleep(rnd.nextInt(500)); //하나 할때마다 지연을 주어서 순차대로 ! 
			}catch (InterruptedException e) {
				// TODO: handle exception
			e.printStackTrace();
			}
			System.out.println(name+ " : "+ i);
		}
	}
	
	public static void main(String[] args) {
		
		ThreadEx02 te1 =new ThreadEx02("1번마 번개");
		ThreadEx02 te2 =new ThreadEx02("2번마 천둥이");
		
		//te1.start();
		Thread th1=new Thread(te1);
		Thread th2=new Thread(te2);
		
		//start() :  시작하기
		th1.start();
		
		//th1.yield(); // 현재쓰레드 실행을 중단하고 다른 쓰레드가 실행될 수 있도록 양보 
		
		try {
			th1.join();// 다른 쓰레드가 끝날때까지 (die) 할 때 까지 기다리기. 2번마가 계속 보고있는 것!!
		}catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		th2.start();
		
	}
	
	

}
