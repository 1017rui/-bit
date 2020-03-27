<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="usercheck.aspx.cs" Inherits="ch5.usercheck" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="lblMsg" runat="server"></asp:Label>
        <br />
    
        <asp:Label ID="Label1" runat="server" Text="姓名："></asp:Label>
        <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Label ID="Label2" runat="server" Text="密码："></asp:Label>
        <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
    
    </div>
        <asp:Button ID="Button1" runat="server" Text="登录" OnClick="onclick" />
    </form>
</body>
</html>
