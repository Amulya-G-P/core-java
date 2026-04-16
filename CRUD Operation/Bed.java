class Bed 
{
    String brandNames[] = new String[10];
    int index;

    public boolean addBrand(String brand) {
        boolean isAdded = false;
        if (brand != null && !brand.isEmpty()) {
            if (index < brandNames.length) {
                brandNames[index++] = brand;
                isAdded = true;
            } else {
                System.out.println("Storage is full");
            }
        } else {
            System.out.println(brand + " is invalid");
        }
        return isAdded;
    }

    public void getBrands() {
        System.out.println("Bed Brand Names:");
        for (String b : brandNames) {
            System.out.println(b);
        }
    }

    public String getBrandByName(String brandname) {
        String name = null;
        for(String brand:brandNames)
		{
			if(brand==brandname)
			{
				name=brand;
				break;
			}
		}
        if (name == null) {
            System.out.println(brandname + " is not found");
        }
        return name;
    }

    public boolean updateBrand(String oldName, String newName) {
        boolean isUpdated = false;
        for(int index=0;index<brandNames.length;index++)
		{
			if(brandNames[index]==oldName)
			{
				brandNames[index]=newName;
				isUpdated=true;
			}
		}
        if (!isUpdated) {
            System.out.println(oldName + " is not found");
        }
        return isUpdated;
    }

    public boolean deleteBrand(String name) {
        boolean isDeleted = false;
        for(int index=0;index<brandNames.length;index++)
		{
			if(brandNames[index]==name)
			{
				brandNames[index]=null;
				isDeleted=true;
			}
		}
        if (!isDeleted) {
            System.out.println(name + " is not found");
        }
        return isDeleted;
    }
}