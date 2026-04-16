class MedicalShopExecutor 
{
    public static void main(String[] args)
	{

        MedicalShop m = new MedicalShop();
        boolean added;

        added = m.addMedicine("Paracetamol"); 
		System.out.println(added);
        added = m.addMedicine("Aspirin"); 
		System.out.println(added);
        added = m.addMedicine("Ibuprofen"); 
		System.out.println(added);
        added = m.addMedicine("Amoxicillin");
		System.out.println(added);
        added = m.addMedicine("Cough Syrup"); 
		System.out.println(added);
        added = m.addMedicine("Vitamin C");
		System.out.println(added);
        added = m.addMedicine("Insulin"); 
		System.out.println(added);
        added = m.addMedicine("Antacid"); 
		System.out.println(added);
        added = m.addMedicine("Cetirizine"); 
		System.out.println(added);
        added = m.addMedicine("ORS"); 
		System.out.println(added);

        m.getMedicines();

        String med = m.getMedicineByName("Paracetamol");
        System.out.println(med + " is available");

        boolean updated = m.updateMedicine("ORS", "ORS Powder");
        System.out.println(updated);

        m.getMedicines();

        boolean deleted = m.deleteMedicine("Aspirin");
        System.out.println(deleted + " is deleted");

        m.getMedicines();
    }
}