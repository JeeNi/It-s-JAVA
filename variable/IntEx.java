package variable;

public class IntEx {
    public static void main(String[] args){

        //������ �� �ִ� ���� ������ -2,147,483,648 ~ 2,147,483,647
        
        //�Ϲ������� ������ ������ ���� int Ÿ���� ���!

        int var1 = 10;             //10������ ����
        int var2 = 012;            //8������ ����
        int var3 = 0xA;            //16������ ����


        System.out.println(var1);  //10
        System.out.println(var2);  //10 
        System.out.println(var3);  //10   //����� 10������ ��

    }
}
