package temp;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TempDAO {

	String url = "";
	String user = "";
	String pass = "";
	
	static TempDAO dao;

	// 싱글턴 패턴 , getInstance:싱글턴패턴, 하나의 인스턴스만 가지고 공유해서 쓴다.
	public static TempDAO getInstance() throws ClassNotFoundException {
		if (dao == null) {
			dao = new TempDAO();// 한번만 생성
		}
		return dao;
	}

	private TempDAO() throws ClassNotFoundException {
		// 1. 드라이버 로딩
		Class.forName("oracle.jdbc.OracleDriver");
		url = "jdbc:oracle:thin:@192.168.0.16:1521:orcl";
		user = "seyeong";
		pass = "1234";
	}

	public void insert(TempVO vo) {
		Connection con = null;
		try {
			// 2. 연결객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);
			// 3. sql문장 (insert문)
			String sql = "INSERT INTO temp(ID,PASS,NAME,TEL,ADDR) VALUES (?,?,?,?,?)";
			// 4. 전송객체 얻어오기 (PreparedStatement) + ? 지정
			PreparedStatement st = con.prepareStatement(sql); // 선언된 값 가져오기
			st.setString(1, vo.getId());
			st.setString(2, vo.getPass());
			st.setString(3, vo.getName());
			st.setString(4, vo.getTel());
			st.setString(5, vo.getAddr());
			// 5. 전송(excuteUpdate() 이용)
			int result = st.executeUpdate();

			// 6. 닫기
			st.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/*
	 * 메소드명 : login 매개변수 : TempVO 리턴형 : boolean 역할 : 아이디와 패스워드를 받아서 해당 테이블에 존재하는지 확인
	 * 후 boolean형으로 리턴
	 */

	public boolean login(TempVO vo) throws ClassNotFoundException {
		boolean success = false;
		Connection con = null;
		// 2. 연결객체 얻어오기
		try {
			con = DriverManager.getConnection(url, user, pass);
			// 3. sql문장 (select문)
			String sql = "SELECT * FROM temp WHERE id=? AND pass=?";
			// 4. 전송객체 얻어오기 (PreparedStatement) + ? 지정
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPass());

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				success = true;
				//System.out.println(success);
			}
			// 5. 전송(excuteQuery() 이용)
			// 6. 닫기
			ps.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return success;
	}
	
	

}
