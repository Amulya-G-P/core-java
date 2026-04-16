class PrisonOneExecutor {
    public static void main(String[] args) {
        Prison p = new Prison();
        Criminal c = new Criminal();

        c.id = 1;
        c.crime = "Theft";

        p.prisonId = 101;
        p.name = "Central Jail";
        p.criminal = c;

        p.getPrisonDetails();
    }
}

