class NetflixExecutor
{
	public static void main(String[] args)
	{
		Netflix netflix=new Netflix();
		netflix.netflixId=1;
		netflix.netflixName="Netflix App";
		
		Movie movie=new Movie();
		movie.movieId=201;
		movie.movieName="Stranger Things";
		
		netflix.movie=movie;
		netflix.getNetflixDetails();
	}
}