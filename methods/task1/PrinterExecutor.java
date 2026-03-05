class PrinterExecutor {

    public static void main(String[] args) {

        System.out.println("main started");
        System.out.println("Printer Model: " + Printer.getPrinterModel());
        System.out.println("Printer Price: " + Printer.getPrinterPrice());
        System.out.println("Color Printing Supported: " + Printer.supportsColorPrinting());
        System.out.println("Wireless Printing Available: " + Printer.hasWirelessPrinting());
        System.out.println("Print Speed: " + Printer.getPrintSpeed());
        System.out.println("Duplex Printing Available: " + Printer.hasDuplexPrinting());
        System.out.println("main ended");
    }
}