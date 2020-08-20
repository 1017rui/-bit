from selenium import webdriver
import time
import os

driver = webdriver.Firefox()
file_path = 'file:///'+os.path.abspath("D:/-bit/0808-测试脚本/selenium2html/drop_down.html")
driver.get(file_path)
driver.maximize_window()
#option+value 定位一组元素
options = driver.find_element_by_tag_name("option")
# for option in options:
#     if option.get_attribute("value") == "9.03":
#         option.click()
#利用数组的下标定位
#options[3].click()
#用xpath定位
#driver.find_element_by_xpath("/html/body/select/option[4]").click()
#用css定位
driver.find_element_by_css_selector("#ShippingMethod > option:nth-child(4)").click()

time.sleep(6)

driver.quit()
