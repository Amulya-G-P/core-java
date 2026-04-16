class Table2025
{
	Team2025 teams[];
	
	public void getTableDetails()
	{
		for(Team2025 t : teams)
		{
			System.out.println("-----IPL 2025 Details-----");
			System.out.println("Name of the team: "+t.name);
            System.out.println("Matches: "+t.playedMatches);
            System.out.println("Won: "+t.won);
            System.out.println("Loss: "+t.loss);
            System.out.println("NRR: "+t.nrr);
            System.out.println("Points: "+t.points);
            
            System.out.print("Last 5 matches: ");
            for(String s : t.last5)
            {
                System.out.print(s+" ");
            }
            System.out.println("\n");
		}
	}
}