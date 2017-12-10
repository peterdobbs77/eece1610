package homeworkProblems;

public class Clock {

	private static final int MAX_SECONDS=60;
	private static final int MAX_MINUTES=60;
	private static final int MAX_HOURS = 24;
	private int seconds;
	private int minutes;
	private int hours;
	//-------------------------
	public Clock(int s, int m, int h){
		
		seconds = s;
		minutes = m;
		hours = h;
	}
	//--------------------------
	public Clock(Clock r){
		
		seconds = r.seconds;
		minutes = r.minutes;
		hours = r.hours;
	}
	//-------------------------
	public void setTime(int s, int m, int h){
		
		seconds=s;
		minutes=m;
		hours=h;
	}
	//-------------------------------------
	public void tick(){
		
		seconds++;
		if (seconds>=MAX_SECONDS){
			seconds = (seconds%MAX_SECONDS);
			minutes++;
			if (minutes>=MAX_MINUTES){
				minutes = (minutes%MAX_MINUTES);
				hours++;
				if (hours>=MAX_HOURS){
					hours = (hours%MAX_HOURS);
				}
			}
		}
	}
	//---------------------------
	public String toString(){
		
		return "seconds = "+seconds+" minutes = "+minutes+" hours = "+hours;
	}
	//-----------------------------------
	private void incrementMinutes(){
		
		minutes++;
		if (minutes>=MAX_MINUTES){
			minutes = (minutes%MAX_MINUTES);
			hours++;
			if (hours>=MAX_HOURS){
				hours = (hours%MAX_HOURS);
			}
		}
	}
	//-----------------------------------
	private void incrementHours(){
		
		hours++;
		if (hours>=MAX_HOURS){
			hours = (hours%MAX_HOURS);
		}
	}
}
