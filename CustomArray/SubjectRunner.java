class SubjectRunner 
{
    public static void main(String[] sr) 
	{
        Subject sujectOne = new Subject();
        sujectOne.name = "Maths";

        Subject sujectTwo = new Subject();
        sujectTwo.name = "Physics";
		
		Subject sujectThree = new Subject();
		sujectThree.name = "Chemistry";
		
		Subject sujectFour = new Subject();
		sujectFour.name = "Biology";
		
		Subject sujectFive = new Subject();
		sujectFive.name = "English";
		
		Subject sujectSix = new Subject();
		sujectSix.name = "Hindi";
		
		Subject sujectSeven = new Subject();
		sujectSeven.name = "Computer Science";
		
		Subject sujectEight = new Subject();
		sujectEight.name = "History";
		
		Subject sujectNine = new Subject();
		sujectNine.name ="Geography";
		
		Subject sujectTen = new Subject();
		sujectTen.name = "Civics";
		
		Subject sujectEleven = new Subject();
		sujectEleven.name = "Economics";
		
		Subject sujectTweleve = new Subject();
		sujectTweleve.name = "Statistics";
		
		Subject sujectThirteen = new Subject();
		sujectThirteen.name = "AI";
		
		Subject sujectFourteen = new Subject();
		sujectFourteen.name = "ML";
		
		Subject sujectFifteen = new Subject();
		sujectFifteen.name = "Cybersecurity";
		
        Subject subjects[] = new Subject[15];
		subjects[0] = sujectOne;
		subjects[1] = sujectTwo;
		subjects[2] = sujectThree;
		subjects[3] = sujectFour;
		subjects[4] = sujectFive;
		subjects[5] = sujectSix;
		subjects[6] = sujectSeven;
		subjects[7] = sujectEight;
		subjects[8] = sujectNine;
		subjects[9] = sujectTen;
		subjects[10] = sujectEleven;
		subjects[11] = sujectTweleve;
		subjects[12] = sujectThirteen;
		subjects[13] = sujectFourteen;
		subjects[14] = sujectFifteen;

        for (Subject subject : subjects) {
            System.out.println(subject.name);
        }
    }
}`