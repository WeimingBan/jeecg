package org.apache.jsp.webpage.com.jeecg.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vueList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/context/mytags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("\t<title>ElementDemo</title>\n");
      out.write("\t<script src=\"https://cdn.bootcss.com/vue/2.2.2/vue.js\"></script>\n");
      out.write("\t<script src=\"https://cdn.bootcss.com/vue-resource/1.5.0/vue-resource.js\"></script>  \n");
      out.write("\t<!-- 引入样式 -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://unpkg.com/element-ui@1.4/lib/theme-default/index.css\">\n");
      out.write("\t<!-- 引入组件库 -->\n");
      out.write("\t<script src=\"https://unpkg.com/element-ui@1.4/lib/index.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${webRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/plug-in/element-ui/css/elementui-ext.css\">\n");
      out.write("<style>\n");
      out.write(".toolbar {\n");
      out.write("    padding: 10px;\n");
      out.write("    margin: 10px 0;\n");
      out.write("}\n");
      out.write(".toolbar .el-form-item {\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("}\n");
      out.write(".el-table__body-wrapper{overflow:hidden;}\n");
      out.write(".el-checkbox__inner{width:16px;height:16px;}\n");
      out.write(".el-table th,.el-table__header-wrapper thead div{background-color:#fff;}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"white\">\n");
      out.write("\t<div id=\"test\">\n");
      out.write("\t\t<!--工具条-->\n");
      out.write("\t\t<!--update-begin-Author:zhangweijian  Date: 20180710 for：TASK #2935 【样式】vue 列表样式尝试优化改进,常用示例-->\n");
      out.write("\t\t<el-col :span=\"24\" class=\"toolbar\" style=\"padding-bottom: 0px;background: #f2f2f2;\">\n");
      out.write("\t\t\t<el-form :inline=\"true\" :model=\"filters\">\n");
      out.write("\t\t\t\t<el-form-item style=\"margin-bottom: 8px;margin-top: 8px;\">\n");
      out.write("\t\t\t\t\t<el-input v-model=\"filters.name\" placeholder=\"姓名\" size=\"small\"></el-input>\n");
      out.write("\t\t\t\t</el-form-item>\n");
      out.write("\t\t\t\t<el-form-item style=\"margin-top: 8px;\">\n");
      out.write("\t\t\t    \t<el-button type=\"primary\" v-on:click=\"getUsers\" size=\"small\">查询</el-button>\n");
      out.write("\t\t\t    </el-form-item>\n");
      out.write("\t\t\t    <el-form-item style=\"margin-top: 8px;\">\n");
      out.write("\t\t<!--update-end-Author:zhangweijian  Date: 20180710 for：TASK #2935 【样式】vue 列表样式尝试优化改进，常用示例-->\n");
      out.write("\t\t\t    \t<el-button type=\"primary\" @click=\"handleAdd\" size=\"small\">新增</el-button>\n");
      out.write("\t\t\t    </el-form-item>\n");
      out.write("\t\t\t</el-form>\n");
      out.write("\t\t</el-col>\n");
      out.write("\n");
      out.write("\t\t<!--列表-->\n");
      out.write("\t\t<el-table :data=\"users\" border stripe size=\"mini\" highlight-current-row v-loading=\"listLoading\" @selection-change=\"selsChange\" style=\"width: 100%;\">\n");
      out.write("\t\t\t<el-table-column type=\"selection\" width=\"55\"></el-table-column>\n");
      out.write("\t\t\t<el-table-column type=\"index\" width=\"60\"></el-table-column>\n");
      out.write("\t\t\t<el-table-column prop=\"name\" label=\"姓名\" width=\"120\" sortable show-overflow-tooltip></el-table-column>\n");
      out.write("\t\t\t<el-table-column prop=\"sex\" label=\"性别\" width=\"100\" :formatter=\"formatSex\" sortable show-overflow-tooltip></el-table-column>\n");
      out.write("\t\t\t<el-table-column prop=\"age\" label=\"年龄\" width=\"100\" sortable show-overflow-tooltip></el-table-column>\n");
      out.write("\t\t\t<el-table-column prop=\"birthday\" label=\"生日\" width=\"120\" :formatter=\"formatBirthday\" sortable show-overflow-tooltip></el-table-column>\n");
      out.write("\t\t\t<el-table-column prop=\"phone\" label=\"电话\" min-width=\"120\" sortable show-overflow-tooltip></el-table-column>\n");
      out.write("\t\t\t<el-table-column label=\"操作\" width=\"150\">\n");
      out.write("\t\t\t\t<template scope=\"scope\">\n");
      out.write("\t\t\t\t\t<el-button size=\"small\" @click=\"handleEdit(scope.$index, scope.row)\">编辑</el-button>\n");
      out.write("\t\t\t\t\t<el-button size=\"small\" type=\"danger\" @click=\"handleDel(scope.$index, scope.row)\">删除</el-button>\n");
      out.write("\t\t\t\t</template>\n");
      out.write("\t\t\t</el-table-column>\n");
      out.write("\t\t</el-table>\n");
      out.write("\n");
      out.write("\t\t<!--工具条-->\n");
      out.write("\t\t<el-col :span=\"24\" class=\"toolbar\">\n");
      out.write("\t\t\t<el-button size=\"small\" type=\"danger\" @click=\"batchRemove\" :disabled=\"this.sels.length===0\">批量删除</el-button>\n");
      out.write("\t\t\t <el-pagination @current-change=\"handleCurrentChange\" :page-sizes=\"[10, 20, 50, 100]\"\n");
      out.write("      \t\t\t:page-size=\"10\" :total=\"total\" layout=\"sizes, prev, pager, next\"  style=\"float:right;\"></el-pagination>\n");
      out.write("\t\t</el-col>\n");
      out.write("\n");
      out.write("\t\t<!--编辑界面-->\n");
      out.write("\t\t<el-dialog title=\"编辑\" v-model=\"editFormVisible\" :close-on-click-modal=\"false\">\n");
      out.write("\t\t\t<el-form :model=\"editForm\" label-width=\"80px\" :rules=\"editFormRules\" ref=\"editForm\">\n");
      out.write("\t\t\t\t<el-form-item label=\"姓名\" prop=\"name\">\n");
      out.write("\t\t\t\t\t<el-input v-model=\"editForm.name\" auto-complete=\"off\" placeholder=\"请输入用戶名\"></el-input>\n");
      out.write("\t\t\t\t</el-form-item>\n");
      out.write("\t\t\t\t<el-form-item label=\"性别\">\n");
      out.write("\t\t\t\t\t<el-radio v-model=\"editForm.sex\" :label=\"1\">男</el-radio>\n");
      out.write("\t\t\t\t\t<el-radio v-model=\"editForm.sex\" :label=\"0\">女</el-radio>\n");
      out.write("\t\t\t\t</el-form-item>\n");
      out.write("\t\t\t\t<el-form-item label=\"年龄\">\n");
      out.write("\t\t\t\t\t<el-input v-model=\"editForm.age\" :min=\"0\" :max=\"200\"></el-input>\n");
      out.write("\t\t\t\t</el-form-item>\n");
      out.write("\t\t\t\t<el-form-item label=\"生日\">\n");
      out.write("\t\t\t\t\t<el-date-picker type=\"date\" placeholder=\"选择日期\" v-model=\"editForm.birthday\"></el-date-picker>\n");
      out.write("\t\t\t\t</el-form-item>\n");
      out.write("\t\t\t\t<!--update-begin-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题,手机号校验-->\n");
      out.write("\t\t\t\t<el-form-item label=\"电话\" prop=\"phone\">\n");
      out.write("\t\t\t\t<!--update-end-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题，手机号校验-->\n");
      out.write("\t\t\t\t\t<el-input v-model=\"editForm.phone\"  placeholder=\"请输入手机号\"></el-input>\n");
      out.write("\t\t\t\t</el-form-item>\n");
      out.write("\t\t\t</el-form>\n");
      out.write("\t\t\t<div slot=\"footer\" class=\"dialog-footer\">\n");
      out.write("\t\t\t\t<el-button @click.native=\"editFormVisible = false\">取消</el-button>\n");
      out.write("\t\t\t\t<el-button type=\"primary\" @click.native=\"editSubmit\" :loading=\"editLoading\">提交</el-button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</el-dialog>\n");
      out.write("\n");
      out.write("\t\t<!--新增界面-->\n");
      out.write("\t\t<el-dialog title=\"新增\" v-model=\"addFormVisible\" :close-on-click-modal=\"false\">\n");
      out.write("\t\t\t<el-form :model=\"addForm\" label-width=\"80px\" :rules=\"addFormRules\" ref=\"addForm\">\n");
      out.write("\t\t\t\t<el-form-item label=\"姓名\" prop=\"name\">\n");
      out.write("\t\t\t\t\t<el-input v-model=\"addForm.name\" auto-complete=\"off\" placeholder=\"请输入用戶名\"></el-input>\n");
      out.write("\t\t\t\t</el-form-item>\n");
      out.write("\t\t\t\t<el-form-item label=\"性别\">\n");
      out.write("\t\t\t\t\t<el-radio v-model=\"addForm.sex\" :label=\"1\">男</el-radio>\n");
      out.write("\t\t\t\t\t<el-radio v-model=\"addForm.sex\" :label=\"0\">女</el-radio>\n");
      out.write("\t\t\t\t</el-form-item>\n");
      out.write("\t\t\t\t<el-form-item label=\"年龄\">\n");
      out.write("\t\t\t\t<!--update-begin-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题，手机号校验-->\n");
      out.write("\t\t\t\t\t<el-input v-model=\"addForm.age\" :min=\"0\" :max=\"200\" auto-complete=\"off\"></el-input>\n");
      out.write("\t\t\t\t<!--update-end-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题，手机号校验-->\n");
      out.write("\t\t\t\t</el-form-item>\n");
      out.write("\t\t\t\t<el-form-item label=\"生日\">\n");
      out.write("\t\t\t\t\t<el-date-picker type=\"date\" placeholder=\"选择日期\" v-model=\"addForm.birthday\"></el-date-picker>\n");
      out.write("\t\t\t\t</el-form-item>\n");
      out.write("\t\t\t\t<!--update-begin-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题，手机号校验-->\n");
      out.write("\t\t\t\t<el-form-item label=\"电话\" prop=\"phone\">\n");
      out.write("\t\t\t\t<!--update-end-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题，手机号校验-->\n");
      out.write("\t\t\t\t\t<el-input v-model=\"addForm.phone\" placeholder=\"请输入手机号\"></el-input>\n");
      out.write("\t\t\t\t</el-form-item>\n");
      out.write("\t\t\t</el-form>\n");
      out.write("\t\t\t<div slot=\"footer\" class=\"dialog-footer\">\n");
      out.write("\t\t\t\t<el-button @click.native=\"addFormVisible = false\">取消</el-button>\n");
      out.write("\t\t\t\t<el-button type=\"primary\" @click.native=\"addSubmit\" :loading=\"addLoading\">提交</el-button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</el-dialog>\n");
      out.write("\t</section>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("<script>\n");
      out.write("<!--update-begin-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题，手机号校验-->\n");
      out.write("var validPhone=(rule, value,callback)=>{\n");
      out.write("    if (!value){\n");
      out.write("        callback(new Error('请输入电话号码'))\n");
      out.write("    }else  if (!isvalidPhone(value)){\n");
      out.write("      callback(new Error('请输入正确的11位手机号码'))\n");
      out.write("    }else {\n");
      out.write("        callback()\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("function isvalidPhone(str) {\n");
      out.write("\tconst reg = /^1[3|4|5|7|8][0-9]\\d{8}$/\n");
      out.write("\treturn reg.test(str)\n");
      out.write("}\n");
      out.write("<!--update-end-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题，手机号校验-->\n");
      out.write("\tvar vue = new Vue({\t\t\t\n");
      out.write("\t\tel:\"#test\",\n");
      out.write("\t\tdata() {\n");
      out.write("\t\t\treturn {\n");
      out.write("\t\t\t\tfilters: {\n");
      out.write("\t\t\t\t\tname: ''\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\turl:{\n");
      out.write("\t\t\t\t\tlist:'jeecgListDemoController.do?datagrid',\n");
      out.write("\t\t\t\t\tdel:'jeecgListDemoController.do?doDel',\n");
      out.write("\t\t\t\t\tbatchDel:'jeecgListDemoController.do?doBatchDel',\n");
      out.write("\t\t\t\t\tsave:'jeecgListDemoController.do?doAdd',\n");
      out.write("\t\t\t\t\tedit:'jeecgListDemoController.do?doUpdate'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tusers: [],\n");
      out.write("\t\t\t\ttotal: 0,\n");
      out.write("\t\t\t\tpage: 1,\n");
      out.write("\t\t\t\tlistLoading: false,\n");
      out.write("\t\t\t\tsels: [],//列表选中列\n");
      out.write("\n");
      out.write("\t\t\t\teditFormVisible: false,//编辑界面是否显示\n");
      out.write("\t\t\t\teditLoading: false,\n");
      out.write("\t\t\t\teditFormRules: {\n");
      out.write("\t\t\t\t\tname: [\n");
      out.write("\t\t\t\t\t\t{ required: true, message: '请输入姓名', trigger: 'blur' }\n");
      out.write("\t\t\t\t\t<!--update-begin-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题-->\n");
      out.write("\t\t\t\t\t],\n");
      out.write("\t\t\t\t\tphone: [\n");
      out.write("\t\t\t\t\t\t{ required: true, validator: validPhone, trigger: 'blur' }\n");
      out.write("\t\t\t\t\t<!--update-end-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题-->\n");
      out.write("\t\t\t\t\t]\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t//编辑界面数据\n");
      out.write("\t\t\t\teditForm: {\n");
      out.write("\t\t\t\t\tid: 0,\n");
      out.write("\t\t\t\t\tname: '',\n");
      out.write("\t\t\t\t\tsex: 0,\n");
      out.write("\t\t\t\t\tage: 0,\n");
      out.write("\t\t\t\t\tbirthday: '',\n");
      out.write("\t\t\t\t\tphone: ''\n");
      out.write("\t\t\t\t},\n");
      out.write("\n");
      out.write("\t\t\t\taddFormVisible: false,//新增界面是否显示\n");
      out.write("\t\t\t\taddLoading: false,\n");
      out.write("\t\t\t\taddFormRules: {\n");
      out.write("\t\t\t\t\tname: [\n");
      out.write("\t\t\t\t\t\t{ required: true, message: '请输入姓名', trigger: 'blur' }\n");
      out.write("\t\t\t\t\t<!--update-begin-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题-->\n");
      out.write("\t\t\t\t\t],\n");
      out.write("\t\t\t\t\tphone: [\n");
      out.write("\t\t\t\t\t\t\t{ required: true, validator: validPhone, trigger: 'blur' }\n");
      out.write("\t\t\t\t\t<!--update-end-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题-->\n");
      out.write("\t\t\t\t\t]\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t//新增界面数据\n");
      out.write("\t\t\t\taddForm: {\n");
      out.write("\t\t\t\t\tname: '',\n");
      out.write("\t\t\t\t\tsex: 0,\n");
      out.write("\t\t\t\t\tage: 0,\n");
      out.write("\t\t\t\t\tbirthday: '',\n");
      out.write("\t\t\t\t\tphone: ''\n");
      out.write("\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t}\n");
      out.write("\t\t},\n");
      out.write("\t\tmethods: {\n");
      out.write("\t\t\t//性别显示转换\n");
      out.write("\t\t\tformatSex: function (row, column) {\n");
      out.write("\t\t\t\treturn row.sex == 1 ? '男' : row.sex == 0 ? '女' : '未知';\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tformatBirthday: function(row,column){\n");
      out.write("\t\t\t\treturn !!row.birthday?formatDate(new Date(row.birthday), 'yyyy-MM-dd'):'';\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\thandleCurrentChange(val) {\n");
      out.write("\t\t\t\tthis.page = val;\n");
      out.write("\t\t\t\tthis.getUsers();\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\t//获取用户列表\n");
      out.write("\t\t\tgetUsers() {\n");
      out.write("\t\t\t\tlet para = {\n");
      out.write("\t\t\t\t\tparams: {\n");
      out.write("\t\t\t\t\t\tpage: this.page,\n");
      out.write("\t\t\t\t\t\trows:10,\n");
      out.write("\t\t\t\t\t\tname:this.filters.name,\n");
      out.write("\t\t\t\t\t\tfield:'id,name,sex,age,birthday,phone'\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t};\n");
      out.write("\t\t\t\tthis.listLoading = true;\n");
      out.write("\t\t\t\tthis.$http.get(this.url.list,para).then((res) => {\n");
      out.write("\t\t\t\t\tthis.total = res.data.total;\n");
      out.write("\t\t\t\t\tfor (var i=0; i<res.data.rows.length; i++)\n");
      out.write("\t\t\t\t  \t{\n");
      out.write("\t\t\t\t\t\tres.data.rows[i].sex=parseInt(res.data.rows[i].sex);\n");
      out.write("\t\t\t\t  \t}\n");
      out.write("\t\t\t\t\tthis.users = res.data.rows;\n");
      out.write("\t\t\t\t\tthis.listLoading = false;\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\t//删除\n");
      out.write("\t\t\thandleDel: function (index, row) {\n");
      out.write("\t\t\t\tthis.$confirm('确认删除该记录吗?', '提示', {\n");
      out.write("\t\t\t\t\ttype: 'warning'\n");
      out.write("\t\t\t\t}).then(() => {\n");
      out.write("\t\t\t\t\tthis.listLoading = true;\n");
      out.write("\t\t\t\t\tlet para = { id: row.id };\n");
      out.write("\t\t\t\t\tthis.$http.post(this.url.del,para,{emulateJSON: true}).then((res) => {\n");
      out.write("\t\t\t\t\t\tthis.listLoading = false;\n");
      out.write("\t\t\t\t\t\tthis.$message({\n");
      out.write("\t\t\t\t\t\t\tmessage: '删除成功',\n");
      out.write("\t\t\t\t\t\t\ttype: 'success'\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\tthis.getUsers();\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t}).catch(() => {\n");
      out.write("\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\t//显示编辑界面\n");
      out.write("\t\t\thandleEdit: function (index, row) {\n");
      out.write("\t\t\t\tthis.editFormVisible = true;\n");
      out.write("\t\t\t\tthis.editForm = Object.assign({}, row);\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\t//显示新增界面\n");
      out.write("\t\t\thandleAdd: function () {\n");
      out.write("\t\t\t\tthis.addFormVisible = true;\n");
      out.write("\t\t\t\tthis.addForm = {\n");
      out.write("\t\t\t\t\tname: '',\n");
      out.write("\t\t\t\t\tsex: 0,\n");
      out.write("\t\t\t\t\tage: 0,\n");
      out.write("\t\t\t\t\tbirthday: '',\n");
      out.write("\t\t\t\t\tphone: ''\n");
      out.write("\t\t\t\t};\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\t//编辑\n");
      out.write("\t\t\teditSubmit: function () {\n");
      out.write("\t\t\t\tthis.$refs.editForm.validate((valid) => {\n");
      out.write("\t\t\t\t\tif (valid) {\n");
      out.write("\t\t\t\t\t\tthis.$confirm('确认提交吗？', '提示', {}).then(() => {\n");
      out.write("\t\t\t\t\t\t\tthis.editLoading = true;\n");
      out.write("\t\t\t\t\t\t\tlet para = Object.assign({}, this.editForm);\n");
      out.write("\t\t\t\t\t\t\tpara.birthday = (!para.birthday || para.birthday == '') ? '' : formatDate(new Date(para.birthday), 'yyyy-MM-dd');\n");
      out.write("\t\t\t\t\t\t\tthis.$http.post(this.url.edit,para,{emulateJSON: true}).then((res) => {\n");
      out.write("\t\t\t\t\t\t\t\tthis.editLoading = false;\n");
      out.write("\t\t\t\t\t\t\t\tthis.$message({\n");
      out.write("\t\t\t\t\t\t\t\t\tmessage: '提交成功',\n");
      out.write("\t\t\t\t\t\t\t\t\ttype: 'success'\n");
      out.write("\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\tthis.$refs['editForm'].resetFields();\n");
      out.write("\t\t\t\t\t\t\t\tthis.editFormVisible = false;\n");
      out.write("\t\t\t\t\t\t\t\tthis.getUsers();\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\t//新增\n");
      out.write("\t\t\taddSubmit: function () {\n");
      out.write("\t\t\t\tthis.$refs.addForm.validate((valid) => {\n");
      out.write("\t\t\t\t\tif (valid) {\n");
      out.write("\t\t\t\t\t\tthis.$confirm('确认提交吗？', '提示', {}).then(() => {\n");
      out.write("\t\t\t\t\t\t\tthis.addLoading = true;\n");
      out.write("\t\t\t\t\t\t\tlet para = Object.assign({}, this.addForm);\n");
      out.write("\t\t\t\t\t\t\tpara.birthday = (!para.birthday || para.birthday == '') ? '' : formatDate(new Date(para.birthday), 'yyyy-MM-dd');\n");
      out.write("\t\t\t\t\t\t\tthis.$http.post(this.url.save,para,{emulateJSON: true}).then((res) => {\n");
      out.write("\t\t\t\t\t\t\t\tthis.addLoading = false;\n");
      out.write("\t\t\t\t\t\t\t\tthis.$message({\n");
      out.write("\t\t\t\t\t\t\t\t\tmessage: '提交成功',\n");
      out.write("\t\t\t\t\t\t\t\t\ttype: 'success'\n");
      out.write("\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\tthis.$refs['addForm'].resetFields();\n");
      out.write("\t\t\t\t\t\t\t\tthis.addFormVisible = false;\n");
      out.write("\t\t\t\t\t\t\t\tthis.getUsers();\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tselsChange: function (sels) {\n");
      out.write("\t\t\t\tthis.sels = sels;\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\t//批量删除\n");
      out.write("\t\t\tbatchRemove: function () {\n");
      out.write("\t\t\t\tvar ids = this.sels.map(item => item.id).toString();\n");
      out.write("\t\t\t\tthis.$confirm('确认删除选中记录吗？', '提示', {\n");
      out.write("\t\t\t\t\ttype: 'warning'\n");
      out.write("\t\t\t\t}).then(() => {\n");
      out.write("\t\t\t\t\tthis.listLoading = true;\n");
      out.write("\t\t\t\t\tlet para = { ids: ids };\n");
      out.write("\t\t\t\t\tthis.$http.post(this.url.batchDel,para,{emulateJSON: true}).then((res) => {\n");
      out.write("\t\t\t\t\t\tthis.listLoading = false;\n");
      out.write("\t\t\t\t\t\tthis.$message({\n");
      out.write("\t\t\t\t\t\t\tmessage: '删除成功',\n");
      out.write("\t\t\t\t\t\t\ttype: 'success'\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\tthis.getUsers();\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t}).catch(() => {\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t}\n");
      out.write("\t\t},\n");
      out.write("\t\tmounted() {\n");
      out.write("\t\t\tthis.getUsers();\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\tfunction formatDate(date, pattern) {\n");
      out.write("        pattern = pattern || \"yyyy-MM-dd\";\n");
      out.write("        return pattern.replace(/([yMdhsm])(\\1*)/g, function ($0) {\n");
      out.write("            switch ($0.charAt(0)) {\n");
      out.write("                case 'y': return padding(date.getFullYear(), $0.length);\n");
      out.write("                case 'M': return padding(date.getMonth() + 1, $0.length);\n");
      out.write("                case 'd': return padding(date.getDate(), $0.length);\n");
      out.write("                case 'w': return date.getDay() + 1;\n");
      out.write("                case 'h': return padding(date.getHours(), $0.length);\n");
      out.write("                case 'm': return padding(date.getMinutes(), $0.length);\n");
      out.write("                case 's': return padding(date.getSeconds(), $0.length);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    };\n");
      out.write("\tfunction padding(s, len) {\n");
      out.write("\t    var len = len - (s + '').length;\n");
      out.write("\t    for (var i = 0; i < len; i++) { s = '0' + s; }\n");
      out.write("\t    return s;\n");
      out.write("\t};\n");
      out.write("</script>\n");
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
}