using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace ch5
{
    public partial class usercheck : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {

        }

        protected void onclick(object sender, EventArgs e)
        {
            if (TextBox1.Text == "zhangsan" && TextBox2.Text == "zhangsan")
                lblMsg.Text ="登陆成功，欢迎您！";
            else
                lblMsg.Text ="登陆不成功！";
        }
    }
}