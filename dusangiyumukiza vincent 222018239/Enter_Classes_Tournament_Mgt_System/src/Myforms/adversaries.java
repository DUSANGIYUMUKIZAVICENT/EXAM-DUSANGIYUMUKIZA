package Myforms;

public class adversaries {
	private int ad_id;
	private String name;
	
	public adversaries(int ad_id,String name) {
		super();
		this.ad_id = ad_id;
		this.name = name;
	}

	public int getAd_id() {
		return ad_id;
	}

	public void setAd_id(int ad_id) {
		this.ad_id = ad_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
