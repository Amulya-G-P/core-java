class Machine
{
    int machineId;
    String machineName;
    String machineType;
    int machineCapacity;

    public void getMachineDetails()
    {
        System.out.println("Machine Id: " + machineId);
        System.out.println("Machine Name: " + machineName);
        System.out.println("Machine Type: " + machineType);
        System.out.println("Machine Capacity: " + machineCapacity);
        System.out.println("-----------------------------------");
    }
}