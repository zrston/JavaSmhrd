package �����������α׷�;

public class Student {
		//�ʵ�
		private String stuName;
		private String stuNum;
		private int javaScore;
		private int dbScore;
		private int webScore;
		
		//������
		// ��ü�� �����Ҷ� 1���� ȣ��Ǵ� �޼ҵ�
		// ��ȯŸ���� �ۼ����� �ʴ´� -> void�� x
		// Ŭ���� �̸��� ������ �̸��� �Ȱ���
		// �����ڴ� �ϳ� �̻� ����Ǿ���Ѵ�
		// (���� ��� �����Ͻÿ� �ڵ����� default������ �߰�)
		public Student(String stuName,
				String stuNum, int javaScore,
				int dbScore, int webScore) {
			this.stuName = stuName;
			this.stuNum = stuNum;
			
			this.javaScore = validScore(javaScore);
			this.dbScore = validScore(dbScore);
			this.webScore = validScore(webScore);
		}
		
		private int validScore(int score ) {
			if(score >= 0 || score <= 100) {
				return score;
			}else {
				return 0;
			}
		}
		// getter �޼ҵ�
		public String getStuName() {
			return stuName;
		}
		
		public String getStuNum() {
			return stuNum;
			}
		
		}
