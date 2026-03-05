class BluetoothSpeakerExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("The Brand is : " + BluetoothSpeaker.getBrand());
      System.out.println("The Battery Backup is : " + BluetoothSpeaker.getBatteryBackup());
      System.out.println("The Connectivity is : " + BluetoothSpeaker.getConnectivity());
      System.out.println("The Waterproof Feature is : " + BluetoothSpeaker.getWaterproof());
      System.out.println("The Price is : " + BluetoothSpeaker.getPrice());
      System.out.println("main ended");
   }
}