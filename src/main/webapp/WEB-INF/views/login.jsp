
<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>

<c:out value="${message}"/>

<form:form  method="POST" modelAttribute="login1"> 
    
    Following are the options :
    
    SOURCE     Destination
    LAX          SFO
    LAX          Seattle
   Seattle        LAX
    SFO            LAX
    
    
    Name:<form:input path="name"></form:input>  
    source:<form:input path="source"></form:input> 
    destination:<form:input path="destination"></form:input> 
    <input type="submit" value="Search" />  
   
    
                       
        </form:form>  


