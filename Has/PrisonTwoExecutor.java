class PrisonTwoExecutor {
    public static void main(String[] args) {
        Prison p = new Prison();
        Criminal c = new Criminal();

        c.id = 2;
        c.crime = "Fraud";

        p.createCriminal(c);
        p.getPrisonDetails();
    }
}

