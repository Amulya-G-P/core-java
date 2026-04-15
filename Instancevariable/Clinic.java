class Clinic 
{ 
	int clinicId;
	String clinicName;
	String clinicType;
	String location;
	Doctor doctor;
	
	public void getClinicDetails()
	{
		System.out.println("The Clinic id is : " + clinicId);
		System.out.println("The Clinic Name is : " + clinicName);
		System.out.println("The Clinic Type is : " + clinicType);
		System.out.println("The Clinic Location is : " + location);
		doctor.getDoctorDetails();
	}
}