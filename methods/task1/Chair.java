class Chair
{
   public static String getBrand()
   {
      System.out.println("getBrand() invoked");
      System.out.println("GreenSoul");
      return "GreenSoul";
   }

   public static String getMaterial()
   {
      System.out.println("getMaterial() invoked");
      System.out.println("Mesh");
      return "Mesh";
   }

   public static boolean getAdjustable()
   {
      System.out.println("getAdjustable() invoked");
      System.out.println(true);
      return true;
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
      System.out.println(6999.00);
      return 6999.00;
   }
}

