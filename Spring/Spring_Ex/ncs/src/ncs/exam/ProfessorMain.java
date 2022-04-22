package ncs.exam;

import java.util.Scanner;

public class ProfessorMain { 
	
	public static void main(String[] args) {
		ProfessorService ps = new ProfessorService();
		System.out.println("메뉴 번호를 선택하세요");
		System.out.println("1.교수 입력 2.연봉 수정 3.은퇴 "
				+ "4.교수정보 조회 5.전체 교수 정보");

		Scanner scan = new Scanner(System.in);

		System.out.print(">>>");
		int menu = scan.nextInt();
		switch (menu) {
		case 1:
			ps.insert();
			break;
		case 2:
			ps.update();
			break;
		case 3:
			ps.delete();
			break;
		case 4:
			ps.selectOne();
			break;
		case 5:
			ps.selectAll();
			break;
		default:
			System.out.println("없는 메뉴입니다.");
			break;
		}

	}

}
