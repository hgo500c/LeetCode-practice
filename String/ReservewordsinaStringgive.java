package String;

public class ReservewordsinaStringgive {
	 public String reverseWords(String s) {
		 //Դ�ַ�����
	        char[] initialArr = s.toCharArray();
	        //���ַ�����
	        char[] newArr = new char[initialArr.length+1];//����ѭ�����"���� "������ĩβ�Ŀո񲻻᷵��
	        int newArrPos = 0;
	        //i�����������Դ�ַ�����Ӻ���ǰ����
	        int i = initialArr.length-1;
	        while(i>=0){
	            while(i>=0 && initialArr[i] == ' '){i--;}  //�����ո�
	            //��ʱiλ���Ǳ߽��!=�ո��ȼ�¼��ǰ������֮���while����ȷ�����ʵ�����ĸ��λ��
	            int right = i;
	            while(i>=0 && initialArr[i] != ' '){i--;} 
	            //ָ�����䵥��ȡ��(����iΪ����ĸ��ǰһλ����������+1,)��ȡ����ÿ��ĩβ������һ���ո�
	            for (int j = i+1; j <= right; j++) {
	                newArr[newArrPos++] = initialArr[j];
	                if(j == right){
	                    newArr[newArrPos++] = ' ';//�ո�
	                }
	            }
	        }
	        //����ԭʼ�ַ���û�е��ʣ�ֱ�ӷ��ؿ��ַ����������е��ʣ�����0-ĩβ�ո�����ǰ��Χ���ַ�����(ת��String����)
	        if(newArrPos == 0){
	            return "";
	        }else{
	            return new String(newArr,0,newArrPos-1);
	        }
	    }
}
