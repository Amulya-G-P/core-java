class Client
{
    int clientId;
    String clientName;
    String company;
    int projectBudget;
    String projectType;

    public void getClientDetails()
    {
        System.out.println("Client Id: " + clientId);
        System.out.println("Client Name: " + clientName);
        System.out.println("Company: " + company);
        System.out.println("Project Budget: " + projectBudget);
        System.out.println("Project Type: " + projectType);
        System.out.println("-----------------------------------");
    }
}