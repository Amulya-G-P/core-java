class BluetoothSpeaker
{
   public static String getBrand()
   {
      System.out.println("getBrand() invoked");
      System.out.println("Boat");
      return "Boat";
   }

   public static int getBatteryBackup()
   {
      System.out.println("getBatteryBackup() invoked");
      System.out.println(10);
      return 10;
   }

   public static String getConnectivity()
   {
      System.out.println("getConnectivity() invoked");
      System.out.println("Bluetooth 5.0");
      return "Bluetooth 5.0";
   }

   public static boolean getWaterproof()
   {
      System.out.println("getWaterproof() invoked");
      System.out.println(true);
      return true;
   }

   public static double getPrice()
   {
      System.out.println("getPrice() invoked");
      System.out.println(2499.00);
      return 2499.00;
   }
}

