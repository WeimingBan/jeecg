package org.apache.jsp.webpage.jeecg.cgform.generate;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import org.jeecgframework.web.cgform.common.CgAutoListConstant;

public final class single_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_base_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_formvalid_usePlugin_tiptype_layout_formid_dialog_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_mutiLang_langKey_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_formvalid_usePlugin_tiptype_layout_formid_dialog_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_mutiLang_langKey_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
    _jspx_tagPool_t_formvalid_usePlugin_tiptype_layout_formid_dialog_action.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<title>智能表单-代码生成</title>\n");
      if (_jspx_meth_t_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/cgform/js/fileTree.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function browseFolder(path) {\n");
      out.write("    try {\n");
      out.write("        var Message = \"\\u8bf7\\u9009\\u62e9\\u6587\\u4ef6\\u5939\"; //选择框提示信息\n");
      out.write("        var Shell = new ActiveXObject(\"Shell.Application\");\n");
      out.write("        var Folder = Shell.BrowseForFolder(0, Message, 64, 17); //起始目录为：我的电脑\n");
      out.write("        if (Folder != null) {\n");
      out.write("            Folder = Folder.items(); // 返回 FolderItems 对象\n");
      out.write("            Folder = Folder.item(); // 返回 Folderitem 对象\n");
      out.write("            Folder = Folder.Path; // 返回路径\n");
      out.write("            if (Folder.charAt(Folder.length - 1) != \"\\\\\") {\n");
      out.write("                Folder = Folder + \"\\\\\";\n");
      out.write("            }\n");
      out.write("            document.getElementById(path).value = Folder;\n");
      out.write("            return Folder;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    catch (e) {\n");
      out.write("        alert(e.message);\n");
      out.write("    }\n");
      out.write("   }\n");
      out.write("   \n");
      out.write("</script>\n");
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
      out.write("\tmax-height: 240px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body style=\"overflow-y: hidden; overflow-x: hidden;\" scroll=\"no\">\n");
      if (_jspx_meth_t_formvalid_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</body>\n");
      out.write("<!-- update--begin--author:zhoujf date:20180503 for:一对多主子表关联外键的问题 -->\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("<!-- update-begin-author:taoyan date:20180627 for:TASK #2817 【bug】代码生成器模板是否支持树类型隔离 -->\n");
      out.write("$(function(){\n");
      out.write("\t$(\"input[name='version']\").change(function(){\n");
      out.write("\t\tvar type = \"single\";\n");
      out.write("\t\tvar version = this.value;\n");
      out.write("\t\tif(version=='system'){\n");
      out.write("\t\t\t$(\"#jspMode\").removeAttr(\"datatype\");\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\t$(\"#jspMode\").attr(\"datatype\",\"*\");\n");
      out.write("\t\t}\n");
      out.write("\t\tgetSingleTemplate(type,version,'');\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("//获取表单风格模板名称\n");
      out.write("function getSingleTemplate(type,version,supportTree){\n");
      out.write("\tif(version =='system'){\n");
      out.write("\t\t$(\"#jspMode_tr\").hide();\n");
      out.write("\t\t$(\"#jspMode\").empty();\n");
      out.write("\t}else{\n");
      out.write("\t\t$(\"#jspMode_tr\").show();\n");
      out.write("\t\tif(!supportTree){\n");
      out.write("\t\t\tsupportTree = $(\"input[name='supportTree']:checked\").val();\n");
      out.write("\t\t}\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/generateController.do?getOnlineTempletStyle\",\n");
      out.write("\t\t\ttype:\"post\",\n");
      out.write("\t\t\tdata:{\n");
      out.write("\t\t\t\ttype:type,\n");
      out.write("\t\t\t\tversion:version,\n");
      out.write("\t\t\t\tsupportTree:supportTree\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tdataType:\"json\",\n");
      out.write("\t\t\tsuccess:function(data){\n");
      out.write("\t\t\t\tif(data.success){\n");
      out.write("\t\t\t\t\t$(\"#jspMode\").empty();\n");
      out.write("\t\t\t\t\t//$(\"#jspMode\").append(\"<option value='' >");
      if (_jspx_meth_t_mutiLang_0(_jspx_page_context))
        return;
      out.write("</option>\");\n");
      out.write("\t\t\t\t\t$.each(data.obj,function(i,tem){\n");
      out.write("\t\t\t\t\t\t$(\"#jspMode\").append(\"<option value='\"+tem.code+\"' >\"+tem.desc+\"</option>\");\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t$(\"#jspMode\").empty();\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("<!-- update-end-author:taoyan date:20180627 for:TASK #2817 【bug】代码生成器模板是否支持树类型隔离 -->\n");
      out.write("</script>\n");
      out.write("<!-- update--end--author:zhoujf date:20180503 for:一对多主子表关联外键的问题 -->\n");
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
    org.jeecgframework.tag.core.easyui.FormValidationTag _jspx_th_t_formvalid_0 = (org.jeecgframework.tag.core.easyui.FormValidationTag) _jspx_tagPool_t_formvalid_usePlugin_tiptype_layout_formid_dialog_action.get(org.jeecgframework.tag.core.easyui.FormValidationTag.class);
    _jspx_th_t_formvalid_0.setPageContext(_jspx_page_context);
    _jspx_th_t_formvalid_0.setParent(null);
    _jspx_th_t_formvalid_0.setFormid("formobj");
    _jspx_th_t_formvalid_0.setDialog(true);
    _jspx_th_t_formvalid_0.setUsePlugin("password");
    _jspx_th_t_formvalid_0.setLayout("table");
    _jspx_th_t_formvalid_0.setTiptype("1");
    _jspx_th_t_formvalid_0.setAction("generateController.do?dogenerate");
    int _jspx_eval_t_formvalid_0 = _jspx_th_t_formvalid_0.doStartTag();
    if (_jspx_eval_t_formvalid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t<input id=\"id\" name=\"id\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("\t<input id=\"tableName\" name=\"tableName\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.tableName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("\t<input type=\"hidden\" id=\"fieldRowNum\" name=\"fieldRowNum\" value=\"1\">\n");
        out.write("\t<table cellpadding=\"0\" cellspacing=\"1\" class=\"formtable\">\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\">代码生成目录: </label></td>\n");
        out.write("\t\t\t<td class=\"value\"><input type=\"text\" class=\"inputxt\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${projectPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" name=\"projectPath\" id=\"projectPath\" datatype=\"*\" /> <a href=\"#\" id=\"openFoldSelect\" class=\"easyui-linkbutton\"\n");
        out.write("\t\t\t\ticon=\"icon-search\" onclick=\"openFolder('projectPath')\">浏览</a></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\">代码分层风格: </label></td>\n");
        out.write("\t\t\t<td class=\"value\"><select name=\"packageStyle\">\n");
        out.write("\t\t\t\t<option value=\"service\">业务分层</option>\n");
        out.write("\t\t\t\t<option value=\"project\">代码分层</option>\n");
        out.write("\t\t\t</select>\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 数据模型: </label></td>\n");
        out.write("\t\t\t<td class=\"value\"><select id=\"jformType\" disabled=\"disabled\" name=\"jformType\">\n");
        out.write("\t\t\t\t<option value=\"1\" ");
        if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(">单表</option>\n");
        out.write("\t\t\t\t<option value=\"2\" ");
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(">一对多</option>\n");
        out.write("\t\t\t</select></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 表名: </label></td>\n");
        out.write("\t\t\t<td class=\"value\" colspan=\"3\"><input disabled=\"disabled\" class=\"inputxt\" id=\"tableName_tmp\" name=\"tableName_tmp\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.tableName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" datatype=\"*\"> <span\n");
        out.write("\t\t\t\tclass=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t<!-- update-begin-author:taoyan date:20180628 for:布局修改 -->\n");
        out.write("\t\t\t\t<div style=\"display:inline-block\">\n");
        out.write("\t\t\t\t\t<span>树形列表: </span>\n");
        out.write("\t\t\t\t\t<input disabled type=\"radio\" name=\"supportTree\" ");
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(" value=\"1\"/>是\n");
        out.write("\t\t\t\t<input disabled type=\"radio\" name=\"supportTree\" ");
        if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write(" value=\"0\"/>否\n");
        out.write("\t\t\t\t</div>\n");
        out.write("\t\t\t\t<!-- update-end-author:taoyan date:20180628 for:布局修改 -->\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 功能说明: </label></td>\n");
        out.write("\t\t\t<td class=\"value\" colspan=\"3\"><input class=\"inputxt\" id=\"ftlDescription\" name=\"ftlDescription\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" datatype=\"*\"> <span class=\"Validform_checktip\"></span></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 包名(小写): </label></td>\n");
        out.write("\t\t\t<td class=\"value\" colspan=\"3\"><input class=\"inputxt\" id=\"entityPackage\" name=\"entityPackage\" datatype=\"*\"> <span class=\"Validform_checktip\"></span></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 实体类名(首字母大写): </label></td>\n");
        out.write("\t\t\t<td class=\"value\" colspan=\"3\"><input class=\"inputxt\" id=\"entityName\" name=\"entityName\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entityNames[cgFormHeadPage.tableName]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" datatype=\"*\"> <span class=\"Validform_checktip\"></span></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 需要生成的代码: </label></td>\n");
        out.write("\t\t\t<td class=\"value\" colspan=\"3\"><input type=\"checkbox\" value=\"1\" name=\"actionFlag\" id=\"actionFlag\" checked=\"checked\">Action</input> <input type=\"checkbox\" value=\"1\" name=\"jspFlag\" id=\"jspFlag\"\n");
        out.write("\t\t\t\tchecked=\"checked\">Jsp</input> <input type=\"checkbox\" value=\"1\" name=\"serviceIFlag\" id=\"serviceIFlag\" checked=\"checked\">ServiceI</input> <input type=\"checkbox\" value=\"1\" name=\"serviceImplFlag\"\n");
        out.write("\t\t\t\tid=\"serviceImplFlag\" checked=\"checked\">ServiceImpl</input> <input type=\"checkbox\" value=\"1\" name=\"pageFlag\" id=\"pageFlag\" checked=\"checked\">Page</input> <input type=\"checkbox\" value=\"1\"\n");
        out.write("\t\t\t\tname=\"entityFlag\" id=\"entityFlag\" checked=\"checked\">Entity</input> <span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t<!-- update-begin-author:taoyan date:20180628 for:布局修改 -->\n");
        out.write("\t\t\t\t<div style=\"display:inline-block\">\n");
        out.write("\t\t\t\t\t<span>【</span>\n");
        out.write("\t\t\t\t\t<span>是否支持Restful:</span>\n");
        out.write("\t\t\t\t\t<input type=\"radio\" name=\"supportRestful\" value=\"1\"/>是\n");
        out.write("\t\t\t\t\t<input type=\"radio\" name=\"supportRestful\" checked=\"checked\" value=\"0\"/>否\n");
        out.write("\t\t\t\t\t<span>】</span>\n");
        out.write("\t\t\t\t</div>\n");
        out.write("\t\t\t\t<!-- update-end-author:taoyan date:20180628 for:布局修改 -->\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<!-- update--begin--author:zhoujf date:20180503 for:一对多主子表关联外键的问题 -->\n");
        out.write("\t\t<!-- update--begin--author:zhoujf date:20180614 for:TASK #2787 【online 代码生成器】支持生成word 布局模板 -->\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 模板类型: </label></td>\n");
        out.write("\t\t\t<td class=\"value\" colspan=\"3\">\n");
        out.write("\t\t\t<input type=\"radio\" name=\"version\" checked=\"checked\" value=\"ext\">老版本模板(IE8+/不支持移动/标签列表)\n");
        out.write("\t\t\t<input type=\"radio\" name=\"version\" value=\"ext-common\">新一代模板(IE10+/移动支持/Bootstrap/Vue/支持原生态列表)\n");
        out.write("\t\t\t<input type=\"radio\" name=\"version\" datatype=\"*\" value=\"system\">Online原样生成(Word模板)\n");
        out.write("\t\t\t<span class=\"Validform_checktip\"></span></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<!-- update--end--author:zhoujf date:20180614 for:TASK #2787 【online 代码生成器】支持生成word 布局模板 -->\n");
        out.write("\t\t<!-- update--end--author:zhoujf date:20180503 for:一对多主子表关联外键的问题 -->\n");
        out.write("\t\t<tr id=\"jspMode_tr\">\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 页面风格: </label></td>\n");
        out.write("\t\t\t<td class=\"value\" colspan=\"3\">\n");
        out.write("\t\t\t<select id=\"jspMode\" name=\"jspMode\" style=\"width: 220px\" datatype=\"*\">\n");
        out.write("\t\t     \t\t");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t     </select>\n");
        out.write("\t\t\t<span class=\"Validform_checktip\"></span></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t</table>\n");
        int evalDoAfterBody = _jspx_th_t_formvalid_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_formvalid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_formvalid_usePlugin_tiptype_layout_formid_dialog_action.reuse(_jspx_th_t_formvalid_0);
      return true;
    }
    _jspx_tagPool_t_formvalid_usePlugin_tiptype_layout_formid_dialog_action.reuse(_jspx_th_t_formvalid_0);
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.jformType eq '1' || cgFormHeadPage.jformType eq '3'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected='selected'");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.jformType eq '2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected=\"selected\"");
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.isTree eq 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked=\"checked\"");
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

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgFormHeadPage.isTree eq 'N'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked=\"checked\"");
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

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jspModeList }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("style");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t     \t <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${style.code }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${style.desc }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("\t\t\t     \t");
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

  private boolean _jspx_meth_t_mutiLang_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_0 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_0.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_0.setParent(null);
    _jspx_th_t_mutiLang_0.setLangKey("common.please.select");
    int _jspx_eval_t_mutiLang_0 = _jspx_th_t_mutiLang_0.doStartTag();
    if (_jspx_th_t_mutiLang_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_0);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_0);
    return false;
  }
}
