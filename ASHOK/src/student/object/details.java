package student.object;

  public class details {
	  String name;
	  public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	int rollno;
	  public details(String name,int rollno){
		  this.name=name;
		  this.rollno=rollno;
	  }
 
	 public String toString(){
		 return(""+name+rollno);
	 }
	 
	 
	 
}
