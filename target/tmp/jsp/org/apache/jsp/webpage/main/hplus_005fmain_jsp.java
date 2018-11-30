package org.apache.jsp.webpage.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hplus_005fmain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/context/mytags.jsp");
    _jspx_dependants.add("/context/layui.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_mutiLang_langKey_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_menu_style_menuFun_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_base_type_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_mutiLang_langKey_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_menu_style_menuFun_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_mutiLang_langKey_nobody.release();
    _jspx_tagPool_t_menu_style_menuFun_nobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\n");
      out.write("\n");
      out.write("    <title>");
      if (_jspx_meth_t_mutiLang_0(_jspx_page_context))
        return;
      out.write("</title>\n");
      out.write("\n");
      out.write("    <meta name=\"keywords\" content=\"JEECG 企业级快速开发平台\">\n");
      out.write("    <meta name=\"description\" content=\"JEECG 企业级快速开发平台，她采用强大代码生成，在线开发能力\">\n");
      out.write("\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/favicon.ico\">\n");
      out.write("    <link href=\"plug-in/hplus/css/bootstrap.min.css?v=3.3.6\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"plug-in/hplus/css/font-awesome.min.css?v=4.4.0\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"plug-in/ace/assets/css/font-awesome.min.css\" />\n");
      out.write("    <!--[if IE 7]>\n");
      out.write("    <link rel=\"stylesheet\" href=\"plug-in/ace/assets/css/font-awesome-ie7.min.css\" />\n");
      out.write("    <![endif]-->\n");
      out.write("    <!-- Sweet Alert -->\n");
      out.write("    <link href=\"plug-in/hplus/css/plugins/sweetalert/sweetalert.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"plug-in/hplus/css/animate.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"plug-in/hplus/css/style.css?v=4.1.0\" rel=\"stylesheet\">\n");
      out.write("    <!--右键菜单-->\n");
      out.write("    <link href=\"plug-in/hplus/smartMenu.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"fixed-sidebar full-height-layout gray-bg\" style=\"overflow:hidden\">\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("    <!--左侧导航开始-->\n");
      out.write("    <nav class=\"navbar-default navbar-static-side\" role=\"navigation\" style=\"z-index: 1991;\">\n");
      out.write("        <div class=\"nav-close\"><i class=\"fa fa-times-circle\"></i>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidebar-collapse\">\n");
      out.write("            <ul class=\"nav\" id=\"side-menu\">\n");
      out.write("                <li class=\"nav-header\" style=\"padding:0;\">\n");
      out.write("                    <div class=\"dropdown profile-element\">\n");
      out.write("                                <span><img alt=\"image\" width=\"180\" height=\"61\" src=\"plug-in/login/images/jeecg-aceplus.png\" /></span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"logo-element\">JEECG\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_t_menu_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <!--左侧导航结束-->\n");
      out.write("    <!--右侧部分开始-->\n");
      out.write("    <div id=\"page-wrapper\" class=\"gray-bg dashbard-1\">\n");
      out.write("        <div class=\"row border-bottom\">\n");
      out.write("            <nav class=\"navbar navbar-static-top\" role=\"navigation\" style=\"margin-bottom: 0\">\n");
      out.write("                <div class=\"navbar-header\" style=\"height: 60px;\"><a class=\"navbar-minimalize minimalize-styl-2 btn btn-primary \" href=\"#\"><i class=\"fa fa-bars\"></i> </a>\n");
      out.write("                    <form role=\"search\" class=\"navbar-form-custom\" method=\"post\" action=\"search_results.html\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" placeholder=\"欢迎使用Jeecg快速开发平台 …\" class=\"form-control\" name=\"top-search\" id=\"top-search\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <ul class=\"nav navbar-top-links navbar-right\">\n");
      out.write("                    <li class=\"dropdown\" onfocus=\"bindFrameClick()\">\n");
      out.write("                    \t<a class=\"dropdown-toggle count-info\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                                <span ><strong class=\"font-bold\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong></span>\n");
      out.write("                                <span >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${roleName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<b class=\"caret\"></b></span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-alerts\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"javascript:add('");
      if (_jspx_meth_t_mutiLang_1(_jspx_page_context))
        return;
      out.write("','userController.do?changepassword','',550,200)\">\n");
      out.write("                                    ");
      if (_jspx_meth_t_mutiLang_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"javascript:openwindow('");
      if (_jspx_meth_t_mutiLang_3(_jspx_page_context))
        return;
      out.write("','userController.do?userinfo')\">");
      if (_jspx_meth_t_mutiLang_4(_jspx_page_context))
        return;
      out.write("</a></li>\n");
      out.write("                           ");
      out.write("\n");
      out.write("                            <li><a href=\"javascript:add('");
      if (_jspx_meth_t_mutiLang_5(_jspx_page_context))
        return;
      out.write("','userController.do?changestyle','',550,270)\">");
      if (_jspx_meth_t_mutiLang_6(_jspx_page_context))
        return;
      out.write("</a></li>\n");
      out.write("                            <li><a href=\"javascript:clearLocalstorage()\">");
      if (_jspx_meth_t_mutiLang_7(_jspx_page_context))
        return;
      out.write("</a></li>\n");
      out.write("                            <li><a href=\"javascript:toSwagger()\">Swagger接口</a></li>\n");
      out.write("                           ");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     \n");
      out.write("                    <li class=\"dropdown hidden-xs\">\n");
      out.write("                        <a class=\"right-sidebar-toggle\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"fa fa-tasks\"></i> 通知\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                      <li class=\"dropdown\">\n");
      out.write("                     <a href=\"javascript:logout()\" class=\"roll-nav roll-right J_tabExit\"><i class=\"fa fa fa-sign-out\"></i> 退出</a>\n");
      out.write("                     </li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row content-tabs\">\n");
      out.write("            <button class=\"roll-nav roll-left J_tabLeft\"><i class=\"fa fa-backward\"></i>\n");
      out.write("            </button>\n");
      out.write("            <nav class=\"page-tabs J_menuTabs\">\n");
      out.write("                <div class=\"page-tabs-content\">\n");
      out.write("                    <a href=\"javascript:;\" class=\"active J_menuTab\" data-id=\"loginController.do?hplushome\">首页</a>\n");
      out.write("                </div>\n");
      out.write("            <button class=\"roll-nav roll-right J_tabRight\"><i class=\"fa fa-forward\"></i>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"btn-group roll-nav roll-right\">\n");
      out.write("                <button class=\"dropdown J_tabClose\" data-toggle=\"dropdown\">关闭操作<span class=\"caret\"></span>\n");
      out.write("\n");
      out.write("                </button>\n");
      out.write("                <ul role=\"menu\" class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                    <li class=\"J_tabShowActive\"><a>定位当前选项卡</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"divider\"></li>\n");
      out.write("                    <li class=\"J_tabCloseAll\"><a>关闭全部选项卡</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"J_tabCloseOther\"><a>关闭其他选项卡</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <style type=\"text/css\">  \n");
      out.write("\t\t<!--  \n");
      out.write("\t\t.proccess{display:none;background-color:#f2f2f2;border:0px solid;border-color:#009900;height:100%;line-height:600px;width:100%;text-align:center;margin:100;position:absolute;top:0;left:0;}  \n");
      out.write("\t\t.proccess b{vertical-align:middle;background:url(plug-in/layer/skin/default/loading-0.gif) no-repeat 0 center;padding-left:55px;display:inline-block;}  \n");
      out.write("\t\t-->  \n");
      out.write("\t\t</style> \n");
      out.write("        <div class=\"row J_mainContent\" id=\"content-main\" style=\"margin-left:-13px;\">\n");
      out.write("            <div class=\"proccess\" id=\"panelloadingDiv\"><b>&nbsp;</b></div> \n");
      out.write("            <iframe class=\"J_iframe\" name=\"iframe0\" width=\"100%\" height=\"100%\" src=\"loginController.do?hplushome\" frameborder=\"0\" data-id=\"loginController.do?hplushome\" seamless></iframe>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\" style=\"border-top:none;\">\n");
      out.write("            <div class=\"pull-right\">&copy; ");
      if (_jspx_meth_t_mutiLang_8(_jspx_page_context))
        return;
      out.write(" <a href=\"http://www.jeecg.org/\" target=\"_blank\">jeecg</a>\n");
      out.write("            </div>\n");
      out.write("        </div>        \n");
      out.write("    </div>\n");
      out.write("    <!--右侧部分结束-->\n");
      out.write("    <!--右侧边栏开始-->\n");
      out.write("    <div id=\"right-sidebar\">\n");
      out.write("        <div class=\"sidebar-container\">\n");
      out.write("\n");
      out.write("            <ul class=\"nav nav-tabs navs-3\">\n");
      out.write("\n");
      out.write("                <li class=\"active\">\n");
      out.write("                    <a data-toggle=\"tab\" href=\"#tab-1\">\n");
      out.write("                        <i class=\"fa fa-gear\"></i> 主题\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("               <li class=\"\"><a data-toggle=\"tab\" href=\"#tab-2\">\n");
      out.write("                   <i class=\"fa fa-comments-o\" aria-hidden=\"true\"></i>通知\n");
      out.write("                </a>\n");
      out.write("                </li>\n");
      out.write("                <li><a data-toggle=\"tab\" href=\"#tab-3\">\n");
      out.write("                    <i class=\"fa fa-info-circle\" aria-hidden=\"true\"></i>公告\n");
      out.write("                </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <div class=\"tab-content\">\n");
      out.write("                <div id=\"tab-1\" class=\"tab-pane active\">\n");
      out.write("                    <div class=\"sidebar-title\">\n");
      out.write("                        <h3> <i class=\"fa fa-comments-o\"></i> 主题设置</h3>\n");
      out.write("                        <small><i class=\"fa fa-tim\"></i> 你可以从这里选择和预览主题的布局和样式，这些设置会被保存在本地，下次打开的时候会直接应用这些设置。</small>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"skin-setttings\">\n");
      out.write("                        <div class=\"title\">主题设置</div>\n");
      out.write("                        <div class=\"setings-item\">\n");
      out.write("                            <span>收起左侧菜单</span>\n");
      out.write("                            <div class=\"switch\">\n");
      out.write("                                <div class=\"onoffswitch\">\n");
      out.write("                                    <input type=\"checkbox\" name=\"collapsemenu\" class=\"onoffswitch-checkbox\" id=\"collapsemenu\">\n");
      out.write("                                    <label class=\"onoffswitch-label\" for=\"collapsemenu\">\n");
      out.write("                                        <span class=\"onoffswitch-inner\"></span>\n");
      out.write("                                        <span class=\"onoffswitch-switch\"></span>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"setings-item\">\n");
      out.write("                            <span>固定顶部</span>\n");
      out.write("\n");
      out.write("                            <div class=\"switch\">\n");
      out.write("                                <div class=\"onoffswitch\">\n");
      out.write("                                    <input type=\"checkbox\" name=\"fixednavbar\" class=\"onoffswitch-checkbox\" id=\"fixednavbar\">\n");
      out.write("                                    <label class=\"onoffswitch-label\" for=\"fixednavbar\">\n");
      out.write("                                        <span class=\"onoffswitch-inner\"></span>\n");
      out.write("                                        <span class=\"onoffswitch-switch\"></span>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"setings-item\">\n");
      out.write("                                <span>\n");
      out.write("                        \t固定宽度\n");
      out.write("                    </span>\n");
      out.write("\n");
      out.write("                            <div class=\"switch\">\n");
      out.write("                                <div class=\"onoffswitch\">\n");
      out.write("                                    <input type=\"checkbox\" name=\"boxedlayout\" class=\"onoffswitch-checkbox\" id=\"boxedlayout\">\n");
      out.write("                                    <label class=\"onoffswitch-label\" for=\"boxedlayout\">\n");
      out.write("                                        <span class=\"onoffswitch-inner\"></span>\n");
      out.write("                                        <span class=\"onoffswitch-switch\"></span>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"title\">皮肤选择</div>\n");
      out.write("                        <div class=\"setings-item default-skin nb\">\n");
      out.write("                                <span class=\"skin-name \">\n");
      out.write("                         <a href=\"#\" class=\"s-skin-0\">\n");
      out.write("                             \t默认皮肤\n");
      out.write("                         </a>\n");
      out.write("                    </span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"setings-item blue-skin nb\">\n");
      out.write("                                <span class=\"skin-name \">\n");
      out.write("                        <a href=\"#\" class=\"s-skin-1\">\n");
      out.write("                            \t蓝色主题\n");
      out.write("                        </a>\n");
      out.write("                    </span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"setings-item yellow-skin nb\">\n");
      out.write("                                <span class=\"skin-name \">\n");
      out.write("                        <a href=\"#\" class=\"s-skin-3\">\n");
      out.write("                           \t 黄色/紫色主题\n");
      out.write("                        </a>\n");
      out.write("                    </span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"tab-2\" class=\"tab-pane\">\n");
      out.write("                    <div class=\"sidebar-title\">\n");
      out.write("                        <h3> <i class=\"fa fa-comments-o\"></i> 系统消息 <small id=\"messageCount\"><i class=\"fa fa-tim\"></i> 您当前有0条未读通知</small></h3>\n");
      out.write("                    </div>\n");
      out.write("                    <ul class=\"sidebar-list\">\n");
      out.write("                        <li id=\"messageContent\">\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"javascript:goAllMessage();\" id=\"messageFooter\">\n");
      out.write("                              \t  查看全部\n");
      out.write("                                <i class=\"icon-arrow-right\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"tab-3\" class=\"tab-pane\">\n");
      out.write("                    <div class=\"sidebar-title\">\n");
      out.write("                        <h3> <i class=\"fa fa-cube\"></i> 最新公告<small id=\"noticeCount\"><i class=\"fa fa-tim\"></i> 您当前有0个公告</small></h3>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <ul class=\"sidebar-list\">\n");
      out.write("                        <li id=\"noticeContent\">\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"javascript:goAllNotice();\" id=\"noticeFooter\">\n");
      out.write("                                \t查看所有公告\n");
      out.write("                                <i class=\"icon-arrow-right\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- 全局js -->\n");
      out.write("<script src=\"plug-in/hplus/js/jquery.min.js?v=2.1.4\"></script>\n");
      out.write("<script src=\"plug-in/hplus/js/bootstrap.min.js?v=3.3.6\"></script>\n");
      out.write("<script src=\"plug-in/hplus/js/plugins/metisMenu/jquery.metisMenu.js\"></script>\n");
      out.write("<script src=\"plug-in/hplus/js/plugins/slimscroll/jquery.slimscroll.min.js\"></script>\n");
      out.write("<script src=\"plug-in/hplus/js/plugins/layer/layer.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- 自定义js -->\n");
      out.write("<script src=\"plug-in/hplus/js/hplus.js?v=4.1.0\"></script>\n");
      out.write("<!--右键菜单-->\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/hplus/jquery-smartMenu.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/hplus/contabs.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/jquery-plugs/i18n/jquery.i18n.properties.js\"></script>\n");
      if (_jspx_meth_t_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<!-- 第三方插件 -->\n");
      out.write("<script src=\"plug-in/hplus/js/plugins/pace/pace.min.js\"></script>\n");
      out.write("<!-- Sweet alert -->\n");
      out.write("<script src=\"plug-in/hplus/js/plugins/sweetalert/sweetalert.min.js\"></script>\n");
      out.write("<script src=\"plug-in/jquery-plugs/storage/jquery.storageapi.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- 弹出TAB -->\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/hplus/hplus-tab.js\"></script>\n");
      out.write("<!-- 在线聊天 -->\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"content/chat/layui/css/layui.css\">\n");
      out.write("<script src=\"content/chat/layui/layui.js\"></script>\n");
      out.write("<script src=\"plug-in/layim/config.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\t//初始化国际化配置\n");
      out.write("\tinitI18nConfig();\n");
      out.write("    function logout(){\n");
      out.write("        layer.confirm('您确定要注销吗？', {\n");
      out.write("            btn: ['确定','取消'], //按钮\n");
      out.write("            shade: false //不显示遮罩\n");
      out.write("        }, function(){\n");
      out.write("            location.href=\"loginController.do?logout\";\n");
      out.write("        }, function(){\n");
      out.write("            return;\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("    function clearLocalstorage(){\n");
      out.write("        var storage=$.localStorage;\n");
      out.write("        if(!storage)\n");
      out.write("            storage=$.cookieStorage;\n");
      out.write("        storage.removeAll();\n");
      out.write("        //bootbox.alert( \"浏览器缓存清除成功!\");\n");
      out.write("        layer.msg(\"浏览器缓存清除成功!\");\n");
      out.write("    }\n");
      out.write("    function toJeecgYun(){\n");
      out.write("    \twindow.open(\"http://yun.jeecg.org\",\"_blank\");\n");
      out.write("    }\n");
      out.write("    function toSwagger(){\n");
      out.write("    \twindow.open(\"swagger/index.html\",\"_blank\");\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    $(document).ready(function(){\n");
      out.write("\n");
      out.write("    \tloadNotice();\n");
      out.write("    \tloadSms();\n");
      out.write("\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("    function loadNotice(){\n");
      out.write("    \t //加载公告\n");
      out.write("        var url = \"noticeController.do?getNoticeList\";\n");
      out.write("        jQuery.ajax({\n");
      out.write("            url:url,\n");
      out.write("            type:\"GET\",\n");
      out.write("            dataType:\"JSON\",\n");
      out.write("            async: false,\n");
      out.write("            success:function(data){\n");
      out.write("                if(data.success){\n");
      out.write("                    var noticeList = data.attributes.noticeList;\n");
      out.write("                    var noticeCount = data.obj;\n");
      out.write("                    //加载公告条数\n");
      out.write("                    if(noticeCount>99){\n");
      out.write("                        $(\"#noticeCount\").html(\"99+\");\n");
      out.write("                    }else{\n");
      out.write("                        $(\"#noticeCount\").html(noticeCount);\n");
      out.write("                    }\n");
      out.write("                    //加载公告提示\n");
      out.write("                    var noticeTip = \"\";\n");
      out.write("                    noticeTip += \"<i class='icon-warning-sign'></i>\";\n");
      out.write("                    noticeTip += noticeCount+\" \"+data.attributes.tip;\n");
      out.write("                    $(\"#noticeTip\").html(noticeTip);\n");
      out.write("\n");
      out.write("                    //加载公告条目\n");
      out.write("                    var noticeContent = \"\";\n");
      out.write("                    if(noticeList.length > 0){\n");
      out.write("                        for(var i=0;i<noticeList.length;i++){\n");
      out.write("                            noticeContent +=\"<li><a href='javascript:goNotice(&quot;\"+noticeList[i].id+\"&quot;)' \";\n");
      out.write("                            noticeContent +=\"style='word-break:keep-all;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;'>\";\n");
      out.write("                            noticeContent +=\"<i class='btn btn-xs btn-primary fa fa-user'></i>\";\n");
      out.write("                            noticeContent +=\"&nbsp;\"+noticeList[i].noticeTitle + \"</a></li></ul></li>\";\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                    //alert(noticeContent);\n");
      out.write("                    $(\"#noticeContent\").html(noticeContent);\n");
      out.write("\n");
      out.write("                    //加载公告底部文字\n");
      out.write("                    var noticeSeeAll = data.attributes.seeAll +\"<i class='ace-icon fa fa-arrow-right'></i>\";\n");
      out.write("                    $(\"#noticeFooter\").html(noticeSeeAll);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    function loadSms(){\n");
      out.write("    \t//加载消息\n");
      out.write("        var url = \"tSSmsController.do?getMessageList\";\n");
      out.write("        $.ajax({\n");
      out.write("            url:url,\n");
      out.write("            type:\"GET\",\n");
      out.write("            dataType:\"JSON\",\n");
      out.write("            async: false,\n");
      out.write("            success:function(data){\n");
      out.write("                if(data.success){\n");
      out.write("                    var messageList = data.attributes.messageList;\n");
      out.write("                    var messageCount = data.obj;\n");
      out.write("                    //加载消息条数\n");
      out.write("                    if(messageCount>99){\n");
      out.write("                        $(\"#messageCount\").html(\"99+\");\n");
      out.write("                    }else{\n");
      out.write("                        $(\"#messageCount\").html(messageCount);\n");
      out.write("                    }\n");
      out.write("                    //加载消息tip提示\n");
      out.write("                    var messageTip = \"\";\n");
      out.write("                    messageTip += \"<i class='ace-icon fa fa-envelope-o'></i>\";\n");
      out.write("                    messageTip += messageCount+\" \"+data.attributes.tip;\n");
      out.write("                    $(\"#messageTip\").html(messageTip);\n");
      out.write("\n");
      out.write("                    //加载消息条目（有限）\n");
      out.write("                    var messageContent = \"\";\n");
      out.write("                    if(messageList.length > 0){\n");
      out.write("                        for(var i=0;i<messageList.length;i++){\n");
      out.write("                            messageContent +=\"<li><a href='javascript:goMessage(&quot;\"+messageList[i].id+\"&quot;)' class='clearfix'>\";\n");
      out.write("                            messageContent +=\"<i class='btn btn-xs btn-primary fa fa-user'></i>\";\n");
      out.write("                            messageContent +=\"<span class='msg-body'><span class='msg-title'> \";\n");
      out.write("                            messageContent += messageList[i].esTitle + \"</span>\";\n");
      out.write("                            messageContent +=\" <span class='blue'>From:\"+messageList[i].esSender+\"</span>\";\n");
      out.write("                            messageContent +=\"</span></a><input id='\"+messageList[i].id+\"_title' type='hidden' value='\"+messageList[i].esTitle+\"'>\";\n");
      out.write("                            messageContent +=\"<input id='\"+messageList[i].id+\"_status' type='hidden' value='\"+messageList[i].esStatus+\"'>\";\n");
      out.write("                            messageContent +=\"<input id='\"+messageList[i].id+\"_content' type='hidden' value='\"+messageList[i].esContent+\"'></li>\";\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                    $(\"#messageContent\").html(messageContent);\n");
      out.write("\n");
      out.write("                    //加载消息底部文字\n");
      out.write("                    var messageSeeAll = data.attributes.seeAll +\"<i class='ace-icon fa fa-arrow-right'></i>\";\n");
      out.write("                    $(\"#messageFooter\").html(messageSeeAll);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function goAllNotice(){\n");
      out.write("        var addurl = \"noticeController.do?noticeList\";\n");
      out.write("        createdetailwindow(\"公告\", addurl, 800, 400);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function goNotice(id){\n");
      out.write("        var addurl = \"noticeController.do?goNotice&id=\"+id;\n");
      out.write("        createdetailwindow(\"通知公告详情\", addurl, 750, 600);\n");
      out.write("        loadNotice();\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function goAllMessage(){\n");
      out.write("        var addurl = \"tSSmsController.do?goMySmsList\";\n");
      out.write("        createdetailwindow(\"通知\", addurl, 800, 400);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function goMessage(id){\n");
      out.write("    \tvar addurl = \"tSSmsController.do?goSmsDetail&id=\"+id;\n");
      out.write("\t\tcreatedetailwindow(\"通知详情\", addurl, 750, 600);\n");
      out.write("\t\tloadSms();\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function readMessage(){\n");
      out.write("        var msgId = $(\"#msgId\").val();\n");
      out.write("        var url = \"tSSmsController.do?readMessage\";\n");
      out.write("        $.ajax({\n");
      out.write("            url:url,\n");
      out.write("            type:\"GET\",\n");
      out.write("            dataType:\"JSON\",\n");
      out.write("            data:{\n");
      out.write("                messageId:msgId\n");
      out.write("            },\n");
      out.write("            success:function(data){\n");
      out.write("                if(data.success){\n");
      out.write("                    $(\"#msgStatus\").html(\"已读\");\n");
      out.write("                    $(\"#\"+msgId+\"_status\").val('2');\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("    //个人信息弹出层回缩\n");
      out.write("    function frameBodyClick(){ \n");
      out.write("\t\t$(\".count-info\").attr(\"aria-expanded\",\"false\").parent().removeClass(\"open\");\n");
      out.write("\t}\n");
      out.write("    //新增iframe中绑定click事件回调父级函数\n");
      out.write("    function bindFrameClick(){\n");
      out.write("    \t$(\".J_iframe\").contents().find(\"body\").attr(\"onclick\", \"parent.frameBodyClick()\"); \n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /**\n");
      out.write("     * i18n国际化配置\n");
      out.write("     */\n");
      out.write("    function initI18nConfig() {\n");
      out.write("    \tvar i18n_browser_Lang = getCookie(\"i18n_browser_Lang\");\n");
      out.write("    \tif(i18n_browser_Lang == 'zh-cn'){\n");
      out.write("    \t\ti18n_browser_Lang = 'zh';\n");
      out.write("    \t}\n");
      out.write("//    \tconsole.log(i18n_browser_Lang);\n");
      out.write("        $.i18n.properties({\n");
      out.write("            name:'jeecgs',    \t\t//属性文件名     命名格式： 文件名_国家代号.properties\n");
      out.write("            path:'plug-in/i18n/',   //注意这里路径是你属性文件的所在文件夹\n");
      out.write("            mode:'map',\n");
      out.write("            language:i18n_browser_Lang,//这就是国家代号 name+language刚好组成属性文件名：strings+zh -> strings_zh.properties\n");
      out.write("            callback:function(){\n");
      out.write("           \t\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    }\n");
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
      out.write("\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_t_menu_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:menu
    org.jeecgframework.tag.core.easyui.MenuTag _jspx_th_t_menu_0 = (org.jeecgframework.tag.core.easyui.MenuTag) _jspx_tagPool_t_menu_style_menuFun_nobody.get(org.jeecgframework.tag.core.easyui.MenuTag.class);
    _jspx_th_t_menu_0.setPageContext(_jspx_page_context);
    _jspx_th_t_menu_0.setParent(null);
    _jspx_th_t_menu_0.setStyle("hplus");
    _jspx_th_t_menu_0.setMenuFun((java.util.Map) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${menuMap}", java.util.Map.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_t_menu_0 = _jspx_th_t_menu_0.doStartTag();
    if (_jspx_th_t_menu_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_menu_style_menuFun_nobody.reuse(_jspx_th_t_menu_0);
      return true;
    }
    _jspx_tagPool_t_menu_style_menuFun_nobody.reuse(_jspx_th_t_menu_0);
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
    _jspx_th_t_mutiLang_1.setLangKey("common.change.password");
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
    _jspx_th_t_mutiLang_2.setLangKey("common.change.password");
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
    _jspx_th_t_mutiLang_3.setLangKey("common.profile");
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
    _jspx_th_t_mutiLang_4.setLangKey("common.profile");
    int _jspx_eval_t_mutiLang_4 = _jspx_th_t_mutiLang_4.doStartTag();
    if (_jspx_th_t_mutiLang_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_4);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_4);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_5 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_5.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_5.setParent(null);
    _jspx_th_t_mutiLang_5.setLangKey("common.change.style");
    int _jspx_eval_t_mutiLang_5 = _jspx_th_t_mutiLang_5.doStartTag();
    if (_jspx_th_t_mutiLang_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_5);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_5);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_6 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_6.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_6.setParent(null);
    _jspx_th_t_mutiLang_6.setLangKey("common.my.style");
    int _jspx_eval_t_mutiLang_6 = _jspx_th_t_mutiLang_6.doStartTag();
    if (_jspx_th_t_mutiLang_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_6);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_6);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_7 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_7.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_7.setParent(null);
    _jspx_th_t_mutiLang_7.setLangKey("common.clear.localstorage");
    int _jspx_eval_t_mutiLang_7 = _jspx_th_t_mutiLang_7.doStartTag();
    if (_jspx_th_t_mutiLang_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_7);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_7);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_8 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_8.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_8.setParent(null);
    _jspx_th_t_mutiLang_8.setLangKey("system.version.number");
    int _jspx_eval_t_mutiLang_8 = _jspx_th_t_mutiLang_8.doStartTag();
    if (_jspx_th_t_mutiLang_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_8);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_8);
    return false;
  }

  private boolean _jspx_meth_t_base_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:base
    org.jeecgframework.tag.core.easyui.BaseTag _jspx_th_t_base_0 = (org.jeecgframework.tag.core.easyui.BaseTag) _jspx_tagPool_t_base_type_nobody.get(org.jeecgframework.tag.core.easyui.BaseTag.class);
    _jspx_th_t_base_0.setPageContext(_jspx_page_context);
    _jspx_th_t_base_0.setParent(null);
    _jspx_th_t_base_0.setType("tools");
    int _jspx_eval_t_base_0 = _jspx_th_t_base_0.doStartTag();
    if (_jspx_th_t_base_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_base_type_nobody.reuse(_jspx_th_t_base_0);
      return true;
    }
    _jspx_tagPool_t_base_type_nobody.reuse(_jspx_th_t_base_0);
    return false;
  }
}
