package bmta;

public class Bus {
	boolean isRun;
	String name;
	int allTime;
	long start;

	public Bus(String name) {
		this.name = name;
		isRun = false;
	}

	public int getUsedTime() {
		if (!isRun) {
			return 0;
		}
		return (int) ((System.currentTimeMillis() - start) / 1000);
	}

	public int getAllTime() {
		return allTime;
	}

	public void turn() {
		isRun = !isRun;
		if (isRun) {
			start = System.currentTimeMillis();
		} else {
			allTime += (int) ((System.currentTimeMillis() - start) / 1000);
		}
	}

	public String getStatus() {
		return isRun ? "Running" : "Stop";
	}

	@Override
	public String toString() {
		return String.format("%s is %s (Current %d hours / All %d hours)", this.name,this.getStatus(), this.getUsedTime(), allTime);
	}
}
