class StateElectionExecutor 
{
    public static void main(String[] args) {

        StateElection s = new StateElection();
        boolean added;

        added = s.addParty("BJP");
		System.out.println(added);
        added = s.addParty("Congress"); 
		System.out.println(added);
        added = s.addParty("JDS"); 
		System.out.println(added);
        added = s.addParty("AAP"); 
		System.out.println(added);
        added = s.addParty("TMC"); 
		System.out.println(added);
        added = s.addParty("DMK"); 
		System.out.println(added);
        added = s.addParty("Shiv Sena"); 
		System.out.println(added);

        s.getParties();

        String party = s.getPartyByName("Congress");
        System.out.println(party + " is available");
		
        boolean updated = s.updateParty("JDS", "JDS Secular");
        System.out.println(updated);

        s.getParties();

        boolean deleted = s.deleteParty("AAP");
        System.out.println(deleted + " is deleted");

        s.getParties();
    }
}