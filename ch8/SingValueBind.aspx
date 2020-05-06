<%@ Page Language="C#" AutoEventWireup="true" CodeFile="SingValueBind.aspx.cs" Inherits="SingValueBind" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        当前时间为：<%#DateTime.Now %>
        <br />
        当前页面URL：<%#Request .Url %><br />
&nbsp;欢迎您：
     
        <asp:Label ID="Label1" runat="server" Text="<%#CurrentUser  %>">"></asp:Label>
        <br />
        <asp:Image ID="Image1" ImageUrl ="<%#getImg () %>" runat="server" />
    </div>
    </form>
</body>
</html>
