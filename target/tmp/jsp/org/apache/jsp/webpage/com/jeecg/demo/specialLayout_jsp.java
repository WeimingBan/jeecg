package org.apache.jsp.webpage.com.jeecg.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class specialLayout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_base_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_datagrid_title_queryMode_pagination_pageSize_name_idField_fitColumns_actionUrl;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_query_field_extendParams_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_queryMode_query_field_extendParams_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_formatter_field_extendParams_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_query_field_extendParams_dictionary_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_queryMode_field_extendParams_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_extendParams_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_formvalid_tiptype_layout_formid_dialog_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dictSelect_typeGroupCode_title_id_field_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_datagrid_title_queryMode_pagination_pageSize_name_idField_fitColumns_actionUrl = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_query_field_extendParams_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_queryMode_query_field_extendParams_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_formatter_field_extendParams_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_query_field_extendParams_dictionary_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_queryMode_field_extendParams_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_extendParams_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_formvalid_tiptype_layout_formid_dialog_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dictSelect_typeGroupCode_title_id_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
    _jspx_tagPool_t_datagrid_title_queryMode_pagination_pageSize_name_idField_fitColumns_actionUrl.release();
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_query_field_extendParams_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_queryMode_query_field_extendParams_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_formatter_field_extendParams_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_query_field_extendParams_dictionary_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_queryMode_field_extendParams_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_extendParams_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_field_nobody.release();
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_nobody.release();
    _jspx_tagPool_t_formvalid_tiptype_layout_formid_dialog_action.release();
    _jspx_tagPool_t_dictSelect_typeGroupCode_title_id_field_nobody.release();
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

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
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
      out.write("<div>\n");
      out.write("<div class=\"easyui-layout\" fit=\"true\">\n");
      out.write("  <div region=\"center\" style=\"padding:0px;border:0px\">\n");
      out.write("\t  ");
      if (_jspx_meth_t_datagrid_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write(" <script type=\"text/javascript\">\n");
      out.write("\t\n");
      out.write("\tfunction deleteDialog(id){\n");
      out.write("\t\t//提示框\n");
      out.write("\t\t$.messager.confirm(\"确认\", \"确定要删除这条数据？\", function (r) {\n");
      out.write("\t        if (r) {\t            \n");
      out.write("\t\t\t\tvar url = \"jeecgListDemoController.do?doBatchDel&ids=\" + id;\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\turl:url,\n");
      out.write("\t\t\t\t\ttype:\"get\",\n");
      out.write("\t\t\t\t\tdataType:\"json\",\n");
      out.write("\t\t\t\t\tsuccess:function(data){\n");
      out.write("\t\t\t\t\t\ttop.tip(data.msg);\n");
      out.write("\t\t\t\t\t\tif(data.success){\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t$(\"#jeecgrowList\").datagrid('reload');\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t})\n");
      out.write("\t        }\n");
      out.write("\t    });\n");
      out.write("\t}\n");
      out.write("    //上下特殊布局 优化表单数据填充逻辑--------------------\t\n");
      out.write(" \tfunction fillData(rowData){ \n");
      out.write(" \t\t//清空表单\t\n");
      out.write(" \t\t$(\"#ff\").form('clear');\n");
      out.write(" \t\t//填充数据\n");
      out.write(" \t\tfor(var d in rowData){\n");
      out.write("\t\t\t$(\"#\"+d).val(rowData[d]);\n");
      out.write("\t\t}\n");
      out.write("\t\t//处理特殊控件\n");
      out.write(" \t\tvar birthday = rowData[\"birthday\"];\n");
      out.write("\t\tif(birthday != undefined){\n");
      out.write("\t\t\tbirthday = birthday.replace(\" 00:00:00.0\",\"\");\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\tbirthday = \"\";\n");
      out.write("\t\t}\t\t\n");
      out.write("\t\t$(\"#birthday\").datebox(\"setValue\", birthday); \n");
      out.write(" \t}\n");
      out.write(" \t$(function(){\n");
      out.write(" \t\n");
      out.write(" \t\t $(\"#jeecgrowList\").datagrid({\n");
      out.write("\t\t\tonClickRow: function(rowIndex, rowData){\n");
      out.write("\t\t\t\tfillData(rowData);\n");
      out.write("\t\t\t\t$(\"#editPanel\").panel({title:\"编辑数据\"});\t\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\t\n");
      out.write("\n");
      out.write("\t\t//隐藏滚动条，固定高度，可根据表单字段数量调整\n");
      out.write("\t\t$(\"body\").css({\"overflow\": \"hidden\",\"height\": \"600px\"});\n");
      out.write("\t\t \n");
      out.write("\t\t $(\"#ff\").Validform({\n");
      out.write("\t\t\ttiptype:1, \n");
      out.write("\t\t\tdragonfly:false,\n");
      out.write("\t\t\ttipSweep:false,\n");
      out.write("\t\t\tshowAllError:false,\n");
      out.write("\t\t\tpostonce:true,\n");
      out.write("\t\t\tajaxPost:true\n");
      out.write("\t\t}); \n");
      out.write(" \t})\n");
      out.write("\t\n");
      out.write("\t//保存数据\n");
      out.write("\tfunction saveData(){\n");
      out.write("\t\t//var demo=$(\".formsub\").Validform(); \n");
      out.write("\t\t$(\"#ff\").Validform({\n");
      out.write("\t\t\tcallback:function(data){\n");
      out.write("\t\t\t\ttop.tip(data.msg);\n");
      out.write("\t\t\t\tif(data.success){\n");
      out.write("\t\t\t\t\tclearData();\n");
      out.write("\t\t\t\t\t$(\"#jeecgrowList\").datagrid('reload');\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}).ajaxPost(false,true);\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction cancelEdit(){\t\t\n");
      out.write("\t\tvar rowData = $(\"#jeecgrowList\").datagrid(\"getSelected\");\n");
      out.write("\t\tif (rowData != null) {\n");
      out.write("\t\t\tfillData(rowData);\n");
      out.write("\t\t\t$(\"#editPanel\").panel({title:\"编辑数据\"});\t\t\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\tclearData();\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction clearData(){\n");
      out.write("\t\tvar rowData = {};\n");
      out.write("\t\tfillData(rowData);\t\n");
      out.write("\t\t$(\"#editPanel\").panel({title:\"新增数据\"});\n");
      out.write("\t\t$(\"#jeecgrowList\").datagrid('clearChecked');\n");
      out.write("\t}\n");
      out.write(" \n");
      out.write(" </script>\n");
      out.write(" <!--新提示方法改进   美化布局-------------------  -->  \n");
      out.write(" <style type=\"text/css\">\n");
      out.write(" \t.value{\n");
      out.write(" \t\tpadding: 10px auto 10px 10px;\n");
      out.write(" \t}\n");
      out.write(" </style>\n");
      out.write(" \t</div>\n");
      out.write("    <div title=\"新增数据\" style=\"height:350px;background-color:#fff;overflow-y:auto;\"  name=\"editPanel\" id=\"editPanel\"> \n");
      out.write("    \t<div class=\"datagrid-toolbar\" style=\"float:left;width: 100%;\">\n");
      out.write("\t\t    <a href=\"#\" class=\"easyui-linkbutton l-btn l-btn-plain\" plain=\"true\" icon=\"icon-add\" onclick=\"clearData()\">\n");
      out.write("\t\t\t  \t 清空表单\n");
      out.write("\t\t    </a>\n");
      out.write("\t\t    <a href=\"#\" class=\"easyui-linkbutton l-btn l-btn-plain\" plain=\"true\" icon=\"icon-undo\" onclick=\"cancelEdit()\">\n");
      out.write("\t\t\t\t重置表单\n");
      out.write("\t\t    </a>\n");
      out.write("\t\t    <a href=\"#\" class=\"easyui-linkbutton l-btn l-btn-plain\" plain=\"true\" icon=\"icon-save\" id=\"btn_sub\" onclick=\"saveData()\"><!-- onclick=\"saveData()\" -->\n");
      out.write("\t\t    \t提交数据\n");
      out.write("\t\t    </a>\n");
      out.write("    \t</div>\n");
      out.write("\t\t");
      if (_jspx_meth_t_formvalid_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </div>");
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
    org.jeecgframework.tag.core.easyui.DataGridTag _jspx_th_t_datagrid_0 = (org.jeecgframework.tag.core.easyui.DataGridTag) _jspx_tagPool_t_datagrid_title_queryMode_pagination_pageSize_name_idField_fitColumns_actionUrl.get(org.jeecgframework.tag.core.easyui.DataGridTag.class);
    _jspx_th_t_datagrid_0.setPageContext(_jspx_page_context);
    _jspx_th_t_datagrid_0.setParent(null);
    _jspx_th_t_datagrid_0.setName("jeecgrowList");
    _jspx_th_t_datagrid_0.setPagination(true);
    _jspx_th_t_datagrid_0.setFitColumns(true);
    _jspx_th_t_datagrid_0.setTitle("数据列表");
    _jspx_th_t_datagrid_0.setActionUrl("jeecgListDemoController.do?datagrid");
    _jspx_th_t_datagrid_0.setPageSize(5);
    _jspx_th_t_datagrid_0.setIdField("id");
    _jspx_th_t_datagrid_0.setQueryMode("group");
    int _jspx_eval_t_datagrid_0 = _jspx_th_t_datagrid_0.doStartTag();
    if (_jspx_eval_t_datagrid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t");
        if (_jspx_meth_t_dgCol_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t    ");
        if (_jspx_meth_t_dgCol_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t    <!--update-begin-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题，年龄改为区间查询-->\n");
        out.write("\t    ");
        if (_jspx_meth_t_dgCol_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t    <!--update-end-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题，年龄改为区间查询-->\n");
        out.write("\t    ");
        if (_jspx_meth_t_dgCol_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t    ");
        if (_jspx_meth_t_dgCol_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t    ");
        if (_jspx_meth_t_dgCol_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t    ");
        if (_jspx_meth_t_dgCol_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t    ");
        if (_jspx_meth_t_dgCol_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t  \n");
        out.write("   \t\t");
        if (_jspx_meth_t_dgCol_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t");
        if (_jspx_meth_t_dgFunOpt_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t");
        out.write("\n");
        out.write("\t\t\t\n");
        out.write("\t  ");
        int evalDoAfterBody = _jspx_th_t_datagrid_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_datagrid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_datagrid_title_queryMode_pagination_pageSize_name_idField_fitColumns_actionUrl.reuse(_jspx_th_t_datagrid_0);
      return true;
    }
    _jspx_tagPool_t_datagrid_title_queryMode_pagination_pageSize_name_idField_fitColumns_actionUrl.reuse(_jspx_th_t_datagrid_0);
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
    _jspx_th_t_dgCol_0.setWidth(new Integer(140));
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
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_1 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_query_field_extendParams_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_1.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_1.setTitle("名称");
    _jspx_th_t_dgCol_1.setField("name");
    _jspx_th_t_dgCol_1.setQuery(true);
    _jspx_th_t_dgCol_1.setExtendParams("editor:'text'");
    _jspx_th_t_dgCol_1.setWidth(new Integer(150));
    int _jspx_eval_t_dgCol_1 = _jspx_th_t_dgCol_1.doStartTag();
    if (_jspx_th_t_dgCol_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_query_field_extendParams_nobody.reuse(_jspx_th_t_dgCol_1);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_query_field_extendParams_nobody.reuse(_jspx_th_t_dgCol_1);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_2 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_query_field_extendParams_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_2.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_2.setTitle("年龄");
    _jspx_th_t_dgCol_2.setField("age");
    _jspx_th_t_dgCol_2.setQuery(true);
    _jspx_th_t_dgCol_2.setExtendParams("editor:'numberbox'");
    _jspx_th_t_dgCol_2.setWidth(new Integer(80));
    _jspx_th_t_dgCol_2.setQueryMode("group");
    int _jspx_eval_t_dgCol_2 = _jspx_th_t_dgCol_2.doStartTag();
    if (_jspx_th_t_dgCol_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_query_field_extendParams_nobody.reuse(_jspx_th_t_dgCol_2);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_query_field_extendParams_nobody.reuse(_jspx_th_t_dgCol_2);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_3(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_3 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_formatter_field_extendParams_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_3.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_3.setTitle("生日");
    _jspx_th_t_dgCol_3.setField("birthday");
    _jspx_th_t_dgCol_3.setFormatter("yyyy-MM-dd");
    _jspx_th_t_dgCol_3.setExtendParams("editor:'datebox'");
    _jspx_th_t_dgCol_3.setWidth(new Integer(150));
    int _jspx_eval_t_dgCol_3 = _jspx_th_t_dgCol_3.doStartTag();
    if (_jspx_th_t_dgCol_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_formatter_field_extendParams_nobody.reuse(_jspx_th_t_dgCol_3);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_formatter_field_extendParams_nobody.reuse(_jspx_th_t_dgCol_3);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_4(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_4 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_query_field_extendParams_dictionary_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_4.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_4.setTitle("性别");
    _jspx_th_t_dgCol_4.setField("sex");
    _jspx_th_t_dgCol_4.setQuery(true);
    _jspx_th_t_dgCol_4.setDictionary("sex");
    _jspx_th_t_dgCol_4.setExtendParams("editor:'combobox'");
    _jspx_th_t_dgCol_4.setWidth(new Integer(100));
    int _jspx_eval_t_dgCol_4 = _jspx_th_t_dgCol_4.doStartTag();
    if (_jspx_th_t_dgCol_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_query_field_extendParams_dictionary_nobody.reuse(_jspx_th_t_dgCol_4);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_query_field_extendParams_dictionary_nobody.reuse(_jspx_th_t_dgCol_4);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_5(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_5 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_field_extendParams_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_5.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_5.setTitle("工资");
    _jspx_th_t_dgCol_5.setField("salary");
    _jspx_th_t_dgCol_5.setQueryMode("group");
    _jspx_th_t_dgCol_5.setExtendParams("editor:'numberbox'");
    _jspx_th_t_dgCol_5.setWidth(new Integer(100));
    int _jspx_eval_t_dgCol_5 = _jspx_th_t_dgCol_5.doStartTag();
    if (_jspx_th_t_dgCol_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_field_extendParams_nobody.reuse(_jspx_th_t_dgCol_5);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_field_extendParams_nobody.reuse(_jspx_th_t_dgCol_5);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_6(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_6 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_query_field_extendParams_dictionary_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_6.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_6.setTitle("入职状态");
    _jspx_th_t_dgCol_6.setField("status");
    _jspx_th_t_dgCol_6.setQuery(true);
    _jspx_th_t_dgCol_6.setDictionary("sf_yn");
    _jspx_th_t_dgCol_6.setExtendParams("editor:'combobox'");
    _jspx_th_t_dgCol_6.setWidth(new Integer(100));
    int _jspx_eval_t_dgCol_6 = _jspx_th_t_dgCol_6.doStartTag();
    if (_jspx_th_t_dgCol_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_query_field_extendParams_dictionary_nobody.reuse(_jspx_th_t_dgCol_6);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_query_field_extendParams_dictionary_nobody.reuse(_jspx_th_t_dgCol_6);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_7(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_7 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_extendParams_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_7.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_7.setTitle("个人介绍");
    _jspx_th_t_dgCol_7.setField("content");
    _jspx_th_t_dgCol_7.setHidden(true);
    _jspx_th_t_dgCol_7.setQueryMode("group");
    _jspx_th_t_dgCol_7.setWidth(new Integer(500));
    _jspx_th_t_dgCol_7.setExtendParams("editor:'text'");
    int _jspx_eval_t_dgCol_7 = _jspx_th_t_dgCol_7.doStartTag();
    if (_jspx_th_t_dgCol_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_extendParams_nobody.reuse(_jspx_th_t_dgCol_7);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_extendParams_nobody.reuse(_jspx_th_t_dgCol_7);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_8(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_8 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_8.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_8.setTitle("操作");
    _jspx_th_t_dgCol_8.setField("opt");
    _jspx_th_t_dgCol_8.setWidth(new Integer(100));
    int _jspx_eval_t_dgCol_8 = _jspx_th_t_dgCol_8.doStartTag();
    if (_jspx_th_t_dgCol_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_field_nobody.reuse(_jspx_th_t_dgCol_8);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_field_nobody.reuse(_jspx_th_t_dgCol_8);
    return false;
  }

  private boolean _jspx_meth_t_dgFunOpt_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgFunOpt
    org.jeecgframework.tag.core.easyui.DataGridFunOptTag _jspx_th_t_dgFunOpt_0 = (org.jeecgframework.tag.core.easyui.DataGridFunOptTag) _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridFunOptTag.class);
    _jspx_th_t_dgFunOpt_0.setPageContext(_jspx_page_context);
    _jspx_th_t_dgFunOpt_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgFunOpt_0.setFunname("deleteDialog(id)");
    _jspx_th_t_dgFunOpt_0.setTitle("common.delete");
    _jspx_th_t_dgFunOpt_0.setUrlclass("ace_button");
    _jspx_th_t_dgFunOpt_0.setUrlfont("fa-trash-o");
    int _jspx_eval_t_dgFunOpt_0 = _jspx_th_t_dgFunOpt_0.doStartTag();
    if (_jspx_th_t_dgFunOpt_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_nobody.reuse(_jspx_th_t_dgFunOpt_0);
      return true;
    }
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_nobody.reuse(_jspx_th_t_dgFunOpt_0);
    return false;
  }

  private boolean _jspx_meth_t_formvalid_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:formvalid
    org.jeecgframework.tag.core.easyui.FormValidationTag _jspx_th_t_formvalid_0 = (org.jeecgframework.tag.core.easyui.FormValidationTag) _jspx_tagPool_t_formvalid_tiptype_layout_formid_dialog_action.get(org.jeecgframework.tag.core.easyui.FormValidationTag.class);
    _jspx_th_t_formvalid_0.setPageContext(_jspx_page_context);
    _jspx_th_t_formvalid_0.setParent(null);
    _jspx_th_t_formvalid_0.setFormid("ff");
    _jspx_th_t_formvalid_0.setDialog(true);
    _jspx_th_t_formvalid_0.setLayout("table");
    _jspx_th_t_formvalid_0.setTiptype("4");
    _jspx_th_t_formvalid_0.setAction("jeecgListDemoController.do?saveRows");
    int _jspx_eval_t_formvalid_0 = _jspx_th_t_formvalid_0.doStartTag();
    if (_jspx_eval_t_formvalid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t<input name=\"demos[0].id\" id=\"id\" type=\"hidden\" value=\"\" /> \n");
        out.write("\t\t\t<table style=\"width: 600px;margin-bottom:75px\" cellpadding=\"0\" cellspacing=\"1\" class=\"formtable\">\n");
        out.write("\t\t\t\t\t<tbody><tr>\n");
        out.write("\t\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t\t名称:\n");
        out.write("\t\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t     <input id=\"name\" name=\"demos[0].name\" type=\"text\" style=\"width: 150px;\" class=\"inputxt\" datatype=\"*\" value=\"\">\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t\t年龄:\n");
        out.write("\t\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t     <input id=\"age\" name=\"demos[0].age\" type=\"text\" style=\"width: 150px;\" class=\"inputxt\" datatype=\"d\" value=\"\">\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t\t生日:\n");
        out.write("\t\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t\t<input class=\"easyui-datebox\" type=\"text\" name=\"demos[0].birthday\" id=\"birthday\"/>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t</tr>\n");
        out.write("\t\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t\t性别:\n");
        out.write("\t\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_t_dictSelect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t\t工资:\n");
        out.write("\t\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t     \t <input id=\"salary\" name=\"demos[0].salary\" type=\"text\" style=\"width: 150px;\" class=\"inputxt\" value=\"\">\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t\t入职状态:\n");
        out.write("\t\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_t_dictSelect_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t</tr>\n");
        out.write("\t\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t\t个人介绍:\n");
        out.write("\t\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t<td class=\"value\" colspan=\"5\">\n");
        out.write("\t\t\t\t\t\t\t<textarea name=\"demos[0].content\" id=\"content\" style=\"width: 600px;height:120px\"></textarea>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t</tr>\n");
        out.write("\t\t\t</tbody>\n");
        out.write("\t\t\t</table>\n");
        out.write("\t\t\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_t_formvalid_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_formvalid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_formvalid_tiptype_layout_formid_dialog_action.reuse(_jspx_th_t_formvalid_0);
      return true;
    }
    _jspx_tagPool_t_formvalid_tiptype_layout_formid_dialog_action.reuse(_jspx_th_t_formvalid_0);
    return false;
  }

  private boolean _jspx_meth_t_dictSelect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_0 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_typeGroupCode_title_id_field_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_0.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_dictSelect_0.setField("demos[0].sex");
    _jspx_th_t_dictSelect_0.setTypeGroupCode("sex");
    _jspx_th_t_dictSelect_0.setId("sex");
    _jspx_th_t_dictSelect_0.setTitle("性别");
    int _jspx_eval_t_dictSelect_0 = _jspx_th_t_dictSelect_0.doStartTag();
    if (_jspx_th_t_dictSelect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_typeGroupCode_title_id_field_nobody.reuse(_jspx_th_t_dictSelect_0);
      return true;
    }
    _jspx_tagPool_t_dictSelect_typeGroupCode_title_id_field_nobody.reuse(_jspx_th_t_dictSelect_0);
    return false;
  }

  private boolean _jspx_meth_t_dictSelect_1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_1 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_typeGroupCode_title_id_field_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_1.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_dictSelect_1.setField("demos[0].status");
    _jspx_th_t_dictSelect_1.setId("status");
    _jspx_th_t_dictSelect_1.setTypeGroupCode("sf_yn");
    _jspx_th_t_dictSelect_1.setTitle("入职状态");
    int _jspx_eval_t_dictSelect_1 = _jspx_th_t_dictSelect_1.doStartTag();
    if (_jspx_th_t_dictSelect_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_typeGroupCode_title_id_field_nobody.reuse(_jspx_th_t_dictSelect_1);
      return true;
    }
    _jspx_tagPool_t_dictSelect_typeGroupCode_title_id_field_nobody.reuse(_jspx_th_t_dictSelect_1);
    return false;
  }
}
