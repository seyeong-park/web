package guest.service;

import guest.model.Message;
import guest.model.MessageDao;
import guest.model.MessageException;

import java.util.List;

public class ListMessageService {

	//-------------------------------------------------------------------
	private int totalRecCount;		// 전체 레코드 수	
	private int pageTotalCount;		// 전체 페이지 수
	private int countPerPage = 3;	// 한페이지당 레코드 수
	
	
	private static ListMessageService instance;
	
	public static ListMessageService	getInstance() throws MessageException
	{
		if( instance == null )
		{
			instance = new ListMessageService();
		}
		return instance;
	}
	
	private ListMessageService()
	{
		
	}
	
	public List <Message> getMessageList(String pNum) throws MessageException
	{
		int pageNum = 1;
		if(pNum!=null) pageNum=Integer.parseInt(pNum);
		
		/*
		 pageNum	firstRow	endRow
		 	1			1		  3
		 	2			4		  6
		 	3			7		  9
		 */
		
		int endRow = pageNum*countPerPage;
		int firstRow = (pageNum-1)*countPerPage+1;
		
		
		// 전체 레코드를 검색해 온다면
		List <Message> mList = MessageDao.getInstance().selectList(firstRow,endRow);			
		return mList;
	}
	
	public int getTotalCount() throws MessageException{
		//pageTotalCount 구할까
		//레코드3 - 페이지-1
		//레코드4 - 페이지-2
		//레코드5 - 페이지-2
		//레코드6 - 페이지-2
		//레코드7 - 페이지-3
		
		MessageDao dao = MessageDao.getInstance();
		totalRecCount = dao.getTotalCount();
		
		pageTotalCount = totalRecCount / countPerPage;
		if(totalRecCount % countPerPage>0) pageTotalCount++;
		
		return pageTotalCount;
	}
	
	
}
