class CourseExecutor 
{
    public static void main(String[] args) 
	{

        Course c = new Course();
        boolean added;

        added = c.addTechnology("Java"); 
		System.out.println(added);
        added = c.addTechnology("Python"); 
		System.out.println(added);
        added = c.addTechnology("C"); 
		System.out.println(added);
        added = c.addTechnology("C++"); 
		System.out.println(added);
        added = c.addTechnology("JavaScript"); 
		System.out.println(added);
        added = c.addTechnology("HTML"); 
		System.out.println(added);
        added = c.addTechnology("CSS"); 
		System.out.println(added);
        added = c.addTechnology("SQL"); 
		System.out.println(added);
        added = c.addTechnology("Spring");
		System.out.println(added);
        added = c.addTechnology("Hibernate"); 
		System.out.println(added);
        added = c.addTechnology("React"); 
		System.out.println(added);
        added = c.addTechnology("Angular"); 
		System.out.println(added);
        added = c.addTechnology("Node.js");
		System.out.println(added);
        added = c.addTechnology("Docker"); 
		System.out.println(added);
        added = c.addTechnology("Kubernetes"); 
		System.out.println(added);

        c.getTechnologies();

        String tech = c.getTechnologyByName("Java");
        System.out.println(tech + " is available");

        boolean updated = c.updateTechnology("C", "C Programming");
        System.out.println(updated);

        c.getTechnologies();

        boolean deleted = c.deleteTechnology("HTML");
        System.out.println(deleted + " is deleted");

        c.getTechnologies();
    }
}