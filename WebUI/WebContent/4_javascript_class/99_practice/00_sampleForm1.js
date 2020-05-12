
window.onload=function(){
	var cell=document.getElementsByClassName('item');
	for(var i=0; cell.length;i++){
	cell[i].onclick=function(){
		alert(this.getAttribute('price'));
	
		}
	}
}

//this : 이벤트가 발생한 객체
//var price = this.getAttribute('price');