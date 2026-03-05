class AirConditionerExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");
      System.out.println("The AC Brand is : " + AirConditioner.getBrand());
      System.out.println("The Capacity is : " + AirConditioner.getCapacity() + " Ton");
      System.out.println("The Star Rating is : " + AirConditioner.getStarRating());
      System.out.println("The Type is : " + AirConditioner.getType());
      System.out.println("The Price is : " + AirConditioner.getPrice());
      System.out.println("main ended");
   }
}