class FreelancerExecutor
{
    public static void main(String[] args)
    {
        Freelancer f1 = new Freelancer();
        f1.freelancerId = 1;
		f1.freelancerName = "Arjun";
		f1.skill = "Java";
		f1.experience = 3;

        Freelancer f2 = new Freelancer();
        f2.freelancerId = 2;
		f2.freelancerName = "Ravi"; 
		f2.skill = "Python";
		f2.experience = 4;

        Freelancer f3 = new Freelancer();
        f3.freelancerId = 3; 
		f3.freelancerName = "Kiran";
		f3.skill = "Web Development"; 
		f3.experience = 2;

        Freelancer f4 = new Freelancer();
        f4.freelancerId = 4;
		f4.freelancerName = "Rahul"; 
		f4.skill = "UI/UX"; 
		f4.experience = 5;

        Freelancer f5 = new Freelancer();
        f5.freelancerId = 5;
		f5.freelancerName = "Sneha";
		f5.skill = "Data Science";
		f5.experience = 3;

        Freelancer f6 = new Freelancer();
        f6.freelancerId = 6;
		f6.freelancerName = "Pooja";
		f6.skill = "Android"; 
		f6.experience = 4;

        Freelancer f7 = new Freelancer();
        f7.freelancerId = 7;
		f7.freelancerName = "Amit";
		f7.skill = "React";
		f7.experience = 2;

        Freelancer f8 = new Freelancer();
        f8.freelancerId = 8;
		f8.freelancerName = "Vijay";
		f8.skill = "Angular";
		f8.experience = 3;

        Freelancer f9 = new Freelancer();
        f9.freelancerId = 9; 
		f9.freelancerName = "Neha"; 
		f9.skill = "Testing";
		f9.experience = 2;

        Freelancer f10 = new Freelancer();
        f10.freelancerId = 10; 
		f10.freelancerName = "Manoj";
		f10.skill = "DevOps";
		f10.experience = 5;

        Freelancer f11 = new Freelancer();
        f11.freelancerId = 11; 
		f11.freelancerName = "Suresh";
		f11.skill = "Java"; 
		f11.experience = 4;

        Freelancer f12 = new Freelancer();
        f12.freelancerId = 12;
		f12.freelancerName = "Ramesh";
		f12.skill = "Python";
		f12.experience = 3;

        Freelancer f13 = new Freelancer();
        f13.freelancerId = 13;
		f13.freelancerName = "Anita"; 
		f13.skill = "UI/UX"; 
		f13.experience = 2;

        Freelancer f14 = new Freelancer();
        f14.freelancerId = 14;
		f14.freelancerName = "Kavya";
		f14.skill = "Web Development"; 
		f14.experience = 3;

        Freelancer f15 = new Freelancer();
        f15.freelancerId = 15;
		f15.freelancerName = "Varun";
		f15.skill = "Data Science"; 
		f15.experience = 4;

        Freelancer f16 = new Freelancer();
        f16.freelancerId = 16; 
		f16.freelancerName = "Rohit";
		f16.skill = "Android";
		f16.experience = 2;

        Freelancer f17 = new Freelancer();
        f17.freelancerId = 17; 
		f17.freelancerName = "Sanjay"; 
		f17.skill = "React"; 
		f17.experience = 5;

        Freelancer f18 = new Freelancer();
        f18.freelancerId = 18; 
		f18.freelancerName = "Meena";
		f18.skill = "Testing"; 
		f18.experience = 3;

        Freelancer f19 = new Freelancer();
        f19.freelancerId = 19;
		f19.freelancerName = "Deepak";
		f19.skill = "DevOps"; 
		f19.experience = 4;

        Freelancer f20 = new Freelancer();
        f20.freelancerId = 20;
		f20.freelancerName = "Priya"; 
		f20.skill = "Java";
		f20.experience = 2;


        Client c1 = new Client();
        c1.clientId = 101;
		c1.clientName = "ABC"; 
		c1.company = "Infosys";
		c1.projectBudget = 50000; 
		c1.projectType = "Web App";

        Client c2 = new Client();
        c2.clientId = 102;
		c2.clientName = "XYZ";
		c2.company = "TCS";
		c2.projectBudget = 60000;
		c2.projectType = "Mobile App";

        Client c3 = new Client();
        c3.clientId = 103;
		c3.clientName = "PQR";
		c3.company = "Wipro"; 
		c3.projectBudget = 40000; 
		c3.projectType = "Website";

        Client c4 = new Client();
        c4.clientId = 104;
		c4.clientName = "LMN";
		c4.company = "Capgemini"; 
		c4.projectBudget = 70000;
		c4.projectType = "UI Design";

        Client c5 = new Client();
        c5.clientId = 105;
		c5.clientName = "DEF"; 
		c5.company = "HCL"; 
		c5.projectBudget = 55000; 
		c5.projectType = "Data Analysis";

        Client c6 = new Client();
        c6.clientId = 106;
		c6.clientName = "GHI";
		c6.company = "Accenture"; 
		c6.projectBudget = 65000;
		c6.projectType = "Android App";

        Client c7 = new Client();
        c7.clientId = 107;
		c7.clientName = "JKL"; 
		c7.company = "IBM";
		c7.projectBudget = 30000; 
		c7.projectType = "Frontend";

        Client c8 = new Client();
        c8.clientId = 108; 
		c8.clientName = "MNO"; 
		c8.company = "Oracle";
		c8.projectBudget = 45000; 
		c8.projectType = "Backend";

        Client c9 = new Client();
        c9.clientId = 109; 
		c9.clientName = "QRS"; 
		c9.company = "Dell";
		c9.projectBudget = 35000;
		c9.projectType = "Testing";

        Client c10 = new Client();
        c10.clientId = 110;
		c10.clientName = "TUV";
		c10.company = "HP"; 
		c10.projectBudget = 80000;
		c10.projectType = "DevOps";

        Client c11 = new Client();
        c11.clientId = 111;
		c11.clientName = "AAA";
		c11.company = "Infosys";
		c11.projectBudget = 50000; 
		c11.projectType = "Web App";

        Client c12 = new Client();
        c12.clientId = 112;
		c12.clientName = "BBB"; 
		c12.company = "TCS";
		c12.projectBudget = 60000;
		c12.projectType = "Mobile App";

        Client c13 = new Client();
        c13.clientId = 113; 
		c13.clientName = "CCC"; 
		c13.company = "Wipro"; 
		c13.projectBudget = 40000; 
		c13.projectType = "Website";

        Client c14 = new Client();
        c14.clientId = 114;
		c14.clientName = "DDD";
		c14.company = "Capgemini"; 
		c14.projectBudget = 70000;
		c14.projectType = "UI Design";

        Client c15 = new Client();
        c15.clientId = 115; 
		c15.clientName = "EEE";
		c15.company = "HCL"; 
		c15.projectBudget = 55000; 
		c15.projectType = "Data Analysis";

        Client c16 = new Client();
        c16.clientId = 116; 
		c16.clientName = "FFF";
		c16.company = "Accenture"; 
		c16.projectBudget = 65000;
		c16.projectType = "Android App";

        Client c17 = new Client();
        c17.clientId = 117; 
		c17.clientName = "GGG"; 
		c17.company = "IBM";
		c17.projectBudget = 30000; 
		c17.projectType = "Frontend";

        Client c18 = new Client();
        c18.clientId = 118;
		c18.clientName = "HHH"; 
		c18.company = "Oracle"; 
		c18.projectBudget = 45000;
		c18.projectType = "Backend";

        Client c19 = new Client();
        c19.clientId = 119; 
		c19.clientName = "III";
		c19.company = "Dell"; 
		c19.projectBudget = 35000;
		c19.projectType = "Testing";

        Client c20 = new Client();
        c20.clientId = 120;
		c20.clientName = "JJJ";
		c20.company = "HP"; 
		c20.projectBudget = 80000;
		c20.projectType = "DevOps";


        f1.client = c1;
		f1.getFreelancerDetails();
        f2.client = c2;
		f2.getFreelancerDetails();
        f3.client = c3;
		f3.getFreelancerDetails();
        f4.client = c4;
		f4.getFreelancerDetails();
        f5.client = c5; 
		f5.getFreelancerDetails();
        f6.client = c6;
		f6.getFreelancerDetails();
        f7.client = c7;
		f7.getFreelancerDetails();
        f8.client = c8; 
		f8.getFreelancerDetails();
        f9.client = c9; 
		f9.getFreelancerDetails();
        f10.client = c10;
		f10.getFreelancerDetails();
        f11.client = c11;
		f11.getFreelancerDetails();
        f12.client = c12; 
		f12.getFreelancerDetails();
        f13.client = c13;
		f13.getFreelancerDetails();
        f14.client = c14; 
		f14.getFreelancerDetails();
        f15.client = c15; 
		f15.getFreelancerDetails();
        f16.client = c16; 
		f16.getFreelancerDetails();
        f17.client = c17;
		f17.getFreelancerDetails();
        f18.client = c18; 
		f18.getFreelancerDetails();
        f19.client = c19; 
		f19.getFreelancerDetails();
        f20.client = c20;
		f20.getFreelancerDetails();
    }
}