class Github 
{
    int githubId;
    String user;
    Repository repository;

    public void getGithubDetails() 
	{
        System.out.println("Github Id: " + githubId);
        System.out.println("User: " + user);
        repository.getRepoDetails();
    }

    Github() {}

    Github(int githubId, String user, Repository repository) 
	{
        this.githubId = githubId;
        this.user = user;
        this.repository = repository;
    }

    public boolean createRepository(Repository repository) 
	{
        this.repository = repository;
        return true;
    }
}

