class MortuaryThreeExecutor {
    public static void main(String[] args) {
        DeadBody d = new DeadBody();
        d.id = 3;
        d.status = "Postmortem Done";

        Mortuary m = new Mortuary(102, "Gov Hospital", d);
        m.getDetails();
    }
}