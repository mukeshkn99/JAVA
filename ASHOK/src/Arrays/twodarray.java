package Arrays;

public class twodarray {

	public static void main(String[] args) {
		int[][] worldpopulation={
				//0    1   2   3
				{1234,8763,873,8329},//0
				{878,983,3808,9234},//1
				{878,8494,849}//2
		};
System.out.println("world population is:"+worldpopulation.length);
System.out.println("world population [0][1] is:"+worldpopulation[0][1]);







System.out.println("---rearrange----");
worldpopulation[2][2]=8789;
System.out.println("world population [2][2] is:"+worldpopulation[2][2]);
for(int i=0;i<worldpopulation.length;i++){
	for(int j=0;j<worldpopulation[i].length;j++){
	System.out.print(worldpopulation[i][j]+" ");
}
	System.out.println();
}


	}

}
