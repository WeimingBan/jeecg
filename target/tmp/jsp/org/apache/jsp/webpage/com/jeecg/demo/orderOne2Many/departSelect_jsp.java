package org.apache.jsp.webpage.com.jeecg.demo.orderOne2Many;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class departSelect_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html >\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>组织机构集合</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"plug-in/ztree/css/zTreeStyle.css\"></link>\n");
      out.write("<style>\n");
      out.write(".inuptxt {\n");
      out.write("    /* border: 1px solid #a5aeb6; */\n");
      out.write("     background-color: #fff;\n");
      out.write("    border: 1px solid #D7D7D7;\n");
      out.write("    border-radius: 3PX;\n");
      out.write("    /* height: 14PX; */\n");
      out.write("    height: 30px;\n");
      out.write("    /* padding: 7px 0 7px 5px; */\n");
      out.write("    padding: 0 2px;\n");
      out.write("    line-height: 14PX;\n");
      out.write("    font-size: 12px;\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      if (_jspx_meth_t_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/ztree/js/jquery.ztree.core-3.5.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/ztree/js/jquery.ztree.excheck-3.5.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tvar setting = {\n");
      out.write("\t  check: {\n");
      out.write("\t\t  \tenable: true,\n");
      out.write("\t\t\tchkStyle: \"radio\",\n");
      out.write("\t\t\tradioType: \"all\"\n");
      out.write("\t\t},\n");
      out.write("\t\tdata: {\n");
      out.write("\t\t\tsimpleData: {\n");
      out.write("\t\t\t\tenable: true\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\t  ,callback: {\n");
      out.write("\t\t\tonExpand: zTreeOnExpand\n");
      out.write("\t\t}  \n");
      out.write("\t};\n");
      out.write("\t\n");
      out.write("\t//加载展开方法\n");
      out.write("\tfunction zTreeOnExpand(event, treeId, treeNode){\n");
      out.write("\t\t var treeNodeId = treeNode.id;\n");
      out.write("\t\t $.post(\n");
      out.write("\t\t\t'jformOrderMainController.do?getSubContent',\n");
      out.write("\t\t\t{parentid:treeNodeId},\n");
      out.write("\t\t\tfunction(data){\n");
      out.write("\t\t\t\tvar d = $.parseJSON(data);\n");
      out.write("\t\t\t\tif (d.success) {\n");
      out.write("\t\t\t\t\tvar dbDate = eval(d.msg);\n");
      out.write("\t\t\t\t\tvar tree = $.fn.zTree.getZTreeObj(\"departSelect\");\n");
      out.write("\n");
      out.write("\t\t\t\t\tif (!treeNode.zAsync){\n");
      out.write("\t\t\t\t\t\ttree.addNodes(treeNode, dbDate);\n");
      out.write("\t\t\t\t\t\ttreeNode.zAsync = true;\n");
      out.write("\t\t\t\t\t} else{\n");
      out.write("\t\t\t\t\t\ttree.reAsyncChildNodes(treeNode, \"refresh\");\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t);\n");
      out.write("\t}\n");
      out.write("\tfunction initSelectTree(name){\n");
      out.write("\t\t$.post(\n");
      out.write("\t\t\t'jformOrderMainController.do?getDepartInfo3',\n");
      out.write("\t\t    {name :name},\n");
      out.write("\t\t\tfunction(data){\n");
      out.write("\t\t\t\tvar d = $.parseJSON(data);\n");
      out.write("\t\t\t\tif (d.success) {\n");
      out.write("\t\t\t\t\tvar dbDate = eval(d.msg);\n");
      out.write("\t\t\t\t\t//console.log(d.msg);\n");
      out.write("\t\t\t\t\tvar treeObj = $.fn.zTree.init($(\"#departSelect\"), setting, dbDate);\n");
      out.write("\t\t\t\t\ttreeObj.expandAll(true); \n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t}\n");
      out.write("\t//首次进入加载level为1的\n");
      out.write("\t$(function(){\n");
      out.write("\t\tinitSelectTree('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${defaultName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("');\n");
      out.write("\t\t$(\"#input_txt\").bind(\"input propertychange\",function(){\n");
      out.write("\t\t\tvar name = $(this).val();\n");
      out.write("\t\t\tif(name.indexOf(\"'\")<0){\n");
      out.write("\t\t\t\tinitSelectTree(name);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("<!-- type=\"text\" -->\n");
      out.write("<input id=\"input_txt\"  type=\"hidden\" class = \"inuptxt\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${defaultName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"请输入关键字搜索\"/>\n");
      out.write("<input id=\"defaultName\"  type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${defaultName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("<ul id=\"departSelect\" class=\"ztree\"></ul>\n");
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
    _jspx_th_t_base_0.setType("jquery");
    int _jspx_eval_t_base_0 = _jspx_th_t_base_0.doStartTag();
    if (_jspx_th_t_base_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_base_type_nobody.reuse(_jspx_th_t_base_0);
      return true;
    }
    _jspx_tagPool_t_base_type_nobody.reuse(_jspx_th_t_base_0);
    return false;
  }
}
