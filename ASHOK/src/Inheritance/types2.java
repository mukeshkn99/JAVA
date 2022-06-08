package Inheritance;

public class types2 extends types1{
 
	String filename2;
	public String getFilename2() {
		return filename2;
	}
	public void setFilename2(String filename2) {
		this.filename2 = filename2;
	}
	public int getFileno2() {
		return fileno2;
	}
	public void setFileno2(int fileno2) {
		this.fileno2 = fileno2;
	}
	int fileno2;
	public types2(String filename2,int fileno2){
		
		this.filename2=filename2;
		this.fileno2=fileno2;
		
	}
	public void types2(int value){
		fileno2-=value;
	}
}
