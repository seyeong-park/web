$(function(){
//	var bio= find('#bio');
//	var irum=tab.find('#bio h3');
	
	//안보이게
	$('#bio>div').hide();
	$('#bio>div:first').show();
	
	$('#bio>h3').click(function(){
		//$(this).next().toggle();
		//animate( , ,속성값)
		$(this).next().animate({'height':'toggle'},'slow','easeOutBack');
	});
	
});