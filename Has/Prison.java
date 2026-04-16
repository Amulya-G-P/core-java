class Prison {
    int prisonId;
    String name;
    Criminal criminal;

    public void getPrisonDetails() {
        System.out.println("Prison Id: " + prisonId);
        System.out.println("Name: " + name);
        criminal.getCriminalDetails();
    }

    Prison() {}

    Prison(int prisonId, String name, Criminal criminal) {
        this.prisonId = prisonId;
        this.name = name;
        this.criminal = criminal;
    }

    public boolean createCriminal(Criminal criminal) {
        this.criminal = criminal;
        return true;
    }
}

