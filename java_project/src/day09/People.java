package day09;

public class People {
	private String name; // 이름
	private int age; // 나이
	
	
	// 기본생성자
	public People() {
	

	}
	// 밑에건 외워야함
	// 전체필드를 다 받는 생성자
	public void People(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	// 모든필드 get/set메서드
	public String getname() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	
	}
	public void setage(int age) {
		this.age = age;
	}
	
	
	// 모든필드 출력하는 print메서드
	public void print() {
		System.out.println("이름\t나이");
		System.out.println("=======");
		System.out.printf("%s\t%d\n",name,age);
	}
	
	// void 옆에는 항상 이름이 이따!! 
	// 메서드명:ageUp 매개변수: x, 리턴타입: x 실행문구는 age 1증가
	public void ageUp() {
		age++;
	}
	// 메서드명: ageUp 매개변수: 정수하나, 리턴타입: x
	// 실행문구는 age를 매개변수 만큼 증가
	public void ageUp1 (int age) {
		this.age += age;
	}
	public int koreanAge() {
		return age-2;
	}
}
