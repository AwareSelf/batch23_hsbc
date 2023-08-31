<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMP Ajax example</title>
</head>
<body>

<p id="demo">Hello!</p>

<script type="text/javascript">
function loadDoc() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            document.getElementById("demo").innerHTML =
            this.responseText;
       }
       else
       {
          document.getElementById("demo").innerHTML = "status is not ok";
       }
    };
    xhttp.open("POST", "EmpAjaxServlet", true);
   xhttp.send("empid=1&empname=Namrata&empsalary=60000");
}
</script>

</body>
</html>