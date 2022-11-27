package ch6;

public class App {

	private static App app;
		
	private App()
	{
		//hinder other classes to create an object of this class
	}
	
	public static App getInstance ()
	{
		if (null == app)
		{
			app = new App();
		}
		return app;
		
	}


}

