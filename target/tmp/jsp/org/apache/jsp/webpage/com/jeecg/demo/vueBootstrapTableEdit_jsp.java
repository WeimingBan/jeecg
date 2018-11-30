package org.apache.jsp.webpage.com.jeecg.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vueBootstrapTableEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<div id=\"dpLTE\" class=\"container-fluid\" v-cloak>\n");
      out.write("\t\t<table class=\"form\" id=\"form\">\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t            <td class=\"formTitle\">姓名<font face=\"宋体\">*</font></td>\n");
      out.write("\t            <td class=\"formValue\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"姓名\" v-model=\"user.name\" datatype=\"*\">\n");
      out.write("\t            </td>\n");
      out.write("\t            <td class=\"formTitle\">年龄<font face=\"宋体\">*</font></td>\n");
      out.write("\t            <td class=\"formValue\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"年龄\" v-model=\"user.age\" datatype=\"num\">\n");
      out.write("\t            </td>\n");
      out.write("        \t</tr>\n");
      out.write("        \t<tr>\n");
      out.write("\t\t\t\t<td class=\"formTitle\">性别</td>\n");
      out.write("\t\t\t\t<td class=\"formValue\" colspan=\"3\">\n");
      out.write("\t\t\t\t\t<label class=\"radio-inline\">\n");
      out.write("\t\t\t\t\t\t<input type=\"radio\" name=\"sex\" value=\"1\" v-model=\"user.sex\"/> 男\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t<label class=\"radio-inline\">\n");
      out.write("\t\t\t\t\t\t<input type=\"radio\" name=\"sex\" value=\"0\" v-model=\"user.sex\"/> 女\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("        \t<tr>\n");
      out.write("\t            <td class=\"formTitle\">生日</td>\n");
      out.write("\t            <td class=\"formValue\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"birthday\" class=\"form-control\" placeholder=\"请选择生日\">\n");
      out.write("\t            </td>\n");
      out.write("        \t\t<td class=\"formTitle\">手机号</td>\n");
      out.write("\t            <td class=\"formValue\">\n");
      out.write("\t            <!--update-begin-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题，手机号校验-->\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"请输入手机号\" v-model=\"user.phone\" datatype=\"m\">\n");
      out.write("\t            <!--update-end-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题，手机号校验-->\n");
      out.write("\t            </td>\n");
      out.write("        \t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("<script src=\"https://cdn.bootcss.com/jquery/3.3.1/jquery.js\"></script>\n");
      out.write("<script src=\"https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.bootcss.com/layer/3.1.0/layer.js\"></script>\n");
      out.write("<script src=\"https://cdn.bootcss.com/vue/2.5.17-beta.0/vue.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.bootcss.com/bootstrap-table/1.12.1/bootstrap-table.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.bootcss.com/bootstrap-table/1.12.1/locale/bootstrap-table-zh-CN.min.js\"></script>\n");
      out.write("<script src=\"plug-in/Validform/js/Validform_v5.3.1_min_zh-cn.js\"></script>\n");
      out.write("<script src=\"plug-in/Validform/js/Validform_Datatype_zh-cn.js\"></script>\n");
      out.write("<script src=\"plug-in/Validform/js/datatype_zh-cn.js\"></script>\n");
      out.write("<script src=\"plug-in/lhgDialog/lhgdialog.min.js?skin=metrole\"></script>\n");
      out.write("<script src=\"plug-in/laydate/laydate.js\"></script>\n");
      out.write("<script src=\"plug-in/vue-BootstrapTable/js/common.js\"></script>\n");
      out.write("<script src=\"plug-in/vue-BootstrapTable/js/form.js\"></script>\n");
      out.write("<script>\n");
      out.write("var valid=null;\n");
      out.write("$(function(){\n");
      out.write("\tvalid=$(\"#form\").Validform({\n");
      out.write("\t\ttiptype:function(msg,o,cssctl){\n");
      out.write("\t\t\tif(o.type==3){\n");
      out.write("\t\t\t\tValidationMessage(o.obj,msg);\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\tremoveMessage(o.obj);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("var vm = new Vue({\n");
      out.write("\tel:'#dpLTE',\n");
      out.write("\tdata: {\n");
      out.write("\t\tuser:{\n");
      out.write("\t\t\tid:'',\n");
      out.write("\t\t\tname: '',\n");
      out.write("\t\t\tsex: 1,\n");
      out.write("\t\t\tage: null,\n");
      out.write("\t\t\tbirthday: '',\n");
      out.write("\t\t\tphone: ''\n");
      out.write("\t\t}\n");
      out.write("\t},\n");
      out.write("\tmethods : {\n");
      out.write("\t\tsetForm: function() {\n");
      out.write("\t\t\t$.SetForm({\n");
      out.write("\t\t\t\turl: 'jeecgListDemoController.do?vueBootstrapTableGet',\n");
      out.write("\t\t    \tparam: {\n");
      out.write("\t\t    \t\tid: vm.user.id\n");
      out.write("\t\t    \t},\n");
      out.write("\t\t    \tsuccess: function(e) {\n");
      out.write("\t\t    \t\tvar data=e.obj;\n");
      out.write("\t\t    \t\tvm.user = {\n");
      out.write("\t\t    \t\t\t\tid:data.id,\n");
      out.write("\t\t    \t\t\t\tname: data.name,\n");
      out.write("\t\t    \t\t\t\tsex:data.sex,\n");
      out.write("\t\t    \t\t\t\tage: data.age,\n");
      out.write("\t\t    \t\t\t\tbirthday: data.birthday,\n");
      out.write("\t\t    \t\t\t\tphone: data.phone\n");
      out.write("\t\t    \t\t};\n");
      out.write("\t\t    \t\t\n");
      out.write("\t\t    \t\t//生日\n");
      out.write("\t\t    \t\tlaydate.render({\n");
      out.write("\t\t    \t\t  elem: '#birthday',\n");
      out.write("\t\t    \t\t  value: vm.user.birthday,\n");
      out.write("\t\t    \t\t  done: function(value, date, endDate){\n");
      out.write("\t\t    \t\t\tvm.user.birthday=value;\n");
      out.write("\t\t    \t\t  }\n");
      out.write("\t\t    \t\t});\n");
      out.write("\t\t    \t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t},\n");
      out.write("\t\tacceptClick: function() {\n");
      out.write("            if (!valid.check()) {\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("\t\t    $.ConfirmForm({\n");
      out.write("\t\t    \turl: 'jeecgListDemoController.do?doUpdate',\n");
      out.write("\t\t    \tparam: vm.user,\n");
      out.write("\t\t    \tsuccess: function(){\n");
      out.write("\t\t    \t\tframeElement.api.opener.vm.load();\n");
      out.write("\t\t    \t}\n");
      out.write("\t\t    });\n");
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
