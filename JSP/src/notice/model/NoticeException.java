package notice.model;

public class NoticeException extends Exception
{
  public NoticeException(){
  		super();
  	}
  	
  public NoticeException(String error){
  		super( error );
  	}
 		
}