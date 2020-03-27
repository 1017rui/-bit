<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="fileUpload.aspx.cs" Inherits="ch5.fileUpload" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:FileUpload ID="FileUpload1" runat="server" />
    
    </div>
        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="上传" />
        <p>
            <asp:Label ID="lblMsg" runat="server"></asp:Label>
        </p>
    </form>
</body>
</html>
