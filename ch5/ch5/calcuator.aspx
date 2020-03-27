<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="calcuator.aspx.cs" Inherits="ch5.calcuator" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:TextBox ID="opc1" runat="server"></asp:TextBox>
        <asp:Label ID="oper1" runat="server"></asp:Label>
        <asp:TextBox ID="opc2" runat="server"></asp:TextBox>
        =<asp:Label ID="result" runat="server"></asp:Label>
    
    </div>
        <asp:Button ID="Button1" runat="server" CommandName="Add" OnCommand="operation" Text="+" Width="72px" />
        <asp:Button ID="Button2" runat="server" CommandName="Substract" OnCommand="operation" Text="-" Width="79px" />
        <asp:Button ID="Button3" runat="server" CommandName="Multiply" OnCommand="operation" Text="*" Width="76px" />
        <asp:Button ID="Button4" runat="server" CommandName="Divide" OnCommand="operation" Text="/" Width="82px" />
    </form>
</body>
</html>
