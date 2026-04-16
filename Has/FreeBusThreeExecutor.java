class FreeBusThreeExecutor {
    public static void main(String[] args) {
        Aadhaar a = new Aadhaar();
        a.number = 111122223333L;
        a.name = "Anu";

        FreeBusTravel f = new FreeBusTravel(2, "Gov Scheme", a);
        f.getDetails();
    }
}