package variable;

public class CharEx {
    public static void main(String[] args){

        //������ �� �ִ� ���� 0 ~ 65535

        //char Ÿ���� �������� ���� ���� ������ �� ����
        //bcuz �����ڵ�� ������ ���� ����

        //char Ÿ���� ������ �� �ϳ��� ���ڸ� ����
        //���ڿ��� �����ϰ� �ʹٸ� String Ÿ���� ���

        //char Ÿ���� ������ ���� ����ǥ(') �ΰ��� ���޾� ���� �� ���ڸ� �����ϸ� ������ ���� �߻�
        //�׷��� ������ ����(�����ڵ�:32) �ϳ��� �����ؼ� �ʱ�ȭ ����

        //������ String ������ ū ����ǥ(") �� ���� ���޾� ���� �� ���ڸ� �����ص� ����

        char c1 = 'A';              //���ڸ� ���� ����
        char c2 = 65;               //10������ ����
        char c3 = '\u0041';         //16������ ����

        char c4 = '��';             //���ڸ� ���� ����
        char c5 = 44032;            //10������ ����
        char c6 = '\uac00';         //16������ ����

        int uniCode = c1;           //�����ڵ� ���

        System.out.println(c1);         //A 
        System.out.println(c2);         //A
        System.out.println(c3);         //A
        System.out.println(c4);         //��
        System.out.println(c5);         //��
        System.out.println(c6);         //��
        System.out.println(uniCode);    //65

    }
}
