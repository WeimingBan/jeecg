package org.apache.jsp.webpage.system.organzation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class myDepartList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>我的机构管理</title>\n");
      if (_jspx_meth_t_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"plug-in/ztree/css/zTreeStyle.css\" type=\"text/css\">\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/ztree/js/jquery.ztree.core-3.5.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/ztree/js/ztreeCreator.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"easyui-layout\" fit=\"true\" scroll=\"no\">\n");
      out.write("\t\t<div  data-options=\"region:'west',title:'我的机构管理',split:true\" style=\"width:200px;overflow: auto;\">\n");
      out.write("\t\t   <!-- update-begin--Author:Yandong  Date:20180402 for： TASK #2601 【严重样式问题】我的组织机构，在shortcut风格下样式有问题-->\n");
      out.write("\t\t   <div style=\"width:105px;margin-left: 8px;margin-top: 2px;\">\n");
      out.write("\t\t\t<a  icon=\"icon-add\" class=\"easyui-linkbutton l-btn l-btn-plain\"  onclick=\"addOneNode()\">\n");
      out.write("\t\t\t\t<span class=\"bigger-110 no-text-shadow\" style=\"width: 50px;\">添加公司</span>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- update-begin--Author:Yandong  Date:20180402 for： TASK #2601 【严重样式问题】我的组织机构，在shortcut风格下样式有问题-->\n");
      out.write("\t\t\t <div class=\"clear\"></div> \n");
      out.write("\t        <div id=\"orgTree\" class=\"ztree\"></div>\n");
      out.write("\t        <input type=\"hidden\" id=\"userName\" name=\"userName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div data-options=\"region:'center'\" title=\"\">\n");
      out.write("    <!-- <iframe width=\"100%\" height=\"100%\" id=\"center\"  src=\"\" style=\"border:1px #fff solid; background:#fff;\"></iframe> -->\n");
      out.write("\t\t<div id=\"tt\" tabPosition=\"top\" border=flase style=\"width:100%;height:100%;margin:0px;padding:0px;overflow-x:hidden;width:auto;\" class=\"easyui-tabs\" fit=\"true\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"hidden\">\n");
      out.write("\t\t\t<div id=\"orgMenu\" class=\"easyui-menu\" data-options=\"onClick:menuHandler\" style=\"width: 120px;\">\n");
      out.write("\t\t\t\t<!-- <div data-options=\"name:'addSubCompany'\">添加下级公司</div> -->\n");
      out.write("\t\t\t\t<div data-options=\"name:'addSubOrg'\">添加下级部门</div>\n");
      out.write("\t\t\t\t<div data-options=\"name:'addSubJob'\">添加下级岗位</div>\n");
      out.write("\t\t\t\t<div data-options=\"name:'edit'\">编辑</div> \n");
      out.write("\t\t\t\t<div data-options=\"name:'remove'\">删除 </div> \n");
      out.write("\t\t\t\t<div data-options=\"name:'fresh'\">刷新</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"gysMenu\" class=\"easyui-menu\" data-options=\"onClick:menuHandler\" style=\"width: 120px;\">\n");
      out.write("\t\t\t\t<div data-options=\"name:'addSubOrg'\">添加下级部门</div>\n");
      out.write("\t\t\t\t<div data-options=\"name:'addSubJob'\">添加下级岗位</div>\n");
      out.write("\t\t\t\t<div data-options=\"name:'editSupplier'\">编辑</div> \n");
      out.write("\t\t\t\t<div data-options=\"name:'removeSupplier'\">删除 </div> \n");
      out.write("\t\t\t\t<div data-options=\"name:'fresh'\">刷新</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"gysMenuGW\" class=\"easyui-menu\" data-options=\"onClick:menuHandler\" style=\"width: 120px;\">\n");
      out.write("\t\t\t\t<div data-options=\"name:'addSubOrg'\">添加下级部门</div>\n");
      out.write("\t\t\t\t<div data-options=\"name:'addSubJob'\">添加下级岗位</div>\n");
      out.write("\t\t\t\t<div data-options=\"name:'editSupplier'\">编辑</div> \n");
      out.write("\t\t\t\t<div data-options=\"name:'removeSupplier'\">删除 </div> \n");
      out.write("\t\t\t\t<div data-options=\"name:'fresh'\">刷新</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"gysRootMenu\" class=\"easyui-menu\" data-options=\"onClick:menuHandler\" style=\"width: 120px;\">\n");
      out.write("\t\t\t\t<div data-options=\"name:'fresh'\">刷新</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("$(function() {\n");
      out.write("\tloadTreeNodes();\n");
      out.write("});\n");
      out.write("var flag = true;\n");
      out.write("var TimeFn = null;\n");
      out.write("var currOrgId,currOrgOpt;//设置当前右击事件的部门Id以及操作类型0-add;1-edit;2-del\n");
      out.write("\n");
      out.write("function addtt(title, url, id, icon, closable) {\n");
      out.write("\t$('#tt').tabs('add',{\n");
      out.write("\t\t\t\t\t\tid : id,\n");
      out.write("\t\t\t\t\t\ttitle : title,\n");
      out.write("\t\t\t\t\t\tcontent : createFramett(id,url),\n");
      out.write("\t\t\t\t\t\tclosable : closable = (closable == 'false') ? false\n");
      out.write("\t\t\t\t\t\t\t\t: true,\n");
      out.write("\t\t\t\t\t\ticon : icon\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("$('#tt').tabs({onSelect : function(title) {\n");
      out.write("\t\t\t\t\t\tvar p = $(this).tabs('getTab', title);\n");
      out.write("\t\t\t\t\t\tvar url = p.find('iframe').attr('src');\n");
      out.write("\t\t\t\t\t\tp.find('iframe').attr('src',url);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("function createFramett(id,url) {\n");
      out.write("\tvar s = '<iframe id=\"'+id+'\" scrolling=\"yes\" frameborder=\"0\"  src=\"'+url+'\" width=\"100%\" height=\"100%\"></iframe>';\n");
      out.write("\treturn s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("//beforeDblClick事件\n");
      out.write("function beforeDbl(){\n");
      out.write("\tflag = false;\n");
      out.write("\treturn true;\n");
      out.write("}\n");
      out.write("//加载树\n");
      out.write("var orgTree ;\n");
      out.write("\n");
      out.write("function showIndex(a,b,c){\n");
      out.write("\tif(!c){\n");
      out.write("\t\t//第一次进来加载第一个节点信息\n");
      out.write("\t\tvar treeObj = $.fn.zTree.getZTreeObj(\"orgTree\");\n");
      out.write("\t\tvar node =treeObj.getNodes()[0];\n");
      out.write("\t\tif(!!node){\n");
      out.write("\t\t\t$(\"#\"+node.tId+\" a\").click();\n");
      out.write("\t\t}\n");
      out.write("\t}else{\n");
      out.write("\t\tif(currOrgOpt==1){\n");
      out.write("\t\t\t//编辑点击当前结点\n");
      out.write("\t\t\tvar treety = $.fn.zTree.getZTreeObj(\"orgTree\");\n");
      out.write("\t\t\tvar currentNode = treety.getNodeByParam(\"id\",currOrgId, null);\n");
      out.write("\t\t\t$(\"#\"+currentNode.tId+\" a\").click();\n");
      out.write("\t\t}else if(currOrgOpt==0){\n");
      out.write("\t\t\t//新增点击新增节点\n");
      out.write("\t\t\tvar childs = c.children;\n");
      out.write("\t\t\tif(!!childs && childs.length>0){\n");
      out.write("\t\t\t\tvar last = childs[childs.length-1];\n");
      out.write("\t\t\t\t$(\"#\"+last.tId+\" a\").click();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("function loadTreeNodes() {\n");
      out.write("\tvar zNodes;\n");
      out.write("\tvar ztreeCreator = new ZtreeCreator('orgTree',\"\",\"\")\n");
      out.write("\n");
      out.write(" \t\t\t.setCallback({onClick:zTreeOnLeftClick,onRightClick:zTreeOnRightClick,onDblClick:zTreeOnDblClick,beforeDblClick:beforeDbl,onAsyncSuccess:showIndex})\n");
      out.write("\n");
      out.write(" \t\t\t.setAsync({\n");
      out.write("                enable: true,\n");
      out.write("\t\t\t\turl: \"organzationController.do?getMyTreeDataAsync\",\n");
      out.write("\t\t\t\tautoParam: [\"id\"],//提交参数\n");
      out.write("\t\t\t\ttype: 'get',\n");
      out.write("\t\t\t    dataType: 'json',\n");
      out.write("\t\t\t    dataFilter: filter,\n");
      out.write("            }) \n");
      out.write(" \t\t\t.initZtree({},function(treeObj){\n");
      out.write(" \t\t\t\torgTree = treeObj\n");
      out.write(" \t\t\t\t});\n");
      out.write("};\n");
      out.write("\n");
      out.write("function filter(treeId, parentNode, childNodes){\n");
      out.write("\tif (!childNodes) return null;\n");
      out.write("    for (var i=0, l=childNodes.length; i<l; i++) {\n");
      out.write("        childNodes[i].name = childNodes[i].name.replace(/\\.n/g, '.');\n");
      out.write("    }\n");
      out.write("    return childNodes;\n");
      out.write("}\n");
      out.write("\n");
      out.write("//左击\n");
      out.write("function zTreeOnLeftClick(event, treeId, treeNode) {\n");
      out.write("\tvar selectNode = getSelectNode();\n");
      out.write("\tflag = true;\n");
      out.write("\tclearTimeout(TimeFn);\n");
      out.write("\tsetTimeout(function(){\n");
      out.write("\t\tif(flag){\n");
      out.write("\t\t\tcurSelectNode = treeNode;\n");
      out.write("\t\t\tvar parentId = treeNode.id;\n");
      out.write("\t\t\tvar orgType = treeNode.orgType;\n");
      out.write("\t\t\tcloseAllTab();\n");
      out.write("\n");
      out.write("\t\t\tif(orgType==\"1\"){\n");
      out.write("\t\t\t\tvar url = \"organzationController.do?myUserOrgList&departid=\"+treeNode.id;\n");
      out.write("\t\t\t\taddtt('用户信息', url, '02','icon-user-set', 'false');\n");
      out.write("\t\t\t\turl = \"tSCompanyPositionController.do?list&companyId=\"+treeNode.id;;\n");
      out.write("\t\t\t\taddtt('职务信息', url, '03','icon-chart-organisation', 'false');\n");
      out.write("\t\t\t\turl = \"organzationController.do?comDetail&id=\"+treeNode.id;\n");
      out.write("\t\t\t\taddtt('基本信息', url, '01','icon-comturn', 'false');\n");
      out.write("\t\t\t}else if(orgType==\"4\"){\n");
      out.write("\t\t\t\tvar url = \"organzationController.do?myUserOrgList&departid=\"+treeNode.id;\n");
      out.write("\t\t\t\taddtt('用户信息', url, '02','icon-user-set', 'false');\n");
      out.write("\t\t\t\turl = \"tSCompanyPositionController.do?list&companyId=\"+treeNode.id;;\n");
      out.write("\t\t\t\taddtt('职务信息', url, '03','icon-chart-organisation', 'false');\n");
      out.write("\t\t\t\turl = \"organzationController.do?comDetail&id=\"+treeNode.id;\n");
      out.write("\t\t\t\taddtt('基本信息', url, '01','icon-comturn', 'false');\n");
      out.write("\t\t\t}else if(orgType==\"9\"){\n");
      out.write("\t\t\t\t//var url = \"organzationController.do?comDetail&id=\"+treeNode.id;\n");
      out.write("\t\t\t\t//addtt('基本信息', url, '01','icon-comturn', 'false');\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\tvar url = \"organzationController.do?myUserOrgList&departid=\"+treeNode.id;\n");
      out.write("\t\t\t\taddtt('用户信息', url, '02','icon-user-set', 'false');\n");
      out.write("\t\t\t\turl = \"organzationController.do?comDetail&id=\"+treeNode.id;\n");
      out.write("\t\t\t\taddtt('基本信息', url, '01','icon-comturn', 'false');\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t$(\"#tt\").tabs(\"select\", 0);\n");
      out.write("\t\t}\n");
      out.write("\t},301);\n");
      out.write("};\n");
      out.write("/**\n");
      out.write(" * 树右击事件\n");
      out.write(" */\n");
      out.write("function zTreeOnRightClick(e, treeId, treeNode) {\t\n");
      out.write("\tif (treeNode) {\n");
      out.write("\t\tcurrOrgId = treeNode.id;\n");
      out.write("\t\torgTree.selectNode(treeNode);\n");
      out.write("\t\tcurSelectNode=treeNode;\n");
      out.write("\t\tvar isfolder = treeNode.isFolder;\n");
      out.write("\t\tvar h = $(window).height();\n");
      out.write("\t\tvar w = $(window).width();\n");
      out.write("\t\tvar menuWidth = 120;\n");
      out.write("\t\tvar menuHeight = 75;\n");
      out.write("\t\tvar menu = null;\n");
      out.write("\t\tif (treeNode != null) {\n");
      out.write("\t\t\tvar orgType = treeNode.orgType;\n");
      out.write("\t\t\tif(orgType==\"4\"){\n");
      out.write("\t\t\t\tmenu = $('#gysMenu');\n");
      out.write("\t\t\t}else if(orgType==\"9\"){\n");
      out.write("\t\t\t\tmenu = $('#gysRootMenu');\n");
      out.write("\t\t\t}else if(orgType==\"2\"){\n");
      out.write("\t\t\t\tmenu = $('#gysMenu');\n");
      out.write("\t\t\t}else if(orgType==\"3\"){\n");
      out.write("\t\t\t\tmenu = $('#gysMenuGW');\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\tmenu = $('#gysMenu');\n");
      out.write("\t\t\t}\n");
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
      out.write("//双击事件\n");
      out.write("function zTreeOnDblClick(event, treeId, treeNode) {\n");
      out.write("\tvar selectNode = getSelectNode();\n");
      out.write("\tcurSelectNode = treeNode;\n");
      out.write("\t//var url = \"functionGroupController.do?groupRel&id=\"+selectNode.id;\n");
      out.write("\t//$(\"#listFrame\").attr(\"src\", url);\n");
      out.write("\t//var url = \"autoFormController/af/employee_leave_form/goAddPage.do\";\n");
      out.write("\t//addtt('基本信息', url, '1','icon-search', 'false');\n");
      out.write("}\n");
      out.write("//菜单对应项\n");
      out.write("function menuHandler(item) {\n");
      out.write("\tif ('addSubCompany' == item.name) {\n");
      out.write("\t\taddSubCompany();\n");
      out.write("\t\tcurrOrgOpt = 0;\n");
      out.write("\t} else if ('addSubOrg' == item.name) {\n");
      out.write("\t\taddSubOrg();\n");
      out.write("\t\tcurrOrgOpt = 0;\n");
      out.write("\t} else if ('addSubJob' == item.name) {\n");
      out.write("\t\taddSubJob();\n");
      out.write("\t\tcurrOrgOpt = 0;\n");
      out.write("\t} else if ('editSupplier' == item.name) {\n");
      out.write("\t\teditNode();\n");
      out.write("\t} else if ('removeSupplier' == item.name) {\n");
      out.write("\t\tdelNode();\n");
      out.write("\t} else if ('remove' == item.name) {\n");
      out.write("\t\tdelNode();\n");
      out.write("\t} else if ('sort' == item.name) {\n");
      out.write("\t\tsortNode();\n");
      out.write("\t} else if ('edit' == item.name) {\n");
      out.write("\t\teditNode();\n");
      out.write("\t} else if ('fresh' == item.name) {\n");
      out.write("\t\trefreshNode();\n");
      out.write("\t}\n");
      out.write("};\n");
      out.write("function refreshNode() {\n");
      out.write("\tloadTreeNodes();\n");
      out.write("};\n");
      out.write("\n");
      out.write("//添加下级公司\n");
      out.write("function addSubCompany() {\n");
      out.write("\tvar selectNode = getSelectNode();\n");
      out.write("\t//if(selectNode.level == 1) {\n");
      out.write("\t//\ttip('不可再添加下级节点');\n");
      out.write("\t//\treturn false;\n");
      out.write("\t//}\n");
      out.write("\tif (!selectNode) \treturn;\n");
      out.write("\tcloseAllTab();\n");
      out.write("\t//var url = \"functionGroupController.do?add&id=\"+selectNode.id;\n");
      out.write("\t//$(\"#listFrame\").attr(\"src\", url);\n");
      out.write("\tvar url = \"organzationController.do?toAddSubCompany&pid=\"+selectNode.id;\n");
      out.write("\taddtt('添加下级公司', url, '01','icon-search', 'false');\n");
      out.write("};\n");
      out.write("\n");
      out.write("//添加下级部门\n");
      out.write("function addSubOrg() {\n");
      out.write("\tvar selectNode = getSelectNode();\n");
      out.write("\t//if(selectNode.level == 1) {\n");
      out.write("\t//\ttip('不可再添加下级节点');\n");
      out.write("\t//\treturn false;\n");
      out.write("\t//}\n");
      out.write("\tif (!selectNode) \treturn;\n");
      out.write("\tcloseAllTab();\n");
      out.write("\t//var url = \"functionGroupController.do?add&id=\"+selectNode.id;\n");
      out.write("\t//$(\"#listFrame\").attr(\"src\", url);\n");
      out.write("\tvar url = \"organzationController.do?toAddSubOrg&pid=\"+selectNode.id;\n");
      out.write("\taddtt('添加下级部门', url, '01','icon-search', 'false');\n");
      out.write("};\n");
      out.write("\n");
      out.write("//添加下级岗位\n");
      out.write("function addSubJob() {\n");
      out.write("\tvar selectNode = getSelectNode();\n");
      out.write("\t//if(selectNode.level == 1) {\n");
      out.write("\t//\ttip('不可再添加下级节点');\n");
      out.write("\t//\treturn false;\n");
      out.write("\t//}\n");
      out.write("\tif (!selectNode) \treturn;\n");
      out.write("\tcloseAllTab();\n");
      out.write("\t//var url = \"functionGroupController.do?add&id=\"+selectNode.id;\n");
      out.write("\t//$(\"#listFrame\").attr(\"src\", url);\n");
      out.write("\tvar url = \"organzationController.do?toAddSubJob&pid=\"+selectNode.id;\n");
      out.write("\taddtt('添加下级岗位', url, '01','icon-search', 'false');\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("function closeAllTab(){\n");
      out.write("\tvar tabs = $('#tt').tabs(\"tabs\");\n");
      out.write("\tvar length = tabs.length;\n");
      out.write("    for(var i=0; i<length; i++){\n");
      out.write("    \tvar onetab = tabs[0];\n");
      out.write("        var title = onetab.panel('options').tab.text();\n");
      out.write("        $(\"#tt\").tabs(\"close\", title);\n");
      out.write("    }\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("//添加一级节点\n");
      out.write("function addOneNode() {\n");
      out.write("\tcloseAllTab();\n");
      out.write("\tvar url = \"organzationController.do?toAddCompany\";\n");
      out.write("\taddtt('添加一级公司', url, '01','icon-search', 'false');\n");
      out.write("\tcurrOrgId = -1;\n");
      out.write("};\n");
      out.write("//编辑节点\n");
      out.write("function editNode() {\n");
      out.write("\tvar selectNode = getSelectNode();\n");
      out.write("\tif (!selectNode) \treturn;\n");
      out.write("\t//var url = \"functionGroupController.do?update&id=\"+selectNode.id;\n");
      out.write("\t//$(\"#listFrame\").attr(\"src\", url);\n");
      out.write("\tcloseAllTab();\n");
      out.write("\tvar url = \"organzationController.do?comUpdate&id=\"+selectNode.id;\n");
      out.write("\taddtt('编辑', url, '01','icon-search', 'false');\n");
      out.write("\tcurrOrgOpt = 1;\n");
      out.write("};\n");
      out.write("\n");
      out.write("//删除\n");
      out.write("function delNode() {\n");
      out.write("\tvar selectNode = getSelectNode();\n");
      out.write("\tvar nodeId = selectNode.id;\n");
      out.write("\t//if (nodeId == \"0\") {\n");
      out.write("\t//\ttip('该节点为根节点，不可删除');return;\n");
      out.write("\t//} \n");
      out.write("\tvar url = \"organzationController.do?del&id=\"+selectNode.id;\n");
      out.write("\tif(selectNode.isParent){\n");
      out.write("\t\ttip('存在下级机构，不可删除!');return;\n");
      out.write("\t}\n");
      out.write("\tlayer.confirm('确定删除该机构吗？',{\n");
      out.write("\t\tbtn:['确认','取消']\n");
      out.write("\t},function() {\n");
      out.write("\t\tjQuery.ajax({  \n");
      out.write("\t        async : false,  \n");
      out.write("\t        cache:false,  \n");
      out.write("\t        type: 'GET',  \n");
      out.write("\t        dataType : \"json\",  \n");
      out.write("\t        url: url,//请求的action路径  \n");
      out.write("\t        error: function () {//请求失败处理函数  \n");
      out.write("\t            tip('请求失败');  \n");
      out.write("\t        },  \n");
      out.write("\t        success:function(data){ //请求成功后处理函数。\n");
      out.write("\t\t\t    if(data.success){\n");
      out.write("\t\t\t    \ttip(data.msg);\n");
      out.write("\t\t\t    \tcurrOrgOpt = 2;\n");
      out.write("\t\t\t    \tloadTree();\n");
      out.write("\t\t\t    }else{\n");
      out.write("\t\t\t    \ttip(data.msg);\n");
      out.write("\t\t\t    }\n");
      out.write("\t        }  \n");
      out.write("\t    });  \n");
      out.write("\t},function(){\n");
      out.write("\t\treturn;\n");
      out.write("\t});\n");
      out.write("};\n");
      out.write("//选择资源节点。\n");
      out.write("function getSelectNode() {\n");
      out.write("\torgTree = $.fn.zTree.getZTreeObj(\"orgTree\");\n");
      out.write("\tvar nodes = orgTree.getSelectedNodes();\n");
      out.write("\tvar node = nodes[0];\n");
      out.write("\treturn node;\n");
      out.write("};\n");
      out.write("\n");
      out.write("//增删改之后重新加载节点方法\n");
      out.write("function loadTree(){\n");
      out.write("\tif(currOrgId==-1){\n");
      out.write("\t\tloadTreeNodes();\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("\t var treety = $.fn.zTree.getZTreeObj(\"orgTree\");\n");
      out.write("\t var node = treety.getNodeByParam(\"id\",currOrgId, null);\n");
      out.write("\t if(node==null){\n");
      out.write("\t\t return ;\n");
      out.write("\t }\n");
      out.write("\t if(currOrgOpt==0){\n");
      out.write("\t\t var isParent = node.isParent;\n");
      out.write("\t\t if(!isParent){\n");
      out.write("\t\t\t node.isParent = true;\n");
      out.write("\t\t\t treety.updateNode(node);\n");
      out.write("\t\t }\n");
      out.write("\t\t treety.reAsyncChildNodes(node, \"refresh\");\n");
      out.write("\t }else if(currOrgOpt==1 ||currOrgOpt==2){\n");
      out.write("\t\t var currParentTId = node.parentTId;\n");
      out.write("\t\t var parentNode = treety.getNodeByTId(currParentTId);\n");
      out.write("\t\t treety.reAsyncChildNodes(parentNode, \"refresh\");\n");
      out.write("\t\t if(currOrgOpt==2){\n");
      out.write("\t\t\t $(\"#\"+currParentTId).children(\"a[treenode_a]\").click();\n");
      out.write("\t\t }\n");
      out.write("\t }\n");
      out.write("}\n");
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
    _jspx_th_t_base_0.setType("jquery,easyui,tools");
    int _jspx_eval_t_base_0 = _jspx_th_t_base_0.doStartTag();
    if (_jspx_th_t_base_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_base_type_nobody.reuse(_jspx_th_t_base_0);
      return true;
    }
    _jspx_tagPool_t_base_type_nobody.reuse(_jspx_th_t_base_0);
    return false;
  }
}