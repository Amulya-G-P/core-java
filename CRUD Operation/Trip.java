class Trip 
{
    String places[] = new String[13];
    int index;

    public boolean addPlace(String place) {
        boolean isAdded = false;
        if (place != null && !place.isEmpty()) {
            places[index++] = place;
            isAdded = true;
        } else {
            System.out.println(place + " is invalid");
        }
        return isAdded;
    }

    public void getPlaces() {
        System.out.println("Available Places are:");
        for (String p : places) {
                System.out.println(p);
        }
    }

    public String getPlaceByName(String placeName) {
        String name = null;
        for(String place:places)
		{
			if(place==placeName)
			{
				name=place;
				break;
			}
		}
        if (name == null) {
            System.out.println(placeName + " is not found");
        }
        return name;
    }

    public boolean updatePlace(String existingPlace, String updatedPlace) {
        boolean isUpdated = false;
        for(int index=0;index<places.length;index++)
		{
			if(places[index]==existingPlace)
			{
				places[index]=updatedPlace;
				isUpdated=true;
			}
		}
        if (!isUpdated) {
            System.out.println(existingPlace + " is not found");
        }
        return isUpdated;
    }

    public boolean deletePlace(String value) {
        boolean isDeleted = false;
        for(int index=0;index<places.length;index++)
		{
			if(places[index]==value)
			{
				places[index]=null;
				isDeleted=true;
			}
		}
        if (!isDeleted) {
            System.out.println(value + " is not found");
        }
        return isDeleted;
    }
}