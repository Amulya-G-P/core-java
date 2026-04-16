class SpotifyExecutor 
{
    public static void main(String[] args) 
	{

        Spotify s = new Spotify();
        boolean added;

        added = s.addSong("Shape of You");
		System.out.println(added);
        added = s.addSong("Blinding Lights");
		System.out.println(added);
        added = s.addSong("Believer");
		System.out.println(added);
        added = s.addSong("Senorita"); 
		System.out.println(added);
        added = s.addSong("Perfect"); 
		System.out.println(added);
        added = s.addSong("Closer"); 
		System.out.println(added);
        added = s.addSong("Faded"); 
		System.out.println(added);
        added = s.addSong("Havana"); 
		System.out.println(added);
        added = s.addSong("Levitating"); 
		System.out.println(added);
        added = s.addSong("Stay");
		System.out.println(added);

        s.getSongs();

        String song = s.getSongByName("Believer");
        System.out.println(song + " is available");

        boolean updated = s.updateSong("Closer", "Closer Remix");
        System.out.println(updated);

        s.getSongs();
        boolean deleted = s.deleteSong("Faded");
        System.out.println(deleted + " is deleted");

        s.getSongs();
    }
}