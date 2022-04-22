package ncs.exam;

import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProfessorService {

	ProfessorDao dao = new ProfessorDao();
	
	public void selectAll() {
		
		Connection con = GetConnection.getConnection();
		
		List<ProfessorDto> list = dao.selectAll(con);
		for(ProfessorDto p : list ) {
			System.out.println(p);
		}
		
		GetConnection.closed(con);
	}
	
	public void selectOne() {
		Scanner scan = new Scanner(System.in);
		System.out.print("교수 번호 > ");
		int profno = scan.nextInt();
		
		Connection con = GetConnection.getConnection();
		
		ProfessorDto dto = dao.selectOne(profno, con);
		
		System.out.println(dto);
		
		GetConnection.closed(con);
	}
	
	public void delete() {
		Scanner scan = new Scanner(System.in);
		System.out.print("교수 번호 > ");
		int profno = scan.nextInt();
		
		Connection con = GetConnection.getConnection();
		
		int x = dao.delete(profno, con);
		
		if(x == 0) {System.out.println("해당 번호는 없는 번호입니다.");}
		else {
			System.out.println("교수님 은퇴 ok.");
		}
		GetConnection.closed(con);
	}
	
	
	public void update() {
		Scanner scan = new Scanner(System.in);
		System.out.print("교수 번호 > ");
		int profno = scan.nextInt();
		System.out.println("연봉의 인상률을 입력하세요");
		double sal = scan.nextInt()*0.01 + 1;
		Connection con = GetConnection.getConnection();
		
		int x = dao.update(sal, profno, con);
		
		if(x == 0) {
			System.out.println("해당 번호는 없는 번호입니다.");
		}else {
			System.out.println("연봉이 수정되었습니다.");
		}
		
		GetConnection.closed(con);
		
	}
		
	public void insert() {
		ProfessorDto dto = new ProfessorDto();
		Scanner scan = new Scanner(System.in);
		System.out.print("교수 이름을 입력하세요 > ");
		dto.setName(scan.next());
		System.out.print("userid > ");
		dto.setUserid(scan.next());
		System.out.print("position> ");
		dto.setPosition(scan.next());
		System.out.print("sal>");
		dto.setSal(scan.nextInt());
		System.out.print("hiredate > (yyyy/MM/dd 형식을 지켜주세요.)");
		String hiredate = scan.next();
		dto.setHiredate(formatDate(hiredate));
		System.out.print("comm >");
		dto.setComm(scan.nextInt());
		System.out.print("deptno >");
		dto.setDeptno(scan.nextInt());

		Connection con = GetConnection.getConnection();
		
		dao.insert(con, dto);
		
		GetConnection.closed(con);
		
	}
	private Date formatDate(String date) {
		Date d = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		try {
			d = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return d;
	}
}
