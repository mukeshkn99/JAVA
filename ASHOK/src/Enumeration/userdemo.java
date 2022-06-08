package Enumeration;

public class userdemo {

	public static void main(String[] args) {
	user[] use=	user.values();
	for(user u:use){
		System.out.println(u+"-->"+u.ordinal()+"user:"+u.getName()+"pass:"+u.getPassword());
	}

	user.HARISH.act1();
	user.KALAI.act2();
	user.KAVI.act3();
	}

}
