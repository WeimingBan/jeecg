package org.apache.jsp.webpage.com.jeecg.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jeecgDemoList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_base_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_datagrid_title_superQuery_sortName_queryMode_pagination_name_idField_fitColumns_fit_filter_checkbox_actionUrl;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_query_popup_frozenColumn_field_extend_dictionary_autocomplete_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_style_query_frozenColumn_formatterjs_field_extend_editor_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_formatter_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_queryMode_query_frozenColumn_field_dictionary_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_title_frozenColumn_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_showMode_query_frozenColumn_field_extendParams_dictionary_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_queryMode_query_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_queryMode_query_formatter_field_editor_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_query_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_query_field_extend_dictionary_defaultVal_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_queryMode_formatterjs_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgDelOpt_urlfont_urlclass_url_title_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_exp_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgToolBar_width_url_title_icon_height_funname_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgToolBar_width_url_title_inGroup_icon_height_funname_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgToolBar_width_url_title_inGroup_icon_funname_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgToolBar_width_url_title_icon_funname_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgToolBar_url_title_icon_funname_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgToolBar_title_icon_funname_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgToolBar_title_inGroup_icon_funname_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgToolBar_width_url_title_operationCode_inGroup_icon_height_funname_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgToolBar_url_title_inGroup_icon_funname_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_datagrid_title_superQuery_sortName_queryMode_pagination_name_idField_fitColumns_fit_filter_checkbox_actionUrl = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_query_popup_frozenColumn_field_extend_dictionary_autocomplete_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_style_query_frozenColumn_formatterjs_field_extend_editor_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_formatter_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_queryMode_query_frozenColumn_field_dictionary_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_title_frozenColumn_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_showMode_query_frozenColumn_field_extendParams_dictionary_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_queryMode_query_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_queryMode_query_formatter_field_editor_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_query_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_query_field_extend_dictionary_defaultVal_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_queryMode_formatterjs_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgDelOpt_urlfont_urlclass_url_title_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_exp_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgToolBar_width_url_title_icon_height_funname_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgToolBar_width_url_title_inGroup_icon_height_funname_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgToolBar_width_url_title_inGroup_icon_funname_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgToolBar_width_url_title_icon_funname_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgToolBar_url_title_icon_funname_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgToolBar_title_icon_funname_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgToolBar_title_inGroup_icon_funname_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgToolBar_width_url_title_operationCode_inGroup_icon_height_funname_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgToolBar_url_title_inGroup_icon_funname_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
    _jspx_tagPool_t_datagrid_title_superQuery_sortName_queryMode_pagination_name_idField_fitColumns_fit_filter_checkbox_actionUrl.release();
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_query_popup_frozenColumn_field_extend_dictionary_autocomplete_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_style_query_frozenColumn_formatterjs_field_extend_editor_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_formatter_field_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_queryMode_query_frozenColumn_field_dictionary_nobody.release();
    _jspx_tagPool_t_dgCol_title_frozenColumn_field_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_showMode_query_frozenColumn_field_extendParams_dictionary_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_queryMode_query_field_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_queryMode_query_formatter_field_editor_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_query_field_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_query_field_extend_dictionary_defaultVal_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_queryMode_formatterjs_field_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_field_nobody.release();
    _jspx_tagPool_t_dgDelOpt_urlfont_urlclass_url_title_nobody.release();
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_exp_nobody.release();
    _jspx_tagPool_t_dgToolBar_width_url_title_icon_height_funname_nobody.release();
    _jspx_tagPool_t_dgToolBar_width_url_title_inGroup_icon_height_funname_nobody.release();
    _jspx_tagPool_t_dgToolBar_width_url_title_inGroup_icon_funname_nobody.release();
    _jspx_tagPool_t_dgToolBar_width_url_title_icon_funname_nobody.release();
    _jspx_tagPool_t_dgToolBar_url_title_icon_funname_nobody.release();
    _jspx_tagPool_t_dgToolBar_title_icon_funname_nobody.release();
    _jspx_tagPool_t_dgToolBar_title_inGroup_icon_funname_nobody.release();
    _jspx_tagPool_t_dgToolBar_width_url_title_operationCode_inGroup_icon_height_funname_nobody.release();
    _jspx_tagPool_t_dgToolBar_url_title_inGroup_icon_funname_nobody.release();
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
      out.write("<div class=\"easyui-layout\" fit=\"true\">\n");
      out.write("  <div region=\"center\" style=\"padding:0px;border:0px\">\n");
      out.write("  ");
      if (_jspx_meth_t_datagrid_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  </div>\n");
      out.write(" </div>\n");
      out.write(" <script type=\"text/javascript\">\n");
      out.write(" \t//列表显示自定义样式，显示对号\n");
      out.write("\tfunction statusFmt(value, row, index){  \n");
      out.write("\t\tif (value != null && value != '') \n");
      out.write("\t\t\treturn '<span style=\"color:green;font-size: 16px;\">✔</span>';\n");
      out.write("\t\treturn '<span style=\"color:red;font-size: 16px;\">x</span>';\n");
      out.write("\t} \n");
      out.write("\t//列表字段颜色 demo,逻辑判断函数 \n");
      out.write("\tfunction fmtype(val,row,index){\n");
      out.write("\t    //可添加更多CSS样式\n");
      out.write("\t    var s1 = 'background-color:#f89406;color:#FFF;';\n");
      out.write("\t    var s2 = 'background-color:#3a87ad;color:#FFF;';\n");
      out.write("\t    var s3 = 'background-color:#21B9BB;';\n");
      out.write("\t    if (val =='1') {\n");
      out.write("\t        return s1\n");
      out.write("\t    }\n");
      out.write("\t    if (val =='0') {\n");
      out.write("\t        return s2\n");
      out.write("\t    }\n");
      out.write("\t    return s3\n");
      out.write("\t}\n");
      out.write(" function testReloadPage(){\n");
      out.write("\t\tdocument.location = \"http://www.baidu.com\"; \n");
      out.write("\t}\n");
      out.write("\tfunction szqm(id) {\n");
      out.write("\t\tcreatewindow('审核入职', 'jeecgListDemoController.do?goCheck&id=' + id,420,280);\n");
      out.write("\t}\n");
      out.write("\tfunction addNewPage(id){\n");
      out.write("\t\taddOneTab(\"TAB方式添加\", \"jeecgListDemoController.do?addTab&type=table&id=\"+id);\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("function addWithbtn(title,addurl,gname,width,height){\n");
      out.write("\topenwindow(\"添加\",addurl,gname,770,500);\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("// formatterjs 例子--------------------\n");
      out.write("//单元格的格式化函数  value：字段的值 row：行的记录数据 index：行的索引\n");
      out.write("function formatAgeFun(age,row,index){\n");
      out.write("\tvar str=\"原：\"+age+\",现 ：\"+(Number(age)+20);\n");
      out.write("\treturn str;\n");
      out.write("}\n");
      out.write("\n");
      out.write("//打开tab页面\n");
      out.write("function addbytab(){\n");
      out.write("\taddOneTab(\"添加表单\", \"jeecgListDemoController.do?addWithbtn\");\n");
      out.write(" }\n");
      out.write(" \n");
      out.write("//导入\n");
      out.write("function ImportXls() {\n");
      out.write("\topenuploadwin('Excel导入', 'jeecgListDemoController.do?upload', \"jeecgDemoList\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("//导出\n");
      out.write("function ExportXls() {\n");
      out.write("\tJeecgExcelExport(\"jeecgListDemoController.do?exportXls\",\"jeecgDemoList\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("//模板下载\n");
      out.write("function ExportXlsByT() {\n");
      out.write("\tJeecgExcelExport(\"jeecgListDemoController.do?exportXlsByT\",\"jeecgDemoList\");\n");
      out.write("}\n");
      out.write("function createwindow_form(title, addurl,width,height) {\n");
      out.write("\twidth = window.top.document.body.offsetWidth;\n");
      out.write("\theight = window.top.document.body.offsetHeight-100;\n");
      out.write("\tif(typeof(windowapi) == 'undefined'){\n");
      out.write("\t\t$.dialog({\n");
      out.write("\t\t\tcontent: 'url:'+addurl,\n");
      out.write("\t\t\tlock : true,\n");
      out.write("\t\t\tzIndex: getzIndex(),\n");
      out.write("\t\t\twidth:width,\n");
      out.write("\t\t\theight:height,\n");
      out.write("\t\t\ttitle:title,\n");
      out.write("\t\t\topacity : 0.3,\n");
      out.write("\t\t\tcache:false,\n");
      out.write("\t\t    cancelVal: '',\n");
      out.write("\t\t    cancel: true /*为true等价于function(){}*/\n");
      out.write("\t\t});\n");
      out.write("\t}else{\n");
      out.write("\t\tW.$.dialog({\n");
      out.write("\t\t\tcontent: 'url:'+addurl,\n");
      out.write("\t\t\tlock : true,\n");
      out.write("\t\t\twidth:width,\n");
      out.write("\t\t\tzIndex:getzIndex(),\n");
      out.write("\t\t\theight:height,\n");
      out.write("\t\t\tparent:windowapi,\n");
      out.write("\t\t\ttitle:title,\n");
      out.write("\t\t\topacity : 0.3,\n");
      out.write("\t\t\tcache:false,\n");
      out.write("\t\t    cancelVal: '',\n");
      out.write("\t\t    cancel: true /*为true等价于function(){}*/\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write(" </script>");
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
    _jspx_th_t_base_0.setType("jquery,easyui,tools,DatePicker,autocomplete");
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
    org.jeecgframework.tag.core.easyui.DataGridTag _jspx_th_t_datagrid_0 = (org.jeecgframework.tag.core.easyui.DataGridTag) _jspx_tagPool_t_datagrid_title_superQuery_sortName_queryMode_pagination_name_idField_fitColumns_fit_filter_checkbox_actionUrl.get(org.jeecgframework.tag.core.easyui.DataGridTag.class);
    _jspx_th_t_datagrid_0.setPageContext(_jspx_page_context);
    _jspx_th_t_datagrid_0.setParent(null);
    _jspx_th_t_datagrid_0.setName("jeecgDemoList");
    _jspx_th_t_datagrid_0.setCheckbox(true);
    _jspx_th_t_datagrid_0.setSortName("birthday,name");
    _jspx_th_t_datagrid_0.setPagination(true);
    _jspx_th_t_datagrid_0.setFitColumns(false);
    _jspx_th_t_datagrid_0.setTitle("jeecg_demo");
    _jspx_th_t_datagrid_0.setSuperQuery(true);
    _jspx_th_t_datagrid_0.setActionUrl("jeecgListDemoController.do?datagrid");
    _jspx_th_t_datagrid_0.setIdField("id");
    _jspx_th_t_datagrid_0.setFit(true);
    _jspx_th_t_datagrid_0.setQueryMode("group");
    _jspx_th_t_datagrid_0.setFilter(true);
    int _jspx_eval_t_datagrid_0 = _jspx_th_t_datagrid_0.doStartTag();
    if (_jspx_eval_t_datagrid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_t_dgCol_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_t_dgCol_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    \n");
        out.write("    <!-- 字段 formatterjs 例子 -->\n");
        out.write("    ");
        if (_jspx_meth_t_dgCol_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    \n");
        out.write("    ");
        if (_jspx_meth_t_dgCol_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_t_dgCol_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_t_dgCol_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_t_dgCol_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_t_dgCol_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_t_dgCol_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_t_dgCol_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    <!-- 列表查询条件popup例子 -->\n");
        out.write("    ");
        if (_jspx_meth_t_dgCol_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_t_dgCol_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_t_dgCol_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgCol_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_t_dgCol_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_t_dgCol_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_t_dgCol_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_t_dgCol_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_t_dgCol_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgCol_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgDelOpt_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgFunOpt_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgToolBar_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgToolBar_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgToolBar_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgToolBar_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgToolBar_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgToolBar_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgToolBar_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgToolBar_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgToolBar_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgToolBar_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgToolBar_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        out.write("\n");
        out.write("  ");
        int evalDoAfterBody = _jspx_th_t_datagrid_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_datagrid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_datagrid_title_superQuery_sortName_queryMode_pagination_name_idField_fitColumns_fit_filter_checkbox_actionUrl.reuse(_jspx_th_t_datagrid_0);
      return true;
    }
    _jspx_tagPool_t_datagrid_title_superQuery_sortName_queryMode_pagination_name_idField_fitColumns_fit_filter_checkbox_actionUrl.reuse(_jspx_th_t_datagrid_0);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_0 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_0.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_0.setTitle("id");
    _jspx_th_t_dgCol_0.setField("id");
    _jspx_th_t_dgCol_0.setHidden(true);
    _jspx_th_t_dgCol_0.setQueryMode("group");
    _jspx_th_t_dgCol_0.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_0 = _jspx_th_t_dgCol_0.doStartTag();
    if (_jspx_th_t_dgCol_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.reuse(_jspx_th_t_dgCol_0);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.reuse(_jspx_th_t_dgCol_0);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_1 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_query_popup_frozenColumn_field_extend_dictionary_autocomplete_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_1.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_1.setTitle("名称");
    _jspx_th_t_dgCol_1.setFrozenColumn(true);
    _jspx_th_t_dgCol_1.setPopup(true);
    _jspx_th_t_dgCol_1.setDictionary("user_msg,name@email,account@realname");
    _jspx_th_t_dgCol_1.setField("name");
    _jspx_th_t_dgCol_1.setQuery(true);
    _jspx_th_t_dgCol_1.setAutocomplete(true);
    _jspx_th_t_dgCol_1.setWidth(new Integer(120));
    _jspx_th_t_dgCol_1.setExtend("{style:'width:120px'}");
    int _jspx_eval_t_dgCol_1 = _jspx_th_t_dgCol_1.doStartTag();
    if (_jspx_th_t_dgCol_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_query_popup_frozenColumn_field_extend_dictionary_autocomplete_nobody.reuse(_jspx_th_t_dgCol_1);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_query_popup_frozenColumn_field_extend_dictionary_autocomplete_nobody.reuse(_jspx_th_t_dgCol_1);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_2 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_style_query_frozenColumn_formatterjs_field_extend_editor_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_2.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_2.setTitle("年龄");
    _jspx_th_t_dgCol_2.setFrozenColumn(true);
    _jspx_th_t_dgCol_2.setExtend("{style:'width:70px'}");
    _jspx_th_t_dgCol_2.setFormatterjs("formatAgeFun");
    _jspx_th_t_dgCol_2.setStyle("background-color:#3a87ad_50,background-color:#f89406_100");
    _jspx_th_t_dgCol_2.setEditor("numberbox");
    _jspx_th_t_dgCol_2.setField("age");
    _jspx_th_t_dgCol_2.setQuery(true);
    _jspx_th_t_dgCol_2.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_2 = _jspx_th_t_dgCol_2.doStartTag();
    if (_jspx_th_t_dgCol_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_style_query_frozenColumn_formatterjs_field_extend_editor_nobody.reuse(_jspx_th_t_dgCol_2);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_style_query_frozenColumn_formatterjs_field_extend_editor_nobody.reuse(_jspx_th_t_dgCol_2);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_3(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_3 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_formatter_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_3.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_3.setTitle("生日");
    _jspx_th_t_dgCol_3.setHidden(true);
    _jspx_th_t_dgCol_3.setField("birthday");
    _jspx_th_t_dgCol_3.setFormatter("yyyy-MM-dd");
    _jspx_th_t_dgCol_3.setQueryMode("group");
    _jspx_th_t_dgCol_3.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_3 = _jspx_th_t_dgCol_3.doStartTag();
    if (_jspx_th_t_dgCol_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_formatter_field_nobody.reuse(_jspx_th_t_dgCol_3);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_formatter_field_nobody.reuse(_jspx_th_t_dgCol_3);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_4(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_4 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_query_frozenColumn_field_dictionary_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_4.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_4.setTitle("部门");
    _jspx_th_t_dgCol_4.setFrozenColumn(true);
    _jspx_th_t_dgCol_4.setField("depId");
    _jspx_th_t_dgCol_4.setQuery(true);
    _jspx_th_t_dgCol_4.setQueryMode("single");
    _jspx_th_t_dgCol_4.setDictionary("t_s_depart,id,departname");
    _jspx_th_t_dgCol_4.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_4 = _jspx_th_t_dgCol_4.doStartTag();
    if (_jspx_th_t_dgCol_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_query_frozenColumn_field_dictionary_nobody.reuse(_jspx_th_t_dgCol_4);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_query_frozenColumn_field_dictionary_nobody.reuse(_jspx_th_t_dgCol_4);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_5(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_5 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_title_frozenColumn_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_5.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_5.setTitle("部门编码(拓展字段)");
    _jspx_th_t_dgCol_5.setFrozenColumn(true);
    _jspx_th_t_dgCol_5.setField("extField");
    int _jspx_eval_t_dgCol_5 = _jspx_th_t_dgCol_5.doStartTag();
    if (_jspx_th_t_dgCol_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_title_frozenColumn_field_nobody.reuse(_jspx_th_t_dgCol_5);
      return true;
    }
    _jspx_tagPool_t_dgCol_title_frozenColumn_field_nobody.reuse(_jspx_th_t_dgCol_5);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_6(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_6 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_showMode_query_frozenColumn_field_extendParams_dictionary_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_6.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_6.setTitle("性别");
    _jspx_th_t_dgCol_6.setField("sex");
    _jspx_th_t_dgCol_6.setFrozenColumn(true);
    _jspx_th_t_dgCol_6.setQuery(false);
    _jspx_th_t_dgCol_6.setShowMode("radio");
    _jspx_th_t_dgCol_6.setDictionary("sex");
    _jspx_th_t_dgCol_6.setWidth(new Integer(120));
    _jspx_th_t_dgCol_6.setExtendParams("styler:fmtype");
    int _jspx_eval_t_dgCol_6 = _jspx_th_t_dgCol_6.doStartTag();
    if (_jspx_th_t_dgCol_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_showMode_query_frozenColumn_field_extendParams_dictionary_nobody.reuse(_jspx_th_t_dgCol_6);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_showMode_query_frozenColumn_field_extendParams_dictionary_nobody.reuse(_jspx_th_t_dgCol_6);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_7(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_7 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_7.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_7.setTitle("电话");
    _jspx_th_t_dgCol_7.setField("phone");
    _jspx_th_t_dgCol_7.setQueryMode("group");
    _jspx_th_t_dgCol_7.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_7 = _jspx_th_t_dgCol_7.doStartTag();
    if (_jspx_th_t_dgCol_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody.reuse(_jspx_th_t_dgCol_7);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody.reuse(_jspx_th_t_dgCol_7);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_8(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_8 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_query_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_8.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_8.setTitle("工资");
    _jspx_th_t_dgCol_8.setField("salary");
    _jspx_th_t_dgCol_8.setQuery(false);
    _jspx_th_t_dgCol_8.setQueryMode("group");
    _jspx_th_t_dgCol_8.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_8 = _jspx_th_t_dgCol_8.doStartTag();
    if (_jspx_th_t_dgCol_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_query_field_nobody.reuse(_jspx_th_t_dgCol_8);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_query_field_nobody.reuse(_jspx_th_t_dgCol_8);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_9(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_9 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_query_formatter_field_editor_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_9.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_9.setTitle("创建日期");
    _jspx_th_t_dgCol_9.setField("createDate");
    _jspx_th_t_dgCol_9.setFormatter("yyyy-MM-dd");
    _jspx_th_t_dgCol_9.setQuery(true);
    _jspx_th_t_dgCol_9.setQueryMode("group");
    _jspx_th_t_dgCol_9.setEditor("datebox");
    _jspx_th_t_dgCol_9.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_9 = _jspx_th_t_dgCol_9.doStartTag();
    if (_jspx_th_t_dgCol_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_query_formatter_field_editor_nobody.reuse(_jspx_th_t_dgCol_9);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_query_formatter_field_editor_nobody.reuse(_jspx_th_t_dgCol_9);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_10(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_10 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_query_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_10.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_10.setTitle("邮箱");
    _jspx_th_t_dgCol_10.setField("email");
    _jspx_th_t_dgCol_10.setQuery(true);
    _jspx_th_t_dgCol_10.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_10 = _jspx_th_t_dgCol_10.doStartTag();
    if (_jspx_th_t_dgCol_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_query_field_nobody.reuse(_jspx_th_t_dgCol_10);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_query_field_nobody.reuse(_jspx_th_t_dgCol_10);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_11(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_11 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_query_field_extend_dictionary_defaultVal_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_11.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_11.setTitle("入职状态");
    _jspx_th_t_dgCol_11.setField("status");
    _jspx_th_t_dgCol_11.setQuery(false);
    _jspx_th_t_dgCol_11.setExtend("{style:{width:'300px';color:'red'};datatype:'*';}");
    _jspx_th_t_dgCol_11.setDefaultVal("N");
    _jspx_th_t_dgCol_11.setDictionary("sf_yn");
    _jspx_th_t_dgCol_11.setWidth(new Integer(80));
    int _jspx_eval_t_dgCol_11 = _jspx_th_t_dgCol_11.doStartTag();
    if (_jspx_th_t_dgCol_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_query_field_extend_dictionary_defaultVal_nobody.reuse(_jspx_th_t_dgCol_11);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_query_field_extend_dictionary_defaultVal_nobody.reuse(_jspx_th_t_dgCol_11);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_12(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_12 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_12.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_12.setTitle("个人介绍");
    _jspx_th_t_dgCol_12.setField("content");
    _jspx_th_t_dgCol_12.setHidden(true);
    _jspx_th_t_dgCol_12.setQueryMode("group");
    _jspx_th_t_dgCol_12.setWidth(new Integer(500));
    int _jspx_eval_t_dgCol_12 = _jspx_th_t_dgCol_12.doStartTag();
    if (_jspx_th_t_dgCol_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.reuse(_jspx_th_t_dgCol_12);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.reuse(_jspx_th_t_dgCol_12);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_13(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_13 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_formatterjs_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_13.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_13.setTitle("头像");
    _jspx_th_t_dgCol_13.setField("touxiang");
    _jspx_th_t_dgCol_13.setQueryMode("group");
    _jspx_th_t_dgCol_13.setFormatterjs("statusFmt");
    _jspx_th_t_dgCol_13.setWidth(new Integer(60));
    int _jspx_eval_t_dgCol_13 = _jspx_th_t_dgCol_13.doStartTag();
    if (_jspx_th_t_dgCol_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_formatterjs_field_nobody.reuse(_jspx_th_t_dgCol_13);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_formatterjs_field_nobody.reuse(_jspx_th_t_dgCol_13);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_14(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_14 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_14.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_14.setTitle("创建人id");
    _jspx_th_t_dgCol_14.setField("createBy");
    _jspx_th_t_dgCol_14.setHidden(true);
    _jspx_th_t_dgCol_14.setQueryMode("group");
    _jspx_th_t_dgCol_14.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_14 = _jspx_th_t_dgCol_14.doStartTag();
    if (_jspx_th_t_dgCol_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.reuse(_jspx_th_t_dgCol_14);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.reuse(_jspx_th_t_dgCol_14);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_15(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_15 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_15.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_15.setTitle("创建人");
    _jspx_th_t_dgCol_15.setField("createName");
    _jspx_th_t_dgCol_15.setHidden(true);
    _jspx_th_t_dgCol_15.setQueryMode("group");
    _jspx_th_t_dgCol_15.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_15 = _jspx_th_t_dgCol_15.doStartTag();
    if (_jspx_th_t_dgCol_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.reuse(_jspx_th_t_dgCol_15);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.reuse(_jspx_th_t_dgCol_15);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_16(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_16 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_16.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_16.setTitle("修改人id");
    _jspx_th_t_dgCol_16.setField("updateBy");
    _jspx_th_t_dgCol_16.setHidden(true);
    _jspx_th_t_dgCol_16.setQueryMode("group");
    _jspx_th_t_dgCol_16.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_16 = _jspx_th_t_dgCol_16.doStartTag();
    if (_jspx_th_t_dgCol_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.reuse(_jspx_th_t_dgCol_16);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.reuse(_jspx_th_t_dgCol_16);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_17(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_17 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_formatter_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_17.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_17.setTitle("修改时间");
    _jspx_th_t_dgCol_17.setField("updateDate");
    _jspx_th_t_dgCol_17.setFormatter("yyyy-MM-dd");
    _jspx_th_t_dgCol_17.setHidden(true);
    _jspx_th_t_dgCol_17.setQueryMode("group");
    _jspx_th_t_dgCol_17.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_17 = _jspx_th_t_dgCol_17.doStartTag();
    if (_jspx_th_t_dgCol_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_formatter_field_nobody.reuse(_jspx_th_t_dgCol_17);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_formatter_field_nobody.reuse(_jspx_th_t_dgCol_17);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_18(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_18 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_18.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_18.setTitle("修改人");
    _jspx_th_t_dgCol_18.setField("updateName");
    _jspx_th_t_dgCol_18.setHidden(true);
    _jspx_th_t_dgCol_18.setQueryMode("group");
    _jspx_th_t_dgCol_18.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_18 = _jspx_th_t_dgCol_18.doStartTag();
    if (_jspx_th_t_dgCol_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.reuse(_jspx_th_t_dgCol_18);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.reuse(_jspx_th_t_dgCol_18);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_19(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_19 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_19.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_19.setTitle("操作");
    _jspx_th_t_dgCol_19.setField("opt");
    _jspx_th_t_dgCol_19.setWidth(new Integer(150));
    int _jspx_eval_t_dgCol_19 = _jspx_th_t_dgCol_19.doStartTag();
    if (_jspx_th_t_dgCol_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_field_nobody.reuse(_jspx_th_t_dgCol_19);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_field_nobody.reuse(_jspx_th_t_dgCol_19);
    return false;
  }

  private boolean _jspx_meth_t_dgDelOpt_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgDelOpt
    org.jeecgframework.tag.core.easyui.DataGridDelOptTag _jspx_th_t_dgDelOpt_0 = (org.jeecgframework.tag.core.easyui.DataGridDelOptTag) _jspx_tagPool_t_dgDelOpt_urlfont_urlclass_url_title_nobody.get(org.jeecgframework.tag.core.easyui.DataGridDelOptTag.class);
    _jspx_th_t_dgDelOpt_0.setPageContext(_jspx_page_context);
    _jspx_th_t_dgDelOpt_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgDelOpt_0.setTitle("删除");
    _jspx_th_t_dgDelOpt_0.setUrl("jeecgListDemoController.do?doDel&id={id}");
    _jspx_th_t_dgDelOpt_0.setUrlclass("ace_button");
    _jspx_th_t_dgDelOpt_0.setUrlfont("fa-trash-o");
    int _jspx_eval_t_dgDelOpt_0 = _jspx_th_t_dgDelOpt_0.doStartTag();
    if (_jspx_th_t_dgDelOpt_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgDelOpt_urlfont_urlclass_url_title_nobody.reuse(_jspx_th_t_dgDelOpt_0);
      return true;
    }
    _jspx_tagPool_t_dgDelOpt_urlfont_urlclass_url_title_nobody.reuse(_jspx_th_t_dgDelOpt_0);
    return false;
  }

  private boolean _jspx_meth_t_dgFunOpt_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgFunOpt
    org.jeecgframework.tag.core.easyui.DataGridFunOptTag _jspx_th_t_dgFunOpt_0 = (org.jeecgframework.tag.core.easyui.DataGridFunOptTag) _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_exp_nobody.get(org.jeecgframework.tag.core.easyui.DataGridFunOptTag.class);
    _jspx_th_t_dgFunOpt_0.setPageContext(_jspx_page_context);
    _jspx_th_t_dgFunOpt_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgFunOpt_0.setExp("status#eq#N");
    _jspx_th_t_dgFunOpt_0.setTitle("审核");
    _jspx_th_t_dgFunOpt_0.setFunname("szqm(id)");
    _jspx_th_t_dgFunOpt_0.setUrlclass("ace_button");
    _jspx_th_t_dgFunOpt_0.setUrlfont("fa-check");
    int _jspx_eval_t_dgFunOpt_0 = _jspx_th_t_dgFunOpt_0.doStartTag();
    if (_jspx_th_t_dgFunOpt_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_exp_nobody.reuse(_jspx_th_t_dgFunOpt_0);
      return true;
    }
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_exp_nobody.reuse(_jspx_th_t_dgFunOpt_0);
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
    _jspx_th_t_dgToolBar_0.setTitle("录入");
    _jspx_th_t_dgToolBar_0.setIcon("icon-add");
    _jspx_th_t_dgToolBar_0.setUrl("jeecgListDemoController.do?goAdd");
    _jspx_th_t_dgToolBar_0.setFunname("add");
    _jspx_th_t_dgToolBar_0.setWidth("770");
    _jspx_th_t_dgToolBar_0.setHeight("500");
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
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_1 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_width_url_title_inGroup_icon_height_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_1.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_1.setTitle("弹出TAB表单");
    _jspx_th_t_dgToolBar_1.setInGroup(true);
    _jspx_th_t_dgToolBar_1.setIcon("icon-add");
    _jspx_th_t_dgToolBar_1.setUrl("jeecgListDemoController.do?goAdd");
    _jspx_th_t_dgToolBar_1.setFunname("addbytab");
    _jspx_th_t_dgToolBar_1.setWidth("770");
    _jspx_th_t_dgToolBar_1.setHeight("500");
    int _jspx_eval_t_dgToolBar_1 = _jspx_th_t_dgToolBar_1.doStartTag();
    if (_jspx_th_t_dgToolBar_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_width_url_title_inGroup_icon_height_funname_nobody.reuse(_jspx_th_t_dgToolBar_1);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_width_url_title_inGroup_icon_height_funname_nobody.reuse(_jspx_th_t_dgToolBar_1);
    return false;
  }

  private boolean _jspx_meth_t_dgToolBar_2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_2 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_width_url_title_inGroup_icon_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_2.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_2.setTitle("录入-提交按钮");
    _jspx_th_t_dgToolBar_2.setInGroup(true);
    _jspx_th_t_dgToolBar_2.setIcon("icon-add");
    _jspx_th_t_dgToolBar_2.setUrl("jeecgListDemoController.do?addWithbtn");
    _jspx_th_t_dgToolBar_2.setFunname("addWithbtn");
    _jspx_th_t_dgToolBar_2.setWidth("770");
    int _jspx_eval_t_dgToolBar_2 = _jspx_th_t_dgToolBar_2.doStartTag();
    if (_jspx_th_t_dgToolBar_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_width_url_title_inGroup_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_2);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_width_url_title_inGroup_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_2);
    return false;
  }

  private boolean _jspx_meth_t_dgToolBar_3(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_3 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_width_url_title_icon_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_3.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_3.setTitle("编辑");
    _jspx_th_t_dgToolBar_3.setIcon("icon-edit");
    _jspx_th_t_dgToolBar_3.setUrl("jeecgListDemoController.do?goUpdate");
    _jspx_th_t_dgToolBar_3.setFunname("update");
    _jspx_th_t_dgToolBar_3.setWidth("770");
    int _jspx_eval_t_dgToolBar_3 = _jspx_th_t_dgToolBar_3.doStartTag();
    if (_jspx_th_t_dgToolBar_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_width_url_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_3);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_width_url_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_3);
    return false;
  }

  private boolean _jspx_meth_t_dgToolBar_4(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_4 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_url_title_icon_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_4.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_4.setTitle("批量删除");
    _jspx_th_t_dgToolBar_4.setIcon("icon-remove");
    _jspx_th_t_dgToolBar_4.setUrl("jeecgListDemoController.do?doBatchDel");
    _jspx_th_t_dgToolBar_4.setFunname("deleteALLSelect");
    int _jspx_eval_t_dgToolBar_4 = _jspx_th_t_dgToolBar_4.doStartTag();
    if (_jspx_th_t_dgToolBar_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_url_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_4);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_url_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_4);
    return false;
  }

  private boolean _jspx_meth_t_dgToolBar_5(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_5 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_width_url_title_inGroup_icon_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_5.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_5.setTitle("查看");
    _jspx_th_t_dgToolBar_5.setInGroup(true);
    _jspx_th_t_dgToolBar_5.setIcon("icon-search");
    _jspx_th_t_dgToolBar_5.setUrl("jeecgListDemoController.do?goUpdate");
    _jspx_th_t_dgToolBar_5.setFunname("detail");
    _jspx_th_t_dgToolBar_5.setWidth("770");
    int _jspx_eval_t_dgToolBar_5 = _jspx_th_t_dgToolBar_5.doStartTag();
    if (_jspx_th_t_dgToolBar_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_width_url_title_inGroup_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_5);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_width_url_title_inGroup_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_5);
    return false;
  }

  private boolean _jspx_meth_t_dgToolBar_6(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_6 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_title_icon_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_6.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_6.setTitle("导入");
    _jspx_th_t_dgToolBar_6.setIcon("icon-put");
    _jspx_th_t_dgToolBar_6.setFunname("ImportXls");
    int _jspx_eval_t_dgToolBar_6 = _jspx_th_t_dgToolBar_6.doStartTag();
    if (_jspx_th_t_dgToolBar_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_6);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_6);
    return false;
  }

  private boolean _jspx_meth_t_dgToolBar_7(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_7 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_title_icon_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_7.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_7.setTitle("导出");
    _jspx_th_t_dgToolBar_7.setIcon("icon-putout");
    _jspx_th_t_dgToolBar_7.setFunname("ExportXls");
    int _jspx_eval_t_dgToolBar_7 = _jspx_th_t_dgToolBar_7.doStartTag();
    if (_jspx_th_t_dgToolBar_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_7);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_7);
    return false;
  }

  private boolean _jspx_meth_t_dgToolBar_8(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_8 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_title_inGroup_icon_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_8.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_8.setTitle("模板下载");
    _jspx_th_t_dgToolBar_8.setInGroup(true);
    _jspx_th_t_dgToolBar_8.setIcon("icon-putout");
    _jspx_th_t_dgToolBar_8.setFunname("ExportXlsByT");
    int _jspx_eval_t_dgToolBar_8 = _jspx_th_t_dgToolBar_8.doStartTag();
    if (_jspx_th_t_dgToolBar_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_title_inGroup_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_8);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_title_inGroup_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_8);
    return false;
  }

  private boolean _jspx_meth_t_dgToolBar_9(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_9 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_width_url_title_operationCode_inGroup_icon_height_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_9.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_9.setOperationCode("print");
    _jspx_th_t_dgToolBar_9.setTitle("打印");
    _jspx_th_t_dgToolBar_9.setInGroup(true);
    _jspx_th_t_dgToolBar_9.setIcon("icon-print");
    _jspx_th_t_dgToolBar_9.setUrl("jeecgListDemoController.do?print");
    _jspx_th_t_dgToolBar_9.setFunname("detail");
    _jspx_th_t_dgToolBar_9.setWidth("610");
    _jspx_th_t_dgToolBar_9.setHeight("330");
    int _jspx_eval_t_dgToolBar_9 = _jspx_th_t_dgToolBar_9.doStartTag();
    if (_jspx_th_t_dgToolBar_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_width_url_title_operationCode_inGroup_icon_height_funname_nobody.reuse(_jspx_th_t_dgToolBar_9);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_width_url_title_operationCode_inGroup_icon_height_funname_nobody.reuse(_jspx_th_t_dgToolBar_9);
    return false;
  }

  private boolean _jspx_meth_t_dgToolBar_10(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_10 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_url_title_inGroup_icon_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_10.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_10.setTitle("加载百度");
    _jspx_th_t_dgToolBar_10.setInGroup(true);
    _jspx_th_t_dgToolBar_10.setIcon("icon-print");
    _jspx_th_t_dgToolBar_10.setUrl("#");
    _jspx_th_t_dgToolBar_10.setFunname("testReloadPage");
    int _jspx_eval_t_dgToolBar_10 = _jspx_th_t_dgToolBar_10.doStartTag();
    if (_jspx_th_t_dgToolBar_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_url_title_inGroup_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_10);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_url_title_inGroup_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_10);
    return false;
  }
}
