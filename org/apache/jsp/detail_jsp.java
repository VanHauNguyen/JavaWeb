/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.100
 * Generated at: 2024-06-07 02:32:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/Users/nguyenvanhau/NetBeansProjects/BtlTrangSucJdk15ss/build/web/WEB-INF/lib/jstl-impl.jar!/META-INF/c.tld", Long.valueOf(1343794618000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-impl.jar", Long.valueOf(1716547728012L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <!--Main layout-->\n");
      out.write("<main class=\"mt-5 pt-4\">\n");
      out.write("    <div class=\"container mt-5\">\n");
      out.write("        <!--Grid row-->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <!--Grid column-->\n");
      out.write("            <div class=\"col-md-6 mb-4\">\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${details.image}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"img-fluid\" alt=\"\" />\n");
      out.write("            </div>\n");
      out.write("            <!--Grid column-->\n");
      out.write("\n");
      out.write("            <!--Grid column-->\n");
      out.write("            <div class=\"col-md-6 mb-4\">\n");
      out.write("                <\n");
      out.write("                <!--Content-->\n");
      out.write("                <div class=\"p-4\">\n");
      out.write("                    <div class=\"mb-3\">\n");
      out.write("                        <a href=\"\">\n");
      out.write("                            <span class=\"badge bg-dark me-1\">Category 2</span>\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"\">\n");
      out.write("                            <span class=\"badge bg-info me-1\">New</span>\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"\">\n");
      out.write("                            <span class=\"badge bg-danger me-1\">Bestseller</span>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <p class=\"lead\">\n");
      out.write("                        <span class=\"me-1\">\n");
      out.write("                            <del>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${details.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</del>\n");
      out.write("                        </span>\n");
      out.write("                        <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${details.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                    </p>\n");
      out.write("                    \n");
      out.write("                    <select name=\"sizeS\">\n");
      out.write("                        <option value=\"s\">S</option>\n");
      out.write("                        <option value=\"m\">M</option>\n");
      out.write("                        <option value=\"l\">L</option>\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                    <strong><p style=\"font-size: 20px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${details.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p></strong>\n");
      out.write("\n");
      out.write("                    <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${details.description}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\n");
      out.write("                    <form class=\"d-flex justify-content-left\" name=\"f\" action=\"\" method=\"post\">\n");
      out.write("                        <!-- Default input -->\n");
      out.write("                        <div class=\"form-outline me-1\" style=\"width: 100px;\">\n");
      out.write("                            <input type=\"number\" name=\"num\" value=\"1\" class=\"form-control\" />\n");
      out.write("                        </div>\n");
      out.write("                        <button onclick=\"muahang('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${details.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("')\" class=\"btn btn-primary ms-1\" type=\"submit\">\n");
      out.write("                            Add to cart\n");
      out.write("                            <i class=\"fas fa-shopping-cart ms-1\"></i>\n");
      out.write("                        </button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <!--Content-->\n");
      out.write("            </div>\n");
      out.write("            <!--Grid column-->\n");
      out.write("        </div>\n");
      out.write("        <!--Grid row-->\n");
      out.write("\n");
      out.write("        <hr />\n");
      out.write("\n");
      out.write("        <!--Grid row-->\n");
      out.write("        <div class=\"row d-flex justify-content-center\">\n");
      out.write("            <!--Grid column-->\n");
      out.write("            <div class=\"col-md-6 text-center\">\n");
      out.write("                <h4 class=\"my-4 h4\">Additional information</h4>\n");
      out.write("\n");
      out.write("                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Natus suscipit modi sapiente illo soluta odit voluptates, quibusdam officia. Neque quibusdam quas a quis porro? Molestias illo neque eum in laborum.</p>\n");
      out.write("            </div>\n");
      out.write("            <!--Grid column-->\n");
      out.write("        </div>\n");
      out.write("        <!--Grid row-->\n");
      out.write("\n");
      out.write("        <!--Grid row-->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <!--Grid column-->\n");
      out.write("            <div class=\"col-lg-4 col-md-12 mb-4\">\n");
      out.write("                <img src=\"https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Products/11.jpg\" class=\"img-fluid\" alt=\"\" />\n");
      out.write("            </div>\n");
      out.write("            <!--Grid column-->\n");
      out.write("\n");
      out.write("            <!--Grid column-->\n");
      out.write("            <div class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("                <img src=\"https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Products/12.jpg\" class=\"img-fluid\" alt=\"\" />\n");
      out.write("            </div>\n");
      out.write("            <!--Grid column-->\n");
      out.write("\n");
      out.write("            <!--Grid column-->\n");
      out.write("            <div class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("                <img src=\"https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Products/13.jpg\" class=\"img-fluid\" alt=\"\" />\n");
      out.write("            </div>\n");
      out.write("            <!--Grid column-->\n");
      out.write("        </div>\n");
      out.write("        <!--Grid row-->\n");
      out.write("    </div>\n");
      out.write("</main>\n");
      out.write("<!--Main layout-->\n");
      out.write("\n");
      out.write("<!-- footer -->\n");
      out.write("<footer class=\"text-center text-white mt-4\" style=\"background-color: #607d8b;\">\n");
      out.write("    <!--Call to action-->\n");
      out.write("    <div class=\"pt-4 pb-2\">\n");
      out.write("        <a class=\"btn btn-outline-white footer-cta mx-2\" style=\"box-shadow: rgba(0, 0, 0, 0.15) 0px 5px 15px;\" href=\"https://mdbootstrap.com/docs/jquery/getting-started/download/\" target=\"_blank\" role=\"button\">\n");
      out.write("            Download MDB\n");
      out.write("            <i class=\"fas fa-download ms-2\"></i>\n");
      out.write("        </a>\n");
      out.write("        <a class=\"btn btn-outline-white footer-cta mx-2\" style=\"box-shadow: rgba(0, 0, 0, 0.15) 0px 5px 15px;\" href=\"https://mdbootstrap.com/education/bootstrap/\" target=\"_blank\" role=\"button\">\n");
      out.write("            Start free tutorial\n");
      out.write("            <i class=\"fas fa-graduation-cap ms-2\"></i>\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("    <!--/.Call to action-->\n");
      out.write("\n");
      out.write("    <hr class=\"text-dark\" />\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <!-- Section: Social media -->\n");
      out.write("        <section class=\"mb-3\">\n");
      out.write("            <!-- Facebook -->\n");
      out.write("            <a class=\"btn-link btn-floating btn-lg text-white\" href=\"#!\" role=\"button\" data-mdb-ripple-color=\"dark\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("\n");
      out.write("            <!-- Twitter -->\n");
      out.write("            <a class=\"btn-link btn-floating btn-lg text-white\" href=\"#!\" role=\"button\" data-mdb-ripple-color=\"dark\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("\n");
      out.write("            <!-- Google -->\n");
      out.write("            <a class=\"btn-link btn-floating btn-lg text-white\" href=\"#!\" role=\"button\" data-mdb-ripple-color=\"dark\"><i class=\"fab fa-google\"></i></a>\n");
      out.write("\n");
      out.write("            <!-- Instagram -->\n");
      out.write("            <a class=\"btn-link btn-floating btn-lg text-white\" href=\"#!\" role=\"button\" data-mdb-ripple-color=\"dark\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("\n");
      out.write("            <!-- YouTube -->\n");
      out.write("            <a class=\"btn-link btn-floating btn-lg text-white\" href=\"#!\" role=\"button\" data-mdb-ripple-color=\"dark\"><i class=\"fab fa-youtube\"></i></a>\n");
      out.write("            <!-- Github -->\n");
      out.write("            <a class=\"btn-link btn-floating btn-lg text-white\" href=\"#!\" role=\"button\" data-mdb-ripple-color=\"dark\"><i class=\"fab fa-github\"></i></a>\n");
      out.write("        </section>\n");
      out.write("        <!-- Section: Social media -->\n");
      out.write("    </div>\n");
      out.write("    <!-- Grid container -->\n");
      out.write("\n");
      out.write("    <!-- Copyright -->\n");
      out.write("    <div class=\"text-center p-3\" style=\"background-color: rgba(0, 0, 0, 0.2); text-color: #e0e0e0;\">\n");
      out.write("        © 2022 Copyright:\n");
      out.write("        <a class=\"text-white\" href=\"https://mdbootstrap.com/\">MDBootstrap.com</a>\n");
      out.write("    </div>\n");
      out.write("    <!-- Copyright -->\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"\n");
      out.write("        https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.min.js\n");
      out.write("        \"></script>\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function muahang(id){\n");
      out.write("                document.f.action = \"muahang?id=\"+id;\n");
      out.write("                document.f.submit();\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
