class Tree 
{
    String treenames[] = new String[10];
    int index;

    public boolean addTree(String name) {
        boolean isAdded = false;
        if (name != null && !name.isEmpty()) {
            if (index < treenames.length) {
                treenames[index++] = name;
                isAdded = true;
            } else {
                System.out.println("Storage is full");
            }
        } else {
            System.out.println(name + " is invalid");
        }
        return isAdded;
    }

    public void getTrees() {
        System.out.println("Tree Names:");
        for (String t : treenames) {
            System.out.println(t);
        }
    }

    public String getTreeByName(String treename) {
        String name = null;
        for(String tname:treenames)
		{
			if(tname==treename)
			{
				name=tname;
				break;
			}
		}
        if (name == null) {
            System.out.println(treename + " is not found");
        }
        return name;
    }

    public boolean updateTree(String oldName, String newName) {
        boolean isUpdated = false;
        for(int index=0;index<treenames.length;index++)
		{
			if(treenames[index]==oldName)
			{
				treenames[index]=newName;
				isUpdated=true;
			}
		}
        if (!isUpdated) {
            System.out.println(oldName + " is not found");
        }
        return isUpdated;
    }

    public boolean deleteTree(String name) {
        boolean isDeleted = false;
        for(int index=0;index<treenames.length;index++)
		{
			if(treenames[index]==name)
			{
				treenames[index]=null;
				isDeleted=true;
			}
		}
        if (!isDeleted) {
            System.out.println(name + " is not found");
        }
        return isDeleted;
    }
}