class Pasta 
{
    String ingredients[] = new String[10];
    int index;

    public boolean addIngredient(String item) {
        boolean isAdded = false;
        if (item != null && !item.isEmpty()) {
            if (index < ingredients.length) {
                ingredients[index++] = item;
                isAdded = true;
            } else {
                System.out.println("Storage is full");
            }
        } else {
            System.out.println(item + " is invalid");
        }
        return isAdded;
    }

    public void getIngredients() {
        System.out.println("Pasta Ingredients:");
        for (String i : ingredients) {
            System.out.println(i);
        }
    }

    public String getIngredientByName(String iname) {
        String name = null;
        for(String tname:ingredients)
		{
			if(tname==iname)
			{
				name=tname;
				break;
			}
		}
        if (name == null) {
            System.out.println(iname + " is not found");
        }
        return name;
    }

    public boolean updateIngredient(String oldName, String newName) {
        boolean isUpdated = false;
        for(int index=0;index<ingredients.length;index++)
		{
			if(ingredients[index]==oldName)
			{
				ingredients[index]=newName;
				isUpdated=true;
			}
		}
        if (!isUpdated) {
            System.out.println(oldName + " is not found");
        }
        return isUpdated;
    }

    public boolean deleteIngredient(String name) {
        boolean isDeleted = false;
        for(int index=0;index<ingredients.length;index++)
		{
			if(ingredients[index]==name)
			{
				ingredients[index]=null;
				isDeleted=true;
			}
		}
        if (!isDeleted) {
            System.out.println(name + " is not found");
        }
        return isDeleted;
    }
}