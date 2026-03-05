class WashingMachine
{
   public static String getBrand()
   {
      System.out.println("getBrand() invoked");
      System.out.println("IFB");
      return "IFB";
   }

   public static int getCapacity()
   {
      System.out.println("getCapacity() invoked");
      System.out.println(7);
      return 7;
   }

   public static String getType()
   {
      System.out.println("getType() invoked");
      System.out.println("Front Load");
      return "Front Load";
   }

   public static int getSpinSpeed()
   {
      System.out.println("getSpinSpeed() invoked");
      System.out.println(1200);
      return 1200;
   }

   public static double getPrice()
   {
      System.out.println("getPrice() invoked");
      System.out.println(32999.00);
      return 32999.00;
   }
}

