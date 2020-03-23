using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DelegateTest
{
    class Manager
    {
        public Manager()
        {
            Console.WriteLine("创建一个经理对象！");
        }
        public void deductSalary(object sender,EventArgs e)
        {
            Console.Write("好小子，你敢上班玩游戏，扣你工资！");
            ((Employee) sender).Salary-=100;
        }
    }
}
