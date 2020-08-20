from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
import time
import os

driver = webdriver.Firefox()
file_path = 'file:///'+os.path.abspath("D:/-bit/0808-测试脚本/selenium2html/level_locate.html")
driver.get(file_path)
driver.maximize_window()


driver.find_element_by_link_text("Link1").click()
time.sleep(6)
target = driver.find_element_by_link_text("Another action")
#鼠标事件 移动鼠标到目标元素
ActionChains(driver).move_to_element(target).perform()
time.sleep(6)
driver.quit()
