package scope;

public class ScopeEx1 {

	static void a() {
		String title = "coding everybody";
	}
	
	// title�� a() �޼ҵ� �ȿ� ������ 
	// main �޼ҵ� ���忡���� �������� �ʴ� �Ͱ� �ٸ� ����
	
	public static void main(String[] args) {
		a();
		// System.out.println(title);
	}

}
