class MortuaryTwoExecutor {
    public static void main(String[] args) {
        Mortuary m = new Mortuary();
        DeadBody d = new DeadBody();

        d.id = 2;
        d.status = "Unidentified";

        m.createDeadBody(d);
        m.getDetails();
    }
}

