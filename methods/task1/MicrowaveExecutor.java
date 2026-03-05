class MicrowaveExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("The Brand is : " + Microwave.getBrand());
     
      System.out.println("The Capacity is : " + Microwave.getCapacity());
      System.out.println("The Type is : " + Microwave.getType());
      System.out.println("The Power is : " + Microwave.getPower());
      System.out.println("The Price is : " + Microwave.getPrice());
 
      System.out.println("main ended");
   }
}