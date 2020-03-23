using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DelegateTest
{
    class Manager_ori
    {
        public Manager_ori()
        {
            Console.WriteLine("创建经理对象");
        }
        public void deductSalary(Employee_ori employee)
        {
            Console.WriteLine("你小子敢上班玩游戏，扣工资！");
            employee.Salary -= 100;
        }
    }
}
