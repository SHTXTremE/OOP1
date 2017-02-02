package bmta;

public class Bus {

	String name;
	boolean isRun;
	long start;
	long allTime;

	public Bus(String name){
		this.name = name;
		this.isRun = false;
	}

	long getCurrentTime(){
		if(!isRun){
			return 0;
		}
		else{
			return ((System.currentTimeMillis()-start)/1000);
		}
	}

	void run_stop(){
		isRun = !isRun;
		if(isRun){
			start = System.currentTimeMillis();
		}
		else{
			allTime += ((System.currentTimeMillis()-start)/1000);
		}
	}

	String getStatus(){
		return isRun? "Running" : "Stop";
	}

	@Override
	public String toString(){
		return String.format("%s is %s (Current %d seconds / All %d seconds)",this.name,getStatus(),getCurrentTime(),allTime);
	}
}
