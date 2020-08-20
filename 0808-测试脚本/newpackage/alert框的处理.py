from selenium import webdriver
import time
import os

driver = webdriver.Firefox()
file_path = 'file:///'+os.path.abspath("D:/-bit/0808-测试脚本/selenium2html/alert.html")
driver.get(file_path)
driver.maximize_window()

driver.find_element_by_id("tooltip").click()
time.sleep(6)
#得到操作句柄
alert = driver.switch_to.alert
#关闭alert框
alert.accept()
driver.quit()