/**
 * 
 */
$(function(){
	
	$('#signup>form').validate({
		rules: {
			name:{required:true},
			email:{required:true,
					email:true
					},
			website:{url:true},
			password:{required:true,
					minlength:6
					},
			passconf:{equalTo:'#password'}
		},
		success : function(label){
			label.addClass('valid');
			label.text('성공');
		},
		
		
	});
	
	$('.check-all').click(function(){
		//prop() = attr()             //
		//$('.agree').prop('checked',this.checked); 자바 this 형식
		$('.agree').prop('checked',$(this).is(':checked'));//is : true,false감지
	});
	
	$('.agree').click(function(){
		if($('.agree').is('checked',true)){}else{};
		$(this).Prop('checked',$(this).is('not(:checked)'));
	});
	
});