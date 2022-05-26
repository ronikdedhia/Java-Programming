class DataTypes
{
	public static void main(String args[])
	{
		byte b=15;
		short s=2560;
		int i=65360;
		float f=2.034f;
		long l=125000;
		char ch1=108, ch2='D';
		boolean b1=false;
		System.out.println("byte = "+b+"\nshort = "+s+"\nint = "+i+"\nlong = "+l);
		double d=0.000032695;
		System.out.println("float = "+f+"\ndouble = "+d);
		System.out.println("ch1 = "+ch1+"\nch2 = "+ch2);
		ch2++;
		System.out.println("modified char = "+ch2);
		System.out.println("boolean = "+b1);
		b1=true;
		System.out.println("another boolean value = "+b1);
	}
}