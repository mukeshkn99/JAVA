package synchronization;

public class mythread1 extends Thread {
table t;
mythread1(table t){
	this.t=t;
}
public void run(){
	t.print(5);
}

}
