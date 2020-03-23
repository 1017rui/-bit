function validate()
{
    if (document.form1.username.value.length == 0) {
        alert("请输入您的姓名！");
        document.form1.username.focus();
        return false;
    }
}
function check() {
    var value = document.form1.pwd.value;
    var pattern = /^[a-zA-Z]{1}([a-zA-Z0-9]|[._]){4,19]$/;
    flag = pattern.test(value);
    if (flag)
        return true;
    else {
        alert("密码格式不正确！");
        return false;
    }
}
function compare() {

    if (document.form1.pwd.value != document.form1.repwd.value) {
        alert("您两次输入的密码不一样！请重新输入。");
        document.form1.repwd.focus();
        return false;
    }
}
function isEmail()
{
    var value=document.form1.email.value;
    var patten=/^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/;
    flag=patten.test(value);
    if(flag)
        return true;
    else{
        alert("邮箱格式不正确！");
        return false;
    }
}