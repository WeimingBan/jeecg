package org.apache.jsp.webpage.com.jeecg.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class form_005fuitag_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_base_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_formvalid_layout_formid_dialog_callback_beforeSubmit_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_defaultVal_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dictSelect_title_field_dictText_dictTable_dictField_dictCondition_defaultVal_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_comboTree_width_value_url_name_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_selectZTree_windowWidth_url_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_autocomplete_searchField_name_entityName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_choose_url_title_textname_name_isclear_isInit_icon_hiddenid_hiddenName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_mutiLang_langKey_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_mutiLang_langKey_langArg_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_departSelect_selectedNamesInputId_selectedIdsInputId_departNamesDefalutVal_departIdsDefalutVal_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_orgSelect_selectedNamesInputId_selectedIdsInputId_departNamesDefalutVal_departIdsDefalutVal_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_userSelect_windowWidth_windowHeight_title_selectedNamesInputId_selectedIdsInputId_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_webUploader_name_extensions_buttonStyle_bizType_auto_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_webUploader_name_fileSingleSizeLimit_fileNumLimit_buttonStyle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_webUploader_type_name_fileNumLimit_displayTxt_buttonText_buttonStyle_auto_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_treeSelectTag_field_code_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_formvalid_layout_formid_dialog_callback_beforeSubmit_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_defaultVal_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dictSelect_title_field_dictText_dictTable_dictField_dictCondition_defaultVal_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_comboTree_width_value_url_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_selectZTree_windowWidth_url_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_autocomplete_searchField_name_entityName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_choose_url_title_textname_name_isclear_isInit_icon_hiddenid_hiddenName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_mutiLang_langKey_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_mutiLang_langKey_langArg_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_departSelect_selectedNamesInputId_selectedIdsInputId_departNamesDefalutVal_departIdsDefalutVal_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_orgSelect_selectedNamesInputId_selectedIdsInputId_departNamesDefalutVal_departIdsDefalutVal_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_userSelect_windowWidth_windowHeight_title_selectedNamesInputId_selectedIdsInputId_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_webUploader_name_extensions_buttonStyle_bizType_auto_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_webUploader_name_fileSingleSizeLimit_fileNumLimit_buttonStyle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_webUploader_type_name_fileNumLimit_displayTxt_buttonText_buttonStyle_auto_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_treeSelectTag_field_code_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
    _jspx_tagPool_t_formvalid_layout_formid_dialog_callback_beforeSubmit_action.release();
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_defaultVal_nobody.release();
    _jspx_tagPool_t_dictSelect_title_field_dictText_dictTable_dictField_dictCondition_defaultVal_nobody.release();
    _jspx_tagPool_t_comboTree_width_value_url_name_id_nobody.release();
    _jspx_tagPool_t_selectZTree_windowWidth_url_id_nobody.release();
    _jspx_tagPool_t_autocomplete_searchField_name_entityName_nobody.release();
    _jspx_tagPool_t_choose_url_title_textname_name_isclear_isInit_icon_hiddenid_hiddenName_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_t_mutiLang_langKey_nobody.release();
    _jspx_tagPool_t_mutiLang_langKey_langArg_nobody.release();
    _jspx_tagPool_t_departSelect_selectedNamesInputId_selectedIdsInputId_departNamesDefalutVal_departIdsDefalutVal_nobody.release();
    _jspx_tagPool_t_orgSelect_selectedNamesInputId_selectedIdsInputId_departNamesDefalutVal_departIdsDefalutVal_nobody.release();
    _jspx_tagPool_t_userSelect_windowWidth_windowHeight_title_selectedNamesInputId_selectedIdsInputId_nobody.release();
    _jspx_tagPool_t_webUploader_name_extensions_buttonStyle_bizType_auto_nobody.release();
    _jspx_tagPool_t_webUploader_name_fileSingleSizeLimit_fileNumLimit_buttonStyle_nobody.release();
    _jspx_tagPool_t_webUploader_type_name_fileNumLimit_displayTxt_buttonText_buttonStyle_auto_nobody.release();
    _jspx_tagPool_t_treeSelectTag_field_code_nobody.release();
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
      out.write("<title>uitags</title>\n");
      if (_jspx_meth_t_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<style>\n");
      out.write("<!--\n");
      out.write(".ac_over {\n");
      out.write("\tbackground: #E0ECFF;\n");
      out.write("\tcursor: pointer;\n");
      out.write("\tcolor: #416AA3;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".ac_results {\n");
      out.write("\tborder: 1px solid rgb(172, 216, 236);\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      if (_jspx_meth_t_formvalid_0(_jspx_page_context))
        return;
      out.write("\n");
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

  private boolean _jspx_meth_t_base_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:base
    org.jeecgframework.tag.core.easyui.BaseTag _jspx_th_t_base_0 = (org.jeecgframework.tag.core.easyui.BaseTag) _jspx_tagPool_t_base_type_nobody.get(org.jeecgframework.tag.core.easyui.BaseTag.class);
    _jspx_th_t_base_0.setPageContext(_jspx_page_context);
    _jspx_th_t_base_0.setParent(null);
    _jspx_th_t_base_0.setType("jquery,easyui,tools,autocomplete");
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
    org.jeecgframework.tag.core.easyui.FormValidationTag _jspx_th_t_formvalid_0 = (org.jeecgframework.tag.core.easyui.FormValidationTag) _jspx_tagPool_t_formvalid_layout_formid_dialog_callback_beforeSubmit_action.get(org.jeecgframework.tag.core.easyui.FormValidationTag.class);
    _jspx_th_t_formvalid_0.setPageContext(_jspx_page_context);
    _jspx_th_t_formvalid_0.setParent(null);
    _jspx_th_t_formvalid_0.setFormid("formobj");
    _jspx_th_t_formvalid_0.setDialog(false);
    _jspx_th_t_formvalid_0.setLayout("div");
    _jspx_th_t_formvalid_0.setCallback("test");
    _jspx_th_t_formvalid_0.setAction("jeecgFormDemoController.do?testsubmit");
    _jspx_th_t_formvalid_0.setBeforeSubmit("setContentc");
    int _jspx_eval_t_formvalid_0 = _jspx_th_t_formvalid_0.doStartTag();
    if (_jspx_eval_t_formvalid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t<fieldset>\n");
        out.write("\t<legend>字典示例 | t:dictSelect </legend>\n");
        out.write("\t<table>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"center\" width=\"100px\"><label class=\"Validform_label\">radio:</label></td>\n");
        out.write("\t\t\t<td class=\"value\">");
        if (_jspx_meth_t_dictSelect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t</tr>\n");
        out.write("\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"center\" width=\"100px\"><label class=\"Validform_label\">select:</label></td>\n");
        out.write("\t\t\t<td class=\"value\">");
        if (_jspx_meth_t_dictSelect_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"center\" width=\"100px\"><label class=\"Validform_label\">checkbox:</label></td>\n");
        out.write("\t\t\t<td class=\"value\">");
        if (_jspx_meth_t_dictSelect_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"center\" width=\"100px\"><label class=\"Validform_label\">数据表字典:</label></td>\n");
        out.write("\t\t\t<td class=\"value\">");
        if (_jspx_meth_t_dictSelect_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t</table>\n");
        out.write("\t</fieldset>\n");
        out.write("\n");
        out.write("\t<fieldset>\n");
        out.write("\t<legend>树</legend>\n");
        out.write("\t<table>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"center\" width=\"100px\"><label class=\"Validform_label\">comboTree:</label></td>\n");
        out.write("\t\t\t<td class=\"value\">");
        if (_jspx_meth_t_comboTree_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t<span class=\"Validform_checktip\"></span></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"center\" width=\"100px\"><label class=\"Validform_label\">ztree 树控件:</label></td>\n");
        out.write("\t\t\t<td class=\"value\">");
        if (_jspx_meth_t_selectZTree_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(" <span class=\"Validform_checktip\"></span></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\n");
        out.write("\n");
        out.write("\t</table>\n");
        out.write("\t</fieldset>\n");
        out.write("\n");
        out.write("\t<fieldset>\n");
        out.write("\t<legend>自动补全 | t:autocomplete</legend>\n");
        out.write("\t<table>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"center\" width=\"100px\"><label class=\"Validform_label\">autocomplete:</label></td>\n");
        out.write("\t\t\t<td class=\"value\">");
        if (_jspx_meth_t_autocomplete_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t</table>\n");
        out.write("\t</fieldset>\n");
        out.write("\n");
        out.write("\t<fieldset>\n");
        out.write("\t<legend>选择控件 | t:choose</legend>\n");
        out.write("\t<table>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"center\" width=\"100px\"><label class=\"Validform_label\">choose:</label></td>\n");
        out.write("\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t<input id=\"roleid\" name=\"roleid\" type=\"hidden\" value=\"\" /> \n");
        out.write("\t\t\t\t<input name=\"roleName\" class=\"inputxt\" value=\"\" id=\"roleName\" readonly=\"readonly\" datatype=\"*\" /> \n");
        out.write("\t\t\t\t");
        if (_jspx_meth_t_choose_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t <span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t </td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t</table>\n");
        out.write("\t</fieldset>\n");
        out.write("\t<fieldset>\n");
        out.write("\t<legend>国际化语言输出 | t:mutiLang</legend>\n");
        out.write("\t<table>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"center\" width=\"100px\"><label>国际化:</label></td>\n");
        out.write("\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("   <br>\n");
        out.write("\t\t\t翻译结果：");
        if (_jspx_meth_t_mutiLang_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("<br>\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(" <br>\n");
        out.write("\t\t\t翻译结果： ");
        if (_jspx_meth_t_mutiLang_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("<br>\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t</table>\n");
        out.write("\t</fieldset>\n");
        out.write("\n");
        out.write("\t<fieldset>\n");
        out.write("\t<legend>通用POPUP选择用户\\部门 </legend>\n");
        out.write("\t<table>\t\t\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td>选择部门：</td><td>");
        if (_jspx_meth_t_departSelect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td>选择部门：</td>\n");
        out.write("\t\t\t<td>");
        if (_jspx_meth_t_orgSelect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("(树列表)</td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td>选择用户：</td><td>");
        if (_jspx_meth_t_userSelect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t</table>\n");
        out.write("\t</fieldset> \n");
        out.write("\t\n");
        out.write("\t<fieldset>\n");
        out.write("\t<legend>文件上传 | t:webUploader </legend>\n");
        out.write("\t<table>\t\t\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td>多文件上传：</td>\n");
        out.write("\t\t\t<!-- 文件路径对应的参数name为‘fileName1’、业务类型是‘photosucai’、自动上传、上传文件扩展名限制doc,txt,jpg、按钮风格：绿色大号按钮 -->\n");
        out.write("\t\t\t<td>");
        if (_jspx_meth_t_webUploader_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td>单文件上传：</td>\n");
        out.write("\t\t\t<!-- 文件路径对应的参数name为‘fileName2’、单个文件大小限制为500kb、按钮风格：绿色中号按钮、上传文件数量限制为1 -->\n");
        out.write("\t\t\t<td>");
        if (_jspx_meth_t_webUploader_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td>图片上传：</td>\n");
        out.write("\t\t\t<!-- 文件路径对应的参数name为‘fileName3’、不显示上传文件列表、自动上传、上传按钮显示文字为‘选择图片’、按钮风格：蓝色小按钮、上传类型为图片上传、上传文件数量限制为3 -->\n");
        out.write("\t\t\t<td>");
        if (_jspx_meth_t_webUploader_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t</table>\n");
        out.write("\t</fieldset>\n");
        out.write("\t\n");
        out.write("\t<fieldset>\n");
        out.write("\t<legend>分类树标签  | t:treeSelectTag（CODE对应系统管理->分类管理） </legend>\n");
        out.write("\t<table>\t\t\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td>进口汽车分类：</td>\n");
        out.write("\t\t\t<td>");
        if (_jspx_meth_t_treeSelectTag_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(" </td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t</table>\n");
        out.write("\t</fieldset>\n");
        int evalDoAfterBody = _jspx_th_t_formvalid_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_formvalid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_formvalid_layout_formid_dialog_callback_beforeSubmit_action.reuse(_jspx_th_t_formvalid_0);
      return true;
    }
    _jspx_tagPool_t_formvalid_layout_formid_dialog_callback_beforeSubmit_action.reuse(_jspx_th_t_formvalid_0);
    return false;
  }

  private boolean _jspx_meth_t_dictSelect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_0 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_defaultVal_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_0.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_dictSelect_0.setField("sex");
    _jspx_th_t_dictSelect_0.setType("radio");
    _jspx_th_t_dictSelect_0.setTypeGroupCode("sex");
    _jspx_th_t_dictSelect_0.setHasLabel(false);
    _jspx_th_t_dictSelect_0.setTitle("性别");
    _jspx_th_t_dictSelect_0.setDefaultVal("1");
    int _jspx_eval_t_dictSelect_0 = _jspx_th_t_dictSelect_0.doStartTag();
    if (_jspx_th_t_dictSelect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_0);
      return true;
    }
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_0);
    return false;
  }

  private boolean _jspx_meth_t_dictSelect_1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_1 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_defaultVal_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_1.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_dictSelect_1.setField("sex");
    _jspx_th_t_dictSelect_1.setType("select");
    _jspx_th_t_dictSelect_1.setTypeGroupCode("sex");
    _jspx_th_t_dictSelect_1.setHasLabel(false);
    _jspx_th_t_dictSelect_1.setTitle("性别");
    _jspx_th_t_dictSelect_1.setDefaultVal("1");
    int _jspx_eval_t_dictSelect_1 = _jspx_th_t_dictSelect_1.doStartTag();
    if (_jspx_th_t_dictSelect_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_1);
      return true;
    }
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_1);
    return false;
  }

  private boolean _jspx_meth_t_dictSelect_2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_2 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_defaultVal_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_2.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_dictSelect_2.setField("dbtype");
    _jspx_th_t_dictSelect_2.setType("checkbox");
    _jspx_th_t_dictSelect_2.setTypeGroupCode("dbtype");
    _jspx_th_t_dictSelect_2.setHasLabel(false);
    _jspx_th_t_dictSelect_2.setTitle("数据库类型");
    _jspx_th_t_dictSelect_2.setDefaultVal("oracle,mysql");
    int _jspx_eval_t_dictSelect_2 = _jspx_th_t_dictSelect_2.doStartTag();
    if (_jspx_th_t_dictSelect_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_2);
      return true;
    }
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_2);
    return false;
  }

  private boolean _jspx_meth_t_dictSelect_3(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_3 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_title_field_dictText_dictTable_dictField_dictCondition_defaultVal_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_3.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_dictSelect_3.setField("name");
    _jspx_th_t_dictSelect_3.setDefaultVal("1");
    _jspx_th_t_dictSelect_3.setDictTable("t_s_base_user");
    _jspx_th_t_dictSelect_3.setDictCondition("where delete_flag=0");
    _jspx_th_t_dictSelect_3.setDictField("username");
    _jspx_th_t_dictSelect_3.setDictText("realname");
    _jspx_th_t_dictSelect_3.setTitle("用户");
    int _jspx_eval_t_dictSelect_3 = _jspx_th_t_dictSelect_3.doStartTag();
    if (_jspx_th_t_dictSelect_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_title_field_dictText_dictTable_dictField_dictCondition_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_3);
      return true;
    }
    _jspx_tagPool_t_dictSelect_title_field_dictText_dictTable_dictField_dictCondition_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_3);
    return false;
  }

  private boolean _jspx_meth_t_comboTree_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:comboTree
    org.jeecgframework.tag.core.easyui.ComboTreeTag _jspx_th_t_comboTree_0 = (org.jeecgframework.tag.core.easyui.ComboTreeTag) _jspx_tagPool_t_comboTree_width_value_url_name_id_nobody.get(org.jeecgframework.tag.core.easyui.ComboTreeTag.class);
    _jspx_th_t_comboTree_0.setPageContext(_jspx_page_context);
    _jspx_th_t_comboTree_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_comboTree_0.setUrl("jeecgFormDemoController.do?getComboTreeData");
    _jspx_th_t_comboTree_0.setValue("402880e447e99cf10147e9a03b320003");
    _jspx_th_t_comboTree_0.setName("depid");
    _jspx_th_t_comboTree_0.setId("depid");
    _jspx_th_t_comboTree_0.setWidth("200");
    int _jspx_eval_t_comboTree_0 = _jspx_th_t_comboTree_0.doStartTag();
    if (_jspx_th_t_comboTree_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_comboTree_width_value_url_name_id_nobody.reuse(_jspx_th_t_comboTree_0);
      return true;
    }
    _jspx_tagPool_t_comboTree_width_value_url_name_id_nobody.reuse(_jspx_th_t_comboTree_0);
    return false;
  }

  private boolean _jspx_meth_t_selectZTree_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:selectZTree
    org.jeecgframework.tag.core.easyui.SelectZTreeTag _jspx_th_t_selectZTree_0 = (org.jeecgframework.tag.core.easyui.SelectZTreeTag) _jspx_tagPool_t_selectZTree_windowWidth_url_id_nobody.get(org.jeecgframework.tag.core.easyui.SelectZTreeTag.class);
    _jspx_th_t_selectZTree_0.setPageContext(_jspx_page_context);
    _jspx_th_t_selectZTree_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_selectZTree_0.setId("citySel");
    _jspx_th_t_selectZTree_0.setUrl("jeecgFormDemoController.do?getTreeData");
    _jspx_th_t_selectZTree_0.setWindowWidth("400px");
    int _jspx_eval_t_selectZTree_0 = _jspx_th_t_selectZTree_0.doStartTag();
    if (_jspx_th_t_selectZTree_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_selectZTree_windowWidth_url_id_nobody.reuse(_jspx_th_t_selectZTree_0);
      return true;
    }
    _jspx_tagPool_t_selectZTree_windowWidth_url_id_nobody.reuse(_jspx_th_t_selectZTree_0);
    return false;
  }

  private boolean _jspx_meth_t_autocomplete_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:autocomplete
    org.jeecgframework.tag.core.easyui.AutocompleteTag _jspx_th_t_autocomplete_0 = (org.jeecgframework.tag.core.easyui.AutocompleteTag) _jspx_tagPool_t_autocomplete_searchField_name_entityName_nobody.get(org.jeecgframework.tag.core.easyui.AutocompleteTag.class);
    _jspx_th_t_autocomplete_0.setPageContext(_jspx_page_context);
    _jspx_th_t_autocomplete_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_autocomplete_0.setEntityName("TSUser");
    _jspx_th_t_autocomplete_0.setSearchField("userName");
    _jspx_th_t_autocomplete_0.setName("userName");
    int _jspx_eval_t_autocomplete_0 = _jspx_th_t_autocomplete_0.doStartTag();
    if (_jspx_th_t_autocomplete_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_autocomplete_searchField_name_entityName_nobody.reuse(_jspx_th_t_autocomplete_0);
      return true;
    }
    _jspx_tagPool_t_autocomplete_searchField_name_entityName_nobody.reuse(_jspx_th_t_autocomplete_0);
    return false;
  }

  private boolean _jspx_meth_t_choose_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:choose
    org.jeecgframework.tag.core.easyui.ChooseTag _jspx_th_t_choose_0 = (org.jeecgframework.tag.core.easyui.ChooseTag) _jspx_tagPool_t_choose_url_title_textname_name_isclear_isInit_icon_hiddenid_hiddenName_nobody.get(org.jeecgframework.tag.core.easyui.ChooseTag.class);
    _jspx_th_t_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_t_choose_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_choose_0.setHiddenName("roleid");
    _jspx_th_t_choose_0.setHiddenid("id");
    _jspx_th_t_choose_0.setUrl("userController.do?roles");
    _jspx_th_t_choose_0.setName("roleList");
    _jspx_th_t_choose_0.setIcon("icon-search");
    _jspx_th_t_choose_0.setTitle("选择操作标签");
    _jspx_th_t_choose_0.setTextname("roleName");
    _jspx_th_t_choose_0.setIsclear(new Boolean(true));
    _jspx_th_t_choose_0.setIsInit(new Boolean(true));
    int _jspx_eval_t_choose_0 = _jspx_th_t_choose_0.doStartTag();
    if (_jspx_th_t_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_choose_url_title_textname_name_isclear_isInit_icon_hiddenid_hiddenName_nobody.reuse(_jspx_th_t_choose_0);
      return true;
    }
    _jspx_tagPool_t_choose_url_title_textname_name_isclear_isInit_icon_hiddenid_hiddenName_nobody.reuse(_jspx_th_t_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_out_0.setValue(new String("<t:mutiLang langKey='common.add' />"));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
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
    _jspx_th_t_mutiLang_0.setLangKey("common.add");
    int _jspx_eval_t_mutiLang_0 = _jspx_th_t_mutiLang_0.doStartTag();
    if (_jspx_th_t_mutiLang_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_0);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_out_1.setValue(new String("<t:mutiLang langKey='common.rang' langArg='请输入,6,10' />"));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_1 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_langArg_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_1.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_1.setLangKey("common.rang");
    _jspx_th_t_mutiLang_1.setLangArg("请输入,6,10");
    int _jspx_eval_t_mutiLang_1 = _jspx_th_t_mutiLang_1.doStartTag();
    if (_jspx_th_t_mutiLang_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_langArg_nobody.reuse(_jspx_th_t_mutiLang_1);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_langArg_nobody.reuse(_jspx_th_t_mutiLang_1);
    return false;
  }

  private boolean _jspx_meth_t_departSelect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:departSelect
    org.jeecgframework.tag.core.easyui.DepartSelectTag _jspx_th_t_departSelect_0 = (org.jeecgframework.tag.core.easyui.DepartSelectTag) _jspx_tagPool_t_departSelect_selectedNamesInputId_selectedIdsInputId_departNamesDefalutVal_departIdsDefalutVal_nobody.get(org.jeecgframework.tag.core.easyui.DepartSelectTag.class);
    _jspx_th_t_departSelect_0.setPageContext(_jspx_page_context);
    _jspx_th_t_departSelect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_departSelect_0.setSelectedNamesInputId("orgNames");
    _jspx_th_t_departSelect_0.setSelectedIdsInputId("orgIds");
    _jspx_th_t_departSelect_0.setDepartIdsDefalutVal("8a8ab0b246dc81120146dc8180ba0017,");
    _jspx_th_t_departSelect_0.setDepartNamesDefalutVal("JEECG开源社区,");
    int _jspx_eval_t_departSelect_0 = _jspx_th_t_departSelect_0.doStartTag();
    if (_jspx_th_t_departSelect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_departSelect_selectedNamesInputId_selectedIdsInputId_departNamesDefalutVal_departIdsDefalutVal_nobody.reuse(_jspx_th_t_departSelect_0);
      return true;
    }
    _jspx_tagPool_t_departSelect_selectedNamesInputId_selectedIdsInputId_departNamesDefalutVal_departIdsDefalutVal_nobody.reuse(_jspx_th_t_departSelect_0);
    return false;
  }

  private boolean _jspx_meth_t_orgSelect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:orgSelect
    org.jeecgframework.tag.core.easyui.OrgSelectTag _jspx_th_t_orgSelect_0 = (org.jeecgframework.tag.core.easyui.OrgSelectTag) _jspx_tagPool_t_orgSelect_selectedNamesInputId_selectedIdsInputId_departNamesDefalutVal_departIdsDefalutVal_nobody.get(org.jeecgframework.tag.core.easyui.OrgSelectTag.class);
    _jspx_th_t_orgSelect_0.setPageContext(_jspx_page_context);
    _jspx_th_t_orgSelect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_orgSelect_0.setSelectedNamesInputId("orgName");
    _jspx_th_t_orgSelect_0.setSelectedIdsInputId("orgId");
    _jspx_th_t_orgSelect_0.setDepartIdsDefalutVal("8a8ab0b246dc81120146dc8180ba0017,");
    _jspx_th_t_orgSelect_0.setDepartNamesDefalutVal("JEECG开源社区,");
    int _jspx_eval_t_orgSelect_0 = _jspx_th_t_orgSelect_0.doStartTag();
    if (_jspx_th_t_orgSelect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_orgSelect_selectedNamesInputId_selectedIdsInputId_departNamesDefalutVal_departIdsDefalutVal_nobody.reuse(_jspx_th_t_orgSelect_0);
      return true;
    }
    _jspx_tagPool_t_orgSelect_selectedNamesInputId_selectedIdsInputId_departNamesDefalutVal_departIdsDefalutVal_nobody.reuse(_jspx_th_t_orgSelect_0);
    return false;
  }

  private boolean _jspx_meth_t_userSelect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:userSelect
    org.jeecgframework.tag.core.easyui.UserSelectTag _jspx_th_t_userSelect_0 = (org.jeecgframework.tag.core.easyui.UserSelectTag) _jspx_tagPool_t_userSelect_windowWidth_windowHeight_title_selectedNamesInputId_selectedIdsInputId_nobody.get(org.jeecgframework.tag.core.easyui.UserSelectTag.class);
    _jspx_th_t_userSelect_0.setPageContext(_jspx_page_context);
    _jspx_th_t_userSelect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_userSelect_0.setTitle("用户名称");
    _jspx_th_t_userSelect_0.setSelectedNamesInputId("userNames");
    _jspx_th_t_userSelect_0.setSelectedIdsInputId("userIds");
    _jspx_th_t_userSelect_0.setWindowWidth("1000px");
    _jspx_th_t_userSelect_0.setWindowHeight("600px");
    int _jspx_eval_t_userSelect_0 = _jspx_th_t_userSelect_0.doStartTag();
    if (_jspx_th_t_userSelect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_userSelect_windowWidth_windowHeight_title_selectedNamesInputId_selectedIdsInputId_nobody.reuse(_jspx_th_t_userSelect_0);
      return true;
    }
    _jspx_tagPool_t_userSelect_windowWidth_windowHeight_title_selectedNamesInputId_selectedIdsInputId_nobody.reuse(_jspx_th_t_userSelect_0);
    return false;
  }

  private boolean _jspx_meth_t_webUploader_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:webUploader
    org.jeecgframework.tag.core.easyui.WebUploaderTag _jspx_th_t_webUploader_0 = (org.jeecgframework.tag.core.easyui.WebUploaderTag) _jspx_tagPool_t_webUploader_name_extensions_buttonStyle_bizType_auto_nobody.get(org.jeecgframework.tag.core.easyui.WebUploaderTag.class);
    _jspx_th_t_webUploader_0.setPageContext(_jspx_page_context);
    _jspx_th_t_webUploader_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_webUploader_0.setName("fileName1");
    _jspx_th_t_webUploader_0.setBizType("photosucai");
    _jspx_th_t_webUploader_0.setAuto(true);
    _jspx_th_t_webUploader_0.setExtensions("doc,txt,jpg");
    _jspx_th_t_webUploader_0.setButtonStyle("btn-green btn-L");
    int _jspx_eval_t_webUploader_0 = _jspx_th_t_webUploader_0.doStartTag();
    if (_jspx_th_t_webUploader_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_webUploader_name_extensions_buttonStyle_bizType_auto_nobody.reuse(_jspx_th_t_webUploader_0);
      return true;
    }
    _jspx_tagPool_t_webUploader_name_extensions_buttonStyle_bizType_auto_nobody.reuse(_jspx_th_t_webUploader_0);
    return false;
  }

  private boolean _jspx_meth_t_webUploader_1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:webUploader
    org.jeecgframework.tag.core.easyui.WebUploaderTag _jspx_th_t_webUploader_1 = (org.jeecgframework.tag.core.easyui.WebUploaderTag) _jspx_tagPool_t_webUploader_name_fileSingleSizeLimit_fileNumLimit_buttonStyle_nobody.get(org.jeecgframework.tag.core.easyui.WebUploaderTag.class);
    _jspx_th_t_webUploader_1.setPageContext(_jspx_page_context);
    _jspx_th_t_webUploader_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_webUploader_1.setName("fileName2");
    _jspx_th_t_webUploader_1.setFileSingleSizeLimit(500);
    _jspx_th_t_webUploader_1.setButtonStyle("btn-green btn-M mb20");
    _jspx_th_t_webUploader_1.setFileNumLimit(1);
    int _jspx_eval_t_webUploader_1 = _jspx_th_t_webUploader_1.doStartTag();
    if (_jspx_th_t_webUploader_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_webUploader_name_fileSingleSizeLimit_fileNumLimit_buttonStyle_nobody.reuse(_jspx_th_t_webUploader_1);
      return true;
    }
    _jspx_tagPool_t_webUploader_name_fileSingleSizeLimit_fileNumLimit_buttonStyle_nobody.reuse(_jspx_th_t_webUploader_1);
    return false;
  }

  private boolean _jspx_meth_t_webUploader_2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:webUploader
    org.jeecgframework.tag.core.easyui.WebUploaderTag _jspx_th_t_webUploader_2 = (org.jeecgframework.tag.core.easyui.WebUploaderTag) _jspx_tagPool_t_webUploader_type_name_fileNumLimit_displayTxt_buttonText_buttonStyle_auto_nobody.get(org.jeecgframework.tag.core.easyui.WebUploaderTag.class);
    _jspx_th_t_webUploader_2.setPageContext(_jspx_page_context);
    _jspx_th_t_webUploader_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_webUploader_2.setName("fileName3");
    _jspx_th_t_webUploader_2.setDisplayTxt(false);
    _jspx_th_t_webUploader_2.setAuto(true);
    _jspx_th_t_webUploader_2.setButtonText("选择图片");
    _jspx_th_t_webUploader_2.setButtonStyle("btn-blue btn-S");
    _jspx_th_t_webUploader_2.setType("image");
    _jspx_th_t_webUploader_2.setFileNumLimit(3);
    int _jspx_eval_t_webUploader_2 = _jspx_th_t_webUploader_2.doStartTag();
    if (_jspx_th_t_webUploader_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_webUploader_type_name_fileNumLimit_displayTxt_buttonText_buttonStyle_auto_nobody.reuse(_jspx_th_t_webUploader_2);
      return true;
    }
    _jspx_tagPool_t_webUploader_type_name_fileNumLimit_displayTxt_buttonText_buttonStyle_auto_nobody.reuse(_jspx_th_t_webUploader_2);
    return false;
  }

  private boolean _jspx_meth_t_treeSelectTag_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:treeSelectTag
    org.jeecgframework.tag.core.easyui.TreeSelectTag _jspx_th_t_treeSelectTag_0 = (org.jeecgframework.tag.core.easyui.TreeSelectTag) _jspx_tagPool_t_treeSelectTag_field_code_nobody.get(org.jeecgframework.tag.core.easyui.TreeSelectTag.class);
    _jspx_th_t_treeSelectTag_0.setPageContext(_jspx_page_context);
    _jspx_th_t_treeSelectTag_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_treeSelectTag_0.setCode("A03A02");
    _jspx_th_t_treeSelectTag_0.setField("sex");
    int _jspx_eval_t_treeSelectTag_0 = _jspx_th_t_treeSelectTag_0.doStartTag();
    if (_jspx_th_t_treeSelectTag_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_treeSelectTag_field_code_nobody.reuse(_jspx_th_t_treeSelectTag_0);
      return true;
    }
    _jspx_tagPool_t_treeSelectTag_field_code_nobody.reuse(_jspx_th_t_treeSelectTag_0);
    return false;
  }
}
