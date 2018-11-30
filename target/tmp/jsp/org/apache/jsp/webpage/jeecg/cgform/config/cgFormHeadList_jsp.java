package org.apache.jsp.webpage.jeecg.cgform.config;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cgFormHeadList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_base_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_datagrid_title_sortOrder_sortName_queryMode_name_idField_fitColumns_fit_checkbox_btnCls_actionUrl;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_title_hidden_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_replace_query_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_query_field_autocomplete_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_field_dictionary_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_replace_hidden_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_style_replace_query_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_hidden_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_title_hidden_formatter_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_urlStyle_title_funname_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_exp_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_urlStyle_title_funname_exp_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_operationCode_funname_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgToolBar_width_url_title_icon_height_funname_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgToolBar_url_title_icon_funname_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgToolBar_url_title_operationCode_icon_funname_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_mutiLang_langKey_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_datagrid_title_sortOrder_sortName_queryMode_name_idField_fitColumns_fit_checkbox_btnCls_actionUrl = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_title_hidden_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_replace_query_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_query_field_autocomplete_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_field_dictionary_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_replace_hidden_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_style_replace_query_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_hidden_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_title_hidden_formatter_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_urlStyle_title_funname_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_exp_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_urlStyle_title_funname_exp_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_operationCode_funname_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgToolBar_width_url_title_icon_height_funname_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgToolBar_url_title_icon_funname_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgToolBar_url_title_operationCode_icon_funname_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_mutiLang_langKey_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
    _jspx_tagPool_t_datagrid_title_sortOrder_sortName_queryMode_name_idField_fitColumns_fit_checkbox_btnCls_actionUrl.release();
    _jspx_tagPool_t_dgCol_title_hidden_field_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_replace_query_field_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_query_field_autocomplete_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_field_dictionary_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_field_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_replace_hidden_field_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_style_replace_query_field_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_hidden_field_nobody.release();
    _jspx_tagPool_t_dgCol_title_hidden_formatter_field_nobody.release();
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_urlStyle_title_funname_nobody.release();
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_exp_nobody.release();
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_urlStyle_title_funname_exp_nobody.release();
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_operationCode_funname_nobody.release();
    _jspx_tagPool_t_dgToolBar_width_url_title_icon_height_funname_nobody.release();
    _jspx_tagPool_t_dgToolBar_url_title_icon_funname_nobody.release();
    _jspx_tagPool_t_dgToolBar_url_title_operationCode_icon_funname_nobody.release();
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
      out.write('\n');
      if (_jspx_meth_t_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(function() {\n");
      out.write("\t\t//增加表单树型列表\n");
      out.write("\t\t$('#formtree').tree({\n");
      out.write("\t\t\tanimate : true,\n");
      out.write("\t\t\turl : 'systemController.do?formTree&typegroupCode=bdfl',\n");
      out.write("\t\t\tonClick : function(node) {\n");
      out.write("\t\t\t\tif ($('#formtree').tree('isLeaf', node.target)) {\n");
      out.write("\t\t\t\t\tloadFormByType(node.id);\n");
      out.write("\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t$('#formtree').tree('expand', node.target);\n");
      out.write("\n");
      out.write("\t\t\t\t\tloadFormByType(\"\");\n");
      out.write("\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t//根据分类动态加载online表单\n");
      out.write("\tfunction loadFormByType(jformCategory){\n");
      out.write("\t\tvar url = 'cgFormHeadController.do?datagrid';\n");
      out.write("\t\t$(\"#tablePropertyList\").datagrid('reload',{jformCategory:jformCategory});\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("<!--add-begin--Author:luobaoli  Date:20150607 for：增加表单树型列表-->\n");
      out.write("<div class=\"easyui-layout\" fit=\"true\">\n");
      out.write("<div region=\"west\" style=\"width: 150px;\" title=\"表单分类\" split=\"true\" collapsed=\"true\">\n");
      out.write("\t<div class=\"easyui-panel\" style=\"padding:0px;border:0px\" fit=\"true\" border=\"false\">\n");
      out.write("\t\t<ul id=\"formtree\"></ul>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<div region=\"center\" style=\"padding:0px;border:0px\">\n");
      if (_jspx_meth_t_datagrid_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tfunction addbytab(id,content) {\n");
      out.write("\t\taddOneTab('");
      if (_jspx_meth_t_mutiLang_0(_jspx_page_context))
        return;
      out.write("['+content+']' , \"cgformFtlController.do?cgformFtl2&formid=\"+id);\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t//数据库表生成表单\n");
      out.write("\tfunction addToData(title,url,id,a,b){\n");
      out.write("  \t\t$.dialog({\n");
      out.write("\t\t\tcontent: \"url:\"+url,\n");
      out.write("\t\t\tlock : true,\n");
      out.write("\t\t\ttitle: title,\n");
      out.write("\t\t\topacity : 0.3,\n");
      out.write("\t\t\twidth:400,\n");
      out.write("\t\t\theight:500,\n");
      out.write("\t\t\tcache:false,\n");
      out.write("\t\t    cancelVal: '");
      if (_jspx_meth_t_mutiLang_1(_jspx_page_context))
        return;
      out.write("',\n");
      out.write("\t\t    cancel: true,\n");
      out.write("            drag:false,max:false,min:false\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\tfunction delCgForm(id,name){\n");
      out.write("\n");
      out.write("\t\t$.dialog.confirm('");
      if (_jspx_meth_t_mutiLang_2(_jspx_page_context))
        return;
      out.write("', function(){\n");
      out.write("\t\t\tcheckIsExit(id,name);\n");
      out.write("\t\t}, function(){\n");
      out.write("\t\t}).zindex();\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\t//检查这个表是否已经存在了\n");
      out.write("\tfunction checkIsExit(id,name){\n");
      out.write("\t\t$.post(\"cgFormHeadController.do?checkIsExit&&name=\"+name,function(data){\n");
      out.write("\t\t\tvar d = $.parseJSON(data);\n");
      out.write("\t\t\tif (d.success) {\n");
      out.write("\t\t\t\t$.dialog.confirm('");
      if (_jspx_meth_t_mutiLang_3(_jspx_page_context))
        return;
      out.write("', function(){\n");
      out.write("\t\t\t\t\tdelThis(id);\n");
      out.write("\t\t\t\t}, function(){\n");
      out.write("\t\t\t\t}).zindex();\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\tdelThis(id);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\t//删除这个配置\n");
      out.write("\tfunction delThis(id){\n");
      out.write("\t\tdoSubmit(\"cgFormHeadController.do?del&id=\"+id,\"tablePropertyList\");\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction remCgForm(id){\n");
      out.write("\t\t$.dialog.confirm('");
      if (_jspx_meth_t_mutiLang_4(_jspx_page_context))
        return;
      out.write("', function(){\n");
      out.write("\t\t\tremoveThis(id);\n");
      out.write("\t\t}, function(){\n");
      out.write("\t\t}).zindex();\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction removeThis(id){\n");
      out.write("\t\tdoSubmit(\"cgFormHeadController.do?rem&id=\"+id,\"tablePropertyList\");\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction addlisttab(tableName,content){\n");
      out.write("\t\taddOneTab( '");
      if (_jspx_meth_t_mutiLang_5(_jspx_page_context))
        return;
      out.write("' + \"[\"+content+\"]\", \"cgAutoListController.do?list&id=\"+tableName);\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t//加校验参数，校验必填\n");
      out.write("\tfunction addForm(title,url,id,width,height){\n");
      out.write("\t\tgridname=id;\n");
      out.write("\t\tcreatewindow(title,url,width,height);\n");
      out.write("\t}\n");
      out.write("\tfunction updateForm(title,url,id,width,height){\n");
      out.write("\t\tgridname=id;\n");
      out.write("\t\tvar rowsData = $('#'+id).datagrid('getSelections');\n");
      out.write("\t\tif (!rowsData || rowsData.length==0) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_mutiLang_6(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\tif (rowsData.length>1) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_mutiLang_7(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\tcreatewindow(title,url + '&id='+rowsData[0].id,width,height);\n");
      out.write("\t}\n");
      out.write("\tfunction jsPlugin(title,url,id){\n");
      out.write("\t\tvar rowsData = $('#'+id).datagrid('getSelections');\n");
      out.write("\t\tif (!rowsData || rowsData.length==0) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_mutiLang_8(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\tif (rowsData.length>1) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_mutiLang_9(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\turl += '&id='+rowsData[0].id;\n");
      out.write("  \t\t$.dialog({\n");
      out.write("\t\t\tcontent: \"url:\"+url,\n");
      out.write("\t\t\tlock : true,\n");
      out.write("\t\t\ttitle:'");
      if (_jspx_meth_t_mutiLang_10(_jspx_page_context))
        return;
      out.write("' + \"[\"+rowData.content+\"]\",\n");
      out.write("\t\t\topacity : 0.3,\n");
      out.write("\t\t\twidth:900,\n");
      out.write("\t\t\theight:500,\n");
      out.write("\t\t\tcache:false,\n");
      out.write("\t\t    ok: function(){\n");
      out.write("\t\t    \tiframe = this.iframe.contentWindow;\n");
      out.write("\t\t    \tiframe.goForm();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t    },\n");
      out.write("\t\t    cancelVal: '");
      if (_jspx_meth_t_mutiLang_11(_jspx_page_context))
        return;
      out.write("',\n");
      out.write("\t\t    cancel: true /*为true等价于function(){}*/\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t/**\n");
      out.write("\t*\t弹出菜单链接\n");
      out.write("\t*/\n");
      out.write("\tfunction popMenuLink(tableName,content){\n");
      out.write("        $.dialog({\n");
      out.write("\t\t\tcontent: \"url:cgFormHeadController.do?popmenulink&url=cgAutoListController.do?list&title=\"+tableName,\n");
      out.write("\t\t\tdrag :false,\n");
      out.write("\t\t\tlock : true,\n");
      out.write("\t\t\ttitle:'");
      if (_jspx_meth_t_mutiLang_12(_jspx_page_context))
        return;
      out.write("' + '['+content+']',\n");
      out.write("\t\t\topacity : 0.3,\n");
      out.write("\t\t\twidth:400,\n");
      out.write("\t\t\theight:80,drag:false,min:false,max:false\n");
      out.write("\t\t}).zindex();\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t//自定义按钮\n");
      out.write("\tfunction cgFormButton(title,url,id){\n");
      out.write("\t\tvar rowsData = $('#'+id).datagrid('getSelections');\n");
      out.write("\t\tif (!rowsData || rowsData.length==0) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_mutiLang_13(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\tif (rowsData.length>1) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_mutiLang_14(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\turl += '&formId='+rowsData[0].id+\"&tableName=\"+rowsData[0].tableName;\n");
      out.write("\t\taddOneTab('");
      if (_jspx_meth_t_mutiLang_15(_jspx_page_context))
        return;
      out.write("', url);\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t//sql增强\n");
      out.write("\tfunction cgFormButtonSql(title,url,id){\n");
      out.write("\t\tvar rowsData = $('#'+id).datagrid('getSelections');\n");
      out.write("\t\tif (!rowsData || rowsData.length==0) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_mutiLang_16(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\tif (rowsData.length>1) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_mutiLang_17(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\turl += '&formId='+rowsData[0].id+\"&tableName=\"+rowsData[0].tableName;\n");
      out.write("\t\t//addOneTab(\"按钮sql增强\", url);\n");
      out.write("\t\t$.dialog({\n");
      out.write("\t\t\tcontent: \"url:\"+url,\n");
      out.write("\t\t\tlock : true,\n");
      out.write("\t\t\ttitle: '");
      if (_jspx_meth_t_mutiLang_18(_jspx_page_context))
        return;
      out.write("' + \"[\"+rowsData[0].content+\"]\",\n");
      out.write("\t\t\topacity : 0.3,\n");
      out.write("\t\t\twidth:1000,\n");
      out.write("\t\t\theight:500,\n");
      out.write("\t\t\tcache:false,\n");
      out.write("\t\t    ok: function(){\n");
      out.write("\t\t\t\tiframe = this.iframe.contentWindow;\n");
      out.write("\t\t\t\tsaveObj();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t    },\n");
      out.write("\t\t    cancelVal: '");
      if (_jspx_meth_t_mutiLang_19(_jspx_page_context))
        return;
      out.write("',\n");
      out.write("\t\t    cancel: true /*为true等价于function(){}*/\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t//js增强\n");
      out.write("\tfunction enhanceJs(title,url,id){\n");
      out.write("\t\tvar rowsData = $('#'+id).datagrid('getSelections');\n");
      out.write("\t\tif (!rowsData || rowsData.length==0) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_mutiLang_20(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\tif (rowsData.length>1) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_mutiLang_21(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\turl += '&formId='+rowsData[0].id+\"&tableName=\"+rowsData[0].tableName;\n");
      out.write("\t\t$.dialog({\n");
      out.write("\t\t\tcontent: \"url:\"+url,\n");
      out.write("\t\t\tlock : true,\n");
      out.write("\t\t\ttitle: '");
      if (_jspx_meth_t_mutiLang_22(_jspx_page_context))
        return;
      out.write("' + \"[\"+rowsData[0].content+\"]\",\n");
      out.write("\t\t\topacity : 0.3,\n");
      out.write("\t\t\twidth:1000,\n");
      out.write("\t\t\theight:500,\n");
      out.write("\t\t\tcache:false,\n");
      out.write("\t\t    ok: function(){\n");
      out.write("\t\t\t\tiframe = this.iframe.contentWindow;\n");
      out.write("\t\t\t\tsaveObj();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t    },\n");
      out.write("\t\t    cancelVal: '");
      if (_jspx_meth_t_mutiLang_23(_jspx_page_context))
        return;
      out.write("',\n");
      out.write("\t\t    cancel: true /*为true等价于function(){}*/\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t//java增强\n");
      out.write("\tfunction javaEnhance(title,url,id){\n");
      out.write("\t\tvar rowsData = $('#'+id).datagrid('getSelections');\n");
      out.write("\t\tif (!rowsData || rowsData.length==0) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_mutiLang_24(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\tif (rowsData.length>1) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_mutiLang_25(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\turl += '&formId='+rowsData[0].id+\"&tableName=\"+rowsData[0].tableName;\n");
      out.write("\t\t$.dialog({\n");
      out.write("\t\t\tcontent: \"url:\"+url,\n");
      out.write("\t\t\tlock : true,\n");
      out.write("\t\t\ttitle: '");
      if (_jspx_meth_t_mutiLang_26(_jspx_page_context))
        return;
      out.write("' + \"[\"+rowsData[0].content+\"]\",\n");
      out.write("\t\t\topacity : 0.3,\n");
      out.write("\t\t\twidth:500,\n");
      out.write("\t\t\theight:300,\n");
      out.write("\t\t\tcache:false,\n");
      out.write("\t\t    ok: function(){\n");
      out.write("\t\t\t\tiframe = this.iframe.contentWindow;\n");
      out.write("\t\t\t\tsaveObj();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t    },\n");
      out.write("\t\t    cancelVal: '");
      if (_jspx_meth_t_mutiLang_27(_jspx_page_context))
        return;
      out.write("',\n");
      out.write("\t\t    cancel: true /*为true等价于function(){}*/\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t//表单 sql导出\n");
      out.write("\tfunction doMigrateOut(title,url,id){\n");
      out.write("\t\tvar rowData = $('#'+id).datagrid('getSelected');\n");
      out.write("\t\tif (!rowData) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_mutiLang_28(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\turl += '&ids='+ getListSelections();\n");
      out.write("\t\twindow.location.href= url;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t//表单  sql导入\n");
      out.write("\tfunction toCgformMigrate(){\n");
      out.write("\t\topenuploadwin('");
      if (_jspx_meth_t_mutiLang_29(_jspx_page_context))
        return;
      out.write("', 'cgformSqlController.do?toCgformMigrate', \"tablePropertyList\");\n");
      out.write("\t}\n");
      out.write("\t//代码生成\n");
      out.write("\tfunction generate(title,url,id){\n");
      out.write("\t\tvar rowsData = $('#'+id).datagrid('getSelections');\n");
      out.write("\t\tif (!rowsData || rowsData.length==0) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_mutiLang_30(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\tif (rowsData.length>1) {\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_mutiLang_31(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\t//附表不能生成代码\n");
      out.write("\t\tif(\"3\" == rowsData[0].jformType){\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_mutiLang_32(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t//未激活的表，不允许生成代码\n");
      out.write("\t\tif(\"N\" == rowsData[0].isDbSynch){\n");
      out.write("\t\t\ttip('");
      if (_jspx_meth_t_mutiLang_33(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\turl += '&id='+rowsData[0].id;\n");
      out.write("\t\t$.dialog({\n");
      out.write("\t\t\tcontent: \"url:\"+url,\n");
      out.write("\t\t\tlock : true,\n");
      out.write("\t\t\ttitle: '");
      if (_jspx_meth_t_mutiLang_34(_jspx_page_context))
        return;
      out.write("' + \" [\"+rowsData[0].content+\"]\",\n");
      out.write("\t\t\topacity : 0.3,\n");
      out.write("\t\t\twidth:1250,\n");
      out.write("\t\t\tzIndex: getzIndex(),\n");
      out.write("\t\t\theight:500,\n");
      out.write("\t\t\tcache:false,\n");
      out.write("\t\t    ok: function(){\n");
      out.write("\t\t\t\tiframe = this.iframe.contentWindow;\n");
      out.write("\t\t\t\tsaveObj();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t    },\n");
      out.write("\t\t    cancelVal: '");
      if (_jspx_meth_t_mutiLang_35(_jspx_page_context))
        return;
      out.write("',\n");
      out.write("\t\t    cancel: true /*为true等价于function(){}*/\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t/**\n");
      out.write("\t * 获取列表中选中行的数据（多行）\n");
      out.write("\t * @param field 数据中字段名-不传此参数则获取全部数据\n");
      out.write("\t * @return 选中行的给定字段值，以逗号分隔\n");
      out.write("\t */\n");
      out.write("\tfunction getListSelections(){\n");
      out.write("\t\tvar ids = '';\n");
      out.write("\t\tvar rows = $(\"#tablePropertyList\").datagrid(\"getSelections\");\n");
      out.write("\t\tfor(var i=0;i<rows.length;i++){\n");
      out.write("\t\t\tids+=rows[i].id;\n");
      out.write("\t\t\tids+=',';\n");
      out.write("\t\t}\n");
      out.write("\t\tids = ids.substring(0,ids.length-1);\n");
      out.write("\t\treturn ids;\n");
      out.write("\t}\t\n");
      out.write("\t\n");
      out.write("\t/**\n");
      out.write("\t * 以多种方式同步数据库\n");
      out.write("\t * @param id 表单id\n");
      out.write("\t */\n");
      out.write("\tfunction doDbsynch(id,content){\n");
      out.write("\t\tvar url = \"url:cgFormHeadController.do?goCgFormSynChoice\";\n");
      out.write("\t\t$.dialog({\n");
      out.write("\t\t\tcontent: url,\n");
      out.write("\t\t\tdrag :false,\n");
      out.write("\t\t\tlock : true,\n");
      out.write("\t\t\ttitle: '");
      if (_jspx_meth_t_mutiLang_36(_jspx_page_context))
        return;
      out.write("' + '['+content+']',\n");
      out.write("\t\t\topacity : 0.3,\n");
      out.write("\t\t\twidth:400,\n");
      out.write("\t\t\theight:100,\n");
      out.write("\t\t\tcache:false,\n");
      out.write("\t\t    cancelVal: '");
      if (_jspx_meth_t_mutiLang_37(_jspx_page_context))
        return;
      out.write("',\n");
      out.write("\t\t    cancel: function(){},\n");
      out.write("\t\t    button : [{\n");
      out.write("\t\t    \tid : \"okBtn\",\n");
      out.write("\t\t    \tname : '");
      if (_jspx_meth_t_mutiLang_38(_jspx_page_context))
        return;
      out.write("',\n");
      out.write("\t\t    \tcallback : function () {\n");
      out.write("\t\t    \t\tiframe = this.iframe.contentWindow;\n");
      out.write("\t\t    \t\tvar synchoice = iframe.getSynChoice();\n");
      out.write("\t\t    \t\tif(synchoice){\n");
      out.write("\t\t\t\t\t\tvar submitUrl = 'cgFormHeadController.do?doDbSynch&id='+id+'&synMethod='+synchoice;\n");
      out.write("\t\t\t\t\t\tdoSubmit(submitUrl,'tablePropertyList');\n");
      out.write("\t\t\t\t    }else{\n");
      out.write("\t\t\t\t\t\talert('");
      if (_jspx_meth_t_mutiLang_39(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t    \t}\n");
      out.write("\t\t    }]\n");
      out.write("\t\t}).zindex();\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction importFields(id,content) {\n");
      out.write("\t\topenuploadwin('【'+content+'】Excel导入Online字段', 'cgFormHeadController.do?upload&id='+id, \"tablePropertyList\");\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t//表单复制功能,一个物理表配置多个配置表\n");
      out.write("\tfunction copyOnline(id){\n");
      out.write("\t\t$.dialog.confirm('");
      if (_jspx_meth_t_mutiLang_40(_jspx_page_context))
        return;
      out.write("', function(){\n");
      out.write("\t\t\t$.post(\"cgFormHeadController.do?copyOnline\",\n");
      out.write("\t\t\t\t\t{id : id},\t\n");
      out.write("\t\t\t\t\tfunction(data){\n");
      out.write("\t\t\t\t\tvar d = $.parseJSON(data);\n");
      out.write("\t\t\t\t\tif (d.success) {\n");
      out.write("\t\t\t\t\t\ttip(d.msg);\n");
      out.write("\n");
      out.write("\t\t\t\t\t\treloadTable();\n");
      out.write("\n");
      out.write("\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\ttip(d.msg);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t}, function(){\n");
      out.write("\t\t}).zindex();\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction propertyTable(id){\n");
      out.write("\t\t$.post(\"cgFormHeadController.do?getConfigId\",\n");
      out.write("\t\t\t\t{id : id},\t\n");
      out.write("\t\t\t\tfunction(data){\n");
      out.write("\t\t\t\tvar d = $.parseJSON(data);\n");
      out.write("\t\t\t\tif (d.success) {\n");
      out.write("\t\t\t\t\taddOneTab( 'Online配置表单开发', \"cgFormHeadController.do?cgFormHeadConfigList&id=\"+d.obj);\n");
      out.write("\t\t\t\t}else{\n");
      out.write("\t\t\t\t\ttip(d.msg);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t}\n");
      out.write("</script>\n");
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

  private boolean _jspx_meth_t_datagrid_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:datagrid
    org.jeecgframework.tag.core.easyui.DataGridTag _jspx_th_t_datagrid_0 = (org.jeecgframework.tag.core.easyui.DataGridTag) _jspx_tagPool_t_datagrid_title_sortOrder_sortName_queryMode_name_idField_fitColumns_fit_checkbox_btnCls_actionUrl.get(org.jeecgframework.tag.core.easyui.DataGridTag.class);
    _jspx_th_t_datagrid_0.setPageContext(_jspx_page_context);
    _jspx_th_t_datagrid_0.setParent(null);
    _jspx_th_t_datagrid_0.setSortName("createDate");
    _jspx_th_t_datagrid_0.setSortOrder("desc");
    _jspx_th_t_datagrid_0.setName("tablePropertyList");
    _jspx_th_t_datagrid_0.setTitle("smart.form.config");
    _jspx_th_t_datagrid_0.setFitColumns(true);
    _jspx_th_t_datagrid_0.setActionUrl("cgFormHeadController.do?datagrid");
    _jspx_th_t_datagrid_0.setIdField("id");
    _jspx_th_t_datagrid_0.setFit(true);
    _jspx_th_t_datagrid_0.setQueryMode("group");
    _jspx_th_t_datagrid_0.setCheckbox(true);
    _jspx_th_t_datagrid_0.setBtnCls("bootstrap");
    int _jspx_eval_t_datagrid_0 = _jspx_th_t_datagrid_0.doStartTag();
    if (_jspx_eval_t_datagrid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgCol_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgCol_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgCol_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgCol_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgCol_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgCol_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgCol_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgCol_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgCol_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgCol_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgCol_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgCol_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgCol_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgCol_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgCol_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgCol_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgCol_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgFunOpt_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgFunOpt_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgFunOpt_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgFunOpt_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgFunOpt_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgFunOpt_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgFunOpt_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgFunOpt_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgToolBar_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgToolBar_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgToolBar_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgToolBar_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgToolBar_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgToolBar_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgToolBar_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgToolBar_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgToolBar_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_dgToolBar_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        int evalDoAfterBody = _jspx_th_t_datagrid_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_datagrid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_datagrid_title_sortOrder_sortName_queryMode_name_idField_fitColumns_fit_checkbox_btnCls_actionUrl.reuse(_jspx_th_t_datagrid_0);
      return true;
    }
    _jspx_tagPool_t_datagrid_title_sortOrder_sortName_queryMode_name_idField_fitColumns_fit_checkbox_btnCls_actionUrl.reuse(_jspx_th_t_datagrid_0);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_0 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_title_hidden_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_0.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_0.setTitle("common.id");
    _jspx_th_t_dgCol_0.setField("id");
    _jspx_th_t_dgCol_0.setHidden(true);
    int _jspx_eval_t_dgCol_0 = _jspx_th_t_dgCol_0.doStartTag();
    if (_jspx_th_t_dgCol_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_title_hidden_field_nobody.reuse(_jspx_th_t_dgCol_0);
      return true;
    }
    _jspx_tagPool_t_dgCol_title_hidden_field_nobody.reuse(_jspx_th_t_dgCol_0);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_1 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_title_hidden_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_1.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_1.setTitle("hasPeizhi");
    _jspx_th_t_dgCol_1.setField("hasPeizhi");
    _jspx_th_t_dgCol_1.setHidden(true);
    int _jspx_eval_t_dgCol_1 = _jspx_th_t_dgCol_1.doStartTag();
    if (_jspx_th_t_dgCol_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_title_hidden_field_nobody.reuse(_jspx_th_t_dgCol_1);
      return true;
    }
    _jspx_tagPool_t_dgCol_title_hidden_field_nobody.reuse(_jspx_th_t_dgCol_1);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_2 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_replace_query_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_2.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_2.setTitle("table.type");
    _jspx_th_t_dgCol_2.setField("jformType");
    _jspx_th_t_dgCol_2.setReplace("single.table_1,master.table_2,slave.table_3");
    _jspx_th_t_dgCol_2.setQuery(true);
    _jspx_th_t_dgCol_2.setWidth(new Integer(60));
    int _jspx_eval_t_dgCol_2 = _jspx_th_t_dgCol_2.doStartTag();
    if (_jspx_th_t_dgCol_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_replace_query_field_nobody.reuse(_jspx_th_t_dgCol_2);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_replace_query_field_nobody.reuse(_jspx_th_t_dgCol_2);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_3(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_3 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_query_field_autocomplete_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_3.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_3.setTitle("table.name");
    _jspx_th_t_dgCol_3.setField("tableName");
    _jspx_th_t_dgCol_3.setQuery(true);
    _jspx_th_t_dgCol_3.setAutocomplete(true);
    _jspx_th_t_dgCol_3.setWidth(new Integer(150));
    int _jspx_eval_t_dgCol_3 = _jspx_th_t_dgCol_3.doStartTag();
    if (_jspx_th_t_dgCol_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_query_field_autocomplete_nobody.reuse(_jspx_th_t_dgCol_3);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_query_field_autocomplete_nobody.reuse(_jspx_th_t_dgCol_3);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_4(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_4 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_field_dictionary_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_4.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_4.setTitle("form.category");
    _jspx_th_t_dgCol_4.setField("jformCategory");
    _jspx_th_t_dgCol_4.setDictionary("bdfl");
    _jspx_th_t_dgCol_4.setWidth(new Integer(80));
    int _jspx_eval_t_dgCol_4 = _jspx_th_t_dgCol_4.doStartTag();
    if (_jspx_th_t_dgCol_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_field_dictionary_nobody.reuse(_jspx_th_t_dgCol_4);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_field_dictionary_nobody.reuse(_jspx_th_t_dgCol_4);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_5(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_5 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_5.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_5.setTitle("table.description");
    _jspx_th_t_dgCol_5.setField("content");
    _jspx_th_t_dgCol_5.setWidth(new Integer(150));
    int _jspx_eval_t_dgCol_5 = _jspx_th_t_dgCol_5.doStartTag();
    if (_jspx_th_t_dgCol_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_field_nobody.reuse(_jspx_th_t_dgCol_5);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_field_nobody.reuse(_jspx_th_t_dgCol_5);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_6(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_6 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_6.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_6.setTitle("common.version");
    _jspx_th_t_dgCol_6.setField("jformVersion");
    _jspx_th_t_dgCol_6.setWidth(new Integer(50));
    int _jspx_eval_t_dgCol_6 = _jspx_th_t_dgCol_6.doStartTag();
    if (_jspx_th_t_dgCol_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_field_nobody.reuse(_jspx_th_t_dgCol_6);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_field_nobody.reuse(_jspx_th_t_dgCol_6);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_7(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_7 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_replace_hidden_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_7.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_7.setTitle("is.tree");
    _jspx_th_t_dgCol_7.setField("isTree");
    _jspx_th_t_dgCol_7.setHidden(true);
    _jspx_th_t_dgCol_7.setReplace("common.yes_Y,common.no_N");
    _jspx_th_t_dgCol_7.setWidth(new Integer(60));
    int _jspx_eval_t_dgCol_7 = _jspx_th_t_dgCol_7.doStartTag();
    if (_jspx_th_t_dgCol_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_replace_hidden_field_nobody.reuse(_jspx_th_t_dgCol_7);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_replace_hidden_field_nobody.reuse(_jspx_th_t_dgCol_7);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_8(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_8 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_replace_hidden_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_8.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_8.setTitle("is.page");
    _jspx_th_t_dgCol_8.setField("isPagination");
    _jspx_th_t_dgCol_8.setHidden(true);
    _jspx_th_t_dgCol_8.setReplace("common.yes_Y,common.no_N");
    _jspx_th_t_dgCol_8.setWidth(new Integer(60));
    int _jspx_eval_t_dgCol_8 = _jspx_th_t_dgCol_8.doStartTag();
    if (_jspx_th_t_dgCol_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_replace_hidden_field_nobody.reuse(_jspx_th_t_dgCol_8);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_replace_hidden_field_nobody.reuse(_jspx_th_t_dgCol_8);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_9(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_9 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_style_replace_query_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_9.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_9.setTitle("sync.db");
    _jspx_th_t_dgCol_9.setField("isDbSynch");
    _jspx_th_t_dgCol_9.setReplace("has.sync_Y,have.nosync_N");
    _jspx_th_t_dgCol_9.setStyle("background:red;_N");
    _jspx_th_t_dgCol_9.setQuery(true);
    _jspx_th_t_dgCol_9.setWidth(new Integer(80));
    int _jspx_eval_t_dgCol_9 = _jspx_th_t_dgCol_9.doStartTag();
    if (_jspx_th_t_dgCol_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_style_replace_query_field_nobody.reuse(_jspx_th_t_dgCol_9);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_style_replace_query_field_nobody.reuse(_jspx_th_t_dgCol_9);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_10(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_10 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_replace_hidden_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_10.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_10.setTitle("show.checkbox");
    _jspx_th_t_dgCol_10.setField("isCheckbox");
    _jspx_th_t_dgCol_10.setHidden(true);
    _jspx_th_t_dgCol_10.setReplace("common.yes_Y,common.no_N");
    _jspx_th_t_dgCol_10.setWidth(new Integer(60));
    int _jspx_eval_t_dgCol_10 = _jspx_th_t_dgCol_10.doStartTag();
    if (_jspx_th_t_dgCol_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_replace_hidden_field_nobody.reuse(_jspx_th_t_dgCol_10);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_replace_hidden_field_nobody.reuse(_jspx_th_t_dgCol_10);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_11(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_11 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_hidden_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_11.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_11.setTitle("common.query.module");
    _jspx_th_t_dgCol_11.setField("querymode");
    _jspx_th_t_dgCol_11.setHidden(true);
    _jspx_th_t_dgCol_11.setWidth(new Integer(100));
    int _jspx_eval_t_dgCol_11 = _jspx_th_t_dgCol_11.doStartTag();
    if (_jspx_th_t_dgCol_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_hidden_field_nobody.reuse(_jspx_th_t_dgCol_11);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_hidden_field_nobody.reuse(_jspx_th_t_dgCol_11);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_12(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_12 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_title_hidden_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_12.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_12.setTitle("common.createby");
    _jspx_th_t_dgCol_12.setField("createBy");
    _jspx_th_t_dgCol_12.setHidden(true);
    int _jspx_eval_t_dgCol_12 = _jspx_th_t_dgCol_12.doStartTag();
    if (_jspx_th_t_dgCol_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_title_hidden_field_nobody.reuse(_jspx_th_t_dgCol_12);
      return true;
    }
    _jspx_tagPool_t_dgCol_title_hidden_field_nobody.reuse(_jspx_th_t_dgCol_12);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_13(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_13 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_title_hidden_formatter_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_13.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_13.setTitle("common.createtime");
    _jspx_th_t_dgCol_13.setField("createDate");
    _jspx_th_t_dgCol_13.setFormatter("yyyy/MM/dd");
    _jspx_th_t_dgCol_13.setHidden(true);
    int _jspx_eval_t_dgCol_13 = _jspx_th_t_dgCol_13.doStartTag();
    if (_jspx_th_t_dgCol_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_title_hidden_formatter_field_nobody.reuse(_jspx_th_t_dgCol_13);
      return true;
    }
    _jspx_tagPool_t_dgCol_title_hidden_formatter_field_nobody.reuse(_jspx_th_t_dgCol_13);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_14(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_14 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_title_hidden_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_14.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_14.setTitle("common.updateby");
    _jspx_th_t_dgCol_14.setField("updateBy");
    _jspx_th_t_dgCol_14.setHidden(true);
    int _jspx_eval_t_dgCol_14 = _jspx_th_t_dgCol_14.doStartTag();
    if (_jspx_th_t_dgCol_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_title_hidden_field_nobody.reuse(_jspx_th_t_dgCol_14);
      return true;
    }
    _jspx_tagPool_t_dgCol_title_hidden_field_nobody.reuse(_jspx_th_t_dgCol_14);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_15(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_15 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_title_hidden_formatter_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_15.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_15.setTitle("common.updatetime");
    _jspx_th_t_dgCol_15.setField("updateDate");
    _jspx_th_t_dgCol_15.setFormatter("yyyy/MM/dd");
    _jspx_th_t_dgCol_15.setHidden(true);
    int _jspx_eval_t_dgCol_15 = _jspx_th_t_dgCol_15.doStartTag();
    if (_jspx_th_t_dgCol_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_title_hidden_formatter_field_nobody.reuse(_jspx_th_t_dgCol_15);
      return true;
    }
    _jspx_tagPool_t_dgCol_title_hidden_formatter_field_nobody.reuse(_jspx_th_t_dgCol_15);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_16(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_16 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_16.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_16.setTitle("common.operation");
    _jspx_th_t_dgCol_16.setField("opt");
    _jspx_th_t_dgCol_16.setWidth(new Integer(500));
    int _jspx_eval_t_dgCol_16 = _jspx_th_t_dgCol_16.doStartTag();
    if (_jspx_th_t_dgCol_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_field_nobody.reuse(_jspx_th_t_dgCol_16);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_field_nobody.reuse(_jspx_th_t_dgCol_16);
    return false;
  }

  private boolean _jspx_meth_t_dgFunOpt_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgFunOpt
    org.jeecgframework.tag.core.easyui.DataGridFunOptTag _jspx_th_t_dgFunOpt_0 = (org.jeecgframework.tag.core.easyui.DataGridFunOptTag) _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_urlStyle_title_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridFunOptTag.class);
    _jspx_th_t_dgFunOpt_0.setPageContext(_jspx_page_context);
    _jspx_th_t_dgFunOpt_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgFunOpt_0.setFunname("delCgForm(id,tableName)");
    _jspx_th_t_dgFunOpt_0.setTitle("common.delete");
    _jspx_th_t_dgFunOpt_0.setUrlclass("ace_button");
    _jspx_th_t_dgFunOpt_0.setUrlStyle("background-color:#ec4758;");
    _jspx_th_t_dgFunOpt_0.setUrlfont("fa-trash-o");
    int _jspx_eval_t_dgFunOpt_0 = _jspx_th_t_dgFunOpt_0.doStartTag();
    if (_jspx_th_t_dgFunOpt_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_urlStyle_title_funname_nobody.reuse(_jspx_th_t_dgFunOpt_0);
      return true;
    }
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_urlStyle_title_funname_nobody.reuse(_jspx_th_t_dgFunOpt_0);
    return false;
  }

  private boolean _jspx_meth_t_dgFunOpt_1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgFunOpt
    org.jeecgframework.tag.core.easyui.DataGridFunOptTag _jspx_th_t_dgFunOpt_1 = (org.jeecgframework.tag.core.easyui.DataGridFunOptTag) _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_urlStyle_title_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridFunOptTag.class);
    _jspx_th_t_dgFunOpt_1.setPageContext(_jspx_page_context);
    _jspx_th_t_dgFunOpt_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgFunOpt_1.setFunname("remCgForm(id)");
    _jspx_th_t_dgFunOpt_1.setTitle("common.remove");
    _jspx_th_t_dgFunOpt_1.setUrlclass("ace_button");
    _jspx_th_t_dgFunOpt_1.setUrlStyle("background-color:#FFA500;");
    _jspx_th_t_dgFunOpt_1.setUrlfont("fa-remove");
    int _jspx_eval_t_dgFunOpt_1 = _jspx_th_t_dgFunOpt_1.doStartTag();
    if (_jspx_th_t_dgFunOpt_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_urlStyle_title_funname_nobody.reuse(_jspx_th_t_dgFunOpt_1);
      return true;
    }
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_urlStyle_title_funname_nobody.reuse(_jspx_th_t_dgFunOpt_1);
    return false;
  }

  private boolean _jspx_meth_t_dgFunOpt_2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgFunOpt
    org.jeecgframework.tag.core.easyui.DataGridFunOptTag _jspx_th_t_dgFunOpt_2 = (org.jeecgframework.tag.core.easyui.DataGridFunOptTag) _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_exp_nobody.get(org.jeecgframework.tag.core.easyui.DataGridFunOptTag.class);
    _jspx_th_t_dgFunOpt_2.setPageContext(_jspx_page_context);
    _jspx_th_t_dgFunOpt_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgFunOpt_2.setExp("isDbSynch#eq#N");
    _jspx_th_t_dgFunOpt_2.setTitle("sync.db");
    _jspx_th_t_dgFunOpt_2.setFunname("doDbsynch(id,content)");
    _jspx_th_t_dgFunOpt_2.setUrlclass("ace_button");
    _jspx_th_t_dgFunOpt_2.setUrlfont("fa-database");
    int _jspx_eval_t_dgFunOpt_2 = _jspx_th_t_dgFunOpt_2.doStartTag();
    if (_jspx_th_t_dgFunOpt_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_exp_nobody.reuse(_jspx_th_t_dgFunOpt_2);
      return true;
    }
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_exp_nobody.reuse(_jspx_th_t_dgFunOpt_2);
    return false;
  }

  private boolean _jspx_meth_t_dgFunOpt_3(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgFunOpt
    org.jeecgframework.tag.core.easyui.DataGridFunOptTag _jspx_th_t_dgFunOpt_3 = (org.jeecgframework.tag.core.easyui.DataGridFunOptTag) _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_exp_nobody.get(org.jeecgframework.tag.core.easyui.DataGridFunOptTag.class);
    _jspx_th_t_dgFunOpt_3.setPageContext(_jspx_page_context);
    _jspx_th_t_dgFunOpt_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgFunOpt_3.setExp("isDbSynch#eq#Y&&jformType#ne#3");
    _jspx_th_t_dgFunOpt_3.setFunname("addbytab(id,content)");
    _jspx_th_t_dgFunOpt_3.setTitle("form.template");
    _jspx_th_t_dgFunOpt_3.setUrlclass("ace_button");
    _jspx_th_t_dgFunOpt_3.setUrlfont("fa-cog");
    int _jspx_eval_t_dgFunOpt_3 = _jspx_th_t_dgFunOpt_3.doStartTag();
    if (_jspx_th_t_dgFunOpt_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_exp_nobody.reuse(_jspx_th_t_dgFunOpt_3);
      return true;
    }
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_exp_nobody.reuse(_jspx_th_t_dgFunOpt_3);
    return false;
  }

  private boolean _jspx_meth_t_dgFunOpt_4(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgFunOpt
    org.jeecgframework.tag.core.easyui.DataGridFunOptTag _jspx_th_t_dgFunOpt_4 = (org.jeecgframework.tag.core.easyui.DataGridFunOptTag) _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_urlStyle_title_funname_exp_nobody.get(org.jeecgframework.tag.core.easyui.DataGridFunOptTag.class);
    _jspx_th_t_dgFunOpt_4.setPageContext(_jspx_page_context);
    _jspx_th_t_dgFunOpt_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgFunOpt_4.setExp("isDbSynch#eq#Y&&jformType#ne#3");
    _jspx_th_t_dgFunOpt_4.setFunname("addlisttab(tableName,content)");
    _jspx_th_t_dgFunOpt_4.setTitle("function.test");
    _jspx_th_t_dgFunOpt_4.setUrlStyle("background-color:#18a689;");
    _jspx_th_t_dgFunOpt_4.setUrlclass("ace_button");
    _jspx_th_t_dgFunOpt_4.setUrlfont("fa-gavel");
    int _jspx_eval_t_dgFunOpt_4 = _jspx_th_t_dgFunOpt_4.doStartTag();
    if (_jspx_th_t_dgFunOpt_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_urlStyle_title_funname_exp_nobody.reuse(_jspx_th_t_dgFunOpt_4);
      return true;
    }
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_urlStyle_title_funname_exp_nobody.reuse(_jspx_th_t_dgFunOpt_4);
    return false;
  }

  private boolean _jspx_meth_t_dgFunOpt_5(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgFunOpt
    org.jeecgframework.tag.core.easyui.DataGridFunOptTag _jspx_th_t_dgFunOpt_5 = (org.jeecgframework.tag.core.easyui.DataGridFunOptTag) _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_urlStyle_title_funname_exp_nobody.get(org.jeecgframework.tag.core.easyui.DataGridFunOptTag.class);
    _jspx_th_t_dgFunOpt_5.setPageContext(_jspx_page_context);
    _jspx_th_t_dgFunOpt_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgFunOpt_5.setExp("isDbSynch#eq#Y&&jformType#ne#3");
    _jspx_th_t_dgFunOpt_5.setFunname("popMenuLink(tableName,content)");
    _jspx_th_t_dgFunOpt_5.setTitle("config.place");
    _jspx_th_t_dgFunOpt_5.setUrlStyle("background-color:#1a7bb9;");
    _jspx_th_t_dgFunOpt_5.setUrlclass("ace_button");
    _jspx_th_t_dgFunOpt_5.setUrlfont("fa-cog");
    int _jspx_eval_t_dgFunOpt_5 = _jspx_th_t_dgFunOpt_5.doStartTag();
    if (_jspx_th_t_dgFunOpt_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_urlStyle_title_funname_exp_nobody.reuse(_jspx_th_t_dgFunOpt_5);
      return true;
    }
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_urlStyle_title_funname_exp_nobody.reuse(_jspx_th_t_dgFunOpt_5);
    return false;
  }

  private boolean _jspx_meth_t_dgFunOpt_6(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgFunOpt
    org.jeecgframework.tag.core.easyui.DataGridFunOptTag _jspx_th_t_dgFunOpt_6 = (org.jeecgframework.tag.core.easyui.DataGridFunOptTag) _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_operationCode_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridFunOptTag.class);
    _jspx_th_t_dgFunOpt_6.setPageContext(_jspx_page_context);
    _jspx_th_t_dgFunOpt_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgFunOpt_6.setFunname("copyOnline(id)");
    _jspx_th_t_dgFunOpt_6.setTitle("复制表单");
    _jspx_th_t_dgFunOpt_6.setOperationCode("copyOnlineTable");
    _jspx_th_t_dgFunOpt_6.setUrlclass("ace_button");
    _jspx_th_t_dgFunOpt_6.setUrlfont("fa-copy");
    int _jspx_eval_t_dgFunOpt_6 = _jspx_th_t_dgFunOpt_6.doStartTag();
    if (_jspx_th_t_dgFunOpt_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_operationCode_funname_nobody.reuse(_jspx_th_t_dgFunOpt_6);
      return true;
    }
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_operationCode_funname_nobody.reuse(_jspx_th_t_dgFunOpt_6);
    return false;
  }

  private boolean _jspx_meth_t_dgFunOpt_7(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgFunOpt
    org.jeecgframework.tag.core.easyui.DataGridFunOptTag _jspx_th_t_dgFunOpt_7 = (org.jeecgframework.tag.core.easyui.DataGridFunOptTag) _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_exp_nobody.get(org.jeecgframework.tag.core.easyui.DataGridFunOptTag.class);
    _jspx_th_t_dgFunOpt_7.setPageContext(_jspx_page_context);
    _jspx_th_t_dgFunOpt_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgFunOpt_7.setExp("hasPeizhi#ne#0");
    _jspx_th_t_dgFunOpt_7.setFunname("propertyTable(id)");
    _jspx_th_t_dgFunOpt_7.setTitle("配置表");
    _jspx_th_t_dgFunOpt_7.setUrlclass("ace_button");
    _jspx_th_t_dgFunOpt_7.setUrlfont("fa-cog");
    int _jspx_eval_t_dgFunOpt_7 = _jspx_th_t_dgFunOpt_7.doStartTag();
    if (_jspx_th_t_dgFunOpt_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_exp_nobody.reuse(_jspx_th_t_dgFunOpt_7);
      return true;
    }
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_exp_nobody.reuse(_jspx_th_t_dgFunOpt_7);
    return false;
  }

  private boolean _jspx_meth_t_dgToolBar_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_0 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_width_url_title_icon_height_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_0.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_0.setTitle("create.form");
    _jspx_th_t_dgToolBar_0.setIcon("fa fa-plus");
    _jspx_th_t_dgToolBar_0.setWidth("100%");
    _jspx_th_t_dgToolBar_0.setHeight("100%");
    _jspx_th_t_dgToolBar_0.setUrl("cgFormHeadController.do?addorupdate");
    _jspx_th_t_dgToolBar_0.setFunname("addForm");
    int _jspx_eval_t_dgToolBar_0 = _jspx_th_t_dgToolBar_0.doStartTag();
    if (_jspx_th_t_dgToolBar_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_width_url_title_icon_height_funname_nobody.reuse(_jspx_th_t_dgToolBar_0);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_width_url_title_icon_height_funname_nobody.reuse(_jspx_th_t_dgToolBar_0);
    return false;
  }

  private boolean _jspx_meth_t_dgToolBar_1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_1 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_width_url_title_icon_height_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_1.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_1.setTitle("edit.form");
    _jspx_th_t_dgToolBar_1.setIcon("fa fa-edit");
    _jspx_th_t_dgToolBar_1.setWidth("100%");
    _jspx_th_t_dgToolBar_1.setHeight("100%");
    _jspx_th_t_dgToolBar_1.setUrl("cgFormHeadController.do?addorupdate");
    _jspx_th_t_dgToolBar_1.setFunname("updateForm");
    int _jspx_eval_t_dgToolBar_1 = _jspx_th_t_dgToolBar_1.doStartTag();
    if (_jspx_th_t_dgToolBar_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_width_url_title_icon_height_funname_nobody.reuse(_jspx_th_t_dgToolBar_1);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_width_url_title_icon_height_funname_nobody.reuse(_jspx_th_t_dgToolBar_1);
    return false;
  }

  private boolean _jspx_meth_t_dgToolBar_2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_2 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_url_title_icon_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_2.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_2.setTitle("custom.button");
    _jspx_th_t_dgToolBar_2.setIcon("fa fa-bars");
    _jspx_th_t_dgToolBar_2.setUrl("cgformButtonController.do?cgformButton");
    _jspx_th_t_dgToolBar_2.setFunname("cgFormButton");
    int _jspx_eval_t_dgToolBar_2 = _jspx_th_t_dgToolBar_2.doStartTag();
    if (_jspx_th_t_dgToolBar_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_url_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_2);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_url_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_2);
    return false;
  }

  private boolean _jspx_meth_t_dgToolBar_3(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_3 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_url_title_icon_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_3.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_3.setTitle("js.enhance");
    _jspx_th_t_dgToolBar_3.setIcon("fa fa-strikethrough");
    _jspx_th_t_dgToolBar_3.setUrl("cgformEnhanceJsController.do?addorupdate");
    _jspx_th_t_dgToolBar_3.setFunname("enhanceJs");
    int _jspx_eval_t_dgToolBar_3 = _jspx_th_t_dgToolBar_3.doStartTag();
    if (_jspx_th_t_dgToolBar_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_url_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_3);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_url_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_3);
    return false;
  }

  private boolean _jspx_meth_t_dgToolBar_4(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_4 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_url_title_operationCode_icon_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_4.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_4.setTitle("sql.enhance");
    _jspx_th_t_dgToolBar_4.setIcon("fa fa-filter");
    _jspx_th_t_dgToolBar_4.setUrl("cgformButtonSqlController.do?addorupdate");
    _jspx_th_t_dgToolBar_4.setOperationCode("sql_enhance");
    _jspx_th_t_dgToolBar_4.setFunname("cgFormButtonSql");
    int _jspx_eval_t_dgToolBar_4 = _jspx_th_t_dgToolBar_4.doStartTag();
    if (_jspx_th_t_dgToolBar_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_url_title_operationCode_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_4);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_url_title_operationCode_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_4);
    return false;
  }

  private boolean _jspx_meth_t_dgToolBar_5(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_5 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_url_title_icon_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_5.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_5.setTitle("java.enhance");
    _jspx_th_t_dgToolBar_5.setIcon("fa fa-wrench");
    _jspx_th_t_dgToolBar_5.setUrl("cgformEnhanceJavaController.do?addorupdate");
    _jspx_th_t_dgToolBar_5.setFunname("javaEnhance");
    int _jspx_eval_t_dgToolBar_5 = _jspx_th_t_dgToolBar_5.doStartTag();
    if (_jspx_th_t_dgToolBar_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_url_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_5);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_url_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_5);
    return false;
  }

  private boolean _jspx_meth_t_dgToolBar_6(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_6 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_url_title_icon_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_6.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_6.setTitle("form.export");
    _jspx_th_t_dgToolBar_6.setIcon("fa fa-download");
    _jspx_th_t_dgToolBar_6.setUrl("cgformSqlController.do?doMigrateOut");
    _jspx_th_t_dgToolBar_6.setFunname("doMigrateOut");
    int _jspx_eval_t_dgToolBar_6 = _jspx_th_t_dgToolBar_6.doStartTag();
    if (_jspx_th_t_dgToolBar_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_url_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_6);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_url_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_6);
    return false;
  }

  private boolean _jspx_meth_t_dgToolBar_7(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_7 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_url_title_operationCode_icon_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_7.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_7.setTitle("form.import");
    _jspx_th_t_dgToolBar_7.setOperationCode("form_import");
    _jspx_th_t_dgToolBar_7.setIcon("fa fa-upload");
    _jspx_th_t_dgToolBar_7.setUrl("cgformSqlController.do?inSqlFile");
    _jspx_th_t_dgToolBar_7.setFunname("toCgformMigrate");
    int _jspx_eval_t_dgToolBar_7 = _jspx_th_t_dgToolBar_7.doStartTag();
    if (_jspx_th_t_dgToolBar_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_url_title_operationCode_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_7);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_url_title_operationCode_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_7);
    return false;
  }

  private boolean _jspx_meth_t_dgToolBar_8(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_8 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_url_title_operationCode_icon_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_8.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_8.setTitle("code.generate");
    _jspx_th_t_dgToolBar_8.setOperationCode("code_generate");
    _jspx_th_t_dgToolBar_8.setIcon("fa fa-spinner");
    _jspx_th_t_dgToolBar_8.setUrl("generateController.do?gogenerate");
    _jspx_th_t_dgToolBar_8.setFunname("generate");
    int _jspx_eval_t_dgToolBar_8 = _jspx_th_t_dgToolBar_8.doStartTag();
    if (_jspx_th_t_dgToolBar_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_url_title_operationCode_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_8);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_url_title_operationCode_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_8);
    return false;
  }

  private boolean _jspx_meth_t_dgToolBar_9(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_9 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_url_title_operationCode_icon_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_9.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_9.setTitle("form.generate");
    _jspx_th_t_dgToolBar_9.setIcon("fa fa-database");
    _jspx_th_t_dgToolBar_9.setUrl("cgformTransController.do?trans");
    _jspx_th_t_dgToolBar_9.setOperationCode("db_generate_form");
    _jspx_th_t_dgToolBar_9.setFunname("addToData");
    int _jspx_eval_t_dgToolBar_9 = _jspx_th_t_dgToolBar_9.doStartTag();
    if (_jspx_th_t_dgToolBar_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_url_title_operationCode_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_9);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_url_title_operationCode_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_9);
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
    _jspx_th_t_mutiLang_0.setLangKey("form.template");
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
    _jspx_th_t_mutiLang_1.setLangKey("common.close");
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
    _jspx_th_t_mutiLang_2.setLangKey("confirm.online.delete.record");
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
    _jspx_th_t_mutiLang_3.setLangKey("table.exit.in.db.confirm");
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
    _jspx_th_t_mutiLang_4.setLangKey("confirm.delete.record");
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
    _jspx_th_t_mutiLang_5.setLangKey("form.datalist");
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
    _jspx_th_t_mutiLang_6.setLangKey("common.please.select.edit.item");
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
    _jspx_th_t_mutiLang_7.setLangKey("common.please.select.one.record.to.edit");
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
    _jspx_th_t_mutiLang_8.setLangKey("common.please.select.edit.item");
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
    _jspx_th_t_mutiLang_9.setLangKey("common.please.select.one.record.to.edit");
    int _jspx_eval_t_mutiLang_9 = _jspx_th_t_mutiLang_9.doStartTag();
    if (_jspx_th_t_mutiLang_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_9);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_9);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_10 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_10.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_10.setParent(null);
    _jspx_th_t_mutiLang_10.setLangKey("js.enhance");
    int _jspx_eval_t_mutiLang_10 = _jspx_th_t_mutiLang_10.doStartTag();
    if (_jspx_th_t_mutiLang_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_10);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_10);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_11 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_11.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_11.setParent(null);
    _jspx_th_t_mutiLang_11.setLangKey("common.close");
    int _jspx_eval_t_mutiLang_11 = _jspx_th_t_mutiLang_11.doStartTag();
    if (_jspx_th_t_mutiLang_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_11);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_11);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_12 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_12.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_12.setParent(null);
    _jspx_th_t_mutiLang_12.setLangKey("common.menu.link");
    int _jspx_eval_t_mutiLang_12 = _jspx_th_t_mutiLang_12.doStartTag();
    if (_jspx_th_t_mutiLang_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_12);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_12);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_13 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_13.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_13.setParent(null);
    _jspx_th_t_mutiLang_13.setLangKey("common.please.select.edit.item");
    int _jspx_eval_t_mutiLang_13 = _jspx_th_t_mutiLang_13.doStartTag();
    if (_jspx_th_t_mutiLang_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_13);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_13);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_14 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_14.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_14.setParent(null);
    _jspx_th_t_mutiLang_14.setLangKey("common.please.select.one.record.to.edit");
    int _jspx_eval_t_mutiLang_14 = _jspx_th_t_mutiLang_14.doStartTag();
    if (_jspx_th_t_mutiLang_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_14);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_14);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_15 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_15.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_15.setParent(null);
    _jspx_th_t_mutiLang_15.setLangKey("custom.button");
    int _jspx_eval_t_mutiLang_15 = _jspx_th_t_mutiLang_15.doStartTag();
    if (_jspx_th_t_mutiLang_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_15);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_15);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_16 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_16.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_16.setParent(null);
    _jspx_th_t_mutiLang_16.setLangKey("common.please.select.edit.item");
    int _jspx_eval_t_mutiLang_16 = _jspx_th_t_mutiLang_16.doStartTag();
    if (_jspx_th_t_mutiLang_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_16);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_16);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_17 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_17.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_17.setParent(null);
    _jspx_th_t_mutiLang_17.setLangKey("common.please.select.one.record.to.edit");
    int _jspx_eval_t_mutiLang_17 = _jspx_th_t_mutiLang_17.doStartTag();
    if (_jspx_th_t_mutiLang_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_17);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_17);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_18 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_18.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_18.setParent(null);
    _jspx_th_t_mutiLang_18.setLangKey("sql.enhance");
    int _jspx_eval_t_mutiLang_18 = _jspx_th_t_mutiLang_18.doStartTag();
    if (_jspx_th_t_mutiLang_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_18);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_18);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_19 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_19.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_19.setParent(null);
    _jspx_th_t_mutiLang_19.setLangKey("common.close");
    int _jspx_eval_t_mutiLang_19 = _jspx_th_t_mutiLang_19.doStartTag();
    if (_jspx_th_t_mutiLang_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_19);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_19);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_20 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_20.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_20.setParent(null);
    _jspx_th_t_mutiLang_20.setLangKey("common.please.select.edit.item");
    int _jspx_eval_t_mutiLang_20 = _jspx_th_t_mutiLang_20.doStartTag();
    if (_jspx_th_t_mutiLang_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_20);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_20);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_21 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_21.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_21.setParent(null);
    _jspx_th_t_mutiLang_21.setLangKey("common.please.select.one.record.to.edit");
    int _jspx_eval_t_mutiLang_21 = _jspx_th_t_mutiLang_21.doStartTag();
    if (_jspx_th_t_mutiLang_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_21);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_21);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_22 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_22.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_22.setParent(null);
    _jspx_th_t_mutiLang_22.setLangKey("js.enhance");
    int _jspx_eval_t_mutiLang_22 = _jspx_th_t_mutiLang_22.doStartTag();
    if (_jspx_th_t_mutiLang_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_22);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_22);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_23 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_23.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_23.setParent(null);
    _jspx_th_t_mutiLang_23.setLangKey("common.close");
    int _jspx_eval_t_mutiLang_23 = _jspx_th_t_mutiLang_23.doStartTag();
    if (_jspx_th_t_mutiLang_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_23);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_23);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_24 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_24.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_24.setParent(null);
    _jspx_th_t_mutiLang_24.setLangKey("common.please.select.edit.item");
    int _jspx_eval_t_mutiLang_24 = _jspx_th_t_mutiLang_24.doStartTag();
    if (_jspx_th_t_mutiLang_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_24);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_24);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_25 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_25.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_25.setParent(null);
    _jspx_th_t_mutiLang_25.setLangKey("common.please.select.one.record.to.edit");
    int _jspx_eval_t_mutiLang_25 = _jspx_th_t_mutiLang_25.doStartTag();
    if (_jspx_th_t_mutiLang_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_25);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_25);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_26(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_26 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_26.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_26.setParent(null);
    _jspx_th_t_mutiLang_26.setLangKey("java.enhance");
    int _jspx_eval_t_mutiLang_26 = _jspx_th_t_mutiLang_26.doStartTag();
    if (_jspx_th_t_mutiLang_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_26);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_26);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_27(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_27 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_27.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_27.setParent(null);
    _jspx_th_t_mutiLang_27.setLangKey("common.close");
    int _jspx_eval_t_mutiLang_27 = _jspx_th_t_mutiLang_27.doStartTag();
    if (_jspx_th_t_mutiLang_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_27);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_27);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_28(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_28 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_28.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_28.setParent(null);
    _jspx_th_t_mutiLang_28.setLangKey("common.please.select.edit.item");
    int _jspx_eval_t_mutiLang_28 = _jspx_th_t_mutiLang_28.doStartTag();
    if (_jspx_th_t_mutiLang_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_28);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_28);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_29(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_29 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_29.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_29.setParent(null);
    _jspx_th_t_mutiLang_29.setLangKey("form.sqlimport");
    int _jspx_eval_t_mutiLang_29 = _jspx_th_t_mutiLang_29.doStartTag();
    if (_jspx_th_t_mutiLang_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_29);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_29);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_30(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_30 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_30.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_30.setParent(null);
    _jspx_th_t_mutiLang_30.setLangKey("common.please.select.edit.item");
    int _jspx_eval_t_mutiLang_30 = _jspx_th_t_mutiLang_30.doStartTag();
    if (_jspx_th_t_mutiLang_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_30);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_30);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_31(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_31 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_31.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_31.setParent(null);
    _jspx_th_t_mutiLang_31.setLangKey("common.please.select.one.record.to.edit");
    int _jspx_eval_t_mutiLang_31 = _jspx_th_t_mutiLang_31.doStartTag();
    if (_jspx_th_t_mutiLang_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_31);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_31);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_32(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_32 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_32.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_32.setParent(null);
    _jspx_th_t_mutiLang_32.setLangKey("slave.table.can.not.generate.code");
    int _jspx_eval_t_mutiLang_32 = _jspx_th_t_mutiLang_32.doStartTag();
    if (_jspx_th_t_mutiLang_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_32);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_32);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_33(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_33 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_33.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_33.setParent(null);
    _jspx_th_t_mutiLang_33.setLangKey("please.syncdb");
    int _jspx_eval_t_mutiLang_33 = _jspx_th_t_mutiLang_33.doStartTag();
    if (_jspx_th_t_mutiLang_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_33);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_33);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_34(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_34 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_34.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_34.setParent(null);
    _jspx_th_t_mutiLang_34.setLangKey("code.generate");
    int _jspx_eval_t_mutiLang_34 = _jspx_th_t_mutiLang_34.doStartTag();
    if (_jspx_th_t_mutiLang_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_34);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_34);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_35(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_35 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_35.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_35.setParent(null);
    _jspx_th_t_mutiLang_35.setLangKey("common.close");
    int _jspx_eval_t_mutiLang_35 = _jspx_th_t_mutiLang_35.doStartTag();
    if (_jspx_th_t_mutiLang_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_35);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_35);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_36(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_36 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_36.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_36.setParent(null);
    _jspx_th_t_mutiLang_36.setLangKey("sync.db");
    int _jspx_eval_t_mutiLang_36 = _jspx_th_t_mutiLang_36.doStartTag();
    if (_jspx_th_t_mutiLang_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_36);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_36);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_37(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_37 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_37.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_37.setParent(null);
    _jspx_th_t_mutiLang_37.setLangKey("common.close");
    int _jspx_eval_t_mutiLang_37 = _jspx_th_t_mutiLang_37.doStartTag();
    if (_jspx_th_t_mutiLang_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_37);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_37);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_38(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_38 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_38.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_38.setParent(null);
    _jspx_th_t_mutiLang_38.setLangKey("common.confirm");
    int _jspx_eval_t_mutiLang_38 = _jspx_th_t_mutiLang_38.doStartTag();
    if (_jspx_th_t_mutiLang_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_38);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_38);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_39(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_39 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_39.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_39.setParent(null);
    _jspx_th_t_mutiLang_39.setLangKey("please.select.sync.method");
    int _jspx_eval_t_mutiLang_39 = _jspx_th_t_mutiLang_39.doStartTag();
    if (_jspx_th_t_mutiLang_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_39);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_39);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_40(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_40 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_40.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_40.setParent(null);
    _jspx_th_t_mutiLang_40.setLangKey("confirm.copy.form");
    int _jspx_eval_t_mutiLang_40 = _jspx_th_t_mutiLang_40.doStartTag();
    if (_jspx_th_t_mutiLang_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_40);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_40);
    return false;
  }
}
