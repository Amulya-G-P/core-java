class IPLThreeExecutor {
    public static void main(String[] args) {
        RCB1 r = new RCB1();
        r.teamId = 18;
        r.captain = "Maxwell";

        Ipl i = new IPL(2025, "IPL Season", r);
        i.getDetails();
    }
}