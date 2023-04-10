package 주소록관리프로그램;

public class Address {
	
	// 설계도 : 실행 안해
	
	// 필드
		// 물건이름
		private String name;
		// 단가
		private int age;
		// 수량
		private int phoneNumber;
		
		// 메서드
		// 생성자
		// 1) 생성자도 메서드다
		// 2) 생성자 이름이 클래스명과 같다(소/대문자)
		// 3) 생성자는 리턴타입이 없다 (void X)
		// 4) 기본생성자는 생략되어 있다!
		// ---> 새로운 생성자를 만들게 되면 기본생성자는 기능을 잃는다
		// ---> 기본생성자도 사용하고 싶으면 코드로 작성해줘야한다(생략x)
		public Address(String name, int age, int phoneNumber) {
			this.name = name;
			this.age = age;
			this.phoneNumber = phoneNumber;
		}
		// getter : private 감싸진 필드를 열어서 확인할 수 있도록 해주는 메서드
		
		public String getName() {
			return name;
		}

		public int getage() {
			return age;
		}

		public int phoneNumber() {
			return phoneNumber;
		}
		
	}

