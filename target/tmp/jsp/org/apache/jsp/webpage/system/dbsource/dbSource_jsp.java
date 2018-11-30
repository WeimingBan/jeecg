package org.apache.jsp.webpage.system.dbsource;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class dbSource_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_mutiLang_langKey_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_base_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_formvalid_usePlugin_layout_formid_dialog_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dictSelect_typeGroupCode_id_hasLabel_field_defaultVal_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_mutiLang_langKey_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_formvalid_usePlugin_layout_formid_dialog_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dictSelect_typeGroupCode_id_hasLabel_field_defaultVal_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_mutiLang_langKey_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
    _jspx_tagPool_t_formvalid_usePlugin_layout_formid_dialog_action.release();
    _jspx_tagPool_t_dictSelect_typeGroupCode_id_hasLabel_field_defaultVal_nobody.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>");
      if (_jspx_meth_t_mutiLang_0(_jspx_page_context))
        return;
      out.write("</title>\n");
      out.write("\t");
      if (_jspx_meth_t_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\t\tvar sourceType = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dbSourcePage.dbType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\n");
      out.write("\t\tvar sourceURL = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dbSourcePage.url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\n");
      out.write("\t\t$(function(){\n");
      out.write("\t\t\t$('#dbType').change(function(){\n");
      out.write("\t\t\t\tvar dbType = $(\"#dbType\").val();\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\ttype: \"POST\",\n");
      out.write("\t\t\t\t\turl: \"dynamicDataSourceController.do?getDynamicDataSourceParameter\",\n");
      out.write("\t\t\t\t\tdata: \"dbType=\" + dbType,\n");
      out.write("\t\t\t\t\tsuccess: function(msg){\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t$('#driverClass').val(jQuery.parseJSON(msg).obj.driverClass);\n");
      out.write("\n");
      out.write("\t\t\t\t\t\tif(dbType != sourceType){\n");
      out.write("\t\t\t\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\t\t\t\ttype: \"POST\",\n");
      out.write("\t\t\t\t\t\t\t\turl: \"dynamicDataSourceController.do?getDynamicDataSourceParameter\",\n");
      out.write("\t\t\t\t\t\t\t\tdata: \"dbType=\" + dbType,\n");
      out.write("\t\t\t\t\t\t\t\tsuccess: function(msg){\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#url').val(jQuery.parseJSON(msg).obj.url);\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t\t$('#url').val(sourceURL);\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write(" <body style=\"overflow-y: hidden\" scroll=\"no\">\n");
      out.write("\t");
      if (_jspx_meth_t_formvalid_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t$(function(){\n");
      out.write("\n");
      out.write("\t\t\t\tvar formobj=$(\"#formobj\").Validform();\n");
      out.write("\t\t\t\t$('#dbtest').click(function(){//点击测试\n");
      out.write("\t\t\t\t\tformobj.config({\n");
      out.write("\t\t\t\t\t    //url:\"dynamicDataSourceController.do?testConnection\",\n");
      out.write("\t\t\t\t\t    ajaxpost:{\n");
      out.write("\t\t\t\t\t        //可以传入$.ajax()能使用的，除dataType外的所有参数;\n");
      out.write("\t\t\t\t\t    \tsuccess:function(data,object){\n");
      out.write("\t\t\t\t\t            //data是返回的json数据;\n");
      out.write("\t\t\t\t\t            //obj是当前表单的jquery对象;\n");
      out.write("\t\t\t\t\t            //alert(data.obj.msg);\n");
      out.write("\t\t\t\t\t            $(\"#dbmsg\").html(\"<font color='red'>\"+data.obj.msg+\"</font>\");\n");
      out.write("\t\t\t\t\t            formobj.config({\n");
      out.write("\t\t\t\t\t            \tajaxpost:{url:\"dynamicDataSourceController.do?save\"}\n");
      out.write("\t\t\t\t\t            });\n");
      out.write("\t\t\t\t\t        }\n");
      out.write("\t\t\t\t\t    }\n");
      out.write("\t\t\t\t\t}); \n");
      out.write("\t\t\t\t\tformobj.ajaxPost(false,false,\"dynamicDataSourceController.do?testConnection\");\n");
      out.write("\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t});\n");
      out.write("\t\t</script>\n");
      out.write(" </body>");
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

  private boolean _jspx_meth_t_mutiLang_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_0 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_0.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_0.setParent(null);
    _jspx_th_t_mutiLang_0.setLangKey("common.datasource.manage");
    int _jspx_eval_t_mutiLang_0 = _jspx_th_t_mutiLang_0.doStartTag();
    if (_jspx_th_t_mutiLang_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_0);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_0);
    return false;
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
    org.jeecgframework.tag.core.easyui.FormValidationTag _jspx_th_t_formvalid_0 = (org.jeecgframework.tag.core.easyui.FormValidationTag) _jspx_tagPool_t_formvalid_usePlugin_layout_formid_dialog_action.get(org.jeecgframework.tag.core.easyui.FormValidationTag.class);
    _jspx_th_t_formvalid_0.setPageContext(_jspx_page_context);
    _jspx_th_t_formvalid_0.setParent(null);
    _jspx_th_t_formvalid_0.setFormid("formobj");
    _jspx_th_t_formvalid_0.setDialog(true);
    _jspx_th_t_formvalid_0.setUsePlugin("password");
    _jspx_th_t_formvalid_0.setLayout("table");
    _jspx_th_t_formvalid_0.setAction("dynamicDataSourceController.do?save");
    int _jspx_eval_t_formvalid_0 = _jspx_th_t_formvalid_0.doStartTag();
    if (_jspx_eval_t_formvalid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t<input id=\"id\" name=\"id\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dbSourcePage.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("\t\t\t<table style=\"width: 600px;\" cellpadding=\"0\" cellspacing=\"1\" class=\"formtable\">\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_t_mutiLang_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(":\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t<input class=\"inputxt\" id=\"dbKey\" name=\"dbKey\"\n");
        out.write("\t\t\t\t\t\t\t   value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dbSourcePage.dbKey}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" datatype=\"*\">\n");
        out.write("\t\t\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_t_mutiLang_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(":\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t<input class=\"inputxt\" id=\"description\" name=\"description\"\n");
        out.write("\t\t\t\t\t\t\t   value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dbSourcePage.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" datatype=\"*\">\n");
        out.write("\t\t\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_t_mutiLang_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(":\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_t_dictSelect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_t_mutiLang_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(":\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t<textarea id=\"driverClass\" name=\"driverClass\" rows=\"2\" cols=\"50\" datatype=\"*\" readonly=\"readonly\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dbSourcePage.driverClass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</textarea>\n");
        out.write("\t\t\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_t_mutiLang_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(":\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t<textarea id=\"url\" name=\"url\" rows=\"3\" cols=\"50\" datatype=\"*\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dbSourcePage.url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</textarea>\n");
        out.write("\t\t\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_t_mutiLang_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(":\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t<input class=\"inputxt\" id=\"dbName\" name=\"dbName\"\n");
        out.write("\t\t\t\t\t\t\t   value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dbSourcePage.dbName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" datatype=\"*\">\n");
        out.write("\t\t\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_t_mutiLang_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(":\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t<input class=\"inputxt\" id=\"dbUser\" name=\"dbUser\"\n");
        out.write("\t\t\t\t\t\t\t   value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dbSourcePage.dbUser}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" datatype=\"*\">\n");
        out.write("\t\t\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_t_mutiLang_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(":\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t<input type=\"password\" class=\"inputxt\" id=\"dbPassword\" name=\"dbPassword\" ignore=\"ignore\"\n");
        out.write("\t\t\t\t\t\t\t   value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${showDbPassword}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("\t\t\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t\t\t<a href=\"#\"  id=\"dbtest\" >\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">[ 测试  ]</label>\n");
        out.write("\t\t\t\t\t\t</a>\n");
        out.write("\t\t\t\t\t\t<span class=\"Validform_checktip\"  id=\"dbmsg\"></span>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t</table>\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_t_formvalid_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_formvalid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_formvalid_usePlugin_layout_formid_dialog_action.reuse(_jspx_th_t_formvalid_0);
      return true;
    }
    _jspx_tagPool_t_formvalid_usePlugin_layout_formid_dialog_action.reuse(_jspx_th_t_formvalid_0);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_1 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_1.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_1.setLangKey("common.dbtype");
    int _jspx_eval_t_mutiLang_1 = _jspx_th_t_mutiLang_1.doStartTag();
    if (_jspx_th_t_mutiLang_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_1);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_1);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_2 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_2.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_2.setLangKey("common.description");
    int _jspx_eval_t_mutiLang_2 = _jspx_th_t_mutiLang_2.doStartTag();
    if (_jspx_th_t_mutiLang_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_2);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_2);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_3(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_3 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_3.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_3.setLangKey("common.dbtype");
    int _jspx_eval_t_mutiLang_3 = _jspx_th_t_mutiLang_3.doStartTag();
    if (_jspx_th_t_mutiLang_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_3);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_3);
    return false;
  }

  private boolean _jspx_meth_t_dictSelect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_0 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_typeGroupCode_id_hasLabel_field_defaultVal_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_0.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_dictSelect_0.setId("dbType");
    _jspx_th_t_dictSelect_0.setField("dbType");
    _jspx_th_t_dictSelect_0.setTypeGroupCode("dbtype");
    _jspx_th_t_dictSelect_0.setHasLabel(false);
    _jspx_th_t_dictSelect_0.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dbSourcePage.dbType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_t_dictSelect_0 = _jspx_th_t_dictSelect_0.doStartTag();
    if (_jspx_th_t_dictSelect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_typeGroupCode_id_hasLabel_field_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_0);
      return true;
    }
    _jspx_tagPool_t_dictSelect_typeGroupCode_id_hasLabel_field_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_0);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_4(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_4 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_4.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_4.setLangKey("common.driverclass");
    int _jspx_eval_t_mutiLang_4 = _jspx_th_t_mutiLang_4.doStartTag();
    if (_jspx_th_t_mutiLang_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_4);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_4);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_5(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_5 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_5.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_5.setLangKey("common.datasrouce.url");
    int _jspx_eval_t_mutiLang_5 = _jspx_th_t_mutiLang_5.doStartTag();
    if (_jspx_th_t_mutiLang_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_5);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_5);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_6(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_6 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_6.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_6.setLangKey("common.dbname");
    int _jspx_eval_t_mutiLang_6 = _jspx_th_t_mutiLang_6.doStartTag();
    if (_jspx_th_t_mutiLang_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_6);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_6);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_7(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_7 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_7.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_7.setLangKey("common.dbuser");
    int _jspx_eval_t_mutiLang_7 = _jspx_th_t_mutiLang_7.doStartTag();
    if (_jspx_th_t_mutiLang_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_7);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_7);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_8(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_8 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_8.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_8.setLangKey("common.dbpassword");
    int _jspx_eval_t_mutiLang_8 = _jspx_th_t_mutiLang_8.doStartTag();
    if (_jspx_th_t_mutiLang_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_8);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_8);
    return false;
  }
}
