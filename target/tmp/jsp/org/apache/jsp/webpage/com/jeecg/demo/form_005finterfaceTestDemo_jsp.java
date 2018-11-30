package org.apache.jsp.webpage.com.jeecg.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class form_005finterfaceTestDemo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_base_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_formvalid_usePlugin_layout_formid_dialog;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_formvalid_usePlugin_layout_formid_dialog = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
    _jspx_tagPool_t_formvalid_usePlugin_layout_formid_dialog.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      if (_jspx_meth_t_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<script>\n");
      out.write("//重置\n");
      out.write("function gReload(){\n");
      out.write("\t$(\"#serverUrl\").val('');\n");
      out.write("\t$(\"#requestBody\").val('');\n");
      out.write("\t$(\"#json-field\").val('');\n");
      out.write("\t//$(\"#S_TYPE_S\").val('');\n");
      out.write("\t//$(\"input.i-checks:first\").iCheck('check');\n");
      out.write("}\n");
      out.write("// $('input.i-checks:radio').on('ifChecked', function(event){\n");
      out.write("// \t  $(\"#S_TYPE\").val($(this).attr(\"value\"));\n");
      out.write("// \t});\n");
      out.write("\t\n");
      out.write("//发送请求 ajax\n");
      out.write("function sendSever(){\n");
      out.write("\tif($(\"#serverUrl\").val()==\"\" ){\n");
      out.write("\t\t tip(\"请输入请求的地址\",1);\n");
      out.write("\t\t$(\"#serverUrl\").focus();\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("\t$.ajax({\n");
      out.write("\t\ttype: \"POST\",\n");
      out.write("\t\turl: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${webRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jeecgFormDemoController.do?interfaceTest\",\n");
      out.write("    \tdata: {serverUrl:$(\"#serverUrl\").val(),requestBody:$(\"#requestBody\").val(),requestMethod:$('input[name=\"requestMethod\"]:checked').val()},\n");
      out.write("\t\tdataType:'json',\n");
      out.write("\t\tcache: false,\n");
      out.write("\t\tsuccess: function(data){\n");
      out.write("\t\t\t if(data.success){\n");
      out.write("\t\t\t\t tip(\"服务器请求成功！\",0);\n");
      out.write("\t\t\t \t $(\"#json-field\").val(data.obj);\n");
      out.write("\t\t\t }else{\n");
      out.write("\t\t\t\t tip(data.obj,1);\n");
      out.write("\t\t\t }\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write(" </script>\n");
      out.write(" <style type=\"text/css\">\n");
      out.write(" h1 {\n");
      out.write("    display: block;\n");
      out.write("    font-size: 2em;\n");
      out.write("    -webkit-margin-before: 0.67em;\n");
      out.write("    -webkit-margin-after: 0.67em;\n");
      out.write("    -webkit-margin-start: 0px;\n");
      out.write("    -webkit-margin-end: 0px;\n");
      out.write("    font-weight: bold;\n");
      out.write("}\n");
      out.write(" </style>\n");
      out.write("  </head>\n");
      out.write("<body style=\"overflow-y: hidden\" scroll=\"no\">\n");
      out.write("  <h1 align=\"center\">接口测试</h1>\n");
      out.write("  ");
      if (_jspx_meth_t_formvalid_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write(" </body>\n");
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

  private boolean _jspx_meth_t_base_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:base
    org.jeecgframework.tag.core.easyui.BaseTag _jspx_th_t_base_0 = (org.jeecgframework.tag.core.easyui.BaseTag) _jspx_tagPool_t_base_type_nobody.get(org.jeecgframework.tag.core.easyui.BaseTag.class);
    _jspx_th_t_base_0.setPageContext(_jspx_page_context);
    _jspx_th_t_base_0.setParent(null);
    _jspx_th_t_base_0.setType("jquery,easyui,tools");
    int _jspx_eval_t_base_0 = _jspx_th_t_base_0.doStartTag();
    if (_jspx_th_t_base_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_base_type_nobody.reuse(_jspx_th_t_base_0);
      return true;
    }
    _jspx_tagPool_t_base_type_nobody.reuse(_jspx_th_t_base_0);
    return false;
  }

  private boolean _jspx_meth_t_formvalid_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:formvalid
    org.jeecgframework.tag.core.easyui.FormValidationTag _jspx_th_t_formvalid_0 = (org.jeecgframework.tag.core.easyui.FormValidationTag) _jspx_tagPool_t_formvalid_usePlugin_layout_formid_dialog.get(org.jeecgframework.tag.core.easyui.FormValidationTag.class);
    _jspx_th_t_formvalid_0.setPageContext(_jspx_page_context);
    _jspx_th_t_formvalid_0.setParent(null);
    _jspx_th_t_formvalid_0.setFormid("formobj");
    _jspx_th_t_formvalid_0.setDialog(true);
    _jspx_th_t_formvalid_0.setUsePlugin("password");
    _jspx_th_t_formvalid_0.setLayout("table");
    int _jspx_eval_t_formvalid_0 = _jspx_th_t_formvalid_0.doStartTag();
    if (_jspx_eval_t_formvalid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t<table cellpadding=\"0\" cellspacing=\"1\" class=\"formtable\">\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\" style=\"font-size: 14px\">\n");
        out.write("\t\t\t\t\t\t\t  请求类型：\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td style=\"height: 40px;padding-left: 15px\">\n");
        out.write("\t\t\t\t\t\t<input name=\"requestMethod\"  class=\"form-control i-checks\" type=\"radio\" value=\"GET\" checked=\"checked\" >GET\n");
        out.write("\t\t\t\t\t\t<input name=\"requestMethod\"  class=\"form-control i-checks\" type=\"radio\" value=\"POST\"  >POST \n");
        out.write("\t\t\t\t\t\t&nbsp;&nbsp;<span><font color=\"gray\">默认GET请求方式</font></span> \n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\" style=\"font-size: 14px\">\n");
        out.write("\t\t\t\t\t\t\t 请求的URL：\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\" style=\"padding-left: 15px\">\n");
        out.write("\t\t\t\t\t\t<input type=\"text\" id=\"serverUrl\" placeholder=\"输入请求地址\" value=\"\"  style=\"width:600px;height: 40px\" datatype=\"url\">\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\" style=\"font-size: 14px\">\n");
        out.write("\t\t\t\t\t\t\t 请求参数：\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\" style=\"padding-left: 15px\">\n");
        out.write("\t\t\t\t\t\t  <input type=\"text\" id=\"requestBody\" placeholder=\"输入请求参数\" value=\"\" style=\"width:600px;height: 40px\" >\n");
        out.write("                           <span><font color=\"gray\">格式:  name1=value1&name2=value2, 如果是get请求请留空。</font></span>\n");
        out.write("\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\" style=\"font-size: 14px\">\n");
        out.write("\t\t\t\t\t\t\t返回结果:\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\" style=\"padding-left: 15px\">\n");
        out.write("\t\t\t\t\t\t <textarea id=\"json-field\" title=\"返回结果\" style=\"width:600px;height: 100px\"></textarea>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\" style=\"font-size: 14px\">\n");
        out.write("\t\t\t\t\t\t\t操作：\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\" style=\"padding-left: 15px\">\n");
        out.write("\t\t\t\t\t\t <button class=\"ace_button\" style=\"width: 10%;height:30px;font-size: 12px\" onclick=\"sendSever();\">确定</button>&nbsp;\n");
        out.write("\t\t\t\t \t\t <button class=\"ace_button\" style=\"width: 10%;height:30px;font-size: 12px\" onclick=\"gReload();\">重置</button>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t</table>\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_t_formvalid_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_formvalid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_formvalid_usePlugin_layout_formid_dialog.reuse(_jspx_th_t_formvalid_0);
      return true;
    }
    _jspx_tagPool_t_formvalid_usePlugin_layout_formid_dialog.reuse(_jspx_th_t_formvalid_0);
    return false;
  }
}
