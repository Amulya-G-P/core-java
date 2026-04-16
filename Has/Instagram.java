class Instagram
{
	int instaId;
	String instaName;
	Post post;
	
	public void getInstagramDetails()
	{
		System.out.println("Method Invoked");
		System.out.println("The Insta Id is " + instaId);
		System.out.println("The Insta Name is " + instaName);
		
		post.getPostDetails();
		System.out.println("Method Stopped");
	}
}