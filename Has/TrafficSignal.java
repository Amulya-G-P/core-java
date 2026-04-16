class TrafficSignal 
{
    int signalId;
    String location;
    Cop cop;

    public void getSignalDetails() 
	{
        System.out.println("Signal Id: " + signalId);
        System.out.println("Location: " + location);
        cop.getCopDetails();
    }

    TrafficSignal() {}

    TrafficSignal(int signalId, String location, Cop cop) 
	{
        this.signalId = signalId;
        this.location = location;
        this.cop = cop;
    }

    public boolean createCop(Cop cop) 
	{
        this.cop = cop;
        return true;
    }
}

