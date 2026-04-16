class Olympic 
{
    String sportNames[] = new String[11];
    int index;

    public boolean addSport(String sport) {
        boolean isAdded = false;
        if (sport != null && !sport.isEmpty()) {
            sportNames[index++] = sport;
            isAdded = true;
        } else {
            System.out.println(sport + " is invalid");
        }
        return isAdded;
    }

    public void getSportDetails()
	{
		System.out.println("The list of Sports are:");
		for(String sport:sportNames)
			System.out.println(sport);
	}
	public String getSportByName(String sportName)
	{
		String name=null;
		for(String sport:sportNames)
		{
			if(sport==sportName)
			{
				name=sport;
				break;
			}
		}
		if(name==null)
			System.out.println(sportName+" not found");
		
		return name;
	}

    public boolean updateSport(String existingSport,String updatedSport)
	{
		boolean isSportUpdated=false;
		
		for(int index=0;index<sportNames.length;index++)
		{
			if(sportNames[index]==existingSport)
			{
				sportNames[index]=updatedSport;
				isSportUpdated=true;
			}
		}
		
		if(isSportUpdated==false)
			System.out.println(existingSport+" is not found");
		
		return isSportUpdated;
	}
	
	public boolean deleteSport(String deleteSport)
	{
		boolean isSportDeleted=false;
		
		for(int index=0;index<sportNames.length;index++)
		{
			if(sportNames[index]==deleteSport)
			{
				sportNames[index]=null;
				isSportDeleted=true;
			}
		}
		
		if(isSportDeleted==false)
			System.out.println(deleteSport+" sport name not found");
		
		return isSportDeleted;
	}

	
}