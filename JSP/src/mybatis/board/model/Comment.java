package mybatis.board.model;

public class Comment {

	private	int		articleId;
	private	int		groupId;
	private	String	sequenceNo;
	private	String	postingDate;
	private	int		readCount;
	private	String	writerName;
	private	String	password;
	private	String	title;
	private	String	content;
	
	
	
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getSequenceNo() {
		return sequenceNo;
	}
	public void setSequenceNo(String sequenceNo) {
		this.sequenceNo = sequenceNo;
	}
	public String getPostingDate() {
		return postingDate;
	}
	public void setPostingDate(String postingDate) {
		this.postingDate = postingDate;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	public String getWriterName() {
		return writerName;
	}
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public int getLevel()
	{
		if( sequenceNo == null			)	{ return -1; }
		if( sequenceNo.length() != 16 	) 	{ return -1; }
		if( sequenceNo.endsWith("999999")) 	{ return 0; }
		if( sequenceNo.endsWith("9999")	) 	{ return 1; }
		if( sequenceNo.endsWith("99")	) 	{ return 2; }
		return 3;
	}
	
}
