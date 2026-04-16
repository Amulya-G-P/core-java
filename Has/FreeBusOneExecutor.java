class FreeBusOneExecutor {
    public static void main(String[] args) {
        FreeBusTravel f = new FreeBusTravel();
        Aadhaar a = new Aadhaar();

        a.number = 123456789012L;
        a.name = "Sanjana";

        f.id = 1;
        f.schemeName = "Free Bus Scheme";
        f.aadhaar = a;

        f.getDetails();
    }
}


