class human
{
	double height;
	double weight;
	double age;
	void dispAge()
	{
		System.out.println("Your age is:"+age);
	}
	double ratio()
	{
		return weight/height;
	}
	void setVal(double h,double w,double a)
	{
		height=h;
		weight=w;
		age=a;
	}}
	class Hum
	{
	public static void main(String args[])
		{
		human h1=new human();
		human h2=new human();
		h1.setVal(6.5,60,49);
		h2.setVal(6.2,63,68);
		h1.dispAge();
		System.out.println("ratio is:"+h1.ratio());
		h2.dispAge();
		System.out.println("ratio is:"+h2.ratio());
		}
	}
