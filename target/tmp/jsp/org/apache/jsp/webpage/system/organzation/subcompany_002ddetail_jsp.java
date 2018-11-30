package org.apache.jsp.webpage.system.organzation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class subcompany_002ddetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_base_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_formvalid_usePlugin_layout_formid_dialog_callback_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_formvalid_usePlugin_layout_formid_dialog_callback_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
    _jspx_tagPool_t_formvalid_usePlugin_layout_formid_dialog_callback_action.release();
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
      out.write("  <title>添加一级公司</title>\n");
      out.write("  ");
      if (_jspx_meth_t_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("  //编写自定义JS代码\n");
      out.write("  </script>\n");
      out.write(" </head>\n");
      out.write(" <body>\n");
      out.write("  ");
      if (_jspx_meth_t_formvalid_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write(" </body>\n");
      out.write("  <script src = \"webpage/system/position/tSCompanyPositionList.js\"></script>\t\t\n");
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
    org.jeecgframework.tag.core.easyui.FormValidationTag _jspx_th_t_formvalid_0 = (org.jeecgframework.tag.core.easyui.FormValidationTag) _jspx_tagPool_t_formvalid_usePlugin_layout_formid_dialog_callback_action.get(org.jeecgframework.tag.core.easyui.FormValidationTag.class);
    _jspx_th_t_formvalid_0.setPageContext(_jspx_page_context);
    _jspx_th_t_formvalid_0.setParent(null);
    _jspx_th_t_formvalid_0.setFormid("formobj");
    _jspx_th_t_formvalid_0.setDialog(true);
    _jspx_th_t_formvalid_0.setUsePlugin("password");
    _jspx_th_t_formvalid_0.setLayout("table");
    _jspx_th_t_formvalid_0.setCallback("@Override callbackOrg");
    _jspx_th_t_formvalid_0.setAction("systemController.do?saveDepart");
    int _jspx_eval_t_formvalid_0 = _jspx_th_t_formvalid_0.doStartTag();
    if (_jspx_eval_t_formvalid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t<input id=\"id\" name=\"id\" type=\"hidden\" />\n");
        out.write("\t\t\t\t\t<input id=\"cc\" type=\"hidden\" name=\"TSPDepart.id\">\n");
        out.write("\t\t<table style=\"width: 100%;\" cellpadding=\"0\" cellspacing=\"1\" class=\"formtable\" disabled=\"disabled\">\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\" style=\"width: 30%;height:30px\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t上级编码:\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t         ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${depart.TSPDepart.orgCode }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\" style=\"width: 30%;height:30px\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t上级名称:\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t         ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${depart.TSPDepart.departname }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\" style=\"width: 30%;height:30px\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t编码:\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t         ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${depart.orgCode }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\" style=\"width: 30%;height:30px\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t公司名称:\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t         ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${depart.departname }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("\t\t\t\t\t     \t ");
        out.write("\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\" style=\"height:30px\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t公司描述:\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t         ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${depart.description }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("\t\t\t\t\t     \t");
        out.write("\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\" style=\"height:30px\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t机构类型:\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t         公司\n");
        out.write("\t\t\t\t\t     \t");
        out.write("\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\" style=\"height:30px\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t电话:\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\" style=\"height:30px\">\n");
        out.write("\t\t\t\t\t \t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${depart.mobile }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("\t\t\t\t\t     \t");
        out.write("\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\" style=\"height:30px\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t传真:\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${depart.fax }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("\t\t\t\t\t     \t");
        out.write("\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\" style=\"height:30px\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t地址:\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${depart.address }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("\t\t\t\t\t     \t ");
        out.write("\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t</table>\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_t_formvalid_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_formvalid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_formvalid_usePlugin_layout_formid_dialog_callback_action.reuse(_jspx_th_t_formvalid_0);
      return true;
    }
    _jspx_tagPool_t_formvalid_usePlugin_layout_formid_dialog_callback_action.reuse(_jspx_th_t_formvalid_0);
    return false;
  }
}
