class Course 
{
    String technologyNames[] = new String[15];
    int index;

    public boolean addTechnology(String tech) {
        boolean isAdded = false;
        if (tech != null && !tech.isEmpty()) {
            if (index < technologyNames.length) {
                technologyNames[index++] = tech;
                isAdded = true;
            } else {
                System.out.println("Storage is full");
            }
        } else {
            System.out.println(tech + " is invalid");
        }
        return isAdded;
    }

    public void getTechnologies() {
        System.out.println("Course Technologies are:");
        for (String t : technologyNames) {
                System.out.println(t);
        }
    }

    public String getTechnologyByName(String techName) {
        String name = null;
        for(String tech:technologyNames)
		{
			if(tech==techName)
			{
				name=tech;
				break;
			}
		}
        if (name == null) {
            System.out.println(techName + " is not found");
        }
        return name;
    }

    public boolean updateTechnology(String existingTech, String updatedTech) {
        boolean isUpdated = false;
        for(int index=0;index<technologyNames.length;index++)
		{
			if(technologyNames[index]==existingTech)
			{
				technologyNames[index]=updatedTech;
				isUpdated=true;
			}
		}
        if (!isUpdated) {
            System.out.println(existingTech + " is not found");
        }
        return isUpdated;
    }

    public boolean deleteTechnology(String value) {
        boolean isDeleted = false;
        for(int index=0;index<technologyNames.length;index++)
		{
			if(technologyNames[index]==value)
			{
				technologyNames[index]=null;
				isDeleted=true;
			}
		}
        if (!isDeleted) {
            System.out.println(value + " is not found");
        }
        return isDeleted;
    }
}