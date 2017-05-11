function valida(e){
    tecla = (document.all) ? e.keyCode : e.which;

    //Tecla de retroceso para borrar, siempre la permite
    if (tecla==8){
        return true;
    }
        
    // Patron de entrada, en este caso solo acepta numeros
    patron =/[0-9]/;
    tecla_final = String.fromCharCode(tecla);
    return patron.test(tecla_final);
}

function validaForm(){
    // Campos de texto
    if($("#nombre").val() == ""){
        alert("El campo Nombre no puede estar vacío.");
        $("#nombre").focus(); 
        return false;
    }
    if($("#monto").val() == ""){
        alert("El campo Monto no puede estar vacío.");
        $("#monto").focus();
        return false;
    }
}
 
    return true; // Si todo está correcto
}
	
$(document).ready( function() { // Esta parte del código se ejecutará automáticamente cuando la página esté lista.
 $("#botonenviar").click( function() { // Con esto establecemos la acción por defecto de nuestro botón de enviar.
 if(validaForm()){ // Primero validará el formulario.
 $.post("pedidos/guardar",$("#crearpedido").serialize(),function(res){
	 
	 
	 $(document).ready( function() {   // Esta parte del código se ejecutará automáticamente cuando la página esté lista.
		    $("#botonenviar").click( function() {     // Con esto establecemos la acción por defecto de nuestro botón de enviar.
		        if(validaForm()){                               // Primero validará el formulario.
		            $.post("pedidos/guardar",$("#crearpedido").serialize(),function(res){
		                
		            });
		        }
		    });    
		});
 }