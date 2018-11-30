package org.apache.jsp.webpage.com.jeecg.demo.jformOrderMain2.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jformOrderCustomer2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.release();
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
      out.write("<!-- <h4>分类标题</h4> -->\n");
      out.write("\t    <div class=\"row\">\n");
      out.write("\t      <div class=\"col-md-12 layout-header\">\n");
      out.write("\t        <button id=\"addBtn_JformOrderCustomer2\" type=\"button\" class=\"btn btn-default\">添加</button>\n");
      out.write("\t        <button id=\"delBtn_JformOrderCustomer2\" type=\"button\" class=\"btn btn-default\">删除</button>\n");
      out.write("\t        <script type=\"text/javascript\"> \n");
      out.write("\t\t\t$('#addBtn_JformOrderCustomer2').bind('click', function(){   \n");
      out.write("\t\t \t\t var tr =  $(\"#add_jformOrderCustomer2_table_template>tr\").clone();\n");
      out.write("\t\t\t \t $(\"#add_jformOrderCustomer2_table\").append(tr);\n");
      out.write("\t\t\t \t resetTrNum('add_jformOrderCustomer2_table');\n");
      out.write("\t\t\t \t return false;\n");
      out.write("\t\t    });  \n");
      out.write("\t\t\t$('#delBtn_JformOrderCustomer2').bind('click', function(){   \n");
      out.write("\t\t       $(\"#add_jformOrderCustomer2_table\").find(\"input[name$='ck']:checked\").parent().parent().remove();   \n");
      out.write("\t\t        resetTrNum('add_jformOrderCustomer2_table');\n");
      out.write("\t\t        return false;\n");
      out.write("\t\t    });\n");
      out.write("\t\t    $(document).ready(function(){\n");
      out.write("\t\t    \tif(location.href.indexOf(\"load=detail\")!=-1){\n");
      out.write("\t\t\t\t\t$(\":input\").attr(\"disabled\",\"true\");\n");
      out.write("\t\t\t\t\t$(\".datagrid-toolbar\").hide();\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t    \tresetTrNum('add_jformOrderCustomer2_table');\n");
      out.write("\t\t    });\n");
      out.write("\t\t</script>\n");
      out.write("\t      </div>\n");
      out.write("\t    </div>\n");
      out.write("<div style=\"margin: 0; background-color: white;overflow: auto;\">    \n");
      out.write("\t    <!-- Table -->\n");
      out.write("      <table id=\"jformOrderCustomer2_table\" class=\"table table-bordered table-hover\" style=\"margin-bottom: 0;\">\n");
      out.write("\t\t<thead>\n");
      out.write("\t      <tr>\n");
      out.write("\t        <th style=\"white-space:nowrap;width:50px;\">操作</th>\n");
      out.write("\t        <th style=\"width:40px;\">序号</th>\n");
      out.write("\t\t\t\t\t\t<th>\n");
      out.write("\t\t\t\t\t\t\t客户名\n");
      out.write("\t\t\t\t\t    </th>\n");
      out.write("\t\t\t\t\t\t<th>\n");
      out.write("\t\t\t\t\t\t\t单价\n");
      out.write("\t\t\t\t\t    </th>\n");
      out.write("\t\t\t\t\t\t<th>\n");
      out.write("\t\t\t\t\t\t\t性别\n");
      out.write("\t\t\t\t\t    </th>\n");
      out.write("\t\t\t\t\t\t<th>\n");
      out.write("\t\t\t\t\t\t\t电话\n");
      out.write("\t\t\t\t\t    </th>\n");
      out.write("\t      </tr>\n");
      out.write("\t    </thead>\n");
      out.write("        \n");
      out.write("\t<tbody id=\"add_jformOrderCustomer2_table\">\t\n");
      out.write("\t");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('	');
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\t\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:length(jformOrderCustomer2List)  <= 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t<tr>\n");
        out.write("\t\t\t\t<td>\n");
        out.write("\t\t\t\t\t<input style=\"width:20px;\" type=\"checkbox\" name=\"ck\"/>\n");
        out.write("\t\t\t\t\t<input name=\"jformOrderCustomer2List[0].id\" type=\"hidden\"/>\n");
        out.write("\t\t\t\t\t<input name=\"jformOrderCustomer2List[0].fkId\" type=\"hidden\"/>\n");
        out.write("\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\n");
        out.write("\t\t\t\t<td scope=\"row\">\n");
        out.write("\t\t\t\t\t<div name=\"xh\"></div>\n");
        out.write("\t\t\t\t</td>\n");
        out.write("\t\t\t\t  \t<td>\n");
        out.write("\t\t\t\t\t\t\t<input name=\"jformOrderCustomer2List[0].name\" maxlength=\"32\" type=\"text\" class=\"form-control\"  style=\"width:120px;\"  ignore=\"ignore\" />\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t  \t<td>\n");
        out.write("\t\t\t\t\t\t\t<input name=\"jformOrderCustomer2List[0].money\" maxlength=\"10\" type=\"text\" class=\"form-control\"  style=\"width:120px;\"  datatype=\"/^(-?\\d+)(\\.\\d+)?$/\"  ignore=\"ignore\" />\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t  \t<td>\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_t_dictSelect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("     \n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t  \t<td>\n");
        out.write("\t\t\t\t\t\t\t<input name=\"jformOrderCustomer2List[0].telphone\" maxlength=\"32\" type=\"text\" class=\"form-control\"  style=\"width:120px;\"  ignore=\"ignore\" />\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("   \t\t\t</tr>\n");
        out.write("\t");
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
    _jspx_th_t_dictSelect_0.setField("jformOrderCustomer2List[0].sex");
    _jspx_th_t_dictSelect_0.setType("list");
    _jspx_th_t_dictSelect_0.setExtendJson("{class:'form-control',style:'width:150px'}");
    _jspx_th_t_dictSelect_0.setTypeGroupCode("sex");
    _jspx_th_t_dictSelect_0.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jformOrderCustomer2Page.sex}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_t_dictSelect_0.setHasLabel(false);
    _jspx_th_t_dictSelect_0.setTitle("性别");
    int _jspx_eval_t_dictSelect_0 = _jspx_th_t_dictSelect_0.doStartTag();
    if (_jspx_th_t_dictSelect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_0);
      return true;
    }
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_0);
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:length(jformOrderCustomer2List)  > 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jformOrderCustomer2List}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("poVal");
    _jspx_th_c_forEach_0.setVarStatus("stuts");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t<input style=\"width:20px;\" type=\"checkbox\" name=\"ck\"/>\n");
          out.write("\t\t\t\t\t<input name=\"jformOrderCustomer2List[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].id\" type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${poVal.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("\t\t\t\t\t<input name=\"jformOrderCustomer2List[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].fkId\" type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${poVal.fkId }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\n");
          out.write("\t\t\t\t<td scope=\"row\">\n");
          out.write("\t\t\t\t\t<div name=\"xh\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stuts.index+1 }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t   <td>\n");
          out.write("\t\t\t\t\t  \t<input name=\"jformOrderCustomer2List[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].name\" maxlength=\"32\" type=\"text\" class=\"form-control\"  style=\"width:120px;\"  ignore=\"ignore\"  value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${poVal.name }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("\t\t\t\t   </td>\n");
          out.write("\t\t\t\t   <td>\n");
          out.write("\t\t\t\t\t  \t<input name=\"jformOrderCustomer2List[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].money\" maxlength=\"10\" type=\"text\" class=\"form-control\"  style=\"width:120px;\"  datatype=\"/^(-?\\d+)(\\.\\d+)?$/\"  ignore=\"ignore\"  value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${poVal.money }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("\t\t\t\t   </td>\n");
          out.write("\t\t\t\t   <td>\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_t_dictSelect_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("     \n");
          out.write("\t\t\t\t   </td>\n");
          out.write("\t\t\t\t   <td>\n");
          out.write("\t\t\t\t\t  \t<input name=\"jformOrderCustomer2List[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].telphone\" maxlength=\"32\" type=\"text\" class=\"form-control\"  style=\"width:120px;\"  ignore=\"ignore\"  value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${poVal.telphone }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("\t\t\t\t   </td>\n");
          out.write("   \t\t\t</tr>\n");
          out.write("\t\t");
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

  private boolean _jspx_meth_t_dictSelect_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_1 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_1.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_t_dictSelect_1.setField((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("jformOrderCustomer2List[${stuts.index }].sex", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_t_dictSelect_1.setType("list");
    _jspx_th_t_dictSelect_1.setExtendJson("{class:'form-control',style:'width:150px'}");
    _jspx_th_t_dictSelect_1.setTypeGroupCode("sex");
    _jspx_th_t_dictSelect_1.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${poVal.sex }", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_t_dictSelect_1.setHasLabel(false);
    _jspx_th_t_dictSelect_1.setTitle("性别");
    int _jspx_eval_t_dictSelect_1 = _jspx_th_t_dictSelect_1.doStartTag();
    if (_jspx_th_t_dictSelect_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_1);
      return true;
    }
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_1);
    return false;
  }
}
