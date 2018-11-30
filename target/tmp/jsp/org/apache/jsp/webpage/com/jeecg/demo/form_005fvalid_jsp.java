package org.apache.jsp.webpage.com.jeecg.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class form_005fvalid_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_base_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_formvalid_layout_formid_dialog_callback_beforeSubmit_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_hasPermission_code;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_formvalid_tiptype_layout_formid_dialog_callback_beforeSubmit_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_authFilter_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_formvalid_layout_formid_dialog_callback_beforeSubmit_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_hasPermission_code = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_formvalid_tiptype_layout_formid_dialog_callback_beforeSubmit_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_authFilter_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
    _jspx_tagPool_t_formvalid_layout_formid_dialog_callback_beforeSubmit_action.release();
    _jspx_tagPool_t_hasPermission_code.release();
    _jspx_tagPool_t_formvalid_tiptype_layout_formid_dialog_callback_beforeSubmit_action.release();
    _jspx_tagPool_t_authFilter_nobody.release();
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
      out.write("<title>uitags</title>\n");
      if (_jspx_meth_t_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<SCRIPT type=\"text/javascript\">\n");
      out.write("        function parse(data){\n");
      out.write("            \tvar parsed = [];\n");
      out.write("\t\t        \t$.each(data.rows,function(index,row){\n");
      out.write("\t\t        \t\tparsed.push({data:row,result:row,value:row.id});\n");
      out.write("\t\t        \t});\n");
      out.write("        \t\t\t\treturn parsed;\n");
      out.write("        }\n");
      out.write("        /**\n");
      out.write("         * 选择后回调 \n");
      out.write("         * \n");
      out.write("         * @param {Object} data\n");
      out.write("         */\n");
      out.write("        function callBack(data) {\n");
      out.write("        \t$(\"#user\").val(data.userName);\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("         /**\n");
      out.write("          * 每一个选择项显示的信息\n");
      out.write("          * \n");
      out.write("          * @param {Object} data\n");
      out.write("          */\n");
      out.write("        function formatItem(data) {\n");
      out.write("        \treturn data.userName + \"-->\" + \" \" + data.realName;\n");
      out.write("        }\n");
      out.write("          \n");
      out.write("          function setContentc(){\n");
      out.write("        \t alert(\"表单提交前想干点啥呢\");\n");
      out.write("          }\n");
      out.write("          function test(){\n");
      out.write("        \t  alert(\"表单提交后要干点啥呢\");\n");
      out.write("          }\n");
      out.write("\n");
      out.write("  </SCRIPT>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      if (_jspx_meth_t_formvalid_0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_t_formvalid_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      if (_jspx_meth_t_authFilter_0(_jspx_page_context))
        return;
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
    _jspx_th_t_base_0.setType("jquery,easyui,tools,autocomplete,DatePicker");
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
    org.jeecgframework.tag.core.easyui.FormValidationTag _jspx_th_t_formvalid_0 = (org.jeecgframework.tag.core.easyui.FormValidationTag) _jspx_tagPool_t_formvalid_layout_formid_dialog_callback_beforeSubmit_action.get(org.jeecgframework.tag.core.easyui.FormValidationTag.class);
    _jspx_th_t_formvalid_0.setPageContext(_jspx_page_context);
    _jspx_th_t_formvalid_0.setParent(null);
    _jspx_th_t_formvalid_0.setFormid("formobj");
    _jspx_th_t_formvalid_0.setDialog(false);
    _jspx_th_t_formvalid_0.setLayout("div");
    _jspx_th_t_formvalid_0.setCallback("test");
    _jspx_th_t_formvalid_0.setAction("jeecgFormvalidController.do?testsubmit=2");
    _jspx_th_t_formvalid_0.setBeforeSubmit("setContentc");
    int _jspx_eval_t_formvalid_0 = _jspx_th_t_formvalid_0.doStartTag();
    if (_jspx_eval_t_formvalid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t <fieldset class=\"step\" style=\"padding-bottom: 20px;\">\n");
        out.write("\t <legend>tiptype=\"1\"</legend>\n");
        out.write("\t\t<div class=\"form\">\n");
        out.write("\t\t\t<label class=\"Validform_label\"> 非空验证： </label> \n");
        out.write("\t\t\t<input type=\"text\" name=\"demotitle\" id=\"demotitle\" datatype=\"*\" errormsg=\"该字段不为空\"> \n");
        out.write("\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t</div>\n");
        out.write("\t\t\n");
        out.write("\t\t<div class=\"form\">\n");
        out.write("\t\t\t<label class=\"Validform_label\"> URL验证： </label> \n");
        out.write("\t\t\t<input type=\"text\" name=\"demourl\" id=\"demourl\" datatype=\"url\" errormsg=\"必须是URL\"> \n");
        out.write("\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t</div>\n");
        out.write("\t\t\n");
        out.write("\t\t<div class=\"form\">\n");
        out.write("\t\t\t<label class=\"Validform_label\"> 至少选择2项： </label> \n");
        out.write("\t\t\t<input name=\"shoppingsite1\" class=\"rt2\" id=\"shoppingsite21\" type=\"checkbox\" value=\"1\" datatype=\"need2\" nullmsg=\"请选择您的爱好！\" />阅读 \n");
        out.write("\t\t\t<input name=\"shoppingsite1\" class=\"rt2\" id=\"shoppingsite22\" type=\"checkbox\" value=\"2\" /> 音乐\n");
        out.write("\t\t    <input name=\"shoppingsite1\" class=\"rt2\" id=\"shoppingsite23\" type=\"checkbox\" value=\"3\" /> 运动 \n");
        out.write("\t\t    <span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t</div>\n");
        out.write("\t\t  \n");
        out.write("\t\t\n");
        out.write("\t\t<div class=\"form\" id=\"mail_id\">\n");
        out.write("\t\t\t<label class=\"Validform_label\"> 邮箱： </label> \n");
        out.write("\t\t\t<input type=\"text\" name=\"demoorder\" id=\"demoorder\" datatype=\"e\" errormsg=\"邮箱非法\">\n");
        out.write("\t\t    <span class=\"Validform_checktip\"></span>\n");
        out.write("\t    </div>\n");
        out.write("\t    \n");
        out.write("\t ");
        if (_jspx_meth_t_hasPermission_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t<div class=\"form\" id=\"money_id\">\n");
        out.write("\t\t\t<label class=\"Validform_label\"> 金额： </label> \n");
        out.write("\t\t\t<input type=\"text\" name=\"money\" id=\"money\" datatype=\"d\" errormsg=\"金额非法\"> \n");
        out.write("\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t</div>\n");
        out.write("\t\t\n");
        out.write("\t\t<div class=\"form\">\n");
        out.write("\t\t\t<label class=\"Validform_label\"> 日期： </label> \n");
        out.write("\t\t\t<input type=\"text\" name=\"date\" id=\"date\" class=\"easyui-datebox\"> \n");
        out.write("\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t</div>\n");
        out.write("\t\t\n");
        out.write("\t\t<div class=\"form\">\n");
        out.write("\t\t\t<label class=\"Validform_label\"> 时间： </label> \n");
        out.write("\t\t\t<input type=\"text\" name=\"time\" id=\"time\" class=\"easyui-datetimebox\"> \n");
        out.write("\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t</div> \n");
        out.write("\t\t<div class=\"form\">\n");
        out.write("\t\t\t<label class=\"Validform_label\"> 时间： </label> \n");
        out.write("\t\t\t<input id=\"d12\" type=\"text\" datatype=\"*\" errormsg=\"该字段不为空\"/>\n");
        out.write("\t\t\t<img onclick=\"WdatePicker({el:'d12'})\" src=\"plug-in/easyui/themes/black/images/datebox_arrow.png\" style=\"opacity: 0.6;height:17px;width:17px;\" align=\"absmiddle\">\n");
        out.write("\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t</div> \n");
        out.write("\t\t<div style=\"text-align:center\"><input class=\"btn\" type=\"submit\" value=\"提交\" style=\"height:30px;width:100px !important;border-radius:5px\"></div>\n");
        out.write("\t\t\n");
        out.write("\t</fieldset>\n");
        int evalDoAfterBody = _jspx_th_t_formvalid_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_formvalid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_formvalid_layout_formid_dialog_callback_beforeSubmit_action.reuse(_jspx_th_t_formvalid_0);
      return true;
    }
    _jspx_tagPool_t_formvalid_layout_formid_dialog_callback_beforeSubmit_action.reuse(_jspx_th_t_formvalid_0);
    return false;
  }

  private boolean _jspx_meth_t_hasPermission_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:hasPermission
    org.jeecgframework.tag.core.easyui.HasPermissionTag _jspx_th_t_hasPermission_0 = (org.jeecgframework.tag.core.easyui.HasPermissionTag) _jspx_tagPool_t_hasPermission_code.get(org.jeecgframework.tag.core.easyui.HasPermissionTag.class);
    _jspx_th_t_hasPermission_0.setPageContext(_jspx_page_context);
    _jspx_th_t_hasPermission_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_hasPermission_0.setCode("phone_code");
    int _jspx_eval_t_hasPermission_0 = _jspx_th_t_hasPermission_0.doStartTag();
    if (_jspx_eval_t_hasPermission_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t<div class=\"form\">\n");
        out.write("\t\t\t<label class=\"Validform_label\"> 手机号： </label>\n");
        out.write("\t   \t\t<input type=\"text\" name=\"phone\" id=\"phone\" datatype=\"m\" errormsg=\"手机号非法\"> \n");
        out.write("\t   \t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t   \t</div>\n");
        out.write("\t ");
        int evalDoAfterBody = _jspx_th_t_hasPermission_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_hasPermission_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_hasPermission_code.reuse(_jspx_th_t_hasPermission_0);
      return true;
    }
    _jspx_tagPool_t_hasPermission_code.reuse(_jspx_th_t_hasPermission_0);
    return false;
  }

  private boolean _jspx_meth_t_formvalid_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:formvalid
    org.jeecgframework.tag.core.easyui.FormValidationTag _jspx_th_t_formvalid_1 = (org.jeecgframework.tag.core.easyui.FormValidationTag) _jspx_tagPool_t_formvalid_tiptype_layout_formid_dialog_callback_beforeSubmit_action.get(org.jeecgframework.tag.core.easyui.FormValidationTag.class);
    _jspx_th_t_formvalid_1.setPageContext(_jspx_page_context);
    _jspx_th_t_formvalid_1.setParent(null);
    _jspx_th_t_formvalid_1.setFormid("formobj2");
    _jspx_th_t_formvalid_1.setTiptype("6");
    _jspx_th_t_formvalid_1.setDialog(false);
    _jspx_th_t_formvalid_1.setLayout("div");
    _jspx_th_t_formvalid_1.setCallback("test");
    _jspx_th_t_formvalid_1.setAction("jeecgFormvalidController.do?testsubmit=2");
    _jspx_th_t_formvalid_1.setBeforeSubmit("setContentc");
    int _jspx_eval_t_formvalid_1 = _jspx_th_t_formvalid_1.doStartTag();
    if (_jspx_eval_t_formvalid_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t <fieldset class=\"step\" style=\"padding-bottom: 20px;\">\n");
        out.write("\t <legend>tiptype=\"6\"</legend>\n");
        out.write("\t\t<div class=\"form\">\n");
        out.write("\t\t\t<label class=\"Validform_label\"> 非空验证： </label> \n");
        out.write("\t\t\t<input type=\"text\" name=\"demotitle2\" id=\"demotitle2\" datatype=\"*\" errormsg=\"该字段不为空\"> \n");
        out.write("\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t</div>\n");
        out.write("\t\t\n");
        out.write("\t\t<div class=\"form\">\n");
        out.write("\t\t\t<label class=\"Validform_label\"> URL验证： </label> \n");
        out.write("\t\t\t<input type=\"text\" name=\"demourl2\" id=\"demourl2\" datatype=\"url\" errormsg=\"必须是URL\"> \n");
        out.write("\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t</div>\n");
        out.write("\t\t\n");
        out.write("\t\t<div class=\"form\">\n");
        out.write("\t\t\t<label class=\"Validform_label\"> 至少选择2项： </label> \n");
        out.write("\t\t\t<input name=\"shoppingsite12\" class=\"rt2\" id=\"shoppingsite21\" type=\"checkbox\" value=\"1\" datatype=\"need2\" nullmsg=\"请选择您的爱好！\" />阅读 \n");
        out.write("\t\t\t<input name=\"shoppingsite12\" class=\"rt2\" id=\"shoppingsite22\" type=\"checkbox\" value=\"2\" /> 音乐\n");
        out.write("\t\t    <input name=\"shoppingsite12\" class=\"rt2\" id=\"shoppingsite23\" type=\"checkbox\" value=\"3\" /> 运动 \n");
        out.write("\t\t    <span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t</div>\n");
        out.write("\t\t  \n");
        out.write("\t\t\n");
        out.write("\t\t<div class=\"form\" id=\"mail_id\">\n");
        out.write("\t\t\t<label class=\"Validform_label\"> 邮箱： </label> \n");
        out.write("\t\t\t<input type=\"text\" name=\"demoorder2\" id=\"demoorder2\" datatype=\"e\" errormsg=\"邮箱非法\">\n");
        out.write("\t\t    <span class=\"Validform_checktip\"></span>\n");
        out.write("\t    </div>\n");
        out.write("\t    \n");
        out.write("\t ");
        if (_jspx_meth_t_hasPermission_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t<div class=\"form\" id=\"money_id\">\n");
        out.write("\t\t\t<label class=\"Validform_label\"> 金额： </label> \n");
        out.write("\t\t\t<input type=\"text\" name=\"money2\" id=\"money2\" datatype=\"d\" errormsg=\"金额非法\"> \n");
        out.write("\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t</div>\n");
        out.write("\t\t<div class=\"form\">\n");
        out.write("\t\t\t<label class=\"Validform_label\"> 时间： </label> \n");
        out.write("\t\t\t<input id=\"d122\" type=\"text\" datatype=\"*\" errormsg=\"该字段不为空\"/>\n");
        out.write("\t\t\t<img onclick=\"WdatePicker({el:'d122'})\" src=\"plug-in/easyui/themes/black/images/datebox_arrow.png\" style=\"opacity: 0.6;height:17px;width:17px;\" align=\"absmiddle\">\n");
        out.write("\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t</div> \n");
        out.write("\t\t<div style=\"text-align:center\"><input class=\"btn\" type=\"submit\" value=\"提交\" style=\"height:30px;width:100px !important;border-radius:5px\"></div>\n");
        out.write("\t\t\n");
        out.write("\t</fieldset>\n");
        int evalDoAfterBody = _jspx_th_t_formvalid_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_formvalid_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_formvalid_tiptype_layout_formid_dialog_callback_beforeSubmit_action.reuse(_jspx_th_t_formvalid_1);
      return true;
    }
    _jspx_tagPool_t_formvalid_tiptype_layout_formid_dialog_callback_beforeSubmit_action.reuse(_jspx_th_t_formvalid_1);
    return false;
  }

  private boolean _jspx_meth_t_hasPermission_1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:hasPermission
    org.jeecgframework.tag.core.easyui.HasPermissionTag _jspx_th_t_hasPermission_1 = (org.jeecgframework.tag.core.easyui.HasPermissionTag) _jspx_tagPool_t_hasPermission_code.get(org.jeecgframework.tag.core.easyui.HasPermissionTag.class);
    _jspx_th_t_hasPermission_1.setPageContext(_jspx_page_context);
    _jspx_th_t_hasPermission_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_1);
    _jspx_th_t_hasPermission_1.setCode("phone_code");
    int _jspx_eval_t_hasPermission_1 = _jspx_th_t_hasPermission_1.doStartTag();
    if (_jspx_eval_t_hasPermission_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t<div class=\"form\">\n");
        out.write("\t\t\t<label class=\"Validform_label\"> 手机号： </label>\n");
        out.write("\t   \t\t<input type=\"text\" name=\"phone2\" id=\"phone2\" datatype=\"m\" errormsg=\"手机号非法\"> \n");
        out.write("\t   \t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t   \t</div>\n");
        out.write("\t ");
        int evalDoAfterBody = _jspx_th_t_hasPermission_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_hasPermission_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_hasPermission_code.reuse(_jspx_th_t_hasPermission_1);
      return true;
    }
    _jspx_tagPool_t_hasPermission_code.reuse(_jspx_th_t_hasPermission_1);
    return false;
  }

  private boolean _jspx_meth_t_authFilter_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:authFilter
    org.jeecgframework.tag.core.easyui.AuthFilterTag _jspx_th_t_authFilter_0 = (org.jeecgframework.tag.core.easyui.AuthFilterTag) _jspx_tagPool_t_authFilter_nobody.get(org.jeecgframework.tag.core.easyui.AuthFilterTag.class);
    _jspx_th_t_authFilter_0.setPageContext(_jspx_page_context);
    _jspx_th_t_authFilter_0.setParent(null);
    int _jspx_eval_t_authFilter_0 = _jspx_th_t_authFilter_0.doStartTag();
    if (_jspx_th_t_authFilter_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_authFilter_nobody.reuse(_jspx_th_t_authFilter_0);
      return true;
    }
    _jspx_tagPool_t_authFilter_nobody.reuse(_jspx_th_t_authFilter_0);
    return false;
  }
}
