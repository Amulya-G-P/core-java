class Ipl1 {
    int id;
    String season;
    RCB rcb;

    public void getDetails() {
        System.out.println("IPL Id: " + id);
        System.out.println("Season: " + season);
        rcb.getRCBDetails();
    }

    Ipl1() {}

    Ipl1(int id, String season, RCB rcb) {
        this.id = id;
        this.season = season;
        this.rcb = rcb;
    }

    public boolean createRCB(RCB rcb) {
        this.rcb = rcb;
        return true;
    }
}

