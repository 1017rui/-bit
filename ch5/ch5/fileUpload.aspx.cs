using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace ch5
{
    public partial class fileUpload : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            if (FileUpload1.HasFile)
            {
                try
                {
                    String path = Request.MapPath("~/uploads/");
                    FileUpload1.PostedFile.SaveAs(path+FileUpload1 .FileName);
                    lblMsg.Text = "上传文件名：" + FileUpload1.FileName + "<br>"
                        + "上传文件类型：" + FileUpload1.PostedFile.ContentType + "<br>"
                        + "上传文件大小：" + FileUpload1.PostedFile.ContentLength.ToString()
                        + "字节";
                }
                catch (Exception ex) { lblMsg.Text = ex.Message; }

            }
        }
    }
}