package org.apache.jsp.webpage.com.jeecg.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class dropDownDatagrid_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_base_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_formvalid_layout_formid_dialog;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_formvalid_layout_formid_dialog = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
    _jspx_tagPool_t_formvalid_layout_formid_dialog.release();
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
      out.write("</head>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("(function ($) {\n");
      out.write("    \n");
      out.write("    //设置值\n");
      out.write("    function _setValues(jq, values, remainText) {\n");
      out.write("        var options = $.data(jq, \"combogrid\").options;\n");
      out.write("        var grid = $.data(jq, \"combogrid\").grid;\n");
      out.write("        var rows = grid.datagrid(\"getRows\");\n");
      out.write("        var ss = [];\n");
      out.write("        for (var i = 0; i < values.length; i++) {\n");
      out.write("            var index = grid.datagrid(\"getRowIndex\", values[i]);\n");
      out.write("            if (index >= 0) {\n");
      out.write("                grid.datagrid(\"selectRow\", index);\n");
      out.write("                ss.push(rows[index][options.textField]);\n");
      out.write("            } else {\n");
      out.write("                ss.push(values[i]);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        if ($(jq).combo(\"getValues\").join(\",\") == values.join(\",\")) {\n");
      out.write("            return;\n");
      out.write("        }\n");
      out.write("        $(jq).combo(\"setValues\", values);\n");
      out.write("        if (!remainText) {\n");
      out.write("            $(jq).combo(\"setText\", ss.join(options.separator));\n");
      out.write("        }\n");
      out.write("    };\n");
      out.write("    //查询\n");
      out.write("    function _query(jq, q) {\n");
      out.write("        var options = $.data(jq, \"combogrid\").options;\n");
      out.write("        var grid = $.data(jq, \"combogrid\").grid;\n");
      out.write("        $.data(jq, \"combogrid\").remainText = true;\n");
      out.write("        if (options.multiple && !q) {\n");
      out.write("            _setValues(jq, [], true);\n");
      out.write("        } else {\n");
      out.write("            _setValues(jq, [q], true);\n");
      out.write("        }\n");
      out.write("        if (options.mode == \"remote\") {\n");
      out.write("            grid.datagrid(\"clearSelections\");\n");
      out.write("            grid.datagrid(\"load\", $.extend({}, options.queryParams, { q: q }));\n");
      out.write("        } else {\n");
      out.write("            if (!q) {\n");
      out.write("                return;\n");
      out.write("            }\n");
      out.write("            var rows = grid.datagrid(\"getRows\");\n");
      out.write("            for (var i = 0; i < rows.length; i++) {\n");
      out.write("                if (options.filter.call(jq, q, rows[i])) {\n");
      out.write("                    grid.datagrid(\"clearSelections\");\n");
      out.write("                    grid.datagrid(\"selectRow\", i);\n");
      out.write("                    return;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    };\n");
      out.write("    //解析器\n");
      out.write("    $.fn.combogrid.parseOptions = function (target) {\n");
      out.write("        var t = $(target);\n");
      out.write("        return $.extend({}, $.fn.combo.parseOptions(target),\n");
      out.write("            $.fn.datagrid.parseOptions(target),\n");
      out.write("            $.parser.parseOptions(target, [\"idField\", \"textField\", \"mode\"]));\n");
      out.write("    };\n");
      out.write("    $.fn.combogrid.defaults = $.extend({}, $.fn.combo.defaults,\n");
      out.write("        $.fn.datagrid.defaults, {\n");
      out.write("            loadMsg: null,//在数据表格加载远程数据的时候显示消息\n");
      out.write("            idField: null,//ID字段名称\n");
      out.write("            textField: null,//ID字段名称\n");
      out.write("            //定义在文本改变的时候如何读取数据网格数据。设置为'remote'，\n");
      out.write("            //数据表格将从远程服务器加载数据。当设置为'remote'模式的时候，用户输入将会发送到名为'q'的http请求参数，向服务器检索新的数据。\n");
      out.write("            mode: \"local\",\n");
      out.write("\n");
      out.write("            keyHandler: {\n");
      out.write("            up: function () {\n");
      out.write("                    selectRow(this, -1);\n");
      out.write("                },\n");
      out.write("                down: function () {\n");
      out.write("                    selectRow(this, 1);\n");
      out.write("                },\n");
      out.write("                enter: function () {\n");
      out.write("                    selectRow(this, 0);\n");
      out.write("                    $(this).combo(\"hidePanel\");\n");
      out.write("                },\n");
      out.write("                query: function (q) {\n");
      out.write("                    _query(this, q);\n");
      out.write("                }\n");
      out.write("            },\n");
      out.write("            //定义在'mode'设置为'local'的时候如何选择本地数据，返回true时则选择该行\n");
      out.write("            filter: function (q, row) {\n");
      out.write("            var options = $(this).combogrid(\"options\");\n");
      out.write("            return row[options.textField].indexOf(q) == 0;\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("})(jQuery);\n");
      out.write("\n");
      out.write("</script>\n");
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
    org.jeecgframework.tag.core.easyui.FormValidationTag _jspx_th_t_formvalid_0 = (org.jeecgframework.tag.core.easyui.FormValidationTag) _jspx_tagPool_t_formvalid_layout_formid_dialog.get(org.jeecgframework.tag.core.easyui.FormValidationTag.class);
    _jspx_th_t_formvalid_0.setPageContext(_jspx_page_context);
    _jspx_th_t_formvalid_0.setParent(null);
    _jspx_th_t_formvalid_0.setLayout("div");
    _jspx_th_t_formvalid_0.setFormid("dd");
    _jspx_th_t_formvalid_0.setDialog(false);
    int _jspx_eval_t_formvalid_0 = _jspx_th_t_formvalid_0.doStartTag();
    if (_jspx_eval_t_formvalid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t <fieldset>\n");
        out.write("\t\t <legend>下拉列表控件</legend>\n");
        out.write("\t\t\t<div class=\"container\">\t\n");
        out.write("\t\t\t<h2 class=\"page-header\"></h2>\n");
        out.write("\t\t\t\t<div class=\"docs-methods\" style=\"height:400px\">\n");
        out.write("\t\t\t\t\t<input id=\"cc\" class=\"easyui-combogrid\" style=\"width:250px\" data-options=\"\n");
        out.write("\t\t\t            panelWidth: 500,\n");
        out.write("\t\t\t            idField: 'name',\n");
        out.write("\t\t\t            textField: 'name',\n");
        out.write("\t\t\t            url: 'jeecgListDemoController.do?datagrid&field=id,name,age,birthday,depId,extField,sex,phone,salary,createDate,email,status,content,touxiang,createBy,createName,updateBy,updateDate,updateName,',\n");
        out.write("\t\t\t            columns: [[\n");
        out.write("\t\t\t                {field:'name',title:'姓名',width:80},\n");
        out.write("\t\t\t                {field:'age',title:'年龄',width:120},\n");
        out.write("\t\t\t                {field: 'sex',title: '性别',width: 120,\n");
        out.write("\t\t\t\t\t\t\tformatter: function(value, rec, index) {\n");
        out.write("\t\t\t\t\t\t\t\tif (value == '0') {\n");
        out.write("\t\t\t                        return '男';\n");
        out.write("\t\t\t                    }\n");
        out.write("\t\t\t                    if (value == '1') {\n");
        out.write("\t\t\t                        return '女';\n");
        out.write("\t\t\t                    } else {\n");
        out.write("\t\t\t                        return value;\n");
        out.write("\t\t\t                    }\n");
        out.write("\t\t\t\t\t\t\t}\n");
        out.write("\t\t\t            },\n");
        out.write("\t\t\t\t\t\t{field:'salary',title: '工资', sortable: true,width:120},\n");
        out.write("\t\t\t            ]],\n");
        out.write("\t\t\t             fitColumns: true\n");
        out.write("\t\t\t        \">\n");
        out.write("\t\t\t</div>\n");
        out.write("\t\t</div>\n");
        out.write("\t</fieldset>\n");
        int evalDoAfterBody = _jspx_th_t_formvalid_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_formvalid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_formvalid_layout_formid_dialog.reuse(_jspx_th_t_formvalid_0);
      return true;
    }
    _jspx_tagPool_t_formvalid_layout_formid_dialog.reuse(_jspx_th_t_formvalid_0);
    return false;
  }
}
