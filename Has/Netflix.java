class Netflix
{
	int netflixId;
	String netflixName;
	Movie movie;
	
	public void getNetflixDetails()
	{
		System.out.println("Method Invoked");
		System.out.println("The Netflix Id is " + netflixId);
		System.out.println("The Netflix Name is " + netflixName);
		
		movie.getMovieDetails();
		System.out.println("Method Stopped");
	}
}
