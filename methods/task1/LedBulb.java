class LedBulb
{
   public static String getBrand()
   {
      System.out.println("getBrand() invoked");
      System.out.println("Philips");
      return "Philips";
   }

   public static int getWattage()
   {
      System.out.println("getWattage() invoked");
      System.out.println(9);
      return 9;
   }

   public static String getLightColor()
   {
      System.out.println("getLightColor() invoked");
      System.out.println("Cool White");
      return "Cool White";
   }

   public static int getLifeSpan()
   {
      System.out.println("getLifeSpan() invoked");
      System.out.println(15000);
      return 15000;
   }

   public static double getPrice()
   {
      System.out.println("getPrice() invoked");
      System.out.println(199.00);
      return 199.00;
   }
}
