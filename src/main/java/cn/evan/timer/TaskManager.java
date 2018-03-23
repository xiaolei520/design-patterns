package cn.evan.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Test timer.
 * 
 * @author lenovo
 *
 */
public class TaskManager {

	public static void main(String[] args) {
		Timer timer = new Timer();
		MyTask myTask = new MyTask();
		timer.schedule(myTask, 500, 5000);
		System.out.println("ok");
	}
	
	public void test(){
		
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				// Do something
			}
		};
		
		Timer timer = new Timer();
		timer.schedule(task, 1000);
	}
}
