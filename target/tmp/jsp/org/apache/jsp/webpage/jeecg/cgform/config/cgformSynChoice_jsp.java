package org.apache.jsp.webpage.jeecg.cgform.config;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cgformSynChoice_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_base_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_mutiLang_langKey_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_mutiLang_langKey_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
    _jspx_tagPool_t_mutiLang_langKey_nobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;

      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_0.setPageContext(_jspx_page_context);
      _jspx_th_c_set_0.setParent(null);
      _jspx_th_c_set_0.setVar("webRoot");
      _jspx_th_c_set_0.setValue(basePath);
      int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
      if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
        return;
      }
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      out.write("\n");
      out.write("<SCRIPT type=text/javascript src=\"plug-in/clipboard/ZeroClipboard.js\"></SCRIPT>\n");
      if (_jspx_meth_t_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<style>\n");
      out.write("<!--\n");
      out.write("body{\n");
      out.write("\toverflow: hidden;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("<div>\n");
      out.write("<div><input type='radio' name='synMethod' value='normal' checked>");
      if (_jspx_meth_t_mutiLang_0(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("<div><input type='radio' name='synMethod' value='force'>");
      if (_jspx_meth_t_mutiLang_1(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<SCRIPT type=\"text/javascript\">\n");
      out.write(" function getSynChoice(){\n");
      out.write("\tvar synchoice;\n");
      out.write("\t$(\"[name='synMethod']\").each(function(){\n");
      out.write("\t\tif($(this).attr(\"checked\")){\n");
      out.write("\t\t\tsynchoice = $(this).val();\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\treturn synchoice;\n");
      out.write(" }\n");
      out.write(" </SCRIPT>");
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

  private boolean _jspx_meth_t_base_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:base
    org.jeecgframework.tag.core.easyui.BaseTag _jspx_th_t_base_0 = (org.jeecgframework.tag.core.easyui.BaseTag) _jspx_tagPool_t_base_type_nobody.get(org.jeecgframework.tag.core.easyui.BaseTag.class);
    _jspx_th_t_base_0.setPageContext(_jspx_page_context);
    _jspx_th_t_base_0.setParent(null);
    _jspx_th_t_base_0.setType("jquery,easyui,jqueryui-sortable,tools");
    int _jspx_eval_t_base_0 = _jspx_th_t_base_0.doStartTag();
    if (_jspx_th_t_base_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_base_type_nobody.reuse(_jspx_th_t_base_0);
      return true;
    }
    _jspx_tagPool_t_base_type_nobody.reuse(_jspx_th_t_base_0);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_0 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_0.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_0.setParent(null);
    _jspx_th_t_mutiLang_0.setLangKey("normal.sync");
    int _jspx_eval_t_mutiLang_0 = _jspx_th_t_mutiLang_0.doStartTag();
    if (_jspx_th_t_mutiLang_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_0);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_0);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_1 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_1.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_1.setParent(null);
    _jspx_th_t_mutiLang_1.setLangKey("force.sync");
    int _jspx_eval_t_mutiLang_1 = _jspx_th_t_mutiLang_1.doStartTag();
    if (_jspx_th_t_mutiLang_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_1);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_1);
    return false;
  }
}
