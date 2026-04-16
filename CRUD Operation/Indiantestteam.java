class Indiantestteam 
{
    String playerNames[] = new String[11];
    int index;

    public boolean addPlayer(String player) {
        boolean isAdded = false;
        if (player != null && !player.isEmpty()) {
            if (index < playerNames.length) {
                playerNames[index++] = player;
                isAdded = true;
            } else {
                System.out.println("Storage is full");
            }
        } else {
            System.out.println(player + " is invalid");
        }
        return isAdded;
    }

    public void getPlayers() {
        System.out.println("Indian Test Team Players are:");
        for (String p : playerNames) {
                System.out.println(p);
        }
    }

    public String getPlayerByName(String playerName) {
        String name = null;
        for(String play:playerNames)
		{
			if(play==playerName)
			{
				name=play;
				break;
			}
		}
        if (name == null) {
            System.out.println(playerName + " is not found");
        }
        return name;
    }

    public boolean updatePlayer(String existingPlayer, String updatedPlayer) {
        boolean isUpdated = false;
        for(int index=0;index<playerNames.length;index++)
		{
			if(playerNames[index]==existingPlayer)
			{
				playerNames[index]=updatedPlayer;
				isUpdated=true;
			}
		}
        if (!isUpdated) {
            System.out.println(existingPlayer + " is not found");
        }
        return isUpdated;
    }

    public boolean deletePlayer(String value) {
        boolean isDeleted = false;
        for(int index=0;index<playerNames.length;index++)
		{
			if(playerNames[index]==value)
			{
				playerNames[index]=null;
				isDeleted=true;
			}
		}
        if (!isDeleted) {
            System.out.println(value + " is not found");
        }
        return isDeleted;
    }
}