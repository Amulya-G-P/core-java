class Printer {

    public static String getPrinterModel() {
        System.out.println("getPrinterModel() invoked");
        System.out.println("PrintMaster P200");
        return "PrintMaster P200";
    }

    public static double getPrinterPrice() {
        System.out.println("getPrinterPrice() invoked");
        System.out.println(12999.40);
        return 12999.40;
    }

    public static boolean supportsColorPrinting() {
        System.out.println("supportsColorPrinting() invoked");
        System.out.println(true);
        return true;
    }

    public static boolean hasWirelessPrinting() {
        System.out.println("hasWirelessPrinting() invoked");
        System.out.println(true);
        return true;
    }

    public static int getPrintSpeed() {
        System.out.println("getPrintSpeed() invoked");
        System.out.println(20);
        return 20; 
    }

    public static boolean hasDuplexPrinting() {
        System.out.println("hasDuplexPrinting() invoked");
        System.out.println(true);
        return true;
    }
}

