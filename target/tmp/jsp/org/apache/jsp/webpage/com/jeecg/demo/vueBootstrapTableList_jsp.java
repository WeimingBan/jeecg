package org.apache.jsp.webpage.com.jeecg.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vueBootstrapTableList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
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

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>vueBootstrapTableList</title>\n");
      out.write("    <meta charset=\"UTF-8\"></meta>\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"></meta>\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\"></meta>\n");
      out.write("    <link href=\"https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\"/>\n");
      out.write("    <link href=\"https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\"/>\n");
      out.write("    <link href=\"https://cdn.bootcss.com/bootstrap-table/1.12.1/bootstrap-table.min.css\" rel=\"stylesheet\"/>\n");
      out.write("    <link href=\"plug-in/vue-BootstrapTable/css/common.min.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"plug-in/vue-BootstrapTable/css/style.min.css\" rel=\"stylesheet\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"dpLTE\" class=\"container-fluid\" v-cloak>\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-md-4 form-inline pull-left\">\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t    \t<input v-model=\"keyword\" @keyup.enter=\"load\" class=\"form-control\" placeholder=\"请输入查询关键字\" style=\"width: 220px;\" />\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t    <a class=\"btn btn-primary\" @click=\"load\"><i class=\"fa fa-search\"></i>&nbsp;查询</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-8\">\n");
      out.write("\t\t\t<div class=\"btn-toolbar pull-right\">\n");
      out.write("\t\t\t\t<div class=\"btn-group\">\n");
      out.write("\t\t            <a class=\"btn btn-default\" onclick=\"reload();\"><i class=\"fa fa-refresh\"></i>&nbsp;刷新</a>\n");
      out.write("\t\t            <a class=\"btn btn-default\" @click=\"save\"><i class=\"fa fa-plus\"></i>&nbsp;新增</a>\n");
      out.write("\t\t            <a class=\"btn btn-default\" @click=\"edit\"><i class=\"fa fa-pencil-square-o\"></i>&nbsp;编辑</a>\n");
      out.write("\t\t            <a class=\"btn btn-default\" @click=\"remove\"><i class=\"fa fa-trash-o\"></i>&nbsp;删除</a>\n");
      out.write("\t\t        </div>\n");
      out.write("\t        </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<table id=\"dataGrid\"></table>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("<script src=\"https://cdn.bootcss.com/jquery/3.3.1/jquery.js\"></script>\n");
      out.write("<script src=\"https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<!-- <script src=\"https://cdn.bootcss.com/layer/3.1.0/layer.js\"></script> -->\n");
      out.write("<script src=\"https://cdn.bootcss.com/vue/2.5.17-beta.0/vue.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.bootcss.com/bootstrap-table/1.12.1/bootstrap-table.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.bootcss.com/bootstrap-table/1.12.1/locale/bootstrap-table-zh-CN.min.js\"></script>\n");
      out.write("<script src=\"plug-in/lhgDialog/lhgdialog.min.js?skin=metrole\"></script>\n");
      out.write("<script src=\"plug-in/laydate/laydate.js\"></script>\n");
      out.write("<script src=\"plug-in/vue-BootstrapTable/js/common.js\"></script>\n");
      out.write("<script src=\"plug-in/vue-BootstrapTable/js/form.js\"></script>\n");
      out.write("<script>\n");
      out.write("$(function() {\n");
      out.write("\tinitialPage();\n");
      out.write("\tgetGrid();\n");
      out.write("});\n");
      out.write("\n");
      out.write("function initialPage() {\n");
      out.write("\t$(window).resize(function() {\n");
      out.write("\t\t$('#dataGrid').bootstrapTable('resetView', {\n");
      out.write("\t\t\theight : $(window).height() - 56\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("\n");
      out.write("function getGrid() {\n");
      out.write("\t$('#dataGrid').bootstrapTableEx({\n");
      out.write("\t\turl : 'jeecgListDemoController.do?datagrid&field=id,name,sex,age,birthday,phone',\n");
      out.write("\t\theight : $(window).height() - 56,\n");
      out.write("\t\tqueryParams : function(params) {\n");
      out.write("\t\t\treturn {\n");
      out.write("\t\t\t\tname : vm.keyword,\n");
      out.write("\t\t\t\tpage : params.pageNumber,\n");
      out.write("\t\t\t\trows : params.pageSize\n");
      out.write("\t\t\t}\n");
      out.write("\t\t},\n");
      out.write("\t\tcolumns : [ {\n");
      out.write("\t\t\tcheckbox : true\n");
      out.write("\t\t}, {\n");
      out.write("\t\t\tfield : \"name\",\n");
      out.write("\t\t\ttitle : \"用户名\",\n");
      out.write("\t\t\twidth : \"200px\"\n");
      out.write("\t\t}, {\n");
      out.write("\t\t\tfield : \"sex\",\n");
      out.write("\t\t\ttitle : \"性别\",\n");
      out.write("\t\t\twidth : \"300px\",\n");
      out.write("\t\t\tformatter : function(value, row, index) {\n");
      out.write("\t\t\t\treturn value == '0'?'女':value == '1'?'男':'未知';\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}, {\n");
      out.write("\t\t\tfield : \"age\",\n");
      out.write("\t\t\ttitle : \"年龄\",\n");
      out.write("\t\t\twidth : \"130px\"\n");
      out.write("\t\t}, {\n");
      out.write("\t\t\tfield : \"birthday\",\n");
      out.write("\t\t\ttitle : \"生日\",\n");
      out.write("\t\t\twidth : \"130px\",\n");
      out.write("\t\t\tformatter : function(value, row, index) {\n");
      out.write("\t\t\t\treturn !!value?formatDate(value,'yyyy-MM-dd'):'';\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}, {\n");
      out.write("\t\t\tfield : \"phone\",\n");
      out.write("\t\t\ttitle : \"手机\",\n");
      out.write("\t\t\twidth : \"300px\"\n");
      out.write("\t\t} ]\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("\n");
      out.write("var vm = new Vue({\n");
      out.write("\tel : '#dpLTE',\n");
      out.write("\tdata : {\n");
      out.write("\t\tkeyword : null,\n");
      out.write("\t},\n");
      out.write("\tmethods : {\n");
      out.write("\t\tload : function() {\n");
      out.write("\t\t\t$('#dataGrid').bootstrapTable('refresh');\n");
      out.write("\t\t},\n");
      out.write("\t\tsave : function() {\n");
      out.write("\t\t\tdialogOpen({\n");
      out.write("\t\t\t\ttitle : '新增用户',\n");
      out.write("\t\t\t\tcontent: 'url:jeecgListDemoController.do?vueBootstrapTableAdd',\n");
      out.write("\t\t\t\twidth : '620px',\n");
      out.write("\t\t\t\theight : '400px'\n");
      out.write("\t\t\t});\n");
      out.write("\t\t},\n");
      out.write("\t\tedit : function() {\n");
      out.write("\t\t\tvar ck = $('#dataGrid').bootstrapTable('getSelections');\n");
      out.write("\t\t\tif (checkedRow(ck)) {\n");
      out.write("\t\t\t\tdialogOpen({\n");
      out.write("\t\t\t\t\ttitle : '编辑用户',\n");
      out.write("\t\t\t\t\tcontent: 'url:jeecgListDemoController.do?vueBootstrapTableEdit',\n");
      out.write("\t\t\t\t\twidth : '620px',\n");
      out.write("\t\t\t\t\theight : '400px',\n");
      out.write("\t\t\t\t\tinit : function() {\n");
      out.write("\t\t\t\t\t\tvar iframe = this.iframe.contentWindow;\n");
      out.write("\t\t\t\t\t\tiframe.vm.user.id = ck[0].id;\n");
      out.write("\t\t\t\t\t\tiframe.vm.setForm();\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t}\n");
      out.write("\t\t},\n");
      out.write("\t\tremove : function() {\n");
      out.write("\t\t\tvar ck = $('#dataGrid').bootstrapTable('getSelections'), ids = [];\n");
      out.write("\t\t\tif (checkedArray(ck)) {\n");
      out.write("\t\t\t\t$.each(ck, function(idx, item) {\n");
      out.write("\t\t\t\t\tids[idx] = item.id;\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t$.RemoveForm({\n");
      out.write("\t\t\t\t\turl : 'jeecgListDemoController.do?doBatchDel',\n");
      out.write("\t\t\t\t\tparam : {ids:ids.join(\",\")},\n");
      out.write("\t\t\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\t\t\tvm.load();\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("});\n");
      out.write("</script>\n");
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
}
