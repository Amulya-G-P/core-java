class StateElection 
{
    String partyNames[] = new String[7];
    int index;

    public boolean addParty(String party) {
        boolean isAdded = false;
        if (party != null && !party.isEmpty()) {
            partyNames[index++] = party;
            isAdded = true;
        } else {
            System.out.println(party + " is invalid");
        }
        return isAdded;
    }

    public void getParties() {
        System.out.println("Available Political Parties are:");
        for (String p : partyNames) {
                System.out.println(p);
        }
    }

    public String getPartyByName(String partyName) {
        String name = null;
        for(String party:partyNames)
		{
			if(party==partyName)
			{
				name=party;
				break;
			}
		}
		if(name==null)
			System.out.println(partyName+" not found");
        return name;
    }

    public boolean updateParty(String existingParty, String updatedParty) 
	{
        boolean isUpdated = false;
        for(int index=0;index<partyNames.length;index++)
		{
			if(partyNames[index]==existingParty)
			{
				partyNames[index]=updatedParty;
				isUpdated=true;
			}
		}
        if (!isUpdated) {
            System.out.println(existingParty + " is not found");
        }
        return isUpdated;
    }

    public boolean deleteParty(String value) 
	{
        boolean isDeleted = false;
        for(int index=0;index<partyNames.length;index++)
		{
			if(partyNames[index]==value)
			{
				partyNames[index]=null;
				isDeleted=true;
			}
		}
        if (!isDeleted) {
            System.out.println(value + " is not found");
        }
        return isDeleted;
    }
}