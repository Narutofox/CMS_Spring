<%@taglib uri="http://ivan.cicek.cms" prefix="ly" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<ly:layout title="Meni" lang="hr">
    <jsp:body>
        <div>
            <h2>Novi meni</h2>
            <form:form method="POST" action="/CMS_IvanCicek/Admin/CreateMenu" modelAttribute="menu">
            <select class="form-control" name="ParentId">
               <option>Odaberi roditeljski meni</option>
                <option th:each="menu : ${Menus}"
                th:value="${menu.MenuId}"
                th:text="${menu.Name}"></option>
            </select>
             <div>
                 <form:label path="Name">Naziv</form:label>
                 <form:input path="Name" type="text" required="required"/>
                 <input type="submit" value="Spremi"/>
            </div>
        </form:form>
        </div>
    </jsp:body>
</ly:layout>