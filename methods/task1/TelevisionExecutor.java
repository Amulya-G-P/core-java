class TelevisionExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("The TV Brand is : " + Television.getBrand());
      
      System.out.println("The Screen Size is : " + Television.getScreenSize() + " Inches");
      
      System.out.println("The Resolution is : " + Television.getResolution());
      
      System.out.println("The Display Type is : " + Television.getDisplayType());
      
      System.out.println("The Price is : " + Television.getPrice());
      
      System.out.println("main ended");
   }
}