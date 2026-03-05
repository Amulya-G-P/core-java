class MobileStore{

    static String MobileBrands[] = {"Samsung", "Apple", "OnePlus"};

    public static void getMobileBrands(){
        System.out.println("getMobileBrands invoked");
        for(String MobileBrand : MobileBrands){
            System.out.println(MobileBrand);
        }
        System.out.println("ended of MobileBrands");
    }

    
}