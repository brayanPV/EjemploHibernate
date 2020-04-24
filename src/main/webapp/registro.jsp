<%-- 
    Document   : regitro.jsp
    Created on : 23/04/2020, 06:56:51 PM
    Author     : stive
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="row justify-content-center">
                <form method="POST" action="RegistroServlet">
                    <div class="form-group">
                        <label for="exampleInputUsuario">Usuario</label>
                        <input type="text" class="form-control" name="usuario" id="exampleInputUsuario" placeholder="Usuario">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword">Password</label>
                        <input type="password" class="form-control" name="clave" id="exampleInputPassword1" placeholder="Password">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputNombre">Nombre</label>
                        <input type="text" class="form-control" name="nombre" id="exampleInputNombre" placeholder="Nombre">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputDireccion">Direccion</label>
                        <input type="text" class="form-control" name="direccion" id="exampleInputDireccion" placeholder="Direccion">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputEmail">Correo</label>
                        <input type="email" class="form-control" name="email" id="exampleInputEmail" placeholder="Email">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputTelefono">Telefono</label>
                        <input type="text" class="form-control" name="telefono" id="exampleInputTelefono" placeholder="Telefono">
                    </div>
                    <button type="submit" class="btn btn-primary">Registrar</button>
                </form>
            </div>

        </div>
    </body>

    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</html>
