/**
 * 
 */
$(function(){
	//각 클래스에 이벤트 ->each
	$('.accordion').each(function(){
		var allDt=$(this).find('dt');
		var allDd=$(this).find('dd');
		
		allDd.hide();
		allDt.css('cursor','pointer');
		
		allDt.click(function(){
			//클릭하면 펼치기
			//dd 모두 숨기기
//			allDd.hide();
			//이벤트 발생요소(dt->this)의 다음요소 실행
//			$(this).next().show();
			$(this).next().toggle();
		});
	});
	
});