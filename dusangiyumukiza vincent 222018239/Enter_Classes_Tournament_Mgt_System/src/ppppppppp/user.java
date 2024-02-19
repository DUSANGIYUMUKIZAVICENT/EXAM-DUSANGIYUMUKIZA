package ppppppppp;

public class user {
	private int user_id;
	private String username;
	private String password;
	private String telephone;
	
	public user(int user_id,String username,String password,String telephone) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.telephone = telephone;
		}
	
		public int getUser_id() {
			return user_id;
		}

		public void setUser_id(int user_id) {
			this.user_id = user_id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getTelephone() {
			return telephone;
		}

		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
}
