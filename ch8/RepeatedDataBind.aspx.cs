using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.SqlClient;
using System.Configuration;
public partial class RepeatedDataBind : System.Web.UI.Page
{
    private string connStr=ConfigurationManager .ConnectionStrings["nwdConn"].ToString();
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!IsPostBack)
        {

        using (SqlConnection conn = new SqlConnection(connStr))
        {
            SqlCommand cmd = conn.CreateCommand();
            cmd.CommandText = "selsct categoryName from categories";
            conn.Open();
            SqlDataReader dr = cmd.ExecuteReader();

            DropDownList1.DataSource = dr;
            DropDownList1 .DataTextField = "categoryName";
            DropDownList1.DataValueField = "categoryid";
            DropDownList1.DataBind();
        }
    }
        bindPoroducts();
    }

    private void bindPoroducts()
    {
        using (SqlConnection conn = new SqlConnection(connStr))
        {
            string catid=DropDownList1 .SelectedValue ;
            SqlCommand cmd = conn.CreateCommand();
            cmd.CommandText = "select productName from products where categoryId=@catid ";
            cmd.Parameters.AddWithValue("@catid", catid);
            conn.Open();
            SqlDataReader dr = cmd.ExecuteReader();
            BulletedList1.DataSource = dr;
            BulletedList1.DataTextField = "productName";
            BulletedList1.DataBind();
        }
    }
}