<%@ Page Language="C#" AutoEventWireup="true" CodeFile="RepeatedDataBind.aspx.cs" Inherits="RepeatedDataBind" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        类别：<asp:DropDownList ID="DropDownList1" runat="server" AutoPostBack="True">
        </asp:DropDownList>
        <br />
        <asp:BulletedList ID="BulletedList1" runat="server">
        </asp:BulletedList>
    
    </div>
    </form>
</body>
</html>
