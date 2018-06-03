
<html>

<body>

<jsp:include page="header.html"></jsp:include>

<form action="student-response.jsp">
First Name:<input type="text" name="firstName"/>
<br/>
Last Name:<input type="text" name="lastName"/>
<br/>
Marks Percentage-<input type="text" name="per"/>
Class:<select name="class">
<option>10th</option>
<option>11th</option>
<option>12th</option>
</select>

Gender:<input type="radio" name="gender" value="male">Male
<input type="radio" name="gender" value="female">Female
<br/>
Languages interested in:<input type="checkbox" name="language" value="java">
<input type="checkbox" name="language" value="mysql">
<input type="checkbox" name="language" value="html">
<input type="checkbox" name="language" value="ruby">
<br/>
<input type="submit" value="Submit">


</form>

<jsp:include page="footer.jsp"></jsp:include>


</body>

</html>