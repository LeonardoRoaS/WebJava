<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="estilos.css">
    <title>Registro Usuario</title>
</head>
<body>
<h1 class="encabezado">Registro de usuarios</h1>
<h2 class="subtitulo">Datos incorrectos, favor comprobar nuevamente</h2>
<form action="registroUsuario" method="post">
    <div class="centrado">
        <label>Nombre:</label>
        <input type="text" name="nombre" class="campoTexto">
        <label>RUT:</label>
        <input type="text" name="rut" class="campoTexto">
        <label>Edad:</label>
        <input type="number" name="edad" class="campoTexto">
        <br><br>
        <input type="submit" value="enviar" class="boton">
    </div>
</form>
</body>
</html>