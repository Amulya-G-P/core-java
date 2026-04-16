class Digitalzone 
{
    String laptopBrandNames[] = new String[6];
    int index;

    public boolean addLaptopBrand(String brand) {
        boolean isAdded = false;
        if (brand != null && !brand.isEmpty()) {
            laptopBrandNames[index++] = brand;
            isAdded = true;
        } else {
            System.out.println(brand + " is invalid");
        }
        return isAdded;
    }

    public void getLaptopBrands()
	{
		System.out.println("The list of Digital ZoneView are:");
		for(String zone:laptopBrandNames)
			System.out.println(zone);
	}
	public String getLaptopBrandByName(String zoned)
	{
		String name=null;
		for(String zone:laptopBrandNames)
		{
			if(zone==zoned)
			{
				name=zone;
				break;
			}
		}
		if(name==null)
			System.out.println(zoned+" not found");
		
		return name;
	}
	
	
	public boolean updateLaptopBrand(String existingdata,String updateddata)
	{
		boolean isUpdated=false;
		
		for(int index=0;index<laptopBrandNames.length;index++)
		{
			if(laptopBrandNames[index]==existingdata)
			{
				laptopBrandNames[index]=updateddata;
				isUpdated=true;
			}
		}
		
		if(isUpdated==false)
			System.out.println(existingdata+" is not found");
		
		return isUpdated;
	}
	
	
	public boolean deleteLaptopBrand(String deleteData)
	{
		boolean isDeleted=false;
		
		for(int index=0;index<laptopBrandNames.length;index++)
		{
			if(laptopBrandNames[index]==deleteData)
			{
				laptopBrandNames[index]=null;
				isDeleted=true;
			}
		}
		
		if(isDeleted==false)
			System.out.println(deleteData+" Laptop Brand not found");
		
		return isDeleted;
	}

	
}