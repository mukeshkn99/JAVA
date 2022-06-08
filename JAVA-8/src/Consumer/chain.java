package Consumer;

import java.util.function.Consumer;

public class chain {

	public static void main(String[] args) {
		Consumer<movie> c1=m->{
			System.out.println("Movie Name:"+m.name+"is ready to relaese");
		};
		Consumer<movie> c2=m->{
			System.out.println("Movie name:"+m.name+"-is-"+m.result);
		};
		Consumer<movie> c3=m->{
			System.out.println("Movie name:"+m.name+"information required");
		};
		Consumer<movie> chained=c1.andThen(c2).andThen(c3);
		movie m=new movie("kgf2","blockbuster");
		chained.accept(m);

		movie m1=new movie("bhahubali","blockbuster");
		chained.accept(m1);

	}

}
