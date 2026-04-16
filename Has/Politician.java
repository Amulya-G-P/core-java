class Politician {
    int id;
    String name;
    Voter voter;

    public void getDetails() {
        System.out.println("Politician Id: " + id);
        System.out.println("Name: " + name);
        voter.getVoterDetails();
    }

    Politician() {}

    Politician(int id, String name, Voter voter) {
        this.id = id;
        this.name = name;
        this.voter = voter;
    }

    public boolean createVoter(Voter voter) {
        this.voter = voter;
        return true;
    }
}

