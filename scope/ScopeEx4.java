package scope;

class C{
	int v= 10;
	
	void m() {
		int v = 20;
		System.out.println(v);
		System.out.println(this.v);			 // ó���� 10�� �����
	}								 		 // m() �޼ҵ� �ȿ� int v =20;�� ������ 20�� ���	
}											 // �������� �켱������ �� ���Ƽ� �������� v�� ���� ��µǱ� ����
											 // ��ü���� ���ϼ��� �� �켱������ ���ٴ� ���� �Ϲ����� ��Ģ
public class ScopeEx4 {				         // this�� ������ �� ��ü�� ���� ���� ��ȿ������ �ǹ�

	public static void main(String[] args) {
		C c1 = new C();
		c1.m();
	}

}         //20, 10
