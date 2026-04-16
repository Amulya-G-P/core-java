class UniverseExecutor 
{
    public static void main(String[] args) 
	{

        Universe u = new Universe();
        boolean added;

        added = u.addGalaxy("Milky Way");
		System.out.println(added);
        added = u.addGalaxy("Andromeda"); 
		System.out.println(added);
        added = u.addGalaxy("Triangulum"); 
		System.out.println(added);
        added = u.addGalaxy("Whirlpool"); 
		System.out.println(added);
        added = u.addGalaxy("Sombrero"); 
		System.out.println(added);
        added = u.addGalaxy("Black Eye");
		System.out.println(added);
        added = u.addGalaxy("Cartwheel"); 
		System.out.println(added);
        added = u.addGalaxy("Pinwheel"); 
		System.out.println(added);
        added = u.addGalaxy("Cigar Galaxy"); 
		System.out.println(added);
        added = u.addGalaxy("Sunflower Galaxy"); 
		System.out.println(added);
        added = u.addGalaxy("Centaurus A"); 
		System.out.println(added);

        u.getGalaxies();

        String galaxy = u.getGalaxyByName("Milky Way");
        System.out.println(galaxy + " is available");

        boolean updated = u.updateGalaxy("Andromeda", "Andromeda Galaxy");
        System.out.println(updated);

        u.getGalaxies();

        boolean deleted = u.deleteGalaxy("Triangulum");
        System.out.println(deleted + " is deleted");

        u.getGalaxies();
    }
}