package info.beans;
//beans == VO
public class InfoBean {
	
	//화면 name과 똑같이 선언
	//property(멤버변수)
	private String name;
	private String id;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	
	public String getGender() {
		String gender="";
		char sex=id.charAt(7);
		if(sex=='1'||sex=='3') return "남자";
		else return "여자";
	}
}
