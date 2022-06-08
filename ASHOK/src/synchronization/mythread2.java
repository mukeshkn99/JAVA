package synchronization;

public class mythread2 extends Thread{
	table t;
	mythread2(table t){
		this.t=t;
	}
	
	public void run(){
		t.print(100);
	}
}
