class MovieExecutor 
{
    public static void main(String[] args) {

        Movie m = new Movie();
        boolean added;

        added = m.addCast("Yash"); 
		System.out.println(added);
        added = m.addCast("Sudeep");
		System.out.println(added);
        added = m.addCast("Darshan"); 
		System.out.println(added);
        added = m.addCast("Dhruva"); 
		System.out.println(added);
        added = m.addCast("Shivraj Kumar");
		System.out.println(added);
        added = m.addCast("Punith"); 
		System.out.println(added);
        added = m.addCast("Shidarth Malothra"); 
		System.out.println(added);
        added = m.addCast("Ranveer Singh"); 
		System.out.println(added);
        added = m.addCast("Karthik Aryan"); 
		System.out.println(added);

        m.getCast();

        String cast = m.getCastByName("Yash");
        System.out.println(cast + " is available");

        boolean updated = m.updateCast("Dhruva", "Dhruva Sarja");
        System.out.println(updated);

        m.getCast();

        boolean deleted = m.deleteCast("Darshan");
        System.out.println(deleted + " is deleted");

        m.getCast();
    }
}