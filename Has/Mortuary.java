class Mortuary {
    int id;
    String location;
    DeadBody deadBody;

    public void getDetails() {
        System.out.println("Mortuary Id: " + id);
        System.out.println("Location: " + location);
        deadBody.getDeadBodyDetails();
    }

    Mortuary() {}

    Mortuary(int id, String location, DeadBody deadBody) {
        this.id = id;
        this.location = location;
        this.deadBody = deadBody;
    }

    public boolean createDeadBody(DeadBody deadBody) {
        this.deadBody = deadBody;
        return true;
    }
}

