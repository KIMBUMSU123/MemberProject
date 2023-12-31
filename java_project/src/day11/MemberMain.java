package day11;

import java.awt.Menu;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Member> list = new ArrayList<Member>();
		Long id = 100l;

		while (true) {
			System.out.println("1.맴버등록 2.맴버리스트 3.맴버 검색 0.종료");
			System.out.println("메뉴선택 : ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("맴버를 등록합니다.");
				System.out.print("E_mail을 입력하세요");
				String email = sc.next();
				System.out.print("pw를 입력하세요");
				String pw = sc.next();
				System.out.print("이름을 입력하세요");
				String name = sc.next();

				Member m = new Member(id++, email, pw, name);
				System.out.println(name + "님 가입완료!!");
				list.add(m);
			} else if (menu == 2) {
				System.out.println("No\tE_mail\tPassword\tName\tJoinDate");
//				System.out.println("==========================================");
//				for (int i= 0; i < list.size(); i++) {
//					list.get(i).print();
//				}
				for(Member m : list) { // 향상된 for문 or foreach  // list의 값을 m에 담음
					m.print();
				}
				
			} else if (menu == 3) {
				System.out.print("검색할 아이디를 입력하세요 : ");
				Long M_id = sc.nextLong();
				boolean find = false;
				for(Member m : list) {
					if (M_id.equals(m.getId())) {
						find = true;
						System.out.println("No\tE_mail\tPassword\tName\tJoinDate");
						m.print();
						break;
					}
				}
				if (!find) 
					System.out.println("없는 아이디입니다.");
				} else if (menu == 0) {
				break;

			} else {
				System.out.println("다시입력");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료"); 
	}

}