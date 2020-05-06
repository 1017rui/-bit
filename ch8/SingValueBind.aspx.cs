using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class SingValueBind : System.Web.UI.Page
{

    protected string CurrentUser
    {
        get
        {
            return "White";
        }
    }

    protected string getImg()
    {
        return "~/img/user.png";
    }
    protected void Page_Load(object sender, EventArgs e)
    {
        this.DataBind();
    }
}