package enumeration;

public class enummain {

	public static void main(String[] args) {
		actor[] a=actor.values();
		for(actor act:a){
		System.out.println(act+"->"+act.ordinal()+"->");
		
	}
		actor.AJITH.act();
		actor.Vijay.act2();
		actor.Yash.act3();
	}
}
