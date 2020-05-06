using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using MySql.Data.MySqlClient;
public partial class MySqlTest : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        string connStr = "server=localhost;database=ocean;uid=root;pwd=root";
        MySqlConnection conn = new MySqlConnection(connStr);
        MySqlCommand cmd = new MySqlCommand();
        cmd.Connection = conn;
        cmd.CommandText = "select *from oidinfo";
        try
        {
            conn.Open();
            MySqlDataReader dr = cmd.ExecuteReader();
            GridView1.DataSource = dr;
            GridView1.DataBind();
            dr.Close();
        }
        finally
        {
            conn.Close();
        }
    }
}