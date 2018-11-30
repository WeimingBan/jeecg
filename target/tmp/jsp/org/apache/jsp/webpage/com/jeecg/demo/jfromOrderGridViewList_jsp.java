package org.apache.jsp.webpage.com.jeecg.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jfromOrderGridViewList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_base_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_datagrid_title_queryMode_name_idField_fitColumns_fit_extendParams_checkbox_actionUrl;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_queryMode_query_hidden_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_formatter_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_dictionary_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgDelOpt_urlfont_urlclass_url_title_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgToolBar_width_url_title_icon_height_funname_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgToolBar_url_title_icon_funname_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgToolBar_title_icon_funname_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_datagrid_title_queryMode_name_idField_fitColumns_fit_extendParams_checkbox_actionUrl = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_queryMode_query_hidden_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_formatter_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_dictionary_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgDelOpt_urlfont_urlclass_url_title_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgToolBar_width_url_title_icon_height_funname_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgToolBar_url_title_icon_funname_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgToolBar_title_icon_funname_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
    _jspx_tagPool_t_datagrid_title_queryMode_name_idField_fitColumns_fit_extendParams_checkbox_actionUrl.release();
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_queryMode_query_hidden_field_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_formatter_field_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_dictionary_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_field_nobody.release();
    _jspx_tagPool_t_dgDelOpt_urlfont_urlclass_url_title_nobody.release();
    _jspx_tagPool_t_dgToolBar_width_url_title_icon_height_funname_nobody.release();
    _jspx_tagPool_t_dgToolBar_url_title_icon_funname_nobody.release();
    _jspx_tagPool_t_dgToolBar_title_icon_funname_nobody.release();
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
      out.write("<div class=\"easyui-layout\" fit=\"true\">  \n");
      out.write("  <div region=\"center\" style=\"padding:0px;border:0px\">\n");
      out.write("  ");
      if (_jspx_meth_t_datagrid_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  </div>\n");
      out.write(" </div>\n");
      out.write(" <script src = \"webpage/com/jeecg/demo/jfromOrderList.js\"></script>\n");
      out.write(" <script src=\"plug-in/easyui/extends/datagrid-detailview.js\"></script>\n");
      out.write(" <script type=\"text/javascript\">\n");
      out.write(" \n");
      out.write("//导入\n");
      out.write("function ImportXls() {\n");
      out.write("\topenuploadwin('Excel导入', 'jfromOrderController.do?upload', \"jfromOrderList\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("//导出\n");
      out.write("function ExportXls() {\n");
      out.write("\tJeecgExcelExport(\"jfromOrderController.do?exportXls\",\"jfromOrderList\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("//模板下载\n");
      out.write("function ExportXlsByT() {\n");
      out.write("\tJeecgExcelExport(\"jfromOrderController.do?exportXlsByT\",\"jfromOrderList\");\n");
      out.write("}\n");
      out.write("//返回行明细内容的格式化函数。\n");
      out.write("function detailFormatterFun() {\n");
      out.write("    var s = '<div class=\"orderInfoHidden\" style=\"padding:2px;\">' \n");
      out.write("   \t\t+ '\t\t<div class=\"easyui-tabs\" style=\"height:230px;width:800px;\">' \n");
      out.write("   \t\t+ '\t\t\t<div title=\"订单明细\" style=\"padding:2px;\">' \n");
      out.write("   \t\t+ '\t\t\t\t<table class=\"jfrom_order_linetablelines\" ></table>' \n");
      out.write("   \t\t+ '\t\t\t</div>' \n");
      out.write("   \t\t+ '\t\t</div>' \n");
      out.write("   \t\t+ '\t</div>';\n");
      out.write("    return s;\n");
      out.write("}\n");
      out.write("//当展开一行时触发 \n");
      out.write("function onExpandRowFun(index, row) {\n");
      out.write("\t//把加上的子表tabs和datagrid初始化\n");
      out.write("    var tabs = $(this).datagrid('getRowDetail', index).find('div.easyui-tabs');\n");
      out.write("    tabs.tabs();\n");
      out.write("    var jfrom_order_linetablelines = $(this).datagrid('getRowDetail', index).find('table.jfrom_order_linetablelines');\n");
      out.write("    var jfrom_order_linedurl = 'jfromOrderController.do?jfromOrderLineDatagrid&field=itemName,qty,price,amount&orderid=' + row.id;\n");
      out.write("    jfrom_order_linetablelines.datagrid({\n");
      out.write("        singleSelect: true,\n");
      out.write("        loadMsg: '正在加载',\n");
      out.write("        fitColumns: true,\n");
      out.write("        height: '180',\n");
      out.write("        pageSize: 50,\n");
      out.write("        pageList: [50, 150, 200, 250, 300],\n");
      out.write("        border: false,\n");
      out.write("        url: jfrom_order_linedurl,\n");
      out.write("        idField: 'id',\n");
      out.write("        rownumbers: true,\n");
      out.write("        pagination: true,\n");
      out.write("        columns: [[{\n");
      out.write("            title: '商品名称',\n");
      out.write("            field: 'itemName',\n");
      out.write("            align: 'left',\n");
      out.write("            width: 50\n");
      out.write("        },\n");
      out.write("        {\n");
      out.write("            title: '商品数量',\n");
      out.write("            field: 'qty',\n");
      out.write("            align: 'left',\n");
      out.write("            width: 50\n");
      out.write("        },\n");
      out.write("        {\n");
      out.write("            title: '商品价格',\n");
      out.write("            field: 'price',\n");
      out.write("            align: 'left',\n");
      out.write("            width: 50\n");
      out.write("        },\n");
      out.write("        {\n");
      out.write("            title: '金额',\n");
      out.write("            field: 'amount',\n");
      out.write("            align: 'left',\n");
      out.write("            width: 50\n");
      out.write("        }]]\n");
      out.write("    });\n");
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
    _jspx_th_t_base_0.setType("jquery,easyui,tools,DatePicker");
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
    org.jeecgframework.tag.core.easyui.DataGridTag _jspx_th_t_datagrid_0 = (org.jeecgframework.tag.core.easyui.DataGridTag) _jspx_tagPool_t_datagrid_title_queryMode_name_idField_fitColumns_fit_extendParams_checkbox_actionUrl.get(org.jeecgframework.tag.core.easyui.DataGridTag.class);
    _jspx_th_t_datagrid_0.setPageContext(_jspx_page_context);
    _jspx_th_t_datagrid_0.setParent(null);
    _jspx_th_t_datagrid_0.setName("jfromOrderList");
    _jspx_th_t_datagrid_0.setCheckbox(true);
    _jspx_th_t_datagrid_0.setFitColumns(true);
    _jspx_th_t_datagrid_0.setTitle("订单列表");
    _jspx_th_t_datagrid_0.setExtendParams("view: detailview,detailFormatter:detailFormatterFun,onExpandRow: onExpandRowFun");
    _jspx_th_t_datagrid_0.setActionUrl("jfromOrderController.do?datagrid");
    _jspx_th_t_datagrid_0.setIdField("id");
    _jspx_th_t_datagrid_0.setFit(true);
    _jspx_th_t_datagrid_0.setQueryMode("group");
    int _jspx_eval_t_datagrid_0 = _jspx_th_t_datagrid_0.doStartTag();
    if (_jspx_eval_t_datagrid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgCol_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgCol_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgCol_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgCol_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgCol_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgCol_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgCol_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgCol_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgCol_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgCol_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgCol_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgCol_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgCol_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgCol_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgCol_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgCol_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgCol_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("   ");
        if (_jspx_meth_t_dgDelOpt_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
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
        out.write("  ");
        int evalDoAfterBody = _jspx_th_t_datagrid_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_datagrid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_datagrid_title_queryMode_name_idField_fitColumns_fit_extendParams_checkbox_actionUrl.reuse(_jspx_th_t_datagrid_0);
      return true;
    }
    _jspx_tagPool_t_datagrid_title_queryMode_name_idField_fitColumns_fit_extendParams_checkbox_actionUrl.reuse(_jspx_th_t_datagrid_0);
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
    _jspx_th_t_dgCol_0.setTitle("主键");
    _jspx_th_t_dgCol_0.setField("id");
    _jspx_th_t_dgCol_0.setHidden(true);
    _jspx_th_t_dgCol_0.setQueryMode("single");
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
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_1 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_query_hidden_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_1.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_1.setTitle("创建人名称");
    _jspx_th_t_dgCol_1.setField("createName");
    _jspx_th_t_dgCol_1.setHidden(true);
    _jspx_th_t_dgCol_1.setQueryMode("single");
    _jspx_th_t_dgCol_1.setQuery(true);
    _jspx_th_t_dgCol_1.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_1 = _jspx_th_t_dgCol_1.doStartTag();
    if (_jspx_th_t_dgCol_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_query_hidden_field_nobody.reuse(_jspx_th_t_dgCol_1);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_query_hidden_field_nobody.reuse(_jspx_th_t_dgCol_1);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_2 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_2.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_2.setTitle("创建人登录名称");
    _jspx_th_t_dgCol_2.setField("createBy");
    _jspx_th_t_dgCol_2.setHidden(true);
    _jspx_th_t_dgCol_2.setQueryMode("single");
    _jspx_th_t_dgCol_2.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_2 = _jspx_th_t_dgCol_2.doStartTag();
    if (_jspx_th_t_dgCol_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.reuse(_jspx_th_t_dgCol_2);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.reuse(_jspx_th_t_dgCol_2);
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
    _jspx_th_t_dgCol_3.setTitle("创建日期");
    _jspx_th_t_dgCol_3.setField("createDate");
    _jspx_th_t_dgCol_3.setFormatter("yyyy-MM-dd");
    _jspx_th_t_dgCol_3.setHidden(true);
    _jspx_th_t_dgCol_3.setQueryMode("single");
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
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_4 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_4.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_4.setTitle("更新人名称");
    _jspx_th_t_dgCol_4.setField("updateName");
    _jspx_th_t_dgCol_4.setHidden(true);
    _jspx_th_t_dgCol_4.setQueryMode("single");
    _jspx_th_t_dgCol_4.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_4 = _jspx_th_t_dgCol_4.doStartTag();
    if (_jspx_th_t_dgCol_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.reuse(_jspx_th_t_dgCol_4);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.reuse(_jspx_th_t_dgCol_4);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_5(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_5 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_5.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_5.setTitle("更新人登录名称");
    _jspx_th_t_dgCol_5.setField("updateBy");
    _jspx_th_t_dgCol_5.setHidden(true);
    _jspx_th_t_dgCol_5.setQueryMode("single");
    _jspx_th_t_dgCol_5.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_5 = _jspx_th_t_dgCol_5.doStartTag();
    if (_jspx_th_t_dgCol_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.reuse(_jspx_th_t_dgCol_5);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.reuse(_jspx_th_t_dgCol_5);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_6(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_6 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_formatter_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_6.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_6.setTitle("更新日期");
    _jspx_th_t_dgCol_6.setField("updateDate");
    _jspx_th_t_dgCol_6.setFormatter("yyyy-MM-dd");
    _jspx_th_t_dgCol_6.setHidden(true);
    _jspx_th_t_dgCol_6.setQueryMode("single");
    _jspx_th_t_dgCol_6.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_6 = _jspx_th_t_dgCol_6.doStartTag();
    if (_jspx_th_t_dgCol_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_formatter_field_nobody.reuse(_jspx_th_t_dgCol_6);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_formatter_field_nobody.reuse(_jspx_th_t_dgCol_6);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_7(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_7 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_7.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_7.setTitle("所属部门");
    _jspx_th_t_dgCol_7.setField("sysOrgCode");
    _jspx_th_t_dgCol_7.setHidden(true);
    _jspx_th_t_dgCol_7.setQueryMode("single");
    _jspx_th_t_dgCol_7.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_7 = _jspx_th_t_dgCol_7.doStartTag();
    if (_jspx_th_t_dgCol_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.reuse(_jspx_th_t_dgCol_7);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.reuse(_jspx_th_t_dgCol_7);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_8(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_8 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_8.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_8.setTitle("所属公司");
    _jspx_th_t_dgCol_8.setField("sysCompanyCode");
    _jspx_th_t_dgCol_8.setHidden(true);
    _jspx_th_t_dgCol_8.setQueryMode("single");
    _jspx_th_t_dgCol_8.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_8 = _jspx_th_t_dgCol_8.doStartTag();
    if (_jspx_th_t_dgCol_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.reuse(_jspx_th_t_dgCol_8);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.reuse(_jspx_th_t_dgCol_8);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_9(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_9 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_dictionary_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_9.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_9.setTitle("流程状态");
    _jspx_th_t_dgCol_9.setField("bpmStatus");
    _jspx_th_t_dgCol_9.setHidden(true);
    _jspx_th_t_dgCol_9.setQueryMode("single");
    _jspx_th_t_dgCol_9.setDictionary("bpm_status");
    _jspx_th_t_dgCol_9.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_9 = _jspx_th_t_dgCol_9.doStartTag();
    if (_jspx_th_t_dgCol_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_dictionary_nobody.reuse(_jspx_th_t_dgCol_9);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_dictionary_nobody.reuse(_jspx_th_t_dgCol_9);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_10(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_10 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_10.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_10.setTitle("收货人");
    _jspx_th_t_dgCol_10.setField("receiverName");
    _jspx_th_t_dgCol_10.setQueryMode("single");
    _jspx_th_t_dgCol_10.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_10 = _jspx_th_t_dgCol_10.doStartTag();
    if (_jspx_th_t_dgCol_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody.reuse(_jspx_th_t_dgCol_10);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody.reuse(_jspx_th_t_dgCol_10);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_11(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_11 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_11.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_11.setTitle("联系电话");
    _jspx_th_t_dgCol_11.setField("receiverMobile");
    _jspx_th_t_dgCol_11.setQueryMode("single");
    _jspx_th_t_dgCol_11.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_11 = _jspx_th_t_dgCol_11.doStartTag();
    if (_jspx_th_t_dgCol_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody.reuse(_jspx_th_t_dgCol_11);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody.reuse(_jspx_th_t_dgCol_11);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_12(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_12 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_12.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_12.setTitle("收货省");
    _jspx_th_t_dgCol_12.setField("receiverState");
    _jspx_th_t_dgCol_12.setQueryMode("single");
    _jspx_th_t_dgCol_12.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_12 = _jspx_th_t_dgCol_12.doStartTag();
    if (_jspx_th_t_dgCol_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody.reuse(_jspx_th_t_dgCol_12);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody.reuse(_jspx_th_t_dgCol_12);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_13(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_13 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_13.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_13.setTitle("收货市");
    _jspx_th_t_dgCol_13.setField("receiverCity");
    _jspx_th_t_dgCol_13.setQueryMode("single");
    _jspx_th_t_dgCol_13.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_13 = _jspx_th_t_dgCol_13.doStartTag();
    if (_jspx_th_t_dgCol_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody.reuse(_jspx_th_t_dgCol_13);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody.reuse(_jspx_th_t_dgCol_13);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_14(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_14 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_14.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_14.setTitle("收货区");
    _jspx_th_t_dgCol_14.setField("receiverDistrict");
    _jspx_th_t_dgCol_14.setQueryMode("single");
    _jspx_th_t_dgCol_14.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_14 = _jspx_th_t_dgCol_14.doStartTag();
    if (_jspx_th_t_dgCol_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody.reuse(_jspx_th_t_dgCol_14);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody.reuse(_jspx_th_t_dgCol_14);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_15(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_15 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_15.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_15.setTitle("收货地址");
    _jspx_th_t_dgCol_15.setField("receiverAddress");
    _jspx_th_t_dgCol_15.setQueryMode("single");
    _jspx_th_t_dgCol_15.setWidth(new Integer(210));
    int _jspx_eval_t_dgCol_15 = _jspx_th_t_dgCol_15.doStartTag();
    if (_jspx_th_t_dgCol_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody.reuse(_jspx_th_t_dgCol_15);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_field_nobody.reuse(_jspx_th_t_dgCol_15);
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
    _jspx_th_t_dgCol_16.setTitle("操作");
    _jspx_th_t_dgCol_16.setField("opt");
    _jspx_th_t_dgCol_16.setWidth(new Integer(100));
    int _jspx_eval_t_dgCol_16 = _jspx_th_t_dgCol_16.doStartTag();
    if (_jspx_th_t_dgCol_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_field_nobody.reuse(_jspx_th_t_dgCol_16);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_field_nobody.reuse(_jspx_th_t_dgCol_16);
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
    _jspx_th_t_dgDelOpt_0.setUrl("jfromOrderController.do?doDel&id={id}");
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
    _jspx_th_t_dgToolBar_0.setUrl("jfromOrderController.do?goAdd");
    _jspx_th_t_dgToolBar_0.setFunname("add");
    _jspx_th_t_dgToolBar_0.setWidth("100%");
    _jspx_th_t_dgToolBar_0.setHeight("100%");
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
    _jspx_th_t_dgToolBar_1.setTitle("编辑");
    _jspx_th_t_dgToolBar_1.setIcon("icon-edit");
    _jspx_th_t_dgToolBar_1.setUrl("jfromOrderController.do?goUpdate");
    _jspx_th_t_dgToolBar_1.setFunname("update");
    _jspx_th_t_dgToolBar_1.setWidth("100%");
    _jspx_th_t_dgToolBar_1.setHeight("100%");
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
    _jspx_th_t_dgToolBar_2.setTitle("批量删除");
    _jspx_th_t_dgToolBar_2.setIcon("icon-remove");
    _jspx_th_t_dgToolBar_2.setUrl("jfromOrderController.do?doBatchDel");
    _jspx_th_t_dgToolBar_2.setFunname("deleteALLSelect");
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
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_3 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_width_url_title_icon_height_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_3.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_3.setTitle("查看");
    _jspx_th_t_dgToolBar_3.setIcon("icon-search");
    _jspx_th_t_dgToolBar_3.setUrl("jfromOrderController.do?goUpdate");
    _jspx_th_t_dgToolBar_3.setFunname("detail");
    _jspx_th_t_dgToolBar_3.setWidth("100%");
    _jspx_th_t_dgToolBar_3.setHeight("100%");
    int _jspx_eval_t_dgToolBar_3 = _jspx_th_t_dgToolBar_3.doStartTag();
    if (_jspx_th_t_dgToolBar_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_width_url_title_icon_height_funname_nobody.reuse(_jspx_th_t_dgToolBar_3);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_width_url_title_icon_height_funname_nobody.reuse(_jspx_th_t_dgToolBar_3);
    return false;
  }

  private boolean _jspx_meth_t_dgToolBar_4(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_4 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_title_icon_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_4.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_4.setTitle("导入");
    _jspx_th_t_dgToolBar_4.setIcon("icon-put");
    _jspx_th_t_dgToolBar_4.setFunname("ImportXls");
    int _jspx_eval_t_dgToolBar_4 = _jspx_th_t_dgToolBar_4.doStartTag();
    if (_jspx_th_t_dgToolBar_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_4);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_4);
    return false;
  }

  private boolean _jspx_meth_t_dgToolBar_5(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_5 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_title_icon_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_5.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_5.setTitle("导出");
    _jspx_th_t_dgToolBar_5.setIcon("icon-putout");
    _jspx_th_t_dgToolBar_5.setFunname("ExportXls");
    int _jspx_eval_t_dgToolBar_5 = _jspx_th_t_dgToolBar_5.doStartTag();
    if (_jspx_th_t_dgToolBar_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_5);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_5);
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
    _jspx_th_t_dgToolBar_6.setTitle("模板下载");
    _jspx_th_t_dgToolBar_6.setIcon("icon-putout");
    _jspx_th_t_dgToolBar_6.setFunname("ExportXlsByT");
    int _jspx_eval_t_dgToolBar_6 = _jspx_th_t_dgToolBar_6.doStartTag();
    if (_jspx_th_t_dgToolBar_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_6);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_6);
    return false;
  }
}
