class Refrigerator
{
   public static String getBrand()
   {
      System.out.println("getBrand() invoked");
      System.out.println("Whirlpool");
      return "Whirlpool";
   }

   public static int getCapacity()
   {
      System.out.println("getCapacity() invoked");
      System.out.println(300);
      return 300;
   }

   public static int getStarRating()
   {
      System.out.println("getStarRating() invoked");
      System.out.println(4);
      return 4;
   }

   public static String getColor()
   {
      System.out.println("getColor() invoked");
      System.out.println("Grey");
      return "Grey";
   }

   public static double getPrice()
   {
      System.out.println("getPrice() invoked");
      System.out.println(25999.00);
      return 25999.00;
   }
}

