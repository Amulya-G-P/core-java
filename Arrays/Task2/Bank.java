class Bank{

    static String AccountTypes[] = {"Savings Account", "Current Account", "Fixed Deposit"};

    public static void getAccountTypes(){
        System.out.println("getAccountTypes invoked");
        for(String AccountType : AccountTypes){
            System.out.println(AccountType);
        }
        System.out.println("ended of AccountTypes");
    }

   
      
}