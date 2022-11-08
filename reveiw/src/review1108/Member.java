package review1108;

public class Member {
	String id;
	Member(String id){
		this.id=id;
	}
	
	@Override
	
	public boolean equals(Object obj) {
		Member member =(Member)obj;
		if(obj instanceof Member) {
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
