class BookRunner 
{

    public static void main(String[] args)
	{

        Book bookOne = new Book();
        bookOne.name = "Java";

        Book bookTwo = new Book();
        bookTwo.name = "Python";
		
		Book bookThree = new Book();
		bookThree.name = "C++";
		
		Book bookFour = new Book();
		bookFour.name = "C";
		
		Book bookFive = new Book();
		bookFive.name = "HTML";
		
		Book bookSix = new Book();
		bookSix.name = "CSS";
		
		Book bookSeven = new Book();
		bookSeven.name = "JavaScript";
		
		Book bookEight = new Book();
		bookEight.name = "SQL";
		
		Book bookNine = new Book();
		bookNine.name ="DSA";
		
		Book bookTen = new Book();
		bookTen.name = "AI";
		
		Book bookEleven = new Book();
		bookEleven.name = "ML";
		
		Book bookTwelve = new Book();
		bookTwelve.name = "Cloud";
		
		Book bookThirteen = new Book();
		bookThirteen.name = "Cybersecurity";
		
		Book bookFourteen = new Book();
		bookFourteen.name = "Networking";
		
		Book bookFifteen = new Book();
		bookFifteen.name = "OS";
		
        Book books[] = new Book[15];
		books[0] = bookOne;
		books[1] = bookTwo;
		books[2] = bookThree;
		books[3] = bookFour;
		books[4] = bookFive;
		books[5] = bookSix;
		books[6] = bookSeven;
		books[7] = bookEight;
		books[8] = bookNine;
		books[9] = bookTen;
		books[10] = bookEleven;
		books[11] = bookTwelve;
		books[12] = bookThirteen;
		books[13] = bookFourteen;
		books[14] = bookFifteen;

        for (Book book : books) 
		{
            System.out.println(book.name);
        }
    }
}