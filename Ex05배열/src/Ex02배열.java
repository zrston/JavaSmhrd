import java.util.Arrays;

public class Ex02�迭 {

	public static void main(String[] args) {
		 int[] array;
	      
	      //ũ�Ⱑ 10�� �迭�� ���� �ϰ� �������� ������ ����
	      array = new int[10];
	      
	      //0~9�� �ε����� �� �ʱ�ȭ
	      array[0] = 10;
	      array[1] = 20;
	      array[2] = 30;
	      array[3] = 40;
	      array[4] = 50;
	      array[5] = 60;
	      array[6] = 70;
	      array[7] = 80;
	      array[8] = 90;
	      array[9] = 100;

	      
	      for(int i=0;i<array.length;i++) {
	         System.out.println(array[i]);
	      }
	      
	      //���� -> ��ü(�ν��Ͻ�)
	      //toString(��ü�� ������ �ִ� ���� ���)
	      // : ��ü�� ������ �ִ� ���� ���ڿ��� �ٲ��ִ� ���
	      System.out.println(Arrays.toString(array));
	      
	      //5. 1�� �ε����� ����� ���� 4�� �ε����� ����� ���� ���� ���
	      System.out.println(array[1]+array[4]);
	      
	      //6. �� �ε����� ����� ��� ���� ���Ͽ� ���
	      //System.out.println();
	      //������
	      int sum = 0; //�������� �����ϰ� ���� ����
	      for(int i =0; i<array.length; i++) {
	    	  //sum = sum + array[i];
	    	  sum += array[i];
	      }
	      System.out.println(sum);
	      
	      //7. �迭�ȿ� �ִ� ���� ��� ���Ͽ� ���
	      System.out.println(sum/array.length);
	}

}
