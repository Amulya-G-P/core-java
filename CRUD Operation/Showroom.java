class Showroom 
{
    String managerNames[] = new String[8];
    int index;

    public boolean addManager(String manager) {
        boolean isAdded = false;
        if (manager != null && !manager.isEmpty()) {
            if (index < managerNames.length) {
                managerNames[index++] = manager;
                isAdded = true;
            } else {
                System.out.println("Storage is full");
            }
        } else {
            System.out.println(manager + " is invalid");
        }
        return isAdded;
    }

    public void getManagers() {
        System.out.println("Showroom Managers are:");
        for (String m : managerNames) {
                System.out.println(m);
        }
    }

    public String getManagerByName(String managerName) {
        String name = null;
        for(String manager:managerNames)
		{
			if(manager==managerName)
			{
				name=manager;
				break;
			}
		}
        if (name == null) {
            System.out.println(managerName + " is not found");
        }
        return name;
    }

    public boolean updateManager(String existingManager, String updatedManager) {
        boolean isUpdated = false;
        for(int index=0;index<managerNames.length;index++)
		{
			if(managerNames[index]==existingManager)
			{
				managerNames[index]=updatedManager;
				isUpdated=true;
			}
		}
        if (!isUpdated) {
            System.out.println(existingManager + " is not found");
        }
        return isUpdated;
    }

    public boolean deleteManager(String value) {
        boolean isDeleted = false;
        for(int index=0;index<managerNames.length;index++)
		{
			if(managerNames[index]==value)
			{
				managerNames[index]=null;
				isDeleted=true;
			}
		}
        if (!isDeleted) {
            System.out.println(value + " is not found");
        }
        return isDeleted;
    }
}