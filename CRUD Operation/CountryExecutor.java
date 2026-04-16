class CountryExecutor
{
	public static void main(String[] states)
	{
		Country count=new Country();
		
		boolean added=count.addStateNames("Andra Pradesh");
		System.out.println(added);
			
		added=count.addStateNames("Arunachal Pradesh");
		System.out.println(added);
			
		added=count.addStateNames("Assam");
		System.out.println(added);
			
		added=count.addStateNames("Bihar");
		System.out.println(added);
			
		added=count.addStateNames("Chhattisgarh");
		System.out.println(added);
			
		added=count.addStateNames("Goa");
		System.out.println(added);
			
		added=count.addStateNames("Gujarat");
		System.out.println(added);
			
		added=count.addStateNames("Haryana");
		System.out.println(added);
			
		added=count.addStateNames("Himachal Pradesh");
		System.out.println(added);
			
		added=count.addStateNames("Jharkhand");
		System.out.println(added);
			
		added=count.addStateNames("Karnataka");
		System.out.println(added);
			
		added=count.addStateNames("Kerala");
		System.out.println(added);
			
		added=count.addStateNames("Madya Pradesh");
		System.out.println(added);
			
		added=count.addStateNames("Maharastra");
		System.out.println(added);
			
		added=count.addStateNames("Manipur");
		System.out.println(added);
			
		added=count.addStateNames("Meghalaya");
		System.out.println(added);
			
		added=count.addStateNames("Mizoram");
		System.out.println(added);
			
		added=count.addStateNames("Nagaland");
		System.out.println(added);
			
		added=count.addStateNames("Odisha");
		System.out.println(added);
			
		added=count.addStateNames("Punjab");
		System.out.println(added);
			
		added=count.addStateNames("Rajasthan");
		System.out.println(added);
			
		added=count.addStateNames("Sikkim");
		System.out.println(added);
			
		added=count.addStateNames("Tamil Nadu");
		System.out.println(added);
			
		added=count.addStateNames("Telangana");
		System.out.println(added);
			
		added=count.addStateNames("Tripura");
		System.out.println(added);
			
		added=count.addStateNames("Uttar Pradesh");
		System.out.println(added);
			
		added=count.addStateNames("Uttarkhand");
		System.out.println(added);
			
		added=count.addStateNames("West");			
		System.out.println(added);
			
		count.getStateDetails();
		
		String state=count.getStateByName("Karnataka");
		System.out.println(state+" is available");

		boolean updated=count.updateState("West"," West Bengal");
		System.out.println(updated);

		count.getStateDetails();

		boolean deleted=count.deleteState("Tripura");
		System.out.println(deleted);
		
		deleted=count.deleteState("Rajasthan");
		System.out.println(deleted);

		count.getStateDetails();
	}
}