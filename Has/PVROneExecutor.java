class PVROneExecutor 
{
    public static void main(String[] args) 
	{
        PVR pvr = new PVR();
        Screen screen = new Screen();

        screen.screenId = 1;
        screen.type = "IMAX";

        pvr.pvrId = 101;
        pvr.location = "Orion Mall";
        pvr.screen = screen;

        pvr.getPvrDetails();
    }
}

