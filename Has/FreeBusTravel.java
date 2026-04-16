class FreeBusTravel {
    int id;
    String schemeName;
    Aadhaar aadhaar;

    public void getDetails() {
        System.out.println("Id: " + id);
        System.out.println("Scheme: " + schemeName);
        aadhaar.getAadhaarDetails();
    }

    FreeBusTravel() {}

    FreeBusTravel(int id, String schemeName, Aadhaar aadhaar) {
        this.id = id;
        this.schemeName = schemeName;
        this.aadhaar = aadhaar;
    }

    public boolean createAadhaar(Aadhaar aadhaar) {
        this.aadhaar = aadhaar;
        return true;
    }
}


