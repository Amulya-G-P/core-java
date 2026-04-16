class Cylinder 
{
    String cylindernames[] = new String[10];
    int index;

    public boolean addCylinder(String name) {
        boolean isAdded = false;
        if (name != null && !name.isEmpty()) {
            if (index < cylindernames.length) {
                cylindernames[index++] = name;
                isAdded = true;
            } else {
                System.out.println("Storage is full");
            }
        } else {
            System.out.println(name + " is invalid");
        }
        return isAdded;
    }

    public void getCylinders() {
        System.out.println("Cylinder Names:");
        for (String c : cylindernames) {
            System.out.println(c);
        }
    }

    public String getCylinderByName(String cylindername) {
        String name = null;
        for(String cylinder:cylindernames)
		{
			if(cylinder==cylindername)
			{
				name=cylinder;
				break;
			}
		}
        if (name == null) {
            System.out.println(cylindername + " is not found");
        }
        return name;
    }

    public boolean updateCylinder(String oldName, String newName) {
        boolean isUpdated = false;
        for(int index=0;index<cylindernames.length;index++)
		{
			if(cylindernames[index]==oldName)
			{
				cylindernames[index]=newName;
				isUpdated=true;
			}
		}
        if (!isUpdated) {
            System.out.println(oldName + " is not found");
        }
        return isUpdated;
    }

    public boolean deleteCylinder(String name) {
        boolean isDeleted = false;
        for(int index=0;index<cylindernames.length;index++)
		{
			if(cylindernames[index]==name)
			{
				cylindernames[index]=null;
				isDeleted=true;
			}
		}
        if (!isDeleted) {
            System.out.println(name + " is not found");
        }
        return isDeleted;
    }
}