from selenium import webdriver
import time
import os

driver = webdriver.Firefox()
file_path = 'file:///'+os.path.abspath("D:/-bit/0808-测试脚本/selenium2html/upload.html")
driver.get(file_path)
driver.maximize_window()
#定位上传文件按钮
driver.find_element_by_name("file").send_keys("D:/-bit/0808-测试脚本/selenium2html/upload.html")
time.sleep(5)

driver.quit()