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


public partial class WebFiles_Attendece_Attendece_result : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!IsPostBack)
            Bind();
    }
    private void Bind()
    {
        SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString);
        string sql = "select A_ID 考勤编号,E_Name 员工姓名,A_WorkTime 总工时,A_Onwork1 上班时间一,A_Offwork1 下班时间一,A_Onwork2 上班时间二,A_Offwork2 下班时间二 from [Tb_attendece_result],[Tb_employee] where [Tb_attendece_result].E_ID=[Tb_employee].E_ID";
        SqlDataAdapter sda = new SqlDataAdapter(sql, con);
        DataSet ds = new DataSet();
        sda.Fill(ds, "temp");
        con.Close();
        ListAttendece.DataSource = ds.Tables["temp"].DefaultView;
        ListAttendece.DataBind();
    }
}
