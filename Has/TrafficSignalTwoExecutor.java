class TrafficSignalTwoExecutor 
{
    public static void main(String[] args) 
	{
        TrafficSignal traffic = new TrafficSignal();
        Cop cop = new Cop();

        cop.copId = 2;
        cop.name = "Suresh";

        traffic.createCop(cop);
        traffic.getSignalDetails();
    }
}

