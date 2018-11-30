package org.apache.jsp.webpage.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.jeecgframework.core.util.SysThemesUtil;
import org.jeecgframework.core.enums.SysThemesEnum;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/context/mytags.jsp");
    _jspx_dependants.add("/WEB-INF/tld/easyui.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_mutiLang_langKey_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dictSelect_typeGroupCode_id_hasLabel_field_extendJson_defaultVal_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_mutiLang_langKey_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dictSelect_typeGroupCode_id_hasLabel_field_extendJson_defaultVal_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_mutiLang_langKey_nobody.release();
    _jspx_tagPool_t_dictSelect_typeGroupCode_id_hasLabel_field_extendJson_defaultVal_nobody.release();
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
      out.write('\n');

  session.setAttribute("lang","zh-cn");
  SysThemesEnum sysTheme = SysThemesUtil.getSysTheme(request);
  String lhgdialogTheme = SysThemesUtil.getLhgdialogTheme(sysTheme);

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("  <meta charset=\"utf-8\" />\n");
      out.write("  <title>");
      if (_jspx_meth_t_mutiLang_0(_jspx_page_context))
        return;
      out.write("</title>\n");
      out.write("   <link rel=\"shortcut icon\" href=\"images/favicon.ico\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\" />\n");
      out.write("  <!-- bootstrap & fontawesome -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"plug-in/ace/css/bootstrap.css\" />\n");
      out.write("  <link rel=\"stylesheet\" href=\"plug-in/ace/css/font-awesome.css\" />\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"plug-in/accordion/css/accordion.css\">\n");
      out.write("  <!-- text fonts -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"plug-in/ace/css/ace-fonts.css\" />\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"plug-in/ace/css/jquery-ui.css\" />\n");
      out.write("  <!-- ace styles -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"plug-in/ace/css/ace.css\" class=\"ace-main-stylesheet\" id=\"main-ace-style\" />\n");
      out.write("  <!--[if lte IE 9]>\n");
      out.write("  <link rel=\"stylesheet\" href=\"plug-in/ace/css/ace-part2.css\" class=\"ace-main-stylesheet\" />\n");
      out.write("  <![endif]-->\n");
      out.write("\n");
      out.write("  <!--[if lte IE 9]>\n");
      out.write("  <link rel=\"stylesheet\" href=\"plug-in/ace/css/ace-ie.css\" />\n");
      out.write("  <![endif]-->\n");
      out.write("  <!-- ace settings handler -->\n");
      out.write("  <script src=\"plug-in/ace/js/ace-extra.js\"></script>\n");
      out.write("\n");
      out.write("  <!--[if lte IE 8]>\n");
      out.write("  <script src=\"plug-in/ace/js/html5shiv.js\"></script>\n");
      out.write("  <script src=\"plug-in/ace/js/respond.js\"></script>\n");
      out.write("  <![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\"login-layout light-login\">\n");
      out.write("<div class=\"main-container\">\n");
      out.write("  <div class=\"main-content\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-sm-10 col-sm-offset-1\">\n");
      out.write("        <div class=\"login-container\">\n");
      out.write("          <div class=\"center\">\n");
      out.write("            <h1 id=\"id-text2\" class=\"grey\">\n");
      out.write("              <i class=\"ace-icon fa fa-leaf green\"></i>\n");
      out.write("               JEECG 演示系统\n");
      out.write("            </h1>\n");
      out.write("            <h4 class=\"blue\" id=\"id-company-text\">www.jeecg.org</h4>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"space-6\"></div>\n");
      out.write("          <div class=\"position-relative\">\n");
      out.write("            <div id=\"login-box\" class=\"login-box visible widget-box no-border\">\n");
      out.write("              <div class=\"widget-body\">\n");
      out.write("                <form id=\"loinForm\" class=\"form-horizontal\"    method=\"post\">\n");
      out.write("                <!-- 单点登录参数 -->\n");
      out.write("                <input type=\"hidden\" id=\"ReturnURL\"  name=\"ReturnURL\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ReturnURL }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                <div class=\"widget-main\">\n");
      out.write("                 <div class=\"alert alert-warning alert-dismissible\" role=\"alert\" id=\"errMsgContiner\">\n");
      out.write("\t\t\t\t  <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("\t\t\t\t  <div id=\"showErrMsg\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                  <h4 class=\"header blue lighter bigger\">\n");
      out.write("                    <i class=\"ace-icon fa fa-coffee green\"></i>\n");
      out.write("                \t    用户登录\n");
      out.write("                  </h4>\n");
      out.write("                  <div class=\"space-6\"></div>\n");
      out.write("                      <label class=\"block clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\"  name=\"userName\" iscookie=\"true\" class=\"form-control\" placeholder=\"请输入用户名\"  id=\"userName\" value=\"admin\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-user\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("                      </label>\n");
      out.write("                      <label class=\"block clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"请输入密码\" id=\"password\" value=\"123456\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-lock\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("                      </label>\n");
      out.write("                      <label class=\"block clearfix\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                          <input type=\"text\" style=\"width:150px\" name=\"randCode\" class=\"form-control\" placeholder=\"请输入验证码\"  id=\"randCode\"/>\n");
      out.write("                          <span class=\"input-group-addon\" style=\"padding: 0px;\"><img id=\"randCodeImage\" src=\"randCodeImage\"  /></span>\n");
      out.write("                        </div>\n");
      out.write("                      </label>\n");
      out.write("                      <div class=\"space\"></div>\n");
      out.write("                      <div class=\"clearfix\">\n");
      out.write("                        <label class=\"inline\">\n");
      out.write("                          <input type=\"checkbox\" class=\"ace\" id=\"on_off\"  name=\"remember\" value=\"yes\"/>\n");
      out.write("                          <span class=\"lbl\">记住用户名</span>\n");
      out.write("                        </label>\n");
      out.write("                        <span> | <a href=\"http://demo.jeecg.org/mLoginController.do?login&from=singlemessage&isappinstalled=0\"><i class=\"ace-icon fa fa-location-arrow\"></i><font color='#428bca'>移动OA</font></a></span>\n");
      out.write("                         <span> | <a href=\"http://yun.jeecg.org\" target=\"_blank\"><i class=\"ace-icon fa fa-cube\"></i><font color='#428bca'>插件中心</font></a></span>\n");
      out.write("                        <button type=\"button\" id=\"but_login\"  onclick=\"checkUser()\" class=\"width-35 pull-right btn btn-sm btn-primary\">\n");
      out.write("                          <i class=\"ace-icon fa fa-key\"></i>\n");
      out.write("                          <span class=\"bigger-110\" >登录</span>\n");
      out.write("                        </button>\n");
      out.write("                        <a href=\"loginController.do?goResetPwdMail\" class=\"btn btn-link\">忘记密码 ?</a>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"space-4\"></div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"toolbar clearfix\">\n");
      out.write("                  <div style=\"float: right\">\n");
      out.write("                    <a href=\"#\"  class=\"forgot-password-link\">\n");
      out.write("                    \t  语言\n");
      out.write("                      <i class=\"ace-icon fa fa-arrow-right\"></i>\n");
      out.write("                      ");
      if (_jspx_meth_t_dictSelect_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                </form>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"center\"><h4 class=\"blue\" id=\"id-company-text\">&copy; JEECG版权所有 v_3.8</h4></div>\n");
      out.write("            <div class=\"navbar-fixed-top align-right\">\n");
      out.write("              <br />\n");
      out.write("              &nbsp;\n");
      out.write("              <a id=\"btn-login-dark\" class=\"blue\" href=\"#\" onclick=\"darkStyle()\">Dark</a>\n");
      out.write("              &nbsp;\n");
      out.write("              <span class=\"blue\">/</span>\n");
      out.write("              &nbsp;\n");
      out.write("              <a id=\"btn-login-blur\" class=\"blue\" href=\"#\" onclick=\"blurStyle()\">Blur</a>\n");
      out.write("              &nbsp;\n");
      out.write("              <span class=\"blue\">/</span>\n");
      out.write("              &nbsp;\n");
      out.write("              <a id=\"btn-login-light\" class=\"blue\" href=\"#\" onclick=\"lightStyle()\">Light</a>\n");
      out.write("              &nbsp; &nbsp; &nbsp;\n");
      out.write("            </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/jquery/jquery-1.8.3.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/jquery/jquery.cookie.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/mutiLang/en.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/mutiLang/zh-cn.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/login/js/jquery.tipsy.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/login/js/iphone.check.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"webpage/login/login-ace.js\"></script>\n");
      out.print(lhgdialogTheme );
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(function(){\n");
      out.write("\t\toptErrMsg();\n");
      out.write("\t});\n");
      out.write("\t$(\"#errMsgContiner\").hide();\n");
      out.write("\n");
      out.write("   //输入验证码，回车登录\n");
      out.write("  $(document).bind('keyup', function(event) {\n");
      out.write("\t　　if (event.keyCode == \"13\") {\n");
      out.write("\t　　　　$('#but_login').click();\n");
      out.write("\t　　}\n");
      out.write("  });\n");
      out.write("\n");
      out.write("  //验证用户信息\n");
      out.write("  function checkUser(){\n");
      out.write("    if(!validForm()){\n");
      out.write("      return false;\n");
      out.write("    }\n");
      out.write("    newLogin();\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  /**\n");
      out.write("   * 刷新验证码\n");
      out.write("   */\n");
      out.write("  $('#randCodeImage').click(function(){\n");
      out.write("\t    reloadRandCodeImage();\n");
      out.write("  });\n");
      out.write("\t\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("var _hmt = _hmt || [];\n");
      out.write("(function() {\n");
      out.write("  var hm = document.createElement(\"script\");\n");
      out.write("  hm.src = \"https://hm.baidu.com/hm.js?098e6e84ab585bf0c2e6853604192b8b\";\n");
      out.write("  var s = document.getElementsByTagName(\"script\")[0]; \n");
      out.write("  s.parentNode.insertBefore(hm, s);\n");
      out.write("})();\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_t_mutiLang_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_0 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_0.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_0.setParent(null);
    _jspx_th_t_mutiLang_0.setLangKey("jeect.platform");
    int _jspx_eval_t_mutiLang_0 = _jspx_th_t_mutiLang_0.doStartTag();
    if (_jspx_th_t_mutiLang_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_0);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_0);
    return false;
  }

  private boolean _jspx_meth_t_dictSelect_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_0 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_typeGroupCode_id_hasLabel_field_extendJson_defaultVal_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_0.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_0.setParent(null);
    _jspx_th_t_dictSelect_0.setId("langCode");
    _jspx_th_t_dictSelect_0.setField("langCode");
    _jspx_th_t_dictSelect_0.setTypeGroupCode("lang");
    _jspx_th_t_dictSelect_0.setHasLabel(false);
    _jspx_th_t_dictSelect_0.setExtendJson("{style:'padding:2px; width:80px;'}");
    _jspx_th_t_dictSelect_0.setDefaultVal("zh-cn");
    int _jspx_eval_t_dictSelect_0 = _jspx_th_t_dictSelect_0.doStartTag();
    if (_jspx_th_t_dictSelect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_typeGroupCode_id_hasLabel_field_extendJson_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_0);
      return true;
    }
    _jspx_tagPool_t_dictSelect_typeGroupCode_id_hasLabel_field_extendJson_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_0);
    return false;
  }
}
