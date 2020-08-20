from selenium import webdriver
import time
import os

driver = webdriver.Firefox()
file_path = 'file:///'+os.path.abspath("D:/-bit/0808-测试脚本/selenium2html/frame.html")
driver.get(file_path)
driver.maximize_window()

time.sleep(6)
#从默认的页面跳转到id=f2的页面
driver.switch_to.frame("f1")
driver.switch_to.frame("f2")
driver.find_element_by_id("kw").send_keys("迪丽热巴")
driver.find_element_by_id("su").submit()
time.sleep(6)
#跳转到默认页面
driver.switch_to.default_content()
driver.switch_to.frame("f1")
driver.find_element_by_link_text("click").click()
time.sleep(6)

driver.quit()