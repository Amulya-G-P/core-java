class SuperMarket 
{
    String productNames[] = new String[8];
    int index;

    public boolean addProduct(String product) {
        boolean isAdded = false;
        if (product != null && !product.isEmpty()) {
            productNames[index++] = product;
            isAdded = true;
        } else {
            System.out.println(product + " is invalid");
        }
        return isAdded;
    }

    public void getProducts() {
        System.out.println("Available Products are:");
        for(String item:productNames)
			System.out.println(item);
    }

    public String getProductByName(String productName) 
	{
        String name=null;
		for(String item:productNames)
		{
			if(item==productName)
			{
				name=item;
				break;
			}
		}
		if(name==null)
			System.out.println(productName+" not found");
		
		return name;
    }
	
    public boolean updateProduct(String existingProduct, String updatedProduct) 
	{
		boolean isUpdated=false;
		
		for(int index=0;index<productNames.length;index++)
		{
			if(productNames[index]==existingProduct)
			{
				productNames[index]=updatedProduct;
				isUpdated=true;
			}
		}
		
		if(isUpdated==false)
			System.out.println(existingProduct+" is not found");
		
		return isUpdated;
    }

    public boolean deleteProduct(String value) 
	{
		boolean isDeleted=false;
		
		for(int index=0;index<productNames.length;index++)
		{
			if(productNames[index]==value)
			{
				productNames[index]=null;
				isDeleted=true;
			}
		}
		
		if(isDeleted==false)
			System.out.println(value+" product not found");
		
		return isDeleted;
	}

}