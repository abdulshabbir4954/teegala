package com.tnsif.interfaces;

public interface Phone {
	String  Call="Calling..";
	String  Sms="Sending SMS..";
	void show();
}
class Jio implements Phone{
	public void show()
	{
		System.out.println("This is Jio phone");
		System.out.println(Call);
		System.out.println(Sms);

	}
}
class Samsung implements Phone{
	public void show()
	{
		System.out.println("This is Samsung phone");
		System.out.println(Call);
		System.out.println(Sms);

	}
}