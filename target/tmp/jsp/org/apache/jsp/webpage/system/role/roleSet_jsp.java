package org.apache.jsp.webpage.system.role;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class roleSet_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_mutiLang_langKey_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_mutiLang_langKey_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_mutiLang_langKey_nobody.release();
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
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\tvar setting = {\n");
      out.write("\t\tcheck: {\n");
      out.write("\t\t\tenable: true\n");
      out.write("\t\t},\n");
      out.write("\t\t\tdata: {\n");
      out.write("\t\t\tsimpleData: {\n");
      out.write("\t\t\t\tenable: true\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}, \n");
      out.write("\t\tasync: {\n");
      out.write("\t\t\tenable: true,\n");
      out.write("\t\t\turl:\"roleController.do?setAuthority&roleId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${roleId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\",\n");
      out.write("\t\t\tdataFilter: filter\t\t\t\t\n");
      out.write("\t\t},\n");
      out.write("\t\tcallback: {\n");
      out.write("\t\t\tbeforeAsync: function(){},\n");
      out.write("\t\t\tonAsyncSuccess: function(event, treeId, treeNode, msg){\n");
      out.write("\t\t\t\t//将已选中子节点的父节点设置为选中状态,即级联父级\n");
      out.write("\t\t\t\t/*var zTree = $.fn.zTree.getZTreeObj(\"functionid\");\t\t\t\t\n");
      out.write("\t\t\t\tvar node = zTree.getCheckedNodes(true);\n");
      out.write("\t\t\t\tvar pnode = null; \n");
      out.write("\t\t\t\tfor ( var i = 0; i < node.length; i++) {\n");
      out.write("\t\t\t\t\tpnode = node[i].getParentNode();\n");
      out.write("\t\t\t\t\twhile (pnode != null) {\n");
      out.write("\t\t\t\t\t\tpnode.checked = true;\n");
      out.write("\t\t\t\t\t\tzTree.updateNode(pnode);\n");
      out.write("\t\t\t\t\t\tpnode = pnode.getParentNode();\n");
      out.write("\t\t\t\t\t}\t\t\t\n");
      out.write("\t\t\t\t}*/\t\t\t\n");
      out.write("\t\t\t\texpandAll();\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tonAsyncError: function(){},\n");
      out.write("\t\t\tonClick: function (event, treeId, treeNode){\n");
      out.write("\t\t\t\t\t\t//console.info(treeNode.id + \", \" + treeNode.tId + \", \" + treeNode.name + \", \" + treeNode.children);\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t//if (null == treeNode.children) {\n");
      out.write("\t\t\t\t\t\t\tvar roleId = $(\"#rid\").val();\n");
      out.write("\t\t\t\t\t\t\t$('#operationListpanel').panel(\n");
      out.write("\t\t\t\t\t\t\t\t\t\"refresh\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\"roleController.do?operationListForFunction&functionId=\"+ treeNode.id + \"&roleId=\" + roleId);\n");
      out.write("\t\t\t\t\t\t\t$('#dataRuleListpanel').panel(\n");
      out.write("\t\t\t\t\t\t\t\t\t\"refresh\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\"roleController.do?dataRuleListForFunction&functionId=\"+ treeNode.id + \"&roleId=\" + roleId);\n");
      out.write("\t\t\t\t\t\t//} else {\n");
      out.write("\t\t\t\t\t\t//}\n");
      out.write("\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t};\n");
      out.write("\tfunction filter(treeId, parentNode, childNodes) {\n");
      out.write("\t\tif (!childNodes) return null;\n");
      out.write("\t\tfor (var i=0, l=childNodes.length; i<l; i++) {\n");
      out.write("\t\t\tchildNodes[i].name = childNodes[i].text;\n");
      out.write("\t\t\t//childNodes[i].open = (childNodes[i].state === \"open\");//异步加载，该项无效\n");
      out.write("\t\t\tif (childNodes[i].children != null) {\t\t\t\t\t\n");
      out.write("\t\t\t\tchildNodes[i].nodes = childNodes[i].children;\n");
      out.write("\t\t\t\tfilter(null, childNodes[i], childNodes[i].nodes);//递归设置子节点\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\t\t\n");
      out.write("\t\treturn childNodes;\n");
      out.write("\t}\n");
      out.write("\t$(function() {\t\n");
      out.write("\t\t\n");
      out.write("\t\t$.fn.zTree.init($(\"#functionid\"), setting);\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#functionListPanel\").panel({\n");
      out.write("\t\t\ttitle : '");
      if (_jspx_meth_t_mutiLang_0(_jspx_page_context))
        return;
      out.write("',\n");
      out.write("\t\t\ttools : [ {\n");
      out.write("\t\t\t\ticonCls : 'icon-save',\n");
      out.write("\t\t\t\thandler : function() {\n");
      out.write("\t\t\t\t\tmysubmit();\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t} ]\n");
      out.write("\t\t});\n");
      out.write("\t\t$(\"#operationListpanel\").panel({\n");
      out.write("\t\t\ttitle : '");
      if (_jspx_meth_t_mutiLang_1(_jspx_page_context))
        return;
      out.write("',\n");
      out.write("\t\t\ttools : [ {\n");
      out.write("\t\t\t\ticonCls : 'icon-save',\n");
      out.write("\t\t\t\thandler : function() {\n");
      out.write("\t\t\t\t\tsubmitOperation();\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t} ]\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t$(\"#dataRuleListpanel\").panel({\n");
      out.write("\t\t\ttitle : '数据规则权限',\n");
      out.write("\t\t\ttools : [ {\n");
      out.write("\t\t\t\ticonCls : 'icon-save',\n");
      out.write("\t\t\t\thandler : function() {\n");
      out.write("\t\t\t\t\tsubmitDataRule();\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t} ]\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\tfunction mysubmit() {\n");
      out.write("\t\tvar roleId = $(\"#rid\").val();\n");
      out.write("\t\tvar s = GetNode();\n");
      out.write("\t\tdoSubmit(\"roleController.do?updateAuthority&rolefunctions=\" + s + \"&roleId=\" + roleId);\n");
      out.write("\t}\n");
      out.write("\tfunction GetNode() {\n");
      out.write("\t\tvar zTree = $.fn.zTree.getZTreeObj(\"functionid\");\t\t\t\t\n");
      out.write("\t\tvar node = zTree.getCheckedNodes(true);\n");
      out.write("\t\t//加入实际被选中的节点\n");
      out.write("\t\tvar cnodes = '';\n");
      out.write("\t\tfor ( var i = 0; i < node.length; i++) {\n");
      out.write("\t\t\tcnodes += node[i].id + ',';\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\tcnodes = cnodes.substring(0, cnodes.length - 1);\n");
      out.write("\t\treturn cnodes;\n");
      out.write("\t\t//加入实际被选中的节点,以及该节点的所有上级节点,即级联父级\n");
      out.write("\t\t/*var cnodes = '';\n");
      out.write("\t\tvar pnodes = '';\n");
      out.write("\t\tvar pnode = null; //保存上一步所选父节点\n");
      out.write("\t\tfor ( var i = 0; i < node.length; i++) {\n");
      out.write("\t\t\tif(!node[i].isParent){\n");
      out.write("\t\t\t\tcnodes += node[i].id + ',';\n");
      out.write("\t\t\t\tpnode = node[i].getParentNode();//获取当前节点的父节点\n");
      out.write("\t\t\t\twhile (pnode != null) {//添加全部父节点\n");
      out.write("\t\t\t\t\tpnodes += pnode.id + ',';\n");
      out.write("\t\t\t\t\tpnode = pnode.getParentNode();\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t} \t\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\tcnodes = cnodes.substring(0, cnodes.length - 1);\n");
      out.write("\t\tpnodes = pnodes.substring(0, pnodes.length - 1);\n");
      out.write("\t\treturn cnodes + \",\" + pnodes;*/\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction expandAll() {\n");
      out.write("\t\tvar zTree = $.fn.zTree.getZTreeObj(\"functionid\");\n");
      out.write("\t\tzTree.expandAll(true);\n");
      out.write("\t}\n");
      out.write("\tfunction selecrAll() {\n");
      out.write("\t\tvar zTree = $.fn.zTree.getZTreeObj(\"functionid\");\n");
      out.write("\t\tzTree.checkAllNodes(true);\n");
      out.write("\t}\n");
      out.write("\tfunction reset() {\n");
      out.write("\t\t$.fn.zTree.init($(\"#functionid\"), setting);\n");
      out.write("\t}\n");
      out.write("\tfunction changeMode(){\n");
      out.write("\t\tvar zTree = $.fn.zTree.getZTreeObj(\"functionid\");\t\t\t\n");
      out.write("\t\tvar typeMode = $(\"#typeMode\").val();\t\t\t\n");
      out.write("\t\tvar type = typeMode == 1 ? {\"Y\" : \"\", \"N\" : \"\"} : {\"Y\" : \"ps\", \"N\" : \"ps\"};\t\n");
      out.write("\t\tzTree.setting.check.chkboxType = type;\n");
      out.write("\t\t$(\"#typeMode\").val(typeMode % 2 + 1);\t\t\t\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t$('#selecrAllBtn').linkbutton({});\n");
      out.write("\t$('#resetBtn').linkbutton({});\n");
      out.write("\t$('#changeBtn').linkbutton({});\n");
      out.write("</script>\n");
      out.write("<div class=\"easyui-layout\" fit=\"true\">\n");
      out.write("\t<div region=\"center\" style=\"padding: 1px;\">\n");
      out.write("\t\t<div class=\"easyui-panel\" style=\"padding: 1px;\" fit=\"true\" border=\"false\" id=\"functionListPanel\">\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"roleId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${roleId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"rid\"> \n");
      out.write("\t\t\t<input type=\"hidden\" id=\"typeMode\" value=\"1\"/>\n");
      out.write("\t\t\t<a id=\"selecrAllBtn\" onclick=\"selecrAll();\">");
      if (_jspx_meth_t_mutiLang_2(_jspx_page_context))
        return;
      out.write("</a> \n");
      out.write("\t\t\t<a id=\"resetBtn\" onclick=\"reset();\">");
      if (_jspx_meth_t_mutiLang_3(_jspx_page_context))
        return;
      out.write("</a>\n");
      out.write("\t\t\t<a id=\"changeBtn\" onclick=\"changeMode();\">");
      if (_jspx_meth_t_mutiLang_4(_jspx_page_context))
        return;
      out.write("</a>\n");
      out.write("\t\t\t<ul id=\"functionid\" class=\"ztree\"></ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div region=\"east\" style=\"width: 300px; overflow: hidden;\" split=\"true\">\n");
      out.write("\t\t<div class=\"easyui-layout\" fit=\"true\">\n");
      out.write("\t\t\t<div region=\"center\" style=\"padding: 1px; border: 0px;\">\n");
      out.write("\t\t\t\t<div class=\"easyui-panel\" style=\"padding: 1px;\" fit=\"true\" border=\"false\" id=\"operationListpanel\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div region=\"east\" style=\"width: 150px; overflow: hidden;\" split=\"true\">\n");
      out.write("\t\t\t\t<div class=\"easyui-panel\" style=\"padding: 1px;\" fit=\"true\" border=\"false\" id=\"dataRuleListpanel\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
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

  private boolean _jspx_meth_t_mutiLang_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_0 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_0.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_0.setParent(null);
    _jspx_th_t_mutiLang_0.setLangKey("menu.list");
    int _jspx_eval_t_mutiLang_0 = _jspx_th_t_mutiLang_0.doStartTag();
    if (_jspx_th_t_mutiLang_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_0);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_0);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_1 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_1.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_1.setParent(null);
    _jspx_th_t_mutiLang_1.setLangKey("operate.manage");
    int _jspx_eval_t_mutiLang_1 = _jspx_th_t_mutiLang_1.doStartTag();
    if (_jspx_th_t_mutiLang_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_1);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_1);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_2 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_2.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_2.setParent(null);
    _jspx_th_t_mutiLang_2.setLangKey("select.all");
    int _jspx_eval_t_mutiLang_2 = _jspx_th_t_mutiLang_2.doStartTag();
    if (_jspx_th_t_mutiLang_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_2);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_2);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_3 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_3.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_3.setParent(null);
    _jspx_th_t_mutiLang_3.setLangKey("common.reset");
    int _jspx_eval_t_mutiLang_3 = _jspx_th_t_mutiLang_3.doStartTag();
    if (_jspx_th_t_mutiLang_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_3);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_3);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_4 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_4.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_4.setParent(null);
    _jspx_th_t_mutiLang_4.setLangKey("common.typemode");
    int _jspx_eval_t_mutiLang_4 = _jspx_th_t_mutiLang_4.doStartTag();
    if (_jspx_th_t_mutiLang_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_4);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_4);
    return false;
  }
}
