package member.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao {

	String url = "";
	String user = "";
	String pass = "";
	// DB 연결시 관한 변수

	private static final String dbDriver = "oracle.jdbc.driver.OracleDriver";
	private static final String dbUrl = "jdbc:oracle:thin:@192.168.0.16:1521:orcl";
	private static final String dbUser = "seyeong";
	private static final String dbPass = "1234";

	private static MemberDao memberDao;

	public static MemberDao getInstance() throws MemberException {
		if (memberDao == null) {
			memberDao = new MemberDao();
		}
		return memberDao;
	}

	private MemberDao() throws MemberException {

		try {

			// 1. 드라이버를 로딩
			Class.forName("oracle.jdbc.OracleDriver");

		} catch (Exception ex) {
			throw new MemberException("DB 연결시 오류  : " + ex.toString());
		}
	}

	/*******************************************
	 * * 회원관리테이블 MEMBERTEST 에 회원정보를 입력하는 함수
	 * 
	 * @param rec
	 * @throws MemberException
	 */
	public void insertMember(Member rec) throws MemberException {
		Connection con = null;
		try {
			// 2. 연결객체 얻어오기
			con = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			// 3. sql문장 (insert문)
			String sql = "INSERT INTO temp(ID,PASS,NAME,TEL,ADDR) VALUES (?,?,?,?,?)";
			// 4. 전송객체 얻어오기 (PreparedStatement) + ? 지정
			PreparedStatement st = con.prepareStatement(sql); // 선언된 값 가져오기
			st.setString(1, rec.getId());
			st.setString(2, rec.getPassword());
			st.setString(3, rec.getName());
			st.setString(4, rec.getTel());
			st.setString(5, rec.getAddr());
			// 5. 전송(excuteUpdate() 이용)
			int result = st.executeUpdate();
			// 6. 닫기
			JdbcUtil.close(st);

		} catch (Exception ex) {
			throw new MemberException("멤버 입력시 오류  : " + ex.toString());
		} finally {
			JdbcUtil.close(con);
		}

	}

	/**********************************************************
	 * * 회원관리테이블 MEMBERTEST에서 기존의 id값과 중복되는지 확인하는 함수
	 */
	public boolean isDuplicatedId(String id) throws MemberException {
		boolean flag = false;// 중복x
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			String sql = "SELECT * FROM temp WHERE id=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, id);
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				flag = true;// 중복
			}
			st.close();
			rs.close();
		} catch (Exception ex) {
			throw new MemberException("중복아이디 검사시 오류  : " + ex.toString());
		} finally {
			JdbcUtil.close(con);
		}
		return flag;
	}
	
	
	
}
