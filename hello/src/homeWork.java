public class homeWork {
    public static void main(String[] args) {
        StringBuffer prise = new StringBuffer("1243.26");

        String name = "�ֻ�";

        System.out.println("prise = " + prise);

        int sum = prise.length() - 3;
        System.out.println("prise = "+prise);
        System.out.println("prise���������� = "+sum);

        if(sum%3 == 0){
            int count = sum / 3 - 1;//���ַ������������ֿ��Գ���ʱ �����м���
            int j = 0;
            for(int i = 1 ;i <= count;i++){
                System.out.println("count ���� "+count);
                prise.replace(i*3+j,i*3+j,",");
                j++;
            }
        }else{
            int count = sum % 3;
            int j = 0;
            int k = 0;
            for(int i = 1 ;i <= sum/3;i++) {
                System.out.println("count ���� " + count);
                prise.replace(count+j+k, count+j+k, ",");
                j+=3;
                k++;
            }
        }
        System.out.println(prise);
    }
}
