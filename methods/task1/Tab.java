class Tab
{
   public static String getBrand()
   {
      System.out.println("getBrand() invoked");
      System.out.println("Lenovo");
      return "Lenovo";
   }

   public static String getModel()
   {
      System.out.println("getModel() invoked");
      System.out.println("Tab M10");
      return "Tab M10";
   }

   public static int getRAM()
   {
      System.out.println("getRAM() invoked");
      System.out.println(6);
      return 6;
   }

   public static int getStorage()
   {
      System.out.println("getStorage() invoked");
      System.out.println(128);
      return 128;
   }

   public static double getScreenSize()
   {
      System.out.println("getScreenSize() invoked");
      System.out.println(10.1);
      return 10.1;
   }

   public static double getPrice()
   {
      System.out.println("getPrice() invoked");
      System.out.println(18999.00);
      return 18999.00;
   }
}

