package org.apache.jsp.webpage.com.jeecg.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class jfromOrder_002dupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_base_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_formvalid_usePlugin_tiptype_layout_formid_dialog_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_tabs_tabPosition_iframe_id_fit;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_tab_title_id_icon_href_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_formvalid_usePlugin_tiptype_layout_formid_dialog_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_tabs_tabPosition_iframe_id_fit = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_tab_title_id_icon_href_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
    _jspx_tagPool_t_formvalid_usePlugin_tiptype_layout_formid_dialog_action.release();
    _jspx_tagPool_t_tabs_tabPosition_iframe_id_fit.release();
    _jspx_tagPool_t_tab_title_id_icon_href_nobody.release();
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
      out.write(" <head>\n");
      out.write("  <title>订单列表</title>\n");
      out.write("    <style>\n");
      out.write("  .ui-button {\n");
      out.write("  \t  display: inline-block;\n");
      out.write("\t  padding: 2px 2px;\n");
      out.write("\t  margin-bottom: 0;\n");
      out.write("\t  font-size: 8px;\n");
      out.write("\t  font-weight: normal;\n");
      out.write("\t  line-height: 1.42857143;\n");
      out.write("\t  text-align: center;\n");
      out.write("\t  white-space: nowrap;\n");
      out.write("\t  vertical-align: middle;\n");
      out.write("\t  -ms-touch-action: manipulation;\n");
      out.write("      touch-action: manipulation;\n");
      out.write("\t  cursor: pointer;\n");
      out.write("\t  -webkit-user-select: none;\n");
      out.write("      -moz-user-select: none;\n");
      out.write("      -ms-user-select: none;\n");
      out.write("      user-select: none;\n");
      out.write("\t  background-image: none;\n");
      out.write("\t  border: 1px solid transparent;\n");
      out.write("\t  border-radius: 4px;\n");
      out.write("  }\n");
      out.write("  </style>\n");
      out.write("  ");
      if (_jspx_meth_t_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("  $(document).ready(function(){\n");
      out.write("\t$('#tt').tabs({\n");
      out.write("\t   onSelect:function(title){\n");
      out.write("\t       $('#tt .panel-body').css('width','auto');\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t$(\".tabs-wrap\").css('width','100%');\n");
      out.write("  });\n");
      out.write(" </script>\n");
      out.write(" </head>\n");
      out.write(" <body style=\"overflow-x: hidden;\">\n");
      out.write("  ");
      if (_jspx_meth_t_formvalid_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t<!-- 添加 附表明细 模版 -->\n");
      out.write("\t\t<table style=\"display:none\">\n");
      out.write("\t\t<tbody id=\"add_jfromOrderLine_table_template\">\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t <td align=\"center\"><div style=\"width: 25px;\" name=\"xh\"></div></td>\n");
      out.write("\t\t\t <td align=\"center\"><input style=\"width:20px;\" type=\"checkbox\" name=\"ck\"/></td>\n");
      out.write("\t\t\t\t  <td align=\"left\">\n");
      out.write("\t\t\t\t\t  \t\t<input name=\"jfromOrderLineList[#index#].itemName\" maxlength=\"128\" type=\"text\" class=\"inputxt\"  style=\"width:120px;\"  ignore=\"ignore\" />\n");
      out.write("\t\t\t\t\t  <label class=\"Validform_label\" style=\"display: none;\">商品名称</label>\n");
      out.write("\t\t\t\t  </td>\n");
      out.write("\t\t\t\t  <td align=\"left\">\n");
      out.write("\t\t\t\t\t  \t\t<input name=\"jfromOrderLineList[#index#].qty\" maxlength=\"32\" type=\"text\" class=\"inputxt\"  style=\"width:120px;\"  datatype=\"n\"  ignore=\"ignore\" />\n");
      out.write("\t\t\t\t\t  <label class=\"Validform_label\" style=\"display: none;\">商品数量</label>\n");
      out.write("\t\t\t\t  </td>\n");
      out.write("\t\t\t\t  <td align=\"left\">\n");
      out.write("\t\t\t\t\t  \t\t<input name=\"jfromOrderLineList[#index#].price\" maxlength=\"32\" type=\"text\" class=\"inputxt\"  style=\"width:120px;\"  ignore=\"ignore\" />\n");
      out.write("\t\t\t\t\t  <label class=\"Validform_label\" style=\"display: none;\">商品价格</label>\n");
      out.write("\t\t\t\t  </td>\n");
      out.write("\t\t\t\t  <td align=\"left\">\n");
      out.write("\t\t\t\t\t  \t\t<input name=\"jfromOrderLineList[#index#].amount\" maxlength=\"32\" type=\"text\" class=\"inputxt\"  style=\"width:120px;\"  ignore=\"ignore\" />\n");
      out.write("\t\t\t\t\t  <label class=\"Validform_label\" style=\"display: none;\">金额</label>\n");
      out.write("\t\t\t\t  </td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t </tbody>\n");
      out.write("\t\t</table>\n");
      out.write(" </body>\n");
      out.write(" <script src = \"webpage/com/jeecg/demo/jfromOrder.js\"></script>\t\n");
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

  private boolean _jspx_meth_t_formvalid_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:formvalid
    org.jeecgframework.tag.core.easyui.FormValidationTag _jspx_th_t_formvalid_0 = (org.jeecgframework.tag.core.easyui.FormValidationTag) _jspx_tagPool_t_formvalid_usePlugin_tiptype_layout_formid_dialog_action.get(org.jeecgframework.tag.core.easyui.FormValidationTag.class);
    _jspx_th_t_formvalid_0.setPageContext(_jspx_page_context);
    _jspx_th_t_formvalid_0.setParent(null);
    _jspx_th_t_formvalid_0.setFormid("formobj");
    _jspx_th_t_formvalid_0.setDialog(true);
    _jspx_th_t_formvalid_0.setUsePlugin("password");
    _jspx_th_t_formvalid_0.setLayout("table");
    _jspx_th_t_formvalid_0.setTiptype("1");
    _jspx_th_t_formvalid_0.setAction("jfromOrderController.do?doUpdate");
    int _jspx_eval_t_formvalid_0 = _jspx_th_t_formvalid_0.doStartTag();
    if (_jspx_eval_t_formvalid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t<input id=\"id\" name=\"id\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jfromOrderPage.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("\t<table cellpadding=\"0\" cellspacing=\"1\" class=\"formtable\">\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t<label class=\"Validform_label\">收货人:</label>\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t\t<td class=\"value\">\n");
        out.write("\t\t     \t <input id=\"receiverName\" name=\"receiverName\" type=\"text\" style=\"width: 150px\" class=\"inputxt\"  ignore=\"ignore\"  value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jfromOrderPage.receiverName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("'/>\n");
        out.write("\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t<label class=\"Validform_label\" style=\"display: none;\">收货人</label>\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t<label class=\"Validform_label\">联系电话:</label>\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t\t<td class=\"value\">\n");
        out.write("\t\t     \t <input id=\"receiverMobile\" name=\"receiverMobile\" type=\"text\" style=\"width: 150px\" class=\"inputxt\"  ignore=\"ignore\"  value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jfromOrderPage.receiverMobile}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("'/>\n");
        out.write("\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t<label class=\"Validform_label\" style=\"display: none;\">联系电话</label>\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t<label class=\"Validform_label\">收货省:</label>\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t\t<td class=\"value\">\n");
        out.write("\t\t     \t <input id=\"receiverState\" name=\"receiverState\" type=\"text\" style=\"width: 150px\" class=\"inputxt\"  ignore=\"ignore\"  value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jfromOrderPage.receiverState}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("'/>\n");
        out.write("\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t<label class=\"Validform_label\" style=\"display: none;\">收货省</label>\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t<label class=\"Validform_label\">收货市:</label>\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t\t<td class=\"value\">\n");
        out.write("\t\t     \t <input id=\"receiverCity\" name=\"receiverCity\" type=\"text\" style=\"width: 150px\" class=\"inputxt\"  ignore=\"ignore\"  value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jfromOrderPage.receiverCity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("'/>\n");
        out.write("\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t<label class=\"Validform_label\" style=\"display: none;\">收货市</label>\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t<label class=\"Validform_label\">收货区:</label>\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t\t<td class=\"value\">\n");
        out.write("\t\t     \t <input id=\"receiverDistrict\" name=\"receiverDistrict\" type=\"text\" style=\"width: 150px\" class=\"inputxt\"  ignore=\"ignore\"  value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jfromOrderPage.receiverDistrict}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("'/>\n");
        out.write("\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t<label class=\"Validform_label\" style=\"display: none;\">收货区</label>\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t<label class=\"Validform_label\">收货地址:</label>\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t\t<td class=\"value\">\n");
        out.write("\t\t     \t <input id=\"receiverAddress\" name=\"receiverAddress\" type=\"text\" style=\"width: 150px\" class=\"inputxt\"  ignore=\"ignore\"  value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jfromOrderPage.receiverAddress}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("'/>\n");
        out.write("\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t<label class=\"Validform_label\" style=\"display: none;\">收货地址</label>\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\n");
        out.write("\t\t\t</table>\n");
        out.write("\t\t\t<div style=\"width: auto;height: 200px;\">\n");
        out.write("\t\t\t\t");
        out.write("\n");
        out.write("\t\t\t\t<div style=\"width:800px;height:1px;\"></div>\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_t_tabs_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t</div> \n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_t_formvalid_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_formvalid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_formvalid_usePlugin_tiptype_layout_formid_dialog_action.reuse(_jspx_th_t_formvalid_0);
      return true;
    }
    _jspx_tagPool_t_formvalid_usePlugin_tiptype_layout_formid_dialog_action.reuse(_jspx_th_t_formvalid_0);
    return false;
  }

  private boolean _jspx_meth_t_tabs_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tabs
    org.jeecgframework.tag.core.easyui.TabsTag _jspx_th_t_tabs_0 = (org.jeecgframework.tag.core.easyui.TabsTag) _jspx_tagPool_t_tabs_tabPosition_iframe_id_fit.get(org.jeecgframework.tag.core.easyui.TabsTag.class);
    _jspx_th_t_tabs_0.setPageContext(_jspx_page_context);
    _jspx_th_t_tabs_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_tabs_0.setId("tt");
    _jspx_th_t_tabs_0.setIframe(false);
    _jspx_th_t_tabs_0.setTabPosition("top");
    _jspx_th_t_tabs_0.setFit(false);
    int _jspx_eval_t_tabs_0 = _jspx_th_t_tabs_0.doStartTag();
    if (_jspx_eval_t_tabs_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t ");
        if (_jspx_meth_t_tab_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_tabs_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_t_tabs_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_tabs_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_tabs_tabPosition_iframe_id_fit.reuse(_jspx_th_t_tabs_0);
      return true;
    }
    _jspx_tagPool_t_tabs_tabPosition_iframe_id_fit.reuse(_jspx_th_t_tabs_0);
    return false;
  }

  private boolean _jspx_meth_t_tab_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_tabs_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tab
    org.jeecgframework.tag.core.easyui.TabTag _jspx_th_t_tab_0 = (org.jeecgframework.tag.core.easyui.TabTag) _jspx_tagPool_t_tab_title_id_icon_href_nobody.get(org.jeecgframework.tag.core.easyui.TabTag.class);
    _jspx_th_t_tab_0.setPageContext(_jspx_page_context);
    _jspx_th_t_tab_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_tabs_0);
    _jspx_th_t_tab_0.setHref((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("jfromOrderController.do?jfromOrderLineList&id=${jfromOrderPage.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_t_tab_0.setIcon("icon-search");
    _jspx_th_t_tab_0.setTitle("订单表体");
    _jspx_th_t_tab_0.setId("jfromOrderLine");
    int _jspx_eval_t_tab_0 = _jspx_th_t_tab_0.doStartTag();
    if (_jspx_th_t_tab_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_tab_title_id_icon_href_nobody.reuse(_jspx_th_t_tab_0);
      return true;
    }
    _jspx_tagPool_t_tab_title_id_icon_href_nobody.reuse(_jspx_th_t_tab_0);
    return false;
  }
}
