package org.apache.jsp.webpage.com.jeecg.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class suggest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_base_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_authFilter_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_base_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_authFilter_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_t_base_type_nobody.release();
    _jspx_tagPool_t_authFilter_nobody.release();
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
      out.write("<title>bootstrap-suggest-plugin</title>\n");
      out.write("\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"这是一个基于 bootstrap 按钮式下拉菜单组件的搜索建议插件\">\n");
      out.write("    <meta name=\"Keywords\" content=\"Bootstrap Search Suggest,bootstrap,搜索建议插件\"/>\n");
      out.write("    ");
      if (_jspx_meth_t_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("        <h2>bootstrap combox 搜索建议插件示例</h2>\n");
      out.write("        <form action=\"index_submit\" method=\"get\" accept-charset=\"utf-8\" role=\"form\">\n");
      out.write("            <h3>测试(URL 获取)</h3>\n");
      out.write("            <p>配置了 data-id，非下拉菜单选择输入则背景色警告。</p>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-2\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"test\">\n");
      out.write("                        <div class=\"input-group-btn\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                <span class=\"caret\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <ul class=\"dropdown-menu dropdown-menu-right\" role=\"menu\">\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /btn-group -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write(" \n");
      out.write("            <h3>测试(URL 获取)</h3>\n");
      out.write("            <p>不展示下拉菜单按钮。</p>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"testNoBtn\">\n");
      out.write("                        <div class=\"input-group-btn\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                <span class=\"caret\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <ul class=\"dropdown-menu dropdown-menu-right\" role=\"menu\">\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /btn-group -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <h3>测试(URL 获取)</h3>\n");
      out.write("            <p>数据库用户表数据</p>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"testDbUser\">\n");
      out.write("                        <div class=\"input-group-btn\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                <span class=\"caret\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <ul class=\"dropdown-menu dropdown-menu-right\" role=\"menu\">\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /btn-group -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write(" \n");
      out.write("            <h3>测试(json 数据中获取)</h3>\n");
      out.write("            <p>默认启用空关键字检索。</p>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"test_data\">\n");
      out.write("                        <div class=\"input-group-btn\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                <span class=\"caret\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <ul class=\"dropdown-menu dropdown-menu-right\" role=\"menu\">\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /btn-group -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write(" \n");
      out.write("            <h3>百度搜索</h3>\n");
      out.write("            <p>支持逗号分隔多关键字</p>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <div class=\"input-group\" style=\"width: 300px;\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"baidu\">\n");
      out.write("                        <div class=\"input-group-btn\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                <span class=\"caret\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <ul class=\"dropdown-menu dropdown-menu-right\" role=\"menu\">\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /btn-group -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write(" \n");
      out.write("            <h3>淘宝搜索</h3>\n");
      out.write("            <p>支持逗号分隔多关键字</p>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <div class=\"input-group\" style=\"width: 400px;\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"taobao\">\n");
      out.write("                        <div class=\"input-group-btn\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                <span class=\"caret\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <ul class=\"dropdown-menu dropdown-menu-right\" role=\"menu\">\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /btn-group -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write(" \n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"plug-in/hplus/plugins/suggest/bootstrap-suggest.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    var testBsSuggest = $(\"#test\").bsSuggest({\n");
      out.write("        //url: \"/rest/sys/getuserlist?keyword=\",\n");
      out.write("        url: \"plug-in/hplus/plugins/suggest/data.json\",\n");
      out.write("        /*effectiveFields: [\"userName\", \"shortAccount\"],\n");
      out.write("        searchFields: [ \"shortAccount\"],\n");
      out.write("        effectiveFieldsAlias:{userName: \"姓名\"},*/\n");
      out.write("        idField: \"userId\",\n");
      out.write("        keyField: \"userName\"\n");
      out.write("    }).on('onDataRequestSuccess', function (e, result) {\n");
      out.write("        console.log('onDataRequestSuccess: ', result);\n");
      out.write("    }).on('onSetSelectValue', function (e, keyword) {\n");
      out.write("        console.log('onSetSelectValue: ', keyword);\n");
      out.write("    }).on('onUnsetSelectValue', function (e) {\n");
      out.write("        console.log(\"onUnsetSelectValue\");\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    var testBsSuggest = $(\"#testDbUser\").bsSuggest({\n");
      out.write("        url: \"jeecgListDemoController/loadSuggestData.do?keyword=\",\n");
      out.write("        /*effectiveFields: [\"userName\", \"shortAccount\"],\n");
      out.write("        searchFields: [ \"shortAccount\"],\n");
      out.write("        effectiveFieldsAlias:{userName: \"姓名\"},*/\n");
      out.write("        idField: \"username\",\n");
      out.write("        keyField: \"realname\"\n");
      out.write("    }).on('onDataRequestSuccess', function (e, result) {\n");
      out.write("        console.log('onDataRequestSuccess: ', result);\n");
      out.write("    }).on('onSetSelectValue', function (e, keyword) {\n");
      out.write("        console.log('onSetSelectValue: ', keyword);\n");
      out.write("    }).on('onUnsetSelectValue', function (e) {\n");
      out.write("        console.log(\"onUnsetSelectValue\");\n");
      out.write("    });\n");
      out.write(" \n");
      out.write("    /**\n");
      out.write("     * 不显示下拉按钮\n");
      out.write("     */\n");
      out.write("    var testBsSuggest = $(\"#testNoBtn\").bsSuggest({\n");
      out.write("        //url: \"/rest/sys/getuserlist?keyword=\",\n");
      out.write("        url: \"plug-in/hplus/plugins/suggest/data.json\",\n");
      out.write("        /*effectiveFields: [\"userName\", \"shortAccount\"],\n");
      out.write("        searchFields: [ \"shortAccount\"],\n");
      out.write("        effectiveFieldsAlias:{userName: \"姓名\"},*/\n");
      out.write("        showBtn: false,\n");
      out.write("        idField: \"userId\",\n");
      out.write("        keyField: \"userName\"\n");
      out.write("    }).on('onDataRequestSuccess', function (e, result) {\n");
      out.write("        console.log('onDataRequestSuccess: ', result);\n");
      out.write("    }).on('onSetSelectValue', function (e, keyword) {\n");
      out.write("        console.log('onSetSelectValue: ', keyword);\n");
      out.write("    }).on('onUnsetSelectValue', function (e) {\n");
      out.write("        console.log(\"onUnsetSelectValue\");\n");
      out.write("    });\n");
      out.write(" \n");
      out.write("    /**\n");
      out.write("     * 从 data参数中过滤数据\n");
      out.write("     */\n");
      out.write("    var testdataBsSuggest = $(\"#test_data\").bsSuggest({\n");
      out.write("        indexId: 2,  //data.value 的第几个数据，作为input输入框的内容\n");
      out.write("        indexKey: 1, //data.value 的第几个数据，作为input输入框的内容\n");
      out.write("        data: {\n");
      out.write("            'value':[\n");
      out.write("                {'id':'0','word':'张起灵','description':'http://lzw.me'},\n");
      out.write("                {'id':'1','word':'张湾小学','description':'http://w.lzw.me'},\n");
      out.write("                {'id':'2','word':'张三李四','description':'http://www.meizu.com'},\n");
      out.write("                {'id':'3','word':'李大钊','description':'http://flyme.meizu.com'}\n");
      out.write("            ],\n");
      out.write("            'defaults':'http://lzw.me'\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("    /**\n");
      out.write("     * 百度搜索 API 测试\n");
      out.write("     */\n");
      out.write("    var baiduBsSuggest = $(\"#baidu\").bsSuggest({\n");
      out.write("        allowNoKeyword: false,   //是否允许无关键字时请求数据。为 false 则无输入时不执行过滤请求\n");
      out.write("        multiWord: true,         //以分隔符号分割的多关键字支持\n");
      out.write("        separator: \",\",          //多关键字支持时的分隔符，默认为空格\n");
      out.write("        getDataMethod: \"url\",    //获取数据的方式，总是从 URL 获取\n");
      out.write("        url: 'http://unionsug.baidu.com/su?p=3&t='+ (new Date()).getTime() +'&wd=', /*优先从url ajax 请求 json 帮助数据，注意最后一个参数为关键字请求参数*/\n");
      out.write("        jsonp: 'cb',                      //如果从 url 获取数据，并且需要跨域，则该参数必须设置\n");
      out.write("        processData: function (json) {    // url 获取数据时，对数据的处理，作为 getData 的回调函数\n");
      out.write("            var i, len, data = {value: []};\n");
      out.write("            if (!json || !json.s || json.s.length === 0) {\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write(" \n");
      out.write("            console.log(json);\n");
      out.write("            len = json.s.length;\n");
      out.write(" \n");
      out.write("            jsonStr = \"{'value':[\";\n");
      out.write("            for (i = 0; i < len; i++) {\n");
      out.write("                data.value.push({\n");
      out.write("                    word: json.s[i]\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("            data.defaults = 'baidu';\n");
      out.write(" \n");
      out.write("            //字符串转化为 js 对象\n");
      out.write("            return data;\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("    /**\n");
      out.write("     * 淘宝搜索 API 测试\n");
      out.write("     */\n");
      out.write("    var taobaoBsSuggest = $(\"#taobao\").bsSuggest({\n");
      out.write("        indexId: 2,             //data.value 的第几个数据，作为input输入框的内容\n");
      out.write("        indexKey: 1,            //data.value 的第几个数据，作为input输入框的内容\n");
      out.write("        allowNoKeyword: false,  //是否允许无关键字时请求数据。为 false 则无输入时不执行过滤请求\n");
      out.write("        multiWord: true,        //以分隔符号分割的多关键字支持\n");
      out.write("        separator: \",\",         //多关键字支持时的分隔符，默认为空格\n");
      out.write("        getDataMethod: \"url\",   //获取数据的方式，总是从 URL 获取\n");
      out.write("        showHeader: true,       //显示多个字段的表头\n");
      out.write("        effectiveFieldsAlias:{Id: \"序号\", Keyword: \"关键字\", Count: \"数量\"},\n");
      out.write("        url: 'http://suggest.taobao.com/sug?code=utf-8&extras=1&q=', /*优先从url ajax 请求 json 帮助数据，注意最后一个参数为关键字请求参数*/\n");
      out.write("        jsonp: 'callback',               //如果从 url 获取数据，并且需要跨域，则该参数必须设置\n");
      out.write("        processData: function(json){     // url 获取数据时，对数据的处理，作为 getData 的回调函数\n");
      out.write("            var i, len, data = {value: []};\n");
      out.write(" \n");
      out.write("            if(!json || !json.result || json.result.length == 0) {\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write(" \n");
      out.write("            console.log(json);\n");
      out.write("            len = json.result.length;\n");
      out.write(" \n");
      out.write("            for (i = 0; i < len; i++) {\n");
      out.write("                data.value.push({\n");
      out.write("                    \"Id\": (i + 1),\n");
      out.write("                    \"Keyword\": json.result[i][0],\n");
      out.write("                    \"Count\": json.result[i][1]\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("            console.log(data);\n");
      out.write("            return data;\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write(" \n");
      out.write("    $(\"form\").submit(function(e) {\n");
      out.write("        return false;\n");
      out.write("    });\n");
      out.write("    </script>\n");
      out.write(" <div class=\"container\" style=\"margin-top:20px\">\n");
      out.write(" <div><h2>------------------------------------------备注-------------------------------------------------</h2></div>\n");
      out.write(" <p>Bootstrap Search Suggest 是一个基于 bootstrap 按钮式下拉菜单组件的搜索建议插件，必须使用于按钮式下拉菜单组件上。</p>\n");
      out.write(" <h3>浏览器支持</h3>\n");
      out.write(" <ul><li>支持 ie8+,chrome,firefox,safari</li></ul>\n");
      out.write(" <h3>功能说明</h3>\n");
      out.write(" <ul>\n");
      out.write("\t<li>搜索方式：从 data.value 的有效字段数据中查询 keyword 的出现，或字段数据包含于 keyword 中</li>\n");
      out.write("\t<li>支持单关键字、多关键字的输入搜索建议，多关键字可自定义分隔符</li>\n");
      out.write("\t<li>支持按 data 数组数据搜索、按  URL 请求搜索和按首次请求URL数据并缓存搜索三种方式</li>\n");
      out.write("\t<li>单关键字会设置 data-id 和输入框内容两个值，以 indexId/idField 和 indexKey/idFiled 取值 data 的数据为准；多关键字只设置输入框值</li>\n");
      out.write(" </ul>\n");
      out.write(" <h3>配置参数</h3>\n");
      out.write(" <pre>\n");
      out.write(" var defaultOptions = {\n");
      out.write("    url: null,                      //请求数据的 URL 地址\n");
      out.write("    jsonp: null,                    //设置此参数名，将开启jsonp功能，否则使用json数据结构\n");
      out.write("    data: {             \n");
      out.write("        value: []               \n");
      out.write("    },                              //提示所用的数据，注意格式\n");
      out.write("    indexId: 0,                     //每组数据的第几个数据，作为input输入框的 data-id，设为 -1 且 idField 为空则不设置此值\n");
      out.write("    indexKey: 0,                    //每组数据的第几个数据，作为input输入框的内容\n");
      out.write("    idField: '',                    //每组数据的哪个字段作为 data-id，优先级高于 indexId 设置（推荐）\n");
      out.write("    keyField: '',                   //每组数据的哪个字段作为输入框内容，优先级高于 indexKey 设置（推荐）\n");
      out.write(" \n");
      out.write("    /* 搜索相关 */\n");
      out.write("    autoSelect: true,               //键盘向上/下方向键时，是否自动选择值\n");
      out.write("    allowNoKeyword: true,           //是否允许无关键字时请求数据\n");
      out.write("    getDataMethod: 'firstByUrl',    //获取数据的方式，url：一直从url请求；data：从 options.data 获取；firstByUrl：第一次从Url获取全部数据，之后从options.data获取\n");
      out.write("    delayUntilKeyup: false,         //获取数据的方式 为 firstByUrl 时，是否延迟到有输入时才请求数据\n");
      out.write("    ignorecase: false,              //前端搜索匹配时，是否忽略大小写\n");
      out.write("    effectiveFields: [],            //有效显示于列表中的字段，非有效字段都会过滤，默认全部。\n");
      out.write("    effectiveFieldsAlias: {},       //有效字段的别名对象，用于 header 的显示\n");
      out.write("    searchFields: [],               //有效搜索字段，从前端搜索过滤数据时使用，但不一定显示在列表中。effectiveFields 配置字段也会用于搜索过滤\n");
      out.write("    twoWayMatch: true,              // 是否双向匹配搜索。为 true 即输入关键字包含或包含于匹配字段均认为匹配成功，为 false 则输入关键字包含于匹配字段认为匹配成功\n");
      out.write(" \n");
      out.write("    multiWord: false,               //以分隔符号分割的多关键字支持\n");
      out.write("    separator: ',',                 //多关键字支持时的分隔符，默认为半角逗号\n");
      out.write("    delay: 300,                     //搜索触发的延时时间间隔，单位毫秒\n");
      out.write(" \n");
      out.write("    /* UI */\n");
      out.write("    autoDropup: false,              //选择菜单是否自动判断向上展开。设为 true，则当下拉菜单高度超过窗体，且向上方向不会被窗体覆盖，则选择菜单向上弹出\n");
      out.write("    autoMinWidth: false,            //是否自动最小宽度，设为 false 则最小宽度不小于输入框宽度\n");
      out.write("    showHeader: false,              //是否显示选择列表的 header。为 true 时，有效字段大于一列则显示表头\n");
      out.write("    showBtn: true,                  //是否显示下拉按钮\n");
      out.write("    inputBgColor: '',               //输入框背景色，当与容器背景色不同时，可能需要该项的配置\n");
      out.write("    inputWarnColor: 'rgba(255,0,0,.1)', //输入框内容不是下拉列表选择时的警告色\n");
      out.write("    listStyle: {\n");
      out.write("        'padding-top': 0,\n");
      out.write("        'max-height': '375px',\n");
      out.write("        'max-width': '800px',\n");
      out.write("        'overflow': 'auto',\n");
      out.write("        'width': 'auto',\n");
      out.write("        'transition': '0.3s',\n");
      out.write("        '-webkit-transition': '0.3s',\n");
      out.write("        '-moz-transition': '0.3s',\n");
      out.write("        '-o-transition': '0.3s'\n");
      out.write("    },                              //列表的样式控制\n");
      out.write("    listAlign: 'left',              //提示列表对齐位置，left/right/auto\n");
      out.write("    listHoverStyle: 'background: #07d; color:#fff', //提示框列表鼠标悬浮的样式\n");
      out.write("    listHoverCSS: 'jhover',         //提示框列表鼠标悬浮的样式名称\n");
      out.write("    clearable: false,               // 是否可清除已输入的内容\n");
      out.write(" \n");
      out.write("    /* key */\n");
      out.write("    keyLeft: 37,                    //向左方向键，不同的操作系统可能会有差别，则自行定义\n");
      out.write("    keyUp: 38,                      //向上方向键\n");
      out.write("    keyRight: 39,                   //向右方向键\n");
      out.write("    keyDown: 40,                    //向下方向键\n");
      out.write("    keyEnter: 13,                   //回车键\n");
      out.write(" \n");
      out.write("    /* methods */   \n");
      out.write("    fnProcessData: processData,     //格式化数据的方法，返回数据格式参考 data 参数\n");
      out.write("    fnGetData: getData,             //获取数据的方法，无特殊需求一般不作设置\n");
      out.write("    fnAdjustAjaxParam: null,        //调整 ajax 请求参数方法，用于更多的请求配置需求。如对请求关键字作进一步处理、修改超时时间等\n");
      out.write("    fnPreprocessKeyword: null       //搜索过滤数据前，对输入关键字作进一步处理方法。注意，应返回字符串\n");
      out.write("};\n");
      out.write(" </pre>\n");
      out.write(" </div>   \n");
      out.write("</body>\n");
      out.write("</html>\n");
      if (_jspx_meth_t_authFilter_0(_jspx_page_context))
        return;
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
    _jspx_th_t_base_0.setType("bootstrap");
    int _jspx_eval_t_base_0 = _jspx_th_t_base_0.doStartTag();
    if (_jspx_th_t_base_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_base_type_nobody.reuse(_jspx_th_t_base_0);
      return true;
    }
    _jspx_tagPool_t_base_type_nobody.reuse(_jspx_th_t_base_0);
    return false;
  }

  private boolean _jspx_meth_t_authFilter_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:authFilter
    org.jeecgframework.tag.core.easyui.AuthFilterTag _jspx_th_t_authFilter_0 = (org.jeecgframework.tag.core.easyui.AuthFilterTag) _jspx_tagPool_t_authFilter_nobody.get(org.jeecgframework.tag.core.easyui.AuthFilterTag.class);
    _jspx_th_t_authFilter_0.setPageContext(_jspx_page_context);
    _jspx_th_t_authFilter_0.setParent(null);
    int _jspx_eval_t_authFilter_0 = _jspx_th_t_authFilter_0.doStartTag();
    if (_jspx_th_t_authFilter_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_authFilter_nobody.reuse(_jspx_th_t_authFilter_0);
      return true;
    }
    _jspx_tagPool_t_authFilter_nobody.reuse(_jspx_th_t_authFilter_0);
    return false;
  }
}
