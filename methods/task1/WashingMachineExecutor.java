class WashingMachineExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");
      System.out.println("The Brand is : " + WashingMachine.getBrand());
      System.out.println("The Capacity is : " + WashingMachine.getCapacity() + " KG");
      System.out.println("The Type is : " + WashingMachine.getType());
      System.out.println("The Spin Speed is : " + WashingMachine.getSpinSpeed() + " RPM");
      System.out.println("The Price is : " + WashingMachine.getPrice());
      System.out.println("main ended");
   }
} 