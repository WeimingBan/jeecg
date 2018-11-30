package org.apache.jsp.webpage.com.jeecg.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class form_005fnatures_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_base_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_formvalid_layout_formid_dialog;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_formvalid_layout_formid_dialog = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
    _jspx_tagPool_t_formvalid_layout_formid_dialog.release();
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
      out.write("<title>form_topjui</title>\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=9; IE=8; IE=7; IE=EDGE\"/>\n");
      if (_jspx_meth_t_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<style>\n");
      out.write("\t/*下拉框样式开始*/\n");
      out.write("\t.selectBox{\n");
      out.write("\t\twidth: 400px;\n");
      out.write("\t\theight: 28px;\n");
      out.write("\t\tline-height: 36px;\n");
      out.write("\t}\n");
      out.write("\tinput::-ms-clear, input::-ms-reveal{\n");
      out.write("\t\t/*clear去掉叉  reveal去掉眼睛;但是只能去掉ie10及以上，ie9及以下去不掉*/\n");
      out.write("\t    display: none;  \n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.inputCase{\n");
      out.write("\t\tposition: relative;\n");
      out.write("\t\twidth: 100%;\n");
      out.write("\t\theight: 100%;\n");
      out.write("\t\tbox-sizing: border-box;\n");
      out.write("\t}\n");
      out.write("\t.inputCase input.imitationSelect{\n");
      out.write("\t\twidth: 100%;\n");
      out.write("\t\theight: 100%;\n");
      out.write("\t\tbox-sizing: border-box;\n");
      out.write("\t\tborder: 1px solid #ccc;\n");
      out.write("\t\tdisplay: block;\n");
      out.write("\t\ttext-indent: 20px;\n");
      out.write("\t\tcursor: default;\n");
      out.write("\t}\n");
      out.write("\t.inputCase i.fa{\n");
      out.write("\t\tposition: absolute;\n");
      out.write("\t\tright: 10px;\n");
      out.write("\t\ttop: 5px;\n");
      out.write("\t\tfont-size: 20px;\n");
      out.write("\t\tz-index: 99999;\n");
      out.write("\t}\n");
      out.write("\t.inputCase .fa{\n");
      out.write("\t\tcursor: pointer;\n");
      out.write("\t}\n");
      out.write("\t.inputCase .fa {\n");
      out.write("\t    display: inline-block;\n");
      out.write("\t    font: normal normal normal 14px/1 FontAwesome;\n");
      out.write("\t    font-size: inherit;\n");
      out.write("\t    text-rendering: auto;\n");
      out.write("\t    -webkit-font-smoothing: antialiased;\n");
      out.write("\t    -moz-osx-font-smoothing: grayscale;\n");
      out.write("\t}\n");
      out.write("\t.fa-caret-down:before {\n");
      out.write("\t    content: \"\\f0d7\";\n");
      out.write("\t}\n");
      out.write("\t.fa-caret-up:before {\n");
      out.write("\t    content: \"\\f0d8\";\n");
      out.write("\t}\n");
      out.write("\t.selectUl{\n");
      out.write("\t\tdisplay: none;\n");
      out.write("\t\tpadding: 0;\n");
      out.write("\t\tmargin: 0;\n");
      out.write("\t\tborder-bottom: 1px solid  #ccc;\n");
      out.write("\t\tborder-left: 1px solid  #ccc;\n");
      out.write("\t\tborder-right: 1px solid  #ccc;\n");
      out.write("\t    max-height: 222px;\n");
      out.write("\t\toverflow: auto;\n");
      out.write("\t\tlist-style-type: disc;\n");
      out.write("\t    position: relative;\n");
      out.write("\t    z-index: 10000;\n");
      out.write("\t    background: white;\n");
      out.write("\t}\n");
      out.write("\t.selectUl::-webkit-scrollbar {\n");
      out.write("\t    width: 10px;\n");
      out.write("\t    height: 10px;\n");
      out.write("\t    background-color: #F5F5F5;\n");
      out.write("\t}\n");
      out.write("\t.selectUl::-webkit-scrollbar-thumb {\n");
      out.write("\t    background: #555;\n");
      out.write("\t}\n");
      out.write("\t.selectUl::-webkit-scrollbar-track {\n");
      out.write("\t    background: #F5F5F5;\n");
      out.write("\t}\n");
      out.write("\t.selectUl li{\n");
      out.write("\t\theight: 36px;\n");
      out.write("\t\tline-height: 36px;\n");
      out.write("\t\tlist-style: none;\n");
      out.write("\t\ttext-indent: 20px;\n");
      out.write("\t\tborder-bottom: 1px dashed #ccc;\n");
      out.write("\t}\n");
      out.write("\t.selectUl li:hover{\n");
      out.write("\t\tbackground: #ddd;\n");
      out.write("\t}\n");
      out.write("\t.selectUl li:last-child{\n");
      out.write("\t\tborder-bottom: 0 none;\n");
      out.write("\t}\n");
      out.write("\t/*下拉框样式结束*/\n");
      out.write("\t/*文件框样式开始*/\n");
      out.write("\t.form-label {\n");
      out.write("\t    position: relative;\n");
      out.write("\t    float: left;\n");
      out.write("\t    display: block;\n");
      out.write("\t    padding: 5px;\n");
      out.write("\t    width: 120px;\n");
      out.write("\t    font-weight: 400;\n");
      out.write("\t    line-height: 20px;\n");
      out.write("\t    text-align: right;\n");
      out.write("\t    color: #666;\n");
      out.write("\t}\n");
      out.write("\t.textbox {\n");
      out.write("\t    position: relative;\n");
      out.write("\t    border: 1px solid #D3D3D3;\n");
      out.write("\t    background-color: #fff;\n");
      out.write("\t    vertical-align: middle;\n");
      out.write("\t    display: inline-block;\n");
      out.write("\t    overflow: hidden;\n");
      out.write("\t    white-space: nowrap;\n");
      out.write("\t    margin: 0;\n");
      out.write("\t    padding: 0;\n");
      out.write("\t    -moz-border-radius: 2px;\n");
      out.write("\t    -webkit-border-radius: 2px;\n");
      out.write("\t    border-radius: 2px;\n");
      out.write("\t}\n");
      out.write("\t.textbox .textbox-text {\n");
      out.write("\t    border: 0;\n");
      out.write("\t    margin: 0;\n");
      out.write("\t    padding: 4px;\n");
      out.write("\t    white-space: normal;\n");
      out.write("\t    vertical-align: top;\n");
      out.write("\t    outline-style: none;\n");
      out.write("\t    resize: none;\n");
      out.write("\t    -moz-border-radius: 2px;\n");
      out.write("\t    -webkit-border-radius: 2px;\n");
      out.write("\t    border-radius: 2px;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.textbox .textbox-button-right{\n");
      out.write("\t\tposition: absolute;\n");
      out.write("\t    top: 0;\n");
      out.write("\t    padding: 0;\n");
      out.write("\t    vertical-align: top;\n");
      out.write("\t    -moz-border-radius: 0;\n");
      out.write("\t    -webkit-border-radius: 0;\n");
      out.write("\t    border-radius: 0;\n");
      out.write("\t    right: 0;\n");
      out.write("\t    border-width: 0 0 0 1px;\n");
      out.write("\t}\n");
      out.write("\t.fa-folder:before {\n");
      out.write("\t    content: \"\\f07b\";\n");
      out.write("\t}\n");
      out.write("\t.l-btn {\n");
      out.write("\t    margin: 0;\n");
      out.write("\t  \t\toverflow: hidden;\n");
      out.write("\t\tcursor: pointer;\n");
      out.write("\t    outline: 0;\n");
      out.write("\t    text-align: center;\n");
      out.write("\t    vertical-align: middle;\n");
      out.write("\t    line-height: normal;\n");
      out.write("\t    color: #444;\n");
      out.write("\t    border: 1px solid #bbb;\n");
      out.write("\t    background: -webkit-linear-gradient(top,#fff 0,#eee 100%);\n");
      out.write("\t    background: -moz-linear-gradient(top,#fff 0,#eee 100%);\n");
      out.write("\t    background: -o-linear-gradient(top,#fff 0,#eee 100%);\n");
      out.write("\t    background: linear-gradient(to bottom,#fff 0,#eee 100%);\n");
      out.write("\t    background-repeat: repeat-x;\n");
      out.write("\t    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr=#ffffff, endColorstr=#eeeeee, GradientType=0);\n");
      out.write("\t    /* -moz-border-radius: 2px;\n");
      out.write("\t    -webkit-border-radius: 2px;\n");
      out.write("\t    border-radius: 2px; */\n");
      out.write("\t    padding: 0;\n");
      out.write("\t}\n");
      out.write("\t.l-btn-left {\n");
      out.write("\t\tcolor: #444;\n");
      out.write("\t\tposition: relative;\n");
      out.write("\t    margin: 0;\n");
      out.write("\t    margin-top: 2px !important;\n");
      out.write("\t    padding: 0;\n");
      out.write("\t    vertical-align: top;\n");
      out.write("\t    display: inline-block;\n");
      out.write("\t    overflow: hidden;\n");
      out.write("\t}\n");
      out.write("\t.filebox-label {\n");
      out.write("\t    width: 100%;\n");
      out.write("\t    height: 100%;\n");
      out.write("\t    cursor: pointer;\n");
      out.write("\t    left: 0;\n");
      out.write("\t    z-index: 10;\n");
      out.write("\t}\n");
      out.write("\t.filebox-label{\n");
      out.write("\t    display: inline-block;\n");
      out.write("\t       top: 0;\n");
      out.write("\t    position: absolute;\n");
      out.write("\t}\n");
      out.write("\t.filebox .textbox-value {\n");
      out.write("\t    vertical-align: top;\n");
      out.write("\t    left: -5000px;\n");
      out.write("\t}\n");
      out.write("\t.filebox .textbox-value{\n");
      out.write("\t    top: 0;\n");
      out.write("\t    position: absolute;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.button, a.l-btn span.l-btn-left {\n");
      out.write("\t    height: 24px;\n");
      out.write("\t    cursor: pointer;\n");
      out.write("\t    line-height: 20px;\n");
      out.write("\t    display: inline-block;\n");
      out.write("\t    color: rgb(68, 68, 68);\n");
      out.write("\t    white-space: nowrap;\n");
      out.write("\t    border-width: 0px;\n");
      out.write("\t    border-left: 1px;\n");
      out.write("\t    border-color: rgb(204, 204, 204);\n");
      out.write("\t    border-image: initial;\n");
      out.write("\t    border-radius: 0px;\n");
      out.write("\t    background: -webkit-gradient(linear, 0 0, 0 100%, from(rgb(255, 255, 255)), to(rgb(242, 242, 242)));\n");
      out.write("\t    padding: 3px 3px;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.button:hover, a.l-btn:hover span.l-btn-left {\n");
      out.write("\t    border: 0px solid #76B4AC;\n");
      out.write("\t    border-radius: 0px;\n");
      out.write("\t    border-left: 1px;\n");
      out.write("\t    background-color: #f7f5f5;\n");
      out.write("\t    background: -webkit-gradient(linear, 0 0, 0 100%, from(#ffffff),\n");
      out.write("\t to(#f2f2f2));\n");
      out.write("\t    background: -moz-gradient(linear, 0 0, 0 100%, from(#f7f7f7),\n");
      out.write("\t to(#f2f2f2));\n");
      out.write("\t    background: -o-gradient(linear, 0 0, 0 100%, from(#e9e9e9), to(#f2f2f2));\n");
      out.write("\t    background: -ms-gradient(linear, 0 0, 0 100%, from(#e9e9e9), to(#f2f2f2));\n");
      out.write("\t    filter: progid:DXImageTransform.Microsoft.gradient(startcolorstr=#f7f7f7,\n");
      out.write("\t endcolorstr=#f2f2f2, gradientType=0);\n");
      out.write("\t    color: #007465;\n");
      out.write("\t    cursor: pointer;\n");
      out.write("\t}\n");
      out.write("\t/*文件框样式结束*/\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      if (_jspx_meth_t_formvalid_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(function(){\n");
      out.write("\t\t//点击右边箭头icon时候\n");
      out.write("\t\t$(\".selectBox .fa\").on(\"click\",function(event){\n");
      out.write("\t\t\t$(this).parent().next().toggle();//ul弹窗展开\n");
      out.write("\t\t\tif($(this).hasClass(\"fa-caret-down\")){\n");
      out.write("\t\t\t\t$(this).removeClass(\"fa-caret-down\").addClass(\"fa-caret-up\")//点击input选择适合，小图标动态切换\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\t$(this).addClass(\"fa-caret-down\").removeClass(\"fa-caret-up\")//点击input选择适合，小图标动态切换\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tif (event.stopPropagation) {   \n");
      out.write("\t        \t// 针对 Mozilla 和 Opera   \n");
      out.write("\t        \tevent.stopPropagation();   \n");
      out.write("\t        }else if (window.event) {   \n");
      out.write("\t        \t// 针对 IE   \n");
      out.write("\t        \twindow.event.cancelBubble = true;   \n");
      out.write("\t        }  \n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t//注意async属性的使用，此处只能为false，否则无法为li添加事件\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\turl:'jeecgFormDemoController.do?regionSelect&pid=1',\n");
      out.write("\t\t\ttype:'GET',\n");
      out.write("\t\t\tdataType:'JSON',\n");
      out.write("\t\t\tasync:false,\n");
      out.write("\t\t\tdelay: 250,\n");
      out.write("\t\t\tcache: true,\n");
      out.write("\t\t\tsuccess: function(data){\n");
      out.write("\t\t\t\tvar cnt = \"\";\n");
      out.write("\t\t\t\tfor(var i = 0; i < data.length; i++){\n");
      out.write("\t\t\t\t\tcnt+=\"<li oliName='\"+data[i].name+\"' oliId='\"+data[i].id+\"' style='z-index:10000;'>\"+data[i].name+\"</li>\";\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t$(\"#selectUl\").html(cnt);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$(\".selectUl li\").on(\"click\",function(event){\n");
      out.write("\t\t\tevent=event||window.event; \n");
      out.write("\t\t\t$(this).addClass(\"actived_li\").siblings().removeClass(\"actived_li\");//点击当前的添加。actived_li这个类；其他的移除这个类名\n");
      out.write("\t\t\tvar oliName = $(this).attr(\"oliName\");//定义一个name属性，获取点击的元素属性赋值到当前，方便动态化传值\n");
      out.write("\t\t\tvar oliId = $(this).attr(\"oliId\");//定义一个id属性，获取点击的元素属性赋值到当前，方便数据交互传值\n");
      out.write("\t\t\t$(this).parent().prev().children().val(oliName); //把当前点击的name赋值到显示的input的val里面\n");
      out.write("\t\t\t$(this).parent().prev().children().attr(\"oliName\",oliName);//把当前点击的oliName赋值到显示的input的oliName里面\n");
      out.write("\t\t\t$(this).parent().prev().children().attr(\"oliId\",oliId);//把当前点击的oliId赋值到显示的input的oliId里面\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t//点击任意地方隐藏下拉\n");
      out.write("\t\t$(document).click(function(event){\n");
      out.write("\t\t\tevent=event||window.event; \n");
      out.write("\t\t\t$(\".inputCase .fa\").removeClass(\"fa-caret-up\").addClass(\"fa-caret-down\")//当点隐藏ul弹窗时候，把小图标恢复原状\n");
      out.write("\t\t\t$(\".selectUl\").hide();//当点击空白处，隐藏ul弹窗\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#filebox_file_id_1\").change(function(){\n");
      out.write("\t   \t\tvar vl = $(\"#filebox_file_id_1\").val();\n");
      out.write("\t   \t\tvar valArr = vl.split(\"\\\\\");\n");
      out.write("\t   \t\t$(\"#_easyui_textbox_input1\").val(valArr[valArr.length-1]);\n");
      out.write("\t   \t});\n");
      out.write("\t})\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("</script>\n");
      out.write("</body>\n");
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
    org.jeecgframework.tag.core.easyui.FormValidationTag _jspx_th_t_formvalid_0 = (org.jeecgframework.tag.core.easyui.FormValidationTag) _jspx_tagPool_t_formvalid_layout_formid_dialog.get(org.jeecgframework.tag.core.easyui.FormValidationTag.class);
    _jspx_th_t_formvalid_0.setPageContext(_jspx_page_context);
    _jspx_th_t_formvalid_0.setParent(null);
    _jspx_th_t_formvalid_0.setLayout("div");
    _jspx_th_t_formvalid_0.setFormid("dd");
    _jspx_th_t_formvalid_0.setDialog(false);
    int _jspx_eval_t_formvalid_0 = _jspx_th_t_formvalid_0.doStartTag();
    if (_jspx_eval_t_formvalid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write(" <fieldset>\n");
        out.write("\t <legend>select</legend>\n");
        out.write("\t  <table>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td style=\"width:90px;text-align: right;\">省份：</td>\n");
        out.write("\t\t\t<td>\n");
        out.write("\t\t\t\t<div class=\"selectBox\">\n");
        out.write("\t\t        \t<div class=\"inputCase\">\n");
        out.write("\t\t\t\t\t\t<input id=\"imitationSelect\" class=\"imitationSelect\" type=\"text\" oulName=\"\" oulId=\"\" value=\"\"/>\n");
        out.write("\t\t\t\t\t\t<i class=\"fa fa-caret-down\"></i>\n");
        out.write("\t\t\t\t\t</div>\n");
        out.write("\t\t\t\t\t<ul id=\"selectUl\" class=\"selectUl\"></ul>\n");
        out.write("\t\t        </div>\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t </table>\n");
        out.write(" </fieldset>\n");
        out.write("\n");
        out.write(" <fieldset>\n");
        out.write("\t<legend>文件上传</legend>\n");
        out.write("\t<table>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td style=\"width:90px;text-align: right;\">文件：</td>\n");
        out.write("\t\t\t<td>\n");
        out.write("\t\t\t\t<div id=\"uploader\" class=\"wu-example\">\n");
        out.write("\t\t\t\t    <div class=\"btns\">\n");
        out.write("\t\t\t\t        <div class=\"file\">\n");
        out.write("\t\t\t\t            <div>\n");
        out.write("\t\t\t\t                <span class=\"textbox easyui-fluid filebox\" style=\"width: 400px; height: 28px;\">\n");
        out.write("\t\t\t\t\t                <a href=\"javascript:;\" class=\"textbox-button textbox-button-right l-btn l-btn-small\" style=\"height: 30px;position: absolute;top: -2px;\">\n");
        out.write("\t\t\t\t\t\t                <span class=\"l-btn-left l-btn-icon-left\">\n");
        out.write("\t\t\t\t\t\t                <span class=\"l-btn-text\" style=\"float:right;font: 12px/normal 'microsoft yahei','Times New Roman',Times,serif;\">选择</span>\n");
        out.write("\t\t\t\t\t\t                <span class=\"l-btn-icon fa fa-folder\">&nbsp;</span></span>\n");
        out.write("\t\t\t\t\t\t                <label class=\"filebox-label\" for=\"filebox_file_id_1\"></label>\n");
        out.write("\t\t\t\t\t                </a>\n");
        out.write("\t\t\t\t\t                <input id=\"_easyui_textbox_input1\" type=\"text\" class=\"textbox-text validatebox-text textbox-prompt\" autocomplete=\"off\" readonly=\"readonly\" style=\"margin: 0px 55px 0px 0px; padding-top: 0px; padding-bottom: 0px; height: 28px; line-height: 28px; width: 945px;\">\n");
        out.write("\t\t\t\t\t                <input type=\"file\" class=\"textbox-value\" id=\"filebox_file_id_1\" name=\"filebox1\">\n");
        out.write("\t\t\t\t                </span>\n");
        out.write("\t\t\t\t            </div>\n");
        out.write("\t\t\t\t        </div>\n");
        out.write("\t\t\t\t    </div>\n");
        out.write("\t\t\t\t</div>\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t </table>\n");
        out.write("\t\n");
        out.write(" </fieldset>\n");
        out.write(" \n");
        int evalDoAfterBody = _jspx_th_t_formvalid_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_formvalid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_formvalid_layout_formid_dialog.reuse(_jspx_th_t_formvalid_0);
      return true;
    }
    _jspx_tagPool_t_formvalid_layout_formid_dialog.reuse(_jspx_th_t_formvalid_0);
    return false;
  }
}
