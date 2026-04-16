class GithubThreeExecutor 
{
    public static void main(String[] args) 
	{
        Repository repository = new Repository();
        repository.repoId = 3;
        repository.name = "WebApp";

        Github github = new Github(102, "Ravi", repository);
        github.getGithubDetails();
    }
}