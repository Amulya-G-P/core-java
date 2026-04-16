class SingerExecutor 
{
    public static void main(String[] args) {

        Singer s = new Singer();
        boolean added;

        added = s.addSong("Tum Hi Ho");
        System.out.println(added);
        added = s.addSong("Sun Raha Hai Na Tu");
        System.out.println(added);
        added = s.addSong("Agar Tum Mil Jao");
        System.out.println(added);
        added = s.addSong("Teri Ore");
        System.out.println(added);
        added = s.addSong("Deewani Mastani");
        System.out.println(added);
        added = s.addSong("Manwa Laage");
        System.out.println(added);
        added = s.addSong("Saans");
        System.out.println(added);
        added = s.addSong("Piyu Bole");
        System.out.println(added);
        added = s.addSong("Barso Re");
        System.out.println(added);
        added = s.addSong("Nagada Sang Dhol");
        System.out.println(added);

        s.getSongs();

        String song = s.getSongByName("Teri Ore");
        System.out.println(song + " is available");

        boolean updated = s.updateSong("Saans", "Saans (Reprise)");
        System.out.println(updated);

        s.getSongs();

        boolean deleted = s.deleteSong("Barso Re");
        System.out.println(deleted + " is deleted");

        s.getSongs();
    }
}