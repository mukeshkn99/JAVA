package string;

public class stringbufferdemo {

	public static void main(String[] args) {
   StringBuffer sb=new StringBuffer("abc");
   sb.append("hi");
   System.out.println(sb);
   sb.insert(1,"hlo");
   System.out.println(sb);
   sb.replace(0, 2, "mn");
   System.out.println(sb);
   sb.delete(0, 2);
   System.out.println(sb);
   sb.replace(3, 4,"kn");
   System.out.println(sb);
   sb.lastIndexOf("hu", 1);
   System.out.println(sb);
   System.out.println(sb.capacity());


	}

}
