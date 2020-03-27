using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace ch5
{
    public partial class survey : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void CheckBoxList1_SelectedIndexChanged(object sender, EventArgs e)
        {
            int i;
            string str = "您喜爱的球类运动是：<br>";
            for (i = 0; i < CheckBoxList1.Items.Count; i++)
                if (CheckBoxList1.Items[i].Selected)
                    str += CheckBoxList1.Items[i].Value + "<br>";
            Label1.Text = str;
        }
    }
}