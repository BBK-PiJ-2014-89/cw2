/**
 * Created by keith for the second coursework assignment.
 */
public class FractionTest {
    public static void main(String[] args) {

        // test divide by zero - should print an error and exit
        new Fraction(1, 0);
        // test multiply
	Fraction f = new Fraction(3,10);
	Fraction g = new Fraction(1,2);
	Fraction h = new Fraction(3,5);
	Fraction k = new Fraction(4,5);
	

	
	if (!f.equals(g.multiply(h))) System.out.println("Multiply failed");
	if (!h.equals(f.devide(g))) System.out.println("Devide failed");
	if(!k.equals(f.add(g))) System.out.println("Add failed");
	if(!g.equals(k.subtract(f))) System.out.println("Subtract failed");
        // test equals
	test(new Fraction(1, 2),new Fraction(1, 2),"error test 1");
	test(new Fraction(1, 2),new Fraction(3, 6),"error test 2");
	test(new Fraction(-1, 2),new Fraction(1, -2),"error test 3");
	test(new Fraction(-1, -2),new Fraction(1, 2),"error test 4");
	test(new Fraction(4, -8),new Fraction(1, 2),"error test 5");
	
	
	//Fraction j = new Fraction(-2,3);
	//Fraction l = new Fraction(-1,-3);
	Fraction m = new Fraction(3,-8);
	Fraction n = new Fraction(3,8);
	//if(m.getDenominator()>0) System.out.println("minus not detected");
	
	System.out.println(m.toString());
	System.out.println(m.negate().toString());
	if(!m.absValue().equals(n)) System.out.println("absValue failed");
	/*
	System.out.print("absValue of "+j.toString()+" is ");
	System.out.println(j.absValue().toString());
	System.out.print("absValue of "+l.toString()+" is ");
	System.out.println(l.absValue().toString());
	System.out.print("absValue of "+m.toString()+" is ");
	System.out.println(m.absValue().toString());
	if(m.getDenominator()>0) System.out.println("minus not detected");
	*/
        // extend with extra tests
    }

    static void test(Fraction f1, Fraction f2, String msg){
    	if (! f1.equals(f2))
		System.out.println(msg);
    }
}
