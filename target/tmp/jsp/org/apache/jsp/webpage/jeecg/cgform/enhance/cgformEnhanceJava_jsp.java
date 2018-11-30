package org.apache.jsp.webpage.jeecg.cgform.enhance;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class cgformEnhanceJava_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_base_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_formvalid_usePlugin_layout_formid_dialog_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_mutiLang_langKey_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dictSelect_typeGroupCode_type_hasLabel_field_defaultVal_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_formvalid_usePlugin_layout_formid_dialog_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_mutiLang_langKey_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_hasLabel_field_defaultVal_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
    _jspx_tagPool_t_formvalid_usePlugin_layout_formid_dialog_action.release();
    _jspx_tagPool_t_mutiLang_langKey_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_hasLabel_field_defaultVal_nobody.release();
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
      out.write("<title>按钮JAVA增强</title>\n");
      if (_jspx_meth_t_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</head>\n");
      out.write("<body style=\"overflow-y: hidden\" scroll=\"no\">\n");
      if (_jspx_meth_t_formvalid_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</body>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write(" $('#buttonCode').change(function() {\n");
      out.write("\t changeDate();\n");
      out.write(" });\n");
      out.write(" $('input[type=radio][name=event]').change(function() {\n");
      out.write("\t changeDate();\n");
      out.write(" });\n");
      out.write(" \n");
      out.write(" function changeDate() {\n");
      out.write("\t var buttonCode =$('#buttonCode').val();\n");
      out.write("\t var formId =$('#formId').val();\n");
      out.write("\t var event = $('input[name=event]:checked').val();\n");
      out.write("\t $.ajax({\n");
      out.write("\t\t\tasync : false,\n");
      out.write("\t\t\tcache : false,\n");
      out.write("\t\t\ttype : 'POST',\n");
      out.write("\t\t\tcontentType : 'application/json', \n");
      out.write("\t\t\tdataType:\"json\",\n");
      out.write("\t\t\turl : \"cgformEnhanceJavaController.do?doCgformEnhanceJava&buttonCode=\"+buttonCode+\"&formId=\"+formId+\"&event=\"+event,// 请求的action路径\n");
      out.write("\t\t\terror : function() {// 请求失败处理函数\n");
      out.write("\t\t\t\talert('");
      if (_jspx_meth_t_mutiLang_9(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\t\tframeElement.api.close();\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\tvar d = data;\n");
      out.write("\t\t\t\tif (d.success) {\n");
      out.write("\t\t\t\t\tvar cgformEnhanceJavaEntity = d.obj;\n");
      out.write("\t\t\t\t\t$('#id').val(cgformEnhanceJavaEntity.id);\n");
      out.write("\t\t\t\t\t$(\"input[type=radio][value='\"+cgformEnhanceJavaEntity.cgJavaType+\"']\").attr(\"checked\",\"checked\");\n");
      out.write("\t\t\t\t\t$('#cgJavaValue').val(cgformEnhanceJavaEntity.cgJavaValue);\n");
      out.write("\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t$('#id').val(\"\");\n");
      out.write("\t\t\t\t\t$('#cgJavaType').val(\"\");\n");
      out.write("\t\t\t\t\t$('#cgJavaValue').val(\"\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write(" }\n");
      out.write("\n");
      out.write("</script>\n");
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

  private boolean _jspx_meth_t_base_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:base
    org.jeecgframework.tag.core.easyui.BaseTag _jspx_th_t_base_0 = (org.jeecgframework.tag.core.easyui.BaseTag) _jspx_tagPool_t_base_type_nobody.get(org.jeecgframework.tag.core.easyui.BaseTag.class);
    _jspx_th_t_base_0.setPageContext(_jspx_page_context);
    _jspx_th_t_base_0.setParent(null);
    _jspx_th_t_base_0.setType("jquery,easyui,tools,DatePicker");
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
    _jspx_th_t_formvalid_0.setAction("cgformEnhanceJavaController.do?save");
    int _jspx_eval_t_formvalid_0 = _jspx_th_t_formvalid_0.doStartTag();
    if (_jspx_eval_t_formvalid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t<input id=\"id\" name=\"id\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgformEnhanceJavaPage.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("\t<input id=\"formId\" name=\"formId\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgformEnhanceJavaPage.formId }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("\t<table cellpadding=\"0\" cellspacing=\"1\" class=\"formtable\">\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"center\" width=\"150px\"><label class=\"Validform_label\"> ");
        if (_jspx_meth_t_mutiLang_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(": </label></td>\n");
        out.write("\t\t\t<td class=\"value\"><select id=\"buttonCode\" name=\"buttonCode\" datatype=\"*\" style=\"width: 200px;\" >\n");
        out.write("\t\t\t\t<option value=\"add\" ");
        if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(">add</option>\n");
        out.write("\t\t\t\t<option value=\"update\" ");
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(">update</option>\n");
        out.write("\t\t\t\t<option value=\"delete\" ");
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(">delete</option>\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t</select> <span class=\"Validform_checktip\"></span></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"center\" width=\"150px\"><label class=\"Validform_label\"> ");
        if (_jspx_meth_t_mutiLang_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(": </label></td>\n");
        out.write("\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t<input type=\"radio\" name=\"event\" value=\"start\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty cgformEnhanceJavaPage.event or cgformEnhanceJavaPage.event eq 'start' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" />");
        if (_jspx_meth_t_mutiLang_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t<input type=\"radio\" name=\"event\" value=\"end\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty cgformEnhanceJavaPage.event or cgformEnhanceJavaPage.event eq 'end' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" />");
        if (_jspx_meth_t_mutiLang_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"center\" width=\"150px\"><label class=\"Validform_label\"> ");
        if (_jspx_meth_t_mutiLang_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(": </label></td>\n");
        out.write("\t\t\t<td class=\"value\">");
        if (_jspx_meth_t_dictSelect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("<span class=\"Validform_checktip\"></span></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"center\" width=\"150px\"><label class=\"Validform_label\"> ");
        if (_jspx_meth_t_mutiLang_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(": </label></td>\n");
        out.write("\t\t\t<!--update-end--Author:luobaoli  Date:20150701 for：取消非空校验-->\n");
        out.write("\t\t\t<td class=\"value\"><input id=\"cgJavaValue\" name=\"cgJavaValue\" type=\"text\" style=\"width: 300px;height: 26px\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgformEnhanceJavaPage.cgJavaValue}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/><span class=\"Validform_checktip\"></span></td>\n");
        out.write("\t\t\t<!--update-end--Author:luobaoli  Date:20150701 for：取消非空校验-->\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"center\" width=\"150px\"><label class=\"Validform_label\"> ");
        if (_jspx_meth_t_mutiLang_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(": </label></td>\n");
        out.write("\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t<input type=\"radio\" name=\"activeStatus\" value=\"0\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgformEnhanceJavaPage.activeStatus eq 0 ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" />");
        if (_jspx_meth_t_mutiLang_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t<input type=\"radio\" name=\"activeStatus\" value=\"1\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty cgformEnhanceJavaPage.activeStatus or cgformEnhanceJavaPage.activeStatus eq '1' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" />");
        if (_jspx_meth_t_mutiLang_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t</table>\n");
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

  private boolean _jspx_meth_t_mutiLang_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_0 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_0.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_0.setLangKey("operate.code");
    int _jspx_eval_t_mutiLang_0 = _jspx_th_t_mutiLang_0.doStartTag();
    if (_jspx_th_t_mutiLang_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_0);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgformEnhanceJavaPage.buttonCode=='add'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected=\"selected\"");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgformEnhanceJavaPage.buttonCode=='update'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected=\"selected\"");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgformEnhanceJavaPage.buttonCode=='delete'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected=\"selected\"");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${buttonList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("button");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${button.buttonCode }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${button.buttonCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${button.buttonCode==cgformEnhanceJavaPage.buttonCode}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected=\"selected\"");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
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
    _jspx_th_t_mutiLang_1.setLangKey("common.event");
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
    _jspx_th_t_mutiLang_2.setLangKey("common.begin");
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
    _jspx_th_t_mutiLang_3.setLangKey("common.end");
    int _jspx_eval_t_mutiLang_3 = _jspx_th_t_mutiLang_3.doStartTag();
    if (_jspx_th_t_mutiLang_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_3);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_3);
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
    _jspx_th_t_mutiLang_4.setLangKey("common.type");
    int _jspx_eval_t_mutiLang_4 = _jspx_th_t_mutiLang_4.doStartTag();
    if (_jspx_th_t_mutiLang_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_4);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_4);
    return false;
  }

  private boolean _jspx_meth_t_dictSelect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_0 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_typeGroupCode_type_hasLabel_field_defaultVal_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_0.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_dictSelect_0.setField("cgJavaType");
    _jspx_th_t_dictSelect_0.setType("radio");
    _jspx_th_t_dictSelect_0.setTypeGroupCode("enhanceType");
    _jspx_th_t_dictSelect_0.setHasLabel(false);
    _jspx_th_t_dictSelect_0.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgformEnhanceJavaPage.cgJavaType==null?'spring':(cgformEnhanceJavaPage.cgJavaType)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_t_dictSelect_0 = _jspx_th_t_dictSelect_0.doStartTag();
    if (_jspx_th_t_dictSelect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_typeGroupCode_type_hasLabel_field_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_0);
      return true;
    }
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_hasLabel_field_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_0);
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
    _jspx_th_t_mutiLang_5.setLangKey("common.value");
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
    _jspx_th_t_mutiLang_6.setLangKey("common.iseffect");
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
    _jspx_th_t_mutiLang_7.setLangKey("common.disable");
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
    _jspx_th_t_mutiLang_8.setLangKey("common.enable");
    int _jspx_eval_t_mutiLang_8 = _jspx_th_t_mutiLang_8.doStartTag();
    if (_jspx_th_t_mutiLang_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_8);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_8);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_9 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_9.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_9.setParent(null);
    _jspx_th_t_mutiLang_9.setLangKey("get.error");
    int _jspx_eval_t_mutiLang_9 = _jspx_th_t_mutiLang_9.doStartTag();
    if (_jspx_th_t_mutiLang_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_9);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_9);
    return false;
  }
}
