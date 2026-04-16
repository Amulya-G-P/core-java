class Singer 
{
    String songNames[] = new String[10];
    int index;

    public boolean addSong(String song) {
        boolean isAdded = false;
        if (song != null && !song.isEmpty()) {
            if (index < songNames.length) {
                songNames[index++] = song;
                isAdded = true;
            } else {
                System.out.println("Storage is full");
            }
        } else {
            System.out.println(song + " is invalid");
        }
        return isAdded;
    }

    public void getSongs() {
        System.out.println("Songs:");
        for (String s : songNames) {
            System.out.println(s);
        }
    }

    public String getSongByName(String songname) {
        String name = null;
        for(String song:songNames)
		{
			if(song==songname)
			{
				name=song;
				break;
			}
		}
        if (name == null) {
            System.out.println(songname + " is not found");
        }
        return name;
    }

    public boolean updateSong(String oldName, String newName) {
		boolean isUpdated = false;
        for(int index=0;index<songNames.length;index++)
		{
			if(songNames[index]==oldName)
			{
				songNames[index]=newName;
				isUpdated=true;
			}
		}
        if (!isUpdated) {
            System.out.println(oldName + " is not found");
        }
        return isUpdated;
    }

    public boolean deleteSong(String name) {
        boolean isDeleted = false;
        for(int index=0;index<songNames.length;index++)
		{
			if(songNames[index]==name)
			{
				songNames[index]=null;
				isDeleted=true;
			}
		}
        if (!isDeleted) {
            System.out.println(name + " is not found");
        }
        return isDeleted;
    }
}