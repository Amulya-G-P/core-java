class PoliticianOneExecutor 
{
    public static void main(String[] args) 
	{
        Politician politician = new Politician();
        Voter voter = new Voter();

        voter.voterId = 1;
        voter.voterName = "Ravi";

        politician.id = 101;
        politician.name = "Leader1";
        politician.voter = voter;

        politician.getDetails();
    }
}

