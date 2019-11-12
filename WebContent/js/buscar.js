$(document).on("click","#ir-buscar",function(){
	var codigo=$("#codigo").val();
	window.location.href = "buscar?codigo="+codigo;
	$("#datos").removeClass("datos");
});