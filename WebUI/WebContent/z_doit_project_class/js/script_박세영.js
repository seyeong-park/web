$(function(){
	
	//1.날짜구하기
	var today = new Date();
	$('.year').text(today.getFullYear());
	$('.month').text(today.getMonth()+1);
	$('.date').text(today.getDate());
	
	//2.검색창 포커스
	$('#keyword').focus(function(){
		$(this).css("background-position","0 -500px");
	});
	$('#keyword').focusout(function(){
		$(this).css("background-position","0 0");
	});
	
	
	//3.탭메뉴

	var lastDt = $('#tabmenu dt:eq(0)');
	var lastDd = $('#tabmenu dt:eq(0)').next();
	$('#tabmenu dt').click(function(){
		lastDt.find('img').attr('src',$(this).find('img').attr('src').replace('over','out'));
		lastDd.next().show();
		$(this).find('img').attr('src',$(this).find('img').attr('src').replace('out','over'));
		
		lastDt=$(this);
		lastDd=$(this).next();
	});
	
	//4.베스트북 이미지 슬라이더 ( bxSlider 이용 )
		 $('#best_bg>ul').bxSlider({
			 slideWidth:'120px',
			 minSlides:4,
	    	 maxSlides:4,
	    	 slideMargin:60,
			 auto:true,
			 speed : 20,
			 pager: false,
	    	 controls:false
		 });
	 
	 //5.로그인
		 $('.login_wrap img').click(function(){
			$('#login_f').css('top','20px');
		 });
		 
		
		 $('.login_close_btn img').click(function(){
			 $('#login_f').css('top','-1000px');
		 });
});