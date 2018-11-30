package org.apache.jsp.webpage.com.jeecg.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class siteSelect_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_base_type_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"plug-in/ztree/css/zTreeStyle.css\">\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/ztree/js/jquery.ztree.core-3.5.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/ztree/js/jquery.ztree.excheck-3.5.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    var setting = {\n");
      out.write("        check: {\n");
      out.write("            enable: false,\n");
      out.write("            chkboxType: { \"Y\": \"\", \"N\": \"\" }\n");
      out.write("        },\n");
      out.write("        data: {\n");
      out.write("            simpleData: {\n");
      out.write("                enable: true\n");
      out.write("            }\n");
      out.write("        },callback: {\n");
      out.write("            onClick:onClick\n");
      out.write("        }\n");
      out.write("    };\n");
      out.write("    \n");
      out.write("    function onClick(event, treeId, treeNode){\n");
      out.write("    \t$(\"#sitePanel\").panel({\n");
      out.write("            title:treeNode.name,\n");
      out.write("\t\t    content:'<iframe src=\"' + treeNode.site + '\" frameborder=0 height=100% width=100% ></iframe>'\n");
      out.write("\t\t});\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    //加载tree\n");
      out.write("    $(function(){\n");
      out.write("    \t$.getJSON(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${webRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/webpage/com/jeecg/demo/siteData.json\",function(data){ \n");
      out.write("    \t\tvar d = data;//$.parseJSON(data);\n");
      out.write("            if (d.success) {\n");
      out.write("                var dbDate = eval(d.msg);\n");
      out.write("                $.fn.zTree.init($(\"#siteSelect\"), setting, dbDate);               \n");
      out.write("                \n");
      out.write("                $(\"#sitePanel\").panel({\n");
      out.write("                \ttitle:dbDate[0].name,\n");
      out.write("\t\t\t\t    content:'<iframe src=\"' + dbDate[0].site + '\" frameborder=0 height=100% width=100% ></iframe>'\n");
      out.write("\t\t\t\t});\n");
      out.write("            }\n");
      out.write("    \t});\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<div class=\"easyui-layout\" fit=\"true\" style=\"width:1000px;height:600px;\">\n");
      out.write("    <div region=\"west\" split=\"true\" title=\"网址列表\" style=\"width:200px;\">\n");
      out.write("        <ul id=\"siteSelect\" class=\"ztree\" ></ul>\n");
      out.write("    </div>\n");
      out.write("    <div region=\"center\" title=\"webSite\" style=\"width:800px;\" id=\"sitePanel\" class=\"easyui-panel\">\n");
      out.write("    </div>\n");
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
}
