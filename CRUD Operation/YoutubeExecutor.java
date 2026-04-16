class YoutubeExecutor 
{
    public static void main(String[] args) {

        Youtube yt = new Youtube();
        boolean added;

        added = yt.addVideoTitle("Java Tutorial");
        System.out.println(added);
        added = yt.addVideoTitle("Python Basics");
        System.out.println(added);
        added = yt.addVideoTitle("Data Structures");
        System.out.println(added);
        added = yt.addVideoTitle("Spring Boot Intro");
        System.out.println(added);
        added = yt.addVideoTitle("React JS Crash Course");
        System.out.println(added);
        added = yt.addVideoTitle("SQL for Beginners");
        System.out.println(added);
        added = yt.addVideoTitle("HTML & CSS");
        System.out.println(added);
        added = yt.addVideoTitle("JavaScript Guide");
        System.out.println(added);
        added = yt.addVideoTitle("Machine Learning Intro");
        System.out.println(added);
        added = yt.addVideoTitle("AI Basics");
        System.out.println(added);
        added = yt.addVideoTitle("Operating System Concepts");
        System.out.println(added);
        added = yt.addVideoTitle("Computer Networks");
        System.out.println(added);
        added = yt.addVideoTitle("DBMS Tutorial");
        System.out.println(added);
        added = yt.addVideoTitle("Cyber Security Basics");
        System.out.println(added);
        added = yt.addVideoTitle("Cloud Computing Intro");
        System.out.println(added);

        yt.getVideoTitles();

        String video = yt.getVideoByName("Java Tutorial");
        System.out.println(video + " is available");

        boolean updated = yt.updateVideo("Python Basics", "Advanced Python");
        System.out.println(updated);

        yt.getVideoTitles();

        boolean deleted = yt.deleteVideo("SQL for Beginners");
        System.out.println(deleted + " is deleted");

        yt.getVideoTitles();
    }
}