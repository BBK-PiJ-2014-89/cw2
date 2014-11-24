import java.util.Scanner;

public class FractionCalculator {
	private static boolean on=true;
	private static boolean isFirstNumber=true;
	private static boolean isFirstLine=true;
	
	static Fraction value = new Fraction(0, 1);
	
	public static void main(String args[]){
		FractionCalculator test=new FractionCalculator();
	}
	public FractionCalculator() {
		run();
	}
	
		
	private void run() {
		System.out.println("Welcome to Rusam Drake's calculator:");
		while(on){
			System.out.print(">>");
			Scanner scan=new Scanner(System.in);
			String userInput=scan.nextLine();
			quit(userInput);
			if(on)System.out.println(analyse(userInput).toString());
			
		}
	}
	
	
	private void quit(String input) {
		if(input.equals("q")||input.equals("Q")||input.equals("quit")){
			setOn(false);
			System.out.println("Goodbye");
			
		}
	}
	
	private Fraction analyseLetters(String input) {
		if(input.equals("a")||input.equals("A")||input.equals("abs"))return value.absValue();
		if(input.equals("n")||input.equals("N")||input.equals("neg"))return value.negate();
		if(input.equals("c")||input.equals("C")||input.equals("clear"))return value = new Fraction(0, 1);
		return value;
	}
		
	private Fraction analyse(String input) {
		value = analyseLetters(input);
		
		if(isFirstLine){
			this.isFirstLine=false;
			String[] strArr=input.split(" ");
			for (int i=0;i<strArr.length;i++){
				if(strArr[i].equals("+")){
					
					if(isFirstNumber){
						value=toFraction(strArr[i-1]);
						Fraction f=toFraction(strArr[i+1]);
						value=value.add(f);
						isFirstNumber=false;
					}
					else {
						Fraction f=toFraction(strArr[i+1]);
						value=value.add(f);
					}
				}
				else if(strArr[i].equals("-")){
					if(isFirstNumber){
						value=toFraction(strArr[i-1]);
						Fraction f=toFraction(strArr[i+1]);
						value=value.subtract(f);
						isFirstNumber=false;
					}
					else {
						Fraction f=toFraction(strArr[i+1]);
						value=value.subtract(f);
					}
				}else if(strArr[i].equals("*")){
					if(isFirstNumber){
						value=toFraction(strArr[i-1]);
						Fraction f=toFraction(strArr[i+1]);
						value=value.multiply(f);
						isFirstNumber=false;
					}
					else {
						Fraction f=toFraction(strArr[i+1]);
						value=value.multiply(f);
					}
				}else if(strArr[i].equals("/")){
					if(isFirstNumber){
						value=toFraction(strArr[i-1]);
						Fraction f=toFraction(strArr[i+1]);
						value=value.devide(f);
						isFirstNumber=false;
					}
					else {
						Fraction f=toFraction(strArr[i+1]);
						value=value.devide(f);
					}
				}	
			}
			
			return value;
		}
		else {
			String[] strArr=input.split(" ");
			for (int i=0;i<strArr.length;i++){
				if(strArr[i].equals("+")){
					Fraction f=toFraction(strArr[i+1]);
					value=value.add(f);
				}else if(strArr[i].equals("-")){
					Fraction f=toFraction(strArr[i+1]);
					value=value.subtract(f);
				}else if(strArr[i].equals("*")){
					Fraction f=toFraction(strArr[i+1]);
					value=value.multiply(f);
				}else if(strArr[i].equals("/")){
					Fraction f=toFraction(strArr[i+1]);
					value=value.devide(f);
				}
			}
			
			return value;
		}
		

	}
	public String toString(){
		return value.toString();
	}

	private Fraction toFraction(String str){
		String[] frac=str.split("/");
		if(frac.length==1) return new Fraction(Integer.parseInt(str), 1);
		return new Fraction(Integer.parseInt(frac[0]), Integer.parseInt(frac[1]));
	}
	
	public void setOn(boolean bool){
		this.on=bool;
	}
	
		
}
