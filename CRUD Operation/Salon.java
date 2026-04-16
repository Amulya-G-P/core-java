class Salon 
{
    String services[] = new String[7];
    int index;

    public boolean addService(String service) {
        boolean isAdded = false;
        if (service != null && !service.isEmpty()) {
            if (index < services.length) {
                services[index++] = service;
                isAdded = true;
            } else {
                System.out.println("Storage is full");
            }
        } else {
            System.out.println(service + " is invalid");
        }
        return isAdded;
    }

    public void getServices() {
        System.out.println("Salon Services are:");
        for (String s : services) {
                System.out.println(s);
        }
    }

    public String getServiceByName(String serviceName) {
        String name = null;
        for(String service:services)
		{
			if(service==serviceName)
			{
				name=service;
				break;
			}
		}
        if (name == null) {
            System.out.println(serviceName + " is not found");
        }
        return name;
    }

    public boolean updateService(String existingService, String updatedService) {
        boolean isUpdated = false;
        for(int index=0;index<services.length;index++)
		{
			if(services[index]==existingService)
			{
				services[index]=updatedService;
				isUpdated=true;
			}
		}
        if (!isUpdated) {
            System.out.println(existingService + " is not found");
        }
        return isUpdated;
    }

    public boolean deleteService(String value) {
        boolean isDeleted = false;
        for(int index=0;index<services.length;index++)
		{
			if(services[index]==value)
			{
				services[index]=null;
				isDeleted=true;
			}
		}
        if (!isDeleted) {
            System.out.println(value + " is not found");
        }
        return isDeleted;
    }
}