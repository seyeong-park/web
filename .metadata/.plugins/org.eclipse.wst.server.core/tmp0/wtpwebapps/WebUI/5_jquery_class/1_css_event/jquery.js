/**
 * 
 */

$(function(){
	$('#celebs tbody tr:odd').css({'background':'lightpink',
		'color':'blue'});
	
	$('#celebs tbody tr:odd').addClass('table_stripng');
	
	$('#celebs tbody tr').hover(function(){
		$(this).addClass('td_mouseover')},function(){
			$(this).removeClass('td_mouseover');
		});

	//감추기
	$('#hideButton').click(function(){
		$('#intro img').slideUp(1000);
		//slideUp(),fadeOut()
	});
	//보이기
	$('#showButton').click(function(){
		$('#intro img').slideDown(1000);
	});
	//감추기/보이기
	$('#toggleButton').click(function(){
		$('#intro img').toggle(1000);
	});
	
});
