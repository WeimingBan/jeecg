package org.apache.jsp.webpage.com.jeecg.demo.jformOrderMain2.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class jformOrderMain2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.release();
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
      out.write("<link rel=\"stylesheet\" href=\"plug-in/themes/fineui/css/mainform.css\" type=\"text/css\"/>\n");
      out.write("<style>\n");
      out.write(".conc-wrapper input:not([type='radio']){\n");
      out.write("width:95%;\n");
      out.write("}\n");
      out.write(".conc-wrapper input[type='checkbox'],input[type='radio']{\n");
      out.write("width:auto;\n");
      out.write("}\n");
      out.write(".conc-wrapper select{\n");
      out.write("width:95% !important;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<div style=\"margin: 0 15px;padding-bottom:10px;\">\n");
      out.write("<!-- 若页面内容太多需要滚动条 ,可自己根据页面添加overflow: auto;样式 -->\n");
      out.write("<div class=\"conc-wrapper\" style=\"margin-top:10px\">\n");
      out.write("\t\t\t<div class=\"main-tab\">\n");
      out.write("\t\t\t\t<ul class=\"tab-info\">\n");
      out.write("\t\t\t\t  <li role=\"presentation\" class=\"active\">\n");
      out.write("\t\t\t\t\t<a href=\"javascript:void(0);\"> &nbsp;&nbsp;信息模块1</a>\n");
      out.write("\t\t\t\t  </li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<!-- tab内容 -->\n");
      out.write("\t\t\t\t<div class=\"con-wrapper1\">\n");
      out.write("\t\t\t\t  <div class=\"row form-wrapper\">\n");
      out.write("\t\t\t<div class=\"row show-grid\">\n");
      out.write("\t\t<div class=\"col-xs-1 text-center\">\n");
      out.write("\t\t\t<b>订单号：</b>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-xs-2\">\n");
      out.write("\t\t\t\t<input id=\"orderCode\" name=\"orderCode\" type=\"text\"  class=\"form-control\"  ignore=\"ignore\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jformOrderMain2Page.orderCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'/> \n");
      out.write("\t\t\t<span class=\"Validform_checktip\" style=\"float:left;height:0px;\"></span>\n");
      out.write("\t\t\t<label class=\"Validform_label\" style=\"display: none\">订单号</label>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-xs-1 text-center\">\n");
      out.write("\t\t\t<b>订单日期：</b>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-xs-2\">\n");
      out.write("\t\t\t\t<input id=\"orderDate\" name=\"orderDate\" type=\"text\"   ignore=\"ignore\"  style=\"background: url('plug-in/ace/images/datetime.png') no-repeat scroll right center transparent;\"  class=\"form-control\" onClick=\"WdatePicker()\" value=\"");
      if (_jspx_meth_fmt_formatDate_0(_jspx_page_context))
        return;
      out.write("\" />\n");
      out.write("\t\t\t<span class=\"Validform_checktip\" style=\"float:left;height:0px;\"></span>\n");
      out.write("\t\t\t<label class=\"Validform_label\" style=\"display: none\">订单日期</label>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-xs-1 text-center\">\n");
      out.write("\t\t\t<b>订单金额：</b>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-xs-2\">\n");
      out.write("\t\t\t\t<input id=\"orderMoney\" name=\"orderMoney\" maxlength=\"10\" type=\"text\" class=\"form-control\"  datatype=\"/^(-?\\d+)(\\.\\d+)?$/\"  ignore=\"ignore\"  value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jformOrderMain2Page.orderMoney}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("' />\n");
      out.write("\t\t\t<span class=\"Validform_checktip\" style=\"float:left;height:0px;\"></span>\n");
      out.write("\t\t\t<label class=\"Validform_label\" style=\"display: none\">订单金额</label>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-xs-1 text-center\">\n");
      out.write("\t\t\t<b>备注：</b>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-xs-2\">\n");
      out.write("\t\t\t\t<input id=\"content\" name=\"content\" maxlength=\"255\" type=\"text\" class=\"form-control\"  ignore=\"ignore\"  value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jformOrderMain2Page.content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("' />\n");
      out.write("\t\t\t<span class=\"Validform_checktip\" style=\"float:left;height:0px;\"></span>\n");
      out.write("\t\t\t<label class=\"Validform_label\" style=\"display: none\">备注</label>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("   $(function(){\n");
      out.write("\t    //查看模式情况下,删除和上传附件功能禁止使用\n");
      out.write("\t\tif(location.href.indexOf(\"load=detail\")!=-1){\n");
      out.write("\t\t\t$(\".jeecgDetail\").hide();\n");
      out.write("\t\t\t$(\"input,select,textarea\").attr(\"disabled\",\"disabled\");\n");
      out.write("\t\t}\n");
      out.write("   });\n");
      out.write("</script>");
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

  private boolean _jspx_meth_fmt_formatDate_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent(null);
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jformOrderMain2Page.orderDate}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_0.setType("date");
    _jspx_th_fmt_formatDate_0.setPattern("yyyy-MM-dd");
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }
}
