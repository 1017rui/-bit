from selenium import webdriver
import time
import os

driver = webdriver.Firefox()
file_path = 'file:///'+os.path.abspath("D:/-bit/0808-测试脚本/selenium2html/modal.html")
driver.get(file_path)
driver.maximize_window()

time.sleep(5)
#点击主页的click按钮
driver.find_element_by_id("show_modal").click()
#点击click me
div1 = driver.find_element_by_class_name("modal-body")
div1.find_element_by_css_selector(".#click").click()
time.sleep(5)
#定位close
div2 = driver.find_element_by_class_name("modal-footer")
buttons = div2.find_element_by_tag_name("button")
time.sleep(5)
buttons[0].click()
time.sleep(5)

driver.quit()