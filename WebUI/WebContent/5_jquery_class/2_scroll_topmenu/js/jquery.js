/**
 * 
 */
$(document).ready(function(){
	$('#navigation>ul> li').hover(function(){
		$(this).animate({paddingLeft:'+=15px'},200);
		
	},function(){
		$(this).animate({paddingLeft:'-=15px'},200);
		
	});
	
	//화면에 고정->따라오는 효과
	$(window).scroll(function(){
		$('#navigation').css({'top':$(document).scrollTop()});
		
	});
	
	
});