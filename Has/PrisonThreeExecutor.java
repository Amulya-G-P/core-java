class PrisonThreeExecutor {
    public static void main(String[] args) {
        Criminal c = new Criminal();
        c.id = 3;
        c.crime = "Robbery";

        Prison p = new Prison(102, "City Jail", c);
        p.getPrisonDetails();
    }
}