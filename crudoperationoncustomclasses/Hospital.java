class Hospital
{
	Doctor doctors[] = new Doctor[5];
	int index;
	
	public boolean createDoctor(Doctor doctor)
	{
		boolean isDoctorAdded = false;
		
		boolean isDoctorIdAdded = false;
		boolean isDoctorNameAdded = false;
		boolean isDoctorDesignationAdded = false;
		boolean isDoctorExperienceAdded = false;
		boolean isDoctorFeesAdded = false;
		boolean isDoctorSpecializationAdded = false;
		
		if(doctor.doctorId>0)
		{
			isDoctorIdAdded = true;
		}else
			System.out.println("doctor doctorId is not available....right now");
			
		
		if(doctor.doctorName != null && !doctor.doctorName.isEmpty())
		{
			isDoctorNameAdded = true;
		}else
			System.out.println("doctor doctorName is not available....right now");
			
		
		if(doctor.designation != null && !doctor.designation.isEmpty())
		{
			isDoctorDesignationAdded = true;
		}else
			System.out.println("doctor designation is not available....right now");
			
		if(doctor.expericence != null && !doctor.expericence.isEmpty())
		{
			isDoctorExperienceAdded = true;
		}else
			System.out.println("doctor expericence is not available....right now");
			
		if(doctor.fees>250)
		{
			isDoctorFeesAdded = true;
		}else
			System.out.println("doctor fees is not available....right now");
			
		if(doctor.specializations != null && doctor.specializations.length>0)
		{
			isDoctorSpecializationAdded = true;
		}else
			System.out.println("doctor specialization is not available....right now");
			
		if(isDoctorIdAdded && isDoctorNameAdded && isDoctorDesignationAdded && isDoctorExperienceAdded && isDoctorFeesAdded && isDoctorSpecializationAdded){
			
		doctors[index++] = doctor;
		isDoctorAdded = true;
			
		}	
		return isDoctorAdded;
	}
	
	public void getDoctorAllDetails()
	{
		for(Doctor doctor : doctors)
			if(doctor != null)
				System.out.println(" Doctor ID is :" + doctors.doctorId);

		for(Doctor doctor : doctors)
			if(doctor != null)
				System.out.println(" Doctor Name is :" + doctors.doctorName);

		for(Doctor doctor : doctors)
			if(doctor != null)
				System.out.println(" Doctor designation is :" + doctors.designation);

		for(Doctor doctor : doctors)
			if(doctor != null)
				System.out.println(" Doctor expericence  is :" + doctors.expericence);

		for(Doctor doctor : doctors)
			if(doctor != null)
				System.out.println(" Doctor fees is :" + doctors.fees);

		for(Doctor doctor : doctors)
			if(doctor != null && doctor.specializations != null)
				for(String specialization : doctor.specializations)
					System.out.println("Doctor specialization is: " + specialization);
	}
}