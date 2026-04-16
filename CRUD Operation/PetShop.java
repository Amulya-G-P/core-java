class PetShop
{
    String accessories[] = new String[16];
    int index;

    public boolean addAccessory(String accessory) {
        boolean isAdded = false;
        if (accessory != null && !accessory.isEmpty()) {
            accessories[index++] = accessory;
            isAdded = true;
        } else {
            System.out.println(accessory + " is invalid");
        }
        return isAdded;
    }

    public void getAccessories() {
        System.out.println("Pet Accessories are:");
        for (String a : accessories) {
                System.out.println(a);
        }
    }

    public String getAccessoryByName(String accessoryName) {
        String name = null;
        for(String access:accessories)
		{
			if(access==accessoryName)
			{
				name=access;
				break;
			}
		}
        if (name == null) {
            System.out.println(accessoryName + " is not found");
        }
        return name;
    }

    public boolean updateAccessory(String existingAccessory, String updatedAccessory) {
        boolean isUpdated = false;
        for(int index=0;index<accessories.length;index++)
		{
			if(accessories[index]==existingAccessory)
			{
				accessories[index]=updatedAccessory;
				isUpdated=true;
			}
		}
        if (!isUpdated) {
            System.out.println(existingAccessory + " is not found");
        }
        return isUpdated;
    }

    public boolean deleteAccessory(String value) {
        boolean isDeleted = false;
        for(int index=0;index<accessories.length;index++)
		{
			if(accessories[index]==value)
			{
				accessories[index]=null;
				isDeleted=true;
			}
		}
        if (!isDeleted) {
            System.out.println(value + " is not found");
        }
        return isDeleted;
    }
}