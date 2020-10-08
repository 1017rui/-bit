from selenium import webdriver
import time

driver = webdriver.Firefox()
driver.get("http://localhost:8080/java_image_server/index.html")
#浏览器最大化
driver.maximize_window()
time.sleep(3)

#上传
#选择了照片
# driver.find_element_by_name("filename").send_keys("C:\\Users\\lenovo\\Pictures\\证件照.jpg")
# time.sleep(6)
# driver.find_element_by_xpath("//*[@id='blog-collapse']/form/div[2]/input").click()
# time.sleep(6)


#删除
driver.find_elements_by_xpath("//*[@id='container']/div[1]/button").click()
time.sleep(6)

#如何去掉这个弹框
alert = driver.switch_to.alert #拿到alert框的操作句柄
alert.accept()
time.sleep(6)

driver.quit()