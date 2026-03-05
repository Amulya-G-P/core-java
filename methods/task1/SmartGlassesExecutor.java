class SmartGlassesExecutor {

    public static void main(String[] args) {

        System.out.println("main started");

        System.out.println("Glasses Model: " + SmartGlasses.getGlassesModel());
        
        System.out.println("Glasses Price: " + SmartGlasses.getGlassesPrice());
        

        System.out.println("AR Display Supported: " + SmartGlasses.supportsARDisplay());
       

        System.out.println("Voice Assistant Available: " + SmartGlasses.hasVoiceAssistant());
        

        System.out.println("Battery Life: " + SmartGlasses.getBatteryLife());
       
        System.out.println("Camera Available: " + SmartGlasses.hasCamera());
        

        System.out.println("main ended");
    }
}