class Hungama
{
    String showNames[] = new String[14];
    int index;

    public boolean addShow(String show) {
        boolean isAdded = false;
        if (show != null && !show.isEmpty()) {
            if (index < showNames.length) {
                showNames[index++] = show;
                isAdded = true;
            } else {
                System.out.println("Storage is full");
            }
        } else {
            System.out.println(show + " is invalid");
        }
        return isAdded;
    }

    public void getShows() {
        System.out.println("Hungama Shows are:");
        for (String s : showNames) {
                System.out.println(s);
        }
    }

    public String getShowByName(String showName) {
        String name = null;
        for(String show:showNames)
		{
			if(show==showName)
			{
				name=show;
				break;
			}
		}
        if (name == null) {
            System.out.println(showName + " is not found");
        }
        return name;
    }

    public boolean updateShow(String existingShow, String updatedShow) {
        boolean isUpdated = false;
        for(int index=0;index<showNames.length;index++)
		{
			if(showNames[index]==existingShow)
			{
				showNames[index]=updatedShow;
				isUpdated=true;
			}
		}
        if (!isUpdated) {
            System.out.println(existingShow + " is not found");
        }
        return isUpdated;
    }

    public boolean deleteShow(String value) {
        boolean isDeleted = false;
        for(int index=0;index<showNames.length;index++)
		{
			if(showNames[index]==value)
			{
				showNames[index]=null;
				isDeleted=true;
			}
		}
        if (!isDeleted) {
            System.out.println(value + " is not found");
        }
        return isDeleted;
    }
}