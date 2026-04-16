class Spotify
{
	int spotifyId;
	String playlistName;
	Song song;
	
	public void getSpotifyDetails()
	{
		System.out.println("Method Invoked");
		System.out.println("The Spotify Id is " + spotifyId);
		System.out.println("The Playlist Name is " + playlistName);
		
		song.getSongDetails();
		System.out.println("Method Stopped");
	}
}
