
public class Main {

	public static void main(String[] args) {
		SerieLimitada obj1 = SerieLimitada.getInstance();
		SerieLimitada obj2 = SerieLimitada.getInstance();
		
		SerieLimitada obj3 = SerieLimitada.getInstance();
		SerieLimitada obj4 = SerieLimitada.getInstance();
		SerieLimitada obj5 = SerieLimitada.getInstance();
		SerieLimitada obj6 = SerieLimitada.getInstance();
		
		System.out.println("obj1.getSerieLimitada() = "+obj1.getSerieLimitada());
		System.out.println("obj2.getSerieLimitada() = "+obj2.getSerieLimitada());
		System.out.println("obj3.getSerieLimitada() = "+obj3.getSerieLimitada());
		System.out.println("obj4.getSerieLimitada() = "+obj4.getSerieLimitada());
		System.out.println("obj5.getSerieLimitada() = "+obj5.getSerieLimitada());
		System.out.println(obj6);
		
	}

}
