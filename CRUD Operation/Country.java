class Country
{
	String states[]=new String[29];
	int index;
	
	public boolean addStateNames(String state)
	{
		boolean isStatesAdded=false;
		if(state!=null && !state.isEmpty())
		{
			states[index++]=state;
			isStatesAdded=true;
		}
		else
			System.out.println(state+"state not found");
			
		return isStatesAdded;
	}
	
	public void getStateDetails()
	{
		System.out.println("The list of States are:");
		for(String country:states)
			System.out.println(country);
	}
	public String getStateByName(String stateName)
	{
		String name=null;
		for(String state:states)
		{
			if(state==stateName)
			{
				name=state;
				break;
			}
		}
		if(name==null)
			System.out.println(stateName+" not found");
		
		return name;
	}
	
	
	public boolean updateState(String existingState,String updatedState)
	{
		boolean isStateUpdated=false;
		
		for(int index=0;index<states.length;index++)
		{
			if(states[index]==existingState)
			{
				states[index]=updatedState;
				isStateUpdated=true;
			}
		}
		
		if(isStateUpdated==false)
			System.out.println(existingState+" is not found");
		
		return isStateUpdated;
	}
	
	
	public boolean deleteState(String deleteState)
	{
		boolean isStateDeleted=false;
		
		for(int index=0;index<states.length;index++)
		{
			if(states[index]==deleteState)
			{
				states[index]=null;
				isStateDeleted=true;
			}
		}
		
		if(isStateDeleted==false)
			System.out.println(deleteState+" state not found");
		
		return isStateDeleted;
	}

	
}