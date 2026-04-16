class IndiantwsExecutor 
{
    public static void main(String[] args) {

        Indiantestteam t = new Indiantestteam();
        boolean added;

        added = t.addPlayer("Rohit Sharma"); 
		System.out.println(added);
        added = t.addPlayer("Shubman Gill"); 
		System.out.println(added);
        added = t.addPlayer("Virat Kohli"); 
		System.out.println(added);
        added = t.addPlayer("KL Rahul"); 
		System.out.println(added);
        added = t.addPlayer("Ajinkya Rahane");
		System.out.println(added);
        added = t.addPlayer("Ravindra Jadeja");
		System.out.println(added);
        added = t.addPlayer("Ravichandran Ashwin"); 
		System.out.println(added);
        added = t.addPlayer("Jasprit Bumrah"); 
		System.out.println(added);
        added = t.addPlayer("Mohammed Shami"); 
		System.out.println(added);
        added = t.addPlayer("Mohammed Siraj"); 
		System.out.println(added);
        added = t.addPlayer("Rishabh Pant"); 
		System.out.println(added);

        t.getPlayers();

        String player = t.getPlayerByName("Virat Kohli");
        System.out.println(player + " is available");

        boolean updated = t.updatePlayer("KL Rahul", "KL Rahul (Captain)");
        System.out.println(updated);

        t.getPlayers();

        boolean deleted = t.deletePlayer("Ajinkya Rahane");
        System.out.println(deleted + " is deleted");

        t.getPlayers();
    }
}