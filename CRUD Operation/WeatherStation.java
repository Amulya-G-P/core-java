class WeatherStation 
{
    String temperatureReadings[] = new String[17];
    int index;

    public boolean addTemperature(String temp) {
        boolean isAdded = false;
        if (temp != null && !temp.isEmpty()) {
            temperatureReadings[index++] = temp;
            isAdded = true;
        } else {
            System.out.println(temp + " is invalid");
        }
        return isAdded;
    }

    public void getTemperatures() {
        System.out.println("Temperature Readings are:");
        for (String t : temperatureReadings) {
                System.out.println(t);
        }
    }

    public String getTemperatureByValue(String tempValue) {
        String value = null;
        for(String temp:temperatureReadings)
		{
			if(temp==tempValue)
			{
				value=temp;
				break;
			}
		}
        if (value == null) {
            System.out.println(tempValue + " is not found");
        }
        return value;
    }

    public boolean updateTemperature(String existingTemp, String updatedTemp) 
	{
        boolean isUpdated = false;
        for(int index=0;index<temperatureReadings.length;index++)
		{
			if(temperatureReadings[index]==existingTemp)
			{
				temperatureReadings[index]=updatedTemp;
				isUpdated=true;
			}
		}
        if (!isUpdated) {
            System.out.println(existingTemp + " is not found");
        }
        return isUpdated;
    }

    public boolean deleteTemperature(String value) 
	{
        boolean isDeleted = false;
        for(int index=0;index<temperatureReadings.length;index++)
		{
			if(temperatureReadings[index]==value)
			{
				temperatureReadings[index]=null;
				isDeleted=true;
			}
		}
        if (!isDeleted) {
            System.out.println(value + " is not found");
        }
        return isDeleted;
    }
}