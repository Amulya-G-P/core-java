class House 
{
    String indoorgames[] = new String[6];
    int index;

    public boolean addIndoorGame(String game) {
        boolean isAdded = false;
        if (game != null && !game.isEmpty()) {
            if (index < indoorgames.length) {
                indoorgames[index++] = game;
                isAdded = true;
            } else {
                System.out.println("Storage is full");
            }
        } else {
            System.out.println(game + " is invalid");
        }
        return isAdded;
    }

    public void getIndoorGames() {
        System.out.println("Indoor Games:");
        for (String g : indoorgames) {
            System.out.println(g);
        }
    }

    public String getGameByName(String indoorName) {
        String name = null;
        for(String indoor:indoorgames)
		{
			if(indoor==indoorName)
			{
				name=indoor;
				break;
			}
		}
        if (name == null) {
            System.out.println(indoorName + " is not found");
        }
        return name;
    }

    public boolean updateGame(String oldName, String newName) {
        boolean isUpdated = false;
        for(int index=0;index<indoorgames.length;index++)
		{
			if(indoorgames[index]==oldName)
			{
				indoorgames[index]=newName;
				isUpdated=true;
			}
		}
        if (!isUpdated) {
            System.out.println(oldName + " is not found");
        }
        return isUpdated;
    }

    public boolean deleteGame(String name) {
        boolean isDeleted = false;
        for(int index=0;index<indoorgames.length;index++)
		{
			if(indoorgames[index]==value)
			{
				indoorgames[index]=null;
				isDeleted=true;
			}
		}
        if (!isDeleted) {
            System.out.println(name + " is not found");
        }
        return isDeleted;
    }
}