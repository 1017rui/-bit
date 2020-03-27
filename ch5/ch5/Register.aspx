<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Register.aspx.cs" Inherits="ch5.Register" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
    <style type="text/css">
        .auto-style1 {
            width: 45%;
            height: 168px;
        }
        .auto-style2 {
            width: 127px;
        }
        .auto-style3 {
            width: 640px;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        新用户注册<br />
    
        <table class="auto-style1">
            <tr>
                <td class="auto-style2">用户名：</td>
                <td class="auto-style3">
                    <asp:TextBox ID="name" runat="server" style="margin-left: 0px"></asp:TextBox>
                    <asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" ControlToValidate="name" ErrorMessage="用户名必须输入">*</asp:RequiredFieldValidator>
                </td>
            </tr>
            <tr>
                <td class="auto-style2">密码：</td>
                <td class="auto-style3">
                    <asp:TextBox ID="password" runat="server" TextMode="Password"></asp:TextBox>
                    <asp:RequiredFieldValidator ID="RequiredFieldValidator2" runat="server" ControlToValidate="password" ErrorMessage="密码必须填写">*</asp:RequiredFieldValidator>
                </td>
            </tr>
            <tr>
                <td class="auto-style2">确认密码：</td>
                <td class="auto-style3">
                    <asp:TextBox ID="confirm" runat="server" TextMode="Password" Width="178px"></asp:TextBox>
                    <asp:CompareValidator ID="CompareValidator1" runat="server" ControlToCompare="password" ControlToValidate="confirm" ErrorMessage="确认密码需与密码一致">确认密码需与密码一致</asp:CompareValidator>
                </td>
            </tr>
            <tr>
                <td class="auto-style2">年龄：</td>
                <td class="auto-style3">
                    <asp:TextBox ID="age" runat="server"></asp:TextBox>
                    <asp:RangeValidator ID="RangeValidator1" runat="server" ControlToValidate="age" ErrorMessage="年龄不在范围内">年龄不符</asp:RangeValidator>
                </td>
            </tr>
            <tr>
                <td class="auto-style2">Email:</td>
                <td class="auto-style3">
                    <asp:TextBox ID="email" runat="server"></asp:TextBox>
                    <asp:RegularExpressionValidator ID="RegularExpressionValidator1" runat="server" ControlToValidate="email" ErrorMessage="Email格式不正确" ValidationExpression="\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*">输入正确的Email</asp:RegularExpressionValidator>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <asp:Button ID="Button1" runat="server" Text="提交" />
                </td>
                
            </tr>
        </table>
    
    </div>
        <asp:ValidationSummary ID="ValidationSummary1" runat="server" />
    </form>
</body>
</html>
