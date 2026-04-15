class RealEstateExecutor
{
    public static void main(String[] args)
    {
        RealEstate r1 = new RealEstate();
        r1.realEstateId = 1; 
		r1.companyName = "Prestige";
		r1.location = "Bangalore"; 
		r1.numberOfProperties = 50;

        RealEstate r2 = new RealEstate();
        r2.realEstateId = 2;
		r2.companyName = "Brigade"; 
		r2.location = "Mysuru";
		r2.numberOfProperties = 40;

        RealEstate r3 = new RealEstate();
        r3.realEstateId = 3;
		r3.companyName = "Sobha"; 
		r3.location = "Chennai"; 
		r3.numberOfProperties = 60;

        RealEstate r4 = new RealEstate();
        r4.realEstateId = 4; 
		r4.companyName = "Puravankara";
		r4.location = "Hyderabad"; 
		r4.numberOfProperties = 35;

        RealEstate r5 = new RealEstate();
        r5.realEstateId = 5;
		r5.companyName = "Godrej Properties"; 
		r5.location = "Mumbai"; 
		r5.numberOfProperties = 70;

        RealEstate r6 = new RealEstate();
        r6.realEstateId = 6; 
		r6.companyName = "DLF"; 
		r6.location = "Delhi"; 
		r6.numberOfProperties = 80;

        RealEstate r7 = new RealEstate();
        r7.realEstateId = 7;
		r7.companyName = "Lodha";
		r7.location = "Pune";
		r7.numberOfProperties = 55;

        RealEstate r8 = new RealEstate();
        r8.realEstateId = 8; 
		r8.companyName = "Oberoi Realty";
		r8.location = "Mumbai";
		r8.numberOfProperties = 45;

        RealEstate r9 = new RealEstate();
        r9.realEstateId = 9;
		r9.companyName = "Embassy Group";
		r9.location = "Bangalore"; 
		r9.numberOfProperties = 65;

        RealEstate r10 = new RealEstate();
        r10.realEstateId = 10;
		r10.companyName = "Salarpuria"; 
		r10.location = "Kolkata"; 
		r10.numberOfProperties = 30;

        RealEstate r11 = new RealEstate();
        r11.realEstateId = 11; 
		r11.companyName = "Century"; 
		r11.location = "Bangalore";
		r11.numberOfProperties = 25;

        RealEstate r12 = new RealEstate();
        r12.realEstateId = 12;
		r12.companyName = "Assetz";
		r12.location = "Chennai"; 
		r12.numberOfProperties = 20;

        RealEstate r13 = new RealEstate();
        r13.realEstateId = 13;
		r13.companyName = "Mahindra Lifespaces";
		r13.location = "Pune"; 
		r13.numberOfProperties = 40;

        RealEstate r14 = new RealEstate();
        r14.realEstateId = 14;
		r14.companyName = "Tata Housing";
		r14.location = "Delhi"; 
		r14.numberOfProperties = 50;

        RealEstate r15 = new RealEstate();
        r15.realEstateId = 15;
		r15.companyName = "Shriram Properties";
		r15.location = "Hyderabad";
		r15.numberOfProperties = 28;

        RealEstate r16 = new RealEstate();
        r16.realEstateId = 16; 
		r16.companyName = "Kolte Patil"; 
		r16.location = "Pune"; 
		r16.numberOfProperties = 33;

        RealEstate r17 = new RealEstate();
        r17.realEstateId = 17;
		r17.companyName = "Runwal"; 
		r17.location = "Mumbai";
		r17.numberOfProperties = 48;

        RealEstate r18 = new RealEstate();
        r18.realEstateId = 18;
		r18.companyName = "Ajmera"; 
		r18.location = "Ahmedabad";
		r18.numberOfProperties = 22;

        RealEstate r19 = new RealEstate();
        r19.realEstateId = 19;
		r19.companyName = "Phoenix"; 
		r19.location = "Chennai"; 
		r19.numberOfProperties = 37;

        RealEstate r20 = new RealEstate();
        r20.realEstateId = 20; 
		r20.companyName = "Prestige";
		r20.location = "Goa"; 
		r20.numberOfProperties = 18;


        Property p1 = new Property();
        p1.propertyId = 101; 
		p1.propertyType = "Apartment"; 
		p1.price = 5000000; 
		p1.area = "Bangalore";
		p1.size = 1200;

        Property p2 = new Property();
        p2.propertyId = 102;
		p2.propertyType = "Villa";
		p2.price = 12000000;
		p2.area = "Mysuru"; 
		p2.size = 2500;

        Property p3 = new Property();
        p3.propertyId = 103;
		p3.propertyType = "Plot"; 
		p3.price = 3000000;
		p3.area = "Chennai";
		p3.size = 1500;

        Property p4 = new Property();
        p4.propertyId = 104; 
		p4.propertyType = "Apartment";
		p4.price = 4500000; 
		p4.area = "Hyderabad";
		p4.size = 1100;

        Property p5 = new Property();
        p5.propertyId = 105;
		p5.propertyType = "Villa"; 
		p5.price = 15000000;
		p5.area = "Mumbai";
		p5.size = 3000;

        Property p6 = new Property();
        p6.propertyId = 106;
		p6.propertyType = "Plot";
		p6.price = 2500000; 
		p6.area = "Delhi"; 
		p6.size = 1400;

        Property p7 = new Property();
        p7.propertyId = 107;
		p7.propertyType = "Apartment";
		p7.price = 4800000; 
		p7.area = "Pune"; 
		p7.size = 1150;

        Property p8 = new Property();
        p8.propertyId = 108;
		p8.propertyType = "Villa";
		p8.price = 10000000; 
		p8.area = "Mumbai";
		p8.size = 2600;

        Property p9 = new Property();
        p9.propertyId = 109;
		p9.propertyType = "Plot"; 
		p9.price = 3200000;
		p9.area = "Bangalore"; 
		p9.size = 1600;

        Property p10 = new Property();
        p10.propertyId = 110;
		p10.propertyType = "Apartment";
		p10.price = 4200000; 
		p10.area = "Kolkata";
		p10.size = 1050;

        Property p11 = new Property();
        p11.propertyId = 111;
		p11.propertyType = "Villa"; 
		p11.price = 11000000; 
		p11.area = "Bangalore"; 
		p11.size = 2400;

        Property p12 = new Property();
        p12.propertyId = 112;
		p12.propertyType = "Plot"; 
		p12.price = 2800000; p12.area = "Chennai"; p12.size = 1500;

        Property p13 = new Property();
        p13.propertyId = 113; 
		p13.propertyType = "Apartment"; 
		p13.price = 4600000; 
		p13.area = "Pune";
		p13.size = 1180;

        Property p14 = new Property();
        p14.propertyId = 114;
		p14.propertyType = "Villa";
		p14.price = 13000000; 
		p14.area = "Delhi";
		p14.size = 2700;

        Property p15 = new Property();
        p15.propertyId = 115;
		p15.propertyType = "Plot";
		p15.price = 2600000; 
		p15.area = "Hyderabad"; 
		p15.size = 1400;

        Property p16 = new Property();
        p16.propertyId = 116; p16.propertyType = "Apartment"; p16.price = 3900000; p16.area = "Pune"; p16.size = 1000;

        Property p17 = new Property();
        p17.propertyId = 117; 
		p17.propertyType = "Villa";
		p17.price = 14000000;
		p17.area = "Mumbai";
		p17.size = 2800;

        Property p18 = new Property();
        p18.propertyId = 118;
		p18.propertyType = "Plot";
		p18.price = 2300000; 
		p18.area = "Ahmedabad";
		p18.size = 1300;

        Property p19 = new Property();
        p19.propertyId = 119;
		p19.propertyType = "Apartment";
		p19.price = 4100000;
		p19.area = "Chennai";
		p19.size = 1080;

        Property p20 = new Property();
        p20.propertyId = 120;
		p20.propertyType = "Villa"; 
		p20.price = 12500000;
		p20.area = "Goa";
		p20.size = 2600;


        r1.property = p1; 
		r1.getRealEstateDetails();
        r2.property = p2;
		r2.getRealEstateDetails();
        r3.property = p3; 
		r3.getRealEstateDetails();
        r4.property = p4;
		r4.getRealEstateDetails();
        r5.property = p5; 
		r5.getRealEstateDetails();
        r6.property = p6;
		r6.getRealEstateDetails();
        r7.property = p7; 
		r7.getRealEstateDetails();
        r8.property = p8; 
		r8.getRealEstateDetails();
        r9.property = p9;
		r9.getRealEstateDetails();
        r10.property = p10; 
		r10.getRealEstateDetails();
        r11.property = p11;
		r11.getRealEstateDetails();
        r12.property = p12; 
		r12.getRealEstateDetails();
        r13.property = p13;
		r13.getRealEstateDetails();
        r14.property = p14; 
		r14.getRealEstateDetails();
        r15.property = p15;
		r15.getRealEstateDetails();
        r16.property = p16;
		r16.getRealEstateDetails();
        r17.property = p17; 
		r17.getRealEstateDetails();
        r18.property = p18; 
		r18.getRealEstateDetails();
        r19.property = p19; 
		r19.getRealEstateDetails();
        r20.property = p20;
		r20.getRealEstateDetails();
    }
}