class Turbine 
{
    String featureNames[] = new String[10];
    int index;

    public boolean addFeature(String feature) {
        boolean isAdded = false;
        if (feature != null && !feature.isEmpty()) {
            if (index < featureNames.length) {
                featureNames[index++] = feature;
                isAdded = true;
            } else {
                System.out.println("Storage is full");
            }
        } else {
            System.out.println(feature + " is invalid");
        }
        return isAdded;
    }

    public void getFeatures() {
        System.out.println("Turbine Features:");
        for (String f : featureNames) {
            System.out.println(f);
        }
    }

    public String getFeatureByName(String fname) {
        String name = null;
        for(String feature:featureNames)
		{
			if(feature==fname)
			{
				name=feature;
				break;
			}
		}
        if (name == null) {
            System.out.println(fname + " is not found");
        }
        return name;
    }

    public boolean updateFeature(String oldName, String newName) {
        boolean isUpdated = false;
        for(int index=0;index<featureNames.length;index++)
		{
			if(featureNames[index]==oldName)
			{
				featureNames[index]=newName;
				isUpdated=true;
			}
		}
        if (!isUpdated) {
            System.out.println(oldName + " is not found");
        }
        return isUpdated;
    }

    public boolean deleteFeature(String name) {
        boolean isDeleted = false;
        for(int index=0;index<featureNames.length;index++)
		{
			if(featureNames[index]==name)
			{
				featureNames[index]=null;
				isDeleted=true;
			}
		}
        if (!isDeleted) {
            System.out.println(name + " is not found");
        }
        return isDeleted;
    }
}