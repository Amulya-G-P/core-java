class MultiUseFingerCounterExecutor
{
	public static void main(String[] args)
	{
		System.out.println("Main Started");

		System.out.println("Department : " + MultiUseFingerCounter.getDepartment());
		System.out.println("Manufacturer : " + MultiUseFingerCounter.getManufacturer());
		System.out.println("Country Of Origin : " + MultiUseFingerCounter.getCountryOfOrigin());
		System.out.println("ASIN : " + MultiUseFingerCounter.getAsin());
		System.out.println("Item Weight : " + MultiUseFingerCounter.getItemWeight());

		System.out.println("Main Ended");
	}
}