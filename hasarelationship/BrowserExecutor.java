class BrowserExecutor
{
	public static void main(String[] args)
	{
		Browser b=new Browser();
		b.browserId=1;
		b.browserName="Chrome";
		b.companyName="Google";
		Internet i =new Internet();
		i.internetId=1;
		i.isaccessible=true;
		i.transferprotocols="Http";
		i.database="Sql";
		i.cloudstorage="Aws";
		
		b.internet=i;
		b.getInfo();
	}
}