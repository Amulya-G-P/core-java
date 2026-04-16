class Military 
{
    String weaponNames[] = new String[21];
    int index;
	
    public boolean addWeapon(String weapon) {
        boolean isAdded = false;
        if (weapon != null && !weapon.isEmpty()) {
            if (index < weaponNames.length) {
                weaponNames[index++] = weapon;
                isAdded = true;
            } else {
                System.out.println("Storage is full");
            }
        } else {
            System.out.println(weapon + " is invalid");
        }
        return isAdded;
    }

    public void getWeapons() {
        System.out.println("Military Weapons are:");
        for (String w : weaponNames) {
                System.out.println(w);
        }
    }

    public String getWeaponByName(String weaponName) {
        String name = null;
        for(String weapon:weaponNames)
		{
			if(weapon==weaponName)
			{
				name=weapon;
				break;
			}
		}
        if (name == null) {
            System.out.println(weaponName + " is not found");
        }
        return name;
    }

    public boolean updateWeapon(String existingWeapon, String updatedWeapon) {
        boolean isUpdated = false;
        for(int index=0;index<weaponNames.length;index++)
		{
			if(weaponNames[index]==existingWeapon)
			{
				weaponNames[index]=updatedWeapon;
				isUpdated=true;
			}
		}
        if (!isUpdated) {
            System.out.println(existingWeapon + " is not found");
        }
        return isUpdated;
    }

    public boolean deleteWeapon(String value) {
        boolean isDeleted = false;
       for(int index=0;index<weaponNames.length;index++)
		{
			if(weaponNames[index]==value)
			{
				weaponNames[index]=null;
				isDeleted=true;
			}
		}
        if (!isDeleted) {
            System.out.println(value + " is not found");
        }
        return isDeleted;
    }
}