package org.apache.jsp.webpage.com.jeecg.demo.orderOne2Many;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jformOrderMainListBase_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_base_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_datagrid_title_superQuery_queryMode_name_idField_fitColumns_fit_filter_collapsible_checkbox_actionUrl;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_queryMode_query_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_queryMode_query_formatter_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_downloadName_nobody;
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
    _jspx_tagPool_t_datagrid_title_superQuery_queryMode_name_idField_fitColumns_fit_filter_collapsible_checkbox_actionUrl = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_queryMode_query_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_queryMode_query_formatter_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_downloadName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgDelOpt_urlfont_urlclass_url_title_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgToolBar_width_url_title_icon_height_funname_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgToolBar_url_title_icon_funname_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgToolBar_title_icon_funname_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
    _jspx_tagPool_t_datagrid_title_superQuery_queryMode_name_idField_fitColumns_fit_filter_collapsible_checkbox_actionUrl.release();
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_queryMode_query_field_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_queryMode_query_formatter_field_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_downloadName_nobody.release();
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
      out.write("<div class=\"easyui-layout\" fit=\"true\" id=\"lywidth_demo\">\n");
      out.write("  <div region=\"center\" style=\"padding:0px;border:0px\">\n");
      out.write("  ");
      if (_jspx_meth_t_datagrid_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  </div>\n");
      out.write(" </div>\n");
      out.write(" <script type=\"text/javascript\">\n");
      out.write("$(document).ready(function (){\n");
      out.write("\n");
      out.write("\tvar abc = $(\"#lywidth_demo\").width()+17;\n");
      out.write("\t$(\"#lywidth_demo\").css(\"min-width\", abc).css(\"padding-right\",\"17px\").css(\"box-sizing\",\"border-box\");\n");
      out.write("\n");
      out.write("\t$(\"#jformOrderMainList\").datagrid({\n");
      out.write("\t\tonClickRow: function (index, row) {\n");
      out.write("\t\t\tgetCustomerList(row.id);\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("function getCustomerList(id){\n");
      out.write("\tparent.getCustomerList(id);\n");
      out.write("}\n");
      out.write(" \n");
      out.write("//导入\n");
      out.write("function ImportXls() {\n");
      out.write("\topenuploadwin('Excel导入', 'jformOrderMainController.do?upload', \"jformOrderMainList\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("//导出\n");
      out.write("function ExportXls() {\n");
      out.write("\tJeecgExcelExport(\"jformOrderMainController.do?exportXls\",\"jformOrderMainList\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("//模板下载\n");
      out.write("function ExportXlsByT() {\n");
      out.write("\tJeecgExcelExport(\"jformOrderMainController.do?exportXlsByT\",\"jformOrderMainList\");\n");
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
    org.jeecgframework.tag.core.easyui.DataGridTag _jspx_th_t_datagrid_0 = (org.jeecgframework.tag.core.easyui.DataGridTag) _jspx_tagPool_t_datagrid_title_superQuery_queryMode_name_idField_fitColumns_fit_filter_collapsible_checkbox_actionUrl.get(org.jeecgframework.tag.core.easyui.DataGridTag.class);
    _jspx_th_t_datagrid_0.setPageContext(_jspx_page_context);
    _jspx_th_t_datagrid_0.setParent(null);
    _jspx_th_t_datagrid_0.setName("jformOrderMainList");
    _jspx_th_t_datagrid_0.setCheckbox(false);
    _jspx_th_t_datagrid_0.setFitColumns(true);
    _jspx_th_t_datagrid_0.setTitle("订单主信息");
    _jspx_th_t_datagrid_0.setActionUrl("jformOrderMainController.do?datagrid");
    _jspx_th_t_datagrid_0.setIdField("id");
    _jspx_th_t_datagrid_0.setFit(true);
    _jspx_th_t_datagrid_0.setCollapsible(true);
    _jspx_th_t_datagrid_0.setQueryMode("group");
    _jspx_th_t_datagrid_0.setSuperQuery(true);
    _jspx_th_t_datagrid_0.setFilter(true);
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
        out.write("  ");
        int evalDoAfterBody = _jspx_th_t_datagrid_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_datagrid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_datagrid_title_superQuery_queryMode_name_idField_fitColumns_fit_filter_collapsible_checkbox_actionUrl.reuse(_jspx_th_t_datagrid_0);
      return true;
    }
    _jspx_tagPool_t_datagrid_title_superQuery_queryMode_name_idField_fitColumns_fit_filter_collapsible_checkbox_actionUrl.reuse(_jspx_th_t_datagrid_0);
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
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_1 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_query_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_1.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_1.setTitle("订单号");
    _jspx_th_t_dgCol_1.setField("orderCode");
    _jspx_th_t_dgCol_1.setQueryMode("single");
    _jspx_th_t_dgCol_1.setQuery(true);
    _jspx_th_t_dgCol_1.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_1 = _jspx_th_t_dgCol_1.doStartTag();
    if (_jspx_th_t_dgCol_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_query_field_nobody.reuse(_jspx_th_t_dgCol_1);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_query_field_nobody.reuse(_jspx_th_t_dgCol_1);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_2 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_query_formatter_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_2.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_2.setTitle("订单日期");
    _jspx_th_t_dgCol_2.setField("orderDate");
    _jspx_th_t_dgCol_2.setFormatter("yyyy-MM-dd");
    _jspx_th_t_dgCol_2.setQueryMode("single");
    _jspx_th_t_dgCol_2.setQuery(true);
    _jspx_th_t_dgCol_2.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_2 = _jspx_th_t_dgCol_2.doStartTag();
    if (_jspx_th_t_dgCol_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_query_formatter_field_nobody.reuse(_jspx_th_t_dgCol_2);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_query_formatter_field_nobody.reuse(_jspx_th_t_dgCol_2);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_3(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_3 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_query_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_3.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_3.setTitle("订单金额");
    _jspx_th_t_dgCol_3.setField("orderMoney");
    _jspx_th_t_dgCol_3.setQueryMode("single");
    _jspx_th_t_dgCol_3.setQuery(true);
    _jspx_th_t_dgCol_3.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_3 = _jspx_th_t_dgCol_3.doStartTag();
    if (_jspx_th_t_dgCol_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_query_field_nobody.reuse(_jspx_th_t_dgCol_3);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_query_field_nobody.reuse(_jspx_th_t_dgCol_3);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_4(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_4 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_downloadName_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_4.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_4.setTitle("备注");
    _jspx_th_t_dgCol_4.setField("content");
    _jspx_th_t_dgCol_4.setHidden(true);
    _jspx_th_t_dgCol_4.setQueryMode("single");
    _jspx_th_t_dgCol_4.setDownloadName("附件下载");
    _jspx_th_t_dgCol_4.setWidth(new Integer(120));
    int _jspx_eval_t_dgCol_4 = _jspx_th_t_dgCol_4.doStartTag();
    if (_jspx_th_t_dgCol_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_downloadName_nobody.reuse(_jspx_th_t_dgCol_4);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_queryMode_hidden_field_downloadName_nobody.reuse(_jspx_th_t_dgCol_4);
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
    _jspx_th_t_dgCol_5.setTitle("操作");
    _jspx_th_t_dgCol_5.setField("opt");
    _jspx_th_t_dgCol_5.setWidth(new Integer(100));
    int _jspx_eval_t_dgCol_5 = _jspx_th_t_dgCol_5.doStartTag();
    if (_jspx_th_t_dgCol_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_field_nobody.reuse(_jspx_th_t_dgCol_5);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_field_nobody.reuse(_jspx_th_t_dgCol_5);
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
    _jspx_th_t_dgDelOpt_0.setUrl("jformOrderMainController.do?doDel&id={id}");
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
    _jspx_th_t_dgToolBar_0.setUrl("jformOrderMainController.do?goAdd");
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
    _jspx_th_t_dgToolBar_1.setUrl("jformOrderMainController.do?goUpdate");
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
    _jspx_th_t_dgToolBar_2.setUrl("jformOrderMainController.do?doBatchDel");
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
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_3 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_title_icon_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_3.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_3.setTitle("导入数据");
    _jspx_th_t_dgToolBar_3.setIcon("icon-put");
    _jspx_th_t_dgToolBar_3.setFunname("ImportXls");
    int _jspx_eval_t_dgToolBar_3 = _jspx_th_t_dgToolBar_3.doStartTag();
    if (_jspx_th_t_dgToolBar_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_3);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_3);
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
    _jspx_th_t_dgToolBar_4.setTitle("导出数据");
    _jspx_th_t_dgToolBar_4.setIcon("icon-putout");
    _jspx_th_t_dgToolBar_4.setFunname("ExportXls");
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
    _jspx_th_t_dgToolBar_5.setTitle("模板下载");
    _jspx_th_t_dgToolBar_5.setIcon("icon-putout");
    _jspx_th_t_dgToolBar_5.setFunname("ExportXlsByT");
    int _jspx_eval_t_dgToolBar_5 = _jspx_th_t_dgToolBar_5.doStartTag();
    if (_jspx_th_t_dgToolBar_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_5);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_5);
    return false;
  }
}
