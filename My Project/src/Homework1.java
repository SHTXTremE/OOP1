import java.time.Duration;

public class Homework1 {
	public static void main(String args[]){
		Long long_nano = Long.MAX_VALUE-System.nanoTime();
		Long year_left = Duration.ofNanos(long_nano).toDays();
		System.out.println(year_left/365.242);
	}
}