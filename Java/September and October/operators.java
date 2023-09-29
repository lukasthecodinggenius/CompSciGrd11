class Main {
  public static void main(String[] args) {
   int a = 3;
	 int b = 4;
	 int c = 5;
	 int d = 100;

   //declare integar variable

	System.out.println(a + b);
	System.out.println(c + d);

//addition operator examples

	System.out.println(b - a);
	System.out.println(d - c);

//subtraction operator examples

	System.out.println(a * b);
	System.out.println(c * d);

//multiplication operator examples

	System.out.println(d / c);
	System.out.println(d / b);

//division operator examples

  System.out.println(d % a);
  System.out.println(c % a);
	
//modulo operator examples

  System.out.println(c == a);
  System.out.println(d == 100);

//equal to operator examples

  System.out.println(d != 100);
  System.out.println(d != a);

//not equal to operator examples

  System.out.println(c > a);
  System.out.println(d < c);

//greater than & less than examples

  System.out.println(d >= 100);
  System.out.println(c <= 1);

//greater than & less than equal to examples

  System.out.println((c < d) && (d < 1000000));
  System.out.println((d > 1000) && (c > d));

//AND logical operator examples

  System.out.println((100 > 1000) || (100 < 1000));
  System.out.println((a >= b) || (b >= c));

//OR logical operator examples

  System.out.println(!(c > d));
  System.out.println(!(d > 100000));

//NOT logical operator examples



  }
}
