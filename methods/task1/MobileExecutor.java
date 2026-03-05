class MobileExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("The Mobile Brand is : " + Mobile.getBrand());
      
      System.out.println("The Model is : " + Mobile.getModel());
      
      System.out.println("The Battery Capacity is : " + Mobile.getBatteryCapacity()  );
      
      System.out.println("The Camera MP is : " + Mobile.getCameraMP() );
      
      System.out.println("The Price is : " + Mobile.getPrice());
      
      System.out.println("main ended");
   }
}