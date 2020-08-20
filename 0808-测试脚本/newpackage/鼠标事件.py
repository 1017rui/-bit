from selenium import webdriver
import time
from selenium.webdriver.common.action_chains import ActionChains #注意：鼠标事件需要引入这个

driver=webdriver.Firefox()
driver.get("http://www.baidu.com/")
driver.maximize_window()

driver.find_element_by_id("kw").send_keys("蔡徐坤")
time.sleep(3)
#定位“百度一下”按钮
sul=driver.find_element_by_id("su")

#右击
ActionChains(driver).context_click(sul).perform()
#双击
time.sleep(3)
ActionChains(driver).double_click(sul).perform()

time.sleep(3)
title=driver.find_element_by_id("su")
target=driver.find_element_by_link_text("蔡徐坤_百度百科")
#拖动
ActionChains(driver).drag_and_drop(title,target).perform()

##移动
ActionChains(driver).move_to_element(target).perform()
time.sleep(6)
driver.quit()

