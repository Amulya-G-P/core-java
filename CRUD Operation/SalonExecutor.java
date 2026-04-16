class SalonExecutor 
{
    public static void main(String[] args) 
	{

        Salon s = new Salon();
        boolean added;

        added = s.addService("Hair Cut"); 
		System.out.println(added);
        added = s.addService("Hair Spa"); 
		System.out.println(added);
        added = s.addService("Facial"); 
		System.out.println(added);
        added = s.addService("Manicure");
		System.out.println(added);
        added = s.addService("Pedicure"); 
		System.out.println(added);
        added = s.addService("Hair Coloring"); 
		System.out.println(added);
        added = s.addService("Shaving"); 
		System.out.println(added);

        s.getServices();

        String service = s.getServiceByName("Facial");
        System.out.println(service + " is available");

        boolean updated = s.updateService("Hair Cut", "Advanced Hair Cut");
        System.out.println(updated);

        s.getServices();

        boolean deleted = s.deleteService("Shaving");
        System.out.println(deleted + " is deleted");

        s.getServices();
    }
}