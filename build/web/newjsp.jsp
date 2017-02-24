<%-- 
    Document   : newjsp
    Created on : 06-jul-2014, 15:38:56
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Esta es una pagina web</title>
        <script type="text/javascript">
            var mi_numero = 1;
           
            function calcula(numero) {
                return numero + mi_numero;
            }
        </script>
    </head>
    <body>
        <script>
            document.write(calcula(1));
        </script>
    </body>
</html>