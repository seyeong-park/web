window.onload = function(){

//		var frm = document.getElementById('frm');
		var frm = document.querySelector('#checkbox');  
		var inputs = document.querySelectorAll("input");
		
		frm.onsubmit=function(e){
			//alert('ok');
			
			//기존기능 막기
			e.preventDefault();
			
			//추가된 사항을 검사
			//alert(frm.agree.checked);//체킹검사 ->true / false
			if(!frm.checkbox.checked){//체킹하지 않았을 때
				alert('여행약관에 동의해주세요.')
				return;
			}else if(!frm.checkbox2.checked){//체킹하지 않았을 때
				alert('개인정보 보호정책에 동의해주세요.')
				return;
			} 
				
			//전송
			frm.submit();
		}
		
		
	
	}