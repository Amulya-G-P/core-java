class TrafficSignalThreeExecutor 
{
    public static void main(String[] args) 
	{
        Cop c = new Cop();
        c.copId = 3;
        c.name = "Mahesh";

        TrafficSignal t = new TrafficSignal(102, "Silk Board", c);
        t.getSignalDetails();
    }
}