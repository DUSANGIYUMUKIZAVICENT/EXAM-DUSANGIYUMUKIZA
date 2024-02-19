package Myalls;

import java.util.Date;

public class Matches {
	private int match_id;
	private Date date;
	private String play_ground;
	private int ref_id;
	private int ad_id;
	private int user_id;

public Matches(int match_id,Date date,String play_ground,int ref_id,int ad_id,int user_id) {
	super();
	this.match_id = match_id;
	this.date = date;
	this.play_ground = play_ground;
	this.ref_id = ref_id;
	this.ad_id = ad_id;
	this.user_id = user_id;
}

public int getMatch_id() {
	return match_id;
}

public void setMatch_id(int match_id) {
	this.match_id = match_id;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public String getPlay_ground() {
	return play_ground;
}

public void setPlay_ground(String play_ground) {
	this.play_ground = play_ground;
}

public int getRef_id() {
	return ref_id;
}

public void setRef_id(int ref_id) {
	this.ref_id = ref_id;
}

public int getAd_id() {
	return ad_id;
}

public void setAd_id(int ad_id) {
	this.ad_id = ad_id;
}

public int getUser_id() {
	return user_id;
}

public void setUser_id(int user_id) {
	this.user_id = user_id;
}


}