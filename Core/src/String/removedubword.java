package String;

public class removedubword {

	public static void main(String[] args) {
		String word="english tamil";
		StringBuilder sb=new StringBuilder();
		String[] split = word.split(" ");
for(int i=0;i<split.length;i++){
	boolean dublicate=false;
	for(int j=i+1;j<split.length;j++){
		if(split[i].equals(split[j])){
			dublicate=true;
			break;
		}
	}
	if(!dublicate){
		sb.append(split[i]);
	}
}
System.out.println(sb);
	}

}
