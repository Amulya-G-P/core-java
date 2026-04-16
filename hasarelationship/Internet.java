class Internet
{
	int internetId;
	boolean isaccessible;
	String transferprotocols;
	String database;
	String cloudstorage;
	
	public void getInformation()
	{
		System.out.println("The internetId is " + internetId);
		System.out.println("Is this accessible " + isaccessible);
		System.out.println("The Transfer protocols used " + transferprotocols);
		System.out.println("The database Storage used " + database);
		System.out.println("The cloud Storage is " + cloudstorage);
	}
}
