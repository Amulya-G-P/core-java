class HungamaExecutor 
{
    public static void main(String[] args)
	{

        Hungama h = new Hungama();
        boolean added;

        added = h.addShow("Doraemon");
        System.out.println(added);
        added = h.addShow("Shinchan");
        System.out.println(added);
        added = h.addShow("Perman");
        System.out.println(added);
        added = h.addShow("Kiteretsu");
        System.out.println(added);
        added = h.addShow("Pokemon");
        System.out.println(added);
        added = h.addShow("Beyblade");
        System.out.println(added);
        added = h.addShow("Dragon Ball Z");
        System.out.println(added);
        added = h.addShow("Yu-Gi-Oh!");
        System.out.println(added);
        added = h.addShow("Hagemaru");
        System.out.println(added);
        added = h.addShow("Oggy and the Cockroaches");
        System.out.println(added);
        added = h.addShow("Power Rangers");
        System.out.println(added);
        added = h.addShow("Digimon");
        System.out.println(added);
        added = h.addShow("Naruto");
        System.out.println(added);
        added = h.addShow("Bakugan");
        System.out.println(added);
		
        h.getShows();

        String show = h.getShowByName("Pokemon");
        System.out.println(show + " is available");
		
        boolean updated = h.updateShow("Shinchan", "Shinchan Hindi");
        System.out.println(updated);

        h.getShows();

        boolean deleted = h.deleteShow("Hagemaru");
        System.out.println(deleted + " is deleted");

        h.getShows();
    }
}