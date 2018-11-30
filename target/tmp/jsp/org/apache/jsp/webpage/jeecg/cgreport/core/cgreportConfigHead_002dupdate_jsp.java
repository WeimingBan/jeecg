package org.apache.jsp.webpage.jeecg.cgreport.core;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class cgreportConfigHead_002dupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_mutiLang_langKey_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dictSelect_field_dictText_dictTable_dictField_defaultVal_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dictSelect_typeGroupCode_hasLabel_field_defaultVal_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_tabs_tabPosition_iframe_id_fit;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_tab_title_id_icon_href_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_formvalid_usePlugin_tiptype_layout_formid_dialog_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_mutiLang_langKey_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dictSelect_field_dictText_dictTable_dictField_defaultVal_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dictSelect_typeGroupCode_hasLabel_field_defaultVal_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_tabs_tabPosition_iframe_id_fit = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_tab_title_id_icon_href_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
    _jspx_tagPool_t_formvalid_usePlugin_tiptype_layout_formid_dialog_action.release();
    _jspx_tagPool_t_mutiLang_langKey_nobody.release();
    _jspx_tagPool_t_dictSelect_field_dictText_dictTable_dictField_defaultVal_nobody.release();
    _jspx_tagPool_t_dictSelect_typeGroupCode_hasLabel_field_defaultVal_nobody.release();
    _jspx_tagPool_t_tabs_tabPosition_iframe_id_fit.release();
    _jspx_tagPool_t_tab_title_id_icon_href_nobody.release();
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>动态报表配置抬头</title>\n");
      if (_jspx_meth_t_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("  $(document).ready(function(){\n");
      out.write("\t$('#tt').tabs({\n");
      out.write("\t   onSelect:function(title){\n");
      out.write("\t       $('#tt .panel-body').css('width','auto');\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t$('#ttp').tabs({\n");
      out.write("\t\t   onSelect:function(title){\n");
      out.write("\t\t       $('#ttp .panel-body').css('width','auto');\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("  });\n");
      out.write(" //初始化下标\n");
      out.write("\tfunction resetTrNum(tableId) {\n");
      out.write("\t\t$tbody = $(\"#\"+tableId+\"\");\n");
      out.write("\t\t$tbody.find('>tr').each(function(i){\n");
      out.write("\t\t\t$(':input, select,button,a', this).each(function(){\n");
      out.write("\t\t\t\tvar $this = $(this), name = $this.attr('name'),id=$this.attr('id'),onclick_str=$this.attr('onclick'), val = $this.val();\n");
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
      out.write("\t\t\t\tif(id!=null){\n");
      out.write("\t\t\t\t\tif (id.indexOf(\"#index#\") >= 0){\n");
      out.write("\t\t\t\t\t\t$this.attr(\"id\",id.replace('#index#',i));\n");
      out.write("\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\tvar s = id.indexOf(\"[\");\n");
      out.write("\t\t\t\t\t\tvar e = id.indexOf(\"]\");\n");
      out.write("\t\t\t\t\t\tvar new_id = id.substring(s+1,e);\n");
      out.write("\t\t\t\t\t\t$this.attr(\"id\",id.replace(new_id,i));\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif(onclick_str!=null){\n");
      out.write("\t\t\t\t\tif (onclick_str.indexOf(\"#index#\") >= 0){\n");
      out.write("\t\t\t\t\t\t$this.attr(\"onclick\",onclick_str.replace(/#index#/g,i));\n");
      out.write("\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\tfunction decode(value, id) {//value传入值,id接受值\n");
      out.write("\t\tvar last = value.lastIndexOf(\"/\");\n");
      out.write("\t\tvar filename = value.substring(last + 1, value.length);\n");
      out.write("\t\t$(\"#\" + id).text(decodeURIComponent(filename));\n");
      out.write("\t}\n");
      out.write(" </script>\n");
      out.write("</head>\n");
      out.write("<body style=\"overflow-x: hidden;\">\n");
      //  t:formvalid
      org.jeecgframework.tag.core.easyui.FormValidationTag _jspx_th_t_formvalid_0 = (org.jeecgframework.tag.core.easyui.FormValidationTag) _jspx_tagPool_t_formvalid_usePlugin_tiptype_layout_formid_dialog_action.get(org.jeecgframework.tag.core.easyui.FormValidationTag.class);
      _jspx_th_t_formvalid_0.setPageContext(_jspx_page_context);
      _jspx_th_t_formvalid_0.setParent(null);
      _jspx_th_t_formvalid_0.setFormid("formobj");
      _jspx_th_t_formvalid_0.setDialog(true);
      _jspx_th_t_formvalid_0.setUsePlugin("password");
      _jspx_th_t_formvalid_0.setLayout("table");
      _jspx_th_t_formvalid_0.setTiptype("1");
      _jspx_th_t_formvalid_0.setAction("cgreportConfigHeadController.do?doUpdate");
      int _jspx_eval_t_formvalid_0 = _jspx_th_t_formvalid_0.doStartTag();
      if (_jspx_eval_t_formvalid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t<input id=\"id\" name=\"id\" type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgreportConfigHeadPage.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("\t<table cellpadding=\"0\" cellspacing=\"1\" class=\"formtable\">\n");
          out.write("\t\t<tr>\n");
          out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\">");
          if (_jspx_meth_t_mutiLang_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write(":</label></td>\n");
          out.write("\t\t\t<td class=\"value\"><input id=\"code\" name=\"code\" type=\"text\" style=\"width: 150px\" class=\"inputxt\" datatype=\"*\" value='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgreportConfigHeadPage.code}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'> <span class=\"Validform_checktip\"></span></td>\n");
          out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\">");
          if (_jspx_meth_t_mutiLang_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write(" :</label></td>\n");
          out.write("\t\t\t<td class=\"value\"><input id=\"name\" name=\"name\" type=\"text\" style=\"width: 150px\" class=\"inputxt\" datatype=\"*\" value='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgreportConfigHeadPage.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'> <span class=\"Validform_checktip\"></span></td>\n");
          out.write("            <td align=\"right\"><label class=\"Validform_label\">");
          if (_jspx_meth_t_mutiLang_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write(" :</label></td>\n");
          out.write("            <td class=\"value\">");
          if (_jspx_meth_t_dictSelect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("<span class=\"Validform_checktip\"></span></td>\n");
          out.write("        </tr>\n");
          out.write("\t\t<tr>\n");
          out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\">");
          if (_jspx_meth_t_mutiLang_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write(":</label></td>\n");
          out.write("\t\t\t<td class=\"value\" colspan=\"5\"><textarea rows=\"5\" cols=\"150\" id=\"cgrSql\" name=\"cgrSql\" datatype=\"*\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgreportConfigHeadPage.cgrSql}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</textarea> <span class=\"Validform_checktip\"></span>\n");
          out.write("\t\t\t\t\t\t <p>&nbsp;&nbsp;&nbsp;&nbsp;您可以键入“");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${abc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("”作为一个参数，这里abc是参数的名称。例如：<br/>\n");
          out.write("\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;select * from table where id = ");
          out.print("${abc}");
          out.write("。<br/>\n");
          out.write("\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;select * from table where id like concat('%',");
          out.print("${abc}");
          out.write(",'%')。(mysql模糊查询)<br/>\n");
          out.write("\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;select * from table where id like '%'||");
          out.print("${abc}");
          out.write("||'%'。(oracle模糊查询)<br/>\n");
          out.write("\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;select * from table where id like '%'+");
          out.print("${abc}");
          out.write("+'%'。(sqlserver模糊查询)<br/>\n");
          out.write("\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"red\">注：参数只支持动态报表，popup暂不支持</font><p/>\n");
          out.write("\t\t\t</td>\n");
          out.write("\t\t</tr>\n");
          out.write("\t\t<tr>\n");
          out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\">");
          if (_jspx_meth_t_mutiLang_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write(":</label></td>\n");
          out.write("\n");
          out.write("\t\t\t<td class=\"value\" colspan=\"5\"><textarea rows=\"3\" cols=\"150\" id=\"content\" name=\"content\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgreportConfigHeadPage.content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</textarea> <span class=\"Validform_checktip\"></span></td>\n");
          out.write("\n");
          out.write("\t\t</tr>\n");
          out.write("\t\t<tr>\n");
          out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\">");
          if (_jspx_meth_t_mutiLang_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write(":</label></td>\n");
          out.write("\t\t\t<td class=\"value\"><input id=\"returnValField\" name=\"returnValField\" type=\"text\" style=\"width: 150px\" class=\"inputxt\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgreportConfigHeadPage.returnValField}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> <span class=\"Validform_checktip\"></span></td>\n");
          out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\">");
          if (_jspx_meth_t_mutiLang_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write(":</label></td>\n");
          out.write("\t\t\t<td class=\"value\"><input id=\"returnTxtField\" name=\"returnTxtField\" type=\"text\" style=\"width: 150px\" class=\"inputxt\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgreportConfigHeadPage.returnTxtField}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> <span class=\"Validform_checktip\"></span></td>\n");
          out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\">");
          if (_jspx_meth_t_mutiLang_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write(":</label></td>\n");
          out.write("\t\t\t<td class=\"value\" colspan=\"3\"> ");
          if (_jspx_meth_t_dictSelect_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("<span class=\"Validform_checktip\"></span></td>\n");
          out.write("        </tr>\n");
          out.write("\t</table>\n");
          out.write("\t<div style=\"width: auto; \">");
          out.write("\n");
          out.write("\t\t<div style=\"width: 800px; height: 1px;\"></div>\n");
          out.write("\t\t");
          if (_jspx_meth_t_tabs_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("\t\t\t\t\n");
          out.write("\t\t");
          if (_jspx_meth_t_tabs_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_formvalid_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t</div>\n");
          int evalDoAfterBody = _jspx_th_t_formvalid_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_t_formvalid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_t_formvalid_usePlugin_tiptype_layout_formid_dialog_action.reuse(_jspx_th_t_formvalid_0);
        return;
      }
      _jspx_tagPool_t_formvalid_usePlugin_tiptype_layout_formid_dialog_action.reuse(_jspx_th_t_formvalid_0);
      out.write("\n");
      out.write("<!-- 添加 附表明细 模版 -->\n");
      out.write("<table style=\"display: none\">\n");
      out.write("\t<tbody id=\"add_cgreportConfigItem_table_template\">\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td align=\"center\"><input style=\"width: 20px;\" type=\"checkbox\" name=\"ck\" /></td>\n");
      out.write("\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[#index#].fieldName\" maxlength=\"36\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\"></td>\n");
      out.write("\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[#index#].orderNum\" maxlength=\"10\" type=\"text\" class=\"inputxt\" style=\"width: 30px;\"></td>\n");
      out.write("\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[#index#].fieldTxt\" maxlength=\"1000\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\"></td>\n");
      out.write("\t\t\t<td align=\"left\">");
      if (_jspx_meth_t_dictSelect_2(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("\t\t\t<td align=\"left\"><select id=\"isShow\" name=\"cgreportConfigItemList[#index#].isShow\"  style=\"width: 60px;\">\n");
      out.write("\t\t\t\t<option value=\"Y\">");
      if (_jspx_meth_t_mutiLang_8(_jspx_page_context))
        return;
      out.write("</option>\n");
      out.write("\t\t\t\t<option value=\"N\">");
      if (_jspx_meth_t_mutiLang_9(_jspx_page_context))
        return;
      out.write("</option>\n");
      out.write("\t\t\t</select></td>\n");
      out.write("\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[#index#].fieldHref\" maxlength=\"1000\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\">\n");
      out.write("\t\t\t<td align=\"left\">");
      if (_jspx_meth_t_dictSelect_3(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[#index#].replaceVa\" maxlength=\"36\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\"></td>\n");
      out.write("\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[#index#].dictCode\" maxlength=\"36\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\"></td>\n");
      out.write("\t\t\t<td align=\"left\">");
      if (_jspx_meth_t_dictSelect_4(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</tbody>\n");
      out.write("</table>\n");
      out.write("<table style=\"display: none\">\n");
      out.write("\t<tbody id=\"add_cgreportConfigParam_table_template\">\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t <td align=\"center\"><input style=\"width:20px;\" type=\"checkbox\" name=\"ck\"/></td>\n");
      out.write("\t\t <td align=\"left\"><input name=\"cgreportConfigParamList[#index#].paramName\" maxlength=\"32\" type=\"text\" class=\"inputxt\"  style=\"width:120px;\" datatype=\"*\" ></td>\n");
      out.write("\t\t <td align=\"left\"><input name=\"cgreportConfigParamList[#index#].paramDesc\" maxlength=\"32\" type=\"text\" class=\"inputxt\"  style=\"width:120px;\" ></td>\n");
      out.write("\t     <td align=\"left\"><input name=\"cgreportConfigParamList[#index#].paramValue\" maxlength=\"32\" type=\"text\" class=\"inputxt\"  style=\"width:120px;\" ></td>\n");
      out.write("\t\t <td align=\"left\"><input name=\"cgreportConfigParamList[#index#].seq\" maxlength=\"32\" type=\"text\" class=\"inputxt\"  style=\"width:120px;\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t </tbody>\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("<script src=\"webpage/jeecg/cgreport/core/cgreportConfigHead.js\"></script>");
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

  private boolean _jspx_meth_t_mutiLang_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_0 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_0.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_0.setLangKey("common.code");
    int _jspx_eval_t_mutiLang_0 = _jspx_th_t_mutiLang_0.doStartTag();
    if (_jspx_th_t_mutiLang_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_0);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_0);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_1 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_1.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_1.setLangKey("common.name");
    int _jspx_eval_t_mutiLang_1 = _jspx_th_t_mutiLang_1.doStartTag();
    if (_jspx_th_t_mutiLang_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_1);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_1);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_2 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_2.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_2.setLangKey("common.dynamic.dbsource");
    int _jspx_eval_t_mutiLang_2 = _jspx_th_t_mutiLang_2.doStartTag();
    if (_jspx_th_t_mutiLang_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_2);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_2);
    return false;
  }

  private boolean _jspx_meth_t_dictSelect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_0 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_field_dictText_dictTable_dictField_defaultVal_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_0.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_dictSelect_0.setField("dbSource");
    _jspx_th_t_dictSelect_0.setDictTable("t_s_data_source");
    _jspx_th_t_dictSelect_0.setDictField("DB_KEY");
    _jspx_th_t_dictSelect_0.setDictText("DB_KEY");
    _jspx_th_t_dictSelect_0.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgreportConfigHeadPage.dbSource}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_t_dictSelect_0 = _jspx_th_t_dictSelect_0.doStartTag();
    if (_jspx_th_t_dictSelect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_field_dictText_dictTable_dictField_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_0);
      return true;
    }
    _jspx_tagPool_t_dictSelect_field_dictText_dictTable_dictField_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_0);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_3(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_3 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_3.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_3.setLangKey("query.sql");
    int _jspx_eval_t_mutiLang_3 = _jspx_th_t_mutiLang_3.doStartTag();
    if (_jspx_th_t_mutiLang_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_3);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_3);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_4(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_4 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_4.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_4.setLangKey("common.description");
    int _jspx_eval_t_mutiLang_4 = _jspx_th_t_mutiLang_4.doStartTag();
    if (_jspx_th_t_mutiLang_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_4);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_4);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_5(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_5 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_5.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_5.setLangKey("common.returnvalfield");
    int _jspx_eval_t_mutiLang_5 = _jspx_th_t_mutiLang_5.doStartTag();
    if (_jspx_th_t_mutiLang_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_5);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_5);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_6(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_6 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_6.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_6.setLangKey("common.returntxtfield");
    int _jspx_eval_t_mutiLang_6 = _jspx_th_t_mutiLang_6.doStartTag();
    if (_jspx_th_t_mutiLang_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_6);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_6);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_7(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_7 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_7.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_mutiLang_7.setLangKey("common.returntxttype");
    int _jspx_eval_t_mutiLang_7 = _jspx_th_t_mutiLang_7.doStartTag();
    if (_jspx_th_t_mutiLang_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_7);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_7);
    return false;
  }

  private boolean _jspx_meth_t_dictSelect_1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_1 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_typeGroupCode_hasLabel_field_defaultVal_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_1.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_dictSelect_1.setField("popRetype");
    _jspx_th_t_dictSelect_1.setTypeGroupCode("pop_retype");
    _jspx_th_t_dictSelect_1.setHasLabel(false);
    _jspx_th_t_dictSelect_1.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cgreportConfigHeadPage.popRetype}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_t_dictSelect_1 = _jspx_th_t_dictSelect_1.doStartTag();
    if (_jspx_th_t_dictSelect_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_typeGroupCode_hasLabel_field_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_1);
      return true;
    }
    _jspx_tagPool_t_dictSelect_typeGroupCode_hasLabel_field_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_1);
    return false;
  }

  private boolean _jspx_meth_t_tabs_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tabs
    org.jeecgframework.tag.core.easyui.TabsTag _jspx_th_t_tabs_0 = (org.jeecgframework.tag.core.easyui.TabsTag) _jspx_tagPool_t_tabs_tabPosition_iframe_id_fit.get(org.jeecgframework.tag.core.easyui.TabsTag.class);
    _jspx_th_t_tabs_0.setPageContext(_jspx_page_context);
    _jspx_th_t_tabs_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_tabs_0.setId("ttp");
    _jspx_th_t_tabs_0.setIframe(false);
    _jspx_th_t_tabs_0.setTabPosition("top");
    _jspx_th_t_tabs_0.setFit(false);
    int _jspx_eval_t_tabs_0 = _jspx_th_t_tabs_0.doStartTag();
    if (_jspx_eval_t_tabs_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_t_tab_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_tabs_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_t_tabs_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_tabs_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_tabs_tabPosition_iframe_id_fit.reuse(_jspx_th_t_tabs_0);
      return true;
    }
    _jspx_tagPool_t_tabs_tabPosition_iframe_id_fit.reuse(_jspx_th_t_tabs_0);
    return false;
  }

  private boolean _jspx_meth_t_tab_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_tabs_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tab
    org.jeecgframework.tag.core.easyui.TabTag _jspx_th_t_tab_0 = (org.jeecgframework.tag.core.easyui.TabTag) _jspx_tagPool_t_tab_title_id_icon_href_nobody.get(org.jeecgframework.tag.core.easyui.TabTag.class);
    _jspx_th_t_tab_0.setPageContext(_jspx_page_context);
    _jspx_th_t_tab_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_tabs_0);
    _jspx_th_t_tab_0.setHref((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("cgreportConfigHeadController.do?cgreportConfigParamList&id=${cgreportConfigHeadPage.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_t_tab_0.setIcon("icon-search");
    _jspx_th_t_tab_0.setTitle("报表参数");
    _jspx_th_t_tab_0.setId("cgreportConfigParam");
    int _jspx_eval_t_tab_0 = _jspx_th_t_tab_0.doStartTag();
    if (_jspx_th_t_tab_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_tab_title_id_icon_href_nobody.reuse(_jspx_th_t_tab_0);
      return true;
    }
    _jspx_tagPool_t_tab_title_id_icon_href_nobody.reuse(_jspx_th_t_tab_0);
    return false;
  }

  private boolean _jspx_meth_t_tabs_1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_formvalid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tabs
    org.jeecgframework.tag.core.easyui.TabsTag _jspx_th_t_tabs_1 = (org.jeecgframework.tag.core.easyui.TabsTag) _jspx_tagPool_t_tabs_tabPosition_iframe_id_fit.get(org.jeecgframework.tag.core.easyui.TabsTag.class);
    _jspx_th_t_tabs_1.setPageContext(_jspx_page_context);
    _jspx_th_t_tabs_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_formvalid_0);
    _jspx_th_t_tabs_1.setId("tt");
    _jspx_th_t_tabs_1.setIframe(false);
    _jspx_th_t_tabs_1.setTabPosition("top");
    _jspx_th_t_tabs_1.setFit(false);
    int _jspx_eval_t_tabs_1 = _jspx_th_t_tabs_1.doStartTag();
    if (_jspx_eval_t_tabs_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_t_tab_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_tabs_1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_t_tabs_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_tabs_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_tabs_tabPosition_iframe_id_fit.reuse(_jspx_th_t_tabs_1);
      return true;
    }
    _jspx_tagPool_t_tabs_tabPosition_iframe_id_fit.reuse(_jspx_th_t_tabs_1);
    return false;
  }

  private boolean _jspx_meth_t_tab_1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_tabs_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tab
    org.jeecgframework.tag.core.easyui.TabTag _jspx_th_t_tab_1 = (org.jeecgframework.tag.core.easyui.TabTag) _jspx_tagPool_t_tab_title_id_icon_href_nobody.get(org.jeecgframework.tag.core.easyui.TabTag.class);
    _jspx_th_t_tab_1.setPageContext(_jspx_page_context);
    _jspx_th_t_tab_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_tabs_1);
    _jspx_th_t_tab_1.setHref((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("cgreportConfigHeadController.do?cgreportConfigItemList&id=${cgreportConfigHeadPage.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_t_tab_1.setIcon("icon-search");
    _jspx_th_t_tab_1.setTitle("dynamic.report.config.detail");
    _jspx_th_t_tab_1.setId("cgreportConfigItem");
    int _jspx_eval_t_tab_1 = _jspx_th_t_tab_1.doStartTag();
    if (_jspx_th_t_tab_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_tab_title_id_icon_href_nobody.reuse(_jspx_th_t_tab_1);
      return true;
    }
    _jspx_tagPool_t_tab_title_id_icon_href_nobody.reuse(_jspx_th_t_tab_1);
    return false;
  }

  private boolean _jspx_meth_t_dictSelect_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_2 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_2.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_2.setParent(null);
    _jspx_th_t_dictSelect_2.setField("cgreportConfigItemList[#index#].fieldType");
    _jspx_th_t_dictSelect_2.setType("list");
    _jspx_th_t_dictSelect_2.setExtendJson("{style:'width:80px'}");
    _jspx_th_t_dictSelect_2.setTypeGroupCode("fieldtype");
    _jspx_th_t_dictSelect_2.setDefaultVal("String");
    _jspx_th_t_dictSelect_2.setHasLabel(false);
    _jspx_th_t_dictSelect_2.setTitle("common.text.type");
    int _jspx_eval_t_dictSelect_2 = _jspx_th_t_dictSelect_2.doStartTag();
    if (_jspx_th_t_dictSelect_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_2);
      return true;
    }
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_2);
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
    _jspx_th_t_mutiLang_8.setLangKey("common.show");
    int _jspx_eval_t_mutiLang_8 = _jspx_th_t_mutiLang_8.doStartTag();
    if (_jspx_th_t_mutiLang_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_8);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_8);
    return false;
  }

  private boolean _jspx_meth_t_mutiLang_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:mutiLang
    org.jeecgframework.tag.core.easyui.MutiLangTag _jspx_th_t_mutiLang_9 = (org.jeecgframework.tag.core.easyui.MutiLangTag) _jspx_tagPool_t_mutiLang_langKey_nobody.get(org.jeecgframework.tag.core.easyui.MutiLangTag.class);
    _jspx_th_t_mutiLang_9.setPageContext(_jspx_page_context);
    _jspx_th_t_mutiLang_9.setParent(null);
    _jspx_th_t_mutiLang_9.setLangKey("common.hide");
    int _jspx_eval_t_mutiLang_9 = _jspx_th_t_mutiLang_9.doStartTag();
    if (_jspx_th_t_mutiLang_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_9);
      return true;
    }
    _jspx_tagPool_t_mutiLang_langKey_nobody.reuse(_jspx_th_t_mutiLang_9);
    return false;
  }

  private boolean _jspx_meth_t_dictSelect_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_3 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_3.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_3.setParent(null);
    _jspx_th_t_dictSelect_3.setField("cgreportConfigItemList[#index#].SMode");
    _jspx_th_t_dictSelect_3.setType("list");
    _jspx_th_t_dictSelect_3.setExtendJson("{style:'width:90px'}");
    _jspx_th_t_dictSelect_3.setTypeGroupCode("searchmode");
    _jspx_th_t_dictSelect_3.setDefaultVal("");
    _jspx_th_t_dictSelect_3.setHasLabel(false);
    _jspx_th_t_dictSelect_3.setTitle("common.query.module");
    int _jspx_eval_t_dictSelect_3 = _jspx_th_t_dictSelect_3.doStartTag();
    if (_jspx_th_t_dictSelect_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_3);
      return true;
    }
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_3);
    return false;
  }

  private boolean _jspx_meth_t_dictSelect_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_dictSelect_4 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_dictSelect_4.setPageContext(_jspx_page_context);
    _jspx_th_t_dictSelect_4.setParent(null);
    _jspx_th_t_dictSelect_4.setField("cgreportConfigItemList[#index#].SFlag");
    _jspx_th_t_dictSelect_4.setType("list");
    _jspx_th_t_dictSelect_4.setExtendJson("{style:'width:90px'}");
    _jspx_th_t_dictSelect_4.setTypeGroupCode("yesorno");
    _jspx_th_t_dictSelect_4.setDefaultVal("");
    _jspx_th_t_dictSelect_4.setHasLabel(false);
    _jspx_th_t_dictSelect_4.setTitle("common.isquery");
    int _jspx_eval_t_dictSelect_4 = _jspx_th_t_dictSelect_4.doStartTag();
    if (_jspx_th_t_dictSelect_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_4);
      return true;
    }
    _jspx_tagPool_t_dictSelect_typeGroupCode_type_title_hasLabel_field_extendJson_defaultVal_nobody.reuse(_jspx_th_t_dictSelect_4);
    return false;
  }
}
