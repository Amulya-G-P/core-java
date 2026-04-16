class Amazon 
{
    String categoryNames[] = new String[21];
    int index;

    public boolean addCategory(String category) {
        boolean isAdded = false;
        if (category != null && !category.isEmpty()) {
            categoryNames[index++] = category;
            isAdded = true;
        } else {
            System.out.println(category + " is invalid");
        }
        return isAdded;
    }

    public void getCategories() {
        System.out.println("Available Categories are:");
        for (String c : categoryNames) {
                System.out.println(c);
        }
    }

    public String getCategoryByName(String categoryName) {
        String name = null;
        for(String category:categoryNames)
		{
			if(category==categoryName)
			{
				name=category;
				break;
			}
		}
        if (name == null) {
            System.out.println(categoryName + " is not found");
        }
        return name;
    }

    public boolean updateCategory(String existingCategory, String updatedCategory) {
        boolean isUpdated = false;
        for(int index=0;index<categoryNames.length;index++)
		{
			if(categoryNames[index]==existingCategory)
			{
				categoryNames[index]=updatedCategory;
				isUpdated=true;
			}
		}
        if (!isUpdated) {
            System.out.println(existingCategory + " is not found");
        }
        return isUpdated;
    }

    public boolean deleteCategory(String value) {
        boolean isDeleted = false;
        for(int index=0;index<categoryNames.length;index++)
		{
			if(categoryNames[index]==value)
			{
				categoryNames[index]=null;
				isDeleted=true;
			}
		}
        if (!isDeleted) {
            System.out.println(value + " is not found");
        }
        return isDeleted;
    }
}