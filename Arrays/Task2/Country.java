class Country{

    static String CountryNames[] = {"India", "USA", "Japan"};

    public static void getCountryNames(){
        System.out.println("getCountryNames invoked");
        for(String CountryName : CountryNames){
            System.out.println(CountryName);
        }
        System.out.println("ended of CountryNames");
    }

   
}