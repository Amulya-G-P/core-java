class IPLOneExecutor {
    public static void main(String[] args) {
        Ipl1 i = new Ipl1();
        RCB1 r = new RCB1();

        r.teamId = 18;
        r.captain = "Faf";

        i.id = 2026;
        i.season = "IPL 2026";
        i.rcb = r;

        i.getDetails();
    }
}

