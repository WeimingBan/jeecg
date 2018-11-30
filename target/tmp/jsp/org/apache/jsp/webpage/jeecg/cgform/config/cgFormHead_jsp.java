package org.apache.jsp.webpage.jeecg.cgform.config;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import org.jeecgframework.web.cgform.common.CgAutoListConstant;

public final class cgFormHead_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_formvalid_usePlugin_tiptype_layout_formid_dialog_beforeSubmit_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_mutiLang_langKey_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_formvalid_usePlugin_tiptype_layout_formid_dialog_beforeSubmit_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_mutiLang_langKey_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
    _jspx_tagPool_t_formvalid_usePlugin_tiptype_layout_formid_dialog_beforeSubmit_action.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_items.release();
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

String lang = (String)request.getSession().getAttribute("lang");
String langurl = basePath + "/plug-in/mutiLang/" + lang +".js";

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>");
      if (_jspx_meth_t_mutiLang_0(_jspx_page_context))
        return;
      out.write("</title>\n");
      out.write("<script src=");
      out.print(langurl);
      out.write(" type=\"text/javascript\"></script>\n");
      if (_jspx_meth_t_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/cgform/js/cgformField.js\"></script>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".table-list {\n");
      out.write("\tmargin: 0;\n");
      out.write("\twidth: auto;\n");
      out.write("\tmargin-left: 0px;\n");
      out.write("\tmargin-right: 0px;\n");
      out.write("\toverflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".table-list td,.table-list th {\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".t_table {\n");
      out.write("\toverflow: auto; /*让内容表格外面的div自动有滚动条*/\n");
      out.write("\tmargin-left: 0px;\n");
      out.write("\tmargin-right: 0px;\n");
      out.write("\twidth: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#tab_div_database tr {\n");
      out.write("\tborder-bottom: 1px solid #e6e6e6;\n");
      out.write("\tcursor: n-resize;\n");
      out.write("}\n");
      out.write("/*update-end--Author:liuht  Date:20131207 for[333]：OL模块，增加一个特效 调整字段顺序（上下挪动）*/\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body style=\"overflow-y: hidden; overflow-x: hidden;\" scroll=\"no\">\n");
      out.write("<!-- 增加beforeSubmit页面逻辑删除-->\n");
      //  t:formvalid
      org.jeecgframework.tag.core.easyui.FormValidationTag _jspx_th_t_formvalid_0 = (org.jeecgframework.tag.core.easyui.FormValidationTag) _jspx_tagPool_t_formvalid_usePlugin_tiptype_layout_formid_dialog_beforeSubmit_action.get(org.jeecgframework.tag.core.easyui.FormValidationTag.class);
      _jspx_th_t_formvalid_0.setPageContext(_jspx_page_context);
      _jspx_th_t_formvalid_0.setParent(null);
      _jspx_th_t_formvalid_0.setFormid("formobj");
      _jspx_th_t_formvalid_0.setDialog(true);
      _jspx_th_t_formvalid_0.setUsePlugin("password");
      _jspx_th_t_formvalid_0.setBeforeSubmit("beforeSub();");
      _jspx_th_t_formvalid_0.setLayout("table");
      _jspx_th_t_formvalid_0.setTiptype("1");
      _jspx_th_t_formvalid_0.setAction("cgFormHeadController.do?save");
      int _jspx_eval_t_formvalid_0 = _jspx_th_t_formvalid_0.doStartTag();
      if (_jspx_eval_t_formvalid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t<!-- tiptype=\"1\" -->\n");
          out.write("\t<input id=\"id\" name=\"id\" type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("\t<input id=\"langurl\" name=\"langurl\" type=\"hidden\" value=\"");
          out.print(langurl);
          out.write("\">\n");
          out.write("\t<!-- add-start--Author:gengjiajia  Date:20160804 for：添加表类型隐藏域-->\n");
          out.write("\t<input id=\"tableType\" name=\"tableType\" type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.tableType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("\t<!-- add-start--Author:gengjiajia  Date:20160804 for：添加表类型隐藏域-->\n");
          out.write("\t<table cellpadding=\"0\" cellspacing=\"1\" class=\"formtable\">\n");
          out.write("\t\t<tr>\n");
          out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> ");
          if (_jspx_meth_t_mutiLang_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write(": </label></td>\n");
          out.write("\t\t\t<td class=\"value\">\n");
          out.write("\t\t\t  <input class=\"inputxt\" id=\"tableName\" name=\"tableName\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.tableName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("\t\t\t\tprefixName=\"\" ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write(" datatype=\"*\" validType=\"cgform_head,table_Name,id\" nullmsg=");
          if (_jspx_meth_t_mutiLang_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("> \n");
          out.write("\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
          out.write("\t\t\t</td>\n");
          out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> ");
          if (_jspx_meth_t_mutiLang_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write(": </label></td>\n");
          out.write("\t\t\t<td class=\"value\"><input class=\"inputxt\" id=\"content\" name=\"content\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" datatype=\"s2-100\" nullmsg=\"");
          if (_jspx_meth_t_mutiLang_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("\" /> <span class=\"Validform_checktip\"></span></td>\n");
          out.write("\t\t</tr>\n");
          out.write("\t\t<tr>\n");
          out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> ");
          if (_jspx_meth_t_mutiLang_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write(":</label></td>\n");
          out.write("\t\t\t<td class=\"value\" id=\"jformPkTypeTd\" ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write(">\n");
          out.write("\t\t\t\t<select id=\"jformPkType\" name=\"jformPkType\" onchange=\"jformPkTypeChange();\">\n");
          out.write("\t\t\t\t\t<option value=\"UUID\" ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write('>');
          if (_jspx_meth_t_mutiLang_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t\t\t<option value=\"NATIVE\" ");
          if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write('>');
          if (_jspx_meth_t_mutiLang_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t\t\t<option value=\"SEQUENCE\" ");
          if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write('>');
          if (_jspx_meth_t_mutiLang_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t\t</select>\n");
          out.write("\t\t\t</td>\n");
          out.write("\t\t\t<td align=\"right\" id=\"jformPkSequenceN\" ");
          if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("><label class=\"Validform_label\"> ");
          if (_jspx_meth_t_mutiLang_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write(":</label></td>\n");
          out.write("\t\t\t<td class=\"value\" id=\"jformPkSequenceV\" ");
          if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("><input id=\"jformPkSequence\" name=\"jformPkSequence\" type=\"text\"\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  class=\"inputxt\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.jformPkSequence}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" /> <span class=\"Validform_checktip\"></span> <label class=\"Validform_label\" style=\"display: none;\"> ");
          if (_jspx_meth_t_mutiLang_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write(":</label></td>\n");
          out.write("\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t<!--add-start--Author:luobaoli  Date:20150607 for：增加表单分类下拉列表-->\n");
          out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> ");
          if (_jspx_meth_t_mutiLang_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write(":</label></td>\n");
          out.write("\t\t\t<td class=\"value\"><select id=\"jformCategory\" name=\"jformCategory\">\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t</select></td>\n");
          out.write("\t\t\t<!--add-end--Author:luobaoli  Date:20150607 for：增加表单分类下拉列表-->\n");
          out.write("\n");
          out.write("\t\t\t\t<td align=\"right\"><label class=\"Validform_label\"> ");
          if (_jspx_meth_t_mutiLang_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write(": </label></td>\n");
          out.write("\t\t\t\t<td class=\"value\"><select id=\"jformType\" name=\"jformType\" onchange=\"formTypeChange();\">\n");
          out.write("\t\t\t\t\t<option value=\"1\" ");
          if (_jspx_meth_c_if_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write('>');
          if (_jspx_meth_t_mutiLang_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t\t\t<option value=\"2\" ");
          if (_jspx_meth_c_if_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write('>');
          if (_jspx_meth_t_mutiLang_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t\t\t<option value=\"3\" ");
          if (_jspx_meth_c_if_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write('>');
          if (_jspx_meth_t_mutiLang_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t\t</select>\n");
          out.write("\t\t\t\t\t<div id=\"relation_type_div\" style=\"display: none;\">\n");
          out.write("\t\t\t\t\t\t<input type=\"radio\" name=\"relationType\"\n");
          out.write("\t\t\t\t\t\t\t   ");
          if (_jspx_meth_c_if_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write(" value=\"0\">\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_t_mutiLang_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t</input>\n");
          out.write("\t\t\t\t\t\t<input type=\"radio\" name=\"relationType\"\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_c_if_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write(" value=\"1\">\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_t_mutiLang_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t</input> &nbsp;\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_t_mutiLang_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write(":<input class=\"inputxt\" style=\"width: 30px\" id=\"tabOrder\" name=\"tabOrder\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.tabOrder}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" datatype=\"n\" ignore=\"ignore\"></div>\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t</tr>\n");
          out.write("\t\t<tr>\n");
          out.write("\t\t\t<!--add-start--Author:张忠亮  Date:20150618 for：增加表单模板选择-->\n");
          out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> ");
          if (_jspx_meth_t_mutiLang_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write(":</label></td>\n");
          out.write("\t\t\t<td class=\"value\"><select id=\"formTemplate\" name=\"formTemplate\" temVal=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.formTemplate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></select></td>\n");
          out.write("\t\t\t<!--add-end--Author:张忠亮  Date:20150618 for：增加表单模板选择-->\n");
          out.write("\t\t\t\n");
          out.write("\t\t\t<!--add-start--Author:scott Date:20160301 for：online表单移动样式单独配置-->\n");
          out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> ");
          if (_jspx_meth_t_mutiLang_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write(":</label></td>\n");
          out.write("\t\t\t<td class=\"value\"><select id=\"formTemplateMobile\" name=\"formTemplateMobile\" temVal=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.formTemplateMobile}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></select></td>\n");
          out.write("\t\t\t<!--add-start--Author:scott  Date:20160301 for：online表单移动样式单独配置-->\n");
          out.write("\t\t</tr>\n");
          out.write("\t\t<tr>\n");
          out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> ");
          if (_jspx_meth_t_mutiLang_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write(": </label></td>\n");
          out.write("\t\t\t<td class=\"value\"><select id=\"isCheckbox\" name=\"isCheckbox\">\n");
          out.write("\t\t\t\t<option value=\"N\" ");
          if (_jspx_meth_c_if_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write('>');
          if (_jspx_meth_t_mutiLang_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t\t<option value=\"Y\" ");
          if (_jspx_meth_c_if_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write('>');
          if (_jspx_meth_t_mutiLang_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t</select></td>\n");
          out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> ");
          if (_jspx_meth_t_mutiLang_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write(":</label></td>\n");
          out.write("\t\t\t<td class=\"value\"><select id=\"isPagination\" name=\"isPagination\">\n");
          out.write("\t\t\t\t<option value=\"Y\" ");
          if (_jspx_meth_c_if_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write('>');
          if (_jspx_meth_t_mutiLang_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t\t<option value=\"N\" ");
          if (_jspx_meth_c_if_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write('>');
          if (_jspx_meth_t_mutiLang_26((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t</select></td>\n");
          out.write("\t\t</tr>\n");
          out.write("\t\t<tr>\n");
          out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> ");
          if (_jspx_meth_t_mutiLang_27((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write(": </label></td>\n");
          out.write("\t\t\t<td class=\"value\"><select id=\"isTree\" name=\"isTree\">\n");
          out.write("\t\t\t\t<option value=\"N\" ");
          if (_jspx_meth_c_if_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write('>');
          if (_jspx_meth_t_mutiLang_28((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t\t<option value=\"Y\" ");
          if (_jspx_meth_c_if_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write('>');
          if (_jspx_meth_t_mutiLang_29((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t</select></td>\n");
          out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> ");
          if (_jspx_meth_t_mutiLang_30((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write(": </label></td>\n");
          out.write("\t\t\t<td class=\"value\"><select id=\"querymode\" name=\"querymode\">\n");
          out.write("\t\t\t\t<option value=\"single\" ");
          if (_jspx_meth_c_if_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write('>');
          if (_jspx_meth_t_mutiLang_31((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t\t<option value=\"group\" ");
          if (_jspx_meth_c_if_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write('>');
          if (_jspx_meth_t_mutiLang_32((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t</select></td>\n");
          out.write("\t\t</tr>\n");
          out.write("\t\t");
          if (_jspx_meth_c_if_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t<tr class=\"tree\">\n");
          out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 树形表单父id: </label></td>\n");
          out.write("\t\t\t<td class=\"value\"><input class=\"inputxt\" id=\"treeParentIdFieldName\" name=\"treeParentIdFieldName\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.treeParentIdFieldName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" datatype=\"s2-100\"> <span class=\"Validform_checktip\"></span></td>\n");
          out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 树开表单列: </label></td>\n");
          out.write("\t\t\t<td class=\"value\"><input class=\"inputxt\" id=\"treeFieldname\" name=\"treeFieldname\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.treeFieldname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" datatype=\"s2-100\"> <span class=\"Validform_checktip\"></span></td>\n");
          out.write("\t\t</tr>\n");
          out.write("\t\t<tr style=\"display:none;\">\n");
          out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> idField: </label></td>\n");
          out.write("\t\t\t<td class=\"value\"><input class=\"inputxt\" id=\"treeIdFieldname\" name=\"treeIdFieldname\" value=\"id\" datatype=\"s2-100\"> <span class=\"Validform_checktip\"></span></td>\n");
          out.write("\t\t\n");
          out.write("\t\t</tr>\n");
          out.write("\t</table>\n");
          out.write("  <div id=\"tabs\" class=\"easyui-tabs\" tabPosition=\"top\" fit=\"false\" style=\"margin: 0px; padding: 0px; overflow: hidden; width: auto;\">\n");
          out.write("    <div title= '");
          if (_jspx_meth_t_mutiLang_34((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("' width=\"auto\" style=\"width: auto; margin: 0px; padding: 0px; overflow: hidden;\">\n");
          out.write("      <!-- add-start--Author:gengjiajia  Date:20160804 for：如果表类型是“配置表”，则online表单配置不可修改，禁止添加，删除，按钮-->\n");
          out.write("      ");
          if (_jspx_meth_c_if_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("      <!-- add-end--Author:gengjiajia  Date:20160804 for：如果表类型是“配置表”，则online表单配置不可修改，禁止添加，删除，按钮-->\n");
          out.write("      <table id=\"tab_div_database_title\" class=\"table-list\" style=\"height: 25px;\">\n");
          out.write("      </table>\n");
          out.write("      <div class=\"t_table\" id=\"t_table_database\">\n");
          out.write("        <table id=\"tab_div_database\" class=\"table-list\">\n");
          out.write("        </table>\n");
          out.write("        <br><br><br>\n");
          out.write("\t\t  <div  style=\"height: 43px\"></div>\n");
          out.write("      </div>\n");
          out.write("    </div>\n");
          out.write("    <div title='");
          if (_jspx_meth_t_mutiLang_37((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("' style=\"overflow: hidden;\">\n");
          out.write("      <table id=\"tab_div_page_title\" class=\"table-list\" style=\"height: 25px;\">\n");
          out.write("      </table>\n");
          out.write("      <div class=\"t_table\" id=\"t_table_page\">\n");
          out.write("        <table id=\"tab_div_page\" class=\"table-list\">\n");
          out.write("        </table>\n");
          out.write("        <br><br><br>\n");
          out.write("      </div>\n");
          out.write("    </div>\n");
          out.write("    <div title='");
          if (_jspx_meth_t_mutiLang_38((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("' style=\"overflow: hidden;\">\n");
          out.write("      <table id=\"tab_div_check_title\" class=\"table-list\" style=\"height: 25px;\">\n");
          out.write("      </table>\n");
          out.write("      <div class=\"t_table\" id=\"t_table_check\">\n");
          out.write("        <table id=\"tab_div_check\" class=\"table-list\">\n");
          out.write("        </table>\n");
          out.write("        <br><br><br>\n");
          out.write("      </div>\n");
          out.write("    </div>\n");
          out.write("    <div title='");
          if (_jspx_meth_t_mutiLang_39((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("' style=\"overflow: hidden;\">\n");
          out.write("      <table id=\"tab_div_key_title\" class=\"table-list\" style=\"height: 25px;\">\n");
          out.write("      </table>\n");
          out.write("      <div class=\"t_table\" id=\"t_table_key\">\n");
          out.write("        <table id=\"tab_div_key\" class=\"table-list\">\n");
          out.write("        </table>\n");
          out.write("        <br><br><br>\n");
          out.write("      </div>\n");
          out.write("    </div>\n");
          out.write("    <!--  add-start author： wangkun  date:20160611 for: TASK #1090 【online】online表单缺少索引配置 代码修改痕迹-->\n");
          out.write("\t<div title='");
          if (_jspx_meth_t_mutiLang_40((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("' style=\"overflow: hidden;\">\n");
          out.write("\t  <div style=\"height: 25px;\" class=\"datagrid-toolbar\">\n");
          out.write("\t  \t<a id=\"addColumnBtn1\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-add'\" onclick=\"addIndexBtnClick();\" href=\"#\">");
          if (_jspx_meth_t_mutiLang_41((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("</a> \n");
          out.write("\t  \t<a id=\"delColumnBtn1\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-remove'\" onclick=\"delIndexBtnClick();\" href=\"#\">");
          if (_jspx_meth_t_mutiLang_42((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("\t  </div>\n");
          out.write("\t  <table id=\"tab_div_index_title\" class=\"table-list\" style=\"height: 25px;\">\n");
          out.write("\t  </table>\n");
          out.write("\t  <div class=\"t_table\" id=\"t_table_index\">\n");
          out.write("\t\t  <table id=\"tab_div_index\" class=\"table-list\">\n");
          out.write("\n");
          out.write("\t\t  </table>\n");
          out.write("\t\t  <br><br><br>\n");
          out.write("\t  </div>\n");
          out.write("\t</div>\n");
          out.write("\t<!--  add-end author： wangkun  date:20160611 for: TASK #1090 【online】online表单缺少索引配置 代码修改痕迹-->\n");
          out.write("  </div>\n");
          int evalDoAfterBody = _jspx_th_t_formvalid_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_t_formvalid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_t_formvalid_usePlugin_tiptype_layout_formid_dialog_beforeSubmit_action.reuse(_jspx_th_t_formvalid_0);
        return;
      }
      _jspx_tagPool_t_formvalid_usePlugin_tiptype_layout_formid_dialog_beforeSubmit_action.reuse(_jspx_th_t_formvalid_0);
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(function() {\n");
      out.write("\t//显示/隐藏树形表单输入项\n");
      out.write("\tisTreeHandle();\n");
      out.write("\t$(\"#isTree\").change(function() {\n");
      out.write("\t\tisTreeHandle();\n");
      out.write("\t});\n");
      out.write("\tgetFormTemplateName();\n");
      out.write("\t<!--add-start--Author:scott Date:20160301 for：online表单移动样式单独配置-->\n");
      out.write("\tgetFormTemplateName2();\n");
      out.write("\t<!--add-end--Author:scott Date:20160301 for：online表单移动样式单独配置-->\n");
      out.write("});\n");
      out.write("//--add-start--Author:caoez Date:20180202 for：TASK #2520 【online开发】online维护字段，字段没有判断重复--\n");
      out.write("//判断fieldname是否重复\n");
      out.write("function isFieldNameDup() {\n");
      out.write("    var fieldArray = new Array();\n");
      out.write("    var fieldname;\n");
      out.write("    $(\"#tab_div_database tr\").each(function(){\n");
      out.write("        fieldname = $(this).find(\"td:eq(3)>input\").val();\n");
      out.write("        if (fieldname !== null || fieldname !== undefined || fieldname !== '') {\n");
      out.write("            fieldArray.push(fieldname);\n");
      out.write("        }\n");
      out.write("    })\n");
      out.write("    var dupFieldArray = new Array();\n");
      out.write("    fieldArray.sort();\n");
      out.write("    for(var i = 0;i<fieldArray.length;i++)\n");
      out.write("    {\n");
      out.write("        var count = 0;\n");
      out.write("        for(var j=i;j<fieldArray.length;j++)\n");
      out.write("        {\n");
      out.write("            if(fieldArray[i] == fieldArray[j])\n");
      out.write("            {\n");
      out.write("                count++;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        if(count>1){\n");
      out.write("            dupFieldArray.push([fieldArray[i],count]);\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    //dupFieldArray 二维数维中保存了 值和值的重复数\n");
      out.write("    for(var  i = 0 ;i<dupFieldArray.length;i++)\n");
      out.write("    {\n");
      out.write("        tip(dupFieldArray[i][0]+'");
      if (_jspx_meth_t_mutiLang_43(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\n");
      out.write("//        alert(\"字段:\"+dupFieldArray[i][0]+\"重复\"+dupFieldArray[i][1]+\"次\");\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("//--add-end--Author:caoez Date:20180202 for：TASK #2520 【online开发】online维护字段，字段没有判断重复--\n");
      out.write("//根据是否为树形菜单隐藏或显示tree输入框\n");
      out.write("function isTreeHandle() {\n");
      out.write("\tif($(\"#isTree\").val() == \"Y\") {\n");
      out.write("\t\t//树形表单设置默认值\n");
      out.write("\t\tif(!$(\"#treeFieldname\").val()) {\n");
      out.write("\t\t\t$(\"#treeFieldname\").val($(\":text[name='columns[1].fieldName']\").val());\n");
      out.write("\t\t}\n");
      out.write("\t\t$(\"tr.tree\").find(\":input\").attr(\"disabled\", false).attr(\"datatype\", \"s2-100\").end().show();\n");
      out.write("\t}else {\n");
      out.write("\t\t$(\"tr.tree\").find(\":input\").attr(\"disabled\", true).removeAttr(\"datatype\").end().hide();\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("//--add-start--Author:张忠亮  Date:20150714 for：根据表单类型获取风格--\n");
      out.write("//获取表单风格模板名称\n");
      out.write("function getFormTemplateName(){\n");
      out.write(" var type=$(\"#jformType\").val();\n");
      out.write("\t$.ajax({\n");
      out.write("\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/cgformTemplateController.do?getTemplate\",\n");
      out.write("\t\ttype:\"post\",\n");
      out.write("\t\tdata:{type:type},\n");
      out.write("\t\tdataType:\"json\",\n");
      out.write("\t\tsuccess:function(data){\n");
      out.write("\t\t\tif(data.success){\n");
      out.write("\t\t\t\t$(\"#formTemplate\").empty();\n");
      out.write("\t\t\t\t$(\"#formTemplate\").append(\"<option value='' >");
      if (_jspx_meth_t_mutiLang_44(_jspx_page_context))
        return;
      out.write("</option>\");\n");
      out.write("\t\t\t\t$.each(data.obj,function(i,tem){\n");
      out.write("\t\t\t\t\t$(\"#formTemplate\").append(\"<option value='\"+tem.templateCode+\"' >\"+tem.templateName+\"</option>\");\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\tvar temVal=$(\"#formTemplate\").attr(\"temVal\");\n");
      out.write("\t\t\t\tif(temVal.length>0){\n");
      out.write("\t\t\t\t\tvar len=$(\"#formTemplate\").find(\"[value='\"+temVal+\"']\").attr(\"selected\",\"selected\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("\n");
      out.write("//--add-start--Author:scott Date:20160301 for：online表单移动样式单独配置--\n");
      out.write("//获取表单风格模板名称\n");
      out.write("function getFormTemplateName2(){\n");
      out.write(" var type=$(\"#jformType\").val();\n");
      out.write("\t$.ajax({\n");
      out.write("\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/cgformTemplateController.do?getTemplate\",\n");
      out.write("\t\ttype:\"post\",\n");
      out.write("\t\tdata:{type:type},\n");
      out.write("\t\tdataType:\"json\",\n");
      out.write("\t\tsuccess:function(data){\n");
      out.write("\t\t\tif(data.success){\n");
      out.write("\t\t\t\t$(\"#formTemplateMobile\").empty();\n");
      out.write("\t\t\t\t$(\"#formTemplateMobile\").append(\"<option value='' >");
      if (_jspx_meth_t_mutiLang_45(_jspx_page_context))
        return;
      out.write("</option>\");\n");
      out.write("\t\t\t\t$.each(data.obj,function(i,tem){\n");
      out.write("\t\t\t\t\t$(\"#formTemplateMobile\").append(\"<option value='\"+tem.templateCode+\"' >\"+tem.templateName+\"</option>\");\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\tvar temVal=$(\"#formTemplateMobile\").attr(\"temVal\");\n");
      out.write("\t\t\t\tif(temVal.length>0){\n");
      out.write("\t\t\t\t\tvar len=$(\"#formTemplateMobile\").find(\"[value='\"+temVal+\"']\").attr(\"selected\",\"selected\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("//--add-end--Author:scott Date:20160301 for：online表单移动样式单独配置--\n");
      out.write("\n");
      out.write("//表单类型改变 调用\n");
      out.write("\tfunction formTypeChange(){\n");
      out.write("\t\tjformTypeChange();\n");
      out.write("\t\tgetFormTemplateName();\n");
      out.write("\t\tgetFormTemplateName2();\n");
      out.write("\t}\n");
      out.write("//--add-end--Author:张忠亮  Date:20150714 for：根据表单类型获取风格--\n");
      out.write("\n");
      out.write("function beforeSub(){\n");
      out.write("\tvar isCheck = true;\n");
      out.write("\t$(\"select[name*='showType']\").each(function(){\n");
      out.write("\t\tvar value = $(this).val();\n");
      out.write("\t\tif(value == 'date' || value == 'datetime') {\n");
      out.write("\t\t\tvar name=$(this).attr(\"name\");\n");
      out.write("\t\t\tvar type=name.substring(0,name.lastIndexOf(\".\")+1)+\"type\";\n");
      out.write("\t\t\tif($(\"[name='\"+type+\"']\").val()!='Date'){\n");
      out.write("\t\t\t\tisCheck =  false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\tif(!isCheck)return isCheck;\n");
      out.write("\t\n");
      out.write("\tdeleteUnUsedFiled();\n");
      out.write("}\n");
      out.write("\n");
      out.write("//add-start--Author:jg_renjie Date:20160413 for：TASK #1019 【平台bug】ONLINE百度编辑器控件样式不好。\n");
      out.write("function getShowType(obj){\n");
      out.write("\tvar $this = $(obj),value = obj.value;\n");
      out.write("\tif(value == 'umeditor'){\n");
      out.write("\t\t$this.parent().next().eq(0).find(\"input[name$=fieldLength]\").val('500');\n");
      out.write("\t} else {\n");
      out.write("\t\t$this.parent().next().eq(0).find(\"input[name$=fieldLength]\").val('120');\n");
      out.write("\t}\n");
      out.write("\t//add-begin--Author:Yandong Date:20180528 for：TASK #2730 【online】-创建/编辑表单对时间类型字段的特殊处理\n");
      out.write("\tif(value == 'date' || value == 'datetime') {\n");
      out.write("\t\tvar name=$(obj).attr(\"name\");\n");
      out.write("\t\tvar type=name.substring(0,name.lastIndexOf(\".\")+1)+\"type\";\n");
      out.write("\t\tif($(\"[name='\"+type+\"']\").val()!='Date'){\n");
      out.write("\t\t\ttip(\"字段类型为Date才能使用日期控件！\")\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\t//add-end--Author:Yandong Date:20180528 for：TASK #2730 【online】-创建/编辑表单对时间类型字段的特殊处理\n");
      out.write("}\n");
      out.write("//add-end--Author:jg_renjie Date:20160301 for：TASK #1019 【平台bug】ONLINE百度编辑器控件样式不好。\n");
      out.write("\n");
      out.write("function chooseOnly(obj){\n");
      out.write("\tif($(obj).val() == 'only'){\n");
      out.write("\t\tvar name=$(obj).attr(\"name\");\n");
      out.write("\t\tvar showType=name.substring(0,name.lastIndexOf(\".\")+1)+\"showType\";\n");
      out.write("\t\tif($(\"[name='\"+showType+\"']\").val()!='text'){\n");
      out.write("\t\t\t$(obj).val(\"\");\n");
      out.write("\t\t\ttip(\"控件类型为文本框才能使用唯一校验!\")\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("function selectField(select){\n");
      out.write("\tvar selected = select.val().split(\",\");\n");
      out.write("\tvar fieldArray = new Array();\n");
      out.write("\t$(\"#tab_div_database tr\").each(function(){\n");
      out.write("\t\tfieldArray.push($(this).find(\"td:eq(3)>input\").val());\n");
      out.write("\t})\n");
      out.write("\tvar content = \"<table id='field'>\";\n");
      out.write("\tfor(var i=0;i<fieldArray.length;i++){\n");
      out.write("\t\tif(selected.indexOf(fieldArray[i])!=-1){\n");
      out.write("\t\t\tcontent += \"<tr><td align='left'><input style='width: 30px' type='checkbox' name='ck' checked='checked'/></td>\";\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\tcontent += \"<tr><td align='left'><input style='width: 30px' type='checkbox' name='ck'/></td>\";\n");
      out.write("\t\t}\n");
      out.write("\t\tcontent += \"<td>\"+fieldArray[i]+\"</td></tr>\";\n");
      out.write("\t}\n");
      out.write("\tcontent += \"</table>\";\n");
      out.write("\t$.dialog({\n");
      out.write("\t\tcontent: content, \n");
      out.write("\t\tzIndex: 2200, \n");
      out.write("\t\ttitle: '字段', \n");
      out.write("\t\tlock: false, \n");
      out.write("\t\twidth: 250, \n");
      out.write("\t\theight: 250, \n");
      out.write("\t\topacity: 0.4,\n");
      out.write("\t\tbutton: [\n");
      out.write("        \t{\t\n");
      out.write("        \t\tname: '");
      if (_jspx_meth_t_mutiLang_46(_jspx_page_context))
        return;
      out.write("', \n");
      out.write("        \t\tcallback: function(){\n");
      out.write("        \t\t\tvar s = \"\";\n");
      out.write("        \t\t\tparent.$(\"input[name='ck']\").each(function(){\n");
      out.write("        \t\t\t\tif($(this).attr(\"checked\")){\n");
      out.write("        \t\t\t\t\ts += $(this).parent().next(\"td\").text()+\",\";\n");
      out.write("        \t\t\t\t}\n");
      out.write("        \t\t\t});\n");
      out.write("\t\t\t\t    /* if(nodes.length>0){\n");
      out.write("\t\t\t\t        var ids='',names='';\n");
      out.write("\t\t\t\t        for(i=0;i<nodes.length;i++){\n");
      out.write("\t\t\t\t            var node = nodes[i];\n");
      out.write("\t\t\t\t            ids += node.id+',';\n");
      out.write("\t\t\t\t            names += node.name+',';\n");
      out.write("\t\t\t\t        }\n");
      out.write("\t\t\t\t        $(\"#\" + selectedNamesInputId_depart).val(names);\n");
      out.write("\t\t\t\t        $(\"#\" + selectedNamesInputId_depart).blur();\n");
      out.write("\t\t\t\t        $(\"#\" + selectedIdsInputId_depart).val(ids);\n");
      out.write("\t\t\t\t    } */\n");
      out.write("\t\t\t\t    \n");
      out.write("        \t\t\tselect.val(s.substring(0,s.length-1));\n");
      out.write("        \t\t}, \n");
      out.write("        \t\tfocus: true\n");
      out.write("        \t},\n");
      out.write("        \t{\n");
      out.write("        \t\tname: '");
      if (_jspx_meth_t_mutiLang_47(_jspx_page_context))
        return;
      out.write("', \n");
      out.write("        \t\tcallback: function () {\n");
      out.write("        \t}\n");
      out.write("        }\n");
      out.write("    ]});\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<iframe id=\"iframe_check\" name=\"iframe_check\" src=\"plug-in/cgform/fields/cgformOfCheck.html\" style=\"display: none\"></iframe>\n");
      out.write("<iframe id=\"iframe_database\" src=\"plug-in/cgform/fields/cgformOfDatabase.html\" style=\"display: none\"></iframe>\n");
      out.write("<iframe id=\"iframe_key\" src=\"plug-in/cgform/fields/cgformOfForeignKey.html\" style=\"display: none\"></iframe>\n");
      out.write("<iframe id=\"iframe_page\" src=\"plug-in/cgform/fields/cgformOfPage.html\" style=\"display: none\"></iframe>\n");
      out.write("<!--  add-start author： wangkun  date:20160611 for: TASK #1090 【online】online表单缺少索引配置 代码修改痕迹-->\n");
      out.write("<iframe id=\"iframe_index\" src=\"plug-in/cgform/fields/cgformOfIndex.html\" style=\"display: none\"></iframe>\n");
      out.write("<!--  add-end author： wangkun  date:20160611 for: TASK #1090 【online】online表单缺少索引配置 代码修改痕迹-->\n");
      out.write("</body>\n");
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
    _jspx_th_t_mutiLang_0.setLangKey("smark.form.form.maintain");
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
    _jspx_th_t_base_0.setType("jquery,easyui,jqueryui-sortable,tools");
    int _jspx_eval_t_base_0 = _jspx_th_t_base_0.doStartTag();
    if (_jspx_th_t_base_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_base_type_nobody.reuse(_jspx_th_t_base_0);
      return true;
    }
    _jspx_tagPool_t_base_type_nobody.reuse(_jspx_th_t_base_0);
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
    _jspx_th_t_mutiLang_1.setLangKey("table.name");
    int _jspx_eval_t_mutiLang_1 = _jspx_th_t_mutiLang_1.doStartTag();
    if (_jspx_th_t_mutiLang_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_1);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_1);
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty cgFormHeadPage.tableName}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("readonly=\"readonly\"");
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

  private boolean _jspx_meth_t_mutiLang_2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_2 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_2.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_2.setLangKey("please.input.table.name");
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
    _jspx_th_t_mutiLang_3.setLangKey("table.description");
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
    _jspx_th_t_mutiLang_4.setLangKey("please.input.table.content");
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
    _jspx_th_t_mutiLang_5.setLangKey("pk.strategies");
    int _jspx_eval_t_mutiLang_5 = _jspx_th_t_mutiLang_5.doStartTag();
    if (_jspx_th_t_mutiLang_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_5);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_5);
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.jformPkType ne 'SEQUENCE'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("colspan=\"3\"");
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.jformPkType eq 'UUID'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected='selected'");
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

  private boolean _jspx_meth_t_mutiLang_6(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_6 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_6.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_6.setLangKey("common.uuid36bit");
    int _jspx_eval_t_mutiLang_6 = _jspx_th_t_mutiLang_6.doStartTag();
    if (_jspx_th_t_mutiLang_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_6);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_6);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.jformPkType eq 'NATIVE'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected='selected'");
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

  private boolean _jspx_meth_t_mutiLang_7(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_7 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_7.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_7.setLangKey("common.native.auto.increment");
    int _jspx_eval_t_mutiLang_7 = _jspx_th_t_mutiLang_7.doStartTag();
    if (_jspx_th_t_mutiLang_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_7);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_7);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.jformPkType eq 'SEQUENCE'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected='selected'");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
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
    _jspx_th_t_mutiLang_8.setLangKey("common.sequence");
    int _jspx_eval_t_mutiLang_8 = _jspx_th_t_mutiLang_8.doStartTag();
    if (_jspx_th_t_mutiLang_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_8);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_8);
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.jformPkType ne 'SEQUENCE'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("style=\"display: none;\"");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_9(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_9 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_9.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_9.setLangKey("sequence.name");
    int _jspx_eval_t_mutiLang_9 = _jspx_th_t_mutiLang_9.doStartTag();
    if (_jspx_th_t_mutiLang_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_9);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_9);
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.jformPkType ne 'SEQUENCE'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("style=\"display: none;\"");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_10(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_10 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_10.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_10.setLangKey("sequence.name");
    int _jspx_eval_t_mutiLang_10 = _jspx_th_t_mutiLang_10.doStartTag();
    if (_jspx_th_t_mutiLang_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_10);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_10);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_11(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_11 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_11.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_11.setLangKey("form.category");
    int _jspx_eval_t_mutiLang_11 = _jspx_th_t_mutiLang_11.doStartTag();
    if (_jspx_th_t_mutiLang_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_11);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_11);
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${typeList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("type");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${type.typecode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_if_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${type.typename}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${type.typecode==cgFormHeadPage.jformCategory}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected=\"selected\"");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_12(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_12 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_12.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_12.setLangKey("table.type");
    int _jspx_eval_t_mutiLang_12 = _jspx_th_t_mutiLang_12.doStartTag();
    if (_jspx_th_t_mutiLang_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_12);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_12);
    return false;
  }

  private boolean _jspx_meth_c_if_8(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.jformType eq '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected='selected'");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_13(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_13 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_13.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_13.setLangKey("single.table");
    int _jspx_eval_t_mutiLang_13 = _jspx_th_t_mutiLang_13.doStartTag();
    if (_jspx_th_t_mutiLang_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_13);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_13);
    return false;
  }

  private boolean _jspx_meth_c_if_9(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.jformType eq '2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected=\"selected\"");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_14(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_14 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_14.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_14.setLangKey("master.table");
    int _jspx_eval_t_mutiLang_14 = _jspx_th_t_mutiLang_14.doStartTag();
    if (_jspx_th_t_mutiLang_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_14);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_14);
    return false;
  }

  private boolean _jspx_meth_c_if_10(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.jformType eq '3'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected=\"selected\"");
        int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_15(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_15 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_15.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_15.setLangKey("slave.table");
    int _jspx_eval_t_mutiLang_15 = _jspx_th_t_mutiLang_15.doStartTag();
    if (_jspx_th_t_mutiLang_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_15);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_15);
    return false;
  }

  private boolean _jspx_meth_c_if_11(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_11.setPageContext(_jspx_page_context);
    _jspx_th_c_if_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.relationType eq '0' || cgFormHeadPage.relationType ==null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
    if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t   checked=\"checked\"\n");
        out.write("\t\t\t\t\t\t\t   ");
        int evalDoAfterBody = _jspx_th_c_if_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_16(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_16 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_16.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_16.setLangKey("common.one.to.many");
    int _jspx_eval_t_mutiLang_16 = _jspx_th_t_mutiLang_16.doStartTag();
    if (_jspx_th_t_mutiLang_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_16);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_16);
    return false;
  }

  private boolean _jspx_meth_c_if_12(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_12.setPageContext(_jspx_page_context);
    _jspx_th_c_if_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_if_12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.relationType eq '1' }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_12 = _jspx_th_c_if_12.doStartTag();
    if (_jspx_eval_c_if_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\tchecked=\"checked\"\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_17(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_17 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_17.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_17.setLangKey("comon.one.to.one");
    int _jspx_eval_t_mutiLang_17 = _jspx_th_t_mutiLang_17.doStartTag();
    if (_jspx_th_t_mutiLang_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_17);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_17);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_18(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_18 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_18.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_18.setLangKey("sequence.name");
    int _jspx_eval_t_mutiLang_18 = _jspx_th_t_mutiLang_18.doStartTag();
    if (_jspx_th_t_mutiLang_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_18);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_18);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_19(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_19 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_19.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_19.setLangKey("form.template.style_pc");
    int _jspx_eval_t_mutiLang_19 = _jspx_th_t_mutiLang_19.doStartTag();
    if (_jspx_th_t_mutiLang_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_19);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_19);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_20(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_20 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_20.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_20.setLangKey("form.template.style_mobile");
    int _jspx_eval_t_mutiLang_20 = _jspx_th_t_mutiLang_20.doStartTag();
    if (_jspx_th_t_mutiLang_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_20);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_20);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_21(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_21 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_21.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_21.setLangKey("show.checkbox");
    int _jspx_eval_t_mutiLang_21 = _jspx_th_t_mutiLang_21.doStartTag();
    if (_jspx_th_t_mutiLang_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_21);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_21);
    return false;
  }

  private boolean _jspx_meth_c_if_13(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_13.setPageContext(_jspx_page_context);
    _jspx_th_c_if_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_if_13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.isCheckbox eq 'N'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_13 = _jspx_th_c_if_13.doStartTag();
    if (_jspx_eval_c_if_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected=\"selected\"");
        int evalDoAfterBody = _jspx_th_c_if_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_22(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_22 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_22.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_22.setLangKey("common.no");
    int _jspx_eval_t_mutiLang_22 = _jspx_th_t_mutiLang_22.doStartTag();
    if (_jspx_th_t_mutiLang_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_22);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_22);
    return false;
  }

  private boolean _jspx_meth_c_if_14(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_14 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_14.setPageContext(_jspx_page_context);
    _jspx_th_c_if_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_if_14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.isCheckbox eq 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_14 = _jspx_th_c_if_14.doStartTag();
    if (_jspx_eval_c_if_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected=\"selected\"");
        int evalDoAfterBody = _jspx_th_c_if_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_23(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_23 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_23.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_23.setLangKey("common.yes");
    int _jspx_eval_t_mutiLang_23 = _jspx_th_t_mutiLang_23.doStartTag();
    if (_jspx_th_t_mutiLang_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_23);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_23);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_24(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_24 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_24.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_24.setLangKey("is.page");
    int _jspx_eval_t_mutiLang_24 = _jspx_th_t_mutiLang_24.doStartTag();
    if (_jspx_th_t_mutiLang_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_24);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_24);
    return false;
  }

  private boolean _jspx_meth_c_if_15(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_15 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_15.setPageContext(_jspx_page_context);
    _jspx_th_c_if_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_if_15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.isPagination eq 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_15 = _jspx_th_c_if_15.doStartTag();
    if (_jspx_eval_c_if_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected='selected'");
        int evalDoAfterBody = _jspx_th_c_if_15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_25(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_25 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_25.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_25.setLangKey("common.yes");
    int _jspx_eval_t_mutiLang_25 = _jspx_th_t_mutiLang_25.doStartTag();
    if (_jspx_th_t_mutiLang_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_25);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_25);
    return false;
  }

  private boolean _jspx_meth_c_if_16(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_16 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_16.setPageContext(_jspx_page_context);
    _jspx_th_c_if_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_if_16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.isPagination eq 'N'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_16 = _jspx_th_c_if_16.doStartTag();
    if (_jspx_eval_c_if_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected=\"selected\"");
        int evalDoAfterBody = _jspx_th_c_if_16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_16);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_16);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_26(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_26 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_26.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_26.setLangKey("common.no");
    int _jspx_eval_t_mutiLang_26 = _jspx_th_t_mutiLang_26.doStartTag();
    if (_jspx_th_t_mutiLang_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_26);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_26);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_27(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_27 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_27.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_27.setLangKey("is.tree");
    int _jspx_eval_t_mutiLang_27 = _jspx_th_t_mutiLang_27.doStartTag();
    if (_jspx_th_t_mutiLang_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_27);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_27);
    return false;
  }

  private boolean _jspx_meth_c_if_17(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_17 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_17.setPageContext(_jspx_page_context);
    _jspx_th_c_if_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_if_17.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.isTree eq 'N'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_17 = _jspx_th_c_if_17.doStartTag();
    if (_jspx_eval_c_if_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected='selected'");
        int evalDoAfterBody = _jspx_th_c_if_17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_17);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_17);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_28(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_28 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_28.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_28.setLangKey("common.no");
    int _jspx_eval_t_mutiLang_28 = _jspx_th_t_mutiLang_28.doStartTag();
    if (_jspx_th_t_mutiLang_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_28);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_28);
    return false;
  }

  private boolean _jspx_meth_c_if_18(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_18 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_18.setPageContext(_jspx_page_context);
    _jspx_th_c_if_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_if_18.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.isTree eq 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_18 = _jspx_th_c_if_18.doStartTag();
    if (_jspx_eval_c_if_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected='selected'");
        int evalDoAfterBody = _jspx_th_c_if_18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_18);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_18);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_29(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_29 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_29.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_29.setLangKey("common.yes");
    int _jspx_eval_t_mutiLang_29 = _jspx_th_t_mutiLang_29.doStartTag();
    if (_jspx_th_t_mutiLang_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_29);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_29);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_30(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_30 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_30.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_30.setLangKey("common.query.module");
    int _jspx_eval_t_mutiLang_30 = _jspx_th_t_mutiLang_30.doStartTag();
    if (_jspx_th_t_mutiLang_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_30);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_30);
    return false;
  }

  private boolean _jspx_meth_c_if_19(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_19 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_19.setPageContext(_jspx_page_context);
    _jspx_th_c_if_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_if_19.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.querymode eq 'single'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_19 = _jspx_th_c_if_19.doStartTag();
    if (_jspx_eval_c_if_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected=\"selected\"");
        int evalDoAfterBody = _jspx_th_c_if_19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_19);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_19);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_31(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_31 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_31.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_31.setLangKey("single.query");
    int _jspx_eval_t_mutiLang_31 = _jspx_th_t_mutiLang_31.doStartTag();
    if (_jspx_th_t_mutiLang_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_31);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_31);
    return false;
  }

  private boolean _jspx_meth_c_if_20(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_20 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_20.setPageContext(_jspx_page_context);
    _jspx_th_c_if_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_if_20.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.querymode eq 'group'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_20 = _jspx_th_c_if_20.doStartTag();
    if (_jspx_eval_c_if_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected=\"selected\"");
        int evalDoAfterBody = _jspx_th_c_if_20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_20);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_20);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_32(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_32 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_32.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_32.setLangKey("combine.query");
    int _jspx_eval_t_mutiLang_32 = _jspx_th_t_mutiLang_32.doStartTag();
    if (_jspx_th_t_mutiLang_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_32);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_32);
    return false;
  }

  private boolean _jspx_meth_c_if_21(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_21 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_21.setPageContext(_jspx_page_context);
    _jspx_th_c_if_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_if_21.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.jformType eq '2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_21 = _jspx_th_c_if_21.doStartTag();
    if (_jspx_eval_c_if_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t<tr id=\"fb_tb\">\n");
        out.write("\t\t\t\t<td align=\"right\"><label class=\"Validform_label\">");
        if (_jspx_meth_t_mutiLang_33((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_21, _jspx_page_context))
          return true;
        out.write("</label></td>\n");
        out.write("\t\t\t\t<td class=\"value\" colspan=\"3\"><input class=\"inputxt\" style=\"width: 440px\" disabled=\"disabled\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.subTableStr}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"></td>\n");
        out.write("\t\t\t</tr>\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_if_21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_21);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_21);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_33(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_33 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_33.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_21);
    _jspx_th_t_mutiLang_33.setLangKey("slave.table");
    int _jspx_eval_t_mutiLang_33 = _jspx_th_t_mutiLang_33.doStartTag();
    if (_jspx_th_t_mutiLang_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_33);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_33);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_34(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_34 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_34.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_34.setLangKey("database.property");
    int _jspx_eval_t_mutiLang_34 = _jspx_th_t_mutiLang_34.doStartTag();
    if (_jspx_th_t_mutiLang_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_34);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_34);
    return false;
  }

  private boolean _jspx_meth_c_if_22(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_22 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_22.setPageContext(_jspx_page_context);
    _jspx_th_c_if_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_if_22.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.tableType != '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_22 = _jspx_th_c_if_22.doStartTag();
    if (_jspx_eval_c_if_22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t      <div style=\"height: 25px;\" class=\"datagrid-toolbar\"><a id=\"addColumnBtn\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-add'\" onclick=\"addColumnBtnClick();\" href=\"#\">");
        if (_jspx_meth_t_mutiLang_35((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_22, _jspx_page_context))
          return true;
        out.write("</a> <a\n");
        out.write("\t\t\tid=\"delColumnBtn\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-remove'\" onclick=\"delColumnBtnClick();\" href=\"#\">");
        if (_jspx_meth_t_mutiLang_36((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_22, _jspx_page_context))
          return true;
        out.write("</a></div>\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_c_if_22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_22);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_22);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_35(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_35 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_35.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_22);
    _jspx_th_t_mutiLang_35.setLangKey("common.add.to");
    int _jspx_eval_t_mutiLang_35 = _jspx_th_t_mutiLang_35.doStartTag();
    if (_jspx_th_t_mutiLang_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_35);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_35);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_36(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_36 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_36.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_22);
    _jspx_th_t_mutiLang_36.setLangKey("common.delete");
    int _jspx_eval_t_mutiLang_36 = _jspx_th_t_mutiLang_36.doStartTag();
    if (_jspx_th_t_mutiLang_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_36);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_36);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_37(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_37 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_37.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_37.setLangKey("page.property");
    int _jspx_eval_t_mutiLang_37 = _jspx_th_t_mutiLang_37.doStartTag();
    if (_jspx_th_t_mutiLang_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_37);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_37);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_38(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_38 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_38.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_38.setLangKey("validate.dict");
    int _jspx_eval_t_mutiLang_38 = _jspx_th_t_mutiLang_38.doStartTag();
    if (_jspx_th_t_mutiLang_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_38);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_38);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_39(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_39 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_39.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_39.setLangKey("common.fk");
    int _jspx_eval_t_mutiLang_39 = _jspx_th_t_mutiLang_39.doStartTag();
    if (_jspx_th_t_mutiLang_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_39);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_39);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_40(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_40 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_40.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_40.setLangKey("common.index");
    int _jspx_eval_t_mutiLang_40 = _jspx_th_t_mutiLang_40.doStartTag();
    if (_jspx_th_t_mutiLang_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_40);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_40);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_41(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_41 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_41.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_41.setLangKey("common.add.to");
    int _jspx_eval_t_mutiLang_41 = _jspx_th_t_mutiLang_41.doStartTag();
    if (_jspx_th_t_mutiLang_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_41);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_41);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_42(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_42 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_42.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_42.setLangKey("common.delete");
    int _jspx_eval_t_mutiLang_42 = _jspx_th_t_mutiLang_42.doStartTag();
    if (_jspx_th_t_mutiLang_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_42);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_42);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_43(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_43 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_43.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_43.setParent(null);
    _jspx_th_t_mutiLang_43.setLangKey("common.please.online.fieldname.duplicate");
    int _jspx_eval_t_mutiLang_43 = _jspx_th_t_mutiLang_43.doStartTag();
    if (_jspx_th_t_mutiLang_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_43);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_43);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_44(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_44 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_44.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_44.setParent(null);
    _jspx_th_t_mutiLang_44.setLangKey("common.please.select");
    int _jspx_eval_t_mutiLang_44 = _jspx_th_t_mutiLang_44.doStartTag();
    if (_jspx_th_t_mutiLang_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_44);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_44);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_45(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_45 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_45.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_45.setParent(null);
    _jspx_th_t_mutiLang_45.setLangKey("common.please.select");
    int _jspx_eval_t_mutiLang_45 = _jspx_th_t_mutiLang_45.doStartTag();
    if (_jspx_th_t_mutiLang_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_45);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_45);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_46(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_46 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_46.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_46.setParent(null);
    _jspx_th_t_mutiLang_46.setLangKey("common.confirm");
    int _jspx_eval_t_mutiLang_46 = _jspx_th_t_mutiLang_46.doStartTag();
    if (_jspx_th_t_mutiLang_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_46);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_46);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_47(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_47 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_47.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_47.setParent(null);
    _jspx_th_t_mutiLang_47.setLangKey("common.cancel");
    int _jspx_eval_t_mutiLang_47 = _jspx_th_t_mutiLang_47.doStartTag();
    if (_jspx_th_t_mutiLang_47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_47);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_47);
    return false;
  }
}
