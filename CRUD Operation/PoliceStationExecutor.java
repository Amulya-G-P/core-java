class PoliceStationExecutor 
{
    public static void main(String[] args) {

        PoliceStation p = new PoliceStation();
        boolean added;

        added = p.addCase("Theft Case");
		System.out.println(added);
        added = p.addCase("Robbery Case"); 
		System.out.println(added);
        added = p.addCase("Fraud Case"); 
		System.out.println(added);
        added = p.addCase("Cyber Crime"); 
		System.out.println(added);
        added = p.addCase("Murder Case"); 
		System.out.println(added);
        added = p.addCase("Kidnapping Case"); 
		System.out.println(added);
        added = p.addCase("Accident Case"); 
		System.out.println(added);
        added = p.addCase("Drug Case");
		System.out.println(added);
        added = p.addCase("Assault Case"); 
		System.out.println(added);
        added = p.addCase("Burglary Case"); 
		System.out.println(added);
        added = p.addCase("Domestic Violence"); 
		System.out.println(added);
        added = p.addCase("Missing Person"); 
		System.out.println(added);
        added = p.addCase("Traffic Violation"); 
		System.out.println(added);
        added = p.addCase("Forgery Case"); 
		System.out.println(added);
        added = p.addCase("Harassment Case"); 
		System.out.println(added);
        added = p.addCase("Smuggling Case"); 
		System.out.println(added);

        p.getCases();

        String caseName = p.getCaseByName("Cyber Crime");
        System.out.println(caseName + " is available");

        boolean updated = p.updateCase("Fraud Case", "Online Fraud Case");
        System.out.println(updated);

        p.getCases();

        boolean deleted = p.deleteCase("Drug Case");
        System.out.println(deleted + " is deleted");

        p.getCases();
    }
}