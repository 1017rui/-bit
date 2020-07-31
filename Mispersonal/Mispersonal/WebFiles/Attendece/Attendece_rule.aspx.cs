using System;
using System.Data;
using System.Configuration;
using System.Collections;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Web.UI.HtmlControls;
using System.Data.SqlClient;
public partial class WebFiles_Attendece_Attendce_rule : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!IsPostBack)
            Bind();
    }
    private void Bind()
    {
        SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString);
        string sql = "select Onwork_Ahead 上半时间一,Onwork_Normal 下班时间一,Offwork_Delay 上班时间二,Offwork_Normal 下班时间二 from [Tb_attendece_rule]";
        SqlDataAdapter sda = new SqlDataAdapter(sql, con);
        DataSet ds = new DataSet();
        sda.Fill(ds, "temp");
        con.Close();
        list.DataSource = ds.Tables["temp"].DefaultView;
        list.DataBind();
    }
}
