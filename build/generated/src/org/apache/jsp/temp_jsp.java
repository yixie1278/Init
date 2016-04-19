package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class temp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/guestHeader.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<title>Bootstrap eCommerce Template</title>\n");
      out.write("\n");
      out.write("<!-- Bootstrap -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("\n");
      out.write("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<nav>\n");
      out.write("  <div class=\"container\"> \n");
      out.write("    \n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("   <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\"> <span class=\"sr-only\">Toggle navigation</span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> </button>\n");
      out.write("      <blockquote>\n");
      out.write("        <p><strong><a href=\"homepage.html\">Cedar Library</a></strong></p>\n");
      out.write("      </blockquote>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("    <div class=\"collapse navbar-collapse\">\n");
      out.write("      <ul class=\"nav navbar-nav\"> \n");
      out.write("        <li class=\"dropdown\"> <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\" aria-haspopup=\"true\">Catalog<span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"./eBook.html\">eBook</a> </li>\n");
      out.write("            <li><a href=\"./AudioBook.html\">Audiobook</a> </li>\n");
      out.write("            <li><a href=\"./Video.html\">Video</a> </li>\n");
      out.write("            <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("            <li><a href=\"./moreTypePage.html\">More type</a> </li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      <form class=\"navbar-form navbar-right\" role=\"search\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("        </div>\n");
      out.write("        <button type=\"submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("      </form>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right hidden-sm\">\n");
      out.write("        <li><a href=\"sign/signIn.html\">Login</a></li>\n");
      out.write("        <li><a href=\"sign/signUp.html\">Account Registration</a> </li>\n");
      out.write("        <li class=\"dropdown\"> <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\" aria-haspopup=\"true\">Advance Search <span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("           <li><a href=\"./popularest.html\">the popularest</a> </li>\n");
      out.write("            <li><a href=\"./newRelease.html\">New Releases</a> </li>\n");
      out.write("            <li><a href=\"./Price.html\">TopHolds</a> </li>\n");
      out.write("            <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("            <li><a href=\"./moreSearch.html\">More Search</a> </li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <!-- /.navbar-collapse --> \n");
      out.write("  </div>\n");
      out.write("  <!-- /.container-fluid --> \n");
      out.write("</nav>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\n");
      out.write("        <div id=\"carousel1\" class=\"carousel slide\">\n");
      out.write("          <ol class=\"carousel-indicators\">\n");
      out.write("            <li data-target=\"#carousel1\" data-slide-to=\"0\" class=\"active\"> </li>\n");
      out.write("            <li data-target=\"#carousel1\" data-slide-to=\"1\" class=\"\"> </li>\n");
      out.write("            <li data-target=\"#carousel1\" data-slide-to=\"2\" class=\"\"> </li>\n");
      out.write("          </ol>\n");
      out.write("          <div class=\"carousel-inner\">\n");
      out.write("            <div class=\"item\"> <img class=\"img-responsive\" src=\"images/header3.jpg\" alt=\"thumb\">\n");
      out.write("              <div class=\"carousel-caption\"> Welcome to Cedar Library ! </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item active\"> <img class=\"img-responsive\" src=\"images/header.jpg\" alt=\"thumb\">\n");
      out.write("              <div class=\"carousel-caption\"> Welcome to Cedar Library ! </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\"> <img class=\"img-responsive\" src=\"images/EbookSectionHeader.jpg\" alt=\"thumb\">\n");
      out.write("              <div class=\"carousel-caption\"> Welcome to Cedar Library ! </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <a class=\"left carousel-control\" href=\"#carousel1\" data-slide=\"prev\"><span class=\"icon-prev\"></span></a> <a class=\"right carousel-control\" href=\"#carousel1\" data-slide=\"next\"><span class=\"icon-next\"></span></a></div>\n");
      out.write("      </div>\n");
      out.write("</div>\n");
      out.write("    <hr>\n");
      out.write("  </div>\n");
      out.write("<div class=\"container\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-4\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-2 col-md-3 col-sm-3 col-xs-2\"><img class=\"img-circle\" alt=\"Free Shipping\" src=\"images/smile.jpg\"></div>\n");
      out.write("        <div class=\"col-lg-6 col-md-9 col-sm-9 col-xs-9\">\n");
      out.write("          <h4>Choose Cedar :) </h4>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-4\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-2 col-md-3 col-sm-3 col-xs-2\"><img class=\"img-circle\" alt=\"Free Shipping\" src=\"images/smile.jpg\"></div>\n");
      out.write("        <div class=\"col-lg-6 col-md-9 col-sm-9 col-xs-9\">\n");
      out.write("          <h4>Easy Dowload</h4>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-4\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-2 col-md-3 col-sm-3 col-xs-2\"><img class=\"img-circle\" alt=\"Free Shipping\" src=\"images/smile.jpg\"></div>\n");
      out.write("        <div class=\"col-lg-6 col-md-9 col-sm-9 col-xs-9\">\n");
      out.write("          <h4>Free for Everthing</h4>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</html>");
      out.write("\n");
      out.write("            \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<title>Bootstrap eCommerce Template</title>\n");
      out.write("\n");
      out.write("<!-- Bootstrap -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("\n");
      out.write("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("   \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<hr>\n");
      out.write("  <div class=\"container well\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-xs-6 col-sm-6 col-md-6 col-lg-7\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6\">\n");
      out.write("            <div>\n");
      out.write("               <li> <a>Servics</a> </li>\n");
      out.write("              <ul class=\"list-unstyled\">\n");
      out.write("                <li> <a>Free Download</a> </li>\n");
      out.write("                <li> <a>Learn a Language</a> </li>\n");
      out.write("                <li> <a>User Guide</a> </li>\n");
      out.write("                <li> <a>Book for Kids</a> </li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-sm-4 col-md-4 col-lg-4  col-xs-6\">\n");
      out.write("            <div>\n");
      out.write("              <ul class=\"list-unstyled\">  \n");
      out.write("                <li> <a><a href=\"sign/signUp.html\">Sign Up</a></a> </li>\n");
      out.write("                <li> <a><a href=\"sign/signIn.html\">Login</a></a> </li>\n");
      out.write("                <li> <a>Connect</a> </li>\n");
      out.write("                <li> <a><a href=\"https://docs.google.com/forms/d/1-RB6dMhVFY9lYDFUXEmOwpRVBQZ4afaezy2wo9aE7oc/viewform\">Contact Us</a></a> </li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-sm-4 col-md-4 col-lg-4 col-xs-6\">\n");
      out.write("            <div>\n");
      out.write("              \t<a>Team Member</a>\n");
      out.write("                <li> <a>Brian Lee</a> </li>\n");
      out.write("                <li> <a>Yiu Chau Lin</a> </li>\n");
      out.write("                <li> <a>Yue Zhao</a> </li>\n");
      out.write("                <li> <a>Yi Xie</a> </li>\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-xs-6 col-sm-6 col-md-6 col-lg-5\"> \n");
      out.write("        <address>\n");
      out.write("        <strong>Cedar, Inc.</strong><br>\n");
      out.write("        Stony Brook<br>\n");
      out.write("        NY, 11790<br>\n");
      out.write("        <abbr title=\"Phone\">P:</abbr> (631) 000-0000\n");
      out.write("      </address>\n");
      out.write("        <address>\n");
      out.write("        <strong>Cedar</strong><br>\n");
      out.write("        <a href=\"mailto:#\">Cedar@stonybrook.com</a>\n");
      out.write("        </address>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("<footer class=\"text-center\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-xs-12\">\n");
      out.write("        <p>Copyright © Cedar. All rights reserved.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</footer>\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) --> \n");
      out.write("<script src=\"js/jquery-1.11.3.min.js\"></script> \n");
      out.write("<!-- Include all compiled plugins (below), or include individual files as needed --> \n");
      out.write("<script src=\"js/bootstrap.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("</html>\n");
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
