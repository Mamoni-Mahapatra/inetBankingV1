package Selenium.webdriver.basictests;

public class B implements InterfaceD {
		
		public void show()
		{
			System.out.println("This is show method");
		}
		public void display(int c,String d)
		{
			c=a;d=b;
			System.out.println("This is display method:"+c);
			System.out.println("This is display method:"+d);
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B x=new B();
		x.show();
		x.display(a, b);
	}

}
