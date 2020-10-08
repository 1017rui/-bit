
function onload(ev){
//用户点击button，发起ajax请求
    let xhr=new XMLHttpRequest();
    xhr.open("get","/api/article-list.json");
    //使用了一个匿名的函数，定义了一个函数但是没有起名字
    xhr.onreadystatechange=function(ev){
        if(xhr.readyState==XMLHttpRequest.DONE){//ajax请求完成时
            if(xhr.status==200){//HTTP响应200的时候
                let articleList=JSON.parse(xhr.responseText);//把结果按照json格式进行解析
                console.log(articleList);
                //把得到的结果放入HTML中，
                let articleListElement=document.querySelector("#article-list");//HTML输出的标签
                if(articleList.length > 0){
                    articleListElement.innerHTML="";
                    for(let i in articleList){
                        let article=articleList[i];
                        let html="<li>" +
                            "<a href=\"/article?id="+article["id"]+"\">" +
                            "标题："+article["title"]+
                            "</a>"+"&emsp;"+"作者："+article["author"]["username"]+"&emsp;"+"发表时间："+article["published_at"]+"</li>";
                        console.log(html);
                        articleListElement.innerHTML+=html;//把拼接好的html，放入标签中。
                    }
                }

            }

        }
    };
    xhr.send();
}
window.onload(onload);