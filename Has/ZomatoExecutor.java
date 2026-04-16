class ZomatoExecutor
{
	public static void main(String[] args)
	{
		System.out.println(" Zomato and Dish");
		
		Zomato zomato=new Zomato();
		zomato.zomatoId=1;
		zomato.zomatoName="Zomato App";
		zomato.zomatoId=2;
		zomato.zomatoName="Zomato Food Delivery";
		
		Fish fish=new Fish();
		fish.fishId=101;
		fish.fishName="Biryani";
		fish.fishId=102;
		fish.fishName="Pizza";
		
		zomato.fish=fish;
		
		zomato.getZomatoDetails();
	}
}