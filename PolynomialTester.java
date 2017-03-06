
public class PolynomialTester {
	public static void main(String[] args)
	{
		Polynomial m=new Polynomial(new Term(1,5));
		System.out.println(m.toFormattedString());
		Polynomial c=new Polynomial(new Term(1,18));
		Polynomial l=m.add(c);
		System.out.println(l.toFormattedString());
		System.out.println(m.eval(2));
	}

}
