class Spotify
{
	static String songNames[]={"Agar tum saath ho","Darkhaast","Ye tune kya kiya","Tip Tip barsa"};
	public static void getSongNames()
	{
		System.out.println("Get Song Method invoked");
		for(String songName : songNames){
			System.out.println(songName);
		}
		System.out.println("End of invoke");

	}
}