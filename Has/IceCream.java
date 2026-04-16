class IceCream {
    int id;
    String brand;
    Flavour flavour;

    public void getDetails() {
        System.out.println("IceCream Id: " + id);
        System.out.println("Brand: " + brand);
        flavour.getFlavourDetails();
    }

    IceCream() {}

    IceCream(int id, String brand, Flavour flavour) {
        this.id = id;
        this.brand = brand;
        this.flavour = flavour;
    }

    public boolean createFlavour(Flavour flavour) {
        this.flavour = flavour;
        return true;
    }
}

