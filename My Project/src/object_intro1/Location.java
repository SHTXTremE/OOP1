package object_intro1;

//elab-source: Location.java

public class Location {
	
	private String person;
	private String room;
	private int floor;
	
	public Location(){
		person  = "";
	}
	
	public void setRoom(String room) {
		this.room = room;
	}
	
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	public void setPerson(String person) {
		this.person = person;
	}
	
	public String getRoom() {
		return this.room;
	}
	
	public int getFloor() {
		return this.floor;
	}
	
	public String getPerson() {
		return this.person;
	}
	
	public Location(String room,int floor) {
		this.room = room;
		this.floor = floor;
		this.person = "";
	}
	
	public String toString() {
		if(this.person.equals("")){
			this.person = "No one";
			return this.room + " on floor " + this.floor + ". " + this.person + " is in this room.";
		}
		else{
			return this.room + " on floor " + this.floor + ". " + this.person + " is in this room.";
		}
	}
}
