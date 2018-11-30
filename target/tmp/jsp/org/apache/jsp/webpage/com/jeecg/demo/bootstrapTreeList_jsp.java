package org.apache.jsp.webpage.com.jeecg.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class bootstrapTreeList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("<meta name=\"viewport\" content=\"width=device-width\" />\n");
      out.write("<meta charset=\"utf-8\" />\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta content=\"width=device-width,initial-scale=1.0\" name=\"viewport\">\n");
      out.write("<meta content=\"yes\" name=\"apple-mobile-web-app-capable\">\n");
      out.write("<meta content=\"black\" name=\"apple-mobile-web-app-status-bar-style\">\n");
      out.write("<meta content=\"telephone=no\" name=\"format-detection\">\n");
      out.write("<meta content=\"email=no\" name=\"format-detection\">\n");
      out.write("<title>Bootstrap树形列表</title>\n");
      out.write("<link href=\"plug-in/bootstrap3.3.5/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"plug-in/bootstrap-table/bootstrap-table.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"plug-in/jquery/jquery.treegrid.min.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write(" <!--update-begin-Author:liushaoqian Date: 20180718 for：TASK #2968 【demo --周俊峰】做一个bootstrap-table 树形列表demo-->\n");
      out.write("<body>\n");
      out.write("<div class=\"panel-body\" style=\"padding-bottom:0px;\">\n");
      out.write("     <!-- <div id=\"toolbar\">\n");
      out.write("            <button id=\"btn_add\" type=\"button\" class=\"btn btn-primary btn-sm\" onclick=\"add('新增','jeecgListDemoController.do?goBootStrapTableAdd','table',600,400)\">\n");
      out.write("                <span class=\"glyphicon glyphicon-plus\" aria-hidden=\"true\"></span>新增\n");
      out.write("            </button>\n");
      out.write("            <button id=\"btn_edit\" type=\"button\" class=\"btn btn-success btn-sm\" onclick=\"update('修改','jeecgListDemoController.do?goBootStrapTableUpdate','table',600,400)\">\n");
      out.write("                <span class=\"glyphicon glyphicon-pencil\" aria-hidden=\"true\"></span>修改\n");
      out.write("            </button>\n");
      out.write("            <button id=\"btn_delete\" type=\"button\" class=\"btn btn-danger btn-sm\"  onclick=\"deleteALLSelect('批量删除','jeecgListDemoController.do?doBatchDel','table',600,400)\">\n");
      out.write("                <span class=\"glyphicon glyphicon-remove\" aria-hidden=\"true\"></span>批量删除\n");
      out.write("            </button>\n");
      out.write("            <a class=\"btn btn-default btn-sm\" data-toggle=\"collapse\" href=\"#collapse_search\" id=\"btn_collapse_search\" >\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-search\" aria-hidden=\"true\"></span> 检索 </a>\n");
      out.write("        </div> -->\n");
      out.write("\t    <div class=\"table-responsive\">\n");
      out.write("\t       <table id=\"table\"></table>\n");
      out.write("\t    </div>\n");
      out.write("\t    </div>\n");
      out.write("</body>\n");
      out.write("<script src=\"plug-in/jquery/jquery-1.9.1.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/bootstrap3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"plug-in/bootstrap-table/bootstrap-table-tree.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/bootstrap-table/bootstrap-table-treegrid.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/jquery/jquery.treegrid.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("  var $table = $('#table');\n");
      out.write("  $(function() {\n");
      out.write("    $table.bootstrapTable({\n");
      out.write("      url: 'jeecgFormDemoController.do?bootstrapDemoDatagrid',         //请求后台的URL（*）\n");
      out.write("      method: 'get',                      //请求方式（*）\n");
      out.write("      striped: true,                      //是否显示行间隔色\n");
      out.write("      //pagination: true,                   //是否显示分页（*）\n");
      out.write("      sidePagination: 'server',\n");
      out.write("      height: $(window).height(),\n");
      out.write("     // showToggle:true,                    //是否显示详细视图和列表视图的切换按钮\n");
      out.write("     // cardView: false,                    //是否显示详细视图\n");
      out.write("     // detailView: false,                   //是否显示父子表\n");
      out.write("      idField: 'id',\n");
      out.write("      columns: [\n");
      out.write("        {\n");
      out.write("          field: 'ck',\n");
      out.write("          checkbox: true\n");
      out.write("        },\n");
      out.write("        {\n");
      out.write("          field: 'name',\n");
      out.write("          title: '名称'\n");
      out.write("        },\n");
      out.write("        {\n");
      out.write("          field: 'status',\n");
      out.write("          title: '状态',\n");
      out.write("          align: 'center',\n");
      out.write("          formatter: 'statusFormatter'\n");
      out.write("        },\n");
      out.write("        {\n");
      out.write("          field: 'permissionValue',\n");
      out.write("          title: '权限值'\n");
      out.write("        }\n");
      out.write("      ],\n");
      out.write("      treeShowField: 'name',\n");
      out.write("      parentIdField: 'pid',\n");
      out.write("      onLoadSuccess: function(data) {\n");
      out.write("        $table.treegrid({\n");
      out.write("          treeColumn: 1,\n");
      out.write("          onChange: function() {\n");
      out.write("            $table.bootstrapTable('resetWidth');\n");
      out.write("          }\n");
      out.write("        });\n");
      out.write("      }\n");
      out.write("    });\n");
      out.write("  });\n");
      out.write("\n");
      out.write("\n");
      out.write("  // 格式化类型\n");
      out.write("  function typeFormatter(value, row, index) {\n");
      out.write("    if (value === 'menu') {\n");
      out.write("      return '菜单';\n");
      out.write("    }\n");
      out.write("    if (value === 'button') {\n");
      out.write("      return '按钮';\n");
      out.write("    }\n");
      out.write("    if (value === 'api') {\n");
      out.write("      return '接口';\n");
      out.write("    }\n");
      out.write("    return '-';\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  // 格式化状态\n");
      out.write("  function statusFormatter(value, row, index) {\n");
      out.write("    if (value === 1) {\n");
      out.write("      return '<span class=\"label label-success\">正常</span>';\n");
      out.write("    } else {\n");
      out.write("      return '<span class=\"label label-default\">锁定</span>';\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("</script>\n");
      out.write(" <!--update-begin-Author:liushaoqian Date: 20180718 for：TASK #2968 【demo --周俊峰】做一个bootstrap-table 树形列表demo-->\n");
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
}
