<%@tag description="Basic layout" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://ivan.cicek.cms" prefix="ly" %>  

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="title" required="false"%>
<%@attribute name="lang" required="false"%>

<!DOCTYPE html>
<html lang="${lang}">
    <head>
        <title>${title}</title>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="/CMS_IvanCicek/content/js/jquery-3.3.1.js" type="text/javascript"></script>
        <script src="/CMS_IvanCicek/content/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="/CMS_IvanCicek/content/js/trees.js" type="text/javascript"></script>

        <link href="/CMS_IvanCicek/content/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="/CMS_IvanCicek/content/css/trees.css" rel="stylesheet" type="text/css"/>
        <link href="/CMS_IvanCicek/content/css/verticalMenu.css" rel="stylesheet" type="text/css"/>
        <link href="/CMS_IvanCicek/content/css/Site.css" rel="stylesheet" type="text/css"/>
        <script>
            $(function () {
                $('#tree1').treed();
            });
        </script>
    </head>
    <body>
        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <span class="navbar-brand">CMS</span>          
                </div>
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">                   
                        <li><a href="/CMS_IvanCicek/Admin/Menues">Meni</a></li>
                        <li><a href="/CMS_IvanCicek/Admin/Pages">Stranica</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="/CMS_IvanCicek/Login">Prijava</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div style="overflow: hidden">
            <div id="header" style="float: left">
                <header>
                    <div class="vertical-menu">
                        <ul id="tree1">
                            <li class="clickable"><a href="#">TECH</a>
                                <ul>
                                    <li>Company Maintenance</li>
                                    <li class="clickable">Employees
                                        <ul>
                                            <li class="clickable">Reports
                                                <ul>
                                                    <li>Report1</li>
                                                    <li>Report2</li>
                                                    <li>Report3</li>
                                                </ul>
                                            </li>
                                            <li>Employee Maint.</li>
                                        </ul>
                                    </li>
                                    <li>Human Resources</li>
                                </ul>
                            </li>
                            <li class="clickable">XRP
                                <ul>
                                    <li>Company Maintenance</li>
                                    <li class="clickable">Employees
                                        <ul>
                                            <li class="clickable">Reports
                                                <ul>
                                                    <li>Report1</li>
                                                    <li>Report2</li>
                                                    <li>Report3</li>
                                                </ul>
                                            </li>
                                            <li>Employee Maint.</li>
                                        </ul>
                                    </li>
                                    <li>Human Resources</li>
                                </ul>
                            </li>
                        </ul>
                    </div> 
                </header>
            </div>
            <div id="body" class="container body-content">
                <ly:notification></ly:notification>
                <jsp:doBody/>

            </div>

        </div>
        <div>
            <footer style="margin-left: 49%">
                <p id="copyright">&copy; 2018, Ivan Čiček CMS</p>
            </footer>    
        </div>
    </body>
</html>