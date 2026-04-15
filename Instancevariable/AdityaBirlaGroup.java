class AdityaBirlaGroup
{
    int groupId;
    String founderName;
    String headquarters;
    int numberOfCompanies;
    Rcb rcb;

    public void getGroupDetails()
    {
        System.out.println("Group Id: " + groupId);
        System.out.println("Founder Name: " + founderName);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("Number Of Companies: " + numberOfCompanies);

        rcb.getRcbDetails();
    }
}