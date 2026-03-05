class SchoolBag
{
   public static String getBrand()
   {
      System.out.println("getBrand() invoked");
      System.out.println("Skybags");
      return "Skybags";
   }

   public static int getCapacity()
   {
      System.out.println("getCapacity() invoked");
      System.out.println(30);
      return 30;
   }

   public static String getMaterial()
   {
      System.out.println("getMaterial() invoked");
      System.out.println("Polyester");
      return "Polyester";
   }

   public static String getColor()
   {
      System.out.println("getColor() invoked");
      System.out.println("Blue");
      return "Blue";
   }

   public static double getPrice()
   {
      System.out.println("getPrice() invoked");
      System.out.println(1499.00);
      return 1499.00;
   }
}

