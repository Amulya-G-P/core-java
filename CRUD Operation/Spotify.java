class Spotify 
{
    String songNames[] = new String[10];
    int index;

    public boolean addSong(String song) {
        boolean isAdded = false;
        if (song != null && !song.isEmpty()) {
            songNames[index++] = song;
            isAdded = true;
        } else {
            System.out.println(song + " is invalid");
        }
        return isAdded;
    }

    public void getSongs() {
        System.out.println("Available Songs are:");
        for (String s : songNames) {
                System.out.println(s);
        }
    }

    public String getSongByName(String songName) 
	{
        String name = null;
        for(String song:songNames)
		{
			if(song==songName)
			{
				name=song;
				break;
			}
		}
        if (name == null) {
            System.out.println(songName + " is not found");
        }
        return name;
    }

    public boolean updateSong(String existingSong, String updatedSong) {
        boolean isUpdated = false;
        for(int index=0;index<songNames.length;index++)
		{
			if(songNames[index]==existingSong)
			{
				songNames[index]=updatedSong;
				isUpdated=true;
			}
		}
        if (!isUpdated) {
            System.out.println(existingSong + " is not found");
        }
        return isUpdated;
    }

    public boolean deleteSong(String value) 
	{
        boolean isDeleted = false;
        for(int index=0;index<songNames.length;index++)
		{
			if(songNames[index]==value)
			{
				songNames[index]=null;
				isDeleted=true;
			}
		}
        if (!isDeleted) {
            System.out.println(value + " is not found");
        }
        return isDeleted;
    }
}