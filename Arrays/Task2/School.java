class School{

    static String SubjectNames[] = {"Mathematics", "Science", "English"};

    public static void getSubjectNames(){
        System.out.println("getSubjectNames invoked");
        for(String SubjectName : SubjectNames){
            System.out.println(SubjectName);
        }
        System.out.println("ended of SubjectNames");
    }

    
     
    
}