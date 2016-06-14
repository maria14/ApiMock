package com.retalia.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="multimedia")
public class Multimedia  {
	@Id
	@GenericGenerator(name = "ID", strategy = "increment")
	@GeneratedValue(generator = "ID")
	@Column(name="ID", nullable=false, length=11)
	public int ID ;
	
	@Column(name="Link", nullable=false, length=11)
	public String Link ;
	
	@Column(name="Duration", nullable=false, length=11)
	public String Duration;
	
	@Column(name="Format", nullable=true, length=11)
	public String Format;
	
	@Column(name="Type", nullable=true, length=11)
	public int Type ;
	
	@ManyToOne
	@JoinColumn(name = "id_owner", nullable = false)
	public User Owner;

public Multimedia (String link, String duration,String format,
		int type, User owner) {

	Link = link;
	Duration = duration;
	Format=format;
	Type = type;
	Owner = owner;
}
public Multimedia(){
	super();
}

public String getFormat() {
	return Format;
}

public void setFormat(String format) {
	Format = format;
}

public int getID() {
	return ID;
}

public void setID(int iD) {
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
