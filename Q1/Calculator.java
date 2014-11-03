
public class Calculator {
	private int x;
	private int y;
	public void add(int x, int y){
		this.x=x;
		this.y=y;
		System.out.println(x+"+"+y+"="+(x+y));
	}
	
	public void subtract(int x, int y){
		this.x=x;
		this.y=y;
		System.out.println(x+"-"+y+"="+(x-y));
	}
	
	public void multiply(int x, int y){
		this.x=x;
		this.y=y;
		System.out.println(x+"*"+y+"="+(x*y));
	}
	
	public void divide(int  x, int y){
		this.x=x;
		this.y=y;
		System.out.println(x+"/"+y+"="+((double)x/(double)y));
	}
	
	public void modulus(int x,int y){
		this.x=x;
		this.y=y;
		System.out.println(x+"%"+y+"="+(x%y));
	}
	
}
