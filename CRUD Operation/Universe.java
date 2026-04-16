class Universe 
{
    String galaxies[] = new String[11];
    int index;

    public boolean addGalaxy(String galaxy) {
        boolean isAdded = false;
        if (galaxy != null && !galaxy.isEmpty()) {
            if (index < galaxies.length) {
                galaxies[index++] = galaxy;
                isAdded = true;
            } else {
                System.out.println("Storage is full");
            }
        } else {
            System.out.println(galaxy + " is invalid");
        }
        return isAdded;
    }

    public void getGalaxies() {
        System.out.println("Galaxies in Universe are:");
        for (String g : galaxies) {
                System.out.println(g);
        }
    }

    public String getGalaxyByName(String galaxyName) {
        String name = null;
        for(String galaxy:galaxies)
		{
			if(galaxy==galaxyName)
			{
				name=galaxy;
				break;
			}
		}
        if (name == null) {
            System.out.println(galaxyName + " is not found");
        }
        return name;
    }

    public boolean updateGalaxy(String existingGalaxy, String updatedGalaxy) {
        boolean isUpdated = false;
        for(int index=0;index<galaxies.length;index++)
		{
			if(galaxies[index]==existingGalaxy)
			{
				galaxies[index]=updatedGalaxy;
				isUpdated=true;
			}
		}
        if (!isUpdated) {
            System.out.println(existingGalaxy + " is not found");
        }
        return isUpdated;
    }

    public boolean deleteGalaxy(String value) {
        boolean isDeleted = false;
        for(int index=0;index<galaxies.length;index++)
		{
			if(galaxies[index]==value)
			{
				galaxies[index]=null;
				isDeleted=true;
			}
		}
        if (!isDeleted) {
            System.out.println(value + " is not found");
        }
        return isDeleted;
    }
}