class InstagramExecutor
{
	public static void main(String[] args)
	{
		System.out.println(" Instagram and Post");
		
		Instagram insta=new Instagram();
		insta.instaId=1;
		insta.instaName="Instagram App";
		insta.instaId=2;
		insta.instaName="Insta Social";
		
		Post post=new Post();
		post.postId=301;
		post.caption="Hello World";
		post.postId=302;
		post.caption="Enjoying Life";
		
		insta.post=post;
		
		insta.getInstagramDetails();
	}
}