class Earbuds
{
   public static String getBrand()
   {
      System.out.println("getBrand() invoked");
      System.out.println("JBL");
      return "JBL";
   }

   public static String getConnectivity()
   {
      System.out.println("getConnectivity() invoked");
      System.out.println("Bluetooth 5.3");
      return "Bluetooth 5.3";
   }

   public static int getBatteryBackup()
   {
      System.out.println("getBatteryBackup() invoked");
      System.out.println(24);
      return 24;
   }

   public static boolean getNoiseCancellation()
   {
      System.out.println("getNoiseCancellation() invoked");
      System.out.println(true);
      return true;
   }

   public static double getPrice()
   {
      System.out.println("getPrice() invoked");
      System.out.println(4999.00);
      return 4999.00;
   }
}

