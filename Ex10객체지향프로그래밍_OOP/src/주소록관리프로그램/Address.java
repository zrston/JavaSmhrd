package 주소록관리프로그램;

public class Address {
	
	// 설계도 : 실행 안해
	
	// 필드
		// 
		private String name;
		// 단가
		private int age;
		// 수량
		private String phoneNumber;
		
		// 메서드
		// 생성자
		// 1) 생성자도 메서드다
		// 2) 생성자 이름이 클래스명과 같다(소/대문자)
		// 3) 생성자는 리턴타입이 없다 (void X)
		// 4) 기본생성자는 생략되어 있다!
		// ---> 새로운 생성자를 만들게 되면 기본생성자는 기능을 잃는다
		// ---> 기본생성자도 사용하고 싶으면 코드로 작성해줘야한다(생략x)
		public Address(String name, int age, String phoneNumber) {
			this.name = name;
			this.age = age;
			this.phoneNumber = phoneNumber;
		}
		// gettet/setter
		// getter : private 감싸진 필드를 열어서 확인할 수 있도록 해주는 메서드
		// setter : 필드를 수정할떄 사용하는 메서드
		
		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}
		// private : 클래스 외부에서 함부로 접글할 수 없도록 만들어주는 제한자
		//			클래스 내부에 있는 메서드를 통해서만 접근이 가능하도록 하는 제한자
		
	}

