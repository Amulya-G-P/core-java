class HouseExecutor 
{
    public static void main(String[] args) {

        House h = new House();
        boolean added;

        added = h.addIndoorGame("Chess");
        System.out.println(added);
        added = h.addIndoorGame("Carrom");
        System.out.println(added);
        added = h.addIndoorGame("Ludo");
        System.out.println(added);
        added = h.addIndoorGame("Table Tennis");
        System.out.println(added);
        added = h.addIndoorGame("Snakes and Ladders");
        System.out.println(added);
        added = h.addIndoorGame("Cards");
        System.out.println(added);

        h.getIndoorGames();

        String game = h.getGameByName("Chess");
        System.out.println(game + " is available");

        boolean updated = h.updateGame("Ludo", "Ludo King");
        System.out.println(updated);

        h.getIndoorGames();

        boolean deleted = h.deleteGame("Carrom");
        System.out.println(deleted + " is deleted");

        h.getIndoorGames();
    }
}