package variable;

public class CastingEx {
    public static void main(String[] args){
        
        //ĳ���� ������ ()�� ��� -> ��ȣ �ȿ� ���� Ÿ���� �ɰ��� ����
        //int Ÿ���� char Ÿ������ �ڵ� ��ȯ���� ����
        
        //�Ǽ� Ÿ��(float, double)�� ���� Ÿ��(byte, short, int, long)���� �ڵ� ��ȯ �� ��
        //�Ҽ��� ���� �κ��� ��������, ���� �κи� ����
        
        int intValue = 44032;
        char charValue = (char) intValue;
        
        System.out.println(charValue);

        long longValue = 500;
        intValue = (int) longValue;

        System.out.println(intValue);

        double doubleValue = 3.14;
        intValue = (int) doubleValue;    //intValue�� ���� �κ��� 3�� ����ȴ�

        System.out.println(intValue);


        //��, 500, 3

    }
}