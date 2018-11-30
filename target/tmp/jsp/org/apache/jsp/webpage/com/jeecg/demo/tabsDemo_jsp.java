package org.apache.jsp.webpage.com.jeecg.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tabsDemo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_base_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_tabs_tabPosition_iframe_id_fit;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_tab_title_id_icon_href_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_tab_title_iframe_id_icon_heigth_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_tabs_tabPosition_iframe_id_heigth_fit;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_tabs_tabPosition_iframe_id_fit = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_tab_title_id_icon_href_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_tab_title_iframe_id_icon_heigth_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_tabs_tabPosition_iframe_id_heigth_fit = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
    _jspx_tagPool_t_tabs_tabPosition_iframe_id_fit.release();
    _jspx_tagPool_t_tab_title_id_icon_href_nobody.release();
    _jspx_tagPool_t_tab_title_iframe_id_icon_heigth_nobody.release();
    _jspx_tagPool_t_tabs_tabPosition_iframe_id_heigth_fit.release();
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
      out.write("<div>\n");
      out.write("\t");
      if (_jspx_meth_t_tabs_0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('	');
      if (_jspx_meth_t_tabs_1(_jspx_page_context))
        return;
      out.write('\n');
      out.write('	');
      if (_jspx_meth_t_tabs_2(_jspx_page_context))
        return;
      out.write('\n');
      out.write('	');
      if (_jspx_meth_t_tabs_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</div>");
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
    _jspx_th_t_base_0.setType("jquery,easyui,tools,DatePicker,autocomplete");
    int _jspx_eval_t_base_0 = _jspx_th_t_base_0.doStartTag();
    if (_jspx_th_t_base_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_base_type_nobody.reuse(_jspx_th_t_base_0);
      return true;
    }
    _jspx_tagPool_t_base_type_nobody.reuse(_jspx_th_t_base_0);
    return false;
  }

  private boolean _jspx_meth_t_tabs_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tabs
    org.jeecgframework.tag.core.easyui.TabsTag _jspx_th_t_tabs_0 = (org.jeecgframework.tag.core.easyui.TabsTag) _jspx_tagPool_t_tabs_tabPosition_iframe_id_fit.get(org.jeecgframework.tag.core.easyui.TabsTag.class);
    _jspx_th_t_tabs_0.setPageContext(_jspx_page_context);
    _jspx_th_t_tabs_0.setParent(null);
    _jspx_th_t_tabs_0.setId("tabsOne");
    _jspx_th_t_tabs_0.setIframe(false);
    _jspx_th_t_tabs_0.setTabPosition("top");
    _jspx_th_t_tabs_0.setFit(false);
    int _jspx_eval_t_tabs_0 = _jspx_th_t_tabs_0.doStartTag();
    if (_jspx_eval_t_tabs_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t");
        if (_jspx_meth_t_tab_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_tabs_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t");
        if (_jspx_meth_t_tab_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_tabs_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t");
        if (_jspx_meth_t_tab_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_tabs_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
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
    _jspx_th_t_tab_0.setHref("jeecgFormDemoController.do?tabDemo");
    _jspx_th_t_tab_0.setIcon("icon-search");
    _jspx_th_t_tab_0.setTitle("选项卡1");
    _jspx_th_t_tab_0.setId("tab1");
    int _jspx_eval_t_tab_0 = _jspx_th_t_tab_0.doStartTag();
    if (_jspx_th_t_tab_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_tab_title_id_icon_href_nobody.reuse(_jspx_th_t_tab_0);
      return true;
    }
    _jspx_tagPool_t_tab_title_id_icon_href_nobody.reuse(_jspx_th_t_tab_0);
    return false;
  }

  private boolean _jspx_meth_t_tab_1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_tabs_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tab
    org.jeecgframework.tag.core.easyui.TabTag _jspx_th_t_tab_1 = (org.jeecgframework.tag.core.easyui.TabTag) _jspx_tagPool_t_tab_title_id_icon_href_nobody.get(org.jeecgframework.tag.core.easyui.TabTag.class);
    _jspx_th_t_tab_1.setPageContext(_jspx_page_context);
    _jspx_th_t_tab_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_tabs_0);
    _jspx_th_t_tab_1.setHref("jeecgFormDemoController.do?tabDemo");
    _jspx_th_t_tab_1.setIcon("icon-save");
    _jspx_th_t_tab_1.setTitle("选项卡2");
    _jspx_th_t_tab_1.setId("tab2");
    int _jspx_eval_t_tab_1 = _jspx_th_t_tab_1.doStartTag();
    if (_jspx_th_t_tab_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_tab_title_id_icon_href_nobody.reuse(_jspx_th_t_tab_1);
      return true;
    }
    _jspx_tagPool_t_tab_title_id_icon_href_nobody.reuse(_jspx_th_t_tab_1);
    return false;
  }

  private boolean _jspx_meth_t_tab_2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_tabs_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tab
    org.jeecgframework.tag.core.easyui.TabTag _jspx_th_t_tab_2 = (org.jeecgframework.tag.core.easyui.TabTag) _jspx_tagPool_t_tab_title_id_icon_href_nobody.get(org.jeecgframework.tag.core.easyui.TabTag.class);
    _jspx_th_t_tab_2.setPageContext(_jspx_page_context);
    _jspx_th_t_tab_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_tabs_0);
    _jspx_th_t_tab_2.setHref("jeecgFormDemoController.do?tabDemo");
    _jspx_th_t_tab_2.setIcon("icon-cut");
    _jspx_th_t_tab_2.setTitle("选项卡3");
    _jspx_th_t_tab_2.setId("tab3");
    int _jspx_eval_t_tab_2 = _jspx_th_t_tab_2.doStartTag();
    if (_jspx_th_t_tab_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_tab_title_id_icon_href_nobody.reuse(_jspx_th_t_tab_2);
      return true;
    }
    _jspx_tagPool_t_tab_title_id_icon_href_nobody.reuse(_jspx_th_t_tab_2);
    return false;
  }

  private boolean _jspx_meth_t_tabs_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tabs
    org.jeecgframework.tag.core.easyui.TabsTag _jspx_th_t_tabs_1 = (org.jeecgframework.tag.core.easyui.TabsTag) _jspx_tagPool_t_tabs_tabPosition_iframe_id_fit.get(org.jeecgframework.tag.core.easyui.TabsTag.class);
    _jspx_th_t_tabs_1.setPageContext(_jspx_page_context);
    _jspx_th_t_tabs_1.setParent(null);
    _jspx_th_t_tabs_1.setId("tabsTwo");
    _jspx_th_t_tabs_1.setIframe(false);
    _jspx_th_t_tabs_1.setTabPosition("top");
    _jspx_th_t_tabs_1.setFit(false);
    int _jspx_eval_t_tabs_1 = _jspx_th_t_tabs_1.doStartTag();
    if (_jspx_eval_t_tabs_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t");
        if (_jspx_meth_t_tab_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_tabs_1, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
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

  private boolean _jspx_meth_t_tab_3(javax.servlet.jsp.tagext.JspTag _jspx_th_t_tabs_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tab
    org.jeecgframework.tag.core.easyui.TabTag _jspx_th_t_tab_3 = (org.jeecgframework.tag.core.easyui.TabTag) _jspx_tagPool_t_tab_title_id_icon_href_nobody.get(org.jeecgframework.tag.core.easyui.TabTag.class);
    _jspx_th_t_tab_3.setPageContext(_jspx_page_context);
    _jspx_th_t_tab_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_tabs_1);
    _jspx_th_t_tab_3.setHref("jeecgFormDemoController.do?tabDemo");
    _jspx_th_t_tab_3.setIcon("icon-search");
    _jspx_th_t_tab_3.setTitle("dynamic.report.config.detail");
    _jspx_th_t_tab_3.setId("tab4");
    int _jspx_eval_t_tab_3 = _jspx_th_t_tab_3.doStartTag();
    if (_jspx_th_t_tab_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_tab_title_id_icon_href_nobody.reuse(_jspx_th_t_tab_3);
      return true;
    }
    _jspx_tagPool_t_tab_title_id_icon_href_nobody.reuse(_jspx_th_t_tab_3);
    return false;
  }

  private boolean _jspx_meth_t_tabs_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tabs
    org.jeecgframework.tag.core.easyui.TabsTag _jspx_th_t_tabs_2 = (org.jeecgframework.tag.core.easyui.TabsTag) _jspx_tagPool_t_tabs_tabPosition_iframe_id_fit.get(org.jeecgframework.tag.core.easyui.TabsTag.class);
    _jspx_th_t_tabs_2.setPageContext(_jspx_page_context);
    _jspx_th_t_tabs_2.setParent(null);
    _jspx_th_t_tabs_2.setId("tabsThree");
    _jspx_th_t_tabs_2.setIframe(false);
    _jspx_th_t_tabs_2.setTabPosition("top");
    _jspx_th_t_tabs_2.setFit(false);
    int _jspx_eval_t_tabs_2 = _jspx_th_t_tabs_2.doStartTag();
    if (_jspx_eval_t_tabs_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t");
        if (_jspx_meth_t_tab_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_tabs_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t");
        if (_jspx_meth_t_tab_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_tabs_2, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        int evalDoAfterBody = _jspx_th_t_tabs_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_tabs_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_tabs_tabPosition_iframe_id_fit.reuse(_jspx_th_t_tabs_2);
      return true;
    }
    _jspx_tagPool_t_tabs_tabPosition_iframe_id_fit.reuse(_jspx_th_t_tabs_2);
    return false;
  }

  private boolean _jspx_meth_t_tab_4(javax.servlet.jsp.tagext.JspTag _jspx_th_t_tabs_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tab
    org.jeecgframework.tag.core.easyui.TabTag _jspx_th_t_tab_4 = (org.jeecgframework.tag.core.easyui.TabTag) _jspx_tagPool_t_tab_title_iframe_id_icon_heigth_nobody.get(org.jeecgframework.tag.core.easyui.TabTag.class);
    _jspx_th_t_tab_4.setPageContext(_jspx_page_context);
    _jspx_th_t_tab_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_tabs_2);
    _jspx_th_t_tab_4.setIframe("http://www.baidu.com");
    _jspx_th_t_tab_4.setIcon("icon-search");
    _jspx_th_t_tab_4.setHeigth("600px");
    _jspx_th_t_tab_4.setTitle("百度(iframe与非iframe共存)");
    _jspx_th_t_tab_4.setId("tab5");
    int _jspx_eval_t_tab_4 = _jspx_th_t_tab_4.doStartTag();
    if (_jspx_th_t_tab_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_tab_title_iframe_id_icon_heigth_nobody.reuse(_jspx_th_t_tab_4);
      return true;
    }
    _jspx_tagPool_t_tab_title_iframe_id_icon_heigth_nobody.reuse(_jspx_th_t_tab_4);
    return false;
  }

  private boolean _jspx_meth_t_tab_5(javax.servlet.jsp.tagext.JspTag _jspx_th_t_tabs_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tab
    org.jeecgframework.tag.core.easyui.TabTag _jspx_th_t_tab_5 = (org.jeecgframework.tag.core.easyui.TabTag) _jspx_tagPool_t_tab_title_id_icon_href_nobody.get(org.jeecgframework.tag.core.easyui.TabTag.class);
    _jspx_th_t_tab_5.setPageContext(_jspx_page_context);
    _jspx_th_t_tab_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_tabs_2);
    _jspx_th_t_tab_5.setHref("jeecgFormDemoController.do?tabDemo");
    _jspx_th_t_tab_5.setIcon("icon-cut");
    _jspx_th_t_tab_5.setTitle("选项卡");
    _jspx_th_t_tab_5.setId("tab8");
    int _jspx_eval_t_tab_5 = _jspx_th_t_tab_5.doStartTag();
    if (_jspx_th_t_tab_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_tab_title_id_icon_href_nobody.reuse(_jspx_th_t_tab_5);
      return true;
    }
    _jspx_tagPool_t_tab_title_id_icon_href_nobody.reuse(_jspx_th_t_tab_5);
    return false;
  }

  private boolean _jspx_meth_t_tabs_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tabs
    org.jeecgframework.tag.core.easyui.TabsTag _jspx_th_t_tabs_3 = (org.jeecgframework.tag.core.easyui.TabsTag) _jspx_tagPool_t_tabs_tabPosition_iframe_id_heigth_fit.get(org.jeecgframework.tag.core.easyui.TabsTag.class);
    _jspx_th_t_tabs_3.setPageContext(_jspx_page_context);
    _jspx_th_t_tabs_3.setParent(null);
    _jspx_th_t_tabs_3.setId("tabsFour");
    _jspx_th_t_tabs_3.setIframe(true);
    _jspx_th_t_tabs_3.setHeigth("800px");
    _jspx_th_t_tabs_3.setTabPosition("top");
    _jspx_th_t_tabs_3.setFit(false);
    int _jspx_eval_t_tabs_3 = _jspx_th_t_tabs_3.doStartTag();
    if (_jspx_eval_t_tabs_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t");
        if (_jspx_meth_t_tab_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_tabs_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t");
        if (_jspx_meth_t_tab_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_tabs_3, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        int evalDoAfterBody = _jspx_th_t_tabs_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_tabs_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_tabs_tabPosition_iframe_id_heigth_fit.reuse(_jspx_th_t_tabs_3);
      return true;
    }
    _jspx_tagPool_t_tabs_tabPosition_iframe_id_heigth_fit.reuse(_jspx_th_t_tabs_3);
    return false;
  }

  private boolean _jspx_meth_t_tab_6(javax.servlet.jsp.tagext.JspTag _jspx_th_t_tabs_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tab
    org.jeecgframework.tag.core.easyui.TabTag _jspx_th_t_tab_6 = (org.jeecgframework.tag.core.easyui.TabTag) _jspx_tagPool_t_tab_title_id_icon_href_nobody.get(org.jeecgframework.tag.core.easyui.TabTag.class);
    _jspx_th_t_tab_6.setPageContext(_jspx_page_context);
    _jspx_th_t_tab_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_tabs_3);
    _jspx_th_t_tab_6.setHref("http://www.guojusoft.com");
    _jspx_th_t_tab_6.setIcon("icon-search");
    _jspx_th_t_tab_6.setTitle("北京国炬(全部iframe)");
    _jspx_th_t_tab_6.setId("tab6");
    int _jspx_eval_t_tab_6 = _jspx_th_t_tab_6.doStartTag();
    if (_jspx_th_t_tab_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_tab_title_id_icon_href_nobody.reuse(_jspx_th_t_tab_6);
      return true;
    }
    _jspx_tagPool_t_tab_title_id_icon_href_nobody.reuse(_jspx_th_t_tab_6);
    return false;
  }

  private boolean _jspx_meth_t_tab_7(javax.servlet.jsp.tagext.JspTag _jspx_th_t_tabs_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tab
    org.jeecgframework.tag.core.easyui.TabTag _jspx_th_t_tab_7 = (org.jeecgframework.tag.core.easyui.TabTag) _jspx_tagPool_t_tab_title_id_icon_href_nobody.get(org.jeecgframework.tag.core.easyui.TabTag.class);
    _jspx_th_t_tab_7.setPageContext(_jspx_page_context);
    _jspx_th_t_tab_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_tabs_3);
    _jspx_th_t_tab_7.setHref("http://www.jeecg.org");
    _jspx_th_t_tab_7.setIcon("icon-search");
    _jspx_th_t_tab_7.setTitle("Jeecg论坛");
    _jspx_th_t_tab_7.setId("tab7");
    int _jspx_eval_t_tab_7 = _jspx_th_t_tab_7.doStartTag();
    if (_jspx_th_t_tab_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_tab_title_id_icon_href_nobody.reuse(_jspx_th_t_tab_7);
      return true;
    }
    _jspx_tagPool_t_tab_title_id_icon_href_nobody.reuse(_jspx_th_t_tab_7);
    return false;
  }
}
