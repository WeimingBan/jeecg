package org.apache.jsp.webpage.com.jeecg.demo.jformOrderMain2.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class addOrUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_base_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
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

      out.write(' ');
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
      out.write("  <title>订单主信息</title>\n");
      out.write("  <meta name=\"description\" content=\"\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  ");
      if (_jspx_meth_t_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  <style>\n");
      out.write(".tab-wrapper .nav-tabs > li.active > a, .tab-wrapper .nav-tabs > li.active > a:hover, .tab-wrapper .nav-tabs > li.active > a:focus {\n");
      out.write("    color: #8f0911;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".columns_tbz td {padding:2px;}\n");
      out.write(".table > tbody > tr{border-bottom:1px solid #ddd;}\n");
      out.write(".table input,.table select{width:157px;}\n");
      out.write("\n");
      out.write("/* 数量table下的input宽度设置 */\n");
      out.write(".num_tbz input{\n");
      out.write("\twidth:80px;\n");
      out.write("}\n");
      out.write("/* 价格table下的input/select宽度设置 */\n");
      out.write(".price_tbz input,.price_tbz select{\n");
      out.write("\twidth:100px;\n");
      out.write("}\n");
      out.write(".table textarea{width:157px;height:95%;}\n");
      out.write(".xh input,ck input{width:40px !important;}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write(" <script type=\"text/javascript\">\n");
      out.write(" $(document).ready(function(){\n");
      out.write("\t init();\n");
      out.write("\t $(\"#jform_tab .con-wrapper\").hide(); //Hide all tab content  \n");
      out.write("\t $(\"#jform_tab li:first\").addClass(\"active\").show(); //Activate first tab  \n");
      out.write("\t $(\"#jform_tab .con-wrapper:first\").show(); //Show first tab content\n");
      out.write("\t \n");
      out.write("\t \n");
      out.write("\t //On Click Event  \n");
      out.write("    $(\"#jform_tab li\").click(function() {  \n");
      out.write("        $(\"#jform_tab li\").removeClass(\"active\"); //Remove any \"active\" class  \n");
      out.write("        $(this).addClass(\"active\"); //Add \"active\" class to selected tab  \n");
      out.write("        $(\"#jform_tab .con-wrapper\").hide(); //Hide all tab content  \n");
      out.write("        var activeTab = $(this).find(\"a\").attr(\"href\"); //Find the rel attribute value to identify the active tab + content  \n");
      out.write("        $(activeTab).fadeIn(); //Fade in the active content\n");
      out.write("        //$(\"\"+activeTab).show(); \n");
      out.write("        if( $(activeTab).html()!=\"\") {\n");
      out.write("        \treturn false;\n");
      out.write("        }else{\n");
      out.write("        \t$(activeTab).html('正在加载内容，请稍后...');\n");
      out.write("        \tvar url = $(this).attr(\"tab-ajax-url\");\n");
      out.write("        \t$.post(url, {}, function(data) {\n");
      out.write("        \t\t //$(this).attr(\"tab-ajax-cached\", true);\n");
      out.write("        \t\t$(activeTab).html(data);\n");
      out.write("        \t\t\n");
      out.write("            });\n");
      out.write("        }  \n");
      out.write("        return false;  \n");
      out.write("    });  \n");
      out.write("  });\n");
      out.write("  //初始化下标\n");
      out.write("\tfunction resetTrNum(tableId) {\n");
      out.write("\t\t$tbody = $(\"#\"+tableId+\"\");\n");
      out.write("\t\t$tbody.find('>tr').each(function(i){\n");
      out.write("\t\t\t$(':input, select', this).each(function(){\n");
      out.write("\t\t\t\tvar $this = $(this), name = $this.attr('name'), val = $this.val();\n");
      out.write("\t\t\t\tif(name!=null){\n");
      out.write("\t\t\t\t\tif (name.indexOf(\"#index#\") >= 0){\n");
      out.write("\t\t\t\t\t\t$this.attr(\"name\",name.replace('#index#',i));\n");
      out.write("\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\tvar s = name.indexOf(\"[\");\n");
      out.write("\t\t\t\t\t\tvar e = name.indexOf(\"]\");\n");
      out.write("\t\t\t\t\t\tvar new_name = name.substring(s+1,e);\n");
      out.write("\t\t\t\t\t\t$this.attr(\"name\",name.replace(new_name,i));\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t$(this).find('div[name=\\'xh\\']').html(i+1);\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction init(){\n");
      out.write("    \tvar tabHead =$(\"#jform_tab li:first\");\n");
      out.write("    \tvar tabBox = $(\"#jform_tab .con-wrapper:first\"); \n");
      out.write("    \tvar url = tabHead.attr(\"tab-ajax-url\");\n");
      out.write("    \ttabBox.html('正在加载内容，请稍后...');\n");
      out.write("    \t$.post(url, {}, function(data) {\n");
      out.write("            tabBox.html(data);\n");
      out.write("    \t\t//tabHead.attr(\"tab-ajax-cached\", true);\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write(" </script>\n");
      out.write(" <body>\n");
      out.write("  <form id=\"formobj\" action=\"jformOrderMain2Controller.do?");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty mainId?'doAdd':'doUpdate'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"formobj\" method=\"post\">\n");
      out.write("  \t\t\t<input type=\"hidden\" id=\"btn_sub\" class=\"btn_sub\"/>\n");
      out.write("\t\t\t<input name=\"id\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mainId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div id=\"jform_tab\" class=\"tab-wrapper\">\n");
      out.write("\t\n");
      out.write("\t\t\t\t<!-- tab -->\n");
      out.write("\t\t\t\t<ul class=\"nav nav-tabs\">\n");
      out.write("\t\t\t\t\t<li role=\"presentation\" tab-ajax-url=\"jformOrderMain2Controller.do?mainPage&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mainId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&load=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${load}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#con-wrapper0\">订单主信息</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li role=\"presentation\" tab-ajax-url=\"jformOrderMain2Controller.do?jformOrderTicket2List&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mainId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#con-wrapper1\">订单机票信息</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li role=\"presentation\" tab-ajax-url=\"jformOrderMain2Controller.do?jformOrderCustomer2List&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mainId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#con-wrapper2\">订单客户信息</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t <div class=\"con-wrapper\" id=\"con-wrapper0\" style=\"display: none;\"></div>\n");
      out.write("\t\t\t\t\t<div class=\"con-wrapper\" id=\"con-wrapper1\" style=\"display: none;\"></div>\n");
      out.write("\t\t\t\t\t<div class=\"con-wrapper\" id=\"con-wrapper2\" style=\"display: none;\"></div>\n");
      out.write("\t\t\t</div>\t\n");
      out.write("\t\t\t\n");
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
      out.write("</script>\n");
      out.write("\t\t<div align=\"center\"  id = \"sub_tr\" style=\"display: none;\" > <input type=\"button\" value=\"提交\" onclick=\"neibuClick();\" class=\"ui_state_highlight\"></div>\n");
      out.write("\t\t<script src=\"plug-in/layer/layer.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(function() {\n");
      out.write("\t\t\t$(\"#formobj\").Validform({\n");
      out.write("\t\t\t\ttiptype: function(msg, o, cssctl) {\n");
      out.write("\t\t            if (o.type == 3) {\n");
      out.write("\t\t                layer.open({\n");
      out.write("\t\t                    title: '提示信息',\n");
      out.write("\t\t                    content: msg,\n");
      out.write("\t\t                    icon: 5,\n");
      out.write("\t\t                    shift: 6,\n");
      out.write("\t\t                    btn: false,\n");
      out.write("\t\t                    shade:false,time:5000,\n");
      out.write("\t\t                    cancel: function(index) {\n");
      out.write("\t\t                        o.obj.focus();\n");
      out.write("\t\t                        layer.close(index);\n");
      out.write("\t\t                    },\n");
      out.write("\t\t                    yes: function(index) {\n");
      out.write("\t\t                        o.obj.focus();\n");
      out.write("\t\t                        layer.close(index);\n");
      out.write("\t\t                    },\n");
      out.write("\t\t                })\n");
      out.write("\t\t            }\n");
      out.write("\t\t        },\n");
      out.write("\t\t\t\tbtnSubmit: \"#btn_sub\",\n");
      out.write("\t\t\t\tbtnReset: \"#btn_reset\",\n");
      out.write("\t\t\t\tajaxPost: true,\n");
      out.write("\t\t\t\tbeforeSubmit: function(curform) {\n");
      out.write("\t\t\t\t\tvar tag = true;\n");
      out.write("\t\t\t\t\t//提交前处理\n");
      out.write("\t\t\t\t\treturn tag;\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tusePlugin: {\n");
      out.write("\t\t\t\t\tpasswordstrength: {\n");
      out.write("\t\t\t\t\t\tminLen: 6,\n");
      out.write("\t\t\t\t\t\tmaxLen: 18,\n");
      out.write("\t\t\t\t\t\ttrigger: function(obj, error) {\n");
      out.write("\t\t\t\t\t\t\tif (error) {\n");
      out.write("\t\t\t\t\t\t\t\tobj.parent().next().find(\".Validform_checktip\").show();\n");
      out.write("\t\t\t\t\t\t\t\tobj.find(\".passwordStrength\").hide();\n");
      out.write("\t\t\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t\t\t$(\".passwordStrength\").show();\n");
      out.write("\t\t\t\t\t\t\t\tobj.parent().next().find(\".Validform_checktip\").hide();\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tcallback: function(data) {\n");
      out.write("\t\t\t\t\t\tif (data.success == true) {\n");
      out.write("\t\t\t\t\t\t\t var win = frameElement.api.opener;\n");
      out.write("\t\t\t\t\t\t\t win.reloadTable();\n");
      out.write("\t\t\t\t\t\t\t win.tip(data.msg);\n");
      out.write("\t\t\t\t\t\t\t frameElement.api.close();\n");
      out.write("\t\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t\tif (data.responseText == '' || data.responseText == undefined) {\n");
      out.write("\t\t\t\t\t\t\t\t$.messager.alert('错误', data.msg);\n");
      out.write("\t\t\t\t\t\t\t\t$.Hidemsg();\n");
      out.write("\t\t\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t\t\ttry {\n");
      out.write("\t\t\t\t\t\t\t\t\tvar emsg = data.responseText.substring(data.responseText.indexOf('错误描述'), data.responseText.indexOf('错误信息'));\n");
      out.write("\t\t\t\t\t\t\t\t\t$.messager.alert('错误', emsg);\n");
      out.write("\t\t\t\t\t\t\t\t\t$.Hidemsg();\n");
      out.write("\t\t\t\t\t\t\t\t} catch(ex) {\n");
      out.write("\t\t\t\t\t\t\t\t\t$.messager.alert('错误', data.responseText + '');\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t\t\t} \n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("\t\t\n");
      out.write("\t\t</form>\n");
      out.write("\t\t<!-- 添加 产品明细 模版 -->\n");
      out.write("\t\t<table style=\"display:none\">\n");
      out.write("\t\t\t<tbody id=\"add_jformOrderTicket2_table_template\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t <td><input style=\"width:20px;\" type=\"checkbox\" name=\"ck\"/></td>\n");
      out.write("\t\t\t\t\t <td scope=\"row\"><div name=\"xh\"></div></td>\n");
      out.write("\t\t\t\t\t\t  <td align=\"left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input name=\"jformOrderTicket2List[#index#].ticketCode\" maxlength=\"100\"  datatype=\"*\"  ignore=\"checked\"  type=\"text\" class=\"form-control\"  style=\"width:120px;\" />\n");
      out.write("\t\t\t\t\t\t  </td>\n");
      out.write("\t\t\t\t\t\t  <td align=\"left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input name=\"jformOrderTicket2List[#index#].tickectDate\" maxlength=\"10\" type=\"text\"  class=\"form-control\" onClick=\"WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})\"  style=\"background: url('plug-in/ace/images/datetime.png') no-repeat scroll right center transparent;width:120px;\" datatype=\"*\"  ignore=\"checked\" />\n");
      out.write("\t\t\t\t\t\t  </td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t </tbody>\n");
      out.write("\t\t\t<tbody id=\"add_jformOrderCustomer2_table_template\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t <td><input style=\"width:20px;\" type=\"checkbox\" name=\"ck\"/></td>\n");
      out.write("\t\t\t\t\t <td scope=\"row\"><div name=\"xh\"></div></td>\n");
      out.write("\t\t\t\t\t\t  <td align=\"left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input name=\"jformOrderCustomer2List[#index#].name\" maxlength=\"32\"  ignore=\"ignore\"  type=\"text\" class=\"form-control\"  style=\"width:120px;\" />\n");
      out.write("\t\t\t\t\t\t  </td>\n");
      out.write("\t\t\t\t\t\t  <td align=\"left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input name=\"jformOrderCustomer2List[#index#].money\" maxlength=\"10\"  datatype=\"/^(-?\\d+)(\\.\\d+)?$/\"  ignore=\"ignore\"  type=\"text\" class=\"form-control\"  style=\"width:120px;\" />\n");
      out.write("\t\t\t\t\t\t  </td>\n");
      out.write("\t\t\t\t\t\t  <td align=\"left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_dictSelect_0(_jspx_page_context))
        return;
      out.write("     \n");
      out.write("\t\t\t\t\t\t  </td>\n");
      out.write("\t\t\t\t\t\t  <td align=\"left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input name=\"jformOrderCustomer2List[#index#].telphone\" maxlength=\"32\"  ignore=\"ignore\"  type=\"text\" class=\"form-control\"  style=\"width:120px;\" />\n");
      out.write("\t\t\t\t\t\t  </td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t </tbody>\n");
      out.write("\t\t</table>\n");
      out.write(" </body>\n");
      out.write(" </html>");
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

  private boolean _jspx_meth_t_dictSelect_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_0 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_0.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_0.setParent(null);
    _jspx_th_t_dictSelect_0.setField("jformOrderCustomer2List[#index#].sex");
    _jspx_th_t_dictSelect_0.setType("list");
    _jspx_th_t_dictSelect_0.setExtendJson("{class:'form-control',style:'width:150px'}");
    _jspx_th_t_dictSelect_0.setTypeGroupCode("sex");
    _jspx_th_t_dictSelect_0.setDefaultVal("");
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
