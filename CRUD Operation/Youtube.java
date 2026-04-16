class Youtube 
{
    String videotitlenames[] = new String[15];
    int index;

    public boolean addVideoTitle(String title) {
        boolean isAdded = false;
        if (title != null && !title.isEmpty()) {
            if (index < videotitlenames.length) {
                videotitlenames[index++] = title;
                isAdded = true;
            } else {
                System.out.println("Storage is full");
            }
        } else {
            System.out.println(title + " is invalid");
        }
        return isAdded;
    }

    public void getVideoTitles() {
        System.out.println("Video Titles:");
        for (String v : videotitlenames) {
            System.out.println(v);
        }
    }

    public String getVideoByName(String videoname) {
        String name = null;
        for(String video:videotitlenames)
		{
			if(video==videoname)
			{
				name=video;
				break;
			}
		}
        if (name == null) {
            System.out.println(videoname + " is not found");
        }
        return name;
    }

    public boolean updateVideo(String oldName, String newName) {
        boolean isUpdated = false;
        for(int index=0;index<videotitlenames.length;index++)
		{
			if(videotitlenames[index]==oldName)
			{
				videotitlenames[index]=newName;
				isUpdated=true;
			}
		}
        if (!isUpdated) {
            System.out.println(oldName + " is not found");
        }
        return isUpdated;
    }

    public boolean deleteVideo(String name) {
        boolean isDeleted = false;
        for(int index=0;index<videotitlenames.length;index++)
		{
			if(videotitlenames[index]==name)
			{
				videotitlenames[index]=null;
				isDeleted=true;
			}
		}
        if (!isDeleted) {
            System.out.println(name + " is not found");
        }
        return isDeleted;
    }
}