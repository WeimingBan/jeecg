package org.apache.jsp.webpage.com.jeecg.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_005fpopupMultiValue_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_base_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_formvalid_tiptype_layout_formid_dialog_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dictSelect_typeGroupCode_title_field_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_formvalid_tiptype_layout_formid_dialog_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dictSelect_typeGroupCode_title_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
    _jspx_tagPool_t_formvalid_tiptype_layout_formid_dialog_action.release();
    _jspx_tagPool_t_dictSelect_typeGroupCode_title_field_nobody.release();
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

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
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
      out.write(" <style type=\"text/css\">\n");
      out.write(" \tth{\n");
      out.write(" \t\ttext-align: center;\n");
      out.write(" \t\tline-height: 25px;\n");
      out.write(" \t}\n");
      out.write(" \t.value{\n");
      out.write(" \t\tpadding: 10px auto 10px 10px;\n");
      out.write(" \t}\n");
      out.write(" \t.inputxt{\n");
      out.write(" \t\twidth: 150px;\n");
      out.write(" \t}\n");
      out.write(" </style>\n");
      out.write("    <div title=\"Popup Demo\" style=\"height:350px;\" name=\"editPanel\" id=\"editPanel\" fit=\"true\" class=\"easyui-panel\">  \t\n");
      out.write("\t\t");
      if (_jspx_meth_t_formvalid_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </div>");
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

  private boolean _jspx_meth_t_formvalid_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:formvalid
    org.jeecgframework.tag.core.easyui.FormValidationTag _jspx_th_t_formvalid_0 = (org.jeecgframework.tag.core.easyui.FormValidationTag) _jspx_tagPool_t_formvalid_tiptype_layout_formid_dialog_action.get(org.jeecgframework.tag.core.easyui.FormValidationTag.class);
    _jspx_th_t_formvalid_0.setPageContext(_jspx_page_context);
    _jspx_th_t_formvalid_0.setParent(null);
    _jspx_th_t_formvalid_0.setFormid("ff");
    _jspx_th_t_formvalid_0.setDialog(true);
    _jspx_th_t_formvalid_0.setLayout("table");
    _jspx_th_t_formvalid_0.setTiptype("4");
    _jspx_th_t_formvalid_0.setAction("jeecgListDemoController.do?saveRows");
    int _jspx_eval_t_formvalid_0 = _jspx_th_t_formvalid_0.doStartTag();
    if (_jspx_eval_t_formvalid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t<table style=\"width: 600px;\" cellpadding=\"0\" cellspacing=\"1\" class=\"formtable\">\n");
        out.write("\t\t\t\t<thead>\n");
        out.write("\t\t\t\t\t<tr><th>姓名</th><th>账号</th><th>生日</th><th>性别</th><th>工资</th><th>入职状态</th></tr>\n");
        out.write("\t\t\t\t</thead>\n");
        out.write("\t\t\t\t<tbody>\n");
        out.write("\t\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t\t<td class=\"value\">\t\t\t\t\t\t\t\n");
        out.write("\t\t\t\t\t\t\t <input name=\"demos[0].id\" type=\"hidden\" value=\"\" /> \n");
        out.write("\t\t\t\t\t\t     <input onclick=\"popupClick(this,'account,realname','account,name','user_msg');\" placeholder=\"点击选择用户\" name=\"demos[0].name\" type=\"text\" style=\"cursor: pointer;\" class=\"inputxt\" value=\"\">\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t     <input placeholder=\"←\" name=\"demos[0].account\" type=\"text\" class=\"inputxt\" value=\"\">\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t\t<input class=\"easyui-datebox\" type=\"text\" name=\"demos[0].birthday\" id=\"birthday\"/>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_t_dictSelect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t     \t <input id=\"salary\" name=\"demos[0].salary\" type=\"text\" class=\"inputxt\" value=\"\">\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_t_dictSelect_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t</tr>\n");
        out.write("\t\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t\t<td class=\"value\">\t\t\t\t\t\t\t\n");
        out.write("\t\t\t\t\t\t\t <input name=\"demos[1].id\" type=\"hidden\" value=\"\" /> \n");
        out.write("\t\t\t\t\t\t     <input onclick=\"popupClick(this,'account,realname','account,name','user_msg');\" placeholder=\"点击选择用户\" name=\"demos[1].name\" type=\"text\" style=\"cursor: pointer;\" class=\"inputxt\" value=\"\">\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t     <input placeholder=\"←\" name=\"demos[1].account\" type=\"text\" class=\"inputxt\" value=\"\">\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t\t<input class=\"easyui-datebox\" type=\"text\" name=\"demos[1].birthday\"/>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_t_dictSelect_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t     \t <input id=\"salary\" name=\"demos[1].salary\" type=\"text\" class=\"inputxt\" value=\"\">\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_t_dictSelect_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t</tr>\n");
        out.write("\t\t\t\t</tbody>\n");
        out.write("\t\t\t</table>\t\t\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_t_formvalid_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_formvalid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_formvalid_tiptype_layout_formid_dialog_action.reuse(_jspx_th_t_formvalid_0);
      return true;
    }
    _jspx_tagPool_t_formvalid_tiptype_layout_formid_dialog_action.reuse(_jspx_th_t_formvalid_0);
    return false;
  }

  private boolean _jspx_meth_t_dictSelect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_0 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_typeGroupCode_title_field_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_0.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_dictSelect_0.setField("demos[0].sex");
    _jspx_th_t_dictSelect_0.setTypeGroupCode("sex");
    _jspx_th_t_dictSelect_0.setTitle("性别");
    int _jspx_eval_t_dictSelect_0 = _jspx_th_t_dictSelect_0.doStartTag();
    if (_jspx_th_t_dictSelect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_typeGroupCode_title_field_nobody.reuse(_jspx_th_t_dictSelect_0);
      return true;
    }
    _jspx_tagPool_t_dictSelect_typeGroupCode_title_field_nobody.reuse(_jspx_th_t_dictSelect_0);
    return false;
  }

  private boolean _jspx_meth_t_dictSelect_1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_1 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_typeGroupCode_title_field_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_1.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_dictSelect_1.setField("demos[0].status");
    _jspx_th_t_dictSelect_1.setTypeGroupCode("sf_yn");
    _jspx_th_t_dictSelect_1.setTitle("入职状态");
    int _jspx_eval_t_dictSelect_1 = _jspx_th_t_dictSelect_1.doStartTag();
    if (_jspx_th_t_dictSelect_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_typeGroupCode_title_field_nobody.reuse(_jspx_th_t_dictSelect_1);
      return true;
    }
    _jspx_tagPool_t_dictSelect_typeGroupCode_title_field_nobody.reuse(_jspx_th_t_dictSelect_1);
    return false;
  }

  private boolean _jspx_meth_t_dictSelect_2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_2 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_typeGroupCode_title_field_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_2.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_dictSelect_2.setField("demos[1].sex");
    _jspx_th_t_dictSelect_2.setTypeGroupCode("sex");
    _jspx_th_t_dictSelect_2.setTitle("性别");
    int _jspx_eval_t_dictSelect_2 = _jspx_th_t_dictSelect_2.doStartTag();
    if (_jspx_th_t_dictSelect_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_typeGroupCode_title_field_nobody.reuse(_jspx_th_t_dictSelect_2);
      return true;
    }
    _jspx_tagPool_t_dictSelect_typeGroupCode_title_field_nobody.reuse(_jspx_th_t_dictSelect_2);
    return false;
  }

  private boolean _jspx_meth_t_dictSelect_3(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_3 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_typeGroupCode_title_field_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_3.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_dictSelect_3.setField("demos[1].status");
    _jspx_th_t_dictSelect_3.setTypeGroupCode("sf_yn");
    _jspx_th_t_dictSelect_3.setTitle("入职状态");
    int _jspx_eval_t_dictSelect_3 = _jspx_th_t_dictSelect_3.doStartTag();
    if (_jspx_th_t_dictSelect_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_typeGroupCode_title_field_nobody.reuse(_jspx_th_t_dictSelect_3);
      return true;
    }
    _jspx_tagPool_t_dictSelect_typeGroupCode_title_field_nobody.reuse(_jspx_th_t_dictSelect_3);
    return false;
  }
}
