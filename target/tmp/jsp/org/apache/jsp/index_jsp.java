package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/public/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/public/main.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<br/>\n");
      out.write("<div class=\"container\"> <!-- begin container -->\n");
      out.write("<div class=\"row\"> <!-- begin row -->\n");
      out.write("  <div class=\"well col-md-6\"> <!-- begin well -->\n");
      out.write("    <legend>Avaliador de seguran&ccedil;a de senha</legend>\n");
      out.write("    <input id=\"password\" type=\"password\" class=\"form-control\" id=\"inputEmail\" placeholder=\"Senha\">\n");
      out.write("    <span id=\"score\" class=\"label label-default\">0%</span>&nbsp;\n");
      out.write("    <span id=\"complexity\" class=\"label label-danger\">Muito curta</span>\n");
      out.write("   </div> <!-- end well -->\n");
      out.write("</div><!-- end row -->\n");
      out.write("<div class=\"row col-md-6\"> <!-- begin row -->\n");
      out.write("<table class=\"table\">\n");
      out.write("  <thead>\n");
      out.write("    <th>Regras de adi&ccedil;&atilde;o</th>\n");
      out.write("    <th>Quantidade</th>\n");
      out.write("    <th>B&ocirc;nus</th>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("  \t<tr>\n");
      out.write("  \t  <td>N&uacute;mero de caracteres</td>\n");
      out.write("  \t  <td id=\"charLength\">0</td>\n");
      out.write("  \t  <td id=\"charLengthBonus\">0</td>\n");
      out.write("  \t</tr>\n");
      out.write("  \t<tr>\n");
      out.write("  \t  <td>Letras Mai&uacute;sculas</td>\n");
      out.write("  \t  <td id=\"uppercase\">0</td>\n");
      out.write("  \t  <td id=\"uppercaseBonus\">0</td>\n");
      out.write("  \t</tr>\n");
      out.write("  \t<tr>\n");
      out.write("  \t  <td>Letras Min&uacute;sculas</td>\n");
      out.write("  \t  <td id=\"lowercase\">0</td>\n");
      out.write("  \t  <td id=\"lowercaseBonus\">0</td>\n");
      out.write("  \t</tr>\n");
      out.write("   \t<tr>\n");
      out.write("  \t  <td>N&uacute;meros</td>\n");
      out.write("  \t  <td id=\"numbers\">0</td>\n");
      out.write("  \t  <td id=\"numbersBonus\">0</td>\n");
      out.write("  \t</tr>\n");
      out.write("  \t<tr>\n");
      out.write("  \t  <td>S&iacute;mbolos</td>\n");
      out.write("  \t  <td id=\"symbols\">0</td>\n");
      out.write("  \t  <td id=\"symbolsBonus\">0</td>\n");
      out.write("  \t</tr>\n");
      out.write("  \t<tr>\n");
      out.write("  \t  <td>N&iacute;meros e S&iacute;mbolos (meio)</td>\n");
      out.write("  \t  <td id=\"middleNumbersAndSymbols\">0</td>\n");
      out.write("  \t  <td id=\"middleNumbersAndSymbolsBonus\">0</td>\n");
      out.write("  \t</tr>\n");
      out.write("  \t<tr>\n");
      out.write("  \t  <td>Requisitos</td>\n");
      out.write("  \t  <td id=\"requirements\">0</td>\n");
      out.write("  \t  <td id=\"requirementsBonus\">0</td>\n");
      out.write("  \t</tr>\n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("<table class=\"table\">\n");
      out.write("  <thead>\n");
      out.write("    <th>Regras de subtra&ccedil;&atilde;o</th>\n");
      out.write("    <th>Quantidade</th>\n");
      out.write("    <th>B&ocirc;nus</th>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("  \t<tr>\n");
      out.write("  \t  <td>Somente letras</td>\n");
      out.write("  \t  <td id=\"lettersOnly\">0</td>\n");
      out.write("  \t  <td id=\"lettersOnlyBonus\">0</td>\n");
      out.write("  \t</tr>\n");
      out.write("  \t<tr>\n");
      out.write("  \t  <td>Somente N&uacute;meros</td>\n");
      out.write("  \t  <td id=\"numbersOnly\">0</td>\n");
      out.write("  \t  <td id=\"numbersOnlyBonus\">0</td>\n");
      out.write("  \t</tr>\n");
      out.write("  \t<tr>\n");
      out.write("  \t  <td>Caracteres Repetidos</td>\n");
      out.write("  \t  <td id=\"repeatedChars\">0</td>\n");
      out.write("  \t  <td id=\"repeatedCharsBonus\">0</td>\n");
      out.write("  \t</tr>\n");
      out.write("   \t<tr>\n");
      out.write("  \t  <td>Letras Mai&uacute;sculas Consecutivas</td>\n");
      out.write("  \t  <td id=\"consecutiveUppercaseLetters\">0</td>\n");
      out.write("  \t  <td id=\"consecutiveUppercaseLettersBonus\">0</td>\n");
      out.write("  \t</tr>\n");
      out.write("  \t<tr>\n");
      out.write("  \t  <td>Letras Min&uacute;sculas Consecutivas</td>\n");
      out.write("  \t  <td id=\"consecutiveLowercaseLetters\">0</td>\n");
      out.write("  \t  <td id=\"consecutiveLowercaseLettersBonus\">0</td>\n");
      out.write("  \t</tr>\n");
      out.write("  \t<tr>\n");
      out.write("  \t  <td>N&uacute;meros Consecutivos</td>\n");
      out.write("  \t  <td id=\"consecutiveNumbers\">0</td>\n");
      out.write("  \t  <td id=\"consecutiveNumbersBonus\">0</td>\n");
      out.write("  \t</tr>\n");
      out.write("  \t<tr>\n");
      out.write("  \t  <td>Letras Sequenciais</td>\n");
      out.write("  \t  <td id=\"sequentialLetters\">0</td>\n");
      out.write("  \t  <td id=\"sequentialLettersBonus\">0</td>\n");
      out.write("  \t</tr>\n");
      out.write("  \t<tr>\n");
      out.write("  \t  <td>N&uacute;meros Sequenciais</td>\n");
      out.write("  \t  <td id=\"sequentialNumbers\">0</td>\n");
      out.write("  \t  <td id=\"sequentialNumbersBonus\">0</td>\n");
      out.write("  \t</tr>\n");
      out.write("  \t<tr>\n");
      out.write("  \t  <td>S&iacute;mbolos Sequenciais</td>\n");
      out.write("  \t  <td id=\"sequentialSymbols\">0</td>\n");
      out.write("  \t  <td id=\"sequentialSymbolsBonus\">0</td>\n");
      out.write("  \t</tr>\n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("</div><!-- end row -->\n");
      out.write("</div><!-- end container -->\n");
      out.write("<script type=\"text/javascript\" src=\"/public/main.js\"></script>\n");
      out.write("</body>\n");
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
