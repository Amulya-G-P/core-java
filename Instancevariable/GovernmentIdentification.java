class GovernmentIdentification
{
    int idNumber;
    String idType;
    String issuedBy;
    String expiryDate;

    public void getGovernmentIdDetails()
    {
        System.out.println("ID Number: " + idNumber);
        System.out.println("ID Type: " + idType);
        System.out.println("Issued By: " + issuedBy);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("-------------------------------------");
    }
}