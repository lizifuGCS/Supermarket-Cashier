/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-09-23 11:17:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>欢迎页面-收银系统管理后台</title>\n");
      out.write("        <meta name=\"renderer\" content=\"webkit\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi\" />\n");
      out.write("        <link rel=\"shortcut icon\" href=\"/favicon.ico\" type=\"image/x-icon\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"/static/css/font.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"/static/css/xadmin.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div class=\"x-body layui-anim layui-anim-up\">\n");
      out.write("\n");
      out.write("        <blockquote class=\"layui-elem-quote\">欢迎登录：\n");
      out.write("            <span class=\"x-red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${login.EName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\n");
      out.write("\n");
      out.write("            当前时间:<div id=\"time\"> </div>\n");
      out.write("            <script src=\"static/js/current-time.js\"></script>\n");
      out.write("\n");
      out.write("        </blockquote>\n");
      out.write("        <fieldset class=\"layui-elem-field\">\n");
      out.write("            <legend>数据统计</legend>\n");
      out.write("            <div class=\"layui-field-box\">\n");
      out.write("                <div class=\"layui-col-md12\">\n");
      out.write("                    <div class=\"layui-card\">\n");
      out.write("                        <div class=\"layui-card-body\">\n");
      out.write("                            <div class=\"layui-carousel x-admin-carousel x-admin-backlog\" lay-anim=\"\" lay-indicator=\"inside\" lay-arrow=\"none\" style=\"width: 100%; height: 90px;\">\n");
      out.write("                                <div carousel-item=\"\">\n");
      out.write("                                    <ul class=\"layui-row layui-col-space10 layui-this\">\n");
      out.write("                                        <li class=\"layui-col-xs2\">\n");
      out.write("                                            <a href=\"javascript:;\" class=\"x-admin-backlog-body\">\n");
      out.write("                                                <h3>员工数</h3>\n");
      out.write("                                                <p>\n");
      out.write("                                                    <cite id=\"totalEmpl\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${totalEmpl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</cite></p>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"layui-col-xs2\">\n");
      out.write("                                            <a href=\"javascript:;\" class=\"x-admin-backlog-body\">\n");
      out.write("                                                <h3>商品数</h3>\n");
      out.write("                                                <p>\n");
      out.write("                                                    <cite id=\"totalGd\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${totalGd}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</cite></p>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"layui-col-xs2\">\n");
      out.write("                                            <a href=\"javascript:;\" class=\"x-admin-backlog-body\">\n");
      out.write("                                                <h3>活动数</h3>\n");
      out.write("                                                <p>\n");
      out.write("                                                    <cite id=\"totalEt\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${totalEt}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</cite></p>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"layui-col-xs2\">\n");
      out.write("                                            <a href=\"javascript:;\" class=\"x-admin-backlog-body\">\n");
      out.write("                                                <h3>商品分类数</h3>\n");
      out.write("                                                <p>\n");
      out.write("                                                    <cite id=\"totalGdt\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${totalGdt}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</cite></p>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"layui-col-xs2\">\n");
      out.write("                                            <a href=\"javascript:;\" class=\"x-admin-backlog-body\">\n");
      out.write("                                                <h3>订单数</h3>\n");
      out.write("                                                <p>\n");
      out.write("                                                    <cite id=\"totalOd\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${totalOd}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</cite></p>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </fieldset>\n");
      out.write("        <fieldset class=\"layui-elem-field\">\n");
      out.write("            <legend>系统通知</legend>\n");
      out.write("            <div class=\"layui-field-box\">\n");
      out.write("                <table class=\"layui-table\" lay-skin=\"line\">\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td >\n");
      out.write("                                <a class=\"x-a\" href=\"/\" target=\"_blank\">响应党的号召</a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td >\n");
      out.write("                                <a class=\"x-a\" href=\"/\" target=\"_blank\">不能偷懒</a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </fieldset>\n");
      out.write("        <fieldset class=\"layui-elem-field\">\n");
      out.write("            <legend>开发团队</legend>\n");
      out.write("            <div class=\"layui-field-box\">\n");
      out.write("                <table class=\"layui-table\">\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>版权所有</th>\n");
      out.write("                            <td>www.gxaedu.com(国信安教育)</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>开发者</th>\n");
      out.write("                            <td>黄乔国(2402973438@qq.com)</td></tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </fieldset>\n");
      out.write("        <blockquote class=\"layui-elem-quote layui-quote-nm\">感谢layui,百度Echarts,jquery,本系统由x-admin提供技术支持。</blockquote>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        /*\n");
      out.write("        获取员工总数\n");
      out.write("         */\n");
      out.write("        $(function () {\n");
      out.write("            $.ajax({\n");
      out.write("                type:\"post\",\n");
      out.write("                url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/welcome/showData\",\n");
      out.write("                dataType:\"json\",\n");
      out.write("                success:function (data) {\n");
      out.write("                    console.log(data);\n");
      out.write("                    $(\"#totalEmpl\").html(data.data);\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("        /*\n");
      out.write("        获取商品总数\n");
      out.write("         */\n");
      out.write("        $(function () {\n");
      out.write("            $.ajax({\n");
      out.write("                type:\"post\",\n");
      out.write("                url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/welcome/showGd\",\n");
      out.write("                dataType:\"json\",\n");
      out.write("                success:function (data) {\n");
      out.write("                    console.log(data);\n");
      out.write("                    $(\"#totalGd\").html(data.data);\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("        /*\n");
      out.write("        获取商品类别总数\n");
      out.write("         */\n");
      out.write("        $(function () {\n");
      out.write("            $.ajax({\n");
      out.write("                type:\"post\",\n");
      out.write("                url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/welcome/showGdt\",\n");
      out.write("                dataType:\"json\",\n");
      out.write("                success:function (data) {\n");
      out.write("                    console.log(data);\n");
      out.write("                    $(\"#totalGdt\").html(data.data);\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("        /*\n");
      out.write("        获取订单总数\n");
      out.write("         */\n");
      out.write("        $(function () {\n");
      out.write("            $.ajax({\n");
      out.write("                type:\"post\",\n");
      out.write("                url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/welcome/showOd\",\n");
      out.write("                dataType:\"json\",\n");
      out.write("                success:function (data) {\n");
      out.write("                    console.log(data);\n");
      out.write("                    $(\"#totalOd\").html(data.data);\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("        /*\n");
      out.write("       获取活动总数\n");
      out.write("        */\n");
      out.write("        $(function () {\n");
      out.write("            $.ajax({\n");
      out.write("                type:\"post\",\n");
      out.write("                url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/welcome/showEt\",\n");
      out.write("                dataType:\"json\",\n");
      out.write("                success:function (data) {\n");
      out.write("                    console.log(data);\n");
      out.write("                    $(\"#totalEt\").html(data.data);\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}