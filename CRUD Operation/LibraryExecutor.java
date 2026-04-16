class LibraryExecutor 
{
    public static void main(String[] args) {

        Library l = new Library();
        boolean added;

        added = l.addBook("Java Programming"); 
		System.out.println(added);
        added = l.addBook("Python Basics"); 
		System.out.println(added);
        added = l.addBook("Data Structures"); 
		System.out.println(added);
        added = l.addBook("Algorithms"); 
		System.out.println(added);
        added = l.addBook("Operating Systems"); 
		System.out.println(added);
        added = l.addBook("Computer Networks"); 
		System.out.println(added);
        added = l.addBook("Database Systems"); 
		System.out.println(added);
        added = l.addBook("Artificial Intelligence");
		System.out.println(added);
        added = l.addBook("Machine Learning"); 
		System.out.println(added);
        added = l.addBook("Deep Learning");
		System.out.println(added);
        added = l.addBook("Software Engineering"); 
		System.out.println(added);
        added = l.addBook("Cloud Computing"); 
		System.out.println(added);
        added = l.addBook("Cyber Security"); 
		System.out.println(added);

        l.getBooks();

        String book = l.getBookByName("Machine Learning");
        System.out.println(book + " is available");

        boolean updated = l.updateBook("Python Basics", "Advanced Python");
        System.out.println(updated);

        l.getBooks();

        boolean deleted = l.deleteBook("Algorithms");
        System.out.println(deleted + " is deleted");

        l.getBooks();
    }
}