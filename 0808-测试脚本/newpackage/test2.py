from selenium import webdriver
import time
driver =webdriver.Firefox()
driver.get("https://www.baidu.com/")
#最大化浏览器
driver.maximize_window()
time.sleep(3)

#用id来定位
#driver.find_element_by_id("kw").send_keys("偶像练习生")
#driver.find_element_by_id("su").click()
#用name来定位

#driver.find_element_by_name("wd").send_keys("迪丽热巴")
#driver.find_element_by_id("su").click()

#用class-name定位  无法定位
#driver.find_element_by_class_name("s_ipt nobg_s_fm_hover").send_keys("安崎")
#driver.find_element_by_class_name("btn self-btn bg s_btn btn_h btnhover").click();

#tag name定位  定位的数据太多了
#driver.find_element_by_tag_name("input").send_keys("安崎")
#driver.find_element_by_id("su").click()


#link test
#driver.find_element_by_link_text("视频").click()

#partial link text  多个链接中都含有这个字时无法定位
#driver.find_element_by_partial_link_text("频").click()

#xpath定位
#driver.find_element_by_xpath("//*[@id='kw']").send_keys("安崎")
#driver.find_element_by_xpath("//*[@id='su']").click()
#css
driver.find_element_by_css_selector("#kw").send_keys("喻言")
driver.find_element_by_css_selector("#su").click()


time.sleep(3)
driver.quit()
