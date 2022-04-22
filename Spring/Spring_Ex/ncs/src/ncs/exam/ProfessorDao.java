package ncs.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


public class ProfessorDao {
	
	public int insert(Connection con, ProfessorDto dto) {
		int x = 0;
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement("insert into professor values(prof_seq.nextval,?,?,?,?,?,?,?)");
			pstmt.setString(1,dto.getName());
			pstmt.setString(2, dto.getUserid());
			pstmt.setString(3, dto.getPosition());
			pstmt.setInt(4,dto.getSal());
			pstmt.setTimestamp(5, new Timestamp(dto.getHiredate().getTime()));
			pstmt.setInt(6,dto.getComm());
			pstmt.setInt(7,dto.getDeptno());
			
			x = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { 
			GetConnection.closed(pstmt);
		}
		return x;
	}
	
	public int update(double sal, int profno, Connection con) {
		int x = 0;
		
		PreparedStatement pstmt = null;
		
			try {
				pstmt = con.prepareStatement(
						"update professor set sal = sal * "+sal+" where profno = ?");
			
				pstmt.setInt(1,profno);
				x = pstmt.executeUpdate();
			
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				GetConnection.closed(pstmt);
			}
		return x ; 
	}
	
	public int delete(int profno, Connection con) {
		int x = 0;
		
		PreparedStatement pstmt = null;
		
			try {
				pstmt = con.prepareStatement(
						"delete from professor where profno = ?");
			
				pstmt.setInt(1,profno);
				x = pstmt.executeUpdate();
			
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				GetConnection.closed(pstmt);
			}
		return x ; 
	}
	
	public ProfessorDto selectOne(int profno, Connection con) {
		ProfessorDto dto = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = con.prepareStatement("select * from professor where profno = ?");
			pstmt.setInt(1,profno);
			
			rs = pstmt.executeQuery(); 
		
			if(rs.next()) {
				dto = new ProfessorDto();
				dto.setProfno(rs.getInt("profno"));
				dto.setName(rs.getString("name"));
				dto.setUserid(rs.getString("userid"));
				dto.setPosition(rs.getString("position"));
				dto.setSal(rs.getInt("sal"));
				dto.setHiredate(rs.getDate("hiredate"));
				dto.setComm(rs.getInt("comm"));
				dto.setDeptno(rs.getInt("deptno"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			GetConnection.closed(rs, pstmt);
		}
		
		return dto;
	}
	
	public List<ProfessorDto> selectAll(Connection con){
		List<ProfessorDto> list = new ArrayList<ProfessorDto>();
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = con.prepareStatement("select * from professor");	
			rs = pstmt.executeQuery(); 
		
			while(rs.next()) {
				ProfessorDto dto = new ProfessorDto();
				
				dto.setProfno(rs.getInt("profno"));
				dto.setName(rs.getString("name"));
				dto.setUserid(rs.getString("userid"));
				dto.setPosition(rs.getString("position"));
				dto.setSal(rs.getInt("sal"));
				dto.setHiredate(rs.getDate("hiredate"));
				dto.setComm(rs.getInt("comm"));
				dto.setDeptno(rs.getInt("deptno"));
				
				list.add(dto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			GetConnection.closed(rs, pstmt);
		}
		
		return list;
		
	}
	
}
