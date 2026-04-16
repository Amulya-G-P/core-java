class SpotifyExecutor
{
	public static void main(String[] args)
	{
		Spotify spotify=new Spotify();
		spotify.spotifyId=1;
		spotify.playlistName="Hindi Hits";
		
		Song song=new Song();
		song.songId=1;
		song.songName="Tum Hi Ho";
		
		spotify.song=song;
		spotify.getSpotifyDetails();
	}
}