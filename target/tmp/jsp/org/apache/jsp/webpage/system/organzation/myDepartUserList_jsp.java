package org.apache.jsp.webpage.system.organzation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myDepartUserList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_base_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_datagrid_title_queryMode_name_idField_fitColumns_fit_actionUrl;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_title_hidden_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_sortable_query_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_query_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_sortable_replace_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_width_title_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgDelOpt_urlfont_urlclass_url_title_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgToolBar_width_url_title_langArg_icon_height_funname_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgToolBar_width_url_title_icon_funname_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_urlStyle_title_funname_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_datagrid_title_queryMode_name_idField_fitColumns_fit_actionUrl = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_title_hidden_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_sortable_query_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_query_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_sortable_replace_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_width_title_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgDelOpt_urlfont_urlclass_url_title_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgToolBar_width_url_title_langArg_icon_height_funname_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgToolBar_width_url_title_icon_funname_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_urlStyle_title_funname_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
    _jspx_tagPool_t_datagrid_title_queryMode_name_idField_fitColumns_fit_actionUrl.release();
    _jspx_tagPool_t_dgCol_title_hidden_field_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_sortable_query_field_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_query_field_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_sortable_replace_field_nobody.release();
    _jspx_tagPool_t_dgCol_width_title_field_nobody.release();
    _jspx_tagPool_t_dgDelOpt_urlfont_urlclass_url_title_nobody.release();
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_nobody.release();
    _jspx_tagPool_t_dgToolBar_width_url_title_langArg_icon_height_funname_nobody.release();
    _jspx_tagPool_t_dgToolBar_width_url_title_icon_funname_nobody.release();
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_urlStyle_title_funname_nobody.release();
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
      out.write("<title>分配职务</title>\n");
      if (_jspx_meth_t_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/ztree/js/ztreeCreator.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function setUsersCompanyPosition(id) {\n");
      out.write("\tvar zNodes;\n");
      out.write("\tvar ztreeCreator = new ZtreeCreator('orgTree',\"\",\"\")\n");
      out.write("\t\t\t.setCheckboxType({ \"Y\": \"ps\", \"N\": \"ps\" })\n");
      out.write("\t\t\t.setAsync({\n");
      out.write("\t                enable: true,\n");
      out.write("\t                url:\"tSCompanyPositionController.do?getTreeData&departid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${departid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&userId=\"+id,\n");
      out.write("\t                autoParam:[\"id\", \"name\", \"level\"],\n");
      out.write("\t                dataFilter:filter\n");
      out.write("\t            }) \n");
      out.write(" \t\t\t.initZtree({},function(treeObj){orgTree = treeObj});\n");
      out.write("\t//菜单权限保存\n");
      out.write("\t$(\"#functionListPanel\").panel({\n");
      out.write("\t\ttitle : '分配职务',\n");
      out.write("\t\ttools : [ {\n");
      out.write("\t\t\ticonCls : 'icon-save',\n");
      out.write("\t\t\thandler : function() {\n");
      out.write("\t\t\t\tmysubmit(id);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t} ]\n");
      out.write("\t});\n");
      out.write("};\n");
      out.write("\n");
      out.write("function openAuthorizeSet(id) {\n");
      out.write("\tvar zNodes;\n");
      out.write("\tjQuery.ajax({  \n");
      out.write("        async : false,  \n");
      out.write("        cache:false,  \n");
      out.write("        type: 'POST',  \n");
      out.write("        dataType : \"json\",  \n");
      out.write("        url: 'departAuthGroupController.do?getDepartGroupRoleTree&userId='+id+'&departId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${departid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("',//请求的action路径  \n");
      out.write("        error: function () {//请求失败处理函数  \n");
      out.write("            tip('请求失败');  \n");
      out.write("        },  \n");
      out.write("        success:function(data){ //请求成功后处理函数。\n");
      out.write("            zNodes = data.obj;   //把后台封装好的简单Json格式赋给zNodes  \n");
      out.write("        }  \n");
      out.write("    });  \n");
      out.write("\n");
      out.write("\tvar ztreeCreator = new ZtreeCreator('orgTree',\"departAuthGroupController.do?getDepartRoleTree\",zNodes)\n");
      out.write("\t\t\t.setCheckboxType({ \"Y\": \"ps\", \"N\": \"ps\" })\n");
      out.write(" \t\t\t.initZtree({},function(treeObj){orgTree = treeObj});\n");
      out.write("\t//菜单权限保存\n");
      out.write("\t$(\"#functionListPanel\").panel({\n");
      out.write("\t\ttitle : '授权部门角色',\n");
      out.write("\t\ttools : [ {\n");
      out.write("\t\t\ticonCls : 'icon-save',\n");
      out.write("\t\t\thandler : function() {\n");
      out.write("\t\t\t\tmysubmitAuthorize(id);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t} ]\n");
      out.write("\t});\n");
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
      out.write("\n");
      out.write("//获取实际被选中的节点\n");
      out.write("function GetNode() {\n");
      out.write("\tvar zTree = $.fn.zTree.getZTreeObj(\"orgTree\");\t\t\t\t\n");
      out.write("\tvar node = zTree.getCheckedNodes(true);\n");
      out.write("\tvar cnodes = '';\n");
      out.write("\tif(node.length<=0){\n");
      out.write("\t\treturn cnodes;\n");
      out.write("\t}\n");
      out.write("\tfor ( var i = 0; i < node.length; i++) {\n");
      out.write("\t\tcnodes += node[i].id + ',';\n");
      out.write("\t}\n");
      out.write("\tcnodes = cnodes.substring(0, cnodes.length - 1);\n");
      out.write("\treturn cnodes;\n");
      out.write("}\n");
      out.write("function mysubmit(userId) {\n");
      out.write("\tvar s = GetNode();\n");
      out.write("\t$.ajax({\n");
      out.write("\t\turl : \"tSCompanyPositionController.do?saveUserCompanyPosition\",\n");
      out.write("\t\ttype : \"POST\",\n");
      out.write("\t\tdata : {\n");
      out.write("\t\t\t\"departid\":\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${departid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\",\n");
      out.write("\t\t\t\"userId\":userId,\n");
      out.write("\t\t\t\"positionIds\":s\n");
      out.write("\t\t},\n");
      out.write("\t\tsuccess:function(data){\n");
      out.write("\t\t\ttip('保存数据成功');\n");
      out.write("\t\t\treloadTable();\n");
      out.write("\t\t},\n");
      out.write("\t\terror:function(data) {\n");
      out.write("\t\t\tvar d = $.parseJSON(data);\n");
      out.write("\t\t\ttip(d.msg);\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("function mysubmitAuthorize(userId) {\n");
      out.write("\tvar s = GetAuthNode();\n");
      out.write("\t$.ajax({\n");
      out.write("\t\turl : \"departAuthGroupController.do?saveRoleUser\",\n");
      out.write("\t\ttype : \"POST\",\n");
      out.write("\t\tdata : {\n");
      out.write("\t\t\t\"userId\":userId,\n");
      out.write("\t\t\t\"roleId\":s\n");
      out.write("\t\t},\n");
      out.write("\t\tsuccess:function(data){\n");
      out.write("\t\t\ttip('保存数据成功');\n");
      out.write("\t\t},\n");
      out.write("\t\terror:function(data) {\n");
      out.write("\t\t\tvar d = $.parseJSON(data);\n");
      out.write("\t\t\ttip(d.msg);\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("//获取实际被选中的角色组节点，去除第一节点\n");
      out.write("function GetAuthNode() {\n");
      out.write("\tvar zTree = $.fn.zTree.getZTreeObj(\"orgTree\");\t\t\t\t\n");
      out.write("\tvar node = zTree.getCheckedNodes(true);\n");
      out.write("\t//加入实际被选中的节点\n");
      out.write("\tvar cnodes = '';\n");
      out.write("\tfor ( var i = 0; i < node.length; i++) {\n");
      out.write("\t\t//取消一级节点\n");
      out.write("\t\tif(node[i].isParent!=true){\n");
      out.write("\t\t\tcnodes += node[i].id + ',';\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\tcnodes = cnodes.substring(0, cnodes.length - 1);\n");
      out.write("\treturn cnodes;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"divUserList\" class=\"easyui-layout\" style=\"width:100%;\">\n");
      out.write("    <div data-options=\"region:'center'\">\n");
      out.write("\t");
      if (_jspx_meth_t_datagrid_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write(" </div>\n");
      out.write("</div>\n");
      out.write("<div region=\"east\" title=\"分配职务\" style=\"width: 300px;\" split=\"true\" id=\"functionListPanel\">\n");
      out.write("\t<div id=\"orgTree\" class=\"ztree\"></div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tvar divHeight = $(window).height();\n");
      out.write("\t$(\"#divUserList\").css(\"height\",divHeight+\"px\");\n");
      out.write("\n");
      out.write("\tfunction reloadTable(){\n");
      out.write("\t\t$('#departUserList').datagrid('reload');\n");
      out.write("\t\t$(\"#orgTree\").html(\"\");\n");
      out.write("\t}\n");
      out.write("\n");
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

  private boolean _jspx_meth_t_base_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:base
    org.jeecgframework.tag.core.easyui.BaseTag _jspx_th_t_base_0 = (org.jeecgframework.tag.core.easyui.BaseTag) _jspx_tagPool_t_base_type_nobody.get(org.jeecgframework.tag.core.easyui.BaseTag.class);
    _jspx_th_t_base_0.setPageContext(_jspx_page_context);
    _jspx_th_t_base_0.setParent(null);
    _jspx_th_t_base_0.setType("jquery,easyui,tools,DatePicker,ztree");
    int _jspx_eval_t_base_0 = _jspx_th_t_base_0.doStartTag();
    if (_jspx_th_t_base_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_base_type_nobody.reuse(_jspx_th_t_base_0);
      return true;
    }
    _jspx_tagPool_t_base_type_nobody.reuse(_jspx_th_t_base_0);
    return false;
  }

  private boolean _jspx_meth_t_datagrid_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:datagrid
    org.jeecgframework.tag.core.easyui.DataGridTag _jspx_th_t_datagrid_0 = (org.jeecgframework.tag.core.easyui.DataGridTag) _jspx_tagPool_t_datagrid_title_queryMode_name_idField_fitColumns_fit_actionUrl.get(org.jeecgframework.tag.core.easyui.DataGridTag.class);
    _jspx_th_t_datagrid_0.setPageContext(_jspx_page_context);
    _jspx_th_t_datagrid_0.setParent(null);
    _jspx_th_t_datagrid_0.setName("departUserList");
    _jspx_th_t_datagrid_0.setTitle("common.operation");
    _jspx_th_t_datagrid_0.setActionUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("organzationController.do?userDatagrid&departid=${departid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_t_datagrid_0.setFit(true);
    _jspx_th_t_datagrid_0.setFitColumns(true);
    _jspx_th_t_datagrid_0.setIdField("id");
    _jspx_th_t_datagrid_0.setQueryMode("group");
    int _jspx_eval_t_datagrid_0 = _jspx_th_t_datagrid_0.doStartTag();
    if (_jspx_eval_t_datagrid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t");
        if (_jspx_meth_t_dgCol_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t");
        if (_jspx_meth_t_dgCol_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t");
        if (_jspx_meth_t_dgCol_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t");
        if (_jspx_meth_t_dgCol_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t");
        if (_jspx_meth_t_dgCol_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t");
        if (_jspx_meth_t_dgCol_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t");
        if (_jspx_meth_t_dgCol_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t");
        if (_jspx_meth_t_dgDelOpt_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t");
        if (_jspx_meth_t_dgFunOpt_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t");
        if (_jspx_meth_t_dgToolBar_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t");
        if (_jspx_meth_t_dgToolBar_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t");
        if (_jspx_meth_t_dgToolBar_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t    ");
        if (_jspx_meth_t_dgFunOpt_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        int evalDoAfterBody = _jspx_th_t_datagrid_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_datagrid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_datagrid_title_queryMode_name_idField_fitColumns_fit_actionUrl.reuse(_jspx_th_t_datagrid_0);
      return true;
    }
    _jspx_tagPool_t_datagrid_title_queryMode_name_idField_fitColumns_fit_actionUrl.reuse(_jspx_th_t_datagrid_0);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_0 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_title_hidden_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_0.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_0.setTitle("编号");
    _jspx_th_t_dgCol_0.setField("id");
    _jspx_th_t_dgCol_0.setHidden(true);
    int _jspx_eval_t_dgCol_0 = _jspx_th_t_dgCol_0.doStartTag();
    if (_jspx_th_t_dgCol_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_title_hidden_field_nobody.reuse(_jspx_th_t_dgCol_0);
      return true;
    }
    _jspx_tagPool_t_dgCol_title_hidden_field_nobody.reuse(_jspx_th_t_dgCol_0);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_1 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_sortable_query_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_1.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_1.setTitle("common.username");
    _jspx_th_t_dgCol_1.setSortable(false);
    _jspx_th_t_dgCol_1.setField("userName");
    _jspx_th_t_dgCol_1.setQuery(true);
    _jspx_th_t_dgCol_1.setWidth(new Integer(50));
    int _jspx_eval_t_dgCol_1 = _jspx_th_t_dgCol_1.doStartTag();
    if (_jspx_th_t_dgCol_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_sortable_query_field_nobody.reuse(_jspx_th_t_dgCol_1);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_sortable_query_field_nobody.reuse(_jspx_th_t_dgCol_1);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_2 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_query_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_2.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_2.setTitle("common.real.name");
    _jspx_th_t_dgCol_2.setField("realName");
    _jspx_th_t_dgCol_2.setQuery(true);
    _jspx_th_t_dgCol_2.setWidth(new Integer(50));
    int _jspx_eval_t_dgCol_2 = _jspx_th_t_dgCol_2.doStartTag();
    if (_jspx_th_t_dgCol_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_query_field_nobody.reuse(_jspx_th_t_dgCol_2);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_query_field_nobody.reuse(_jspx_th_t_dgCol_2);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_3(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_3 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_sortable_query_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_3.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_3.setTitle("common.department");
    _jspx_th_t_dgCol_3.setSortable(false);
    _jspx_th_t_dgCol_3.setField("userOrgList.tsDepart.departname");
    _jspx_th_t_dgCol_3.setQuery(false);
    _jspx_th_t_dgCol_3.setWidth(new Integer(60));
    int _jspx_eval_t_dgCol_3 = _jspx_th_t_dgCol_3.doStartTag();
    if (_jspx_th_t_dgCol_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_sortable_query_field_nobody.reuse(_jspx_th_t_dgCol_3);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_sortable_query_field_nobody.reuse(_jspx_th_t_dgCol_3);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_4(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_4 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_sortable_query_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_4.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_4.setTitle("common.position.name");
    _jspx_th_t_dgCol_4.setSortable(false);
    _jspx_th_t_dgCol_4.setField("positionName");
    _jspx_th_t_dgCol_4.setQuery(false);
    _jspx_th_t_dgCol_4.setWidth(new Integer(30));
    int _jspx_eval_t_dgCol_4 = _jspx_th_t_dgCol_4.doStartTag();
    if (_jspx_th_t_dgCol_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_sortable_query_field_nobody.reuse(_jspx_th_t_dgCol_4);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_sortable_query_field_nobody.reuse(_jspx_th_t_dgCol_4);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_5(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_5 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_sortable_replace_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_5.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_5.setTitle("common.status");
    _jspx_th_t_dgCol_5.setSortable(true);
    _jspx_th_t_dgCol_5.setWidth(new Integer(20));
    _jspx_th_t_dgCol_5.setField("status");
    _jspx_th_t_dgCol_5.setReplace("common.active_1,common.inactive_0,super.admin_-1");
    int _jspx_eval_t_dgCol_5 = _jspx_th_t_dgCol_5.doStartTag();
    if (_jspx_th_t_dgCol_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_sortable_replace_field_nobody.reuse(_jspx_th_t_dgCol_5);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_sortable_replace_field_nobody.reuse(_jspx_th_t_dgCol_5);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_6(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_6 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_width_title_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_6.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_6.setTitle("common.operation");
    _jspx_th_t_dgCol_6.setField("opt");
    _jspx_th_t_dgCol_6.setWidth(new Integer(130));
    int _jspx_eval_t_dgCol_6 = _jspx_th_t_dgCol_6.doStartTag();
    if (_jspx_th_t_dgCol_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_width_title_field_nobody.reuse(_jspx_th_t_dgCol_6);
      return true;
    }
    _jspx_tagPool_t_dgCol_width_title_field_nobody.reuse(_jspx_th_t_dgCol_6);
    return false;
  }

  private boolean _jspx_meth_t_dgDelOpt_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgDelOpt
    org.jeecgframework.tag.core.easyui.DataGridDelOptTag _jspx_th_t_dgDelOpt_0 = (org.jeecgframework.tag.core.easyui.DataGridDelOptTag) _jspx_tagPool_t_dgDelOpt_urlfont_urlclass_url_title_nobody.get(org.jeecgframework.tag.core.easyui.DataGridDelOptTag.class);
    _jspx_th_t_dgDelOpt_0.setPageContext(_jspx_page_context);
    _jspx_th_t_dgDelOpt_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgDelOpt_0.setTitle("解除机构关系");
    _jspx_th_t_dgDelOpt_0.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("organzationController.do?delUserOrg&userid={id}&departid=${departid }", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_t_dgDelOpt_0.setUrlclass("ace_button");
    _jspx_th_t_dgDelOpt_0.setUrlfont("fa-trash-o");
    int _jspx_eval_t_dgDelOpt_0 = _jspx_th_t_dgDelOpt_0.doStartTag();
    if (_jspx_th_t_dgDelOpt_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgDelOpt_urlfont_urlclass_url_title_nobody.reuse(_jspx_th_t_dgDelOpt_0);
      return true;
    }
    _jspx_tagPool_t_dgDelOpt_urlfont_urlclass_url_title_nobody.reuse(_jspx_th_t_dgDelOpt_0);
    return false;
  }

  private boolean _jspx_meth_t_dgFunOpt_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgFunOpt
    org.jeecgframework.tag.core.easyui.DataGridFunOptTag _jspx_th_t_dgFunOpt_0 = (org.jeecgframework.tag.core.easyui.DataGridFunOptTag) _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridFunOptTag.class);
    _jspx_th_t_dgFunOpt_0.setPageContext(_jspx_page_context);
    _jspx_th_t_dgFunOpt_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgFunOpt_0.setFunname("setUsersCompanyPosition(id)");
    _jspx_th_t_dgFunOpt_0.setTitle("分配职务");
    _jspx_th_t_dgFunOpt_0.setUrlclass("ace_button");
    _jspx_th_t_dgFunOpt_0.setUrlfont("fa-user");
    int _jspx_eval_t_dgFunOpt_0 = _jspx_th_t_dgFunOpt_0.doStartTag();
    if (_jspx_th_t_dgFunOpt_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_nobody.reuse(_jspx_th_t_dgFunOpt_0);
      return true;
    }
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_title_funname_nobody.reuse(_jspx_th_t_dgFunOpt_0);
    return false;
  }

  private boolean _jspx_meth_t_dgToolBar_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_0 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_width_url_title_langArg_icon_height_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_0.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_0.setTitle("common.add.param");
    _jspx_th_t_dgToolBar_0.setWidth("800");
    _jspx_th_t_dgToolBar_0.setHeight("500");
    _jspx_th_t_dgToolBar_0.setLangArg("common.user");
    _jspx_th_t_dgToolBar_0.setIcon("icon-add");
    _jspx_th_t_dgToolBar_0.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("userController.do?addorupdateMyOrgUser&departid=${departid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_t_dgToolBar_0.setFunname("add");
    int _jspx_eval_t_dgToolBar_0 = _jspx_th_t_dgToolBar_0.doStartTag();
    if (_jspx_th_t_dgToolBar_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_width_url_title_langArg_icon_height_funname_nobody.reuse(_jspx_th_t_dgToolBar_0);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_width_url_title_langArg_icon_height_funname_nobody.reuse(_jspx_th_t_dgToolBar_0);
    return false;
  }

  private boolean _jspx_meth_t_dgToolBar_1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_1 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_width_url_title_langArg_icon_height_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_1.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_1.setTitle("common.edit.param");
    _jspx_th_t_dgToolBar_1.setWidth("800");
    _jspx_th_t_dgToolBar_1.setHeight("500");
    _jspx_th_t_dgToolBar_1.setLangArg("common.user");
    _jspx_th_t_dgToolBar_1.setIcon("icon-edit");
    _jspx_th_t_dgToolBar_1.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("userController.do?addorupdateMyOrgUser&departid=${departid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_t_dgToolBar_1.setFunname("update");
    int _jspx_eval_t_dgToolBar_1 = _jspx_th_t_dgToolBar_1.doStartTag();
    if (_jspx_th_t_dgToolBar_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_width_url_title_langArg_icon_height_funname_nobody.reuse(_jspx_th_t_dgToolBar_1);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_width_url_title_langArg_icon_height_funname_nobody.reuse(_jspx_th_t_dgToolBar_1);
    return false;
  }

  private boolean _jspx_meth_t_dgToolBar_2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgToolBar
    org.jeecgframework.tag.core.easyui.DataGridToolBarTag _jspx_th_t_dgToolBar_2 = (org.jeecgframework.tag.core.easyui.DataGridToolBarTag) _jspx_tagPool_t_dgToolBar_width_url_title_icon_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridToolBarTag.class);
    _jspx_th_t_dgToolBar_2.setPageContext(_jspx_page_context);
    _jspx_th_t_dgToolBar_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgToolBar_2.setTitle("添加已有用户");
    _jspx_th_t_dgToolBar_2.setIcon("icon-add");
    _jspx_th_t_dgToolBar_2.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("organzationController.do?goAddMyOrgUserToOrg&orgId=${departid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_t_dgToolBar_2.setFunname("add");
    _jspx_th_t_dgToolBar_2.setWidth("650");
    int _jspx_eval_t_dgToolBar_2 = _jspx_th_t_dgToolBar_2.doStartTag();
    if (_jspx_th_t_dgToolBar_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgToolBar_width_url_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_2);
      return true;
    }
    _jspx_tagPool_t_dgToolBar_width_url_title_icon_funname_nobody.reuse(_jspx_th_t_dgToolBar_2);
    return false;
  }

  private boolean _jspx_meth_t_dgFunOpt_1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgFunOpt
    org.jeecgframework.tag.core.easyui.DataGridFunOptTag _jspx_th_t_dgFunOpt_1 = (org.jeecgframework.tag.core.easyui.DataGridFunOptTag) _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_urlStyle_title_funname_nobody.get(org.jeecgframework.tag.core.easyui.DataGridFunOptTag.class);
    _jspx_th_t_dgFunOpt_1.setPageContext(_jspx_page_context);
    _jspx_th_t_dgFunOpt_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgFunOpt_1.setFunname("openAuthorizeSet(id)");
    _jspx_th_t_dgFunOpt_1.setTitle("分配部门角色");
    _jspx_th_t_dgFunOpt_1.setUrlclass("ace_button");
    _jspx_th_t_dgFunOpt_1.setUrlfont("fa-cog");
    _jspx_th_t_dgFunOpt_1.setUrlStyle("background-color:#18a689;");
    int _jspx_eval_t_dgFunOpt_1 = _jspx_th_t_dgFunOpt_1.doStartTag();
    if (_jspx_th_t_dgFunOpt_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_urlStyle_title_funname_nobody.reuse(_jspx_th_t_dgFunOpt_1);
      return true;
    }
    _jspx_tagPool_t_dgFunOpt_urlfont_urlclass_urlStyle_title_funname_nobody.reuse(_jspx_th_t_dgFunOpt_1);
    return false;
  }
}
