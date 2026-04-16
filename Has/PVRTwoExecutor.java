class PVRTwoExecutor 
{
    public static void main(String[] args)
	{
        PVR pvr = new PVR();
        Screen screen = new Screen();

        screen.screenId = 2;
        screen.type = "4DX";

        pvr.createScreen(screen);
        pvr.getPvrDetails();
    }
}

