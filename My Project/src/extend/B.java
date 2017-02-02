package extend;

class A{
	void sayHi(){
		System.out.println("Hi");
	}
}

class B extends A{
	@Override
	void sayHi(){
		System.out.println("I won't say Hi!");
	}
	public static void main(String[] args){
		B b = new B();
		b.sayHi();
	}
}
