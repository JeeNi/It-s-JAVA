package variable;

public class GarbageEx {
    public static void main(String[] args) {
        
        //������ �� �ִ� ���� ������ �ʰ��ϸ� ���͸� ���� ����
        //�̷��� ���� �����Ⱚ�̶� ��

        byte var1 = 125;
        int var2 = 125;

        for(int i = 0; i < 5; i++) {
            var1++;
            var2++;
            System.out.println("var1: " + var1 + "\t" + "var2: " + var2);

            //"\t"�� tab��ŭ ĭ�� ����ִ� ����

            /*
            var1: 126	var2: 126
            var1: 127	var2: 127
            var1: -128	var2: 128     //byte ������ 127�� �Ѿ�� ���� �ּҰ��� -128���� �ٽ� ����
            var1: -127	var2: 129     //int ������ ���������� 1 ����
            var1: -126	var2: 130
            */
            
        }
        
    }
}