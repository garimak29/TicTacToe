
public class User {
	static long id=0;
	String name ;
	String email;
	User(String name , String email){
		this.name = name;
		this.email = email;
		this.id++;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + "]";
	}
}
