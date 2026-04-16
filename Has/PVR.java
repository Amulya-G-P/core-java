class PVR 
{
    int pvrId;
    String location;
    Screen screen;

    public void getPvrDetails()
	{
        System.out.println("PVR Id: " + pvrId);
        System.out.println("Location: " + location);
        screen.getScreenDetails();
    }

    PVR() 
	{
	}

    PVR(int pvrId, String location, Screen screen) 
	{
        this.pvrId = pvrId;
        this.location = location;
        this.screen = screen;
    }

    public boolean createScreen(Screen screen) 
	{
        this.screen = screen;
        return true;
    }
}

