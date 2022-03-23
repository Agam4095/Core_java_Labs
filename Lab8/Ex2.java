package Lab8;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Ex2 extends TimerTask{
	
	@Override
	public void run()
	{
		System.out.println("Timer task :" + new Date());
		completeTask();
		System.out.println("Timer task end :" + new Date());
	}
	
	private void completeTask() {
        try {
            Thread.sleep(10000);  //30 sec
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	
	public static void main(String args[]){
        TimerTask timerTask = new Ex2();
        
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 0, 10*1000);  //refresh at 10 sec
        System.out.println("TimerTask started");
        //cancel after sometime
        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
        System.out.println("TimerTask cancelled");
        try {
            Thread.sleep(10000);  //10 sec
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
