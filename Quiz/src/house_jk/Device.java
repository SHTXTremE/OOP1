package house_jk;

public class Device {
	boolean isOn;
	String name;
	int watt;
	int allTime;
	long start;

	public Device(String name, int watt) {
		this.name = name;
		this.watt = watt;
		isOn = false;
	}

	public double getCost() {
		return (allTime * watt) / 100.0;
	}

	public int getUsedTime() {
		if (!isOn) {
			return 0;
		}
		return (int) ((System.currentTimeMillis() - start) / 1000);
	}

	public int getAllTime() {
		return allTime;
	}

	public void turn() {
		isOn = !isOn;
		if (isOn) {
			start = System.currentTimeMillis();
		} else {
			allTime += (int) ((System.currentTimeMillis() - start) / 1000);
		}
	}

	public String getStatus() {
		return isOn ? "On" : "Off";
	}

	@Override
	public String toString() {
		return String.format("%s %d watts is %s (Current %d hours / All %d hours)", this.name, this.watt,
				this.getStatus(), this.getUsedTime(), allTime);
	}
}
