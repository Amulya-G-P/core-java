class GithubTwoExecutor 
{
    public static void main(String[] args) 
	{
        Github github = new Github();
        Repository repository = new Repository();

        repository.repoId = 2;
        repository.name = "Java_Project";

        github.createRepository(r);
        github.getGithubDetails();
    }
}

