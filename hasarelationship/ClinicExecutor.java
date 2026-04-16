class ClinicExecutor
{
	public static void main(String[] ce)
	{
		Clinic clinic=new Clinic();
		clinic.clinicId=1;
		clinic.clinicName="Om Sai";
		clinic.location="yeshwantpur";
		Doctor doctor=new Doctor();
		clinic.doctor=doctor;
		doctor.doctorId=2;
		doctor.doctorName="Om Prakash";
		docto22r.specialization="Neurologist";
		clinic.getClinicDetails();
	}
}