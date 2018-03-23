package test;

public class t {
	
	public void method1(){
		System.out.println("method1");
	}
	
	t(int a){
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		t t1 = new t();
		
		t1.method1();
		
		t t2 = new t(10);
		
	}
	
	
	
	
	
	

}
