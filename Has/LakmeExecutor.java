class LakmeExecutor
{
	public static void main(String[] args)
	{
		Lakme lakme=new Lakme();
		lakme.brandId=1;
		lakme.brandName="Lakme";
		
		Cream cream=new Cream();
		cream.creamId=1;
		cream.creamName="Liquid Foundation";
		
		lakme.cream=cream;
		lakme.getLakmeDetails();
	}
}