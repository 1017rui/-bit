using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.SqlClient;
using System.Configuration;
public partial class Authors : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        //string connStr = @"Data sourse=LAPTOP-THIOJF8H\8ENET;Initial Catalog=pubs;Integrated Security=true";
        string connStr = ConfigurationManager.ConnectionStrings["pubs"].ConnectionString; 
        SqlConnection conn = new SqlConnection(connStr);
        SqlCommand cmd = new SqlCommand();
        cmd.Connection = conn;
        cmd.CommandText = "select *from authors";
        try
        {
            conn.Open();
            SqlDataReader dr = cmd.ExecuteReader();
            GridView1.DataSource = dr;
            GridView1.DataBind();
            dr.Close();
        }catch(Exception ex){}
        finally{
            conn.Close();
        }
    }
}