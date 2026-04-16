class ShowroomExecutor 
{
    public static void main(String[] args) 
	{
        Showroom s = new Showroom();
        boolean added;

        added = s.addManager("Ravi"); 
		System.out.println(added);
        added = s.addManager("Suresh"); 
		System.out.println(added);
        added = s.addManager("Mahesh"); 
		System.out.println(added);
        added = s.addManager("Kiran"); 
		System.out.println(added);
        added = s.addManager("Anil"); 
		System.out.println(added);
        added = s.addManager("Vijay");
		System.out.println(added);
        added = s.addManager("Ramesh"); 
		System.out.println(added);
        added = s.addManager("Naresh");
		System.out.println(added);

        s.getManagers();

        String manager = s.getManagerByName("Kiran");
        System.out.println(manager + " is available");

        boolean updated = s.updateManager("Anil", "Anil Kumar");
        System.out.println(updated);

        s.getManagers();

        boolean deleted = s.deleteManager("Suresh");
        System.out.println(deleted + " is deleted");

        s.getManagers();
    }
}