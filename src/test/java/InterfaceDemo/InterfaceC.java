package InterfaceDemo;

public class InterfaceC implements InterfaceA {
	
	//static final String s="Mina";
    public void  commit()
    {
    	
    	System.out.println("This is commit method in InterfaceA");
    }
    public void rollback()
    {
    	System.out.println("This is rollback method InterfaceA");
    }

}


