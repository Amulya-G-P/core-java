class PoliceStation 
{
    String caseNames[] = new String[16];
    int index;

    public boolean addCase(String caseName) {
        boolean isAdded = false;
        if (caseName != null && !caseName.isEmpty()) {
            caseNames[index++] = caseName;
            isAdded = true;
        } else {
            System.out.println(caseName + " is invalid");
        }
        return isAdded;
    }

    public void getCases() {
        System.out.println("Available Cases are:");
        for (String c : caseNames) {
                System.out.println(c);
        }
    }

    public String getCaseByName(String caseName) {
        String name=null;
		for(String cases:caseNames)
		{
			if(cases==caseName)
			{
				name=cases;
				break;
			}
		}
		if(name==null)
			System.out.println(caseName+" not found");
		
		return name;
    }

    public boolean updateCase(String existingCase, String updatedCase) 
	{
        boolean isUpdated=false;
		for(int index=0;index<caseNames.length;index++)
		{
			if(caseNames[index]==existingCase)
			{
				caseNames[index]=updatedCase;
				isUpdated=true;
			}
		}
		if(isUpdated==false)
			System.out.println(existingCase+" is not found");
		
		return isUpdated;
    }

    public boolean deleteCase(String value) 
	{
        boolean isDeleted = false;
        for(int index=0;index<caseNames.length;index++)
		{
			if(caseNames[index]==value)
			{
				caseNames[index]=null;
				isDeleted=true;
			}
		}
        if (!isDeleted) {
            System.out.println(value + " is not found");
        }
        return isDeleted;
    }
}