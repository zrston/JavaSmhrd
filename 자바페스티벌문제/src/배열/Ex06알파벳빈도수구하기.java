package �迭;

import java.util.Scanner;

public class Ex06���ĺ��󵵼����ϱ� {

	public static void main(String[] args) {
		// �Է��ϴ� ���� ��������
		Scanner sc = new Scanner(System.in);
		// a~z : 26��
		// ���ĺ� �󵵼��� ����� int[26] �迭�� �ϳ� ���������

		int[] alphabet = new int[26];

		// nextLine() : Enter�� ĥ������ ���ڿ��� ����
		// next() : space�� ĥ������ ���ڿ��� ����

		System.out.println("====���ĺ��󵵼����ϱ�====");
		System.out.print("�Է� >> ");
		String s = sc.nextLine();
		// Hello world
		// ����, �빮�� ---> �ҹ���
		s = s.replace(" ", "").toLowerCase();
		// ��¹� : �Է� (s)
		// helloworld
		System.out.println(s);
		// charAt�� ����ؼ� �󵵼� ���ϱ�
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			alphabet[c - 97]++; // c (99) : 2
		}
		// ����ϱ� ~ �󵵼��� ����Ǿ��ִ� �迭 ���
		for (int i = 0; i < alphabet.length; i++) {
			System.out.println((char) (i + 97) + ":" + alphabet[i]);
		}
		// ���ڿ�(s) ---> ����(char):�ɰ�
		// charAt(index)---> �ƽ�Ű�ڵ�(int)
		// a: 97 ~ z: 122
		// a : 0�ε����� ���� +1
		// b : 1�ε����� ���� +1
		// s.length() �ݺ� Ƚ��!

		// hint.abc
		// char c = s.charAt(0)
		// c --> a (97)
		// �Ǵ�
		// [0]++;
		// s.charAt(1)
		// char c = s.charAt(1)
		// c ---> b (98)
		// [1]++;
		// s.charAt(2)
		// s.charAt(3)
		// ...
		// s.charAt(s.length()-1)

		// ����ϱ� ~ �󵵼��� ����Ǿ��ִ� �迭 ���
	}

}
