class AirConditioner
{
   public static String getBrand()
   {
      System.out.println("getBrand() invoked");
      System.out.println("Daikin");
      return "Daikin";
   }

   public static double getCapacity()
   {
      System.out.println("getCapacity() invoked");
      System.out.println(1.5);
      return 1.5;
   }

   public static int getStarRating()
   {
      System.out.println("getStarRating() invoked");
      System.out.println(5);
      return 5;
   }

   public static String getType()
   {
      System.out.println("getType() invoked");
      System.out.println("Split AC");
      return "Split AC";
   }

   public static double getPrice()
   {
      System.out.println("getPrice() invoked");
      System.out.println(38999.00);
      return 38999.00;
   }
}

