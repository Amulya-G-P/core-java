class Sanjana
{
	public static void main(String[] args)
	{
		/*for(DAtatype eachref : arrayRef)
		{	
			sop(eachref);
		}*/
			
		long phonenumber=6364768033L;
		String properties[]={"Kormangala","Majestic","Kerla","karnataka","Tamil Nadu"};
		//properties[]={"Kr Puram"};
		System.out.println(phonenumber);
		for(String property1 : properties)	
		System.out.println(property1);
		for(String property:properties)
		{
			if(property=="Kormangala")
			{
					System.out.println(properties);
			}
		
		}
		for(int anyThing=0; anyThing < properties.length;)
		{
			System.out.println(properties[anyThing]);
			anyThing++;
		}
	}
}