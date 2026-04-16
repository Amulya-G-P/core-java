class FreeBusTwoExecutor {
    public static void main(String[] args) {
        FreeBusTravel f = new FreeBusTravel();
        Aadhaar a = new Aadhaar();

        a.number = 987654321012L;
        a.name = "Ravi";

        f.createAadhaar(a);
        f.getDetails();
    }
}


