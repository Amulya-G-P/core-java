class MedicalShop 
{
    String medicineNames[] = new String[10];
    int index;

    public boolean addMedicine(String medicine) 
	{
        boolean isAdded = false;
        if (medicine != null && !medicine.isEmpty()) {
            medicineNames[index++] = medicine;
            isAdded = true;
        } else {
            System.out.println(medicine + " is invalid");
        }
        return isAdded;
    }

    public void getMedicines() {
        System.out.println("Available Medicines are:");
        for (String m : medicineNames) {
                System.out.println(m);
        }
    }

    public String getMedicineByName(String medicineName) {
        String name = null;
        for(String medicine:medicineNames)
		{
			if(medicine==medicineName)
			{
				name=medicine;
				break;
			}
		}
        if (name == null) {
            System.out.println(medicineName + " is not found");
        }
        return name;
    }

    public boolean updateMedicine(String existingMedicine, String updatedMedicine) 
	{
        boolean isUpdated = false;
        for(int index=0;index<medicineNames.length;index++)
		{
			if(medicineNames[index]==existingMedicine)
			{
				medicineNames[index]=updatedMedicine;
				isUpdated=true;
			}
		}
        if (!isUpdated) {
            System.out.println(existingMedicine + " is not found");
        }
        return isUpdated;
    }

    public boolean deleteMedicine(String value) 
	{
        boolean isDeleted = false;
        for(int index=0;index<medicineNames.length;index++)
		{
			if(medicineNames[index]==value)
			{
				medicineNames[index]=null;
				isDeleted=true;
			}
		}
        
        if (!isDeleted) {
            System.out.println(value + " is not found");
        }
        return isDeleted;
    }
}