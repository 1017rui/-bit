from selenium import webdriver
import time
from selenium.webdriver.common.keys import Keys

driver=webdriver.Firefox()
driver.get("http://www.baidu.com/")
driver.maximize_window()

driver.find_element_by_id("kw").send_keys("端午节")
driver.find_element_by_id("su").click()
driver.implicitly_wait(10)
time.sleep(3)

#键盘的组合键的用法
#复制
driver.find_element_by_id("kw").send_keys(Keys.CONTROL,'a')
time.sleep(3)
#剪切
driver.find_element_by_id("kw").send_keys(Keys.CONTROL,'x')
time.sleep(3)
driver.find_element_by_id("kw").send_keys("小鬼王琳凯")
driver.find_element_by_id("su").click()
time.sleep(3)
driver.quit()