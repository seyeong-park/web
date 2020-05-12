
$(function(){

	//폰트사이즈
	$('#p').click(function(){
			$('#txt').css("font-size","+=2");	
	});
	
	$('#m').click(function(){
		$('#txt').css("font-size","-=2");	
	});

	
	//폰트스타일
	$('#fontstyle').change(function(){
		var font=$(this).val();//선택한 value값 가져오기
		$('#txt').css("font-family",font);
	});

});