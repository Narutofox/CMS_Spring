<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@tag description="notification" pageEncoding="UTF-8"%>

<c:if test="${ not empty sessionScope.notification}">
    <div class="${sessionScope.notification.CssClass}" id="notification">
        ${sessionScope.notification.Text}
    </div>
     <c:remove var="notification" scope="session" />
    <script>
        $(function () {
            var text = '${sessionScope.notification.Text}';

            if (text.length <= 50) {
                $("#notification").delay(3500).hide("blind", {direction: "up"}, 1500);
            } else if (text.length <= 100) {
                $("#notification").delay(4500).hide("blind", {direction: "up"}, 1500);
            } else if (text.length > 100) {
                $("#notification").delay(5500).hide("blind", {direction: "up"}, 2000);
            } else {
                $("#notification").delay(2500).hide("blind", {direction: "up"}, 1500);

            }
        });
    </script>
</c:if>
<c:if test="${empty sessionScope.notification}">
    <div id="notification" style="display:none">
    </div>
</c:if>
