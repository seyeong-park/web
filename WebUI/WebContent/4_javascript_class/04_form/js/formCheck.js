window.onload = function(){

//		var frm = document.getElementById('frm');
		var frm = document.querySelector('#frm'); //id불러올 때 (class .) 
		var inputs = document.querySelectorAll("input");
		
		
		frm.onsubmit=function(e){
			//alert('ok');
			
			//기존기능 막기
			e.preventDefault();
			
			//추가된 사항을 검사
			//alert(frm.agree.checked);//체킹검사 ->true / false
			if(!frm.agree.checked){//체킹하지 않았을 때
				alert('반드시 약관에 동의하세요')
				return;
			} 
				
			//전송
			frm.submit();
		}
	}