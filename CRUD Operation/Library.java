class Library 
{
    String bookNames[] = new String[13];
    int index;

    public boolean addBook(String book) {
        boolean isAdded = false;
        if (book != null && !book.isEmpty()) {
            bookNames[index++] = book;
            isAdded = true;
        } else {
            System.out.println(book + " is invalid");
        }
        return isAdded;
    }


    public void getBooks() {
        System.out.println("Available Books are:");
        for(String item:bookNames)
			System.out.println(item);
    }

    public String getBookByName(String bookName) {
        String name=null;
		for(String book:bookNames)
		{
			if(book==bookName)
			{
				name=book;
				break;
			}
		}
		if(name==null)
			System.out.println(bookName+" not found");
		
		return name;
    }

    public boolean updateBook(String existingBook, String updatedBook) 
	{
        boolean isUpdated=false;
		
		for(int index=0;index<bookNames.length;index++)
		{
			if(bookNames[index]==existingBook)
			{
				bookNames[index]=updatedBook;
				isUpdated=true;
			}
		}
		
		if(isUpdated==false)
			System.out.println(existingBook+" is not found");
		
		return isUpdated;
    }

    public boolean deleteBook(String value) 
	{
        boolean isDeleted=false;
		
		for(int index=0;index<bookNames.length;index++)
		{
			if(bookNames[index]==value)
			{
				bookNames[index]=null;
				isDeleted=true;
			}
		}
		
		if(isDeleted==false)
			System.out.println(value+" Book not found");
		
		return isDeleted;
	}
}