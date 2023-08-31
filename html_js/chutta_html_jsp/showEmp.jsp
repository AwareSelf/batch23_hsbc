<h3> access empname and greet using EL (Expression Language syntax )</h3>
<h3>Emp name u passed as request parameter is ${empname}</h3>
<h3>The complete greet message is ${greet}</h3>

<hr>
<h2>${greet} </h2>

<h2>access same using jsp tag : <%=request.getParameter("empname") %></h2>
<h2>acces same using jsp tag :<%=request.getAttribute("greet") %></h2>