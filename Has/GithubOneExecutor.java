class GithubOneExecutor 
{
    public static void main(String[] args) 
	{
        Github github = new Github();
        Repository repository = new Repository();

        repository.repoId = 1;
        repository.name = "AI_Project";

        github.githubId = 101;
        github.user = "Sanjana";
        github.repository = repository;

        github.getGithubDetails();
    }
}

