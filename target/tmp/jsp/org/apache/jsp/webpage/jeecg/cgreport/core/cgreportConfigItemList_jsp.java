package org.apache.jsp.webpage.jeecg.cgreport.core;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cgreportConfigItemList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_mutiLang_langKey_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_divClass_defaultVal_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_mutiLang_langKey_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_divClass_defaultVal_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_mutiLang_langKey_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.release();
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_divClass_defaultVal_nobody.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$('#addCgreportConfigItemBtn').linkbutton({   \n");
      out.write("\t    iconCls: 'icon-add'  \n");
      out.write("\t});  \n");
      out.write("\t$('#delCgreportConfigItemBtn').linkbutton({   \n");
      out.write("\t    iconCls: 'icon-remove'  \n");
      out.write("\t}); \n");
      out.write("\t$('#addCgreportConfigItemBtn').bind('click', function(){   \n");
      out.write(" \t\t var tr =  $(\"#add_cgreportConfigItem_table_template tr\").clone();\n");
      out.write("\t \t $(\"#add_cgreportConfigItem_table\").append(tr);\n");
      out.write("\t \t resetTrNum('add_cgreportConfigItem_table');\n");
      out.write("    });  \n");
      out.write("\t$('#delCgreportConfigItemBtn').bind('click', function(){   \n");
      out.write("      \t$(\"#add_cgreportConfigItem_table\").find(\"input:checked\").parent().parent().remove();   \n");
      out.write("        resetTrNum('add_cgreportConfigItem_table'); \n");
      out.write("    }); \n");
      out.write("    $(document).ready(function(){\n");
      out.write("    \t$(\".datagrid-toolbar\").parent().css(\"width\",\"auto\");\n");
      out.write("    \tif(location.href.indexOf(\"load=detail\")!=-1){\n");
      out.write("\t\t\t$(\":input\").attr(\"disabled\",\"true\");\n");
      out.write("\t\t\t$(\".datagrid-toolbar\").hide();\n");
      out.write("\t\t}\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<div style=\"padding: 3px; height: 25px; width: auto;\" class=\"datagrid-toolbar\"><a id=\"addCgreportConfigItemBtn\" href=\"javascript:void(0);\">添加</a> <a id=\"delCgreportConfigItemBtn\" href=\"javascript:void(0);\">删除</a></div>\n");
      out.write("<div style=\"width: auto; height: 300px; overflow-y: auto; overflow-x: scroll;\">\n");
      out.write("<table border=\"0\" cellpadding=\"2\" cellspacing=\"0\" id=\"cgreportConfigItem_table\">\n");
      out.write("\t<tr bgcolor=\"#E6E6E6\">\n");
      out.write("\t\t<td align=\"center\" bgcolor=\"#EEEEEE\"><label class=\"Validform_label\">");
      if (_jspx_meth_t_mutiLang_0(_jspx_page_context))
        return;
      out.write("</label></td>\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\"><label class=\"Validform_label\"> ");
      if (_jspx_meth_t_mutiLang_1(_jspx_page_context))
        return;
      out.write(" </label></td>\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\"><label class=\"Validform_label\"> ");
      if (_jspx_meth_t_mutiLang_2(_jspx_page_context))
        return;
      out.write(" </label></td>\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\"><label class=\"Validform_label\"> ");
      if (_jspx_meth_t_mutiLang_3(_jspx_page_context))
        return;
      out.write(" </label></td>\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\"><label class=\"Validform_label\"> ");
      if (_jspx_meth_t_mutiLang_4(_jspx_page_context))
        return;
      out.write(" </label></td>\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\"><label class=\"Validform_label\"> ");
      if (_jspx_meth_t_mutiLang_5(_jspx_page_context))
        return;
      out.write("  </label></td>\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\"><label class=\"Validform_label\">  ");
      if (_jspx_meth_t_mutiLang_6(_jspx_page_context))
        return;
      out.write("  </label></td>\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\"><label class=\"Validform_label\">  ");
      if (_jspx_meth_t_mutiLang_7(_jspx_page_context))
        return;
      out.write("  </label></td>\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\"><label class=\"Validform_label\"> 取值表达式 </label></td>\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\"><label class=\"Validform_label\">  ");
      if (_jspx_meth_t_mutiLang_8(_jspx_page_context))
        return;
      out.write("  </label></td>\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\"><label class=\"Validform_label\">  ");
      if (_jspx_meth_t_mutiLang_9(_jspx_page_context))
        return;
      out.write("  </label></td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tbody id=\"add_cgreportConfigItem_table\">\n");
      out.write("\t\t");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t</tbody>\n");
      out.write("</table>\n");
      out.write("</div>");
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
    _jspx_th_t_mutiLang_0.setLangKey("common.code");
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
    _jspx_th_t_mutiLang_1.setLangKey("common.name");
    int _jspx_eval_t_mutiLang_1 = _jspx_th_t_mutiLang_1.doStartTag();
    if (_jspx_th_t_mutiLang_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_1);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_1);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_2 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_2.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_2.setParent(null);
    _jspx_th_t_mutiLang_2.setLangKey("common.order");
    int _jspx_eval_t_mutiLang_2 = _jspx_th_t_mutiLang_2.doStartTag();
    if (_jspx_th_t_mutiLang_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_2);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_2);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_3 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_3.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_3.setParent(null);
    _jspx_th_t_mutiLang_3.setLangKey("common.text");
    int _jspx_eval_t_mutiLang_3 = _jspx_th_t_mutiLang_3.doStartTag();
    if (_jspx_th_t_mutiLang_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_3);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_3);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_4 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_4.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_4.setParent(null);
    _jspx_th_t_mutiLang_4.setLangKey("common.type");
    int _jspx_eval_t_mutiLang_4 = _jspx_th_t_mutiLang_4.doStartTag();
    if (_jspx_th_t_mutiLang_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_4);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_4);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_5 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_5.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_5.setParent(null);
    _jspx_th_t_mutiLang_5.setLangKey("common.isshow");
    int _jspx_eval_t_mutiLang_5 = _jspx_th_t_mutiLang_5.doStartTag();
    if (_jspx_th_t_mutiLang_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_5);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_5);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_6 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_6.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_6.setParent(null);
    _jspx_th_t_mutiLang_6.setLangKey("common.href");
    int _jspx_eval_t_mutiLang_6 = _jspx_th_t_mutiLang_6.doStartTag();
    if (_jspx_th_t_mutiLang_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_6);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_6);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_7 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_7.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_7.setParent(null);
    _jspx_th_t_mutiLang_7.setLangKey("common.query.module");
    int _jspx_eval_t_mutiLang_7 = _jspx_th_t_mutiLang_7.doStartTag();
    if (_jspx_th_t_mutiLang_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_7);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_7);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_8 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_8.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_8.setParent(null);
    _jspx_th_t_mutiLang_8.setLangKey("dict.code");
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
    _jspx_th_t_mutiLang_9.setLangKey("common.isquery");
    int _jspx_eval_t_mutiLang_9 = _jspx_th_t_mutiLang_9.doStartTag();
    if (_jspx_th_t_mutiLang_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_9);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_9);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:length(cgreportConfigItemList)  <= 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t<tr>\n");
        out.write("\t\t\t\t<td align=\"center\"><input style=\"width: 20px;\" type=\"checkbox\" name=\"ck\" />\n");
        out.write("\t\t\t\t<input name=\"cgreportConfigItemList[0].id\" type=\"hidden\" />\n");
        out.write("\t\t\t\t<input name=\"cgreportConfigItemList[0].cgrheadId\" type=\"hidden\" />\n");
        out.write("\t\t\t\t</td>\n");
        out.write("\t\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[0].fieldName\" maxlength=\"36\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\"></td>\n");
        out.write("\t\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[0].orderNum\" maxlength=\"3\" type=\"text\" class=\"inputxt\" style=\"width: 30px;\"></td>\n");
        out.write("\t\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[0].fieldTxt\" maxlength=\"1000\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\"></td>\n");
        out.write("\t\t\t\t<td align=\"left\">");
        if (_jspx_meth_t_dictSelect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t<td align=\"left\"><select name=\"cgreportConfigItemList[0].isShow\" style=\"width: 60px;\">\n");
        out.write("\t\t\t\t\t<option value=\"Y\"> ");
        if (_jspx_meth_t_mutiLang_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</option>\n");
        out.write("\t\t\t\t\t<option value=\"N\"> ");
        if (_jspx_meth_t_mutiLang_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</option>\n");
        out.write("\t\t\t\t</select></td>\n");
        out.write("\t\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[0].fieldHref\" maxlength=\"100\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\"></td>\n");
        out.write("\t\t\t\t<td align=\"left\">");
        if (_jspx_meth_t_dictSelect_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[0].replaceVa\" maxlength=\"36\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\"></td>\n");
        out.write("\t\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[0].dictCode\" maxlength=\"36\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\"></td>\n");
        out.write("\t\t\t\t<td align=\"left\">");
        if (_jspx_meth_t_dictSelect_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t\t</tr>\n");
        out.write("\t\t");
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

  private boolean _jspx_meth_t_dictSelect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_0 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_0.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_t_dictSelect_0.setField("cgreportConfigItemList[0].fieldType");
    _jspx_th_t_dictSelect_0.setExtendJson("{style:'width:80px'}");
    _jspx_th_t_dictSelect_0.setType("list");
    _jspx_th_t_dictSelect_0.setTypeGroupCode("fieldtype");
    _jspx_th_t_dictSelect_0.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgreportConfigItemPage.fieldType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_t_dictSelect_0.setHasLabel(false);
    _jspx_th_t_dictSelect_0.setTitle("common.text.type");
    int _jspx_eval_t_dictSelect_0 = _jspx_th_t_dictSelect_0.doStartTag();
    if (_jspx_th_t_dictSelect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_0);
      return true;
    }
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_0);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_10 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_10.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_t_mutiLang_10.setLangKey("common.show");
    int _jspx_eval_t_mutiLang_10 = _jspx_th_t_mutiLang_10.doStartTag();
    if (_jspx_th_t_mutiLang_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_10);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_10);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_11 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_11.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_t_mutiLang_11.setLangKey("common.hide");
    int _jspx_eval_t_mutiLang_11 = _jspx_th_t_mutiLang_11.doStartTag();
    if (_jspx_th_t_mutiLang_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_11);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_11);
    return false;
  }

  private boolean _jspx_meth_t_dictSelect_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_1 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_1.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_t_dictSelect_1.setField("cgreportConfigItemList[0].SMode");
    _jspx_th_t_dictSelect_1.setType("list");
    _jspx_th_t_dictSelect_1.setExtendJson("{style:'width:90px'}");
    _jspx_th_t_dictSelect_1.setTypeGroupCode("searchmode");
    _jspx_th_t_dictSelect_1.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgreportConfigItemPage.sMode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_t_dictSelect_1.setHasLabel(false);
    _jspx_th_t_dictSelect_1.setTitle("common.query.module");
    int _jspx_eval_t_dictSelect_1 = _jspx_th_t_dictSelect_1.doStartTag();
    if (_jspx_th_t_dictSelect_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_1);
      return true;
    }
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_1);
    return false;
  }

  private boolean _jspx_meth_t_dictSelect_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_2 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_divClass_defaultVal_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_2.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_t_dictSelect_2.setField("cgreportConfigItemList[0].SFlag");
    _jspx_th_t_dictSelect_2.setExtendJson("{style:'width:90px'}");
    _jspx_th_t_dictSelect_2.setDivClass("STYLE_LEG");
    _jspx_th_t_dictSelect_2.setType("list");
    _jspx_th_t_dictSelect_2.setTypeGroupCode("yesorno");
    _jspx_th_t_dictSelect_2.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgreportConfigItemPage.sFlag}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_t_dictSelect_2.setHasLabel(false);
    _jspx_th_t_dictSelect_2.setTitle("common.isquery");
    int _jspx_eval_t_dictSelect_2 = _jspx_th_t_dictSelect_2.doStartTag();
    if (_jspx_th_t_dictSelect_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_divClass_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_2);
      return true;
    }
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_divClass_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_2);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:length(cgreportConfigItemList)  > 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t");
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

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgreportConfigItemList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("poVal");
    _jspx_th_c_forEach_0.setVarStatus("stuts");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td align=\"center\"><input style=\"width: 20px;\" type=\"checkbox\" name=\"ck\" />\n");
          out.write("\t\t\t\t\t<input name=\"cgreportConfigItemList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].id\" type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${poVal.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />\n");
          out.write("\t\t\t\t\t<input name=\"cgreportConfigItemList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].cgrheadId\" type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${poVal.cgrheadId }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].fieldName\" maxlength=\"36\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${poVal.fieldName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></td>\n");
          out.write("\t\t\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].orderNum\" maxlength=\"10\" type=\"text\" class=\"inputxt\" style=\"width: 30px;\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${poVal.orderNum }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></td>\n");
          out.write("\t\t\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].fieldTxt\" maxlength=\"1000\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${poVal.fieldTxt }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></td>\n");
          out.write("\t\t\t\t\t<td align=\"left\">");
          if (_jspx_meth_t_dictSelect_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t<td align=\"left\"><select id=\"isShow\" name=\"cgreportConfigItemList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stuts.index}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].isShow\"  style=\"width: 60px;\">\n");
          out.write("\t\t\t\t\t\t<option value=\"N\" ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write('>');
          if (_jspx_meth_t_mutiLang_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</option>\n");
          out.write("\t\t\t\t\t\t<option value=\"Y\" ");
          if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write('>');
          if (_jspx_meth_t_mutiLang_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</option>\n");
          out.write("\t\t\t\t\t</select></td>\n");
          out.write("\t\t\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].fieldHref\" maxlength=\"120\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${poVal.fieldHref}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></td>\n");
          out.write("\t\t\t\t\t<td align=\"left\">");
          if (_jspx_meth_t_dictSelect_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("\t\t\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].replaceVa\" maxlength=\"36\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${poVal.replaceVa }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></td>\n");
          out.write("\t\t\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].dictCode\" maxlength=\"36\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${poVal.dictCode }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></td>\n");
          out.write("\t\t\t\t\t<td align=\"left\">");
          if (_jspx_meth_t_dictSelect_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t");
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
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_t_dictSelect_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_3 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_3.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_t_dictSelect_3.setField((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("cgreportConfigItemList[${stuts.index }].fieldType", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_t_dictSelect_3.setType("list");
    _jspx_th_t_dictSelect_3.setExtendJson("{style:'width:80px'}");
    _jspx_th_t_dictSelect_3.setTypeGroupCode("fieldtype");
    _jspx_th_t_dictSelect_3.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${poVal.fieldType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_t_dictSelect_3.setHasLabel(false);
    _jspx_th_t_dictSelect_3.setTitle("common.text.type");
    int _jspx_eval_t_dictSelect_3 = _jspx_th_t_dictSelect_3.doStartTag();
    if (_jspx_th_t_dictSelect_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_3);
      return true;
    }
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_3);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${poVal.isShow eq 'N'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected=\"selected\"");
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

  private boolean _jspx_meth_t_mutiLang_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_12 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_12.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_t_mutiLang_12.setLangKey("common.hide");
    int _jspx_eval_t_mutiLang_12 = _jspx_th_t_mutiLang_12.doStartTag();
    if (_jspx_th_t_mutiLang_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_12);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_12);
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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${poVal.isShow eq 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected=\"selected\"");
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

  private boolean _jspx_meth_t_mutiLang_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_13 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_13.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_t_mutiLang_13.setLangKey("common.show");
    int _jspx_eval_t_mutiLang_13 = _jspx_th_t_mutiLang_13.doStartTag();
    if (_jspx_th_t_mutiLang_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_13);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_13);
    return false;
  }

  private boolean _jspx_meth_t_dictSelect_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_4 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_4.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_t_dictSelect_4.setField((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("cgreportConfigItemList[${stuts.index }].SMode", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_t_dictSelect_4.setExtendJson("{style:'width:90px'}");
    _jspx_th_t_dictSelect_4.setType("list");
    _jspx_th_t_dictSelect_4.setTypeGroupCode("searchmode");
    _jspx_th_t_dictSelect_4.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${poVal.SMode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_t_dictSelect_4.setHasLabel(false);
    _jspx_th_t_dictSelect_4.setTitle("common.query.module");
    int _jspx_eval_t_dictSelect_4 = _jspx_th_t_dictSelect_4.doStartTag();
    if (_jspx_th_t_dictSelect_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_4);
      return true;
    }
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_4);
    return false;
  }

  private boolean _jspx_meth_t_dictSelect_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_5 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_5.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_t_dictSelect_5.setField((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("cgreportConfigItemList[${stuts.index }].SFlag", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_t_dictSelect_5.setExtendJson("{style:'width:90px'}");
    _jspx_th_t_dictSelect_5.setType("list");
    _jspx_th_t_dictSelect_5.setTypeGroupCode("yesorno");
    _jspx_th_t_dictSelect_5.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${poVal.SFlag}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_t_dictSelect_5.setHasLabel(false);
    _jspx_th_t_dictSelect_5.setTitle("common.isquery");
    int _jspx_eval_t_dictSelect_5 = _jspx_th_t_dictSelect_5.doStartTag();
    if (_jspx_th_t_dictSelect_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_5);
      return true;
    }
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_5);
    return false;
  }
}
