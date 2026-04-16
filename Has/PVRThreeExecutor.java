class PVRThreeExecutor 
{
    public static void main(String[] args) 
	{
        Screen screen = new Screen();
        screen.screenId = 3;
        screen.type = "3D";

        PVR pvr = new PVR(102, "Forum Mall", screen);
        pvr.getPvrDetails();
    }
}