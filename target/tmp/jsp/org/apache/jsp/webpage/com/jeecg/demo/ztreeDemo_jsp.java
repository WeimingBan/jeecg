package org.apache.jsp.webpage.com.jeecg.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class ztreeDemo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>ztree</title>\n");
      if (_jspx_meth_t_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"plug-in/ztree/css/zTreeStyle.css\" type=\"text/css\">\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/ztree/js/jquery.ztree.core-3.5.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/ztree/js/ztreeCreator.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"easyui-layout\" fit=\"true\" scroll=\"no\">\n");
      out.write("\t\t<div  data-options=\"region:'west',title:'组织管理',split:true\" style=\"width:200px;overflow: auto;\">\n");
      out.write("\t        <div id=\"orgTree\" class=\"ztree\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div data-options=\"region:'center',border:false\" style=\"text-align: center;\">\n");
      out.write("\t\t\t \t<iframe id=\"listFrame\" src=\"\" frameborder=\"no\" width=\"100%\" height=\"100%\"></iframe>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"hidden\">\n");
      out.write("\t\t\t<div id=\"orgMenu\" class=\"easyui-menu\" data-options=\"onClick:menuHandler\" style=\"width: 120px;\">\n");
      out.write("\t\t\t\t<div data-options=\"name:'add'\">添加子级组织</div>\n");
      out.write("\t\t\t\t <div data-options=\"name:'edit'\">编辑当前组织</div> \n");
      out.write("\t\t\t\t <div data-options=\"name:'remove'\">删除当前组织</div> \n");
      out.write("\t\t\t\t <div data-options=\"name:'fresh'\">刷新</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("<script>\n");
      out.write("//加载树\n");
      out.write("var orgTree ;\n");
      out.write("function loadTree() {\n");
      out.write("\tvar zNodes;\n");
      out.write("\tjQuery.ajax({  \n");
      out.write("        async : false,  \n");
      out.write("        cache:false,  \n");
      out.write("        type: 'POST',  \n");
      out.write("        dataType : \"json\",  \n");
      out.write("        url: 'jeecgFormDemoController.do?getTreeDemoData',//请求的action路径  \n");
      out.write("        error: function () {//请求失败处理函数  \n");
      out.write("            alert('请求失败');  \n");
      out.write("        },  \n");
      out.write("        success:function(data){ //请求成功后处理函数。\n");
      out.write("\t\t\tconsole.log(data.obj)\n");
      out.write("            zNodes = data.obj;   //把后台封装好的简单Json格式赋给zNodes  \n");
      out.write("        }  \n");
      out.write("    });  \n");
      out.write("\tvar ztreeCreator = new ZtreeCreator('orgTree',\"jeecgDemoController.do?getTreeData\",zNodes)\n");
      out.write(" \t\t\t.setCallback({onClick:zTreeOnLeftClick,onRightClick:zTreeOnRightClick})\n");
      out.write(" \t\t\t.initZtree({},function(treeObj){orgTree = treeObj});\n");
      out.write("\n");
      out.write("};\n");
      out.write("\n");
      out.write("//左击\n");
      out.write("function zTreeOnLeftClick(event, treeId, treeNode) {\n");
      out.write("\tcurSelectNode = treeNode;\n");
      out.write("\tvar parentId = treeNode.id;\n");
      out.write("\tvar url = \"departController.do?update&id=\" + curSelectNode.id;\n");
      out.write("\tif(curSelectNode.parentId==\"0\"){\n");
      out.write("\t\t$.topCall.warn('该节点为根节点，请点击具体的组织');\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("\t$(\"#listFrame\").attr(\"src\", url);\n");
      out.write("};\n");
      out.write("/**\n");
      out.write(" * 树右击事件\n");
      out.write(" */\n");
      out.write("function zTreeOnRightClick(e, treeId, treeNode) {\t\n");
      out.write("\tif (treeNode) {\n");
      out.write("\t\torgTree.selectNode(treeNode);\n");
      out.write("\t\tcurSelectNode=treeNode;\n");
      out.write("\t\tvar isfolder = treeNode.isFolder;\n");
      out.write("\t\tvar h = $(window).height();\n");
      out.write("\t\tvar w = $(window).width();\n");
      out.write("\t\tvar menuWidth = 120;\n");
      out.write("\t\tvar menuHeight = 75;\n");
      out.write("\t\tvar menu = null;\n");
      out.write("\t\tif (treeNode != null) {\n");
      out.write("\t\t\tmenu = $('#orgMenu');\n");
      out.write("\t\t}\n");
      out.write("\t\tvar x = e.pageX, y = e.pageY;\n");
      out.write("\t\tif (e.pageY + menuHeight > h) {\n");
      out.write("\t\t\ty = e.pageY - menuHeight;\n");
      out.write("\t\t}\n");
      out.write("\t\tif (e.pageX + menuWidth > w) {\n");
      out.write("\t\t\tx = e.pageX - menuWidth;\n");
      out.write("\t\t}\n");
      out.write("\t\tmenu.menu('show', {\n");
      out.write("\t\t\tleft : x,\n");
      out.write("\t\t\ttop : y\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("};\n");
      out.write("//菜单对应项\n");
      out.write("function menuHandler(item) {\n");
      out.write("\tif ('add' == item.name) {\n");
      out.write("\t\taddNode();\n");
      out.write("\t} else if ('remove' == item.name) {\n");
      out.write("\t\tdelNode();\n");
      out.write("\t} else if ('sort' == item.name) {\n");
      out.write("\t\tsortNode();\n");
      out.write("\t} else if ('edit' == item.name) {\n");
      out.write("\t\teditNode(1);\n");
      out.write("\t} else if ('fresh' == item.name) {\n");
      out.write("\t\trefreshNode();\n");
      out.write("\t}\n");
      out.write("};\n");
      out.write("function refreshNode() {\n");
      out.write("\tloadTree();\n");
      out.write("};\n");
      out.write("\n");
      out.write("//添加节点\n");
      out.write("function addNode() {\n");
      out.write("\tvar selectNode = getSelectNode();\n");
      out.write("\tif (!selectNode) \treturn;\n");
      out.write("\tvar url = \"departController.do?add&id=\" + selectNode.id;\n");
      out.write("\t$(\"#listFrame\").attr(\"src\", url);\n");
      out.write("\n");
      out.write("};\n");
      out.write("\n");
      out.write("//编辑节点\n");
      out.write("function editNode(type) {\n");
      out.write("\tvar selectNode = getSelectNode();\n");
      out.write("\tif (!selectNode) \treturn;\n");
      out.write("\t//根节点 不能编辑\n");
      out.write("\tif(selectNode.id==\"0\" && type==1 ){\n");
      out.write("\t\t$.topCall.warn('该节点为根节点，不可编辑');\n");
      out.write("\t\treturn;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tvar url = \"departController.do?update&id=\" + selectNode.id;\n");
      out.write("\t$(\"#listFrame\").attr(\"src\", url);\n");
      out.write("\n");
      out.write("};\n");
      out.write("\n");
      out.write("\n");
      out.write("//删除\n");
      out.write("function delNode() {\n");
      out.write("\tvar selectNode = getSelectNode();\n");
      out.write("\tvar nodeId = selectNode.id;\n");
      out.write("\tif (nodeId == \"0\") {\n");
      out.write("\t\t$.topCall.warn('该节点为根节点，不可删除');\n");
      out.write("\t\treturn;\n");
      out.write("\t} \n");
      out.write("\tvar url = \"jeecgFormDemoController.do?del&id=\"+nodeId;\n");
      out.write("\tif(!confirm('温馨提示', '确定删除该组织以及该组织下的所有子组织？')){\n");
      out.write("\t\treturn;\n");
      out.write("\t}\n");
      out.write("\tjQuery.ajax({  \n");
      out.write("        async : false,  \n");
      out.write("        cache:false,  \n");
      out.write("        type: 'GET',  \n");
      out.write("        dataType : \"json\",  \n");
      out.write("        url: url,//请求的action路径  \n");
      out.write("        error: function () {//请求失败处理函数  \n");
      out.write("            alert('请求失败');  \n");
      out.write("        },  \n");
      out.write("        success:function(data){ //请求成功后处理函数。\n");
      out.write("\t\t    if(data.success){\n");
      out.write("\t\t    \torgTree.removeNode(selectNode);\n");
      out.write("\t\t\t\t$(\"#listFrame\").attr(\"src\", \"about:blank\");\n");
      out.write("\t\t    }else{\n");
      out.write("\t\t    \talert(data.msg);\n");
      out.write("\t\t    }\n");
      out.write("        }  \n");
      out.write("    });  \n");
      out.write("\t\n");
      out.write("};\n");
      out.write("//选择资源节点。\n");
      out.write("function getSelectNode() {\n");
      out.write("\torgTree = $.fn.zTree.getZTreeObj(\"orgTree\");\n");
      out.write("\tvar nodes = orgTree.getSelectedNodes();\n");
      out.write("\tvar node = nodes[0];\n");
      out.write("\treturn node;\n");
      out.write("};\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("\t$(function() {\n");
      out.write("\t\tloadTree();\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("</script>\n");
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
    _jspx_th_t_base_0.setType("jquery,easyui");
    int _jspx_eval_t_base_0 = _jspx_th_t_base_0.doStartTag();
    if (_jspx_th_t_base_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_base_type_nobody.reuse(_jspx_th_t_base_0);
      return true;
    }
    _jspx_tagPool_t_base_type_nobody.reuse(_jspx_th_t_base_0);
    return false;
  }
}
