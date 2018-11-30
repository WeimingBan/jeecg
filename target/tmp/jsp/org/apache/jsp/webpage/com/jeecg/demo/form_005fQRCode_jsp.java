package org.apache.jsp.webpage.com.jeecg.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class form_005fQRCode_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_base_type_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("<title>二维码生成页面</title>\n");
      out.write("\t");
      if (_jspx_meth_t_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t<script type=\"text/javascript\"  charset=\"utf-8\" src=\"plug-in/qrcode/jquery.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\"  charset=\"utf-8\" src=\"plug-in/qrcode/qrcode.min.js\"></script>\n");
      out.write("\t<SCRIPT type=\"text/javascript\">\n");
      out.write("        function make2DCode() {\n");
      out.write("            $(\"#qrcode\").html(\"\");//清空二维码\n");
      out.write("            var qrcode;\n");
      out.write("            var codesize = document.getElementById(\"codesize\").value;\n");
      out.write("            if(codesize>220){\n");
      out.write("            \tvar size=parseInt(codesize)+30;\n");
      out.write("            \tconsole.log(size);\n");
      out.write("            \t$(\".text-center\").css('width',size+\"px\");\n");
      out.write("            \t$(\".text-center\").css('height',size+\"px\");\n");
      out.write("            \t$(\"#text-he\").css('height','');\n");
      out.write("            }else{\n");
      out.write("            \t$(\".text-center\").css('width',\"250px\");\n");
      out.write("            \t$(\".text-center\").css('height',\"250px\");\n");
      out.write("            \t$(\"#text-he\").css('height','');\n");
      out.write("            }\n");
      out.write("            qrcode = new QRCode(document.getElementById(\"qrcode\"), {\n");
      out.write("                width : codesize,\n");
      out.write("                height : codesize\n");
      out.write("            });\n");
      out.write("            qrcode.makeCode(document.getElementById(\"content\").value);\n");
      out.write("        };\n");
      out.write("        window.onload=function(){\n");
      out.write("            make2DCode();\n");
      out.write("        };\n");
      out.write("        function downloadqrcode() {\n");
      out.write("            // 获取base64的图片节点\n");
      out.write("            var img = document.getElementById('qrcode').getElementsByTagName('img')[0];\n");
      out.write("            // 构建画布\n");
      out.write("            var canvas = document.createElement('canvas');\n");
      out.write("            canvas.width = img.width;\n");
      out.write("            canvas.height = img.height;\n");
      out.write("            canvas.getContext('2d').drawImage(img, 0, 0);\n");
      out.write("            // 构造url\n");
      out.write("            url = canvas.toDataURL('image/png');\n");
      out.write("            // 构造a标签并模拟点击\n");
      out.write("            var downloadLink = document.getElementById('downloadLink');\n");
      out.write("            downloadLink.setAttribute('href', url);\n");
      out.write("            downloadLink.setAttribute('download', '二维码.png');\n");
      out.write("            downloadLink.click();\n");
      out.write("        };\n");
      out.write("  </SCRIPT>\n");
      out.write("  </head>\n");
      out.write("  <style>\t\n");
      out.write(".form-control-lg {\n");
      out.write("    min-height: 3.5rem;\n");
      out.write("}\n");
      out.write(".form-control {\n");
      out.write("    padding: .375rem .75rem;\n");
      out.write("    line-height: 1.5;\n");
      out.write("    color: #55595c;\n");
      out.write("    background-color: #fff;\n");
      out.write("    background-image: none;\n");
      out.write("    border: .0625rem solid #ccc;\n");
      out.write("    border-radius: .25rem;\n");
      out.write("    margin-top: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".qrcode {\n");
      out.write("    position: relative;\n");
      out.write("    border-radius: 3px;\n");
      out.write("    width: 280px;\n");
      out.write("    margin: 0 auto 8px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".qrimage-wrap {\n");
      out.write("    width: 250px;\n");
      out.write("    height: 250px;\n");
      out.write("    padding: 10px 0;\n");
      out.write("    margin: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".white {\n");
      out.write("    background-color: #fff;\n");
      out.write("}\n");
      out.write(".text-center {\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("table {\n");
      out.write("    border-spacing: 0;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("}\n");
      out.write("#qrfun-box {\n");
      out.write("    width: 33.33%;\n");
      out.write("    margin-left: 0!important;\n");
      out.write("    padding-right: 10%;\n");
      out.write("    padding-top: 3%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#qrfun-left {\n");
      out.write("    width: 50%;\n");
      out.write("    margin-left: 0!important;\n");
      out.write("    padding-top: 10px;\n");
      out.write("    padding-left: 50px;\n");
      out.write("}\n");
      out.write(".wrapper {\n");
      out.write("    width: 100%;\n");
      out.write("    position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn {\n");
      out.write("    padding: .5rem 1rem;\n");
      out.write("    line-height: 1.4;\n");
      out.write("}\n");
      out.write(".green {\n");
      out.write("    background-color: #4caf50;\n");
      out.write("    color: rgba(255,255,255,.87);\n");
      out.write("}\n");
      out.write(".btn {\n");
      out.write("    font-weight: 500;\n");
      out.write("    outline: 0!important;\n");
      out.write("    border-width: 0;\n");
      out.write("    padding: .4375rem 1rem;\n");
      out.write("}\n");
      out.write(".btn {\n");
      out.write("    display: inline-block;\n");
      out.write("    padding: .375rem 1rem;\n");
      out.write("    font-size: 1.2rem;\n");
      out.write("    font-weight: 400;\n");
      out.write("    line-height: 1.5;\n");
      out.write("    text-align: center;\n");
      out.write("    white-space: nowrap;\n");
      out.write("    vertical-align: middle;\n");
      out.write("    -ms-touch-action: manipulation;\n");
      out.write("    touch-action: manipulation;\n");
      out.write("    cursor: pointer;\n");
      out.write("    user-select: none;\n");
      out.write("    border: .0625rem solid transparent;\n");
      out.write("    border-radius: .25rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".text-center {\n");
      out.write("    text-align: center;\n");
      out.write("    margin: auto;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("a, a:focus, a:hover {\n");
      out.write("    text-decoration: none;\n");
      out.write("   \tcolor: #fff;\n");
      out.write("}\n");
      out.write("  </style>\n");
      out.write("  <body style=\"overflow-x: hidden\" scroll=\"no\">\n");
      out.write("  <div>\n");
      out.write("  <div id=\"qrfun-left\">\n");
      out.write("       \n");
      out.write("\t\t<div >\n");
      out.write("\t\t\t<label class=\"Validform_label\" style=\"font-size: 1.1rem;\"> 二维码内容： </label>\n");
      out.write("\t\t\t<input type=\"text\" name=\"content\" class=\"form-control form-control-lg\"  style=\"width:80%;font-size: 1.1rem;\" id=\"content\" value=\"http://www.jeecg.org\" />\n");
      out.write("      \t\t <a id=\"downloadLink\"></a>\n");
      out.write("        </div>\n");
      out.write("         <div>\n");
      out.write("      \n");
      out.write("            <label class=\"m-b\" style=\"font-size: 1.1rem;\"> 二维码大小： </label>\n");
      out.write("            <input type=\"text\" class=\"form-control form-control-lg\" style=\"font-size: 1.1rem;\" name=\"codesize\" id=\"codesize\" value=\"220\" onkeyup=\"value=value.replace(/[^\\d]/g,'')\">\n");
      out.write("       \t\t<span style=\"font-size: 1.1rem;\">px</span>\n");
      out.write("       \t\t<a class=\"btn green\"  href=\"javascript:make2DCode();\" style=\"position: absolute;left: 26%;top: 173px;\"> 生成二维码 </a>\n");
      out.write("          \n");
      out.write("            \n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\t<div  id=\"qrfun-box\">\n");
      out.write("\t\t<div class=\"qrcode\">\n");
      out.write("       \t\t<table class=\"qrimage-wrap white b-a text-center\" id=\"click-create\">\n");
      out.write("        \t<tbody>\n");
      out.write("         \t<tr>\n");
      out.write("          \t\t<td style=\"width:220px; height:220px;\">\n");
      out.write("          \t\t\t<div style=\"margin:auto;\">\n");
      out.write("            \t\t\t<div id=\"qrcode\" align=\"center\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("         \t</tr>\n");
      out.write("        \t</tbody>\n");
      out.write("       \t\t</table>\n");
      out.write("       \t\t<div id=\"text-he\" class=\"text-center\" style=\"padding-top:10px;\">\n");
      out.write("      \t\t<a class=\"btn green btn-block\" href=\"javascript:downloadqrcode();\" style=\"width:220px;\"> 下载二维码 </a>\n");
      out.write("        </div>\n");
      out.write("      \t</div>\n");
      out.write("      \t\n");
      out.write(" \t</div>\n");
      out.write("</div>\n");
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
    _jspx_th_t_base_0.setType("jquery,easyui");
    int _jspx_eval_t_base_0 = _jspx_th_t_base_0.doStartTag();
    if (_jspx_th_t_base_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_base_type_nobody.reuse(_jspx_th_t_base_0);
      return true;
    }
    _jspx_tagPool_t_base_type_nobody.reuse(_jspx_th_t_base_0);
    return false;
  }
}
