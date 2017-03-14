<%@attribute name = "id" required="true" %>

<input type="text" id="${id}" name="${id}" />

<script>
	$("#${id}").datepicker({dateFormat: 'dd/MM/yyyy'
							, changeMonth:true
							, changeYear:true
	});
</script>