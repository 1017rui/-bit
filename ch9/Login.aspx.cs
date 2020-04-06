using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.Security;

public partial class Login : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        string name = TextBox1.Text;
        string password = TextBox2.Text;
        if (FormsAuthentication .Authenticate (name ,password))
        {
           // FormsAuthentication .SetAuthCookie(name,true);
           // Response.Redirect("Default.aspx");
            FormsAuthentication.RedirectFromLoginPage(name,true);

        }
        else
            Label1.Text = "用户名或密码错误！";
    }
}