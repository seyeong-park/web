$(function(){
	
	var topDiv = $('.tabSet');
	var anchors = topDiv.find('.tabs a');
	var panelDiv = topDiv.find('.panels div.panel');
	
	anchors.show();
	panelDiv.hide();
	
	var lastAnchors = anchors.filter('.on');
	var lastPanel = $(lastAnchors.attr('href'));
	lastPanel.show();
	
	anchors.click(function(){
		//눌려진 요소에 클래스명 on지정
		var cAnchor = $(this);
		//1) 이벤트 발생한 a태그와 그 href(패널)을 얻어와서 변수에 지정
		var cPanel = $(cAnchor.attr('href')); //$ ID와 같은 효과
		//2) 기존 a태그(lastAnchors)에서 on 클래스 제거
		lastAnchors.removeClass('.on');
		//3) 현재 a태그 on클래스를 추가
		cAnchor.addClass('.on');
		//4) 기존패널 (lastPanel)감추기
		lastPanel.hide();
		//5) 현재패널 보이기
		cPanel.show();
		//6) 현재 a태그와 현재 패널을 lastAnchors,lastPanel 지정하기
		lastPanel=cPanel;
		lastAnchors=cAnchor;
	});
	
});