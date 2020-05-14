package guest.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MessageDao {

	// Single Pattern
	private static MessageDao instance;

	// DB 연결시 관한 변수
	private static final String dbDriver = "oracle.jdbc.driver.OracleDriver";
	private static final String dbUrl = "jdbc:oracle:thin:@192.168.0.16:1521:orcl";
	private static final String dbUser = "seyeong";
	private static final String dbPass = "1234";

	// --------------------------------------------
	// ##### 객체 생성하는 메소드
	public static MessageDao getInstance() throws MessageException {
		if (instance == null) {
			instance = new MessageDao();
		}
		return instance;
	}

	private MessageDao() throws MessageException {

		try {

			/********************************************
			 * 1. 오라클 드라이버를 로딩 ( DBCP 연결하면 삭제할 부분 )
			 */

		} catch (Exception ex) {
			throw new MessageException("방명록 ) DB 연결시 오류  : " + ex.toString());
		}

	}

	/*
	 * 메세지를 입력하는 함수
	 */
	public void insert(Message rec) throws MessageException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			// 1. 연결객체(Connection) 얻어오기
			con = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			// 2. sql 문장 만들기
			String sql = "INSERT INTO GuestTB(message_Id, guest_name, password, message) VALUES (seq_messageId_guestTb.nextval,?,?,?)";
			// 3. 전송객체 얻어오기
			ps = con.prepareStatement(sql);
			ps.setString(1, rec.getGuestName());
			ps.setString(2, rec.getPassword());
			ps.setString(3, rec.getMessage());
			// 4. 전송하기
			ps.executeUpdate();

		} catch (Exception ex) {
			throw new MessageException("방명록 ) DB에 입력시 오류  : " + ex.toString());
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException ex) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ex) {
				}
			}
		}

	}

	/*
	 * 메세지 목록 전체를 얻어올 때
	 */
	public List<Message> selectList() throws MessageException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Message> mList = new ArrayList<Message>();
		boolean isEmpty = true;

		try {
			// 1. 연결객체(Connection) 얻어오기
			con = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			// 2. sql 문장 만들기
			String sql = "SELECT * FROM GuestTB";
			// 3. 전송객체 얻어오기
			ps = con.prepareStatement(sql);

			// 4. 전송하기(executeQuery)
			rs = ps.executeQuery();

			// 5. 결과집합 받기
			// - while안에서 isEmpty=false
			while (rs.next()) {
				Message m = new Message();
				m.setMessagId(rs.getInt("MESSAGE_ID"));
				m.setGuestName(rs.getString("GUEST_NAME"));
				m.setMessage(rs.getString("MESSAGE"));
				mList.add(m);
				isEmpty = false;
			}

			if (isEmpty)
				return Collections.emptyList();

			return mList;
		} catch (Exception ex) {
			throw new MessageException("방명록 ) DB에 목록 검색시 오류  : " + ex.toString());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException ex) {
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException ex) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ex) {
				}
			}
		}
	}

	/*
	 * ---------- 현재 페이지에 보여울 메세지 목록 얻어올 때
	 */
	public List<Message> selectList(int firstRow, int endRow) throws MessageException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Message> mList = new ArrayList<Message>();
		boolean isEmpty = true;

		try {
			// 1. 연결객체(Connection) 얻어오기
			con = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			// 2. sql 문장 만들기
			String sql = "SELECT * FROM GuestTB";
			// 3. 전송객체 얻어오기
			ps = con.prepareStatement(sql);

			// 4. 전송하기(executeQuery)
			rs = ps.executeQuery();

			// 5. 결과집합 받기
			// - while안에서 isEmpty=false
			while (rs.next()) {
				Message m = new Message();
				m.setMessagId(rs.getInt("MESSAGE_ID"));
				m.setGuestName(rs.getString("GUEST_NAME"));
				m.setMessage(rs.getString("MESSAGE"));
				mList.add(m);
				isEmpty = false;
			}

			if (isEmpty)
				return Collections.emptyList();

			return mList;
		} catch (Exception ex) {
			throw new MessageException("방명록 ) DB에 목록 검색시 오류  : " + ex.toString());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException ex) {
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException ex) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ex) {
				}
			}
		}
	}

	/*
	 * -------------------------메세지 전체 레코드 (메세지)수를 검색
	 */

	public int getTotalCount() throws MessageException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int count = 0;

		try {
			// 1. 연결객체(Connection) 얻어오기
			con = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			// 2. sql 문장 만들기
			String sql = "select *  " + "  from guesttb  " + "  where message_id in  " + "  (select message_id  "
					+ "  from (select rownum as rnum, message_id  "
					+ "  from (select message_id from guesttb order by message_id desc))  "
					+ "  where rnum>=1 and rnum<=3)  " + "  order by message_id desc  ";
			// 3. 전송객체 얻어오기
			ps = con.prepareStatement(sql);
			// 4. 전송
			rs = ps.executeQuery();
			// 결과물 count 변수에 저장
			if (rs.next()) {
				count = rs.getInt("cnt");
			}

			return count;

		} catch (Exception ex) {
			throw new MessageException("방명록 ) DB에 목록 검색시 오류  : " + ex.toString());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException ex) {
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException ex) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ex) {
				}
			}
		}
	}

	/*
	 * 메세지 번호와 비밀번호에 의해 메세지 삭제
	 */
	public int delete(int messageId, String password) throws MessageException {
		int result = 0;// 0 -> 공백
		Connection con = null;
		PreparedStatement ps = null;
		try {
			// 1. 연결객체(Connection) 얻어오기
			con = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			// 2. sql 문장 만들기
			String sql = "DELETE FROM GuestTB WHERE MESSAGE_ID=? AND PASSWORD=?";
			// 3. 전송객체 얻어오기
			ps = con.prepareStatement(sql);
			ps.setInt(1, messageId);
			ps.setString(2, password);
			// 4. 전송하기(executeUpdate)
			result = ps.executeUpdate();

			return result;
		} catch (Exception ex) {
			throw new MessageException("방명록 ) DB에 삭제시 오류  : " + ex.toString());
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException ex) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ex) {
				}
			}
		}
	}

}