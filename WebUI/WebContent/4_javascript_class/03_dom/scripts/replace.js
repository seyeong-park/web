
// window.onload = function(){	
document.addEventListener('DOMContentLoaded', function() {
		
  var list = document.getElementById('list');
  var pic = document.getElementById('pic');
  var del = document.getElementById('del');
  

  // 리스트에서 선택(클릭했을 때)
  list.onclick=function(e){
	 var isbn=e.target.getAttribute('data-isbn');
	 
	 //<img src='xxx.gif' width='100' /> 
	 var img=document.createElement('img');
	 img.src='images/'+isbn+".jpg";
	 img.height=150;
	 img.width=100;
	 				//모든 태그들 가져오기 elements
	 if(pic.getElementsByTagName('img').length>0){
		 pic.replaceChild(img, pic.lastChild);
	 }else{
		 pic.appendChild(img);//replace -> 첫번째 append 적용
		 del.disabled=false;//비활성화 풀기
	 }
  }

  
  // 삭제 버튼 누르면 pic 아래 자식(img 태그)를 지운다 removeChild
  del.onclick=function(){
	  pic.removeChild(pic.lastChild);
  }
  
  
  
//};
});