class CollegeRunner 
{
    public static void main(String[] cr)
	{
        College one = new College();
        one.name = "IIT";

        College two = new College();
        two.name = "NIT";
		
		College three = new College();
		three.name = "BITS";
		
		College four = new College();
		four.name = "VIT";
		
		College five = new College();
		five.name = "SRM";
		
		College six = new College();
		six.name = "MIT";
		
		College seven = new College();
		seven.name = "RVCE";
		
		College eight = new College();
		eight.name = "PES";
		
		College nine = new College();
		nine.name ="MSRIT";
		
		College ten = new College();
		ten.name = "Christ";
		
		College eleven = new College();
		eleven.name = "Jain";
		
		College twelve = new College();
		twelve.name = "Dayananda Sagar";
		
		College thirteen = new College();
		thirteen.name = "Amity";
		
		College fourteen = new College();
		fourteen.name = "Galgotias";
		
		College fifteen = new College();
		fifteen.name = "Lovely Professional University";
		
        College colleges[] = new College[15];
		colleges[0] = one;
		colleges[1] = two;
		colleges[2] = three;
		colleges[3] = four;
		colleges[4] = five;
		colleges[5] = six;
		colleges[6] = seven;
		colleges[7] = eight;
		colleges[8] = nine;
		colleges[9] = ten;
		colleges[10] = eleven;
		colleges[11] = twelve;
		colleges[12] = thirteen;
		colleges[13] = fourteen;
		colleges[14] = fifteen;

        for (College college : colleges) 
		{
            System.out.println(college.name);
        }
    }
}