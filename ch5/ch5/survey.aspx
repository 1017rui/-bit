<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="survey.aspx.cs" Inherits="ch5.survey" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:CheckBoxList ID="CheckBoxList1" runat="server" AutoPostBack="True" OnSelectedIndexChanged="CheckBoxList1_SelectedIndexChanged">
            <asp:ListItem>篮球</asp:ListItem>
            <asp:ListItem>足球</asp:ListItem>
            <asp:ListItem>羽毛球</asp:ListItem>
            <asp:ListItem>乒乓球</asp:ListItem>
        </asp:CheckBoxList>
        <br />
    
    </div>
        <asp:Label ID="Label1" runat="server" Text="Label"></asp:Label>
    </form>
</body>
</html>
