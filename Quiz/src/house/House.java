package house;

public class House {
	private String name="";
	
	DeviceApp d = new DeviceApp();
	
	House(String name){
		this.name = name;
	}
	void setName(String name){
		this.name = name;
	}
	
	String getName(){
		return name;
	}
	public void getObject(Class<? extends DeviceApp> class1) {
		// TODO Auto-generated method stub
		
	}
}

