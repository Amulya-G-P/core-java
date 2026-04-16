class IPLTwoExecutor {
    public static void main(String[] args) {
        Ipl i = new Ipl();
        RCB1 r = new RCB1();

        r.teamId = 18;
        r.captain = "Virat";

        i.createRCB(r);
        i.getDetails();
    }
}

