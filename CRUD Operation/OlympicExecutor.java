class OlympicExecutor 
{
    public static void main(String[] args) {

        Olympic o = new Olympic();
        boolean added;

        added = o.addSport("Cricket");
		System.out.println(added);
        added = o.addSport("Football");
		System.out.println(added);
        added = o.addSport("Hockey"); 
		System.out.println(added);
        added = o.addSport("Tennis");
		System.out.println(added);
        added = o.addSport("Badminton");
		System.out.println(added);
        added = o.addSport("Boxing"); 
		System.out.println(added);
        added = o.addSport("Wrestling"); 
		System.out.println(added);
        added = o.addSport("Swimming"); 
		System.out.println(added);
        added = o.addSport("Gymnastics");
		System.out.println(added);
        added = o.addSport("Athletics"); 
		System.out.println(added);
        added = o.addSport("Shooting"); 
		System.out.println(added);

        o.getSportDetails();

        String sport = o.getSportByName("Hockey");
        System.out.println(sport + " is available");

        boolean updated = o.updateSport("Tennis", "Table Tennis");
        System.out.println(updated);

        o.getSportDetails();
		
        boolean deleted = o.deleteSport("Boxing");
        System.out.println(deleted + " is deleted");

        o.getSportDetails();
    }
}