class AdityaBirlaGroupExecutor
{
    public static void main(String[] args)
    {
        AdityaBirlaGroup g1 = new AdityaBirlaGroup();
        g1.groupId = 1;
        g1.founderName = "Aditya Birla";
        g1.headquarters = "Mumbai";
        g1.numberOfCompanies = 40;

        AdityaBirlaGroup g2 = new AdityaBirlaGroup();
        g2.groupId = 2;
        g2.founderName = "Kumar Mangalam Birla";
        g2.headquarters = "Mumbai";
        g2.numberOfCompanies = 45;

        AdityaBirlaGroup g3 = new AdityaBirlaGroup();
        g3.groupId = 3;
        g3.founderName = "Aditya Birla";
        g3.headquarters = "Delhi";
        g3.numberOfCompanies = 35;

        AdityaBirlaGroup g4 = new AdityaBirlaGroup();
        g4.groupId = 4;
        g4.founderName = "Kumar Mangalam Birla";
        g4.headquarters = "Bangalore";
        g4.numberOfCompanies = 50;

        AdityaBirlaGroup g5 = new AdityaBirlaGroup();
        g5.groupId = 5;
        g5.founderName = "Aditya Birla";
        g5.headquarters = "Chennai";
        g5.numberOfCompanies = 30;


        Rcb r1 = new Rcb();
        r1.teamId = 101;
        r1.captainName = "Faf du Plessis";
        r1.numberOfPlayers = 11;
        r1.homeGround = "Chinnaswamy Stadium";

        Rcb r2 = new Rcb();
        r2.teamId = 102;
        r2.captainName = "Virat Kohli";
        r2.numberOfPlayers = 11;
        r2.homeGround = "Chinnaswamy Stadium";

        Rcb r3 = new Rcb();
        r3.teamId = 103;
        r3.captainName = "Rajat Patidar";
        r3.numberOfPlayers = 11;
        r3.homeGround = "Chinnaswamy Stadium";

        Rcb r4 = new Rcb();
        r4.teamId = 104;
        r4.captainName = "Faf du Plessis";
        r4.numberOfPlayers = 11;
        r4.homeGround = "Chinnaswamy Stadium";

        Rcb r5 = new Rcb();
        r5.teamId = 105;
        r5.captainName = "Virat Kohli";
        r5.numberOfPlayers = 11;
        r5.homeGround = "Chinnaswamy Stadium";


        g1.rcb = r1;
        g1.getGroupDetails();

        g2.rcb = r2;
        g2.getGroupDetails();

        g3.rcb = r3;
        g3.getGroupDetails();

        g4.rcb = r4;
        g4.getGroupDetails();

        g5.rcb = r5;
        g5.getGroupDetails();
    }
}