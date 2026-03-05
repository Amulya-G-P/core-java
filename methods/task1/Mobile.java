class Mobile
{
   public static String getBrand()
   {
      System.out.println("getBrand() invoked");
      System.out.println("Samsung");
      return "Samsung";
   }

   public static String getModel()
   {
      System.out.println("getModel() invoked");
      System.out.println("Galaxy S23");
      return "Galaxy S23";
   }

   public static int getBatteryCapacity()
   {
      System.out.println("getBatteryCapacity() invoked");
      System.out.println(5000);
      return 5000;
   }

   public static int getCameraMP()
   {
      System.out.println("getCameraMP() invoked");
      System.out.println(108);
      return 108;
   }

   public static double getPrice()
   {
      System.out.println("getPrice() invoked");
      System.out.println(69999.00);
      return 69999.00;
   }
}

