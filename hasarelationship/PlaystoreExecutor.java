class PlaystoreExecutor
{
	public static void main(String[] args)
	{
		Playstore play=new Playstore();
		play.playStoreId=1;
		
		Application application=new Application();
		application.applicationID=1;
		application.version="2.26.11.73";
		application.updatedon="Mar 20,2026";
		application.downloads="10,000,000,000";
		application.requiredos="Android 5.0 and up";
		application.offeredby="WhatsApp LLC";
		application.releasedon="Oct 10, 2010";
		application.ratings=4.4;
		
		play.application = application;
		play.getDetails();
	}
}
