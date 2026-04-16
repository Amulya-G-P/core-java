class Movie 
{
    String castNames[] = new String[9];
    int index;

    public boolean addCast(String cast) {
        boolean isAdded = false;
        if (cast != null && !cast.isEmpty()) {
            castNames[index++] = cast;
            isAdded = true;
        } else {
            System.out.println(cast + " is invalid");
        }
        return isAdded;
    }

    public void getCast() {
        System.out.println("Movie Cast Members are:");
        for (String c : castNames) {
                System.out.println(c);
        }
    }

    public String getCastByName(String castName) {
        String name = null;
        for(String cast:castNames)
		{
			if(cast==castName)
			{
				name=cast;
				break;
			}
		}
        if (name == null) {
            System.out.println(castName + " is not found");
        }
        return name;
    }

    public boolean updateCast(String existingCast, String updatedCast) {
        boolean isUpdated = false;
        for(int index=0;index<castNames.length;index++)
		{
			if(castNames[index]==existingCast)
			{
				castNames[index]=updatedCast;
				isUpdated=true;
			}
		}
        if (!isUpdated) {
            System.out.println(existingCast + " is not found");
        }
        return isUpdated;
    }

    public boolean deleteCast(String value) {
        boolean isDeleted = false;
        for(int index=0;index<castNames.length;index++)
		{
			if(castNames[index]==value)
			{
				castNames[index]=null;
				isDeleted=true;
			}
		}
        if (!isDeleted) {
            System.out.println(value + " is not found");
        }
        return isDeleted;
    }
}