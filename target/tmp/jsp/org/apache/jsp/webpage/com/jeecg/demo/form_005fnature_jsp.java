package org.apache.jsp.webpage.com.jeecg.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class form_005fnature_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>form_nature</title>\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=9; IE=8; IE=7; IE=EDGE\"/>\n");
      if (_jspx_meth_t_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<!-- ztree -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"plug-in/ztree/css/zTreeStyle.css\"></link>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/ztree/js/jquery.ztree.core-3.5.min.js\" ></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/ztree/js/jquery.ztree.excheck-3.5.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- 文件上传 -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"plug-in/webuploader/webuploader.css\"></link>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/webuploader/webuploader.min.js\" ></script>\n");
      out.write("\n");
      out.write("<!-- 自动补全 -->\n");
      out.write("<link rel=\"stylesheet\" href=\"plug-in/jquery/jquery-autocomplete/jquery.autocomplete.css\" type=\"text/css\"></link>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/jquery/jquery-autocomplete/jquery.autocomplete.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- 联动 -->\n");
      out.write("<script src=\"plug-in/jquery/jquery.regionselect.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<!-- select2 -->\n");
      out.write("<link rel=\"stylesheet\" href=\"plug-in/select2/css/select2.min.css\">\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/select2/js/select2.full.min.js\"></script>\n");
      out.write("<!-- 省市区provinces三级联动 -->\n");
      out.write("<script src=\"plug-in/provinces/js/city-picker.data.js\"></script>\n");
      out.write("<script src=\"plug-in/provinces/js/city-picker.js\"></script>\n");
      out.write("<script src=\"plug-in/provinces/js/main.js\"></script>\n");
      out.write("<link href=\"plug-in/provinces/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"plug-in/provinces/css/city-picker.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write(" \n");
      out.write("</head>\n");
      out.write("<body>\n");
      if (_jspx_meth_t_formvalid_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function printobj(obj){\n");
      out.write("\tvar str='[';\n");
      out.write("\tfor(var a in obj){\n");
      out.write("\t\tstr+=a+':'+obj[a]+\",\";\n");
      out.write("\t}\n");
      out.write("\tstr+=0+':0]';\n");
      out.write("\treturn str;\n");
      out.write("}\n");
      out.write("function getTremValueuserName() {\n");
      out.write("\treturn $(\"#userNameAuto\").val();\n");
      out.write("}\n");
      out.write("$(function() {\n");
      out.write("\t//ztree\n");
      out.write("\tvar setting = {\n");
      out.write("\t\tcheck: {\n");
      out.write("\t\t\tenable: true\n");
      out.write("\t\t},\n");
      out.write("\t\tview: {\n");
      out.write("\t\t\tdblClickExpand: true\n");
      out.write("\t\t},\n");
      out.write("\t\tdata: {\n");
      out.write("\t\t\tsimpleData: {\n");
      out.write("\t\t\t\tenable: true\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t};\n");
      out.write("\tvar zNodes=jQuery.parseJSON('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${regions}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("');\n");
      out.write("\t$.fn.zTree.init($(\"#treeDemo\"), setting, zNodes);\n");
      out.write("\t\n");
      out.write("\t//省市区下拉\n");
      out.write(" \t$(\"#province\").regionselect({\n");
      out.write(" \t\t\turl:'");
      out.print(basePath);
      out.write("/jeecgFormDemoController.do?regionSelect'\n");
      out.write(" \t});\n");
      out.write("\t\n");
      out.write("\t/*-------------------------------------------文件上传----------------------------------------------*/\n");
      out.write("\tvar urlc= '");
      out.print(basePath);
      out.write("/systemController/filedeal.do';\n");
      out.write("\tvar BASE_URL=\"");
      out.print(basePath);
      out.write("\";\n");
      out.write("\tvar uploader = WebUploader.create({\n");
      out.write("\t    // swf文件路径\n");
      out.write("\t    swf: BASE_URL+'/plug-in/webuploader/Uploader.swf',\n");
      out.write("\t    // 文件接收服务端。\n");
      out.write("\t\tserver: urlc,\n");
      out.write("\t    // 选择文件的按钮。可选。\n");
      out.write("\t    // 内部根据当前运行是创建，可能是input元素，也可能是flash.\n");
      out.write("\t    pick: '#picker',\n");
      out.write("\t    // 不压缩image, 默认如果是jpeg，文件上传前会压缩一把再上传！\n");
      out.write("\t    resize: false,\n");
      out.write("\t    //指明参数名称，后台也用这个参数接收文件\n");
      out.write("\t    duplicate: false,\n");
      out.write("\t    auto: true,\n");
      out.write("\t    //每次上传附带参数\n");
      out.write("\t    formData:{\"uparg\":\"ggfile\"}\n");
      out.write("\t \n");
      out.write("\t});\n");
      out.write("\tuploader.on( 'fileQueued', function( file ) {\n");
      out.write("\t\t$(\"#thelist\").append( '<div id=\"' + file.id + '\" class=\"item\">' +\n");
      out.write("\t        '<div class=\"state\">'+file.name+'---等待上传...</div>' +\n");
      out.write("\t    '</div>' );\n");
      out.write("\t}); \n");
      out.write("\t\n");
      out.write("\t//文件上传过程中创建进度条实时显示.\n");
      out.write("\t uploader.on( 'uploadProgress', function( file, percentage ) {\n");
      out.write("\t    var $li = $( '#'+file.id ),\n");
      out.write("\t        $percent = $li.find('.progress .progress-bar');\n");
      out.write("\t    // 避免重复创建\n");
      out.write("\t    if ( !$percent.length ) {\n");
      out.write("\t        $percent = $('<div class=\"progress progress-striped active\">' +\n");
      out.write("\t          '<div class=\"progress-bar\" role=\"progressbar\" style=\"width: 0%\">' +\n");
      out.write("\t          '</div>' +\n");
      out.write("\t        '</div>').appendTo( $li ).find('.progress-bar');\n");
      out.write("\t    }\n");
      out.write("\t    $li.find('div.state').html(file.name+'---上传中');\n");
      out.write("\t    $percent.css( 'width', percentage * 100 + '%' );\n");
      out.write("\t});\n");
      out.write("\tuploader.on( 'uploadSuccess', function(file) {\n");
      out.write("\t    $( '#'+file.id ).find('div.state').html(file.name+'---上传成功!');\n");
      out.write("\t});\n");
      out.write("\tuploader.on( 'uploadError', function( file) {\n");
      out.write("\t    $( '#'+file.id ).find('div.state').html(file.name+'---上传出错');\n");
      out.write("\t});\n");
      out.write("\tuploader.on( 'uploadComplete', function( file ) {\n");
      out.write("\t   $( '#'+file.id ).find('.progress').fadeOut('slow');\n");
      out.write("\t}); \n");
      out.write("\t/*-------------------------------------------文件上传----------------------------------------------*/\n");
      out.write("\t\n");
      out.write("\t/*-------------------------------------------自动补全----------------------------------------------*/\n");
      out.write("\t$(\"#userNameAuto\").autocomplete(\"jeecgFormDemoController.do?getAutocompleteData\", {\n");
      out.write("        max: 5,\n");
      out.write("        minChars: 1,\n");
      out.write("        width: 200,\n");
      out.write("        scrollHeight: 100,\n");
      out.write("        matchContains: true,\n");
      out.write("        autoFill: false,\n");
      out.write("        extraParams: {\n");
      out.write("            featureClass: \"P\",\n");
      out.write("            style: \"full\",\n");
      out.write("            maxRows: 10,\n");
      out.write("            labelField: \"userName\",\n");
      out.write("            valueField: \"userName\",\n");
      out.write("            searchField: \"userName\",\n");
      out.write("            entityName: \"TSUser\",\n");
      out.write("            trem: getTremValueuserName\n");
      out.write("        },\n");
      out.write("        parse: function(data) {\n");
      out.write("            return jeecgAutoParse.call(this, data);\n");
      out.write("        },\n");
      out.write("        formatItem: function(row, i, max) {\n");
      out.write("            return row['userName'];\n");
      out.write("        }\n");
      out.write("    }).result(function(event, row, formatted) {\n");
      out.write("        $(\"#userNameAuto\").val(row['userName']);\n");
      out.write("    });\n");
      out.write("\t/*-------------------------------------------自动补全----------------------------------------------*/\n");
      out.write("\t$(\"div.webuploader-container\").css(\"width\",\"78px\");\n");
      out.write("\tvar select2Data = new Array();\n");
      out.write("\t$.ajax({\n");
      out.write("\t\turl:'jeecgFormDemoController.do?regionSelect&pid=1',\n");
      out.write("\t\ttype:'GET',\n");
      out.write("\t\tdataType:'JSON',\n");
      out.write("\t\tdelay: 250,\n");
      out.write("\t\tcache: true,\n");
      out.write("\t\tsuccess: function(data){\n");
      out.write("\t\t\tfor(var i = 0; i < data.length; i++){\n");
      out.write("\t\t\t\tvar select2Obj = {};\n");
      out.write("\t\t\t\tselect2Obj.id = data[i].id;\n");
      out.write("\t\t\t\tselect2Obj.text = data[i].name;\n");
      out.write("\t\t\t\tselect2Data.push(select2Obj);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t$(\"#province-select\").select2({\n");
      out.write("\t\t\t\tdata: select2Data,\n");
      out.write("\t\t\t\tplaceholder:'请选择省份',//默认文字提示\n");
      out.write("\t\t\t    language: \"zh-CN\",//汉化\n");
      out.write("\t\t\t    allowClear: true//允许清空\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("});\n");
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
        out.write(" <legend>文件上传</legend>\n");
        out.write("\t<div id=\"uploader\" class=\"wu-example\">\n");
        out.write("\t    <!--用来存放文件信息-->\n");
        out.write("\t    <div id=\"thelist\" class=\"uploader-list\"></div>\n");
        out.write("\t    <div class=\"btns\">\n");
        out.write("\t        <div id=\"picker\">选择文件</div>\n");
        out.write("\t    </div>\n");
        out.write("\t</div>\n");
        out.write(" </fieldset>\n");
        out.write("\n");
        out.write("<fieldset>\n");
        out.write(" <legend>组合输入框</legend>\n");
        out.write("\t<div class=\"form\" style=\"display:table;\">\n");
        out.write("\t    <label class=\"Validform_label\" style=\"width:90px;text-align: right;\"> 金额: </label> \n");
        out.write("\t    <input type=\"text\" class=\"groupinput\" name=\"nodeTimeout\" value=\"100\" datatype=\"n1-11\" ignore=\"ignore\"/>\n");
        out.write("\t    <span class=\"groupspan\">元</span>\n");
        out.write("\t</div>\n");
        out.write(" </fieldset>\n");
        out.write(" \n");
        out.write(" <fieldset>\n");
        out.write(" <legend>select2</legend>\n");
        out.write("  <table>\n");
        out.write("\t<tr>\n");
        out.write("\t\t<td style=\"width:90px;text-align: right;\">省份选择:</td>\n");
        out.write("\t\t<td>\n");
        out.write("\t\t\t<input type=\"text\" id=\"province-select\" name=\"province-select\" class=\"ac_input\">\n");
        out.write("\t\t</td>\n");
        out.write("\t</tr>\n");
        out.write(" </table>\n");
        out.write(" </fieldset>\n");
        out.write(" \n");
        out.write(" <fieldset>\n");
        out.write(" <legend>autocomplete</legend>\n");
        out.write("  <table>\n");
        out.write("\t<tr>\n");
        out.write("\t\t<td style=\"width:90px;text-align: right;\">用户名自动补全:</td>\n");
        out.write("\t\t<td>\n");
        out.write("\t\t\t<input type=\"text\" id=\"userNameAuto\" name=\"userName\" class=\"ac_input\">\n");
        out.write("\t\t</td>\n");
        out.write("\t</tr>\n");
        out.write(" </table>\n");
        out.write(" </fieldset>\n");
        out.write("  \n");
        out.write(" <fieldset>\n");
        out.write(" <legend>联动下拉省市区</legend>\n");
        out.write(" \t<div style=\"width:80%;margin:5px 0 0 10px;\">\n");
        out.write("\t  <input type=\"text\" id=\"province\" style=\"width:32%;\" value=\"\"/> \n");
        out.write("\t  <input type=\"text\" id=\"city\" style=\"width:32%;\" value=\"\"/> \n");
        out.write("\t  <input type=\"text\" id=\"area\" style=\"width:32%;\" value=\"\"/> \n");
        out.write(" \t</div>\n");
        out.write(" </fieldset>\n");
        out.write(" \n");
        out.write(" <fieldset>\n");
        out.write(" <legend>ztree</legend>\n");
        out.write(" \t<div style=\"clear:both\"></div>\n");
        out.write(" \t<div class=\"zTreeDemoBackground left\">\n");
        out.write("\t\t<ul id=\"treeDemo\" class=\"ztree\"></ul>\n");
        out.write("\t</div>\n");
        out.write(" </fieldset>\n");
        out.write(" \n");
        out.write(" <fieldset>\n");
        out.write(" <legend>ueditor</legend>\n");
        out.write(" \t \t<table>\n");
        out.write("\t<tr>\n");
        out.write("\t\t<!-- <td align=\"right\"><label class=\"Validform_label\">demo:</label> -->\n");
        out.write("\t\t<td>\n");
        out.write("\t\t\t<script type=\"text/javascript\"  charset=\"utf-8\" src=\"plug-in/ueditor/ueditor.config.js\"></script>\n");
        out.write("\t\t\t<script type=\"text/javascript\"  charset=\"utf-8\" src=\"plug-in/ueditor/ueditor.all.min.js\"></script>\n");
        out.write("\t    \t<textarea name=\"ueditorContent\" id=\"ueditorContent\" style=\"width: 650px;\"></textarea>\n");
        out.write("\t\t    <script type=\"text/javascript\">\n");
        out.write("\t\t        var editor = UE.getEditor('ueditorContent');\n");
        out.write("\t\t    </script>\n");
        out.write("\t\t    <span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t</td>\n");
        out.write("\t</tr>\n");
        out.write(" \t</table>\n");
        out.write(" </fieldset>\n");
        out.write("<fieldset>\n");
        out.write("\t<legend>省市区三级联动</legend>\n");
        out.write("\t<div class=\"container\">\n");
        out.write("\t\t<h2 class=\"page-header\"></h2>\n");
        out.write("\t\t<div class=\"docs-methods\">\n");
        out.write("\t\t\t<form class=\"form-inline\">\n");
        out.write("\t\t\t\t<div id=\"distpicker\">\n");
        out.write("\t\t\t\t\t<div class=\"form-group\">\n");
        out.write("\t\t\t\t\t\t<div style=\"position: relative;\">\n");
        out.write("\t\t\t\t\t\t\t<input id=\"city-picker3\" class=\"form-control\" readonly type=\"text\" value=\"江苏省/常州市/溧阳市\" data-toggle=\"city-picker\">\n");
        out.write("\t\t\t\t\t\t</div>\n");
        out.write("\t\t\t\t\t</div>\n");
        out.write("\t\t\t\t\t<div>\n");
        out.write("\t\t\t\t\t\t<button id=\"reset\" type=\"button\" style=\"hight: 50px; wight: 30px; font-size: 15px; \">重置</button>\n");
        out.write("\t\t\t\t\t\t<button id=\"destroy\" type=\"button\" style=\"hight: 50px; wight: 30px; font-size: 15px; position:relative;right:100px;bottom:33px;\">确定</button>\n");
        out.write("\t\t\t\t\t</div>\n");
        out.write("\t\t\t\t</div>\n");
        out.write("\t\t\t</form>\n");
        out.write("\t\t</div>\n");
        out.write("\t</div>\n");
        out.write("</fieldset>\n");
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
