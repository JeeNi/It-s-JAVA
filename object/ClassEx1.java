package object;

class Class1 {
	static double PI = 3.14;
    int left, right;
	
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
	
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

public class ClassEx1 {
	 
    public static void main(String[] args) {
 
    	Class1 c1 = new Class1();
        System.out.println(c1.PI);					// �ν��Ͻ��� ���ؼ� PI�� ����
 
        Class1 c2 = new Class1();
        System.out.println(c2.PI);					
 
        System.out.println(Class1.PI);				// Ŭ������ ���ؼ� PI�� ����
 
    }
 
}