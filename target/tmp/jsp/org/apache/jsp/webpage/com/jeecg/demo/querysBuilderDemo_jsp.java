package org.apache.jsp.webpage.com.jeecg.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class querysBuilderDemo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_base_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_datagrid_title_queryMode_name_idField_extendParams_checkbox_actionUrl;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_title_hidden_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_title_query_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_title_queryMode_query_formatter_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_title_sortable_query_field_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dgCol_title_query_formatter_field_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_datagrid_title_queryMode_name_idField_extendParams_checkbox_actionUrl = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_title_hidden_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_title_query_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_title_queryMode_query_formatter_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_title_sortable_query_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dgCol_title_query_formatter_field_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
    _jspx_tagPool_t_datagrid_title_queryMode_name_idField_extendParams_checkbox_actionUrl.release();
    _jspx_tagPool_t_dgCol_title_hidden_field_nobody.release();
    _jspx_tagPool_t_dgCol_title_query_field_nobody.release();
    _jspx_tagPool_t_dgCol_title_queryMode_query_formatter_field_nobody.release();
    _jspx_tagPool_t_dgCol_title_sortable_query_field_nobody.release();
    _jspx_tagPool_t_dgCol_title_query_formatter_field_nobody.release();
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
      out.write('\n');
      if (_jspx_meth_t_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<style>\n");
      out.write("ul {\n");
      out.write("    list-style-type: none;\n");
      out.write("    list-style-image: none;\n");
      out.write("    margin-bottom: 3px;\n");
      out.write("}\n");
      out.write("li {\n");
      out.write("    margin-bottom: 3px;\n");
      out.write("}\n");
      out.write(".conditionType {\n");
      out.write("    display: block;\n");
      out.write("    margin-bottom: 3px;\n");
      out.write("    padding: 3px 0 3px;\n");
      out.write("    width: 100%;\n");
      out.write("}select {\n");
      out.write("    padding-right: 2px!important;\n");
      out.write("}\n");
      out.write("select {\n");
      out.write("    padding: 5px 7px;\n");
      out.write("}\n");
      out.write("textarea, input[type=text], input[type=password], select {\n");
      out.write("    font-family: \"Verdana\",\"微软雅黑\",\"宋体\",\"Lucida Grande\";\n");
      out.write("    padding: 3px;\n");
      out.write("    border: 1px solid #ddd;\n");
      out.write("    outline: 0;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("#dsUL .conditionSelect {\n");
      out.write("    width: 200px;\n");
      out.write("}\n");
      out.write(".datagrid .panel-body {\n");
      out.write("\tposition: relative;\n");
      out.write("    overflow: auto;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<div class=\"easyui-layout\" fit=\"true\">\n");
      out.write("\t<div region=\"center\" style=\"padding: 1px;\">\n");
      out.write("\t\t");
      if (_jspx_meth_t_datagrid_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t<div id=\"jeecgDemoListquerytb\"  style=\"padding: 3px; height: 67px\">\n");
      out.write("\t\t\t<div style=\"float: left;\">\n");
      out.write("\t\t  \t\t<ul id=\"dsUL\">\n");
      out.write("\t\t\t\t\t<li id=\"anyAll\" class=\"conditionType\">\n");
      out.write("                    \t<span class=\"anyAll\">\n");
      out.write("\t\t\t\t\t\t\t过滤条件匹配： \n");
      out.write("                        \t<select id=\"anyallSelect\" name=\"mchtyp\" style=\"width:200px\" class=\"select\">\n");
      out.write("                            \t<option value=\"and\" selected=\"selected\">And(所有条件都要求匹配)</option>\n");
      out.write("                            \t<option value=\"or\" >Or(条件中的任何一个匹配)</option>\n");
      out.write("                            </select>\n");
      out.write("                        </span>\n");
      out.write("                    </li>\n");
      out.write("    \t\t\t\t<li id=\"dsLI\" name=\"dsLI\" class=\"conditions oop\">\n");
      out.write("    \t\t\t\t\t<span>\n");
      out.write("    \t\t\t\t\t\t<select id=\"field\" name=\"cons[0].fld\" id=\"orgCode\" >\n");
      out.write("    \t\t\t\t\t\t\t<option value=\"\">&nbsp;</option>\n");
      out.write("    \t\t\t\t\t\t\t<option value=\"name\">用户名</option>\n");
      out.write("    \t\t\t\t\t\t\t<option value=\"content\">个人介绍</option>\n");
      out.write("    \t\t\t\t\t\t\t<option value=\"phone\">办公电话</option>\n");
      out.write("    \t\t\t\t\t\t\t<option value=\"createDate\">创建日期</option>\n");
      out.write("    \t\t\t\t\t\t\t<option value=\"email\">邮箱</option>\n");
      out.write("    \t\t\t\t\t\t\t<option value=\"age\">年龄</option>\n");
      out.write("    \t\t\t\t\t\t\t<option value=\"salary\">工资</option>\n");
      out.write("    \t\t\t\t\t\t\t<option value=\"birthday\">生日</option>\n");
      out.write("    \t\t\t\t\t\t</select>\n");
      out.write("    \t\t\t\t\t</span>\n");
      out.write("    \t\t\t\t\t<span>\n");
      out.write("                        \t<select id=\"condition\" name=\"cons[0].ctyp\" class=\"compareType\" style=\"width:150px\">\n");
      out.write("\t\t\t\t\t\t\t\t<option>&nbsp;</option>\n");
      out.write("\t    \t\t\t\t\t\t<option value=\"=\">等于</option>\n");
      out.write("\t    \t\t\t\t\t\t<option value=\"!=\" >不等于</option>\n");
      out.write("\t    \t\t\t\t\t\t<option value=\">\" >大于</option>\n");
      out.write("\t    \t\t\t\t\t\t<option value=\">=\" >大于等于</option>\n");
      out.write("\t    \t\t\t\t\t\t<option value=\"lt\" >小于</option>\n");
      out.write("\t    \t\t\t\t\t\t<option value=\"lte\" >小于等于</option>\n");
      out.write("\t    \t\t\t\t\t\t<option value=\"likeBegin\" >以...开始</option>\n");
      out.write("\t    \t\t\t\t\t\t<option value=\"likeEnd\" >以...结束</option>\n");
      out.write("\t    \t\t\t\t\t\t<option value=\"like\" >包含</option>\n");
      out.write("\t    \t\t\t\t\t\t<option value=\"not like\" >不包含</option>\n");
      out.write("\t    \t\t\t\t\t\t<option value=\"in\" >在...中</option>\n");
      out.write("\t    \t\t\t\t\t\t<option value=\"not in\" >不在...中</option>\n");
      out.write("    \t\t\t\t\t\t</select>\n");
      out.write("                      \t</span>\n");
      out.write("    \t\t\t\t\t<span style=\"position: relative; z-index: 2000;\">\n");
      out.write("    \t\t\t\t\t\t<input id=\"conValue\" name=\"cons[0].val\" type=\"text\" class=\"text conditionValue\" title=\"\">\n");
      out.write("    \t\t\t\t\t</span>\n");
      out.write("    \t\t\t\t\t<span>\n");
      out.write("                            <a id=\"add\" href=\"javascript:addULChild()\" class=\"fa fa-plus-square\" title=\"添加一个新的过滤条件\" style=\"margin-left: 3px;\"></a>\n");
      out.write("                            <a id=\"delete\" href=\"javascript:void(0)\" onclick=\"deleteULChild(this)\" class=\"fa fa-minus-square\" title=\"删除此过滤条件\" style=\"margin-left: 23px;\"></a>\n");
      out.write("    \t\t\t\t\t</span>\n");
      out.write("    \t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div style=\"float: right;\">\n");
      out.write("\t\t\t\t <input  id=\"_sqlbuilder\" name=\"sqlbuilder\"   type=\"hidden\" />\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-search\" onclick=\"mySearch()\" >查询</a>\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-reload\" onclick=\"searchReset()\">重置</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("  \t  \t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function mySearch() {\n");
      out.write("\t//多条件查询\n");
      out.write("\t//-----------------------\n");
      out.write("\tvar idIndex = 100;\n");
      out.write("\t\t//获取页面上And，Or\n");
      out.write("\t\tvar relation = $(\"#anyallSelect\").val();\n");
      out.write("\t\tvar dsli = document.getElementsByName(\"dsLI\");\n");
      out.write("\t\tvar json = new StringBuffer();\n");
      out.write("\t\t$(dsli).each(function(i){\n");
      out.write("\t\t\tidIndex++;\n");
      out.write("\t\t\tvar field = $(this).find(\"select[id='field']\").val();\n");
      out.write("\t\t\tvar condition = $(this).find(\"select[id='condition']\").val();\n");
      out.write("\t\t\tvar cValue = $(this).find(\"input[id='conValue']\").val();\n");
      out.write("\t\t\t//判断输入的是否为时期格式\n");
      out.write("\t\t\tif(CheckDate(cValue)) {\n");
      out.write("\t\t\t\tif(condition == \"=\") {\n");
      out.write("\t\t\t\t\tcondition = \"like\";\n");
      out.write("\t\t\t\t\tcValue = \"%\" + cValue;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t//判断condition条件，改变sql查询条件\n");
      out.write("\t\t\tif(condition == \"lt\") {\n");
      out.write("\t\t\t\tcondition = \"<\";\n");
      out.write("\t\t\t} else if(condition == \"lte\") {\n");
      out.write("\t\t\t\tcondition = \"<=\"\n");
      out.write("\t\t\t} else if(condition == \"like\") {\n");
      out.write("\t\t\t\tcondition = \"like\";\n");
      out.write("\t\t\t\tcValue = \"%\"+cValue+\"%\";\n");
      out.write("\t\t\t} else if(condition == \"not like\") {\n");
      out.write("\t\t\t\tcondition = \"not like\";\n");
      out.write("\t\t\t\tcValue = \"%\"+cValue+\"%\";\n");
      out.write("\t\t\t} else if(condition == \"likeBegin\") {\n");
      out.write("\t\t\t\tcondition = \"like\";\n");
      out.write("\t\t\t\tcValue = cValue+\"%\";\n");
      out.write("\t\t\t} else if(condition == \"likeEnd\"){\n");
      out.write("\t\t\t\tcondition = \"like\";\n");
      out.write("\t\t\t\tcValue = \"%\"+cValue;\n");
      out.write("\t\t\t} else if(condition == \"in\") {\n");
      out.write("\t\t\t\tcondition = \"in\";\n");
      out.write("\t\t\t\tcValue = \"\\(\"+cValue+\"\\)\"\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tif(i == 0) {\n");
      out.write("\t\t\t\tjson.append(\"[{\\\"id\\\":\"+idIndex+\",\\\"field\\\":\\\"\"+field+\"\\\",\\\"condition\\\":\\\"\"+condition+\"\\\",\\\"value\\\":\\\"\"+cValue+\"\\\",\\\"relation\\\":\\\"\"+relation+\"\\\",\\\"state\\\":\\\"open\\\"}\");\t\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tif(i != 0) {\n");
      out.write("\t\t\t\tjson.append(\",{\\\"id\\\":\"+idIndex+\",\\\"field\\\":\\\"\"+field+\"\\\",\\\"condition\\\":\\\"\"+condition+\"\\\",\\\"value\\\":\\\"\"+cValue+\"\\\",\\\"relation\\\":\\\"\"+relation+\"\\\",\\\"state\\\":\\\"open\\\"}\");\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t\tjson.append(\"]\");\n");
      out.write("\t\t$(\"#_sqlbuilder\").val(json.toString());\n");
      out.write("\t//-----------------------\n");
      out.write("\tjeecgDemoListquerysearch();\n");
      out.write("}\n");
      out.write("\n");
      out.write("\t//添加StringBuffer\n");
      out.write("\tfunction StringBuffer(){  \n");
      out.write("\t    this.strings = new Array;  \n");
      out.write("\t}  \n");
      out.write("\t  \n");
      out.write("\tStringBuffer.prototype.append=function(str){  \n");
      out.write("\t    this.strings.push(str); //追加指定元素  \n");
      out.write("\t};  \n");
      out.write("\t  \n");
      out.write("\tStringBuffer.prototype.toString = function(){  \n");
      out.write("\t    return this.strings.join(\"\"); //向数组之间的元素插入指定字符串（此处为空字符串），并返回。  \n");
      out.write("\t};\n");
      out.write("\t//添加相同的li\n");
      out.write("\tfunction addULChild() {\n");
      out.write("\t\tvar\tmyUl = document.getElementById(\"dsUL\");\n");
      out.write("\t\tvar myLi = document.getElementById(\"dsLI\");\n");
      out.write("\t\tvar newLi = document.createElement(\"li\");\n");
      out.write("\t\tnewLi.setAttribute(\"name\",\"dsLI\");\n");
      out.write("\t\t$(newLi).addClass(\"oop\");\n");
      out.write("\t\tnewLi.innerHTML=myLi.innerHTML;\n");
      out.write("\t\tmyUl.appendChild(newLi);\n");
      out.write("\t\tresetTrNum();\n");
      out.write("\t}\n");
      out.write("\t//初始化下标\n");
      out.write("\tfunction resetTrNum() {\n");
      out.write("\t\t $('#dsUL').find('li').each(function(i){\n");
      out.write("\t\t\t$(':input,select',this).each(function(){\n");
      out.write("\t\t\t\tvar thisli = $(this);\n");
      out.write("\t\t\t\tvar name = thisli.attr('name');\n");
      out.write("\t\t\t\tif(name!=null){\n");
      out.write("\t\t\t\tvar reg=new RegExp(\"^cons\");\n");
      out.write("\t    \t\t\tif(reg.test(name)) {\n");
      out.write("\t    \t\t\t\tif(name.indexOf(\"#index#\") >= 0) {\n");
      out.write("\t    \t\t\t\t\tthisli.attr(\"name\",name.replace('#index#',i-1));\n");
      out.write("\t    \t\t\t\t}else {\n");
      out.write("\t    \t\t\t\t\tvar s = name.indexOf(\"[\");\n");
      out.write("\t    \t\t\t\t\tvar e = name.indexOf(\"]\");\n");
      out.write("\t    \t\t\t\t\tvar new_name = name.substring(s+1,e);\n");
      out.write("\t    \t\t\t\t\tthisli.attr(\"name\",name.replace(new_name,i-1));\n");
      out.write("\t    \t\t\t\t}\n");
      out.write("\t    \t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\t//删除当前li\n");
      out.write("\tfunction deleteULChild(col) {\n");
      out.write("\t\tvar dsli = document.getElementsByName(\"dsLI\");\n");
      out.write("\t\t//判断最后剩一个li则不删除\n");
      out.write("\t\t$(dsli).each(function(i){\n");
      out.write("\t\t\tif(i!=0) {\n");
      out.write("\t\t\t\t$(col).closest(\"li\").remove();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t})\n");
      out.write("\t\tresetTrNum();\n");
      out.write("\t}\n");
      out.write("\t//重置按钮，清空所有\n");
      out.write("\tfunction searchReset() {\n");
      out.write("\t\t$(\"#dsUL\").find(\".oop:gt(0)\").remove();\n");
      out.write("\t    $(\"#dsLI\").find(\":input\").val(\"\");\n");
      out.write("\t    $(\"#_sqlbuilder\").val(null);\n");
      out.write("\t    jeecgDemoListquerysearch();\n");
      out.write("\t}\n");
      out.write("\t//判断输入的是否为日期格式\n");
      out.write("\tfunction CheckDate(strInputDate) {\n");
      out.write("\t\t  if (strInputDate == \"\") return false;\n");
      out.write("\t\t  strInputDate = strInputDate.replace(/-/g, \"/\");\n");
      out.write("\t\t  var d = new Date(strInputDate);\n");
      out.write("\t\t  if (isNaN(d)) return false;\n");
      out.write("\t\t  var arr = strInputDate.split(\"/\");\n");
      out.write("\t\t  return ((parseInt(arr[0], 10) == d.getFullYear()) && (parseInt(arr[1], 10) == (d.getMonth() + 1)) && (parseInt(arr[2], 10) == d.getDate()));\n");
      out.write("\t}\n");
      out.write("</script>\n");
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

  private boolean _jspx_meth_t_datagrid_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:datagrid
    org.jeecgframework.tag.core.easyui.DataGridTag _jspx_th_t_datagrid_0 = (org.jeecgframework.tag.core.easyui.DataGridTag) _jspx_tagPool_t_datagrid_title_queryMode_name_idField_extendParams_checkbox_actionUrl.get(org.jeecgframework.tag.core.easyui.DataGridTag.class);
    _jspx_th_t_datagrid_0.setPageContext(_jspx_page_context);
    _jspx_th_t_datagrid_0.setParent(null);
    _jspx_th_t_datagrid_0.setName("jeecgDemoListquery");
    _jspx_th_t_datagrid_0.setTitle("多条件动态查询");
    _jspx_th_t_datagrid_0.setActionUrl("jeecgListDemoController.do?datagrid");
    _jspx_th_t_datagrid_0.setIdField("id");
    _jspx_th_t_datagrid_0.setQueryMode("group");
    _jspx_th_t_datagrid_0.setCheckbox(true);
    _jspx_th_t_datagrid_0.setExtendParams((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("headerContextMenu: [\n                { text: '保存列定义', iconCls: 'icon-save', disabled: false, handler: function () { saveHeader(); } },\n                { text: '自定义菜单', iconCls: 'icon-reload', disabled: false, handler: function (e, field) { alert($.string.format('您点击了{0}', field)); } }\n            ],", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_t_datagrid_0 = _jspx_th_t_datagrid_0.doStartTag();
    if (_jspx_eval_t_datagrid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_t_dgCol_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_t_dgCol_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_t_dgCol_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_t_dgCol_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_t_dgCol_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_t_dgCol_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_t_dgCol_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_t_dgCol_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_t_dgCol_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_datagrid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_t_datagrid_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_datagrid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_datagrid_title_queryMode_name_idField_extendParams_checkbox_actionUrl.reuse(_jspx_th_t_datagrid_0);
      return true;
    }
    _jspx_tagPool_t_datagrid_title_queryMode_name_idField_extendParams_checkbox_actionUrl.reuse(_jspx_th_t_datagrid_0);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_0 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_title_hidden_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_0.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_0.setTitle("编号");
    _jspx_th_t_dgCol_0.setField("id");
    _jspx_th_t_dgCol_0.setHidden(true);
    int _jspx_eval_t_dgCol_0 = _jspx_th_t_dgCol_0.doStartTag();
    if (_jspx_th_t_dgCol_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_title_hidden_field_nobody.reuse(_jspx_th_t_dgCol_0);
      return true;
    }
    _jspx_tagPool_t_dgCol_title_hidden_field_nobody.reuse(_jspx_th_t_dgCol_0);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_1 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_title_query_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_1.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_1.setTitle("用户名");
    _jspx_th_t_dgCol_1.setField("name");
    _jspx_th_t_dgCol_1.setQuery(false);
    int _jspx_eval_t_dgCol_1 = _jspx_th_t_dgCol_1.doStartTag();
    if (_jspx_th_t_dgCol_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_title_query_field_nobody.reuse(_jspx_th_t_dgCol_1);
      return true;
    }
    _jspx_tagPool_t_dgCol_title_query_field_nobody.reuse(_jspx_th_t_dgCol_1);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_2 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_title_query_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_2.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_2.setTitle("个人介绍");
    _jspx_th_t_dgCol_2.setField("content");
    _jspx_th_t_dgCol_2.setQuery(false);
    int _jspx_eval_t_dgCol_2 = _jspx_th_t_dgCol_2.doStartTag();
    if (_jspx_th_t_dgCol_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_title_query_field_nobody.reuse(_jspx_th_t_dgCol_2);
      return true;
    }
    _jspx_tagPool_t_dgCol_title_query_field_nobody.reuse(_jspx_th_t_dgCol_2);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_3(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_3 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_title_query_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_3.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_3.setTitle("办公电话");
    _jspx_th_t_dgCol_3.setField("phone");
    _jspx_th_t_dgCol_3.setQuery(false);
    int _jspx_eval_t_dgCol_3 = _jspx_th_t_dgCol_3.doStartTag();
    if (_jspx_th_t_dgCol_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_title_query_field_nobody.reuse(_jspx_th_t_dgCol_3);
      return true;
    }
    _jspx_tagPool_t_dgCol_title_query_field_nobody.reuse(_jspx_th_t_dgCol_3);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_4(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_4 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_title_queryMode_query_formatter_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_4.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_4.setTitle("创建日期");
    _jspx_th_t_dgCol_4.setField("createDate");
    _jspx_th_t_dgCol_4.setFormatter("yyyy-MM-dd");
    _jspx_th_t_dgCol_4.setQuery(false);
    _jspx_th_t_dgCol_4.setQueryMode("group");
    int _jspx_eval_t_dgCol_4 = _jspx_th_t_dgCol_4.doStartTag();
    if (_jspx_th_t_dgCol_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_title_queryMode_query_formatter_field_nobody.reuse(_jspx_th_t_dgCol_4);
      return true;
    }
    _jspx_tagPool_t_dgCol_title_queryMode_query_formatter_field_nobody.reuse(_jspx_th_t_dgCol_4);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_5(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_5 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_title_query_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_5.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_5.setTitle("邮箱");
    _jspx_th_t_dgCol_5.setField("email");
    _jspx_th_t_dgCol_5.setQuery(false);
    int _jspx_eval_t_dgCol_5 = _jspx_th_t_dgCol_5.doStartTag();
    if (_jspx_th_t_dgCol_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_title_query_field_nobody.reuse(_jspx_th_t_dgCol_5);
      return true;
    }
    _jspx_tagPool_t_dgCol_title_query_field_nobody.reuse(_jspx_th_t_dgCol_5);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_6(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_6 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_title_sortable_query_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_6.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_6.setTitle("年龄");
    _jspx_th_t_dgCol_6.setSortable(true);
    _jspx_th_t_dgCol_6.setField("age");
    _jspx_th_t_dgCol_6.setQuery(false);
    int _jspx_eval_t_dgCol_6 = _jspx_th_t_dgCol_6.doStartTag();
    if (_jspx_th_t_dgCol_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_title_sortable_query_field_nobody.reuse(_jspx_th_t_dgCol_6);
      return true;
    }
    _jspx_tagPool_t_dgCol_title_sortable_query_field_nobody.reuse(_jspx_th_t_dgCol_6);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_7(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_7 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_title_query_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_7.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_7.setTitle("工资");
    _jspx_th_t_dgCol_7.setField("salary");
    _jspx_th_t_dgCol_7.setQuery(false);
    int _jspx_eval_t_dgCol_7 = _jspx_th_t_dgCol_7.doStartTag();
    if (_jspx_th_t_dgCol_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_title_query_field_nobody.reuse(_jspx_th_t_dgCol_7);
      return true;
    }
    _jspx_tagPool_t_dgCol_title_query_field_nobody.reuse(_jspx_th_t_dgCol_7);
    return false;
  }

  private boolean _jspx_meth_t_dgCol_8(javax.servlet.jsp.tagext.JspTag _jspx_th_t_datagrid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_dgCol_8 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _jspx_tagPool_t_dgCol_title_query_formatter_field_nobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_dgCol_8.setPageContext(_jspx_page_context);
    _jspx_th_t_dgCol_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_datagrid_0);
    _jspx_th_t_dgCol_8.setTitle("生日");
    _jspx_th_t_dgCol_8.setField("birthday");
    _jspx_th_t_dgCol_8.setFormatter("yyyy/MM/dd");
    _jspx_th_t_dgCol_8.setQuery(false);
    int _jspx_eval_t_dgCol_8 = _jspx_th_t_dgCol_8.doStartTag();
    if (_jspx_th_t_dgCol_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dgCol_title_query_formatter_field_nobody.reuse(_jspx_th_t_dgCol_8);
      return true;
    }
    _jspx_tagPool_t_dgCol_title_query_formatter_field_nobody.reuse(_jspx_th_t_dgCol_8);
    return false;
  }
}
