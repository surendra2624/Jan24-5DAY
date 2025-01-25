
public class StringName {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
String name1="vishal";
String name2="pjs";
System.out.println("before swapping");
System.out.println("name1---->"+name1);
System.out.println("name2--->"+name2);
name1=name1+name2;
name2=name1.substring(0,name1.length()-name2.length());
name1=name1.substring(name2.length() );
System.out.println("afterswapping");
System.out.println("name1---->"+name1);
System.out.println("name2--->"+name2);
	}
	
}
