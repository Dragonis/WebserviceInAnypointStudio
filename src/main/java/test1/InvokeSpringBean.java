package test1;

public class InvokeSpringBean {

	private String temp;
	
	public String methodA(){
		temp = "Method A";
		System.out.println(temp);
		return temp;
	}
	
	public String methodB(String text){
		temp = text;
		System.out.println(text);
		return temp;
	}
	
	
}
