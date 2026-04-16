class TripExecutor 
{
    public static void main(String[] args) 
	{

        Trip t = new Trip();
        boolean added;

        added = t.addPlace("Goa"); 
		System.out.println(added);
        added = t.addPlace("Manali");
		System.out.println(added);
        added = t.addPlace("Ooty"); 
		System.out.println(added);
        added = t.addPlace("Mysore"); 
		System.out.println(added);
        added = t.addPlace("Coorg");
		System.out.println(added);
        added = t.addPlace("Kerala"); 
		System.out.println(added);
        added = t.addPlace("Jaipur"); 
		System.out.println(added);
        added = t.addPlace("Delhi"); 
		System.out.println(added);
        added = t.addPlace("Agra"); 
		System.out.println(added);
        added = t.addPlace("Kashmir");
		System.out.println(added);
        added = t.addPlace("Darjeeling");
		System.out.println(added);
        added = t.addPlace("Andaman"); 
		System.out.println(added);
        added = t.addPlace("Ladakh"); 
		System.out.println(added);

        t.getPlaces();

        String place = t.getPlaceByName("Goa");
        System.out.println(place + " is available");

        boolean updated = t.updatePlace("Ooty", "Ooty Hills");
        System.out.println(updated);

        t.getPlaces();

        boolean deleted = t.deletePlace("Delhi");
        System.out.println(deleted + " is deleted");

        t.getPlaces();
    }
}