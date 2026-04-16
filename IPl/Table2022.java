class Table2022
{
	Team2022 teams[];
	
	public void getTableDetails()
	{
		for(Team2022 t : teams)
		{
			System.out.println("-----IPL 2022 Details-----");
			System.out.println("Name: "+t.name);
            System.out.println("Matches: "+t.playedMatches);
            System.out.println("Won: "+t.won);
            System.out.println("Loss: "+t.loss);
            System.out.println("NRR: "+t.nrr);
            System.out.println("Points: "+t.points);
            
            System.out.print("Last 5: ");
            for(String s : t.last5)
            {
                System.out.print(s+" ");
            }
            System.out.println("\n");
		}
	}
}