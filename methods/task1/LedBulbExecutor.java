class LedBulbExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("The Brand is : " + LedBulb.getBrand());
      System.out.println("The Wattage is : " + LedBulb.getWattage());
      System.out.println("The Light Color is : " + LedBulb.getLightColor());
      System.out.println("The Life Span is : " + LedBulb.getLifeSpan());
      System.out.println("The Price is : " + LedBulb.getPrice());
      System.out.println("main ended");
   }
}