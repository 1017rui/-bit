from selenium import webdriver
import time
import os

driver = webdriver.Firefox()
file_path = 'file:///'+os.path.abspath("D:/-bit/0808-测试脚本/selenium2html/checkbox.html")
driver.get(file_path)
driver.maximize_window()

time.sleep(3)

inputs = driver.find_element_by_tag_name("input")

for input in inputs:
    if input.get_attribute("type") == "checkbox":
        input.click()

time.sleep(7)
driver.quit()