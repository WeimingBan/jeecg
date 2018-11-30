package org.apache.jsp.webpage.com.jeecg.demo.jformOrderMain2.jformOrderCustomer2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_formvalid_usePlugin_tiptype_layout_formid_dialog_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
    _jspx_tagPool_t_formvalid_usePlugin_tiptype_layout_formid_dialog_action.release();
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.release();
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
      out.write("<html lang=\"zh-CN\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <title>订单客户信息</title>\n");
      out.write("  <meta name=\"description\" content=\"\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  ");
      if (_jspx_meth_t_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("   <script type=\"text/javascript\">\n");
      out.write("  //编写自定义JS代码\n");
      out.write("  </script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write(" <body>\n");
      out.write("\t");
      if (_jspx_meth_t_formvalid_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("   $(function(){\n");
      out.write("    //查看模式情况下,删除和上传附件功能禁止使用\n");
      out.write("\tif(location.href.indexOf(\"load=detail\")!=-1){\n");
      out.write("\t\t$(\".jeecgDetail\").hide();\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tif(location.href.indexOf(\"mode=read\")!=-1){\n");
      out.write("\t\t//查看模式控件禁用\n");
      out.write("\t\t$(\"#formobj\").find(\":input\").attr(\"disabled\",\"disabled\");\n");
      out.write("\t}\n");
      out.write("\tif(location.href.indexOf(\"mode=onbutton\")!=-1){\n");
      out.write("\t\t//其他模式显示提交按钮\n");
      out.write("\t\t$(\"#sub_tr\").show();\n");
      out.write("\t}\n");
      out.write("   });\n");
      out.write("\n");
      out.write("  var neibuClickFlag = false;\n");
      out.write("  function neibuClick() {\n");
      out.write("\t  neibuClickFlag = true; \n");
      out.write("\t  $('#btn_sub').trigger('click');\n");
      out.write("  }\n");
      out.write("\n");
      out.write("</script>\n");
      out.write(" </body>\n");
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
    _jspx_th_t_base_0.setType("jquery,aceform,DatePicker,validform,ueditor");
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
    _jspx_th_t_formvalid_0.setAction("jformOrderCustomer2Controller.do?doUpdate");
    _jspx_th_t_formvalid_0.setTiptype("1");
    int _jspx_eval_t_formvalid_0 = _jspx_th_t_formvalid_0.doStartTag();
    if (_jspx_eval_t_formvalid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t<input type=\"hidden\" id=\"btn_sub\" class=\"btn_sub\"/>\n");
        out.write("\t\t\t<input type=\"hidden\" name=\"id\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jformOrderCustomer2Page.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("' >\n");
        out.write("\t\t\t<input type=\"hidden\" name=\"fkId\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jformOrderCustomer2Page.fkId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("'/>\n");
        out.write("\t\t\t<div class=\"tab-wrapper\">\n");
        out.write("\t\t\t    <!-- tab -->\n");
        out.write("\t\t\t    <ul class=\"nav nav-tabs\">\n");
        out.write("\t\t\t      <li role=\"presentation\" class=\"active\"><a href=\"javascript:void(0);\">订单客户信息</a></li>\n");
        out.write("\t\t\t    </ul>\n");
        out.write("\t\t\t    <!-- tab内容 -->\n");
        out.write("\t\t\t    <div class=\"con-wrapper\" id=\"con-wrapper1\" style=\"display: block;\">\n");
        out.write("\t\t\t      <div class=\"row form-wrapper\">\n");
        out.write("\t\t\t\t\t\t\t<div class=\"row show-grid\">\n");
        out.write("\t\t\t          <div class=\"col-xs-3 text-center\">\n");
        out.write("\t\t\t          \t<b>客户名：</b>\n");
        out.write("\t\t\t          </div>\n");
        out.write("\t\t\t          \t\t<div class=\"col-xs-3\">\n");
        out.write("\t\t\t\t\t\t\t\t<input id=\"name\" name=\"name\" maxlength=\"32\" type=\"text\" class=\"form-control\" ignore=\"ignore\"  value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jformOrderCustomer2Page.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("' />\n");
        out.write("\t\t\t\t\t\t<span class=\"Validform_checktip\" style=\"float:left;height:0px;\"></span>\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\" style=\"display: none\">客户名</label>\n");
        out.write("\t\t\t          </div>\n");
        out.write("\t\t\t\t\t\t</div>\n");
        out.write("\t\t\t          \n");
        out.write("\t\t\t        \n");
        out.write("\t\t\t\t\t\t\t<div class=\"row show-grid\">\n");
        out.write("\t\t\t          <div class=\"col-xs-3 text-center\">\n");
        out.write("\t\t\t          \t<b>单价：</b>\n");
        out.write("\t\t\t          </div>\n");
        out.write("\t\t\t          \t\t<div class=\"col-xs-3\">\n");
        out.write("\t\t\t\t\t\t\t\t<input id=\"money\" name=\"money\" maxlength=\"10\" type=\"text\" class=\"form-control\" datatype=\"/^(-?\\d+)(\\.\\d+)?$/\"  ignore=\"ignore\"  value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jformOrderCustomer2Page.money}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("' />\n");
        out.write("\t\t\t\t\t\t<span class=\"Validform_checktip\" style=\"float:left;height:0px;\"></span>\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\" style=\"display: none\">单价</label>\n");
        out.write("\t\t\t          </div>\n");
        out.write("\t\t\t\t\t\t</div>\n");
        out.write("\t\t\t          \n");
        out.write("\t\t\t        \n");
        out.write("\t\t\t\t\t\t\t<div class=\"row show-grid\">\n");
        out.write("\t\t\t          <div class=\"col-xs-3 text-center\">\n");
        out.write("\t\t\t          \t<b>性别：</b>\n");
        out.write("\t\t\t          </div>\n");
        out.write("\t\t\t          \t\t<div class=\"col-xs-3\">\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_t_dictSelect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
          return true;
        out.write("     \n");
        out.write("\t\t\t\t\t\t<span class=\"Validform_checktip\" style=\"float:left;height:0px;\"></span>\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\" style=\"display: none\">性别</label>\n");
        out.write("\t\t\t          </div>\n");
        out.write("\t\t\t\t\t\t</div>\n");
        out.write("\t\t\t          \n");
        out.write("\t\t\t        \n");
        out.write("\t\t\t\t\t\t\t<div class=\"row show-grid\">\n");
        out.write("\t\t\t          <div class=\"col-xs-3 text-center\">\n");
        out.write("\t\t\t          \t<b>电话：</b>\n");
        out.write("\t\t\t          </div>\n");
        out.write("\t\t\t          \t\t<div class=\"col-xs-3\">\n");
        out.write("\t\t\t\t\t\t\t\t<input id=\"telphone\" name=\"telphone\" maxlength=\"32\" type=\"text\" class=\"form-control\" ignore=\"ignore\"  value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jformOrderCustomer2Page.telphone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("' />\n");
        out.write("\t\t\t\t\t\t<span class=\"Validform_checktip\" style=\"float:left;height:0px;\"></span>\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\" style=\"display: none\">电话</label>\n");
        out.write("\t\t\t          </div>\n");
        out.write("\t\t\t\t\t\t</div>\n");
        out.write("\t\t\t          \n");
        out.write("\t\t\t        \n");
        out.write("\t\t\t          <div class=\"row\" id = \"sub_tr\" style=\"display: none;\">\n");
        out.write("\t\t\t\t        <div class=\"col-xs-12 layout-header\">\n");
        out.write("\t\t\t\t          <div class=\"col-xs-6\"></div>\n");
        out.write("\t\t\t\t          <div class=\"col-xs-6\"><button type=\"button\" onclick=\"neibuClick();\" class=\"btn btn-default\">提交</button></div>\n");
        out.write("\t\t\t\t        </div>\n");
        out.write("\t\t\t\t      </div>\n");
        out.write("\t\t\t     </div>\n");
        out.write("\t\t\t   </div>\n");
        out.write("\t\t\t   \n");
        out.write("\t\t\t   <div class=\"con-wrapper\" id=\"con-wrapper2\" style=\"display: block;\"></div>\n");
        out.write("\t\t\t </div>\n");
        out.write("  ");
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

  private boolean _jspx_meth_t_dictSelect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_0 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_0.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_dictSelect_0.setField("sex");
    _jspx_th_t_dictSelect_0.setType("list");
    _jspx_th_t_dictSelect_0.setExtendJson("{class:'form-control',style:'width:164px'}");
    _jspx_th_t_dictSelect_0.setTypeGroupCode("sex");
    _jspx_th_t_dictSelect_0.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jformOrderCustomer2Page.sex}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_t_dictSelect_0.setHasLabel(false);
    _jspx_th_t_dictSelect_0.setTitle("性别");
    int _jspx_eval_t_dictSelect_0 = _jspx_th_t_dictSelect_0.doStartTag();
    if (_jspx_th_t_dictSelect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_0);
      return true;
    }
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_0);
    return false;
  }
}
