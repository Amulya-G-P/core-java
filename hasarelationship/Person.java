class Person
{
    int personId;
    String personName;
    int age;
    String address;
    GovernmentIdentification governmentIdentification;

    public void getPersonDetails()
    {
        System.out.println("Person Id: " + personId);
        System.out.println("Person Name: " + personName);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);

        governmentIdentification.getGovernmentIdDetails();
    }
}