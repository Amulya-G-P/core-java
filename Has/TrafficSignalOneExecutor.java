class TrafficSignalOneExecutor 
{
    public static void main(String[] args) 
	{
        TrafficSignal traffic = new TrafficSignal();
        Cop cop = new Cop();

        cop.copId = 1;
        cop.name = "Ramesh";

        traffic.signalId = 101;
        traffic.location = "MG Road";
        traffic.cop = cop;

        traffic.getSignalDetails();
    }
}

