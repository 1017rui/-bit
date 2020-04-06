using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class _Default : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        Response.Write("<h1>欢迎使用网上购物系统</h1>");
        Response.Write("<hr/>");
        Response.Write("当前登录用户为：" + User.Identity .Name );
        Response.Write("在线人数：" + Application["count"].ToString());

    }
}