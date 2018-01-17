package studio0;

public class Heartbeat {
	
	
	
	public static void main(String[] args) 
	{
		int n = 0;
		while(true)
		{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(n+ " sec have elapsed.");
		n++;
		}
	}

}
