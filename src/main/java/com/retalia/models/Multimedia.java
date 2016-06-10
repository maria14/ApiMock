package com.retalia.models;




public class Multimedia  {
	public String ID ;
  public String Link ;
  public String Duration;
  public String Format;
  public int Type ;
  public User Owner;

public Multimedia(String iD, String link, String duration,String format,
		int type, User owner) {
	super();
	ID = iD;
	Link = link;
	Duration = duration;
	Format=format;
	Type = type;
	Owner = owner;
}

public String getFormat() {
	return Format;
}

public void setFormat(String format) {
	Format = format;
}

public String getID() {
	return ID;
}

public void setID(String iD) {
	ID = iD;
}

public String getLink() {
	return Link;
}

public void setLink(String link) {
	Link = link;
}



public String getDuration() {
	return Duration;
}

public void setDuration(String duration) {
	Duration = duration;
}

public int getType() {
	return Type;
}

public void setType(int type) {
	Type = type;
}

public User getOwnerID() {
	return Owner;
}

public void setOwnerID(User owner) {
	Owner = owner;
}
  
	


	

}
