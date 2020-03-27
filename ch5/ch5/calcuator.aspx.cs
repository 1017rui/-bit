using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace ch5
{
    public partial class calcuator : System.Web.UI.Page
    {
       
        protected void operation(object sender, CommandEventArgs e)
        {
            double op1 = double.Parse(opc1.Text);
            double op2 = double.Parse(opc2.Text);
            double ans = 0;
            switch (e.CommandName)
            {
                case "Add": ans = op1 + op2; oper1.Text = "+"; break;
                case "Substract": ans = op1 - op2; oper1.Text = "-"; break;
                case "Multiply": ans = op1 * op2; oper1.Text = "*"; break;
                case "Divide": ans = op1 / op2; oper1.Text = "/"; break;
            }
            result.Text = ans.ToString();
        }
    }
}