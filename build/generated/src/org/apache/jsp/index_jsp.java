package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Producto;
import dao.ProductoDao;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <title>Registro Ventas</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <body style=\"margin-top: 30px\">      \n");
      out.write("        <h2 style=\"text-align: center\">Lista y agregado de Productos</h2>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container\">               \n");
      out.write("            <!--<a  class=\"btn btn-success\" href=\"Agregar.jsp\">Nuevo Registro</a> Esto es Cuando se Crea un nuevo Archivo Agregar.jsp -->         \n");
      out.write("            <table class=\"table table-bordered\"  id=\"tablaDatos\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th class=\"text-center\">Id</th>\n");
      out.write("                        <th class=\"text-center\">nombre</th>\n");
      out.write("                        <th class=\"text-center\">precio</th>\n");
      out.write("                        <th class=\"text-center\">cantidad</th>\n");
      out.write("                        <th class=\"text-center\">Acciones</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody id=\"tbodys\">\n");
      out.write("\n");
      out.write("                    ");

                        ProductoDao dao = new ProductoDao();
                        List<Producto> list = dao.listarProducto();

                        for (int i = 0; i < list.size(); i++) {


                    
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"text-center\">");
      out.print(list.get(i).getIdProducto());
      out.write("</td>\n");
      out.write("                        <td class=\"text-center\">");
      out.print(list.get(i).getNombre());
      out.write("</td>\n");
      out.write("                        <th class=\"text-center\">");
      out.print(list.get(i).getPrecio());
      out.write("</th>\n");
      out.write("                        <td class=\"text-center\">");
      out.print(list.get(i).getCantidad());
      out.write("</td>\n");
      out.write("\n");
      out.write("                        <td class=\"text-center\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-success btn-lg\" data-toggle=\"modal\" data-target=\"#myModal\">Agregar ventas</button>\n");
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>    \n");
      out.write("\n");
      out.write("        <div class=\"container\">          \n");
      out.write("            <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\n");
      out.write("                <div class=\"modal-dialog\" role=\"document\" style=\"z-index: 9999; width: 450px\">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-header\">                            \n");
      out.write("                            <h4 class=\"modal-title\" id=\"myModalLabel\">Agregar Cursoer</h4>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <form action=\"ProductoServlet\" method=\"post\">\n");
      out.write("                                <label>Nombre Producto</label><br>\n");
      out.write("                                <input class=\"form-control\" type=\"text\" name=\"nombre\"><br>\n");
      out.write("                                <label>Precio</label><br>\n");
      out.write("                                <input class=\"form-control\" type=\"text\" name=\"precio\"><br>\n");
      out.write("                                <label>Cantidad</label><br>\n");
      out.write("                                <input class=\"form-control\" type=\"text\" name=\"cantidad\"><br>\n");
      out.write("\n");
      out.write("                                <div class=\"modal-footer\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>                            \n");
      out.write("                                    <input type=\"submit\" value=\"Guardar\" class=\"btn btn-primary\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>  \n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Optional JavaScript -->\n");
      out.write("        <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\" integrity=\"sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
