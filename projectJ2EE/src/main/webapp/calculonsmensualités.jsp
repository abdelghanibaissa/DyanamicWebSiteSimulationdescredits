
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String resultat="resultat = 0.0" ;
	resultat =(String) request.getAttribute("res");
if(resultat == null){
	resultat="resultat = 0.0" ;
}
%>
<form method=get action=calculonsmensualit�s>
<label>montant</label>
<input type="number" name="montant"><br>
<label>duree</label>
<input type="number" name="duree"><br>
<label>taux</label>
<input type="number" name="taux"><br>
<input type="submit" value="calculer">
<label><%=resultat %></label>
</form>
</body>
</html>