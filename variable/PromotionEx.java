package variable;

public class PromotionEx {
    public static void main(String[] args){ 

        //���� ũ�⸦ ������ Ÿ���� ū ũ�⸦ ������ Ÿ�̺� ����� �� �߻�
        //������ ����� �� �ִ� byte ž�� char Ÿ������ �ڵ� ��ȯ��ų �� ����

        byte byteValue = 10;
        int intValue = byteValue;          //int <- byte

        System.out.println(intValue);

        char charValue = '��';
        intValue = charValue;              //int <- char

        System.out.println("���� �����ڵ�=" + intValue);

        intValue = 500;
        long longValue = intValue;         //long <- int
        System.out.println(intValue);

        intValue = 200;
        double doubleValue = intValue;     //double <- int
        System.out.println(doubleValue);

        
        //10, ���� �����ڵ�=44032, 500, 200.0

    }
}
