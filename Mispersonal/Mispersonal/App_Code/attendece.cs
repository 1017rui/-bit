using System;
using System.Data;
using System.Configuration;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Web.UI.HtmlControls;
using System.Data.SqlClient;
/// <summary>
/// attendece 的摘要说明
/// </summary>
public class attendece
{
    //先申明一系列常用的对象
    private string connstr;
    private SqlConnection Sqlconn;
    private SqlCommand Sqlcmd;
    private SqlDataAdapter Sqladpter;
    private DataSet ds;
    private SqlDataReader Sqlreader;
	
    public attendece()
    {//初始化所有的实例
        connstr = ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString;
        Sqlconn = new SqlConnection(connstr);
        Sqlcmd = new SqlCommand();
        Sqladpter = new SqlDataAdapter();
        ds = new DataSet();
	}
    public SqlDataReader List(string sql)
    {
        Sqlcmd.CommandText = sql;
        Sqlcmd.Connection = Sqlconn;
        if (Sqlconn.State == ConnectionState.Closed) { Sqlconn.Open(); }
        Sqlreader = Sqlcmd.ExecuteReader(CommandBehavior.CloseConnection);
        return Sqlreader;
    }
}
