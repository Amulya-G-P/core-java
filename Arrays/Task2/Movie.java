class Movie{

    static String MovieNames[] = {"KGF", "RRR", "Inception"};

    public static void getMovieNames(){
        System.out.println("getMovieNames invoked");
        for(String MovieName : MovieNames){
            System.out.println(MovieName);
        }
        System.out.println("ended of MovieNames");
    }

   
}