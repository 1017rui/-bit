<<<<<<< HEAD
let buttonElement=document.querySelector("button");
function onclick(ev){
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
                let tbody=document.querySelector("tbody");//HTML输出的标签
                for(let i in articleList){
                    let article=articleList[i];
                    let html="<tr>" +
                        "<td>" +article["id"]+"</td>" +
                        "<td>" +article["title"]+"</td>" +
                        "<td>" +article["published_at"]+"</td>" +
                        "<td>"+article["author"]["id"]+"</td>" +
                        "<td>" +article["author"]["username"]+"</td>" +
                        "</tr>";
                    console.log(html);
                    tbody.innerHTML+=html;//把拼接好的html，放入标签中。
                }
            }

        }
    };
    xhr.send();
}
//如果在button这个标签上，发生了click事件，请执行onclick函数
//每次用户点击button，就允许onclick方法
buttonElement.addEventListener("click",onclick);
/*
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
                //if(articleList.length>0){
                //articleListElement.innerHTML="";
                for(let i in articleList){
                    let article=articleList[i];
                    let html="<li>" +
                        "<a href=\"/article?id="+article["id"]+"\">" +
                        +article["title"]+
                        +article["published_at"]+
                        +article["author"]["id"]+
                        +article["author"]["username"]+
                        "</a></li>";
                    console.log(html);
                    articleListElement.innerHTML+=html;//把拼接好的html，放入标签中。
                }
                //}

            }

        }
    };
    xhr.send();
}
window.onload(onload);*/
=======
let buttonElement=document.querySelector("button");
function onclick(ev){
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
                let tbody=document.querySelector("tbody");//HTML输出的标签
                for(let i in articleList){
                    let article=articleList[i];
                    let html="<tr>" +
                        "<td>" +article["id"]+"</td>" +
                        "<td>" +article["title"]+"</td>" +
                        "<td>" +article["published_at"]+"</td>" +
                        "<td>"+article["author"]["id"]+"</td>" +
                        "<td>" +article["author"]["username"]+"</td>" +
                        "</tr>";
                    console.log(html);
                    tbody.innerHTML+=html;//把拼接好的html，放入标签中。
                }
            }

        }
    };
    xhr.send();
}
//如果在button这个标签上，发生了click事件，请执行onclick函数
//每次用户点击button，就允许onclick方法
buttonElement.addEventListener("click",onclick);
/*
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
                //if(articleList.length>0){
                //articleListElement.innerHTML="";
                for(let i in articleList){
                    let article=articleList[i];
                    let html="<li>" +
                        "<a href=\"/article?id="+article["id"]+"\">" +
                        +article["title"]+
                        +article["published_at"]+
                        +article["author"]["id"]+
                        +article["author"]["username"]+
                        "</a></li>";
                    console.log(html);
                    articleListElement.innerHTML+=html;//把拼接好的html，放入标签中。
                }
                //}

            }

        }
    };
    xhr.send();
}
window.onload(onload);*/
>>>>>>> 64b400532b9ce10e2603c7cd10c3636032e66765
