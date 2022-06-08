package string;

public class maxmin {

	public static void main(String[] args) {
		  String str = "grass is greener on the other side";    
		  int[] freq=new int[str.length()];
		  char[] string=str.toCharArray();
		  char minchar=str.charAt(0);
		  char maxchar=str.charAt(0);
		  int i,j;
for(i=0;i<str.length();i++){
	freq[i]=1;
	for(j=i+1;j<str.length();j++){
		if(string[i]==string[j]&&string[i]!=' '&&string[i]!='0'){
			freq[i]++;
			string[j]='0';
		}
	}
	}
	int min=freq[0],max=freq[0];
	for(i=0;i<freq.length;i++){
	
	if(min>freq[i]&&freq[i]!='0'){
				min=freq[i];
				minchar=string[i];
	}
				if(max<freq[i]){
		max=freq[i];
		maxchar=string[i];
	
			}
		}

System.out.println(maxchar);
				System.out.println(minchar);
		  


}
}