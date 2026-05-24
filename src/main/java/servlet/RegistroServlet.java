package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistroServlet")
public class RegistroServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        // RECIBIR DATOS DEL FORMULARIO
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        // CONFIGURAR RESPUESTA HTML
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='es'>");

        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>Nail Link - Panel</title>");

        out.println("<style>");

        out.println(":root {");
        out.println("--bg-light:#fff0f5;");
        out.println("--button-main:#f4a2bd;");
        out.println("--text-dark:#4a4a4a;");
        out.println("--white:#ffffff;");
        out.println("--shadow:0 4px 15px rgba(0,0,0,0.08);");
        out.println("}");

        out.println("body{");
        out.println("margin:0;");
        out.println("font-family:'Segoe UI';");
        out.println("background-color:var(--bg-light);");
        out.println("display:flex;");
        out.println("justify-content:center;");
        out.println("align-items:center;");
        out.println("height:100vh;");
        out.println("}");

        out.println(".construction-card{");
        out.println("background:white;");
        out.println("width:80%;");
        out.println("max-width:700px;");
        out.println("padding:50px;");
        out.println("border-radius:30px;");
        out.println("text-align:center;");
        out.println("box-shadow:var(--shadow);");
        out.println("}");

        out.println("img{");
        out.println("width:180px;");
        out.println("margin-bottom:20px;");
        out.println("}");

        out.println("h1{");
        out.println("color:var(--button-main);");
        out.println("font-size:3rem;");
        out.println("}");

        out.println(".user-box{");
        out.println("margin-top:30px;");
        out.println("background:#fdf2f7;");
        out.println("padding:15px;");
        out.println("border-radius:15px;");
        out.println("font-weight:bold;");
        out.println("}");

        out.println(".btn-home{");
        out.println("display:inline-block;");
        out.println("margin-top:30px;");
        out.println("background:var(--button-main);");
        out.println("color:white;");
        out.println("padding:12px 25px;");
        out.println("border-radius:10px;");
        out.println("text-decoration:none;");
        out.println("}");

        out.println("</style>");
        out.println("</head>");

        out.println("<body>");

        out.println("<div class='construction-card'>");

        out.println("<img src='img/LOGO.png'>");

        out.println("<h1>Próximamente</h1>");

        out.println("<h2>🚧 Estamos en construcción 🚧</h2>");

        out.println("<p>");
        out.println("Estamos trabajando para ofrecer una mejor experiencia.");
        out.println("</p>");

        out.println("<div class='user-box'>");
        out.println("Bienvenido usuario: " + usuario);
        out.println("<p>Contraseña: " + password + "</p>");
        out.println("</div>");

        out.println("<a href='index.html' class='btn-home'>");
        out.println("Volver al inicio");
        out.println("</a>");

        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
    }
}