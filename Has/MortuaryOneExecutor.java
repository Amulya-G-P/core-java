class MortuaryOneExecutor {
    public static void main(String[] args) {
        Mortuary m = new Mortuary();
        DeadBody d = new DeadBody();

        d.id = 1;
        d.status = "Identified";

        m.id = 101;
        m.location = "City Hospital";
        m.deadBody = d;

        m.getDetails();
    }
}

