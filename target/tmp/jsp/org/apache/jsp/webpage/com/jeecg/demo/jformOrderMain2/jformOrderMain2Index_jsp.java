package org.apache.jsp.webpage.com.jeecg.demo.jformOrderMain2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jformOrderMain2Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_base_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_menuButtons_name_mm_codes_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_menuButtons_name_codes_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_menuButtons_name_mm_codes_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_menuButtons_name_codes_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
    _jspx_tagPool_t_menuButtons_name_mm_codes_nobody.release();
    _jspx_tagPool_t_menuButtons_name_codes_nobody.release();
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
      out.write("<head>\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("<meta charset=\"utf-8\" />\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"plug-in/easyui/themes/metrole/easyui.css\" type=\"text/css\"></link>\n");
      out.write("<link rel=\"stylesheet\" href=\"plug-in/easyui/themes/metrole/icon.css\" type=\"text/css\"></link>\n");
      out.write("<link rel=\"stylesheet\" href=\"plug-in/ace/css/font-awesome.css\" type=\"text/css\"></link>\n");
      out.write("<link rel=\"stylesheet\" href=\"plug-in/mutitables/mutitables.mainpage.css\" type=\"text/css\"></link>\n");
      if (_jspx_meth_t_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/themes/fineui/jquery/jquery.easyui.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/layer/layer.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/mutitables/mutitables.mainpage.js\" ></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/mutitables/jquery.resize.y.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"easyui-layout\" fit=\"true\">\n");
      out.write("<div region=\"center\" style=\"padding:0px;border:1px;overflow-x:hidden;\">\n");
      out.write("\t<div class=\"tab-opts-menu\" id=\"tab-menus-main\" style=\"font-size:14px\">\n");
      out.write("\t\t<div class=\"opts-menu-box\">\n");
      out.write("\t\t\t<div class=\"menus active table-menu-1\" style=\"top:30px\">\n");
      out.write("\t\t\t\t<!-- 主表菜单 -->\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_menuButtons_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"menus table-menu-0\" style=\"top:-1px\">\n");
      out.write("\t\t\t\t<a title=\"重置\" onclick=\"mainPageQueryReset()\" href=\"####\" class=\"btn-menu fa fa-refresh menu-more\" ></a>\n");
      out.write("\t\t\t\t<a title=\"查询\" onclick=\"associatedQuery('jformOrderMain2','jformOrderMain2List')\" href=\"####\" class=\"btn-menu fa fa-search menu-more\"></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div> \n");
      out.write("\n");
      out.write("  \t<!-- 上方 -->\n");
      out.write("\t<div  id=\"accDiv\" class=\"easyui-accordion\" data-options=\"multiple:true\" style=\"padding-right:0px;overflow-x:hidden;box-sizing: border-box;\">\n");
      out.write("\t\t<div title=\"订单信息查询\" data-options=\"iconCls:'icon-ok'\" style=\"height:100px;padding:10px 0px;overflow:hidden;box-sizing: border-box;\">\n");
      out.write("\t\t  <!-- 查询DIV 主表必须配置有高级查询才可用 -->\n");
      out.write("\t\t  <div id=\"associated_query\" style=\"\">\n");
      out.write("\t\t\t  <form class = \"page-query\">\n");
      out.write("\t\t\t  \t<span style=\"max-width: 83%;display: inline-block;display:-moz-inline-box;\">\n");
      out.write("\t\t\t\t\t<span style=\"display:-moz-inline-box;display:inline-block;margin-bottom:2px;text-align:justify;\">\n");
      out.write("\t\t\t\t\t\t<span style=\"vertical-align:middle;display:-moz-inline-box;display:inline-block;width: 90px;text-align:right;text-overflow:ellipsis;-o-text-overflow:ellipsis; overflow: hidden;white-space:nowrap;\" >\n");
      out.write("\t\t\t\t\t\t\t订单号：\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"jform_order_main.order_code\" style=\"width: 120px\" class=\"inuptxt\">\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t  </form>\n");
      out.write("\t\t  </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- 主表 --> \n");
      out.write("\t\t<div title=\"订单信息\" data-options=\"iconCls:'icon-ok',selected:true\"  >\n");
      out.write("\t\t\t<div id=\"easyui_mainList\" class=\"resize-y-iframe\" style=\"height:286px;padding-bottom:6px;\">\n");
      out.write("\t\t\t\t<iframe id=\"mainList\" height=\"99%\" width=\"100%\" frameborder=\"0\" \n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${webRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jformOrderMain2Controller.do?list\"></iframe>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- 上方end -->\n");
      out.write("\t\t\n");
      out.write("\t<!-- 从表菜单 -->\n");
      out.write("\t<div class=\"tab-opts-menu\" id=\"tab-menus-attached\" style=\"font-size:14px\">\n");
      out.write("\t\t<div class=\"opts-menu-box\">\n");
      out.write("\t\t\t<div class=\"menus testContractItem-ul active\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_menuButtons_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"menus testContractPart-ul\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_menuButtons_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t </div>\n");
      out.write("\t \n");
      out.write("\t <!-- 从表 -->\n");
      out.write("\t <div id=\"tabsok\" style=\"height:500px\">\n");
      out.write("\t     <div title=\"订单客户\" data-options=\"closable:false\" style=\"overflow:hidden;box-sizing: border-box;\">\n");
      out.write("\t\t\t<iframe id=\"jformOrderCustomer2Iframe\" scrolling=\"yes\" frameborder=\"0\" height=\"100%\" width=\"100%\"\n");
      out.write("\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${webRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jformOrderCustomer2Controller.do?list\">\n");
      out.write("\t\t\t</iframe>\n");
      out.write("\t\t </div>\n");
      out.write("\t\t <div title=\"订单机票\" data-options=\"closable:false\" style=\"overflow:hidden;box-sizing: border-box;\">\n");
      out.write("\t\t\t<iframe id=\"jformOrderTicket2Iframe\" scrolling=\"yes\" frameborder=\"0\" height=\"100%\" width=\"100%\"\n");
      out.write("\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${webRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jformOrderTicket2Controller.do?list\">\n");
      out.write("\t\t\t</iframe>\n");
      out.write("\t\t </div>\n");
      out.write("\t  </div>\n");
      out.write("\t  <!-- 从表end -->\n");
      out.write("\n");
      out.write("   </div>\n");
      out.write("   <!-- center end -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div style=\"display:none\">\n");
      out.write("\t<!-- 激活选项卡再刷新页面需要该隐藏域 -->\n");
      out.write("\t<input type=\"hidden\" id=\"mainPageHiddenId\">\n");
      out.write("\t<select id=\"mainPageFrameActived\" style=\"display:none\">\n");
      out.write("\t\t<option value=\"jformOrderCustomer2\" selected=\"selected\"></option>\n");
      out.write("\t\t<option value=\"jformOrderTicket2\"></option>\n");
      out.write("\t</select>\n");
      out.write("</div>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(function(){\n");
      out.write(" \tinitdivwidth();\n");
      out.write("\t$(window).resize(function(){\n");
      out.write("\t\tinitdivwidth();\n");
      out.write("\t}); \n");
      out.write("\tvar tabsok = $('#tabsok').tabs({\n");
      out.write("\t\tnarrow: true,\n");
      out.write("\t\ttabPosition:'top',\n");
      out.write("\t\tnoheader:true,\n");
      out.write("\t\ttools:[{iconCls:'accordion-collapse',handler:function(){diyAccordianForTabs(this,'tabsok',500)}}],\n");
      out.write("\t\tonSelect:function(title,index){\n");
      out.write("\t\t\ttoggleMenus(index);\n");
      out.write("\t\t\tinitSubList(0);\n");
      out.write("\t    }\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t$(\"#tabsok\").find(\".tabs-header .tabs-wrap\").click(function(event){\n");
      out.write("\t\t//event.stopPropagation();\n");
      out.write("\t\tvar tagname = event.target.tagName.toLowerCase();\n");
      out.write("\t\tif(tagname=='ul'){\n");
      out.write("\t\t\t$(\"#tabsok\").find(\".tabs-header .tabs-tool\").find(\"a.l-btn\").trigger(\"click\");\n");
      out.write("\t\t\t//event.stopPropagation();\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\tif($(\"#tabsok\").find(\".tabs-tool\").find('span.l-btn-icon').hasClass(\"accordion-expand\")){\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\tvar lenOffset = getQueryareaRow();\n");
      out.write("\tvar menu_top1 = (78+lenOffset*30)+\"px\",menu_top2 = '30px';\n");
      out.write(" \t$('#accDiv').accordion({\n");
      out.write(" \t\tfirstbuybuy:true,\n");
      out.write(" \t\tsecondbuybuy:function(go){\n");
      out.write(" \t\t\tvar state = go==\"collapse\"?true:false;\n");
      out.write(" \t\t\ttoggleMainMenusTop(menu_top1,menu_top2,state);\n");
      out.write(" \t\t},\n");
      out.write(" \t\tonSelect:function(title,index){\n");
      out.write("\t\t\t$('#tab-menus-main').find('.table-menu-'+index).addClass(\"active\");\n");
      out.write("\t \t},\n");
      out.write("\t\tonUnselect:function(title,index){\n");
      out.write("\t \t\t$('#tab-menus-main').find('.table-menu-'+index).removeClass(\"active\");\n");
      out.write("\t\t}\n");
      out.write("\t}); \n");
      out.write("});\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<!-- 需要改变的是每个iframe的src;子表iframe的id ;mainPageFrameActived中的option的value -->\n");
      out.write("</body>");
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

  private boolean _jspx_meth_t_menuButtons_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:menuButtons
    org.jeecgframework.tag.core.easyui.MenuButtonsTag _jspx_th_t_menuButtons_0 = (org.jeecgframework.tag.core.easyui.MenuButtonsTag) _jspx_tagPool_t_menuButtons_name_mm_codes_nobody.get(org.jeecgframework.tag.core.easyui.MenuButtonsTag.class);
    _jspx_th_t_menuButtons_0.setPageContext(_jspx_page_context);
    _jspx_th_t_menuButtons_0.setParent(null);
    _jspx_th_t_menuButtons_0.setCodes("addSingle,editSingle,batchDel,save,reject");
    _jspx_th_t_menuButtons_0.setName("jformOrderMain2");
    _jspx_th_t_menuButtons_0.setMm(true);
    int _jspx_eval_t_menuButtons_0 = _jspx_th_t_menuButtons_0.doStartTag();
    if (_jspx_th_t_menuButtons_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_menuButtons_name_mm_codes_nobody.reuse(_jspx_th_t_menuButtons_0);
      return true;
    }
    _jspx_tagPool_t_menuButtons_name_mm_codes_nobody.reuse(_jspx_th_t_menuButtons_0);
    return false;
  }

  private boolean _jspx_meth_t_menuButtons_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:menuButtons
    org.jeecgframework.tag.core.easyui.MenuButtonsTag _jspx_th_t_menuButtons_1 = (org.jeecgframework.tag.core.easyui.MenuButtonsTag) _jspx_tagPool_t_menuButtons_name_codes_nobody.get(org.jeecgframework.tag.core.easyui.MenuButtonsTag.class);
    _jspx_th_t_menuButtons_1.setPageContext(_jspx_page_context);
    _jspx_th_t_menuButtons_1.setParent(null);
    _jspx_th_t_menuButtons_1.setCodes("addSingle,editSingle,batchDel,save,reject,template,importe,export,filter");
    _jspx_th_t_menuButtons_1.setName("jformOrderCustomer2");
    int _jspx_eval_t_menuButtons_1 = _jspx_th_t_menuButtons_1.doStartTag();
    if (_jspx_th_t_menuButtons_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_menuButtons_name_codes_nobody.reuse(_jspx_th_t_menuButtons_1);
      return true;
    }
    _jspx_tagPool_t_menuButtons_name_codes_nobody.reuse(_jspx_th_t_menuButtons_1);
    return false;
  }

  private boolean _jspx_meth_t_menuButtons_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:menuButtons
    org.jeecgframework.tag.core.easyui.MenuButtonsTag _jspx_th_t_menuButtons_2 = (org.jeecgframework.tag.core.easyui.MenuButtonsTag) _jspx_tagPool_t_menuButtons_name_codes_nobody.get(org.jeecgframework.tag.core.easyui.MenuButtonsTag.class);
    _jspx_th_t_menuButtons_2.setPageContext(_jspx_page_context);
    _jspx_th_t_menuButtons_2.setParent(null);
    _jspx_th_t_menuButtons_2.setCodes("addSingle,editSingle,batchDel,save,reject,template,importe,export,filter");
    _jspx_th_t_menuButtons_2.setName("jformOrderTicket2");
    int _jspx_eval_t_menuButtons_2 = _jspx_th_t_menuButtons_2.doStartTag();
    if (_jspx_th_t_menuButtons_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_menuButtons_name_codes_nobody.reuse(_jspx_th_t_menuButtons_2);
      return true;
    }
    _jspx_tagPool_t_menuButtons_name_codes_nobody.reuse(_jspx_th_t_menuButtons_2);
    return false;
  }
}
