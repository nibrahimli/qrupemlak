<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<nav class="navbar navbar-default" id="top">
  <div class="container-fluid">
    <div class="navbar-header">      
        <button type="button" class="navbar-toggle collapsed"
          data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
          <span class="sr-only">Toggle navigation</span> 
            <span class="icon-bar"></span>
            <span class="icon-bar"></span> <span
            class="icon-bar"></span>
        </button>           
      <a class="navbar-brand" href="/">Qrup Emlak</a>
    </div>
    <div class="collapse navbar-collapse"
      id="bs-example-navbar-collapse-1">      
      <ul class="nav navbar-nav">      
        <li><a href="<c:url value="/" />">Home</a></li>
      </ul>           
    </div>    
  </div>
</nav>